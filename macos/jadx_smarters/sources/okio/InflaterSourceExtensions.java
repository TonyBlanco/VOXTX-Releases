package okio;

import java.util.zip.Inflater;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class InflaterSourceExtensions {
    @NotNull
    public static final InflaterSource inflate(@NotNull Source inflate, @NotNull Inflater inflater) {
        l.e(inflate, "$this$inflate");
        l.e(inflater, "inflater");
        return new InflaterSource(inflate, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source inflate, Inflater inflater, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            inflater = new Inflater();
        }
        l.e(inflate, "$this$inflate");
        l.e(inflater, "inflater");
        return new InflaterSource(inflate, inflater);
    }
}
