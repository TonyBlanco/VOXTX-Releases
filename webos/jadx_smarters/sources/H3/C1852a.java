package h3;

import O2.C0936z0;
import Q2.AbstractC1015a;
import d3.w;
import d4.M;
import h3.AbstractC1856e;
import java.util.Collections;

/* JADX INFO: renamed from: h3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1852a extends AbstractC1856e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f41617e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41620d;

    public C1852a(w wVar) {
        super(wVar);
    }

    @Override // h3.AbstractC1856e
    public boolean b(M m9) throws AbstractC1856e.a {
        C0936z0.b bVarH0;
        if (this.f41618b) {
            m9.V(1);
        } else {
            int iH = m9.H();
            int i9 = (iH >> 4) & 15;
            this.f41620d = i9;
            if (i9 == 2) {
                bVarH0 = new C0936z0.b().g0("audio/mpeg").J(1).h0(f41617e[(iH >> 2) & 3]);
            } else if (i9 == 7 || i9 == 8) {
                bVarH0 = new C0936z0.b().g0(i9 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").J(1).h0(8000);
            } else {
                if (i9 != 10) {
                    throw new AbstractC1856e.a("Audio format not supported: " + this.f41620d);
                }
                this.f41618b = true;
            }
            this.f41641a.d(bVarH0.G());
            this.f41619c = true;
            this.f41618b = true;
        }
        return true;
    }

    @Override // h3.AbstractC1856e
    public boolean c(M m9, long j9) {
        if (this.f41620d == 2) {
            int iA = m9.a();
            this.f41641a.b(m9, iA);
            this.f41641a.f(j9, 1, iA, 0, null);
            return true;
        }
        int iH = m9.H();
        if (iH != 0 || this.f41619c) {
            if (this.f41620d == 10 && iH != 1) {
                return false;
            }
            int iA2 = m9.a();
            this.f41641a.b(m9, iA2);
            this.f41641a.f(j9, 1, iA2, 0, null);
            return true;
        }
        int iA3 = m9.a();
        byte[] bArr = new byte[iA3];
        m9.l(bArr, 0, iA3);
        AbstractC1015a.b bVarF = AbstractC1015a.f(bArr);
        this.f41641a.d(new C0936z0.b().g0("audio/mp4a-latm").K(bVarF.f7733c).J(bVarF.f7732b).h0(bVarF.f7731a).V(Collections.singletonList(bArr)).G());
        this.f41619c = true;
        return false;
    }
}
