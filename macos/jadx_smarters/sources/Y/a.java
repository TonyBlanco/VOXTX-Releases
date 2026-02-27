package Y;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String message, Throwable th) {
        super(message, th);
        kotlin.jvm.internal.l.e(message, "message");
    }

    public /* synthetic */ a(String str, Throwable th, int i9, kotlin.jvm.internal.g gVar) {
        this(str, (i9 & 2) != 0 ? null : th);
    }
}
