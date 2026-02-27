package okio;

import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class Okio__OkioKt {
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink buffer) {
        l.e(buffer, "$this$buffer");
        return new RealBufferedSink(buffer);
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source buffer) {
        l.e(buffer, "$this$buffer");
        return new RealBufferedSource(buffer);
    }
}
