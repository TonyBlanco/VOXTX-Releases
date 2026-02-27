package W5;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f10311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f10312d;

    public e(Throwable th, d dVar) {
        this.f10309a = th.getLocalizedMessage();
        this.f10310b = th.getClass().getName();
        this.f10311c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f10312d = cause != null ? new e(cause, dVar) : null;
    }
}
