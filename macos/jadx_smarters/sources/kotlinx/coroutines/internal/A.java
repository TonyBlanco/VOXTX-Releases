package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f43729a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f43729a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
