package Q8;

import android.R;
import android.app.Activity;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R8.e f8429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f8430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8435g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final R8.e f8436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f8438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f8441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8442g = -1;

        public b(Activity activity, int i9, String... strArr) {
            this.f8436a = R8.e.d(activity);
            this.f8437b = i9;
            this.f8438c = strArr;
        }

        public d a() {
            if (this.f8439d == null) {
                this.f8439d = this.f8436a.b().getString(e.f8443a);
            }
            if (this.f8440e == null) {
                this.f8440e = this.f8436a.b().getString(R.string.ok);
            }
            if (this.f8441f == null) {
                this.f8441f = this.f8436a.b().getString(R.string.cancel);
            }
            return new d(this.f8436a, this.f8438c, this.f8437b, this.f8439d, this.f8440e, this.f8441f, this.f8442g);
        }

        public b b(String str) {
            this.f8439d = str;
            return this;
        }
    }

    public d(R8.e eVar, String[] strArr, int i9, String str, String str2, String str3, int i10) {
        this.f8429a = eVar;
        this.f8430b = (String[]) strArr.clone();
        this.f8431c = i9;
        this.f8432d = str;
        this.f8433e = str2;
        this.f8434f = str3;
        this.f8435g = i10;
    }

    public R8.e a() {
        return this.f8429a;
    }

    public String b() {
        return this.f8434f;
    }

    public String[] c() {
        return (String[]) this.f8430b.clone();
    }

    public String d() {
        return this.f8433e;
    }

    public String e() {
        return this.f8432d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f8430b, dVar.f8430b) && this.f8431c == dVar.f8431c;
    }

    public int f() {
        return this.f8431c;
    }

    public int g() {
        return this.f8435g;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f8430b) * 31) + this.f8431c;
    }

    public String toString() {
        return "PermissionRequest{mHelper=" + this.f8429a + ", mPerms=" + Arrays.toString(this.f8430b) + ", mRequestCode=" + this.f8431c + ", mRationale='" + this.f8432d + "', mPositiveButtonText='" + this.f8433e + "', mNegativeButtonText='" + this.f8434f + "', mTheme=" + this.f8435g + '}';
    }
}
