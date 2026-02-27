package Y;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f10507a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Throwable readException) {
        super(null);
        kotlin.jvm.internal.l.e(readException, "readException");
        this.f10507a = readException;
    }

    public final Throwable a() {
        return this.f10507a;
    }
}
