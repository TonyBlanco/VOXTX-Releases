package okhttp3.internal.http2;

import B8.h;
import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public final class Http2Reader implements Closeable {
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final BufferedSource source;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        @NotNull
        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int i9, int i10, int i11) throws IOException {
            if ((i10 & 8) != 0) {
                i9--;
            }
            if (i11 <= i9) {
                return i9 - i11;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i11 + " > remaining length " + i9);
        }
    }

    public static final class ContinuationSource implements Source {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final BufferedSource source;
        private int streamId;

        public ContinuationSource(@NotNull BufferedSource source) {
            l.e(source, "source");
            this.source = source;
        }

        private final void readContinuationHeader() throws IOException {
            int i9 = this.streamId;
            int medium = Util.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.Companion;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i10 = this.source.readInt() & a.e.API_PRIORITY_OTHER;
            this.streamId = i10;
            if (iAnd == 9) {
                if (i10 != i9) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.Source
        public long read(@NotNull Buffer sink, long j9) throws IOException {
            l.e(sink, "sink");
            while (true) {
                int i9 = this.left;
                if (i9 != 0) {
                    long j10 = this.source.read(sink, Math.min(j9, i9));
                    if (j10 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j10;
                    return j10;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i9) {
            this.flags = i9;
        }

        public final void setLeft(int i9) {
            this.left = i9;
        }

        public final void setLength(int i9) {
            this.length = i9;
        }

        public final void setPadding(int i9) {
            this.padding = i9;
        }

        public final void setStreamId(int i9) {
            this.streamId = i9;
        }

        @Override // okio.Source
        @NotNull
        public Timeout timeout() {
            return this.source.timeout();
        }
    }

    public interface Handler {
        void ackSettings();

        void alternateService(int i9, @NotNull String str, @NotNull ByteString byteString, @NotNull String str2, int i10, long j9);

        void data(boolean z9, int i9, @NotNull BufferedSource bufferedSource, int i10) throws IOException;

        void goAway(int i9, @NotNull ErrorCode errorCode, @NotNull ByteString byteString);

        void headers(boolean z9, int i9, int i10, @NotNull List<Header> list);

        void ping(boolean z9, int i9, int i10);

        void priority(int i9, int i10, int i11, boolean z9);

        void pushPromise(int i9, int i10, @NotNull List<Header> list) throws IOException;

        void rstStream(int i9, @NotNull ErrorCode errorCode);

        void settings(boolean z9, @NotNull Settings settings);

        void windowUpdate(int i9, long j9);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        l.d(logger2, "Logger.getLogger(Http2::class.java.name)");
        logger = logger2;
    }

    public Http2Reader(@NotNull BufferedSource source, boolean z9) {
        l.e(source, "source");
        this.source = source;
        this.client = z9;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z9 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.data(z9, i11, this.source, Companion.lengthWithoutPadding(i9, i10, iAnd));
        this.source.skip(iAnd);
    }

    private final void readGoAway(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i9);
        }
        if (i11 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i12 = this.source.readInt();
        int i13 = this.source.readInt();
        int i14 = i9 - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i13);
        if (errorCodeFromHttp2 == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i13);
        }
        ByteString byteString = ByteString.EMPTY;
        if (i14 > 0) {
            byteString = this.source.readByteString(i14);
        }
        handler.goAway(i12, errorCodeFromHttp2, byteString);
    }

    private final List<Header> readHeaderBlock(int i9, int i10, int i11, int i12) throws IOException {
        this.continuation.setLeft(i9);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(i10);
        this.continuation.setFlags(i11);
        this.continuation.setStreamId(i12);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z9 = (i10 & 1) != 0;
        int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        if ((i10 & 32) != 0) {
            readPriority(handler, i11);
            i9 -= 5;
        }
        handler.headers(z9, i11, -1, readHeaderBlock(Companion.lengthWithoutPadding(i9, i10, iAnd), iAnd, i10, i11));
    }

    private final void readPing(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i9);
        }
        if (i11 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i10 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(Handler handler, int i9) throws IOException {
        int i10 = this.source.readInt();
        handler.priority(i9, i10 & a.e.API_PRIORITY_OTHER, Util.and(this.source.readByte(), 255) + 1, (i10 & ((int) IjkMediaMeta.AV_CH_WIDE_LEFT)) != 0);
    }

    private final void readPriority(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 == 5) {
            if (i11 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            readPriority(handler, i11);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i9 + " != 5");
        }
    }

    private final void readPushPromise(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i10 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
        handler.pushPromise(i11, this.source.readInt() & a.e.API_PRIORITY_OTHER, readHeaderBlock(Companion.lengthWithoutPadding(i9 - 4, i10, iAnd), iAnd, i10, i11));
    }

    private final void readRstStream(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i9 + " != 4");
        }
        if (i11 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i12 = this.source.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.Companion.fromHttp2(i12);
        if (errorCodeFromHttp2 != null) {
            handler.rstStream(i11, errorCodeFromHttp2);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i12);
    }

    private final void readSettings(Handler handler, int i9, int i10, int i11) throws IOException {
        int i12;
        if (i11 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i10 & 1) != 0) {
            if (i9 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i9 % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i9);
        }
        Settings settings = new Settings();
        B8.a aVarL = h.l(h.m(0, i9), 6);
        int iD = aVarL.d();
        int iF = aVarL.f();
        int iG = aVarL.g();
        if (iG < 0 ? iD >= iF : iD <= iF) {
            while (true) {
                int iAnd = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                i12 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i12 < 16384 || i12 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i12 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (i12 != 0 && i12 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.set(iAnd, i12);
                if (iD == iF) {
                    break;
                } else {
                    iD += iG;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i12);
        }
        handler.settings(false, settings);
    }

    private final void readWindowUpdate(Handler handler, int i9, int i10, int i11) throws IOException {
        if (i9 != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i9);
        }
        long jAnd = Util.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i11, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z9, @NotNull Handler handler) throws IOException {
        l.e(handler, "handler");
        try {
            this.source.require(9L);
            int medium = Util.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + medium);
            }
            int iAnd = Util.and(this.source.readByte(), 255);
            int iAnd2 = Util.and(this.source.readByte(), 255);
            int i9 = this.source.readInt() & a.e.API_PRIORITY_OTHER;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Http2.INSTANCE.frameLog(true, i9, medium, iAnd, iAnd2));
            }
            if (z9 && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(handler, medium, iAnd2, i9);
                    return true;
                case 1:
                    readHeaders(handler, medium, iAnd2, i9);
                    return true;
                case 2:
                    readPriority(handler, medium, iAnd2, i9);
                    return true;
                case 3:
                    readRstStream(handler, medium, iAnd2, i9);
                    return true;
                case 4:
                    readSettings(handler, medium, iAnd2, i9);
                    return true;
                case 5:
                    readPushPromise(handler, medium, iAnd2, i9);
                    return true;
                case 6:
                    readPing(handler, medium, iAnd2, i9);
                    return true;
                case 7:
                    readGoAway(handler, medium, iAnd2, i9);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, iAnd2, i9);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(@NotNull Handler handler) throws IOException {
        l.e(handler, "handler");
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        BufferedSource bufferedSource = this.source;
        ByteString byteString = Http2.CONNECTION_PREFACE;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Util.format("<< CONNECTION " + byteString2.hex(), new Object[0]));
        }
        if (!l.a(byteString, byteString2)) {
            throw new IOException("Expected a connection header but was " + byteString2.utf8());
        }
    }
}
