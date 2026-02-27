package x;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.Arrays;
import w.C2899d;
import x.e;
import y.C2968b;
import y.C2971e;

/* JADX INFO: loaded from: classes.dex */
public class f extends k {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f51830C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f51831D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f51832E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f51833F0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public C2968b f51848x0 = new C2968b(this);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public C2971e f51849y0 = new C2971e(this);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public C2968b.InterfaceC0481b f51850z0 = null;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f51828A0 = false;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public C2899d f51829B0 = new C2899d();

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f51834G0 = 0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f51835H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public c[] f51836I0 = new c[4];

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public c[] f51837J0 = new c[4];

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f51838K0 = false;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f51839L0 = false;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f51840M0 = false;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f51841N0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f51842O0 = 0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f51843P0 = 263;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f51844Q0 = false;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public boolean f51845R0 = false;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f51846S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f51847T0 = 0;

    @Override // x.e
    public void E0(boolean z9, boolean z10) {
        super.E0(z9, z10);
        int size = this.f51861w0.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((e) this.f51861w0.get(i9)).E0(z9, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6 A[PHI: r0 r5
      0x01c6: PHI (r0v26 boolean) = (r0v25 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:71:0x018b, B:79:0x01ae, B:80:0x01b0, B:82:0x01b6] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r5v11 boolean) = (r5v10 boolean), (r5v13 boolean), (r5v13 boolean), (r5v13 boolean) binds: [B:71:0x018b, B:79:0x01ae, B:80:0x01b0, B:82:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // x.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G0() {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.f.G0():void");
    }

    public void J0(e eVar, int i9) {
        if (i9 == 0) {
            L0(eVar);
        } else if (i9 == 1) {
            M0(eVar);
        }
    }

    public boolean K0(C2899d c2899d) {
        f(c2899d);
        int size = this.f51861w0.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            e eVar = (e) this.f51861w0.get(i9);
            eVar.l0(0, false);
            eVar.l0(1, false);
            if (eVar instanceof C2944a) {
                z9 = true;
            }
        }
        if (z9) {
            for (int i10 = 0; i10 < size; i10++) {
                e eVar2 = (e) this.f51861w0.get(i10);
                if (eVar2 instanceof C2944a) {
                    ((C2944a) eVar2).J0();
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            e eVar3 = (e) this.f51861w0.get(i11);
            if (eVar3.e()) {
                eVar3.f(c2899d);
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            e eVar4 = (e) this.f51861w0.get(i12);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.f51765M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.i0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.w0(e.b.FIXED);
                }
                eVar4.f(c2899d);
                if (bVar == bVar3) {
                    eVar4.i0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.w0(bVar2);
                }
            } else {
                j.a(this, c2899d, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(c2899d);
                }
            }
        }
        if (this.f51834G0 > 0) {
            b.a(this, c2899d, 0);
        }
        if (this.f51835H0 > 0) {
            b.a(this, c2899d, 1);
        }
        return true;
    }

    public final void L0(e eVar) {
        int i9 = this.f51834G0 + 1;
        c[] cVarArr = this.f51837J0;
        if (i9 >= cVarArr.length) {
            this.f51837J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f51837J0[this.f51834G0] = new c(eVar, 0, V0());
        this.f51834G0++;
    }

    public final void M0(e eVar) {
        int i9 = this.f51835H0 + 1;
        c[] cVarArr = this.f51836I0;
        if (i9 >= cVarArr.length) {
            this.f51836I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f51836I0[this.f51835H0] = new c(eVar, 1, V0());
        this.f51835H0++;
    }

    public boolean N0(boolean z9) {
        return this.f51849y0.f(z9);
    }

    public boolean O0(boolean z9) {
        return this.f51849y0.g(z9);
    }

    public boolean P0(boolean z9, int i9) {
        return this.f51849y0.h(z9, i9);
    }

    public C2968b.InterfaceC0481b Q0() {
        return this.f51850z0;
    }

    public int R0() {
        return this.f51843P0;
    }

    public void S0() {
        this.f51849y0.j();
    }

    public void T0() {
        this.f51849y0.k();
    }

    public boolean U0() {
        return this.f51846S0;
    }

    public boolean V0() {
        return this.f51828A0;
    }

    @Override // x.k, x.e
    public void W() {
        this.f51829B0.D();
        this.f51830C0 = 0;
        this.f51832E0 = 0;
        this.f51831D0 = 0;
        this.f51833F0 = 0;
        this.f51844Q0 = false;
        super.W();
    }

    public boolean W0() {
        return this.f51845R0;
    }

    public long X0(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f51830C0 = i16;
        this.f51831D0 = i17;
        return this.f51848x0.d(this, i9, i16, i17, i10, i11, i12, i13, i14, i15);
    }

    public boolean Y0(int i9) {
        return (this.f51843P0 & i9) == i9;
    }

    public final void Z0() {
        this.f51834G0 = 0;
        this.f51835H0 = 0;
    }

    public void a1(C2968b.InterfaceC0481b interfaceC0481b) {
        this.f51850z0 = interfaceC0481b;
        this.f51849y0.n(interfaceC0481b);
    }

    public void b1(int i9) {
        this.f51843P0 = i9;
        C2899d.f51496r = j.b(i9, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
    }

    public void c1(boolean z9) {
        this.f51828A0 = z9;
    }

    public void d1(C2899d c2899d, boolean[] zArr) {
        zArr[2] = false;
        F0(c2899d);
        int size = this.f51861w0.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((e) this.f51861w0.get(i9)).F0(c2899d);
        }
    }

    public void e1() {
        this.f51848x0.e(this);
    }
}
