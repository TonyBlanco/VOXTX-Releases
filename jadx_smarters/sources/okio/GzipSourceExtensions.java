package okio;

import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getBit(int i9, int i10) {
        return ((i9 >> i10) & 1) == 1;
    }

    @NotNull
    public static final GzipSource gzip(@NotNull Source gzip) {
        l.e(gzip, "$this$gzip");
        return new GzipSource(gzip);
    }
}
