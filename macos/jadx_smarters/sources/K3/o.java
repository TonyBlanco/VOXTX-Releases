package K3;

import O2.C0897l1;
import O2.C0936z0;
import Q2.AbstractC1015a;
import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import d4.AbstractC1684a;
import d4.AbstractC1689f;
import d4.G;
import d4.L;
import d4.k0;
import s5.AbstractC2717A;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f3753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f3754b;

    public o(com.google.android.exoplayer2.source.rtsp.e eVar, a aVar, Uri uri) {
        AbstractC1684a.b(aVar.f3683i.containsKey("control"), "missing attribute control");
        this.f3753a = b(aVar);
        this.f3754b = a(eVar, uri, (String) k0.j((String) aVar.f3683i.get("control")));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[PHI: r0
      0x0017: PHI (r0v3 java.lang.String) = (r0v1 java.lang.String), (r0v2 java.lang.String) binds: [B:6:0x0015, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri a(com.google.android.exoplayer2.source.rtsp.e r2, android.net.Uri r3, java.lang.String r4) {
        /*
            android.net.Uri r0 = android.net.Uri.parse(r4)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "Content-Base"
            java.lang.String r1 = r2.d(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L20
        L17:
            java.lang.String r2 = r2.d(r0)
            android.net.Uri r3 = android.net.Uri.parse(r2)
            goto L2d
        L20:
            java.lang.String r0 = "Content-Location"
            java.lang.String r1 = r2.d(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2d
            goto L17
        L2d:
            java.lang.String r2 = "*"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L36
            return r3
        L36:
            android.net.Uri$Builder r2 = r3.buildUpon()
            android.net.Uri$Builder r2 = r2.appendEncodedPath(r4)
            android.net.Uri r2 = r2.build()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.o.a(com.google.android.exoplayer2.source.rtsp.e, android.net.Uri, java.lang.String):android.net.Uri");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static K3.h b(K3.a r13) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.o.b(K3.a):K3.h");
    }

    public static byte[] c(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = G.f39651a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    public static int d(int i9, String str) {
        return i9 != -1 ? i9 : str.equals("audio/ac3") ? 6 : 1;
    }

    public static AbstractC1015a.b e(String str) {
        L l9 = new L(k0.L(str));
        AbstractC1684a.b(l9.h(1) == 0, "Only supports audio mux version 0.");
        AbstractC1684a.b(l9.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
        l9.r(6);
        AbstractC1684a.b(l9.h(4) == 0, "Only supports one program.");
        AbstractC1684a.b(l9.h(3) == 0, "Only supports one numLayer.");
        try {
            return AbstractC1015a.e(l9, false);
        } catch (C0897l1 e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public static void f(C0936z0.b bVar, AbstractC2717A abstractC2717A, String str, int i9, int i10) {
        String str2 = (String) abstractC2717A.get("profile-level-id");
        if (str2 == null && str.equals("MP4A-LATM")) {
            str2 = "30";
        }
        AbstractC1684a.b((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        bVar.K("mp4a.40." + str2);
        bVar.V(AbstractC2743y.A(AbstractC1015a.a(i10, i9)));
    }

    public static void g(C0936z0.b bVar, AbstractC2717A abstractC2717A) {
        String strA;
        AbstractC1684a.b(abstractC2717A.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] strArrI1 = k0.i1((String) AbstractC1684a.e((String) abstractC2717A.get("sprop-parameter-sets")), ",");
        AbstractC1684a.b(strArrI1.length == 2, "empty sprop value");
        AbstractC2743y abstractC2743yB = AbstractC2743y.B(c(strArrI1[0]), c(strArrI1[1]));
        bVar.V(abstractC2743yB);
        byte[] bArr = (byte[]) abstractC2743yB.get(0);
        G.c cVarL = G.l(bArr, G.f39651a.length, bArr.length);
        bVar.c0(cVarL.f39681h);
        bVar.S(cVarL.f39680g);
        bVar.n0(cVarL.f39679f);
        String str = (String) abstractC2717A.get("profile-level-id");
        if (str != null) {
            strA = "avc1." + str;
        } else {
            strA = AbstractC1689f.a(cVarL.f39674a, cVarL.f39675b, cVarL.f39676c);
        }
        bVar.K(strA);
    }

    public static void h(C0936z0.b bVar, AbstractC2717A abstractC2717A) {
        if (abstractC2717A.containsKey("sprop-max-don-diff")) {
            int i9 = Integer.parseInt((String) AbstractC1684a.e((String) abstractC2717A.get("sprop-max-don-diff")));
            AbstractC1684a.b(i9 == 0, "non-zero sprop-max-don-diff " + i9 + " is not supported");
        }
        AbstractC1684a.b(abstractC2717A.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) AbstractC1684a.e((String) abstractC2717A.get("sprop-vps"));
        AbstractC1684a.b(abstractC2717A.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) AbstractC1684a.e((String) abstractC2717A.get("sprop-sps"));
        AbstractC1684a.b(abstractC2717A.containsKey("sprop-pps"), "missing sprop-pps parameter");
        AbstractC2743y abstractC2743yD = AbstractC2743y.D(c(str), c(str2), c((String) AbstractC1684a.e((String) abstractC2717A.get("sprop-pps"))));
        bVar.V(abstractC2743yD);
        byte[] bArr = (byte[]) abstractC2743yD.get(1);
        G.a aVarH = G.h(bArr, G.f39651a.length, bArr.length);
        bVar.c0(aVarH.f39667m);
        bVar.S(aVarH.f39666l).n0(aVarH.f39665k);
        bVar.K(AbstractC1689f.c(aVarH.f39655a, aVarH.f39656b, aVarH.f39657c, aVarH.f39658d, aVarH.f39662h, aVarH.f39663i));
    }

    public static void i(C0936z0.b bVar, AbstractC2717A abstractC2717A) {
        String str = (String) abstractC2717A.get("config");
        if (str != null) {
            byte[] bArrL = k0.L(str);
            bVar.V(AbstractC2743y.A(bArrL));
            Pair pairF = AbstractC1689f.f(bArrL);
            bVar.n0(((Integer) pairF.first).intValue()).S(((Integer) pairF.second).intValue());
        } else {
            bVar.n0(352).S(288);
        }
        String str2 = (String) abstractC2717A.get("profile-level-id");
        StringBuilder sb = new StringBuilder();
        sb.append("mp4v.");
        if (str2 == null) {
            str2 = "1";
        }
        sb.append(str2);
        bVar.K(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f3753a.equals(oVar.f3753a) && this.f3754b.equals(oVar.f3754b);
    }

    public int hashCode() {
        return ((217 + this.f3753a.hashCode()) * 31) + this.f3754b.hashCode();
    }
}
