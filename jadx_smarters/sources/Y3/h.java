package Y3;

import O2.C0897l1;
import android.text.TextUtils;
import d4.M;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends P3.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f10672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f10673p;

    public h() {
        super("WebvttDecoder");
        this.f10672o = new M();
        this.f10673p = new c();
    }

    public static int B(M m9) {
        int i9 = -1;
        int iF = 0;
        while (i9 == -1) {
            iF = m9.f();
            String strS = m9.s();
            i9 = strS == null ? 0 : "STYLE".equals(strS) ? 2 : strS.startsWith("NOTE") ? 1 : 3;
        }
        m9.U(iF);
        return i9;
    }

    public static void C(M m9) {
        while (!TextUtils.isEmpty(m9.s())) {
        }
    }

    @Override // P3.h
    public P3.i z(byte[] bArr, int i9, boolean z9) throws P3.k {
        e eVarM;
        this.f10672o.S(bArr, i9);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f10672o);
            while (!TextUtils.isEmpty(this.f10672o.s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iB = B(this.f10672o);
                if (iB == 0) {
                    return new k(arrayList2);
                }
                if (iB == 1) {
                    C(this.f10672o);
                } else if (iB == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new P3.k("A style block was found after the first cue.");
                    }
                    this.f10672o.s();
                    arrayList.addAll(this.f10673p.d(this.f10672o));
                } else if (iB == 3 && (eVarM = f.m(this.f10672o, arrayList)) != null) {
                    arrayList2.add(eVarM);
                }
            }
        } catch (C0897l1 e9) {
            throw new P3.k(e9);
        }
    }
}
