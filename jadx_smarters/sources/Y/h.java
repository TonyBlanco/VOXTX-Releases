package Y;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f10506a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable finalException) {
        super(null);
        kotlin.jvm.internal.l.e(finalException, "finalException");
        this.f10506a = finalException;
    }

    public final Throwable a() {
        return this.f10506a;
    }
}
