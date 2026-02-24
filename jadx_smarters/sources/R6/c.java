package R6;

import x6.k;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6.b f9320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f9321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f9322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f9323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f9324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9328i;

    public c(D6.b bVar, q qVar, q qVar2, q qVar3, q qVar4) throws k {
        boolean z9 = qVar == null || qVar2 == null;
        boolean z10 = qVar3 == null || qVar4 == null;
        if (z9 && z10) {
            throw k.a();
        }
        if (z9) {
            qVar = new q(0.0f, qVar3.d());
            qVar2 = new q(0.0f, qVar4.d());
        } else if (z10) {
            qVar3 = new q(bVar.l() - 1, qVar.d());
            qVar4 = new q(bVar.l() - 1, qVar2.d());
        }
        this.f9320a = bVar;
        this.f9321b = qVar;
        this.f9322c = qVar2;
        this.f9323d = qVar3;
        this.f9324e = qVar4;
        this.f9325f = (int) Math.min(qVar.c(), qVar2.c());
        this.f9326g = (int) Math.max(qVar3.c(), qVar4.c());
        this.f9327h = (int) Math.min(qVar.d(), qVar3.d());
        this.f9328i = (int) Math.max(qVar2.d(), qVar4.d());
    }

    public c(c cVar) {
        this.f9320a = cVar.f9320a;
        this.f9321b = cVar.f9321b;
        this.f9322c = cVar.f9322c;
        this.f9323d = cVar.f9323d;
        this.f9324e = cVar.f9324e;
        this.f9325f = cVar.f9325f;
        this.f9326g = cVar.f9326g;
        this.f9327h = cVar.f9327h;
        this.f9328i = cVar.f9328i;
    }

    public static c j(c cVar, c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f9320a, cVar.f9321b, cVar.f9322c, cVar2.f9323d, cVar2.f9324e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public R6.c a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            x6.q r0 = r12.f9321b
            x6.q r1 = r12.f9322c
            x6.q r2 = r12.f9323d
            x6.q r3 = r12.f9324e
            if (r13 <= 0) goto L2a
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            x6.q r13 = new x6.q
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L27
            r8 = r13
        L25:
            r10 = r2
            goto L2c
        L27:
            r10 = r13
            r8 = r0
            goto L2c
        L2a:
            r8 = r0
            goto L25
        L2c:
            if (r14 <= 0) goto L5d
            if (r15 == 0) goto L33
            x6.q r13 = r12.f9322c
            goto L35
        L33:
            x6.q r13 = r12.f9324e
        L35:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            D6.b r14 = r12.f9320a
            int r14 = r14.i()
            if (r0 < r14) goto L4b
            D6.b r14 = r12.f9320a
            int r14 = r14.i()
            int r0 = r14 + (-1)
        L4b:
            x6.q r14 = new x6.q
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L5a
            r9 = r14
        L58:
            r11 = r3
            goto L5f
        L5a:
            r11 = r14
            r9 = r1
            goto L5f
        L5d:
            r9 = r1
            goto L58
        L5f:
            R6.c r13 = new R6.c
            D6.b r7 = r12.f9320a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: R6.c.a(int, int, boolean):R6.c");
    }

    public q b() {
        return this.f9322c;
    }

    public q c() {
        return this.f9324e;
    }

    public int d() {
        return this.f9326g;
    }

    public int e() {
        return this.f9328i;
    }

    public int f() {
        return this.f9325f;
    }

    public int g() {
        return this.f9327h;
    }

    public q h() {
        return this.f9321b;
    }

    public q i() {
        return this.f9323d;
    }
}
