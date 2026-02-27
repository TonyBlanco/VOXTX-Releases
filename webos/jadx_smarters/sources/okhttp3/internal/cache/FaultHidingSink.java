package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;
import w8.l;

/* JADX INFO: loaded from: classes4.dex */
public class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;

    @NotNull
    private final l onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(@NotNull Sink delegate, @NotNull l onException) {
        super(delegate);
        kotlin.jvm.internal.l.e(delegate, "delegate");
        kotlin.jvm.internal.l.e(onException, "onException");
        this.onException = onException;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e9) {
            this.hasErrors = true;
            this.onException.invoke(e9);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e9) {
            this.hasErrors = true;
            this.onException.invoke(e9);
        }
    }

    @NotNull
    public final l getOnException() {
        return this.onException;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long j9) throws EOFException {
        kotlin.jvm.internal.l.e(source, "source");
        if (this.hasErrors) {
            source.skip(j9);
            return;
        }
        try {
            super.write(source, j9);
        } catch (IOException e9) {
            this.hasErrors = true;
            this.onException.invoke(e9);
        }
    }
}
