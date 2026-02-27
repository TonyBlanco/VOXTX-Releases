package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import k8.q;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler() {
        this(System.nanoTime());
    }

    public Throttler(long j9) {
        this.allocatedUntil = j9;
        this.waitByteCount = 8192L;
        this.maxByteCount = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j9, long j10, long j11, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j10 = throttler.waitByteCount;
        }
        long j12 = j10;
        if ((i9 & 4) != 0) {
            j11 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j9, j12, j11);
    }

    private final long bytesToNanos(long j9) {
        return (j9 * 1000000000) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j9) {
        return (j9 * this.bytesPerSecond) / 1000000000;
    }

    private final void waitNanos(long j9) throws InterruptedException {
        long j10 = j9 / 1000000;
        wait(j10, (int) (j9 - (1000000 * j10)));
    }

    public final long byteCountOrWaitNanos$okio(long j9, long j10) {
        long jBytesToNanos;
        if (this.bytesPerSecond == 0) {
            return j10;
        }
        long jMax = Math.max(this.allocatedUntil - j9, 0L);
        long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
        if (jNanosToBytes >= j10) {
            j9 += jMax;
            jBytesToNanos = bytesToNanos(j10);
        } else {
            long j11 = this.waitByteCount;
            if (jNanosToBytes >= j11) {
                this.allocatedUntil = j9 + bytesToNanos(this.maxByteCount);
                return jNanosToBytes;
            }
            j10 = Math.min(j11, j10);
            long jBytesToNanos2 = jMax + bytesToNanos(j10 - this.maxByteCount);
            if (jBytesToNanos2 != 0) {
                return -jBytesToNanos2;
            }
            jBytesToNanos = bytesToNanos(this.maxByteCount);
        }
        this.allocatedUntil = j9 + jBytesToNanos;
        return j10;
    }

    public final void bytesPerSecond(long j9) {
        bytesPerSecond$default(this, j9, 0L, 0L, 6, null);
    }

    public final void bytesPerSecond(long j9, long j10) {
        bytesPerSecond$default(this, j9, j10, 0L, 4, null);
    }

    public final void bytesPerSecond(long j9, long j10, long j11) {
        synchronized (this) {
            if (!(j9 >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j10 > 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(j11 >= j10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.bytesPerSecond = j9;
            this.waitByteCount = j10;
            this.maxByteCount = j11;
            notifyAll();
            q qVar = q.f43674a;
        }
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        l.e(sink, "sink");
        return new ForwardingSink(sink) { // from class: okio.Throttler.sink.1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(@NotNull Buffer source, long j9) throws IOException {
                l.e(source, "source");
                while (j9 > 0) {
                    try {
                        long jTake$okio = Throttler.this.take$okio(j9);
                        super.write(source, jTake$okio);
                        j9 -= jTake$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        l.e(source, "source");
        return new ForwardingSource(source) { // from class: okio.Throttler.source.1
            @Override // okio.ForwardingSource, okio.Source
            public long read(@NotNull Buffer sink, long j9) throws InterruptedIOException {
                l.e(sink, "sink");
                try {
                    return super.read(sink, Throttler.this.take$okio(j9));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long j9) {
        long jByteCountOrWaitNanos$okio;
        if (!(j9 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            while (true) {
                jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j9);
                if (jByteCountOrWaitNanos$okio < 0) {
                    waitNanos(-jByteCountOrWaitNanos$okio);
                }
            }
        }
        return jByteCountOrWaitNanos$okio;
    }
}
