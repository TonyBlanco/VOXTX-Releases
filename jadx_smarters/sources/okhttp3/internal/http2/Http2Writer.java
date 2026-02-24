package okhttp3.internal.http2;

import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;

    @NotNull
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public Http2Writer(@NotNull BufferedSink sink, boolean z9) {
        l.e(sink, "sink");
        this.sink = sink;
        this.client = z9;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
    }

    private final void writeContinuationFrames(int i9, long j9) throws IOException {
        while (j9 > 0) {
            long jMin = Math.min(this.maxFrameSize, j9);
            j9 -= jMin;
            frameHeader(i9, (int) jMin, 9, j9 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(@NotNull Settings peerSettings) throws IOException {
        try {
            l.e(peerSettings, "peerSettings");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
            if (peerSettings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
                }
                this.sink.write(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void data(boolean z9, int i9, @Nullable Buffer buffer, int i10) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i9, z9 ? 1 : 0, buffer, i10);
    }

    public final void dataFrame(int i9, int i10, @Nullable Buffer buffer, int i11) throws IOException {
        frameHeader(i9, i11, 0, i10);
        if (i11 > 0) {
            BufferedSink bufferedSink = this.sink;
            l.b(buffer);
            bufferedSink.write(buffer, i11);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i9, int i10, int i11, int i12) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i9, i10, i11, i12));
        }
        if (!(i10 <= this.maxFrameSize)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i10).toString());
        }
        if (!((((int) IjkMediaMeta.AV_CH_WIDE_LEFT) & i9) == 0)) {
            throw new IllegalArgumentException(("reserved bit set: " + i9).toString());
        }
        Util.writeMedium(this.sink, i10);
        this.sink.writeByte(i11 & 255);
        this.sink.writeByte(i12 & 255);
        this.sink.writeInt(i9 & a.e.API_PRIORITY_OTHER);
    }

    @NotNull
    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i9, @NotNull ErrorCode errorCode, @NotNull byte[] debugData) throws IOException {
        try {
            l.e(errorCode, "errorCode");
            l.e(debugData, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (!(errorCode.getHttpCode() != -1)) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            frameHeader(0, debugData.length + 8, 7, 0);
            this.sink.writeInt(i9);
            this.sink.writeInt(errorCode.getHttpCode());
            if (!(debugData.length == 0)) {
                this.sink.write(debugData);
            }
            this.sink.flush();
        } finally {
        }
    }

    public final synchronized void headers(boolean z9, int i9, @NotNull List<Header> headerBlock) throws IOException {
        l.e(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long size = this.hpackBuffer.size();
        long jMin = Math.min(this.maxFrameSize, size);
        int i10 = size == jMin ? 4 : 0;
        if (z9) {
            i10 |= 1;
        }
        frameHeader(i9, (int) jMin, 1, i10);
        this.sink.write(this.hpackBuffer, jMin);
        if (size > jMin) {
            writeContinuationFrames(i9, size - jMin);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z9, int i9, int i10) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z9 ? 1 : 0);
        this.sink.writeInt(i9);
        this.sink.writeInt(i10);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i9, int i10, @NotNull List<Header> requestHeaders) throws IOException {
        l.e(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long size = this.hpackBuffer.size();
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
        long j9 = iMin;
        frameHeader(i9, iMin + 4, 5, size == j9 ? 4 : 0);
        this.sink.writeInt(i10 & a.e.API_PRIORITY_OTHER);
        this.sink.write(this.hpackBuffer, j9);
        if (size > j9) {
            writeContinuationFrames(i9, size - j9);
        }
    }

    public final synchronized void rstStream(int i9, @NotNull ErrorCode errorCode) throws IOException {
        l.e(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(errorCode.getHttpCode() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(i9, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(@NotNull Settings settings) throws IOException {
        try {
            l.e(settings, "settings");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i9 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i9 < 10) {
                if (settings.isSet(i9)) {
                    this.sink.writeShort(i9 != 4 ? i9 != 7 ? i9 : 4 : 3);
                    this.sink.writeInt(settings.get(i9));
                }
                i9++;
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void windowUpdate(int i9, long j9) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!(j9 != 0 && j9 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j9).toString());
        }
        frameHeader(i9, 4, 8, 0);
        this.sink.writeInt((int) j9);
        this.sink.flush();
    }
}
