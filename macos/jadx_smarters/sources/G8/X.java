package G8;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.g f2311a;

    public X(o8.g gVar) {
        this.f2311a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f2311a.toString();
    }
}
