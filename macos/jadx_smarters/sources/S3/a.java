package S3;

import P3.b;
import P3.h;
import P3.i;
import android.graphics.Bitmap;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d4.M;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f9395o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final M f9396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0117a f9397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Inflater f9398r;

    /* JADX INFO: renamed from: S3.a$a, reason: collision with other inner class name */
    public static final class C0117a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M f9399a = new M();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f9400b = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9404f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9405g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9406h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9407i;

        public P3.b d() {
            int iH;
            if (this.f9402d == 0 || this.f9403e == 0 || this.f9406h == 0 || this.f9407i == 0 || this.f9399a.g() == 0 || this.f9399a.f() != this.f9399a.g() || !this.f9401c) {
                return null;
            }
            this.f9399a.U(0);
            int i9 = this.f9406h * this.f9407i;
            int[] iArr = new int[i9];
            int i10 = 0;
            while (i10 < i9) {
                int iH2 = this.f9399a.H();
                if (iH2 != 0) {
                    iH = i10 + 1;
                    iArr[i10] = this.f9400b[iH2];
                } else {
                    int iH3 = this.f9399a.H();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f9399a.H()) + i10;
                        Arrays.fill(iArr, i10, iH, (iH3 & 128) == 0 ? 0 : this.f9400b[this.f9399a.H()]);
                    }
                }
                i10 = iH;
            }
            return new b.C0083b().f(Bitmap.createBitmap(iArr, this.f9406h, this.f9407i, Bitmap.Config.ARGB_8888)).k(this.f9404f / this.f9402d).l(0).h(this.f9405g / this.f9403e, 0).i(0).n(this.f9406h / this.f9402d).g(this.f9407i / this.f9403e).a();
        }

        public final void e(M m9, int i9) {
            int iK;
            if (i9 < 4) {
                return;
            }
            m9.V(3);
            int i10 = i9 - 4;
            if ((m9.H() & 128) != 0) {
                if (i10 < 7 || (iK = m9.K()) < 4) {
                    return;
                }
                this.f9406h = m9.N();
                this.f9407i = m9.N();
                this.f9399a.Q(iK - 4);
                i10 = i9 - 11;
            }
            int iF = this.f9399a.f();
            int iG = this.f9399a.g();
            if (iF >= iG || i10 <= 0) {
                return;
            }
            int iMin = Math.min(i10, iG - iF);
            m9.l(this.f9399a.e(), iF, iMin);
            this.f9399a.U(iF + iMin);
        }

        public final void f(M m9, int i9) {
            if (i9 < 19) {
                return;
            }
            this.f9402d = m9.N();
            this.f9403e = m9.N();
            m9.V(11);
            this.f9404f = m9.N();
            this.f9405g = m9.N();
        }

        public final void g(M m9, int i9) {
            if (i9 % 5 != 2) {
                return;
            }
            m9.V(2);
            Arrays.fill(this.f9400b, 0);
            int i10 = i9 / 5;
            for (int i11 = 0; i11 < i10; i11++) {
                int iH = m9.H();
                int iH2 = m9.H();
                int iH3 = m9.H();
                int iH4 = m9.H();
                double d9 = iH2;
                double d10 = iH3 - 128;
                double d11 = iH4 - 128;
                this.f9400b[iH] = (k0.r((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255) << 8) | (m9.H() << 24) | (k0.r((int) ((1.402d * d10) + d9), 0, 255) << 16) | k0.r((int) (d9 + (d11 * 1.772d)), 0, 255);
            }
            this.f9401c = true;
        }

        public void h() {
            this.f9402d = 0;
            this.f9403e = 0;
            this.f9404f = 0;
            this.f9405g = 0;
            this.f9406h = 0;
            this.f9407i = 0;
            this.f9399a.Q(0);
            this.f9401c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f9395o = new M();
        this.f9396p = new M();
        this.f9397q = new C0117a();
    }

    public static P3.b C(M m9, C0117a c0117a) {
        int iG = m9.g();
        int iH = m9.H();
        int iN = m9.N();
        int iF = m9.f() + iN;
        P3.b bVarD = null;
        if (iF > iG) {
            m9.U(iG);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c0117a.g(m9, iN);
                    break;
                case 21:
                    c0117a.e(m9, iN);
                    break;
                case 22:
                    c0117a.f(m9, iN);
                    break;
            }
        } else {
            bVarD = c0117a.d();
            c0117a.h();
        }
        m9.U(iF);
        return bVarD;
    }

    public final void B(M m9) {
        if (m9.a() <= 0 || m9.j() != 120) {
            return;
        }
        if (this.f9398r == null) {
            this.f9398r = new Inflater();
        }
        if (k0.z0(m9, this.f9396p, this.f9398r)) {
            m9.S(this.f9396p.e(), this.f9396p.g());
        }
    }

    @Override // P3.h
    public i z(byte[] bArr, int i9, boolean z9) {
        this.f9395o.S(bArr, i9);
        B(this.f9395o);
        this.f9397q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f9395o.a() >= 3) {
            P3.b bVarC = C(this.f9395o, this.f9397q);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
