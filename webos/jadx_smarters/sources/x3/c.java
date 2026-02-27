package x3;

import d4.L;
import d4.M;
import d4.Z;
import java.nio.ByteBuffer;
import q3.C2540a;
import q3.C2544e;
import q3.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f51917a = new M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f51918b = new L();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z f51919c;

    @Override // q3.h
    public C2540a b(C2544e c2544e, ByteBuffer byteBuffer) {
        Z z9 = this.f51919c;
        if (z9 == null || c2544e.f46821j != z9.e()) {
            Z z10 = new Z(c2544e.f9701f);
            this.f51919c = z10;
            z10.a(c2544e.f9701f - c2544e.f46821j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f51917a.S(bArrArray, iLimit);
        this.f51918b.o(bArrArray, iLimit);
        this.f51918b.r(39);
        long jH = (((long) this.f51918b.h(1)) << 32) | ((long) this.f51918b.h(32));
        this.f51918b.r(20);
        int iH = this.f51918b.h(12);
        int iH2 = this.f51918b.h(8);
        this.f51917a.V(14);
        C2540a.b bVarA = iH2 != 0 ? iH2 != 255 ? iH2 != 4 ? iH2 != 5 ? iH2 != 6 ? null : g.a(this.f51917a, jH, this.f51919c) : d.a(this.f51917a, jH, this.f51919c) : f.a(this.f51917a) : C2955a.a(this.f51917a, iH, jH) : new e();
        return bVarA == null ? new C2540a(new C2540a.b[0]) : new C2540a(bVarA);
    }
}
