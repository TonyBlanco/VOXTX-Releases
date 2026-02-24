package com.squareup.okhttp.internal.framed;

import com.google.android.gms.common.api.a;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.FrameReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class Spdy3 implements Variant {
    static final byte[] DICTIONARY;
    static final int FLAG_FIN = 1;
    static final int FLAG_UNIDIRECTIONAL = 2;
    static final int TYPE_DATA = 0;
    static final int TYPE_GOAWAY = 7;
    static final int TYPE_HEADERS = 8;
    static final int TYPE_PING = 6;
    static final int TYPE_RST_STREAM = 3;
    static final int TYPE_SETTINGS = 4;
    static final int TYPE_SYN_REPLY = 2;
    static final int TYPE_SYN_STREAM = 1;
    static final int TYPE_WINDOW_UPDATE = 9;
    static final int VERSION = 3;

    public static final class Reader implements FrameReader {
        private final boolean client;
        private final NameValueBlockReader headerBlockReader;
        private final BufferedSource source;

        public Reader(BufferedSource bufferedSource, boolean z9) {
            this.source = bufferedSource;
            this.headerBlockReader = new NameValueBlockReader(bufferedSource);
            this.client = z9;
        }

        private static IOException ioException(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        private void readGoAway(FrameReader.Handler handler, int i9, int i10) throws IOException {
            if (i10 != 8) {
                throw ioException("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i10));
            }
            int i11 = this.source.readInt() & a.e.API_PRIORITY_OTHER;
            int i12 = this.source.readInt();
            ErrorCode errorCodeFromSpdyGoAway = ErrorCode.fromSpdyGoAway(i12);
            if (errorCodeFromSpdyGoAway == null) {
                throw ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i12));
            }
            handler.goAway(i11, errorCodeFromSpdyGoAway, ByteString.EMPTY);
        }

        private void readHeaders(FrameReader.Handler handler, int i9, int i10) throws IOException {
            handler.headers(false, false, this.source.readInt() & a.e.API_PRIORITY_OTHER, -1, this.headerBlockReader.readNameValueBlock(i10 - 4), HeadersMode.SPDY_HEADERS);
        }

        private void readPing(FrameReader.Handler handler, int i9, int i10) throws IOException {
            if (i10 != 4) {
                throw ioException("TYPE_PING length: %d != 4", Integer.valueOf(i10));
            }
            int i11 = this.source.readInt();
            handler.ping(this.client == ((i11 & 1) == 1), i11, 0);
        }

        private void readRstStream(FrameReader.Handler handler, int i9, int i10) throws IOException {
            if (i10 != 8) {
                throw ioException("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i10));
            }
            int i11 = this.source.readInt() & a.e.API_PRIORITY_OTHER;
            int i12 = this.source.readInt();
            ErrorCode errorCodeFromSpdy3Rst = ErrorCode.fromSpdy3Rst(i12);
            if (errorCodeFromSpdy3Rst == null) {
                throw ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i12));
            }
            handler.rstStream(i11, errorCodeFromSpdy3Rst);
        }

        private void readSettings(FrameReader.Handler handler, int i9, int i10) throws IOException {
            int i11 = this.source.readInt();
            if (i10 != (i11 * 8) + 4) {
                throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            Settings settings = new Settings();
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = this.source.readInt();
                settings.set(i13 & 16777215, ((-16777216) & i13) >>> 24, this.source.readInt());
            }
            handler.settings((i9 & 1) != 0, settings);
        }

        private void readSynReply(FrameReader.Handler handler, int i9, int i10) throws IOException {
            handler.headers(false, (i9 & 1) != 0, this.source.readInt() & a.e.API_PRIORITY_OTHER, -1, this.headerBlockReader.readNameValueBlock(i10 - 4), HeadersMode.SPDY_REPLY);
        }

        private void readSynStream(FrameReader.Handler handler, int i9, int i10) throws IOException {
            int i11 = this.source.readInt();
            int i12 = this.source.readInt();
            int i13 = i11 & a.e.API_PRIORITY_OTHER;
            int i14 = i12 & a.e.API_PRIORITY_OTHER;
            this.source.readShort();
            handler.headers((i9 & 2) != 0, (i9 & 1) != 0, i13, i14, this.headerBlockReader.readNameValueBlock(i10 - 10), HeadersMode.SPDY_SYN_STREAM);
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i9, int i10) throws IOException {
            if (i10 != 8) {
                throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i10));
            }
            int i11 = this.source.readInt();
            int i12 = this.source.readInt();
            int i13 = i11 & a.e.API_PRIORITY_OTHER;
            long j9 = i12 & a.e.API_PRIORITY_OTHER;
            if (j9 == 0) {
                throw ioException("windowSizeIncrement was 0", Long.valueOf(j9));
            }
            handler.windowUpdate(i13, j9);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.headerBlockReader.close();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public boolean nextFrame(FrameReader.Handler handler) throws IOException {
            try {
                int i9 = this.source.readInt();
                int i10 = this.source.readInt();
                int i11 = ((-16777216) & i10) >>> 24;
                int i12 = i10 & 16777215;
                if (!((Integer.MIN_VALUE & i9) != 0)) {
                    handler.data((i11 & 1) != 0, i9 & a.e.API_PRIORITY_OTHER, this.source, i12);
                    return true;
                }
                int i13 = (2147418112 & i9) >>> 16;
                int i14 = i9 & okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                if (i13 != 3) {
                    throw new ProtocolException("version != 3: " + i13);
                }
                switch (i14) {
                    case 1:
                        readSynStream(handler, i11, i12);
                        return true;
                    case 2:
                        readSynReply(handler, i11, i12);
                        return true;
                    case 3:
                        readRstStream(handler, i11, i12);
                        return true;
                    case 4:
                        readSettings(handler, i11, i12);
                        return true;
                    case 5:
                    default:
                        this.source.skip(i12);
                        return true;
                    case 6:
                        readPing(handler, i11, i12);
                        return true;
                    case 7:
                        readGoAway(handler, i11, i12);
                        return true;
                    case 8:
                        readHeaders(handler, i11, i12);
                        return true;
                    case 9:
                        readWindowUpdate(handler, i11, i12);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader
        public void readConnectionPreface() {
        }
    }

    public static final class Writer implements FrameWriter {
        private final boolean client;
        private boolean closed;
        private final Buffer headerBlockBuffer;
        private final BufferedSink headerBlockOut;
        private final BufferedSink sink;

        public Writer(BufferedSink bufferedSink, boolean z9) {
            this.sink = bufferedSink;
            this.client = z9;
            Deflater deflater = new Deflater();
            deflater.setDictionary(Spdy3.DICTIONARY);
            Buffer buffer = new Buffer();
            this.headerBlockBuffer = buffer;
            this.headerBlockOut = Okio.buffer(new DeflaterSink((Sink) buffer, deflater));
        }

        private void writeNameValueBlockToBuffer(List<Header> list) throws IOException {
            this.headerBlockOut.writeInt(list.size());
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                ByteString byteString = list.get(i9).name;
                this.headerBlockOut.writeInt(byteString.size());
                this.headerBlockOut.write(byteString);
                ByteString byteString2 = list.get(i9).value;
                this.headerBlockOut.writeInt(byteString2.size());
                this.headerBlockOut.write(byteString2);
            }
            this.headerBlockOut.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public void ackSettings(Settings settings) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.closed = true;
            Util.closeAll(this.sink, this.headerBlockOut);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void connectionPreface() {
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void data(boolean z9, int i9, Buffer buffer, int i10) throws IOException {
            sendDataFrame(i9, z9 ? 1 : 0, buffer, i10);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void flush() throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void goAway(int i9, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.spdyGoAwayCode == -1) {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            this.sink.writeInt(-2147287033);
            this.sink.writeInt(8);
            this.sink.writeInt(i9);
            this.sink.writeInt(errorCode.spdyGoAwayCode);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void headers(int i9, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            writeNameValueBlockToBuffer(list);
            int size = (int) (this.headerBlockBuffer.size() + 4);
            this.sink.writeInt(-2147287032);
            this.sink.writeInt(size & 16777215);
            this.sink.writeInt(i9 & a.e.API_PRIORITY_OTHER);
            this.sink.writeAll(this.headerBlockBuffer);
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public int maxDataLength() {
            return 16383;
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void ping(boolean z9, int i9, int i10) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (z9 != (this.client != ((i9 & 1) == 1))) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.sink.writeInt(-2147287034);
            this.sink.writeInt(4);
            this.sink.writeInt(i9);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public void pushPromise(int i9, int i10, List<Header> list) throws IOException {
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void rstStream(int i9, ErrorCode errorCode) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.spdyRstCode == -1) {
                throw new IllegalArgumentException();
            }
            this.sink.writeInt(-2147287037);
            this.sink.writeInt(8);
            this.sink.writeInt(i9 & a.e.API_PRIORITY_OTHER);
            this.sink.writeInt(errorCode.spdyRstCode);
            this.sink.flush();
        }

        public void sendDataFrame(int i9, int i10, Buffer buffer, int i11) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            long j9 = i11;
            if (j9 > 16777215) {
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i11);
            }
            this.sink.writeInt(i9 & a.e.API_PRIORITY_OTHER);
            this.sink.writeInt(((i10 & 255) << 24) | (16777215 & i11));
            if (i11 > 0) {
                this.sink.write(buffer, j9);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void settings(Settings settings) throws IOException {
            try {
                if (this.closed) {
                    throw new IOException("closed");
                }
                int size = settings.size();
                this.sink.writeInt(-2147287036);
                this.sink.writeInt(((size * 8) + 4) & 16777215);
                this.sink.writeInt(size);
                for (int i9 = 0; i9 <= 10; i9++) {
                    if (settings.isSet(i9)) {
                        this.sink.writeInt(((settings.flags(i9) & 255) << 24) | (i9 & 16777215));
                        this.sink.writeInt(settings.get(i9));
                    }
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
            writeNameValueBlockToBuffer(list);
            int size = (int) (this.headerBlockBuffer.size() + 4);
            this.sink.writeInt(-2147287038);
            this.sink.writeInt((((z9 ? 1 : 0) & 255) << 24) | (size & 16777215));
            this.sink.writeInt(i9 & a.e.API_PRIORITY_OTHER);
            this.sink.writeAll(this.headerBlockBuffer);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void synStream(boolean z9, boolean z10, int i9, int i10, List<Header> list) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            writeNameValueBlockToBuffer(list);
            int size = (int) (this.headerBlockBuffer.size() + 10);
            int i11 = (z9 ? 1 : 0) | (z10 ? 2 : 0);
            this.sink.writeInt(-2147287039);
            this.sink.writeInt(((i11 & 255) << 24) | (size & 16777215));
            this.sink.writeInt(i9 & a.e.API_PRIORITY_OTHER);
            this.sink.writeInt(Integer.MAX_VALUE & i10);
            this.sink.writeShort(0);
            this.sink.writeAll(this.headerBlockBuffer);
            this.sink.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.FrameWriter
        public synchronized void windowUpdate(int i9, long j9) throws IOException {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (j9 == 0 || j9 > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j9);
            }
            this.sink.writeInt(-2147287031);
            this.sink.writeInt(8);
            this.sink.writeInt(i9);
            this.sink.writeInt((int) j9);
            this.sink.flush();
        }
    }

    static {
        try {
            DICTIONARY = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(Util.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public Protocol getProtocol() {
        return Protocol.SPDY_3;
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public FrameReader newReader(BufferedSource bufferedSource, boolean z9) {
        return new Reader(bufferedSource, z9);
    }

    @Override // com.squareup.okhttp.internal.framed.Variant
    public FrameWriter newWriter(BufferedSink bufferedSink, boolean z9) {
        return new Writer(bufferedSink, z9);
    }
}
