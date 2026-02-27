package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import okhttp3.internal.http2.Http2Connection;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import w8.a;

/* JADX INFO: loaded from: classes4.dex */
public final class TaskLoggerKt {
    @NotNull
    public static final String formatDuration(long j9) {
        StringBuilder sb;
        long j10;
        long j11;
        long j12;
        if (j9 > -999500000) {
            if (j9 > -999500) {
                if (j9 <= 0) {
                    sb = new StringBuilder();
                    j12 = j9 - ((long) 500);
                } else if (j9 < 999500) {
                    sb = new StringBuilder();
                    j12 = j9 + ((long) 500);
                } else if (j9 < 999500000) {
                    sb = new StringBuilder();
                    j11 = j9 + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j10 = j9 + ((long) 500000000);
                }
                sb.append(j12 / ((long) 1000));
                sb.append(" µs");
                String string = sb.toString();
                E e9 = E.f43679a;
                String str = String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
                l.d(str, "java.lang.String.format(format, *args)");
                return str;
            }
            sb = new StringBuilder();
            j11 = j9 - ((long) 500000);
            sb.append(j11 / ((long) 1000000));
            sb.append(" ms");
            String string2 = sb.toString();
            E e92 = E.f43679a;
            String str2 = String.format("%6s", Arrays.copyOf(new Object[]{string2}, 1));
            l.d(str2, "java.lang.String.format(format, *args)");
            return str2;
        }
        sb = new StringBuilder();
        j10 = j9 - ((long) 500000000);
        sb.append(j10 / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
        sb.append(" s ");
        String string22 = sb.toString();
        E e922 = E.f43679a;
        String str22 = String.format("%6s", Arrays.copyOf(new Object[]{string22}, 1));
        l.d(str22, "java.lang.String.format(format, *args)");
        return str22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(TokenParser.SP);
        E e9 = E.f43679a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        l.d(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue queue, @NotNull a block) {
        long jNanoTime;
        l.e(task, "task");
        l.e(queue, "queue");
        l.e(block, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t9 = (T) block.invoke();
            k.b(1);
            if (zIsLoggable) {
                log(task, queue, "finished run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            k.a(1);
            return t9;
        } catch (Throwable th) {
            k.b(1);
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            k.a(1);
            throw th;
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue queue, @NotNull a messageBlock) {
        l.e(task, "task");
        l.e(queue, "queue");
        l.e(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, (String) messageBlock.invoke());
        }
    }
}
