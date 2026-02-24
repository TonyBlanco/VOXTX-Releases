package com.squareup.okhttp.internal.framed;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes4.dex */
public final class FramedStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    private final FramedConnection connection;
    private final int id;
    private final List<Header> requestHeaders;
    private List<Header> responseHeaders;
    final FramedDataSink sink;
    private final FramedDataSource source;
    long unacknowledgedBytesRead = 0;
    private final StreamTimeout readTimeout = new StreamTimeout();
    private final StreamTimeout writeTimeout = new StreamTimeout();
    private ErrorCode errorCode = null;

    public final class FramedDataSink implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        private boolean closed;
        private boolean finished;
        private final Buffer sendBuffer = new Buffer();

        public FramedDataSink() {
        }

        private void emitDataFrame(boolean z9) throws IOException {
            long jMin;
            FramedStream framedStream;
            synchronized (FramedStream.this) {
                FramedStream.this.writeTimeout.enter();
                while (true) {
                    try {
                        FramedStream framedStream2 = FramedStream.this;
                        if (framedStream2.bytesLeftInWriteWindow > 0 || this.finished || this.closed || framedStream2.errorCode != null) {
                            break;
                        } else {
                            FramedStream.this.waitForIo();
                        }
                    } finally {
                        FramedStream.this.writeTimeout.exitAndThrowIfTimedOut();
                    }
                }
                FramedStream.this.writeTimeout.exitAndThrowIfTimedOut();
                FramedStream.this.checkOutNotClosed();
                jMin = Math.min(FramedStream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                framedStream = FramedStream.this;
                framedStream.bytesLeftInWriteWindow -= jMin;
            }
            framedStream.writeTimeout.enter();
            try {
                FramedStream.this.connection.writeData(FramedStream.this.id, z9 && jMin == this.sendBuffer.size(), this.sendBuffer, jMin);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (FramedStream.this) {
                try {
                    if (this.closed) {
                        return;
                    }
                    if (!FramedStream.this.sink.finished) {
                        if (this.sendBuffer.size() > 0) {
                            while (this.sendBuffer.size() > 0) {
                                emitDataFrame(true);
                            }
                        } else {
                            FramedStream.this.connection.writeData(FramedStream.this.id, true, null, 0L);
                        }
                    }
                    synchronized (FramedStream.this) {
                        this.closed = true;
                    }
                    FramedStream.this.connection.flush();
                    FramedStream.this.cancelStreamIfNecessary();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (FramedStream.this) {
                FramedStream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitDataFrame(false);
                FramedStream.this.connection.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return FramedStream.this.writeTimeout;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j9) throws IOException {
            this.sendBuffer.write(buffer, j9);
            while (this.sendBuffer.size() >= 16384) {
                emitDataFrame(false);
            }
        }
    }

    public final class FramedDataSource implements Source {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final Buffer readBuffer;
        private final Buffer receiveBuffer;

        private FramedDataSource(long j9) {
            this.receiveBuffer = new Buffer();
            this.readBuffer = new Buffer();
            this.maxByteCount = j9;
        }

        private void checkNotClosed() throws IOException {
            if (this.closed) {
                throw new IOException("stream closed");
            }
            if (FramedStream.this.errorCode == null) {
                return;
            }
            throw new IOException("stream was reset: " + FramedStream.this.errorCode);
        }

        private void waitUntilReadable() throws IOException {
            FramedStream.this.readTimeout.enter();
            while (this.readBuffer.size() == 0 && !this.finished && !this.closed && FramedStream.this.errorCode == null) {
                try {
                    FramedStream.this.waitForIo();
                } finally {
                    FramedStream.this.readTimeout.exitAndThrowIfTimedOut();
                }
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (FramedStream.this) {
                this.closed = true;
                this.readBuffer.clear();
                FramedStream.this.notifyAll();
            }
            FramedStream.this.cancelStreamIfNecessary();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j9) throws IOException {
            if (j9 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j9);
            }
            synchronized (FramedStream.this) {
                try {
                    waitUntilReadable();
                    checkNotClosed();
                    if (this.readBuffer.size() == 0) {
                        return -1L;
                    }
                    Buffer buffer2 = this.readBuffer;
                    long j10 = buffer2.read(buffer, Math.min(j9, buffer2.size()));
                    FramedStream framedStream = FramedStream.this;
                    long j11 = framedStream.unacknowledgedBytesRead + j10;
                    framedStream.unacknowledgedBytesRead = j11;
                    if (j11 >= framedStream.connection.okHttpSettings.getInitialWindowSize(65536) / 2) {
                        FramedStream.this.connection.writeWindowUpdateLater(FramedStream.this.id, FramedStream.this.unacknowledgedBytesRead);
                        FramedStream.this.unacknowledgedBytesRead = 0L;
                    }
                    synchronized (FramedStream.this.connection) {
                        try {
                            FramedStream.this.connection.unacknowledgedBytesRead += j10;
                            if (FramedStream.this.connection.unacknowledgedBytesRead >= FramedStream.this.connection.okHttpSettings.getInitialWindowSize(65536) / 2) {
                                FramedStream.this.connection.writeWindowUpdateLater(0, FramedStream.this.connection.unacknowledgedBytesRead);
                                FramedStream.this.connection.unacknowledgedBytesRead = 0L;
                            }
                        } finally {
                        }
                    }
                    return j10;
                } finally {
                }
            }
        }

        public void receive(BufferedSource bufferedSource, long j9) throws IOException {
            boolean z9;
            boolean z10;
            while (j9 > 0) {
                synchronized (FramedStream.this) {
                    z9 = this.finished;
                    z10 = this.readBuffer.size() + j9 > this.maxByteCount;
                }
                if (z10) {
                    bufferedSource.skip(j9);
                    FramedStream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z9) {
                    bufferedSource.skip(j9);
                    return;
                }
                long j10 = bufferedSource.read(this.receiveBuffer, j9);
                if (j10 == -1) {
                    throw new EOFException();
                }
                j9 -= j10;
                synchronized (FramedStream.this) {
                    try {
                        boolean z11 = this.readBuffer.size() == 0;
                        this.readBuffer.writeAll(this.receiveBuffer);
                        if (z11) {
                            FramedStream.this.notifyAll();
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return FramedStream.this.readTimeout;
        }
    }

    public class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            FramedStream.this.closeLater(ErrorCode.CANCEL);
        }
    }

    public FramedStream(int i9, FramedConnection framedConnection, boolean z9, boolean z10, List<Header> list) {
        if (framedConnection == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.id = i9;
        this.connection = framedConnection;
        this.bytesLeftInWriteWindow = framedConnection.peerSettings.getInitialWindowSize(65536);
        FramedDataSource framedDataSource = new FramedDataSource(framedConnection.okHttpSettings.getInitialWindowSize(65536));
        this.source = framedDataSource;
        FramedDataSink framedDataSink = new FramedDataSink();
        this.sink = framedDataSink;
        framedDataSource.finished = z10;
        framedDataSink.finished = z9;
        this.requestHeaders = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelStreamIfNecessary() throws IOException {
        boolean z9;
        boolean zIsOpen;
        synchronized (this) {
            try {
                z9 = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
                zIsOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            close(ErrorCode.CANCEL);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream(this.id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkOutNotClosed() throws IOException {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        }
        if (this.sink.finished) {
            throw new IOException("stream finished");
        }
        if (this.errorCode == null) {
            return;
        }
        throw new IOException("stream was reset: " + this.errorCode);
    }

    private boolean closeInternal(ErrorCode errorCode) {
        synchronized (this) {
            try {
                if (this.errorCode != null) {
                    return false;
                }
                if (this.source.finished && this.sink.finished) {
                    return false;
                }
                this.errorCode = errorCode;
                notifyAll();
                this.connection.removeStream(this.id);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public void addBytesToWriteWindow(long j9) {
        this.bytesLeftInWriteWindow += j9;
        if (j9 > 0) {
            notifyAll();
        }
    }

    public void close(ErrorCode errorCode) throws IOException {
        if (closeInternal(errorCode)) {
            this.connection.writeSynReset(this.id, errorCode);
        }
    }

    public void closeLater(ErrorCode errorCode) {
        if (closeInternal(errorCode)) {
            this.connection.writeSynResetLater(this.id, errorCode);
        }
    }

    public FramedConnection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.id;
    }

    public List<Header> getRequestHeaders() {
        return this.requestHeaders;
    }

    public synchronized List<Header> getResponseHeaders() throws IOException {
        List<Header> list;
        try {
            this.readTimeout.enter();
            while (this.responseHeaders == null && this.errorCode == null) {
                try {
                    waitForIo();
                } catch (Throwable th) {
                    this.readTimeout.exitAndThrowIfTimedOut();
                    throw th;
                }
            }
            this.readTimeout.exitAndThrowIfTimedOut();
            list = this.responseHeaders;
            if (list == null) {
                throw new IOException("stream was reset: " + this.errorCode);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }

    public Sink getSink() {
        synchronized (this) {
            try {
                if (this.responseHeaders == null && !isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.sink;
    }

    public Source getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        return this.connection.client == ((this.id & 1) == 1);
    }

    public synchronized boolean isOpen() {
        try {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished || this.source.closed) {
                if (this.sink.finished || this.sink.closed) {
                    if (this.responseHeaders != null) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Timeout readTimeout() {
        return this.readTimeout;
    }

    public void receiveData(BufferedSource bufferedSource, int i9) throws IOException {
        this.source.receive(bufferedSource, i9);
    }

    public void receiveFin() {
        boolean zIsOpen;
        synchronized (this) {
            this.source.finished = true;
            zIsOpen = isOpen();
            notifyAll();
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream(this.id);
    }

    public void receiveHeaders(List<Header> list, HeadersMode headersMode) {
        ErrorCode errorCode;
        boolean zIsOpen;
        synchronized (this) {
            try {
                errorCode = null;
                zIsOpen = true;
                if (this.responseHeaders == null) {
                    if (headersMode.failIfHeadersAbsent()) {
                        errorCode = ErrorCode.PROTOCOL_ERROR;
                    } else {
                        this.responseHeaders = list;
                        zIsOpen = isOpen();
                        notifyAll();
                    }
                } else if (headersMode.failIfHeadersPresent()) {
                    errorCode = ErrorCode.STREAM_IN_USE;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(this.responseHeaders);
                    arrayList.addAll(list);
                    this.responseHeaders = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (errorCode != null) {
            closeLater(errorCode);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream(this.id);
        }
    }

    public synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public void reply(List<Header> list, boolean z9) throws IOException {
        boolean z10;
        synchronized (this) {
            try {
                if (list == null) {
                    throw new NullPointerException("responseHeaders == null");
                }
                if (this.responseHeaders != null) {
                    throw new IllegalStateException("reply already sent");
                }
                this.responseHeaders = list;
                if (z9) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.sink.finished = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.connection.writeSynReply(this.id, z10, list);
        if (z10) {
            this.connection.flush();
        }
    }

    public Timeout writeTimeout() {
        return this.writeTimeout;
    }
}
