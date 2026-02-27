package n3;

import O2.C0936z0;
import android.util.SparseArray;
import d4.AbstractC1689f;
import d4.M;
import java.util.ArrayList;
import java.util.List;
import n3.I;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: n3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2257j implements I.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45050b;

    public C2257j(int i9) {
        this(i9, AbstractC2743y.z());
    }

    public C2257j(int i9, List list) {
        this.f45049a = i9;
        this.f45050b = list;
    }

    @Override // n3.I.c
    public SparseArray a() {
        return new SparseArray();
    }

    @Override // n3.I.c
    public I b(int i9, I.b bVar) {
        if (i9 != 2) {
            if (i9 == 3 || i9 == 4) {
                return new w(new t(bVar.f44971b));
            }
            if (i9 == 21) {
                return new w(new r());
            }
            if (i9 == 27) {
                if (f(4)) {
                    return null;
                }
                return new w(new p(c(bVar), f(1), f(8)));
            }
            if (i9 == 36) {
                return new w(new q(c(bVar)));
            }
            if (i9 == 89) {
                return new w(new l(bVar.f44972c));
            }
            if (i9 != 138) {
                if (i9 == 172) {
                    return new w(new C2253f(bVar.f44971b));
                }
                if (i9 == 257) {
                    return new C(new v("application/vnd.dvb.ait"));
                }
                if (i9 == 134) {
                    if (f(16)) {
                        return null;
                    }
                    return new C(new v("application/x-scte35"));
                }
                if (i9 != 135) {
                    switch (i9) {
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            if (!f(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            if (!f(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i9) {
                                case 130:
                                    if (!f(64)) {
                                    }
                                    break;
                            }
                            break;
                    }
                    return null;
                }
                return new w(new C2250c(bVar.f44971b));
            }
            return new w(new C2258k(bVar.f44971b));
        }
        return new w(new n(d(bVar)));
    }

    public final D c(I.b bVar) {
        return new D(e(bVar));
    }

    public final K d(I.b bVar) {
        return new K(e(bVar));
    }

    public final List e(I.b bVar) {
        String str;
        int i9;
        if (f(32)) {
            return this.f45050b;
        }
        M m9 = new M(bVar.f44973d);
        List arrayList = this.f45050b;
        while (m9.a() > 0) {
            int iH = m9.H();
            int iF = m9.f() + m9.H();
            if (iH == 134) {
                arrayList = new ArrayList();
                int iH2 = m9.H() & 31;
                for (int i10 = 0; i10 < iH2; i10++) {
                    String strE = m9.E(3);
                    int iH3 = m9.H();
                    boolean z9 = (iH3 & 128) != 0;
                    if (z9) {
                        i9 = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i9 = 1;
                    }
                    byte bH = (byte) m9.H();
                    m9.V(1);
                    arrayList.add(new C0936z0.b().g0(str).X(strE).H(i9).V(z9 ? AbstractC1689f.b((bH & 64) != 0) : null).G());
                }
            }
            m9.U(iF);
        }
        return arrayList;
    }

    public final boolean f(int i9) {
        return (i9 & this.f45049a) != 0;
    }
}
