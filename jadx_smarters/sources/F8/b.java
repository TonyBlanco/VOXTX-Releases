package F8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2100a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal[] f2101b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i9 = 0; i9 < 4; i9++) {
            threadLocalArr[i9] = new ThreadLocal();
        }
        f2101b = threadLocalArr;
    }

    public static final boolean a() {
        return f2100a;
    }
}
