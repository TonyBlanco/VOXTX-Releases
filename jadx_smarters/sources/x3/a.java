package X3;

import P3.b;
import P3.h;
import P3.i;
import P3.k;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import d4.AbstractC1681B;
import d4.M;
import d4.k0;
import java.nio.charset.Charset;
import java.util.List;
import r5.AbstractC2675d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f10446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f10450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f10451t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f10452u;

    public a(List list) {
        super("Tx3gDecoder");
        this.f10446o = new M();
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f10448q = 0;
            this.f10449r = -1;
            this.f10450s = "sans-serif";
            this.f10447p = false;
            this.f10451t = 0.85f;
            this.f10452u = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f10448q = bArr[24];
        this.f10449r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f10450s = "Serif".equals(k0.F(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i9 = bArr[25] * 20;
        this.f10452u = i9;
        boolean z9 = (bArr[0] & 32) != 0;
        this.f10447p = z9;
        if (z9) {
            this.f10451t = k0.q(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i9, 0.0f, 0.95f);
        } else {
            this.f10451t = 0.85f;
        }
    }

    public static void C(boolean z9) throws k {
        if (!z9) {
            throw new k("Unexpected subtitle format.");
        }
    }

    public static void D(SpannableStringBuilder spannableStringBuilder, int i9, int i10, int i11, int i12, int i13) {
        if (i9 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i9 >>> 8) | ((i9 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4d
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = 1
            goto Ld
        Lc:
            r10 = 0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r10 == 0) goto L26
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L22
            r4 = 3
            r3.<init>(r4)
        L1e:
            r5.setSpan(r3, r8, r9, r7)
            goto L2f
        L22:
            r3.<init>(r1)
            goto L1e
        L26:
            if (r2 == 0) goto L2f
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
            goto L1e
        L2f:
            r6 = r6 & 4
            if (r6 == 0) goto L34
            goto L35
        L34:
            r1 = 0
        L35:
            if (r1 == 0) goto L3f
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3f:
            if (r1 != 0) goto L4d
            if (r10 != 0) goto L4d
            if (r2 != 0) goto L4d
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.a.E(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    public static void F(SpannableStringBuilder spannableStringBuilder, String str, int i9, int i10) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i9, i10, 16711713);
        }
    }

    public static String G(M m9) throws k {
        C(m9.a() >= 2);
        int iN = m9.N();
        if (iN == 0) {
            return "";
        }
        int iF = m9.f();
        Charset charsetP = m9.P();
        int iF2 = iN - (m9.f() - iF);
        if (charsetP == null) {
            charsetP = AbstractC2675d.f49724c;
        }
        return m9.F(iF2, charsetP);
    }

    public final void B(M m9, SpannableStringBuilder spannableStringBuilder) throws k {
        C(m9.a() >= 12);
        int iN = m9.N();
        int iN2 = m9.N();
        m9.V(2);
        int iH = m9.H();
        m9.V(1);
        int iQ = m9.q();
        if (iN2 > spannableStringBuilder.length()) {
            AbstractC1681B.j("Tx3gDecoder", "Truncating styl end (" + iN2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iN2 = spannableStringBuilder.length();
        }
        if (iN < iN2) {
            int i9 = iN2;
            E(spannableStringBuilder, iH, this.f10448q, iN, i9, 0);
            D(spannableStringBuilder, iQ, this.f10449r, iN, i9, 0);
            return;
        }
        AbstractC1681B.j("Tx3gDecoder", "Ignoring styl with start (" + iN + ") >= end (" + iN2 + ").");
    }

    @Override // P3.h
    public i z(byte[] bArr, int i9, boolean z9) throws k {
        this.f10446o.S(bArr, i9);
        String strG = G(this.f10446o);
        if (strG.isEmpty()) {
            return b.f10453c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strG);
        E(spannableStringBuilder, this.f10448q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder, this.f10449r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f10450s, 0, spannableStringBuilder.length());
        float fQ = this.f10451t;
        while (this.f10446o.a() >= 8) {
            int iF = this.f10446o.f();
            int iQ = this.f10446o.q();
            int iQ2 = this.f10446o.q();
            if (iQ2 == 1937013100) {
                C(this.f10446o.a() >= 2);
                int iN = this.f10446o.N();
                for (int i10 = 0; i10 < iN; i10++) {
                    B(this.f10446o, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.f10447p) {
                C(this.f10446o.a() >= 2);
                fQ = k0.q(this.f10446o.N() / this.f10452u, 0.0f, 0.95f);
            }
            this.f10446o.U(iF + iQ);
        }
        return new b(new b.C0083b().o(spannableStringBuilder).h(fQ, 0).i(0).a());
    }
}
