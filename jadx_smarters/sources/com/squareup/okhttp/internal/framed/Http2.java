package com.squareup.okhttp.internal.framed;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.FrameReader;
import com.squareup.okhttp.internal.framed.Hpack;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
public final class Http2 implements Variant {
    static final byte FLAG_ACK = 1;
    static final byte FLAG_COMPRESSED = 32;
    static final byte FLAG_END_HEADERS = 4;
    static final byte FLAG_END_PUSH_PROMISE = 4;
    static final byte FLAG_END_STREAM = 1;
    static final byte FLAG_NONE = 0;
    static final byte FLAG_PADDED = 8;
    static final byte FLAG_PRIORITY = 32;
    static final int INITIAL_MAX_FRAME_SIZE = 16384;
    static final byte TYPE_CONTINUATION = 9;
    static final byte TYPE_DATA = 0;
    static final byte TYPE_GOAWAY = 7;
    static final byte TYPE_HEADERS = 1;
    static final byte TYPE_PING = 6;
    static final byte TYPE_PRIORITY = 2;
    static final byte TYPE_PUSH_PROMISE = 5;
    static final byte TYPE_RST_STREAM = 3;
    static final byte TYPE_SETTINGS = 4;
    static final byte TYPE_WINDOW_UPDATE = 8;
    private static final Logger logger = Logger.getLogger(FrameLogger.class.getName());
    private static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static final class ContinuationSource implements Source {
        byte flags;
        int left;
        int length;
        short padding;
        private final BufferedSource source;
        int streamId;

        public ContinuationSource(BufferedSource bufferedSource) {
            this.source = bufferedSource;
        }

        private void readContinuationHeader() throws IOException {
            int i9 = this.streamId;
            int medium = Http2.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            byte b9 = (byte) (this.source.readByte() & 255);
            this.flags = (byte) (this.source.readByte() & 255);
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(FrameLogger.formatHeader(true, this.streamId, this.length, b9, this.flags));
            }
            int i10 = this.source.readInt() & a.e.API_PRIORITY_OTHER;
            this.streamId = i10;
            if (b9 != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(b9));
            }
            if (i10 != i9) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j9) throws IOException {
            while (true) {
                int i9 = this.left;
                if (i9 != 0) {
                    long j10 = this.source.read(buffer, Math.min(j9, i9));
                    if (j10 == -1) {
                        return -1L;
                    }
                    this.left = (int) (((long) this.left) - j10);
                    return j10;
                }
                this.source.skip(this.padding);
                this.padding = (short) 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    public static final class FrameLogger {
        private static final String[] TYPES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        private static final String[] FLAGS = new String[64];
        private static final String[] BINARY = new String[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

        static {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr = BINARY;
                if (i10 >= strArr.length) {
                    break;
                }
                strArr[i10] = String.format("%8s", Integer.toBinaryString(i10)).replace(TokenParser.SP, '0');
                i10++;
            }
            String[] strArr2 = FLAGS;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i11 = iArr[0];
            strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr2[i12];
                int i14 = iArr[0];
                String[] strArr3 = FLAGS;
                int i15 = i14 | i13;
                strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
                strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = FLAGS;
                if (i9 >= strArr4.length) {
                    return;
                }
                if (strArr4[i9] == null) {
                    strArr4[i9] = BINARY[i9];
                }
                i9++;
            }
        }

        public static String formatFlags(byte b9, byte b10) {
            if (b10 == 0) {
                return "";
            }
            if (b9 != 2 && b9 != 3) {
                if (b9 == 4 || b9 == 6) {
                    return b10 == 1 ? "ACK" : BINARY[b10];
                }
                if (b9 != 7 && b9 != 8) {
                    String[] strArr = FLAGS;
                    String str = b10 < strArr.length ? strArr[b10] : BINARY[b10];
                    return (b9 != 5 || (b10 & 4) == 0) ? (b9 != 0 || (b10 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return BINARY[b10];
        }

        public static String formatHeader(boolean z9, int i9, int i10, byte b9, byte b10) {
            String[] strArr = TYPES;
            return String.format("%s 0x%08x %5d %-13s %s", z9 ? "<<" : ">>", Integer.valueOf(i9), Integer.valueOf(i10), b9 < strArr.length ? strArr[b9] : String.format("0x%02x", Byte.valueOf(b9)), formatFlags(b9, b10));
        }
    }

    public static final class Reader implements FrameReader {
        private final boolean client;
        private final ContinuationSource continuation;
        final Hpack.Reader hpackReader;
        private final BufferedSource source;

        public Reader(BufferedSource bufferedSource, int i9, boolean z9) {
            this.source = bufferedSource;
            this.client = z9;
            ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
            this.continuation = continuationSource;
            this.hpackReader = new Hpack.Reader(i9, continuationSource);
        }

        private void readData(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            boolean z9 = (b9 & 1) != 0;
            if ((b9 & 32) != 0) {
                throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short s9 = (b9 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
            handler.data(z9, i10, this.source, Http2.lengthWithoutPadding(i9, b9, s9));
            this.source.skip(s9);
        }

        private void readGoAway(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            if (i9 < 8) {
                throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i9));
            }
            if (i10 != 0) {
                throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int i11 = this.source.readInt();
            int i12 = this.source.readInt();
            int i13 = i9 - 8;
            ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(i12);
            if (errorCodeFromHttp2 == null) {
                throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i12));
            }
            ByteString byteString = ByteString.EMPTY;
            if (i13 > 0) {
                byteString = this.source.readByteString(i13);
            }
            handler.goAway(i11, errorCodeFromHttp2, byteString);
        }

        private List<Header> readHeaderBlock(int i9, short s9, byte b9, int i10) throws IOException {
            ContinuationSource continuationSource = this.continuation;
            continuationSource.left = i9;
            continuationSource.length = i9;
            continuationSource.padding = s9;
            continuationSource.flags = b9;
            continuationSource.streamId = i10;
            this.hpackReader.readHeaders();
            return this.hpackReader.getAndResetHeaderList();
        }

        private void readHeaders(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            if (i10 == 0) {
                throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z9 = (b9 & 1) != 0;
            short s9 = (b9 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
            if ((b9 & 32) != 0) {
                readPriority(handler, i10);
                i9 -= 5;
            }
            handler.headers(false, z9, i10, -1, readHeaderBlock(Http2.lengthWithoutPadding(i9, b9, s9), s9, b9, i10), HeadersMode.HTTP_20_HEADERS);
        }

        private void readPing(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            if (i9 != 8) {
                throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i9));
            }
            if (i10 != 0) {
                throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
            }
            handler.ping((b9 & 1) != 0, this.source.readInt(), this.source.readInt());
        }

        private void readPriority(FrameReader.Handler handler, int i9) throws IOException {
            int i10 = this.source.readInt();
            handler.priority(i9, i10 & a.e.API_PRIORITY_OTHER, (this.source.readByte() & 255) + 1, (Integer.MIN_VALUE & i10) != 0);
        }

        private void readPriority(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            if (i9 != 5) {
                throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i9));
            }
            if (i10 == 0) {
                throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            readPriority(handler, i10);
        }

        private void readPushPromise(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            if (i10 == 0) {
                throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short s9 = (b9 & 8) != 0 ? (short) (this.source.readByte() & 255) : (short) 0;
            handler.pushPromise(i10, this.source.readInt() & a.e.API_PRIORITY_OTHER, readHeaderBlock(Http2.lengthWithoutPadding(i9 - 4, b9, s9), s9, b9, i10));
        }

        private void readRstStream(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            if (i9 != 4) {
                throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i9));
            }
            if (i10 == 0) {
                throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int i11 = this.source.readInt();
            ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(i11);
            if (errorCodeFromHttp2 == null) {
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i11));
            }
            handler.rstStream(i10, errorCodeFromHttp2);
        }

        private void readSettings(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            if (i10 != 0) {
                throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b9 & 1) != 0) {
                if (i9 != 0) {
                    throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                handler.ackSettings();
                return;
            }
            if (i9 % 6 != 0) {
                throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i9));
            }
            Settings settings = new Settings();
            for (int i11 = 0; i11 < i9; i11 += 6) {
                short s9 = this.source.readShort();
                int i12 = this.source.readInt();
                switch (s9) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        if (i12 != 0 && i12 != 1) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                        break;
                    case 3:
                        s9 = 4;
                        break;
                    case 4:
                        if (i12 < 0) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        s9 = 7;
                        break;
                        break;
                    case 5:
                        if (i12 < 16384 || i12 > 16777215) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i12));
                        }
                        break;
                        break;
                    default:
                        throw Http2.ioException("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(s9));
                }
                settings.set(s9, 0, i12);
            }
            handler.settings(false, settings);
            if (settings.getHeaderTableSize() >= 0) {
                this.hpackReader.headerTableSizeSetting(settings.getHeaderTableSize());
            }
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i9, byte b9, int i10) throws IOException {
            if (i9 != 4) {
                throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i9));
            }
            long j9 = ((long) this.source.readInt()) & 2147483647L;
            if (j9 == 0) {
                throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(j9));
            }
            handler.windowUpdate(i10, j9);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.source.close();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public boolean nextFrame(FrameReader.Handler handler) throws IOException {
            try {
                this.source.require(9L);
                int medium = Http2.readMedium(this.source);
                if (medium < 0 || medium > 16384) {
                    throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(medium));
                }
                byte b9 = (byte) (this.source.readByte() & 255);
                byte b10 = (byte) (this.source.readByte() & 255);
                int i9 = this.source.readInt() & a.e.API_PRIORITY_OTHER;
                if (Http2.logger.isLoggable(Level.FINE)) {
                    Http2.logger.fine(FrameLogger.formatHeader(true, i9, medium, b9, b10));
                }
                switch (b9) {
                    case 0:
                        readData(handler, medium, b10, i9);
                        return true;
                    case 1:
                        readHeaders(handler, medium, b10, i9);
                        return true;
                    case 2:
                        readPriority(handler, medium, b10, i9);
                        return true;
                    case 3:
                        readRstStream(handler, medium, b10, i9);
                        return true;
                    case 4:
                        readSettings(handler, medium, b10, i9);
                        return true;
                    case 5:
                        readPushPromise(handler, medium, b10, i9);
                        return true;
                    case 6:
                        readPing(handler, medium, b10, i9);
                        return true;
                    case 7:
                        readGoAway(handler, medium, b10, i9);
                        return true;
                    case 8:
                        readWindowUpdate(handler, medium, b10, i9);
                        return true;
                    default:
                        this.source.skip(medium);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public void readConnectionPreface() throws IOException {
            if (this.client) {
                return;
            }
            ByteString byteString = this.source.readByteString(Http2.CONNECTION_PREFACE.size());
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(String.format("<< CONNECTION %s", byteString.hex()));
            }
            if (!Http2.CONNECTION_PREFACE.equals(byteString)) {
                throw Http2.ioException("Expected a connection header but was %s", byteString.utf8());
            }
        }
    }

    public static final class Writer implements FrameWriter {
        private final boolean client;
        private boolean closed;
        private final Buffer hpackBuffer;
        private final Hpack.Writer hpackWriter;
        private int maxFrameSize;
        private final BufferedSink sink;

        public Writer(BufferedSink bufferedSink, boolean z9) {
            this.sink = bufferedSink;
            this.client = z9;
            Buffer buffer = new Buffer();
            this.hpackBuffer = buffer;
            this.hpackWriter = new Hpack.Writer(buffer);
            this.maxFrameSize = 16384;
        }

        private void writeContinuationFrames(int i9, long j9) throws IOException {
            while (j9 > 0) {
                int iMin = (int) Math.min(this.maxFrameSize, j9);
                long j10 = iMin;
                j9 -= j10;
                frameHeader(i9, iMin, Http2.TYPE_CONTINUATION, j9 == 0 ? (byte) 4 : (byte) 0);
                this.sink.write(this.hpackBuffer, j10);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void ackSettings(Settings settings) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.closed = true;
            this.sink.close();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void connectionPreface() throws IOException {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (this.client) {
                    if (Http2.logger.isLoggable(Level.FINE)) {
                        Http2.logger.fine(String.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
                    }
                    this.sink.write(Http2.CONNECTION_PREFACE.toByteArray());
                    this.sink.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void data(boolean z9, int i9, Buffer buffer, int i10) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            dataFrame(i9, z9 ? (byte) 1 : (byte) 0, buffer, i10);
        }

        public void dataFrame(int i9, byte b9, Buffer buffer, int i10) throws IOException {
            frameHeader(i9, i10, (byte) 0, b9);
            if (i10 > 0) {
                this.sink.write(buffer, i10);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void flush() throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
        }

        public void frameHeader(int i9, int i10, byte b9, byte b10) throws IOException {
            if (Http2.logger.isLoggable(Level.FINE)) {
                Http2.logger.fine(FrameLogger.formatHeader(false, i9, i10, b9, b10));
            }
            int i11 = this.maxFrameSize;
            if (i10 > i11) {
                throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            if ((Integer.MIN_VALUE & i9) != 0) {
                throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i9));
            }
            Http2.writeMedium(this.sink, i10);
            this.sink.writeByte(b9 & 255);
            this.sink.writeByte(b10 & 255);
            this.sink.writeInt(i9 & a.e.API_PRIORITY_OTHER);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void goAway(int i9, ErrorCode errorCode, byte[] bArr) throws IOException {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                if (errorCode.httpCode == -1) {
                    throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
                }
                frameHeader(0, bArr.length + 8, Http2.TYPE_GOAWAY, (byte) 0);
                this.sink.writeInt(i9);
                this.sink.writeInt(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.sink.write(bArr);
                }
                this.sink.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void headers(int i9, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            headers(false, i9, list);
        }

        public void headers(boolean z9, int i9, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int iMin = (int) Math.min(this.maxFrameSize, size);
            long j9 = iMin;
            byte b9 = size == j9 ? (byte) 4 : (byte) 0;
            if (z9) {
                b9 = (byte) (b9 | 1);
            }
            frameHeader(i9, iMin, (byte) 1, b9);
            this.sink.write(this.hpackBuffer, j9);
            if (size > j9) {
                writeContinuationFrames(i9, size - j9);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public int maxDataLength() {
            return this.maxFrameSize;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void ping(boolean z9, int i9, int i10) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            frameHeader(0, 8, Http2.TYPE_PING, z9 ? (byte) 1 : (byte) 0);
            this.sink.writeInt(i9);
            this.sink.writeInt(i10);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void pushPromise(int i9, int i10, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int iMin = (int) Math.min(this.maxFrameSize - 4, size);
            long j9 = iMin;
            frameHeader(i9, iMin + 4, Http2.TYPE_PUSH_PROMISE, size == j9 ? (byte) 4 : (byte) 0);
            this.sink.writeInt(i10 & a.e.API_PRIORITY_OTHER);
            this.sink.write(this.hpackBuffer, j9);
            if (size > j9) {
                writeContinuationFrames(i9, size - j9);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void rstStream(int i9, ErrorCode errorCode) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            frameHeader(i9, 4, Http2.TYPE_RST_STREAM, (byte) 0);
            this.sink.writeInt(errorCode.httpCode);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void settings(Settings settings) throws IOException {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                int i9 = 0;
                frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
                while (i9 < 10) {
                    if (settings.isSet(i9)) {
                        this.sink.writeShort(i9 == 4 ? 3 : i9 == 7 ? 4 : i9);
                        this.sink.writeInt(settings.get(i9));
                    }
                    i9++;
                }
                this.sink.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void synReply(boolean z9, int i9, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            headers(z9, i9, list);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void synStream(boolean z9, boolean z10, int i9, int i10, List<Header> list) throws IOException {
            if (z10) {
                throw new UnsupportedOperationException();
            }
            if (this.closed) {
                throw new IOException("closed");
            }
            headers(z9, i9, list);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void windowUpdate(int i9, long j9) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (j9 == 0 || j9 > 2147483647L) {
                throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j9));
            }
            frameHeader(i9, 4, (byte) 8, (byte) 0);
            this.sink.writeInt((int) j9);
            this.sink.flush();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lengthWithoutPadding(int i9, byte b9, short s9) throws IOException {
        if ((b9 & 8) != 0) {
            i9--;
        }
        if (s9 <= i9) {
            return (short) (i9 - s9);
        }
        throw ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s9), Integer.valueOf(i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readMedium(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeMedium(BufferedSink bufferedSink, int i9) throws IOException {
        bufferedSink.writeByte((i9 >>> 16) & 255);
        bufferedSink.writeByte((i9 >>> 8) & 255);
        bufferedSink.writeByte(i9 & 255);
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public FrameReader newReader(BufferedSource bufferedSource, boolean z9) {
        return new Reader(bufferedSource, 4096, z9);
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public FrameWriter newWriter(BufferedSink bufferedSink, boolean z9) {
        return new Writer(bufferedSink, z9);
    }
}
