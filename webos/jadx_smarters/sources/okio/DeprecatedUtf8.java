package okio;

import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    public final long size(@NotNull String string) {
        l.e(string, "string");
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    public final long size(@NotNull String string, int i9, int i10) {
        l.e(string, "string");
        return Utf8.size(string, i9, i10);
    }
}
