package okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class DeflaterSinkExtensions {
    @NotNull
    public static final DeflaterSink deflate(@NotNull Sink deflate, @NotNull Deflater deflater) {
        l.e(deflate, "$this$deflate");
        l.e(deflater, "deflater");
        return new DeflaterSink(deflate, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink deflate, Deflater deflater, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            deflater = new Deflater();
        }
        l.e(deflate, "$this$deflate");
        l.e(deflater, "deflater");
        return new DeflaterSink(deflate, deflater);
    }
}
