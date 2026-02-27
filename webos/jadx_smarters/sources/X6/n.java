package x6;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f51975a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f51976c;

    static {
        f51975a = System.getProperty("surefire.test.class.path") != null;
        f51976c = new StackTraceElement[0];
    }

    public n() {
    }

    public n(Throwable th) {
        super(th);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
