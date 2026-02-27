package w;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f51528o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f51529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f51530b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f51534f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f51538j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51531c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51532d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51533e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51535g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f51536h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f51537i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2897b[] f51539k = new C2897b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51540l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51541m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashSet f51542n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f51538j = aVar;
    }

    public static void b() {
        f51528o++;
    }

    public final void a(C2897b c2897b) {
        int i9 = 0;
        while (true) {
            int i10 = this.f51540l;
            if (i9 >= i10) {
                C2897b[] c2897bArr = this.f51539k;
                if (i10 >= c2897bArr.length) {
                    this.f51539k = (C2897b[]) Arrays.copyOf(c2897bArr, c2897bArr.length * 2);
                }
                C2897b[] c2897bArr2 = this.f51539k;
                int i11 = this.f51540l;
                c2897bArr2[i11] = c2897b;
                this.f51540l = i11 + 1;
                return;
            }
            if (this.f51539k[i9] == c2897b) {
                return;
            } else {
                i9++;
            }
        }
    }

    public final void c(C2897b c2897b) {
        int i9 = this.f51540l;
        int i10 = 0;
        while (i10 < i9) {
            if (this.f51539k[i10] == c2897b) {
                while (i10 < i9 - 1) {
                    C2897b[] c2897bArr = this.f51539k;
                    int i11 = i10 + 1;
                    c2897bArr[i10] = c2897bArr[i11];
                    i10 = i11;
                }
                this.f51540l--;
                return;
            }
            i10++;
        }
    }

    public void d() {
        this.f51530b = null;
        this.f51538j = a.UNKNOWN;
        this.f51533e = 0;
        this.f51531c = -1;
        this.f51532d = -1;
        this.f51534f = 0.0f;
        this.f51535g = false;
        int i9 = this.f51540l;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f51539k[i10] = null;
        }
        this.f51540l = 0;
        this.f51541m = 0;
        this.f51529a = false;
        Arrays.fill(this.f51537i, 0.0f);
    }

    public void e(C2899d c2899d, float f9) {
        this.f51534f = f9;
        this.f51535g = true;
        int i9 = this.f51540l;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f51539k[i10].B(c2899d, this, false);
        }
        this.f51540l = 0;
    }

    public void f(a aVar, String str) {
        this.f51538j = aVar;
    }

    public final void g(C2897b c2897b) {
        int i9 = this.f51540l;
        for (int i10 = 0; i10 < i9; i10++) {
            this.f51539k[i10].C(c2897b, false);
        }
        this.f51540l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f51530b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f51530b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f51531c);
        }
        return sb.toString();
    }
}
