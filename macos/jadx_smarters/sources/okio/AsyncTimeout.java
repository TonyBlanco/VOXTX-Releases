package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import k8.q;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class AsyncTimeout extends Timeout {
    public static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
            synchronized (AsyncTimeout.class) {
                for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                    if (asyncTimeout2.next == asyncTimeout) {
                        asyncTimeout2.next = asyncTimeout.next;
                        asyncTimeout.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x001c, B:12:0x0028, B:13:0x0031, B:18:0x0042, B:19:0x004a, B:21:0x0053, B:24:0x0063, B:25:0x0068, B:27:0x0078, B:28:0x007d, B:17:0x003b, B:31:0x0081, B:32:0x0086), top: B:35:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x001c, B:12:0x0028, B:13:0x0031, B:18:0x0042, B:19:0x004a, B:21:0x0053, B:24:0x0063, B:25:0x0068, B:27:0x0078, B:28:0x007d, B:17:0x003b, B:31:0x0081, B:32:0x0086), top: B:35:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[EDGE_INSN: B:36:0x0068->B:25:0x0068 BREAK  A[LOOP:0: B:19:0x004a->B:24:0x0063], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void scheduleTimeout(okio.AsyncTimeout r7, long r8, boolean r10) {
            /*
                r6 = this;
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                monitor-enter(r0)
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L1a
                if (r1 != 0) goto L1c
                okio.AsyncTimeout r1 = new okio.AsyncTimeout     // Catch: java.lang.Throwable -> L1a
                r1.<init>()     // Catch: java.lang.Throwable -> L1a
                okio.AsyncTimeout.access$setHead$cp(r1)     // Catch: java.lang.Throwable -> L1a
                okio.AsyncTimeout$Watchdog r1 = new okio.AsyncTimeout$Watchdog     // Catch: java.lang.Throwable -> L1a
                r1.<init>()     // Catch: java.lang.Throwable -> L1a
                r1.start()     // Catch: java.lang.Throwable -> L1a
                goto L1c
            L1a:
                r7 = move-exception
                goto L87
            L1c:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1a
                r3 = 0
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 == 0) goto L36
                if (r10 == 0) goto L36
                long r3 = r7.deadlineNanoTime()     // Catch: java.lang.Throwable -> L1a
                long r3 = r3 - r1
                long r8 = java.lang.Math.min(r8, r3)     // Catch: java.lang.Throwable -> L1a
            L31:
                long r8 = r8 + r1
                okio.AsyncTimeout.access$setTimeoutAt$p(r7, r8)     // Catch: java.lang.Throwable -> L1a
                goto L42
            L36:
                if (r5 == 0) goto L39
                goto L31
            L39:
                if (r10 == 0) goto L81
                long r8 = r7.deadlineNanoTime()     // Catch: java.lang.Throwable -> L1a
                okio.AsyncTimeout.access$setTimeoutAt$p(r7, r8)     // Catch: java.lang.Throwable -> L1a
            L42:
                long r8 = okio.AsyncTimeout.access$remainingNanos(r7, r1)     // Catch: java.lang.Throwable -> L1a
                okio.AsyncTimeout r10 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L1a
            L4a:
                kotlin.jvm.internal.l.b(r10)     // Catch: java.lang.Throwable -> L1a
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r10)     // Catch: java.lang.Throwable -> L1a
                if (r3 == 0) goto L68
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r10)     // Catch: java.lang.Throwable -> L1a
                kotlin.jvm.internal.l.b(r3)     // Catch: java.lang.Throwable -> L1a
                long r3 = okio.AsyncTimeout.access$remainingNanos(r3, r1)     // Catch: java.lang.Throwable -> L1a
                int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r5 >= 0) goto L63
                goto L68
            L63:
                okio.AsyncTimeout r10 = okio.AsyncTimeout.access$getNext$p(r10)     // Catch: java.lang.Throwable -> L1a
                goto L4a
            L68:
                okio.AsyncTimeout r8 = okio.AsyncTimeout.access$getNext$p(r10)     // Catch: java.lang.Throwable -> L1a
                okio.AsyncTimeout.access$setNext$p(r7, r8)     // Catch: java.lang.Throwable -> L1a
                okio.AsyncTimeout.access$setNext$p(r10, r7)     // Catch: java.lang.Throwable -> L1a
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L1a
                if (r10 != r7) goto L7d
                java.lang.Class<okio.AsyncTimeout> r7 = okio.AsyncTimeout.class
                r7.notify()     // Catch: java.lang.Throwable -> L1a
            L7d:
                k8.q r7 = k8.q.f43674a     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r0)
                return
            L81:
                java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1a
                r7.<init>()     // Catch: java.lang.Throwable -> L1a
                throw r7     // Catch: java.lang.Throwable -> L1a
            L87:
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.AsyncTimeout.Companion.scheduleTimeout(okio.AsyncTimeout, long, boolean):void");
        }

        @Nullable
        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            l.b(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            long jNanoTime = System.nanoTime();
            if (asyncTimeout2 == null) {
                AsyncTimeout.class.wait(AsyncTimeout.IDLE_TIMEOUT_MILLIS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                l.b(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jRemainingNanos = asyncTimeout2.remainingNanos(jNanoTime);
            if (jRemainingNanos > 0) {
                long j9 = jRemainingNanos / 1000000;
                AsyncTimeout.class.wait(j9, (int) (jRemainingNanos - (1000000 * j9)));
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            l.b(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }
    }

    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncTimeout asyncTimeoutAwaitTimeout$okio;
            while (true) {
                try {
                    synchronized (AsyncTimeout.class) {
                        asyncTimeoutAwaitTimeout$okio = AsyncTimeout.Companion.awaitTimeout$okio();
                        if (asyncTimeoutAwaitTimeout$okio == AsyncTimeout.head) {
                            AsyncTimeout.head = null;
                            return;
                        }
                        q qVar = q.f43674a;
                    }
                    if (asyncTimeoutAwaitTimeout$okio != null) {
                        asyncTimeoutAwaitTimeout$okio.timedOut();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j9) {
        return this.timeoutAt - j9;
    }

    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        if (!(!this.inQueue)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            this.inQueue = true;
            Companion.scheduleTimeout(this, jTimeoutNanos, zHasDeadline);
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return Companion.cancelScheduledTimeout(this);
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        l.e(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    sink.close();
                    q qVar = q.f43674a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e9) {
                    if (!asyncTimeout.exit()) {
                        throw e9;
                    }
                    throw asyncTimeout.access$newTimeoutException(e9);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    sink.flush();
                    q qVar = q.f43674a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e9) {
                    if (!asyncTimeout.exit()) {
                        throw e9;
                    }
                    throw asyncTimeout.access$newTimeoutException(e9);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink
            @NotNull
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // okio.Sink
            public void write(@NotNull Buffer source, long j9) throws IOException {
                l.e(source, "source");
                Util.checkOffsetAndCount(source.size(), 0L, j9);
                while (true) {
                    long j10 = 0;
                    if (j9 <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    while (true) {
                        l.b(segment);
                        if (j10 >= AsyncTimeout.TIMEOUT_WRITE_SIZE) {
                            break;
                        }
                        j10 += (long) (segment.limit - segment.pos);
                        if (j10 >= j9) {
                            j10 = j9;
                            break;
                        }
                        segment = segment.next;
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    asyncTimeout.enter();
                    try {
                        sink.write(source, j10);
                        q qVar = q.f43674a;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        j9 -= j10;
                    } catch (IOException e9) {
                        if (!asyncTimeout.exit()) {
                            throw e9;
                        }
                        throw asyncTimeout.access$newTimeoutException(e9);
                    } finally {
                        asyncTimeout.exit();
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        l.e(source, "source");
        return new Source() { // from class: okio.AsyncTimeout.source.1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    source.close();
                    q qVar = q.f43674a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e9) {
                    if (!asyncTimeout.exit()) {
                        throw e9;
                    }
                    throw asyncTimeout.access$newTimeoutException(e9);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long j9) throws IOException {
                l.e(sink, "sink");
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    long j10 = source.read(sink, j9);
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    return j10;
                } catch (IOException e9) {
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(e9);
                    }
                    throw e9;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            @NotNull
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }
        };
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(@NotNull w8.a block) throws IOException {
        l.e(block, "block");
        enter();
        try {
            try {
                T t9 = (T) block.invoke();
                k.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                k.a(1);
                return t9;
            } catch (IOException e9) {
                if (exit()) {
                    throw access$newTimeoutException(e9);
                }
                throw e9;
            }
        } catch (Throwable th) {
            k.b(1);
            exit();
            k.a(1);
            throw th;
        }
    }
}
