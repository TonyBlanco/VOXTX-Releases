package Q0;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k f7461a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7462b = 20;

    public static class a extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7463c;

        public a(int i9) {
            super(i9);
            this.f7463c = i9;
        }

        @Override // Q0.k
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f7463c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // Q0.k
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f7463c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // Q0.k
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f7463c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // Q0.k
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f7463c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // Q0.k
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f7463c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public k(int i9) {
    }

    public static synchronized k c() {
        try {
            if (f7461a == null) {
                f7461a = new a(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7461a;
    }

    public static synchronized void e(k kVar) {
        f7461a = kVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i9 = f7462b;
        if (length >= i9) {
            str = str.substring(0, i9);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
