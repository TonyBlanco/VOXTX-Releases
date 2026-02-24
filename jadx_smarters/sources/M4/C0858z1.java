package M4;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzpe;

/* JADX INFO: renamed from: M4.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0858z1 extends F2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f5139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0846x1 f5142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0846x1 f5143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0846x1 f5144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0846x1 f5145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0846x1 f5146j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0846x1 f5147k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0846x1 f5148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0846x1 f5149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0846x1 f5150n;

    public C0858z1(C0776l2 c0776l2) {
        super(c0776l2);
        this.f5139c = (char) 0;
        this.f5140d = -1L;
        this.f5142f = new C0846x1(this, 6, false, false);
        this.f5143g = new C0846x1(this, 6, true, false);
        this.f5144h = new C0846x1(this, 6, false, true);
        this.f5145i = new C0846x1(this, 5, false, false);
        this.f5146j = new C0846x1(this, 5, true, false);
        this.f5147k = new C0846x1(this, 5, false, true);
        this.f5148l = new C0846x1(this, 4, false, false);
        this.f5149m = new C0846x1(this, 3, false, false);
        this.f5150n = new C0846x1(this, 2, false, false);
    }

    public static String A(boolean z9, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z9, obj);
        String strB2 = B(z9, obj2);
        String strB3 = B(z9, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb.append(str2);
            sb.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb.append(str3);
            sb.append(strB3);
        }
        return sb.toString();
    }

    public static String B(boolean z9, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i9 = 0;
        if (obj instanceof Long) {
            if (!z9) {
                return obj.toString();
            }
            Long l9 = (Long) obj;
            if (Math.abs(l9.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l9.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            String str = cCharAt == '-' ? "-" : "";
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C0852y1 ? ((C0852y1) obj).f5132a : z9 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z9 ? th.getClass().getName() : th.toString());
        String strC = C(C0776l2.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i9];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i9++;
        }
        return sb2.toString();
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        zzpe.zzc();
        return ((Boolean) AbstractC0781m1.f4848A0.a(null)).booleanValue() ? "" : str;
    }

    public static Object z(String str) {
        if (str == null) {
            return null;
        }
        return new C0852y1(str);
    }

    public final String D() {
        String str;
        synchronized (this) {
            try {
                if (this.f5141e == null) {
                    this.f5141e = this.f4245a.Q() != null ? this.f4245a.Q() : this.f4245a.z().w();
                }
                com.google.android.gms.common.internal.r.m(this.f5141e);
                str = this.f5141e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void G(int i9, boolean z9, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z9 && Log.isLoggable(D(), i9)) {
            Log.println(i9, D(), A(false, str, obj, obj2, obj3));
        }
        if (z10 || i9 < 5) {
            return;
        }
        com.google.android.gms.common.internal.r.m(str);
        C0758i2 c0758i2G = this.f4245a.G();
        if (c0758i2G == null) {
            Log.println(6, D(), "Scheduler not set. Not logging error/warn");
        } else if (c0758i2G.n()) {
            c0758i2G.z(new RunnableC0840w1(this, i9 >= 9 ? 8 : i9, str, obj, obj2, obj3));
        } else {
            Log.println(6, D(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    @Override // M4.F2
    public final boolean j() {
        return false;
    }

    public final C0846x1 q() {
        return this.f5149m;
    }

    public final C0846x1 r() {
        return this.f5142f;
    }

    public final C0846x1 s() {
        return this.f5144h;
    }

    public final C0846x1 t() {
        return this.f5143g;
    }

    public final C0846x1 u() {
        return this.f5148l;
    }

    public final C0846x1 v() {
        return this.f5150n;
    }

    public final C0846x1 w() {
        return this.f5145i;
    }

    public final C0846x1 x() {
        return this.f5147k;
    }

    public final C0846x1 y() {
        return this.f5146j;
    }
}
