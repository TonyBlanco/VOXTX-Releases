package v3;

import d4.AbstractC1681B;
import d4.L;
import d4.M;
import d4.k0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import q3.C2540a;
import q3.C2544e;
import r5.AbstractC2673b;
import r5.AbstractC2675d;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends q3.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f51311b = new a() { // from class: v3.g
        @Override // v3.h.a
        public final boolean a(int i9, int i10, int i11, int i12, int i13) {
            return h.A(i9, i10, i11, i12, i13);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f51312a;

    public interface a {
        boolean a(int i9, int i10, int i11, int i12, int i13);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f51314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51315c;

        public b(int i9, boolean z9, int i10) {
            this.f51313a = i9;
            this.f51314b = z9;
            this.f51315c = i10;
        }
    }

    public h() {
        this(null);
    }

    public h(a aVar) {
        this.f51312a = aVar;
    }

    public static /* synthetic */ boolean A(int i9, int i10, int i11, int i12, int i13) {
        return false;
    }

    public static int B(M m9, int i9) {
        byte[] bArrE = m9.e();
        int iF = m9.f();
        int i10 = iF;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= iF + i9) {
                return i9;
            }
            if ((bArrE[i10] & 255) == 255 && bArrE[i11] == 0) {
                System.arraycopy(bArrE, i10 + 2, bArrE, i11, (i9 - (i10 - iF)) - 2);
                i9--;
            }
            i10 = i11;
        }
    }

    public static boolean C(M m9, int i9, int i10, boolean z9) {
        int iK;
        long jK;
        int iN;
        int i11;
        int iF = m9.f();
        while (true) {
            try {
                boolean z10 = true;
                if (m9.a() < i10) {
                    m9.U(iF);
                    return true;
                }
                if (i9 >= 3) {
                    iK = m9.q();
                    jK = m9.J();
                    iN = m9.N();
                } else {
                    iK = m9.K();
                    jK = m9.K();
                    iN = 0;
                }
                if (iK == 0 && jK == 0 && iN == 0) {
                    m9.U(iF);
                    return true;
                }
                if (i9 == 4 && !z9) {
                    if ((8421504 & jK) != 0) {
                        m9.U(iF);
                        return false;
                    }
                    jK = (((jK >> 24) & 255) << 21) | (jK & 255) | (((jK >> 8) & 255) << 7) | (((jK >> 16) & 255) << 14);
                }
                if (i9 == 4) {
                    i11 = (iN & 64) != 0 ? 1 : 0;
                    if ((iN & 1) == 0) {
                        z10 = false;
                    }
                } else {
                    if (i9 == 3) {
                        i11 = (iN & 32) != 0 ? 1 : 0;
                        if ((iN & 128) == 0) {
                        }
                    } else {
                        i11 = 0;
                    }
                    z10 = false;
                }
                if (z10) {
                    i11 += 4;
                }
                if (jK < i11) {
                    m9.U(iF);
                    return false;
                }
                if (m9.a() < jK) {
                    m9.U(iF);
                    return false;
                }
                m9.V((int) jK);
            } catch (Throwable th) {
                m9.U(iF);
                throw th;
            }
        }
    }

    public static byte[] d(byte[] bArr, int i9, int i10) {
        return i10 <= i9 ? k0.f39782f : Arrays.copyOfRange(bArr, i9, i10);
    }

    public static C2874a f(M m9, int i9, int i10) {
        int iZ;
        String str;
        int iH = m9.H();
        Charset charsetW = w(iH);
        int i11 = i9 - 1;
        byte[] bArr = new byte[i11];
        m9.l(bArr, 0, i11);
        if (i10 == 2) {
            str = "image/" + AbstractC2673b.e(new String(bArr, 0, 3, AbstractC2675d.f49723b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = AbstractC2673b.e(new String(bArr, 0, iZ, AbstractC2675d.f49723b));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i12 = bArr[iZ + 1] & 255;
        int i13 = iZ + 2;
        int iY = y(bArr, i13, iH);
        return new C2874a(str, new String(bArr, i13, iY - i13, charsetW), i12, d(bArr, iY + v(iH), i11));
    }

    public static C2875b g(M m9, int i9, String str) {
        byte[] bArr = new byte[i9];
        m9.l(bArr, 0, i9);
        return new C2875b(str, bArr);
    }

    public static c h(M m9, int i9, int i10, boolean z9, int i11, a aVar) {
        int iF = m9.f();
        int iZ = z(m9.e(), iF);
        String str = new String(m9.e(), iF, iZ - iF, AbstractC2675d.f49723b);
        m9.U(iZ + 1);
        int iQ = m9.q();
        int iQ2 = m9.q();
        long J9 = m9.J();
        long j9 = J9 == 4294967295L ? -1L : J9;
        long J10 = m9.J();
        long j10 = J10 == 4294967295L ? -1L : J10;
        ArrayList arrayList = new ArrayList();
        int i12 = iF + i9;
        while (m9.f() < i12) {
            i iVarK = k(i10, m9, z9, i11, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iQ, iQ2, j9, j10, (i[]) arrayList.toArray(new i[0]));
    }

    public static d i(M m9, int i9, int i10, boolean z9, int i11, a aVar) {
        int iF = m9.f();
        int iZ = z(m9.e(), iF);
        String str = new String(m9.e(), iF, iZ - iF, AbstractC2675d.f49723b);
        m9.U(iZ + 1);
        int iH = m9.H();
        boolean z10 = (iH & 2) != 0;
        boolean z11 = (iH & 1) != 0;
        int iH2 = m9.H();
        String[] strArr = new String[iH2];
        for (int i12 = 0; i12 < iH2; i12++) {
            int iF2 = m9.f();
            int iZ2 = z(m9.e(), iF2);
            strArr[i12] = new String(m9.e(), iF2, iZ2 - iF2, AbstractC2675d.f49723b);
            m9.U(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = iF + i9;
        while (m9.f() < i13) {
            i iVarK = k(i10, m9, z9, i11, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z10, z11, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e j(M m9, int i9) {
        if (i9 < 4) {
            return null;
        }
        int iH = m9.H();
        Charset charsetW = w(iH);
        byte[] bArr = new byte[3];
        m9.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i9 - 4;
        byte[] bArr2 = new byte[i10];
        m9.l(bArr2, 0, i10);
        int iY = y(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iH);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iH), charsetW));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ea A[Catch: all -> 0x0122, TryCatch #0 {all -> 0x0122, blocks: (B:91:0x011c, B:159:0x01f4, B:95:0x0127, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:166:0x0112 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v3.i k(int r19, d4.M r20, boolean r21, int r22, v3.h.a r23) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.h.k(int, d4.M, boolean, int, v3.h$a):v3.i");
    }

    public static f l(M m9, int i9) {
        int iH = m9.H();
        Charset charsetW = w(iH);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        m9.l(bArr, 0, i10);
        int iZ = z(bArr, 0);
        String str = new String(bArr, 0, iZ, AbstractC2675d.f49723b);
        int i11 = iZ + 1;
        int iY = y(bArr, i11, iH);
        String strP = p(bArr, i11, iY, charsetW);
        int iV = iY + v(iH);
        int iY2 = y(bArr, iV, iH);
        return new f(str, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iH), i10));
    }

    public static b m(M m9) {
        StringBuilder sb;
        String string;
        boolean z9 = false;
        if (m9.a() < 10) {
            string = "Data too short to be an ID3 tag";
        } else {
            int iK = m9.K();
            if (iK == 4801587) {
                int iH = m9.H();
                m9.V(1);
                int iH2 = m9.H();
                int iG = m9.G();
                if (iH == 2) {
                    if ((iH2 & 64) != 0) {
                        string = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (iH == 3) {
                    if ((iH2 & 64) != 0) {
                        int iQ = m9.q();
                        m9.V(iQ);
                        iG -= iQ + 4;
                    }
                } else if (iH == 4) {
                    if ((iH2 & 64) != 0) {
                        int iG2 = m9.G();
                        m9.V(iG2 - 4);
                        iG -= iG2;
                    }
                    if ((iH2 & 16) != 0) {
                        iG -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb.append(iH);
                }
                if (iH < 4 && (iH2 & 128) != 0) {
                    z9 = true;
                }
                return new b(iH, z9, iG);
            }
            sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb.append(String.format("%06X", Integer.valueOf(iK)));
            string = sb.toString();
        }
        AbstractC1681B.j("Id3Decoder", string);
        return null;
    }

    public static k n(M m9, int i9) {
        int iN = m9.N();
        int iK = m9.K();
        int iK2 = m9.K();
        int iH = m9.H();
        int iH2 = m9.H();
        L l9 = new L();
        l9.m(m9);
        int i10 = ((i9 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH3 = l9.h(iH);
            int iH4 = l9.h(iH2);
            iArr[i11] = iH3;
            iArr2[i11] = iH4;
        }
        return new k(iN, iK, iK2, iArr, iArr2);
    }

    public static l o(M m9, int i9) {
        byte[] bArr = new byte[i9];
        m9.l(bArr, 0, i9);
        int iZ = z(bArr, 0);
        return new l(new String(bArr, 0, iZ, AbstractC2675d.f49723b), d(bArr, iZ + 1, i9));
    }

    public static String p(byte[] bArr, int i9, int i10, Charset charset) {
        return (i10 <= i9 || i10 > bArr.length) ? "" : new String(bArr, i9, i10 - i9, charset);
    }

    public static m q(M m9, int i9, String str) {
        if (i9 < 1) {
            return null;
        }
        int iH = m9.H();
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        m9.l(bArr, 0, i10);
        return new m(str, null, r(bArr, iH, 0));
    }

    public static AbstractC2743y r(byte[] bArr, int i9, int i10) {
        if (i10 >= bArr.length) {
            return AbstractC2743y.A("");
        }
        AbstractC2743y.a aVarP = AbstractC2743y.p();
        while (true) {
            int iY = y(bArr, i10, i9);
            if (i10 >= iY) {
                break;
            }
            aVarP.a(new String(bArr, i10, iY - i10, w(i9)));
            i10 = v(i9) + iY;
        }
        AbstractC2743y abstractC2743yK = aVarP.k();
        return abstractC2743yK.isEmpty() ? AbstractC2743y.A("") : abstractC2743yK;
    }

    public static m s(M m9, int i9) {
        if (i9 < 1) {
            return null;
        }
        int iH = m9.H();
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        m9.l(bArr, 0, i10);
        int iY = y(bArr, 0, iH);
        return new m("TXXX", new String(bArr, 0, iY, w(iH)), r(bArr, iH, iY + v(iH)));
    }

    public static n t(M m9, int i9, String str) {
        byte[] bArr = new byte[i9];
        m9.l(bArr, 0, i9);
        return new n(str, null, new String(bArr, 0, z(bArr, 0), AbstractC2675d.f49723b));
    }

    public static n u(M m9, int i9) {
        if (i9 < 1) {
            return null;
        }
        int iH = m9.H();
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        m9.l(bArr, 0, i10);
        int iY = y(bArr, 0, iH);
        String str = new String(bArr, 0, iY, w(iH));
        int iV = iY + v(iH);
        return new n("WXXX", str, p(bArr, iV, z(bArr, iV), AbstractC2675d.f49723b));
    }

    public static int v(int i9) {
        return (i9 == 0 || i9 == 3) ? 1 : 2;
    }

    public static Charset w(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? AbstractC2675d.f49723b : AbstractC2675d.f49724c : AbstractC2675d.f49725d : AbstractC2675d.f49727f;
    }

    public static String x(int i9, int i10, int i11, int i12, int i13) {
        return i9 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int y(byte[] bArr, int i9, int i10) {
        int iZ = z(bArr, i9);
        if (i10 == 0 || i10 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i9) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    public static int z(byte[] bArr, int i9) {
        while (i9 < bArr.length) {
            if (bArr[i9] == 0) {
                return i9;
            }
            i9++;
        }
        return bArr.length;
    }

    @Override // q3.h
    public C2540a b(C2544e c2544e, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public C2540a e(byte[] bArr, int i9) {
        ArrayList arrayList = new ArrayList();
        M m9 = new M(bArr, i9);
        b bVarM = m(m9);
        if (bVarM == null) {
            return null;
        }
        int iF = m9.f();
        int i10 = bVarM.f51313a == 2 ? 6 : 10;
        int iB = bVarM.f51315c;
        if (bVarM.f51314b) {
            iB = B(m9, bVarM.f51315c);
        }
        m9.T(iF + iB);
        boolean z9 = false;
        if (!C(m9, bVarM.f51313a, i10, false)) {
            if (bVarM.f51313a != 4 || !C(m9, 4, i10, true)) {
                AbstractC1681B.j("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f51313a);
                return null;
            }
            z9 = true;
        }
        while (m9.a() >= i10) {
            i iVarK = k(bVarM.f51313a, m9, z9, i10, this.f51312a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new C2540a(arrayList);
    }
}
