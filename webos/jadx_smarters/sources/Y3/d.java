package Y3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import r5.AbstractC2673b;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10633f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10635h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10642o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10628a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10629b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f10630c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10631d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10632e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10634g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10636i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10637j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10638k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10639l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10640m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10641n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10643p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10644q = false;

    public static int B(int i9, String str, String str2, int i10) {
        if (str.isEmpty() || i9 == -1) {
            return i9;
        }
        if (str.equals(str2)) {
            return i9 + i10;
        }
        return -1;
    }

    public d A(boolean z9) {
        this.f10638k = z9 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f10636i) {
            return this.f10635h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f10644q;
    }

    public int c() {
        if (this.f10634g) {
            return this.f10633f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f10632e;
    }

    public float e() {
        return this.f10642o;
    }

    public int f() {
        return this.f10641n;
    }

    public int g() {
        return this.f10643p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f10628a.isEmpty() && this.f10629b.isEmpty() && this.f10630c.isEmpty() && this.f10631d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f10628a, str, 1073741824), this.f10629b, str2, 2), this.f10631d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f10630c)) {
            return 0;
        }
        return iB + (this.f10630c.size() * 4);
    }

    public int i() {
        int i9 = this.f10639l;
        if (i9 == -1 && this.f10640m == -1) {
            return -1;
        }
        return (i9 == 1 ? 1 : 0) | (this.f10640m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f10636i;
    }

    public boolean k() {
        return this.f10634g;
    }

    public boolean l() {
        return this.f10637j == 1;
    }

    public boolean m() {
        return this.f10638k == 1;
    }

    public d n(int i9) {
        this.f10635h = i9;
        this.f10636i = true;
        return this;
    }

    public d o(boolean z9) {
        this.f10639l = z9 ? 1 : 0;
        return this;
    }

    public d p(boolean z9) {
        this.f10644q = z9;
        return this;
    }

    public d q(int i9) {
        this.f10633f = i9;
        this.f10634g = true;
        return this;
    }

    public d r(String str) {
        this.f10632e = str == null ? null : AbstractC2673b.e(str);
        return this;
    }

    public d s(float f9) {
        this.f10642o = f9;
        return this;
    }

    public d t(int i9) {
        this.f10641n = i9;
        return this;
    }

    public d u(boolean z9) {
        this.f10640m = z9 ? 1 : 0;
        return this;
    }

    public d v(int i9) {
        this.f10643p = i9;
        return this;
    }

    public void w(String[] strArr) {
        this.f10630c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f10628a = str;
    }

    public void y(String str) {
        this.f10629b = str;
    }

    public void z(String str) {
        this.f10631d = str;
    }
}
