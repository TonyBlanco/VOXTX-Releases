package com.squareup.okhttp.internal.framed;

import com.google.android.gms.common.api.a;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.FrameReader;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class FramedConnection implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private static final ExecutorService executor = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp FramedConnection", true));
    long bytesLeftInWriteWindow;
    final boolean client;
    private final Set<Integer> currentPushRequests;
    final FrameWriter frameWriter;
    private final String hostName;
    private long idleStartTimeNs;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextPingId;
    private int nextStreamId;
    Settings okHttpSettings;
    final Settings peerSettings;
    private Map<Integer, Ping> pings;
    final Protocol protocol;
    private final ExecutorService pushExecutor;
    private final PushObserver pushObserver;
    final Reader readerRunnable;
    private boolean receivedInitialPeerSettings;
    private boolean shutdown;
    final Socket socket;
    private final Map<Integer, FramedStream> streams;
    long unacknowledgedBytesRead;
    final Variant variant;

    public static class Builder {
        private boolean client;
        private String hostName;
        private Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        private Protocol protocol = Protocol.SPDY_3;
        private PushObserver pushObserver = PushObserver.CANCEL;
        private BufferedSink sink;
        private Socket socket;
        private BufferedSource source;

        public Builder(boolean z9) throws IOException {
            this.client = z9;
        }

        public FramedConnection build() throws IOException {
            return new FramedConnection(this);
        }

        public Builder listener(Listener listener) {
            this.listener = listener;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver) {
            this.pushObserver = pushObserver;
            return this;
        }

        public Builder socket(Socket socket) throws IOException {
            return socket(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), Okio.buffer(Okio.source(socket)), Okio.buffer(Okio.sink(socket)));
        }

        public Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.socket = socket;
            this.hostName = str;
            this.source = bufferedSource;
            this.sink = bufferedSink;
            return this;
        }
    }

    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: com.squareup.okhttp.internal.framed.FramedConnection.Listener.1
            @Override // com.squareup.okhttp.internal.framed.FramedConnection.Listener
            public void onStream(FramedStream framedStream) throws IOException {
                framedStream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(FramedConnection framedConnection) {
        }

        public abstract void onStream(FramedStream framedStream) throws IOException;
    }

    public class Reader extends NamedRunnable implements FrameReader.Handler {
        final FrameReader frameReader;

        private Reader(FrameReader frameReader) {
            super("OkHttp %s", FramedConnection.this.hostName);
            this.frameReader = frameReader;
        }

        private void ackSettingsLater(final Settings settings) {
            FramedConnection.executor.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{FramedConnection.this.hostName}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.Reader.3
                @Override // com.squareup.okhttp.internal.NamedRunnable
                public void execute() {
                    try {
                        FramedConnection.this.frameWriter.ackSettings(settings);
                    } catch (IOException unused) {
                    }
                }
            });
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void ackSettings() {
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void alternateService(int i9, String str, ByteString byteString, String str2, int i10, long j9) {
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void data(boolean z9, int i9, BufferedSource bufferedSource, int i10) throws IOException {
            if (FramedConnection.this.pushedStream(i9)) {
                FramedConnection.this.pushDataLater(i9, bufferedSource, i10, z9);
                return;
            }
            FramedStream stream = FramedConnection.this.getStream(i9);
            if (stream == null) {
                FramedConnection.this.writeSynResetLater(i9, ErrorCode.INVALID_STREAM);
                bufferedSource.skip(i10);
            } else {
                stream.receiveData(bufferedSource, i10);
                if (z9) {
                    stream.receiveFin();
                }
            }
        }

        @Override // com.squareup.okhttp.internal.NamedRunnable
        public void execute() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    if (!FramedConnection.this.client) {
                        this.frameReader.readConnectionPreface();
                    }
                    while (this.frameReader.nextFrame(this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                    try {
                        try {
                            FramedConnection.this.close(errorCode2, ErrorCode.CANCEL);
                        } catch (IOException unused) {
                            ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                            FramedConnection.this.close(errorCode4, errorCode4);
                        }
                    } catch (Throwable th) {
                        errorCode = errorCode2;
                        th = th;
                        try {
                            FramedConnection.this.close(errorCode, errorCode3);
                        } catch (IOException unused2) {
                        }
                        Util.closeQuietly(this.frameReader);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                errorCode2 = errorCode3;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode3;
                FramedConnection.this.close(errorCode, errorCode3);
                Util.closeQuietly(this.frameReader);
                throw th;
            }
            Util.closeQuietly(this.frameReader);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void goAway(int i9, ErrorCode errorCode, ByteString byteString) {
            FramedStream[] framedStreamArr;
            byteString.size();
            synchronized (FramedConnection.this) {
                framedStreamArr = (FramedStream[]) FramedConnection.this.streams.values().toArray(new FramedStream[FramedConnection.this.streams.size()]);
                FramedConnection.this.shutdown = true;
            }
            for (FramedStream framedStream : framedStreamArr) {
                if (framedStream.getId() > i9 && framedStream.isLocallyInitiated()) {
                    framedStream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    FramedConnection.this.removeStream(framedStream.getId());
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void headers(boolean z9, boolean z10, int i9, int i10, List<Header> list, HeadersMode headersMode) {
            if (FramedConnection.this.pushedStream(i9)) {
                FramedConnection.this.pushHeadersLater(i9, list, z10);
                return;
            }
            synchronized (FramedConnection.this) {
                try {
                    if (FramedConnection.this.shutdown) {
                        return;
                    }
                    FramedStream stream = FramedConnection.this.getStream(i9);
                    if (stream != null) {
                        if (headersMode.failIfStreamPresent()) {
                            stream.closeLater(ErrorCode.PROTOCOL_ERROR);
                            FramedConnection.this.removeStream(i9);
                            return;
                        } else {
                            stream.receiveHeaders(list, headersMode);
                            if (z10) {
                                stream.receiveFin();
                                return;
                            }
                            return;
                        }
                    }
                    if (headersMode.failIfStreamAbsent()) {
                        FramedConnection.this.writeSynResetLater(i9, ErrorCode.INVALID_STREAM);
                        return;
                    }
                    if (i9 <= FramedConnection.this.lastGoodStreamId) {
                        return;
                    }
                    if (i9 % 2 == FramedConnection.this.nextStreamId % 2) {
                        return;
                    }
                    final FramedStream framedStream = new FramedStream(i9, FramedConnection.this, z9, z10, list);
                    FramedConnection.this.lastGoodStreamId = i9;
                    FramedConnection.this.streams.put(Integer.valueOf(i9), framedStream);
                    FramedConnection.executor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{FramedConnection.this.hostName, Integer.valueOf(i9)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.Reader.1
                        @Override // com.squareup.okhttp.internal.NamedRunnable
                        public void execute() {
                            try {
                                FramedConnection.this.listener.onStream(framedStream);
                            } catch (IOException e9) {
                                Internal.logger.log(Level.INFO, "FramedConnection.Listener failure for " + FramedConnection.this.hostName, (Throwable) e9);
                                try {
                                    framedStream.close(ErrorCode.PROTOCOL_ERROR);
                                } catch (IOException unused) {
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void ping(boolean z9, int i9, int i10) {
            if (!z9) {
                FramedConnection.this.writePingLater(true, i9, i10, null);
                return;
            }
            Ping pingRemovePing = FramedConnection.this.removePing(i9);
            if (pingRemovePing != null) {
                pingRemovePing.receive();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void priority(int i9, int i10, int i11, boolean z9) {
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void pushPromise(int i9, int i10, List<Header> list) {
            FramedConnection.this.pushRequestLater(i10, list);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void rstStream(int i9, ErrorCode errorCode) {
            if (FramedConnection.this.pushedStream(i9)) {
                FramedConnection.this.pushResetLater(i9, errorCode);
                return;
            }
            FramedStream framedStreamRemoveStream = FramedConnection.this.removeStream(i9);
            if (framedStreamRemoveStream != null) {
                framedStreamRemoveStream.receiveRstStream(errorCode);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void settings(boolean z9, Settings settings) {
            FramedStream[] framedStreamArr;
            long j9;
            synchronized (FramedConnection.this) {
                try {
                    int initialWindowSize = FramedConnection.this.peerSettings.getInitialWindowSize(65536);
                    if (z9) {
                        FramedConnection.this.peerSettings.clear();
                    }
                    FramedConnection.this.peerSettings.merge(settings);
                    if (FramedConnection.this.getProtocol() == Protocol.HTTP_2) {
                        ackSettingsLater(settings);
                    }
                    int initialWindowSize2 = FramedConnection.this.peerSettings.getInitialWindowSize(65536);
                    framedStreamArr = null;
                    if (initialWindowSize2 == -1 || initialWindowSize2 == initialWindowSize) {
                        j9 = 0;
                    } else {
                        j9 = initialWindowSize2 - initialWindowSize;
                        if (!FramedConnection.this.receivedInitialPeerSettings) {
                            FramedConnection.this.addBytesToWriteWindow(j9);
                            FramedConnection.this.receivedInitialPeerSettings = true;
                        }
                        if (!FramedConnection.this.streams.isEmpty()) {
                            framedStreamArr = (FramedStream[]) FramedConnection.this.streams.values().toArray(new FramedStream[FramedConnection.this.streams.size()]);
                        }
                    }
                    FramedConnection.executor.execute(new NamedRunnable("OkHttp %s settings", FramedConnection.this.hostName) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.Reader.2
                        @Override // com.squareup.okhttp.internal.NamedRunnable
                        public void execute() {
                            FramedConnection.this.listener.onSettings(FramedConnection.this);
                        }
                    });
                } finally {
                }
            }
            if (framedStreamArr == null || j9 == 0) {
                return;
            }
            for (FramedStream framedStream : framedStreamArr) {
                synchronized (framedStream) {
                    framedStream.addBytesToWriteWindow(j9);
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void windowUpdate(int i9, long j9) {
            FramedConnection framedConnection = FramedConnection.this;
            if (i9 == 0) {
                synchronized (framedConnection) {
                    FramedConnection framedConnection2 = FramedConnection.this;
                    framedConnection2.bytesLeftInWriteWindow += j9;
                    framedConnection2.notifyAll();
                }
                return;
            }
            FramedStream stream = framedConnection.getStream(i9);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j9);
                }
            }
        }
    }

    private FramedConnection(Builder builder) throws IOException {
        this.streams = new HashMap();
        this.idleStartTimeNs = System.nanoTime();
        this.unacknowledgedBytesRead = 0L;
        this.okHttpSettings = new Settings();
        Settings settings = new Settings();
        this.peerSettings = settings;
        this.receivedInitialPeerSettings = false;
        this.currentPushRequests = new LinkedHashSet();
        Protocol protocol = builder.protocol;
        this.protocol = protocol;
        this.pushObserver = builder.pushObserver;
        boolean z9 = builder.client;
        this.client = z9;
        this.listener = builder.listener;
        this.nextStreamId = builder.client ? 1 : 2;
        if (builder.client && protocol == Protocol.HTTP_2) {
            this.nextStreamId += 2;
        }
        this.nextPingId = builder.client ? 1 : 2;
        if (builder.client) {
            this.okHttpSettings.set(7, 0, 16777216);
        }
        String str = builder.hostName;
        this.hostName = str;
        if (protocol == Protocol.HTTP_2) {
            this.variant = new Http2();
            this.pushExecutor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(String.format("OkHttp %s Push Observer", str), true));
            settings.set(7, 0, okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            settings.set(5, 0, okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE);
        } else {
            if (protocol != Protocol.SPDY_3) {
                throw new AssertionError(protocol);
            }
            this.variant = new Spdy3();
            this.pushExecutor = null;
        }
        this.bytesLeftInWriteWindow = settings.getInitialWindowSize(65536);
        this.socket = builder.socket;
        this.frameWriter = this.variant.newWriter(builder.sink, z9);
        Reader reader = new Reader(this.variant.newReader(builder.source, z9));
        this.readerRunnable = reader;
        new Thread(reader).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void close(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        int i9;
        FramedStream[] framedStreamArr;
        Ping[] pingArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (IOException e9) {
            e = e9;
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    framedStreamArr = null;
                } else {
                    framedStreamArr = (FramedStream[]) this.streams.values().toArray(new FramedStream[this.streams.size()]);
                    this.streams.clear();
                    setIdle(false);
                }
                Map<Integer, Ping> map = this.pings;
                if (map != null) {
                    Ping[] pingArr2 = (Ping[]) map.values().toArray(new Ping[this.pings.size()]);
                    this.pings = null;
                    pingArr = pingArr2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (framedStreamArr != null) {
            for (FramedStream framedStream : framedStreamArr) {
                try {
                    framedStream.close(errorCode2);
                } catch (IOException e10) {
                    if (e != null) {
                        e = e10;
                    }
                }
            }
        }
        if (pingArr != null) {
            for (Ping ping : pingArr) {
                ping.cancel();
            }
        }
        try {
            this.frameWriter.close();
        } catch (IOException e11) {
            if (e == null) {
                e = e11;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e12) {
            e = e12;
        }
        if (e != null) {
            throw e;
        }
    }

    private FramedStream newStream(int i9, List<Header> list, boolean z9, boolean z10) throws IOException {
        int i10;
        FramedStream framedStream;
        boolean z11 = !z9;
        boolean z12 = !z10;
        synchronized (this.frameWriter) {
            try {
                synchronized (this) {
                    try {
                        if (this.shutdown) {
                            throw new IOException("shutdown");
                        }
                        i10 = this.nextStreamId;
                        this.nextStreamId = i10 + 2;
                        framedStream = new FramedStream(i10, this, z11, z12, list);
                        if (framedStream.isOpen()) {
                            this.streams.put(Integer.valueOf(i10), framedStream);
                            setIdle(false);
                        }
                    } finally {
                    }
                }
                if (i9 == 0) {
                    this.frameWriter.synStream(z11, z12, i10, i9, list);
                } else {
                    if (this.client) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.frameWriter.pushPromise(i9, i10, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z9) {
            this.frameWriter.flush();
        }
        return framedStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushDataLater(final int i9, BufferedSource bufferedSource, final int i10, final boolean z9) throws IOException {
        final Buffer buffer = new Buffer();
        long j9 = i10;
        bufferedSource.require(j9);
        bufferedSource.read(buffer, j9);
        if (buffer.size() == j9) {
            this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[]{this.hostName, Integer.valueOf(i9)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.6
                @Override // com.squareup.okhttp.internal.NamedRunnable
                public void execute() {
                    try {
                        boolean zOnData = FramedConnection.this.pushObserver.onData(i9, buffer, i10, z9);
                        if (zOnData) {
                            FramedConnection.this.frameWriter.rstStream(i9, ErrorCode.CANCEL);
                        }
                        if (zOnData || z9) {
                            synchronized (FramedConnection.this) {
                                FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i9));
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            });
            return;
        }
        throw new IOException(buffer.size() + " != " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushHeadersLater(final int i9, final List<Header> list, final boolean z9) {
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[]{this.hostName, Integer.valueOf(i9)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.5
            @Override // com.squareup.okhttp.internal.NamedRunnable
            public void execute() {
                boolean zOnHeaders = FramedConnection.this.pushObserver.onHeaders(i9, list, z9);
                if (zOnHeaders) {
                    try {
                        FramedConnection.this.frameWriter.rstStream(i9, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (zOnHeaders || z9) {
                    synchronized (FramedConnection.this) {
                        FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i9));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushRequestLater(final int i9, final List<Header> list) {
        synchronized (this) {
            try {
                if (this.currentPushRequests.contains(Integer.valueOf(i9))) {
                    writeSynResetLater(i9, ErrorCode.PROTOCOL_ERROR);
                } else {
                    this.currentPushRequests.add(Integer.valueOf(i9));
                    this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{this.hostName, Integer.valueOf(i9)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.4
                        @Override // com.squareup.okhttp.internal.NamedRunnable
                        public void execute() {
                            if (FramedConnection.this.pushObserver.onRequest(i9, list)) {
                                try {
                                    FramedConnection.this.frameWriter.rstStream(i9, ErrorCode.CANCEL);
                                    synchronized (FramedConnection.this) {
                                        FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i9));
                                    }
                                } catch (IOException unused) {
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushResetLater(final int i9, final ErrorCode errorCode) {
        this.pushExecutor.execute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{this.hostName, Integer.valueOf(i9)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.7
            @Override // com.squareup.okhttp.internal.NamedRunnable
            public void execute() {
                FramedConnection.this.pushObserver.onReset(i9, errorCode);
                synchronized (FramedConnection.this) {
                    FramedConnection.this.currentPushRequests.remove(Integer.valueOf(i9));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pushedStream(int i9) {
        return this.protocol == Protocol.HTTP_2 && i9 != 0 && (i9 & 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Ping removePing(int i9) {
        Map<Integer, Ping> map;
        map = this.pings;
        return map != null ? map.remove(Integer.valueOf(i9)) : null;
    }

    private synchronized void setIdle(boolean z9) {
        long jNanoTime;
        if (z9) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            jNanoTime = Long.MAX_VALUE;
        }
        this.idleStartTimeNs = jNanoTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writePing(boolean z9, int i9, int i10, Ping ping) throws IOException {
        synchronized (this.frameWriter) {
            if (ping != null) {
                try {
                    ping.send();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.frameWriter.ping(z9, i9, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writePingLater(final boolean z9, final int i9, final int i10, final Ping ping) {
        executor.execute(new NamedRunnable("OkHttp %s ping %08x%08x", new Object[]{this.hostName, Integer.valueOf(i9), Integer.valueOf(i10)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.3
            @Override // com.squareup.okhttp.internal.NamedRunnable
            public void execute() {
                try {
                    FramedConnection.this.writePing(z9, i9, i10, ping);
                } catch (IOException unused) {
                }
            }
        });
    }

    public void addBytesToWriteWindow(long j9) {
        this.bytesLeftInWriteWindow += j9;
        if (j9 > 0) {
            notifyAll();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush() throws IOException {
        this.frameWriter.flush();
    }

    public synchronized long getIdleStartTimeNs() {
        return this.idleStartTimeNs;
    }

    public Protocol getProtocol() {
        return this.protocol;
    }

    public synchronized FramedStream getStream(int i9) {
        return this.streams.get(Integer.valueOf(i9));
    }

    public synchronized boolean isIdle() {
        return this.idleStartTimeNs != Long.MAX_VALUE;
    }

    public synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams(a.e.API_PRIORITY_OTHER);
    }

    public FramedStream newStream(List<Header> list, boolean z9, boolean z10) throws IOException {
        return newStream(0, list, z9, z10);
    }

    public synchronized int openStreamCount() {
        return this.streams.size();
    }

    public Ping ping() throws IOException {
        int i9;
        Ping ping = new Ping();
        synchronized (this) {
            try {
                if (this.shutdown) {
                    throw new IOException("shutdown");
                }
                i9 = this.nextPingId;
                this.nextPingId = i9 + 2;
                if (this.pings == null) {
                    this.pings = new HashMap();
                }
                this.pings.put(Integer.valueOf(i9), ping);
            } catch (Throwable th) {
                throw th;
            }
        }
        writePing(false, i9, 1330343787, ping);
        return ping;
    }

    public FramedStream pushStream(int i9, List<Header> list, boolean z9) throws IOException {
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        if (this.protocol == Protocol.HTTP_2) {
            return newStream(i9, list, z9, false);
        }
        throw new IllegalStateException("protocol != HTTP_2");
    }

    public synchronized FramedStream removeStream(int i9) {
        FramedStream framedStreamRemove;
        try {
            framedStreamRemove = this.streams.remove(Integer.valueOf(i9));
            if (framedStreamRemove != null && this.streams.isEmpty()) {
                setIdle(true);
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
        return framedStreamRemove;
    }

    public void sendConnectionPreface() throws IOException {
        this.frameWriter.connectionPreface();
        this.frameWriter.settings(this.okHttpSettings);
        if (this.okHttpSettings.getInitialWindowSize(65536) != 65536) {
            this.frameWriter.windowUpdate(0, r0 - 65536);
        }
    }

    public void setSettings(Settings settings) throws IOException {
        synchronized (this.frameWriter) {
            synchronized (this) {
                if (this.shutdown) {
                    throw new IOException("shutdown");
                }
                this.okHttpSettings.merge(settings);
                this.frameWriter.settings(settings);
            }
        }
    }

    public void shutdown(ErrorCode errorCode) throws IOException {
        synchronized (this.frameWriter) {
            synchronized (this) {
                if (this.shutdown) {
                    return;
                }
                this.shutdown = true;
                this.frameWriter.goAway(this.lastGoodStreamId, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.frameWriter.maxDataLength());
        r6 = r3;
        r8.bytesLeftInWriteWindow -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeData(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            com.squareup.okhttp.internal.framed.FrameWriter r12 = r8.frameWriter
            r12.data(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L60
            monitor-enter(r8)
        L12:
            long r3 = r8.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L32
            java.util.Map<java.lang.Integer, com.squareup.okhttp.internal.framed.FramedStream> r3 = r8.streams     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L5e
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L28
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L28
            com.squareup.okhttp.internal.framed.FrameWriter r3 = r8.frameWriter     // Catch: java.lang.Throwable -> L28
            int r3 = r3.maxDataLength()     // Catch: java.lang.Throwable -> L28
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.bytesLeftInWriteWindow     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.bytesLeftInWriteWindow = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            com.squareup.okhttp.internal.framed.FrameWriter r4 = r8.frameWriter
            if (r10 == 0) goto L53
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = 0
        L54:
            r4.data(r5, r9, r11, r3)
            goto Ld
        L58:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L5e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedConnection.writeData(int, boolean, okio.Buffer, long):void");
    }

    public void writeSynReply(int i9, boolean z9, List<Header> list) throws IOException {
        this.frameWriter.synReply(z9, i9, list);
    }

    public void writeSynReset(int i9, ErrorCode errorCode) throws IOException {
        this.frameWriter.rstStream(i9, errorCode);
    }

    public void writeSynResetLater(final int i9, final ErrorCode errorCode) {
        executor.submit(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostName, Integer.valueOf(i9)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.1
            @Override // com.squareup.okhttp.internal.NamedRunnable
            public void execute() {
                try {
                    FramedConnection.this.writeSynReset(i9, errorCode);
                } catch (IOException unused) {
                }
            }
        });
    }

    public void writeWindowUpdateLater(final int i9, final long j9) {
        executor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostName, Integer.valueOf(i9)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.2
            @Override // com.squareup.okhttp.internal.NamedRunnable
            public void execute() {
                try {
                    FramedConnection.this.frameWriter.windowUpdate(i9, j9);
                } catch (IOException unused) {
                }
            }
        });
    }
}
