package P2;

import B3.C;
import O2.Q1;
import P2.InterfaceC0986c;
import P2.u0;
import android.util.Base64;
import d4.AbstractC1684a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements u0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r5.r f7101h = new r5.r() { // from class: P2.q0
        @Override // r5.r
        public final Object get() {
            return r0.k();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Random f7102i = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1.d f7103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q1.b f7104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f7105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r5.r f7106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0.a f7107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Q1 f7108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7109g;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C.b f7113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7115f;

        public a(String str, int i9, C.b bVar) {
            this.f7110a = str;
            this.f7111b = i9;
            this.f7112c = bVar == null ? -1L : bVar.f274d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f7113d = bVar;
        }

        public boolean i(int i9, C.b bVar) {
            if (bVar == null) {
                return i9 == this.f7111b;
            }
            C.b bVar2 = this.f7113d;
            return bVar2 == null ? !bVar.b() && bVar.f274d == this.f7112c : bVar.f274d == bVar2.f274d && bVar.f272b == bVar2.f272b && bVar.f273c == bVar2.f273c;
        }

        public boolean j(InterfaceC0986c.a aVar) {
            C.b bVar = aVar.f7010d;
            if (bVar == null) {
                return this.f7111b != aVar.f7009c;
            }
            long j9 = this.f7112c;
            if (j9 == -1) {
                return false;
            }
            if (bVar.f274d > j9) {
                return true;
            }
            if (this.f7113d == null) {
                return false;
            }
            int iF = aVar.f7008b.f(bVar.f271a);
            int iF2 = aVar.f7008b.f(this.f7113d.f271a);
            C.b bVar2 = aVar.f7010d;
            if (bVar2.f274d < this.f7113d.f274d || iF < iF2) {
                return false;
            }
            if (iF > iF2) {
                return true;
            }
            boolean zB = bVar2.b();
            C.b bVar3 = aVar.f7010d;
            if (!zB) {
                int i9 = bVar3.f275e;
                return i9 == -1 || i9 > this.f7113d.f272b;
            }
            int i10 = bVar3.f272b;
            int i11 = bVar3.f273c;
            C.b bVar4 = this.f7113d;
            int i12 = bVar4.f272b;
            if (i10 <= i12) {
                return i10 == i12 && i11 > bVar4.f273c;
            }
            return true;
        }

        public void k(int i9, C.b bVar) {
            if (this.f7112c == -1 && i9 == this.f7111b && bVar != null) {
                this.f7112c = bVar.f274d;
            }
        }

        public final int l(Q1 q12, Q1 q13, int i9) {
            if (i9 >= q12.u()) {
                if (i9 < q13.u()) {
                    return i9;
                }
                return -1;
            }
            q12.s(i9, r0.this.f7103a);
            for (int i10 = r0.this.f7103a.f5758p; i10 <= r0.this.f7103a.f5759q; i10++) {
                int iF = q13.f(q12.r(i10));
                if (iF != -1) {
                    return q13.k(iF, r0.this.f7104b).f5718d;
                }
            }
            return -1;
        }

        public boolean m(Q1 q12, Q1 q13) {
            int iL = l(q12, q13, this.f7111b);
            this.f7111b = iL;
            if (iL == -1) {
                return false;
            }
            C.b bVar = this.f7113d;
            return bVar == null || q13.f(bVar.f271a) != -1;
        }
    }

    public r0() {
        this(f7101h);
    }

    public r0(r5.r rVar) {
        this.f7106d = rVar;
        this.f7103a = new Q1.d();
        this.f7104b = new Q1.b();
        this.f7105c = new HashMap();
        this.f7108f = Q1.f5705a;
    }

    public static String k() {
        byte[] bArr = new byte[12];
        f7102i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // P2.u0
    public synchronized String a(Q1 q12, C.b bVar) {
        return l(q12.m(bVar.f271a, this.f7104b).f5718d, bVar).f7110a;
    }

    @Override // P2.u0
    public synchronized String b() {
        return this.f7109g;
    }

    @Override // P2.u0
    public void c(u0.a aVar) {
        this.f7107e = aVar;
    }

    @Override // P2.u0
    public synchronized void d(InterfaceC0986c.a aVar) {
        try {
            AbstractC1684a.e(this.f7107e);
            Q1 q12 = this.f7108f;
            this.f7108f = aVar.f7008b;
            Iterator it = this.f7105c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (!aVar2.m(q12, this.f7108f) || aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f7114e) {
                        if (aVar2.f7110a.equals(this.f7109g)) {
                            this.f7109g = null;
                        }
                        this.f7107e.S(aVar, aVar2.f7110a, false);
                    }
                }
            }
            m(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // P2.u0
    public synchronized void e(InterfaceC0986c.a aVar, int i9) {
        try {
            AbstractC1684a.e(this.f7107e);
            boolean z9 = i9 == 0;
            Iterator it = this.f7105c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f7114e) {
                        boolean zEquals = aVar2.f7110a.equals(this.f7109g);
                        boolean z10 = z9 && zEquals && aVar2.f7115f;
                        if (zEquals) {
                            this.f7109g = null;
                        }
                        this.f7107e.S(aVar, aVar2.f7110a, z10);
                    }
                }
            }
            m(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r25.f7010d.f274d < r2.f7112c) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    @Override // P2.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void f(P2.InterfaceC0986c.a r25) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.r0.f(P2.c$a):void");
    }

    @Override // P2.u0
    public synchronized void g(InterfaceC0986c.a aVar) {
        u0.a aVar2;
        this.f7109g = null;
        Iterator it = this.f7105c.values().iterator();
        while (it.hasNext()) {
            a aVar3 = (a) it.next();
            it.remove();
            if (aVar3.f7114e && (aVar2 = this.f7107e) != null) {
                aVar2.S(aVar, aVar3.f7110a, false);
            }
        }
    }

    public final a l(int i9, C.b bVar) {
        a aVar = null;
        long j9 = Long.MAX_VALUE;
        for (a aVar2 : this.f7105c.values()) {
            aVar2.k(i9, bVar);
            if (aVar2.i(i9, bVar)) {
                long j10 = aVar2.f7112c;
                if (j10 == -1 || j10 < j9) {
                    aVar = aVar2;
                    j9 = j10;
                } else if (j10 == j9 && ((a) d4.k0.j(aVar)).f7113d != null && aVar2.f7113d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f7106d.get();
        a aVar3 = new a(str, i9, bVar);
        this.f7105c.put(str, aVar3);
        return aVar3;
    }

    public final void m(InterfaceC0986c.a aVar) {
        if (aVar.f7008b.v()) {
            this.f7109g = null;
            return;
        }
        a aVar2 = (a) this.f7105c.get(this.f7109g);
        a aVarL = l(aVar.f7009c, aVar.f7010d);
        this.f7109g = aVarL.f7110a;
        f(aVar);
        C.b bVar = aVar.f7010d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f7112c == aVar.f7010d.f274d && aVar2.f7113d != null && aVar2.f7113d.f272b == aVar.f7010d.f272b && aVar2.f7113d.f273c == aVar.f7010d.f273c) {
            return;
        }
        C.b bVar2 = aVar.f7010d;
        this.f7107e.v(aVar, l(aVar.f7009c, new C.b(bVar2.f271a, bVar2.f274d)).f7110a, aVarL.f7110a);
    }
}
