package Y3;

import P3.b;
import d4.M;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends P3.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f10622o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f10622o = new M();
    }

    public static P3.b B(M m9, int i9) throws P3.k {
        CharSequence charSequenceQ = null;
        b.C0083b c0083bO = null;
        while (i9 > 0) {
            if (i9 < 8) {
                throw new P3.k("Incomplete vtt cue box header found.");
            }
            int iQ = m9.q();
            int iQ2 = m9.q();
            int i10 = iQ - 8;
            String strF = k0.F(m9.e(), m9.f(), i10);
            m9.V(i10);
            i9 = (i9 - 8) - i10;
            if (iQ2 == 1937011815) {
                c0083bO = f.o(strF);
            } else if (iQ2 == 1885436268) {
                charSequenceQ = f.q(null, strF.trim(), Collections.emptyList());
            }
        }
        if (charSequenceQ == null) {
            charSequenceQ = "";
        }
        return c0083bO != null ? c0083bO.o(charSequenceQ).a() : f.l(charSequenceQ);
    }

    @Override // P3.h
    public P3.i z(byte[] bArr, int i9, boolean z9) throws P3.k {
        this.f10622o.S(bArr, i9);
        ArrayList arrayList = new ArrayList();
        while (this.f10622o.a() > 0) {
            if (this.f10622o.a() < 8) {
                throw new P3.k("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iQ = this.f10622o.q();
            if (this.f10622o.q() == 1987343459) {
                arrayList.add(B(this.f10622o, iQ - 8));
            } else {
                this.f10622o.V(iQ - 8);
            }
        }
        return new b(arrayList);
    }
}
