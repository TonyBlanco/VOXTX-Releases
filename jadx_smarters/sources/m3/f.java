package m3;

import O2.C0897l1;
import d3.AbstractC1675l;
import d3.InterfaceC1673j;
import d4.M;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f44351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f44352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f44353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f44354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f44358j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final M f44359k = new M(255);

    public boolean a(InterfaceC1673j interfaceC1673j, boolean z9) throws C0897l1 {
        b();
        this.f44359k.Q(27);
        if (!AbstractC1675l.b(interfaceC1673j, this.f44359k.e(), 0, 27, z9) || this.f44359k.J() != 1332176723) {
            return false;
        }
        int iH = this.f44359k.H();
        this.f44349a = iH;
        if (iH != 0) {
            if (z9) {
                return false;
            }
            throw C0897l1.e("unsupported bit stream revision");
        }
        this.f44350b = this.f44359k.H();
        this.f44351c = this.f44359k.v();
        this.f44352d = this.f44359k.x();
        this.f44353e = this.f44359k.x();
        this.f44354f = this.f44359k.x();
        int iH2 = this.f44359k.H();
        this.f44355g = iH2;
        this.f44356h = iH2 + 27;
        this.f44359k.Q(iH2);
        if (!AbstractC1675l.b(interfaceC1673j, this.f44359k.e(), 0, this.f44355g, z9)) {
            return false;
        }
        for (int i9 = 0; i9 < this.f44355g; i9++) {
            this.f44358j[i9] = this.f44359k.H();
            this.f44357i += this.f44358j[i9];
        }
        return true;
    }

    public void b() {
        this.f44349a = 0;
        this.f44350b = 0;
        this.f44351c = 0L;
        this.f44352d = 0L;
        this.f44353e = 0L;
        this.f44354f = 0L;
        this.f44355g = 0;
        this.f44356h = 0;
        this.f44357i = 0;
    }

    public boolean c(InterfaceC1673j interfaceC1673j) {
        return d(interfaceC1673j, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.b(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(d3.InterfaceC1673j r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.k()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            d4.AbstractC1684a.a(r0)
            d4.M r0 = r8.f44359k
            r1 = 4
            r0.Q(r1)
        L1a:
            r2 = -1
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r2 = r9.getPosition()
            r6 = 4
            long r2 = r2 + r6
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 >= 0) goto L51
        L2b:
            d4.M r2 = r8.f44359k
            byte[] r2 = r2.e()
            boolean r2 = d3.AbstractC1675l.b(r9, r2, r4, r1, r5)
            if (r2 == 0) goto L51
            d4.M r0 = r8.f44359k
            r0.U(r4)
            d4.M r0 = r8.f44359k
            long r2 = r0.J()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.f()
            return r5
        L4d:
            r9.q(r5)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r1 = r9.getPosition()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r1 = r9.b(r5)
            r2 = -1
            if (r1 == r2) goto L63
            goto L51
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.f.d(d3.j, long):boolean");
    }
}
