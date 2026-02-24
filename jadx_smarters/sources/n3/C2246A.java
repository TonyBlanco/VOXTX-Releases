package n3;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d4.L;
import d4.M;
import d4.Z;
import java.util.Map;

/* JADX INFO: renamed from: n3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2246A implements InterfaceC1672i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final InterfaceC1678o f44899l = new InterfaceC1678o() { // from class: n3.z
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C2246A.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f44900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f44901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f44902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f44903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f44907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f44908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC1674k f44909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44910k;

    /* JADX INFO: renamed from: n3.A$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f44911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Z f44912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final L f44913c = new L(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f44914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f44915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f44916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f44917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f44918h;

        public a(m mVar, Z z9) {
            this.f44911a = mVar;
            this.f44912b = z9;
        }

        public void a(M m9) {
            m9.l(this.f44913c.f39700a, 0, 3);
            this.f44913c.p(0);
            b();
            m9.l(this.f44913c.f39700a, 0, this.f44917g);
            this.f44913c.p(0);
            c();
            this.f44911a.e(this.f44918h, 4);
            this.f44911a.b(m9);
            this.f44911a.d();
        }

        public final void b() {
            this.f44913c.r(8);
            this.f44914d = this.f44913c.g();
            this.f44915e = this.f44913c.g();
            this.f44913c.r(6);
            this.f44917g = this.f44913c.h(8);
        }

        public final void c() {
            this.f44918h = 0L;
            if (this.f44914d) {
                this.f44913c.r(4);
                long jH = ((long) this.f44913c.h(3)) << 30;
                this.f44913c.r(1);
                long jH2 = jH | ((long) (this.f44913c.h(15) << 15));
                this.f44913c.r(1);
                long jH3 = jH2 | ((long) this.f44913c.h(15));
                this.f44913c.r(1);
                if (!this.f44916f && this.f44915e) {
                    this.f44913c.r(4);
                    long jH4 = ((long) this.f44913c.h(3)) << 30;
                    this.f44913c.r(1);
                    long jH5 = jH4 | ((long) (this.f44913c.h(15) << 15));
                    this.f44913c.r(1);
                    long jH6 = jH5 | ((long) this.f44913c.h(15));
                    this.f44913c.r(1);
                    this.f44912b.b(jH6);
                    this.f44916f = true;
                }
                this.f44918h = this.f44912b.b(jH3);
            }
        }

        public void d() {
            this.f44916f = false;
            this.f44911a.c();
        }
    }

    public C2246A() {
        this(new Z(0L));
    }

    public C2246A(Z z9) {
        this.f44900a = z9;
        this.f44902c = new M(4096);
        this.f44901b = new SparseArray();
        this.f44903d = new y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] e() {
        return new InterfaceC1672i[]{new C2246A()};
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        boolean z9 = this.f44900a.e() == -9223372036854775807L;
        if (!z9) {
            long jC = this.f44900a.c();
            z9 = (jC == -9223372036854775807L || jC == 0 || jC == j10) ? false : true;
        }
        if (z9) {
            this.f44900a.h(j10);
        }
        x xVar = this.f44908i;
        if (xVar != null) {
            xVar.h(j10);
        }
        for (int i9 = 0; i9 < this.f44901b.size(); i9++) {
            ((a) this.f44901b.valueAt(i9)).d();
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f44909j = interfaceC1674k;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    @Override // d3.InterfaceC1672i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(d3.InterfaceC1673j r11, d3.t r12) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C2246A.d(d3.j, d3.t):int");
    }

    public final void f(long j9) {
        InterfaceC1674k interfaceC1674k;
        com.google.android.exoplayer2.extractor.g bVar;
        if (this.f44910k) {
            return;
        }
        this.f44910k = true;
        if (this.f44903d.c() != -9223372036854775807L) {
            x xVar = new x(this.f44903d.d(), this.f44903d.c(), j9);
            this.f44908i = xVar;
            interfaceC1674k = this.f44909j;
            bVar = xVar.b();
        } else {
            interfaceC1674k = this.f44909j;
            bVar = new g.b(this.f44903d.c());
        }
        interfaceC1674k.n(bVar);
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        byte[] bArr = new byte[14];
        interfaceC1673j.s(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC1673j.n(bArr[13] & 7);
        interfaceC1673j.s(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
