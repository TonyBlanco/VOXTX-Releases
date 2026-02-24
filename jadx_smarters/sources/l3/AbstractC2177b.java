package l3;

import O2.C0897l1;
import O2.C0936z0;
import V2.C1056m;
import android.util.Pair;
import d3.AbstractC1675l;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.F;
import d4.M;
import d4.k0;
import e4.C1738a;
import e4.C1740c;
import e4.C1742e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l3.AbstractC2176a;
import q3.C2540a;
import r5.InterfaceC2677f;
import s5.AbstractC2743y;
import w3.C2907a;
import w3.C2911e;

/* JADX INFO: renamed from: l3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2177b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f43891a = k0.s0("OpusHead");

    /* JADX INFO: renamed from: l3.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f43895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f43896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final M f43897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final M f43898g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f43899h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f43900i;

        public a(M m9, M m10, boolean z9) throws C0897l1 {
            this.f43898g = m9;
            this.f43897f = m10;
            this.f43896e = z9;
            m10.U(12);
            this.f43892a = m10.L();
            m9.U(12);
            this.f43900i = m9.L();
            AbstractC1675l.a(m9.q() == 1, "first_chunk must be 1");
            this.f43893b = -1;
        }

        public boolean a() {
            int i9 = this.f43893b + 1;
            this.f43893b = i9;
            if (i9 == this.f43892a) {
                return false;
            }
            this.f43895d = this.f43896e ? this.f43897f.M() : this.f43897f.J();
            if (this.f43893b == this.f43899h) {
                this.f43894c = this.f43898g.L();
                this.f43898g.V(4);
                int i10 = this.f43900i - 1;
                this.f43900i = i10;
                this.f43899h = i10 > 0 ? this.f43898g.L() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l3.b$b, reason: collision with other inner class name */
    public static final class C0373b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f43902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f43903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f43904d;

        public C0373b(String str, byte[] bArr, long j9, long j10) {
            this.f43901a = str;
            this.f43902b = bArr;
            this.f43903c = j9;
            this.f43904d = j10;
        }
    }

    /* JADX INFO: renamed from: l3.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2540a f43905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f43906b;

        public c(C2540a c2540a, long j9) {
            this.f43905a = c2540a;
            this.f43906b = j9;
        }
    }

    /* JADX INFO: renamed from: l3.b$d */
    public interface d {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: renamed from: l3.b$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p[] f43907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C0936z0 f43908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43910d = 0;

        public e(int i9) {
            this.f43907a = new p[i9];
        }
    }

    /* JADX INFO: renamed from: l3.b$f */
    public static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final M f43913c;

        public f(AbstractC2176a.b bVar, C0936z0 c0936z0) {
            M m9 = bVar.f43890b;
            this.f43913c = m9;
            m9.U(12);
            int iL = m9.L();
            if ("audio/raw".equals(c0936z0.f6467m)) {
                int iJ0 = k0.j0(c0936z0.f6448B, c0936z0.f6480z);
                if (iL == 0 || iL % iJ0 != 0) {
                    AbstractC1681B.j("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iJ0 + ", stsz sample size: " + iL);
                    iL = iJ0;
                }
            }
            this.f43911a = iL == 0 ? -1 : iL;
            this.f43912b = m9.L();
        }

        @Override // l3.AbstractC2177b.d
        public int a() {
            int i9 = this.f43911a;
            return i9 == -1 ? this.f43913c.L() : i9;
        }

        @Override // l3.AbstractC2177b.d
        public int b() {
            return this.f43911a;
        }

        @Override // l3.AbstractC2177b.d
        public int c() {
            return this.f43912b;
        }
    }

    /* JADX INFO: renamed from: l3.b$g */
    public static final class g implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M f43914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43918e;

        public g(AbstractC2176a.b bVar) {
            M m9 = bVar.f43890b;
            this.f43914a = m9;
            m9.U(12);
            this.f43916c = m9.L() & 255;
            this.f43915b = m9.L();
        }

        @Override // l3.AbstractC2177b.d
        public int a() {
            int i9 = this.f43916c;
            if (i9 == 8) {
                return this.f43914a.H();
            }
            if (i9 == 16) {
                return this.f43914a.N();
            }
            int i10 = this.f43917d;
            this.f43917d = i10 + 1;
            if (i10 % 2 != 0) {
                return this.f43918e & 15;
            }
            int iH = this.f43914a.H();
            this.f43918e = iH;
            return (iH & 240) >> 4;
        }

        @Override // l3.AbstractC2177b.d
        public int b() {
            return -1;
        }

        @Override // l3.AbstractC2177b.d
        public int c() {
            return this.f43915b;
        }
    }

    /* JADX INFO: renamed from: l3.b$h */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f43920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43921c;

        public h(int i9, long j9, int i10) {
            this.f43919a = i9;
            this.f43920b = j9;
            this.f43921c = i10;
        }
    }

    /* JADX INFO: renamed from: l3.b$i */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2540a f43922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2540a f43923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2540a f43924c;

        public i(C2540a c2540a, C2540a c2540a2, C2540a c2540a3) {
            this.f43922a = c2540a;
            this.f43923b = c2540a2;
            this.f43924c = c2540a3;
        }
    }

    public static List A(AbstractC2176a.C0372a c0372a, d3.r rVar, long j9, C1056m c1056m, boolean z9, boolean z10, InterfaceC2677f interfaceC2677f) {
        C2190o c2190o;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < c0372a.f43889d.size(); i9++) {
            AbstractC2176a.C0372a c0372a2 = (AbstractC2176a.C0372a) c0372a.f43889d.get(i9);
            if (c0372a2.f43886a == 1953653099 && (c2190o = (C2190o) interfaceC2677f.apply(z(c0372a2, (AbstractC2176a.b) AbstractC1684a.e(c0372a.g(1836476516)), j9, c1056m, z9, z10))) != null) {
                arrayList.add(v(c2190o, (AbstractC2176a.C0372a) AbstractC1684a.e(((AbstractC2176a.C0372a) AbstractC1684a.e(((AbstractC2176a.C0372a) AbstractC1684a.e(c0372a2.f(1835297121))).f(1835626086))).f(1937007212)), rVar));
            }
        }
        return arrayList;
    }

    public static i B(AbstractC2176a.b bVar) {
        M m9 = bVar.f43890b;
        m9.U(8);
        C2540a c2540aC = null;
        C2540a c2540aU = null;
        C2540a c2540aE = null;
        while (m9.a() >= 8) {
            int iF = m9.f();
            int iQ = m9.q();
            int iQ2 = m9.q();
            if (iQ2 == 1835365473) {
                m9.U(iF);
                c2540aC = C(m9, iF + iQ);
            } else if (iQ2 == 1936553057) {
                m9.U(iF);
                c2540aU = u(m9, iF + iQ);
            } else if (iQ2 == -1451722374) {
                c2540aE = E(m9);
            }
            m9.U(iF + iQ);
        }
        return new i(c2540aC, c2540aU, c2540aE);
    }

    public static C2540a C(M m9, int i9) {
        m9.V(8);
        e(m9);
        while (m9.f() < i9) {
            int iF = m9.f();
            int iQ = m9.q();
            if (m9.q() == 1768715124) {
                m9.U(iF);
                return l(m9, iF + iQ);
            }
            m9.U(iF + iQ);
        }
        return null;
    }

    public static void D(M m9, int i9, int i10, int i11, int i12, int i13, C1056m c1056m, e eVar, int i14) throws C0897l1 {
        String str;
        C1056m c1056m2;
        int i15;
        int i16;
        float f9;
        List list;
        int i17;
        int i18;
        String str2;
        int i19;
        int i20;
        int i21;
        String str3;
        int i22 = i10;
        int i23 = i11;
        C1056m c1056mD = c1056m;
        e eVar2 = eVar;
        m9.U(i22 + 16);
        m9.V(16);
        int iN = m9.N();
        int iN2 = m9.N();
        m9.V(50);
        int iF = m9.f();
        int iIntValue = i9;
        if (iIntValue == 1701733238) {
            Pair pairS = s(m9, i22, i23);
            if (pairS != null) {
                iIntValue = ((Integer) pairS.first).intValue();
                c1056mD = c1056mD == null ? null : c1056mD.d(((p) pairS.second).f44043b);
                eVar2.f43907a[i14] = (p) pairS.second;
            }
            m9.U(iF);
        }
        String str4 = "video/3gpp";
        String str5 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fQ = 1.0f;
        String str6 = null;
        List listA = null;
        byte[] bArrR = null;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int iJ = -1;
        ByteBuffer byteBufferA = null;
        C0373b c0373bI = null;
        boolean z9 = false;
        while (iF - i22 < i23) {
            m9.U(iF);
            int iF2 = m9.f();
            int iQ = m9.q();
            if (iQ == 0) {
                str = str4;
                if (m9.f() - i22 == i23) {
                    break;
                }
            } else {
                str = str4;
            }
            AbstractC1675l.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = m9.q();
            if (iQ2 == 1635148611) {
                AbstractC1675l.a(str5 == null, null);
                m9.U(iF2 + 8);
                C1738a c1738aB = C1738a.b(m9);
                listA = c1738aB.f40182a;
                eVar2.f43909c = c1738aB.f40183b;
                if (!z9) {
                    fQ = c1738aB.f40189h;
                }
                str6 = c1738aB.f40190i;
                i19 = c1738aB.f40186e;
                i20 = c1738aB.f40187f;
                i21 = c1738aB.f40188g;
                str3 = "video/avc";
            } else if (iQ2 == 1752589123) {
                AbstractC1675l.a(str5 == null, null);
                m9.U(iF2 + 8);
                e4.g gVarA = e4.g.a(m9);
                listA = gVarA.f40259a;
                eVar2.f43909c = gVarA.f40260b;
                if (!z9) {
                    fQ = gVarA.f40266h;
                }
                str6 = gVarA.f40267i;
                i19 = gVarA.f40263e;
                i20 = gVarA.f40264f;
                i21 = gVarA.f40265g;
                str3 = "video/hevc";
            } else {
                if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                    c1056m2 = c1056mD;
                    i15 = iN2;
                    i16 = iIntValue;
                    f9 = fQ;
                    list = listA;
                    i17 = i25;
                    i18 = iJ;
                    C1742e c1742eA = C1742e.a(m9);
                    if (c1742eA != null) {
                        str6 = c1742eA.f40244c;
                        str5 = "video/dolby-vision";
                    }
                } else {
                    if (iQ2 == 1987076931) {
                        AbstractC1675l.a(str5 == null, null);
                        str2 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        m9.U(iF2 + 12);
                        m9.V(2);
                        boolean z10 = (m9.H() & 1) != 0;
                        int iH = m9.H();
                        int iH2 = m9.H();
                        i25 = C1740c.i(iH);
                        i26 = z10 ? 1 : 2;
                        iJ = C1740c.j(iH2);
                    } else if (iQ2 == 1635135811) {
                        AbstractC1675l.a(str5 == null, null);
                        str2 = "video/av01";
                    } else if (iQ2 == 1668050025) {
                        if (byteBufferA == null) {
                            byteBufferA = a();
                        }
                        ByteBuffer byteBuffer = byteBufferA;
                        byteBuffer.position(21);
                        byteBuffer.putShort(m9.D());
                        byteBuffer.putShort(m9.D());
                        byteBufferA = byteBuffer;
                        c1056m2 = c1056mD;
                        i15 = iN2;
                        i16 = iIntValue;
                        iF += iQ;
                        i22 = i10;
                        i23 = i11;
                        eVar2 = eVar;
                        str4 = str;
                        iIntValue = i16;
                        c1056mD = c1056m2;
                        iN2 = i15;
                    } else if (iQ2 == 1835295606) {
                        if (byteBufferA == null) {
                            byteBufferA = a();
                        }
                        ByteBuffer byteBuffer2 = byteBufferA;
                        short sD = m9.D();
                        short sD2 = m9.D();
                        short sD3 = m9.D();
                        i16 = iIntValue;
                        short sD4 = m9.D();
                        short sD5 = m9.D();
                        c1056m2 = c1056mD;
                        short sD6 = m9.D();
                        List list2 = listA;
                        short sD7 = m9.D();
                        float f10 = fQ;
                        short sD8 = m9.D();
                        long J9 = m9.J();
                        long J10 = m9.J();
                        i15 = iN2;
                        byteBuffer2.position(1);
                        byteBuffer2.putShort(sD5);
                        byteBuffer2.putShort(sD6);
                        byteBuffer2.putShort(sD);
                        byteBuffer2.putShort(sD2);
                        byteBuffer2.putShort(sD3);
                        byteBuffer2.putShort(sD4);
                        byteBuffer2.putShort(sD7);
                        byteBuffer2.putShort(sD8);
                        byteBuffer2.putShort((short) (J9 / 10000));
                        byteBuffer2.putShort((short) (J10 / 10000));
                        byteBufferA = byteBuffer2;
                        listA = list2;
                        fQ = f10;
                        iF += iQ;
                        i22 = i10;
                        i23 = i11;
                        eVar2 = eVar;
                        str4 = str;
                        iIntValue = i16;
                        c1056mD = c1056m2;
                        iN2 = i15;
                    } else {
                        c1056m2 = c1056mD;
                        i15 = iN2;
                        i16 = iIntValue;
                        f9 = fQ;
                        list = listA;
                        if (iQ2 == 1681012275) {
                            AbstractC1675l.a(str5 == null, null);
                            str5 = str;
                        } else if (iQ2 == 1702061171) {
                            AbstractC1675l.a(str5 == null, null);
                            c0373bI = i(m9, iF2);
                            String str7 = c0373bI.f43901a;
                            byte[] bArr = c0373bI.f43902b;
                            listA = bArr != null ? AbstractC2743y.A(bArr) : list;
                            str5 = str7;
                            fQ = f9;
                            iF += iQ;
                            i22 = i10;
                            i23 = i11;
                            eVar2 = eVar;
                            str4 = str;
                            iIntValue = i16;
                            c1056mD = c1056m2;
                            iN2 = i15;
                        } else if (iQ2 == 1885434736) {
                            fQ = q(m9, iF2);
                            listA = list;
                            z9 = true;
                            iF += iQ;
                            i22 = i10;
                            i23 = i11;
                            eVar2 = eVar;
                            str4 = str;
                            iIntValue = i16;
                            c1056mD = c1056m2;
                            iN2 = i15;
                        } else if (iQ2 == 1937126244) {
                            bArrR = r(m9, iF2, iQ);
                        } else if (iQ2 == 1936995172) {
                            int iH3 = m9.H();
                            m9.V(3);
                            if (iH3 == 0) {
                                int iH4 = m9.H();
                                if (iH4 == 0) {
                                    i24 = 0;
                                } else if (iH4 == 1) {
                                    i24 = 1;
                                } else if (iH4 == 2) {
                                    i24 = 2;
                                } else if (iH4 == 3) {
                                    i24 = 3;
                                }
                            }
                        } else {
                            i17 = i25;
                            if (iQ2 == 1668246642) {
                                i18 = iJ;
                                if (i17 == -1 && i18 == -1) {
                                    int iQ3 = m9.q();
                                    if (iQ3 == 1852009592 || iQ3 == 1852009571) {
                                        int iN3 = m9.N();
                                        int iN4 = m9.N();
                                        m9.V(2);
                                        boolean z11 = iQ == 19 && (m9.H() & 128) != 0;
                                        i25 = C1740c.i(iN3);
                                        i26 = z11 ? 1 : 2;
                                        iJ = C1740c.j(iN4);
                                    } else {
                                        AbstractC1681B.j("AtomParsers", "Unsupported color type: " + AbstractC2176a.a(iQ3));
                                    }
                                }
                                iF += iQ;
                                i22 = i10;
                                i23 = i11;
                                eVar2 = eVar;
                                str4 = str;
                                iIntValue = i16;
                                c1056mD = c1056m2;
                                iN2 = i15;
                            } else {
                                i18 = iJ;
                            }
                        }
                        listA = list;
                        fQ = f9;
                        iF += iQ;
                        i22 = i10;
                        i23 = i11;
                        eVar2 = eVar;
                        str4 = str;
                        iIntValue = i16;
                        c1056mD = c1056m2;
                        iN2 = i15;
                    }
                    str5 = str2;
                    c1056m2 = c1056mD;
                    i15 = iN2;
                    i16 = iIntValue;
                    iF += iQ;
                    i22 = i10;
                    i23 = i11;
                    eVar2 = eVar;
                    str4 = str;
                    iIntValue = i16;
                    c1056mD = c1056m2;
                    iN2 = i15;
                }
                iJ = i18;
                i25 = i17;
                listA = list;
                fQ = f9;
                iF += iQ;
                i22 = i10;
                i23 = i11;
                eVar2 = eVar;
                str4 = str;
                iIntValue = i16;
                c1056mD = c1056m2;
                iN2 = i15;
            }
            iJ = i21;
            c1056m2 = c1056mD;
            i15 = iN2;
            i25 = i19;
            i16 = iIntValue;
            i26 = i20;
            str5 = str3;
            iF += iQ;
            i22 = i10;
            i23 = i11;
            eVar2 = eVar;
            str4 = str;
            iIntValue = i16;
            c1056mD = c1056m2;
            iN2 = i15;
        }
        C1056m c1056m3 = c1056mD;
        int i27 = iN2;
        float f11 = fQ;
        List list3 = listA;
        int i28 = i25;
        int i29 = iJ;
        if (str5 == null) {
            return;
        }
        C0936z0.b bVarO = new C0936z0.b().T(i12).g0(str5).K(str6).n0(iN).S(i27).c0(f11).f0(i13).d0(bArrR).j0(i24).V(list3).O(c1056m3);
        int i30 = i26;
        if (i28 != -1 || i30 != -1 || i29 != -1 || byteBufferA != null) {
            bVarO.L(new C1740c(i28, i30, i29, byteBufferA != null ? byteBufferA.array() : null));
        }
        if (c0373bI != null) {
            bVarO.I(w5.f.k(c0373bI.f43903c)).b0(w5.f.k(c0373bI.f43904d));
        }
        eVar.f43908b = bVarO.G();
    }

    public static C2540a E(M m9) {
        short sD = m9.D();
        m9.V(2);
        String strE = m9.E(sD);
        int iMax = Math.max(strE.lastIndexOf(43), strE.lastIndexOf(45));
        try {
            return new C2540a(new R2.b(Float.parseFloat(strE.substring(0, iMax)), Float.parseFloat(strE.substring(iMax, strE.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j9, long j10, long j11) {
        int length = jArr.length - 1;
        return jArr[0] <= j10 && j10 < jArr[k0.r(4, 0, length)] && jArr[k0.r(jArr.length - 4, 0, length)] < j11 && j11 <= j9;
    }

    public static int c(M m9, int i9, int i10, int i11) throws C0897l1 {
        int iF = m9.f();
        AbstractC1675l.a(iF >= i10, null);
        while (iF - i10 < i11) {
            m9.U(iF);
            int iQ = m9.q();
            AbstractC1675l.a(iQ > 0, "childAtomSize must be positive");
            if (m9.q() == i9) {
                return iF;
            }
            iF += iQ;
        }
        return -1;
    }

    public static int d(int i9) {
        if (i9 == 1936684398) {
            return 1;
        }
        if (i9 == 1986618469) {
            return 2;
        }
        if (i9 == 1952807028 || i9 == 1935832172 || i9 == 1937072756 || i9 == 1668047728) {
            return 3;
        }
        return i9 == 1835365473 ? 5 : -1;
    }

    public static void e(M m9) {
        int iF = m9.f();
        m9.V(4);
        if (m9.q() != 1751411826) {
            iF += 4;
        }
        m9.U(iF);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(d4.M r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, V2.C1056m r29, l3.AbstractC2177b.e r30, int r31) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.AbstractC2177b.f(d4.M, int, int, int, int, java.lang.String, boolean, V2.m, l3.b$e, int):void");
    }

    public static Pair g(M m9, int i9, int i10) throws C0897l1 {
        int i11 = i9 + 8;
        String strE = null;
        Integer numValueOf = null;
        int i12 = -1;
        int i13 = 0;
        while (i11 - i9 < i10) {
            m9.U(i11);
            int iQ = m9.q();
            int iQ2 = m9.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(m9.q());
            } else if (iQ2 == 1935894637) {
                m9.V(4);
                strE = m9.E(4);
            } else if (iQ2 == 1935894633) {
                i12 = i11;
                i13 = iQ;
            }
            i11 += iQ;
        }
        if (!"cenc".equals(strE) && !"cbc1".equals(strE) && !"cens".equals(strE) && !"cbcs".equals(strE)) {
            return null;
        }
        AbstractC1675l.a(numValueOf != null, "frma atom is mandatory");
        AbstractC1675l.a(i12 != -1, "schi atom is mandatory");
        p pVarT = t(m9, i12, i13, strE);
        AbstractC1675l.a(pVarT != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (p) k0.j(pVarT));
    }

    public static Pair h(AbstractC2176a.C0372a c0372a) {
        AbstractC2176a.b bVarG = c0372a.g(1701606260);
        if (bVarG == null) {
            return null;
        }
        M m9 = bVarG.f43890b;
        m9.U(8);
        int iC = AbstractC2176a.c(m9.q());
        int iL = m9.L();
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        for (int i9 = 0; i9 < iL; i9++) {
            jArr[i9] = iC == 1 ? m9.M() : m9.J();
            jArr2[i9] = iC == 1 ? m9.A() : m9.q();
            if (m9.D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            m9.V(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static C0373b i(M m9, int i9) {
        m9.U(i9 + 12);
        m9.V(1);
        j(m9);
        m9.V(2);
        int iH = m9.H();
        if ((iH & 128) != 0) {
            m9.V(2);
        }
        if ((iH & 64) != 0) {
            m9.V(m9.H());
        }
        if ((iH & 32) != 0) {
            m9.V(2);
        }
        m9.V(1);
        j(m9);
        String strH = F.h(m9.H());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new C0373b(strH, null, -1L, -1L);
        }
        m9.V(4);
        long J9 = m9.J();
        long J10 = m9.J();
        m9.V(1);
        int iJ = j(m9);
        byte[] bArr = new byte[iJ];
        m9.l(bArr, 0, iJ);
        return new C0373b(strH, bArr, J10 > 0 ? J10 : -1L, J9 > 0 ? J9 : -1L);
    }

    public static int j(M m9) {
        int iH = m9.H();
        int i9 = iH & 127;
        while ((iH & 128) == 128) {
            iH = m9.H();
            i9 = (i9 << 7) | (iH & 127);
        }
        return i9;
    }

    public static int k(M m9) {
        m9.U(16);
        return m9.q();
    }

    public static C2540a l(M m9, int i9) {
        m9.V(8);
        ArrayList arrayList = new ArrayList();
        while (m9.f() < i9) {
            C2540a.b bVarC = AbstractC2183h.c(m9);
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2540a(arrayList);
    }

    public static Pair m(M m9) {
        m9.U(8);
        int iC = AbstractC2176a.c(m9.q());
        m9.V(iC == 0 ? 8 : 16);
        long J9 = m9.J();
        m9.V(iC == 0 ? 4 : 8);
        int iN = m9.N();
        return Pair.create(Long.valueOf(J9), "" + ((char) (((iN >> 10) & 31) + 96)) + ((char) (((iN >> 5) & 31) + 96)) + ((char) ((iN & 31) + 96)));
    }

    public static C2540a n(AbstractC2176a.C0372a c0372a) {
        AbstractC2176a.b bVarG = c0372a.g(1751411826);
        AbstractC2176a.b bVarG2 = c0372a.g(1801812339);
        AbstractC2176a.b bVarG3 = c0372a.g(1768715124);
        if (bVarG == null || bVarG2 == null || bVarG3 == null || k(bVarG.f43890b) != 1835299937) {
            return null;
        }
        M m9 = bVarG2.f43890b;
        m9.U(12);
        int iQ = m9.q();
        String[] strArr = new String[iQ];
        for (int i9 = 0; i9 < iQ; i9++) {
            int iQ2 = m9.q();
            m9.V(4);
            strArr[i9] = m9.E(iQ2 - 8);
        }
        M m10 = bVarG3.f43890b;
        m10.U(8);
        ArrayList arrayList = new ArrayList();
        while (m10.a() > 8) {
            int iF = m10.f();
            int iQ3 = m10.q();
            int iQ4 = m10.q() - 1;
            if (iQ4 < 0 || iQ4 >= iQ) {
                AbstractC1681B.j("AtomParsers", "Skipped metadata with unknown key index: " + iQ4);
            } else {
                C2907a c2907aF = AbstractC2183h.f(m10, iF + iQ3, strArr[iQ4]);
                if (c2907aF != null) {
                    arrayList.add(c2907aF);
                }
            }
            m10.U(iF + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2540a(arrayList);
    }

    public static void o(M m9, int i9, int i10, int i11, e eVar) {
        m9.U(i10 + 16);
        if (i9 == 1835365492) {
            m9.B();
            String strB = m9.B();
            if (strB != null) {
                eVar.f43908b = new C0936z0.b().T(i11).g0(strB).G();
            }
        }
    }

    public static c p(M m9) {
        long J9;
        m9.U(8);
        if (AbstractC2176a.c(m9.q()) == 0) {
            J9 = m9.J();
            m9.V(4);
        } else {
            long jA = m9.A();
            m9.V(8);
            J9 = jA;
        }
        return new c(new C2540a(new R2.a((J9 - ((long) 2082844800)) * 1000)), m9.J());
    }

    public static float q(M m9, int i9) {
        m9.U(i9 + 8);
        return m9.L() / m9.L();
    }

    public static byte[] r(M m9, int i9, int i10) {
        int i11 = i9 + 8;
        while (i11 - i9 < i10) {
            m9.U(i11);
            int iQ = m9.q();
            if (m9.q() == 1886547818) {
                return Arrays.copyOfRange(m9.e(), i11, iQ + i11);
            }
            i11 += iQ;
        }
        return null;
    }

    public static Pair s(M m9, int i9, int i10) throws C0897l1 {
        Pair pairG;
        int iF = m9.f();
        while (iF - i9 < i10) {
            m9.U(iF);
            int iQ = m9.q();
            AbstractC1675l.a(iQ > 0, "childAtomSize must be positive");
            if (m9.q() == 1936289382 && (pairG = g(m9, iF, iQ)) != null) {
                return pairG;
            }
            iF += iQ;
        }
        return null;
    }

    public static p t(M m9, int i9, int i10, String str) {
        int i11;
        int i12;
        int i13 = i9 + 8;
        while (true) {
            byte[] bArr = null;
            if (i13 - i9 >= i10) {
                return null;
            }
            m9.U(i13);
            int iQ = m9.q();
            if (m9.q() == 1952804451) {
                int iC = AbstractC2176a.c(m9.q());
                m9.V(1);
                if (iC == 0) {
                    m9.V(1);
                    i12 = 0;
                    i11 = 0;
                } else {
                    int iH = m9.H();
                    i11 = iH & 15;
                    i12 = (iH & 240) >> 4;
                }
                boolean z9 = m9.H() == 1;
                int iH2 = m9.H();
                byte[] bArr2 = new byte[16];
                m9.l(bArr2, 0, 16);
                if (z9 && iH2 == 0) {
                    int iH3 = m9.H();
                    bArr = new byte[iH3];
                    m9.l(bArr, 0, iH3);
                }
                return new p(z9, str, iH2, bArr2, i12, i11, bArr);
            }
            i13 += iQ;
        }
    }

    public static C2540a u(M m9, int i9) {
        m9.V(12);
        while (m9.f() < i9) {
            int iF = m9.f();
            int iQ = m9.q();
            if (m9.q() == 1935766900) {
                if (iQ < 14) {
                    return null;
                }
                m9.V(5);
                int iH = m9.H();
                if (iH != 12 && iH != 13) {
                    return null;
                }
                float f9 = iH == 12 ? 240.0f : 120.0f;
                m9.V(1);
                return new C2540a(new C2911e(f9, m9.H()));
            }
            m9.U(iF + iQ);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0428 A[EDGE_INSN: B:212:0x0428->B:171:0x0428 BREAK  A[LOOP:2: B:154:0x03c7->B:170:0x0421], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l3.r v(l3.C2190o r38, l3.AbstractC2176a.C0372a r39, d3.r r40) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.AbstractC2177b.v(l3.o, l3.a$a, d3.r):l3.r");
    }

    public static e w(M m9, int i9, int i10, String str, C1056m c1056m, boolean z9) throws C0897l1 {
        int i11;
        m9.U(12);
        int iQ = m9.q();
        e eVar = new e(iQ);
        for (int i12 = 0; i12 < iQ; i12++) {
            int iF = m9.f();
            int iQ2 = m9.q();
            AbstractC1675l.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = m9.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521) {
                i11 = iF;
                D(m9, iQ3, i11, iQ2, i9, i10, c1056m, eVar, i12);
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1835823201 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667) {
                i11 = iF;
                f(m9, iQ3, iF, iQ2, i9, str, z9, c1056m, eVar, i12);
            } else {
                if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                    x(m9, iQ3, iF, iQ2, i9, str, eVar);
                } else if (iQ3 == 1835365492) {
                    o(m9, iQ3, iF, i9, eVar);
                } else if (iQ3 == 1667329389) {
                    eVar.f43908b = new C0936z0.b().T(i9).g0("application/x-camera-motion").G();
                }
                i11 = iF;
            }
            m9.U(i11 + iQ2);
        }
        return eVar;
    }

    public static void x(M m9, int i9, int i10, int i11, int i12, String str, e eVar) {
        m9.U(i10 + 16);
        String str2 = "application/ttml+xml";
        AbstractC2743y abstractC2743yA = null;
        long j9 = Long.MAX_VALUE;
        if (i9 != 1414810956) {
            if (i9 == 1954034535) {
                int i13 = i11 - 16;
                byte[] bArr = new byte[i13];
                m9.l(bArr, 0, i13);
                abstractC2743yA = AbstractC2743y.A(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i9 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i9 == 1937010800) {
                j9 = 0;
            } else {
                if (i9 != 1664495672) {
                    throw new IllegalStateException();
                }
                eVar.f43910d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        eVar.f43908b = new C0936z0.b().T(i12).g0(str2).X(str).k0(j9).V(abstractC2743yA).G();
    }

    public static h y(M m9) {
        long j9;
        m9.U(8);
        int iC = AbstractC2176a.c(m9.q());
        m9.V(iC == 0 ? 8 : 16);
        int iQ = m9.q();
        m9.V(4);
        int iF = m9.f();
        int i9 = iC == 0 ? 4 : 8;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            j9 = -9223372036854775807L;
            if (i11 >= i9) {
                m9.V(i9);
                break;
            }
            if (m9.e()[iF + i11] != -1) {
                long J9 = iC == 0 ? m9.J() : m9.M();
                if (J9 != 0) {
                    j9 = J9;
                }
            } else {
                i11++;
            }
        }
        m9.V(16);
        int iQ2 = m9.q();
        int iQ3 = m9.q();
        m9.V(4);
        int iQ4 = m9.q();
        int iQ5 = m9.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i10 = 90;
        } else if (iQ2 == 0 && iQ3 == -65536 && iQ4 == 65536 && iQ5 == 0) {
            i10 = 270;
        } else if (iQ2 == -65536 && iQ3 == 0 && iQ4 == 0 && iQ5 == -65536) {
            i10 = 180;
        }
        return new h(iQ, j9, i10);
    }

    public static C2190o z(AbstractC2176a.C0372a c0372a, AbstractC2176a.b bVar, long j9, C1056m c1056m, boolean z9, boolean z10) throws C0897l1 {
        AbstractC2176a.b bVar2;
        long j10;
        long[] jArr;
        long[] jArr2;
        AbstractC2176a.C0372a c0372aF;
        Pair pairH;
        AbstractC2176a.C0372a c0372a2 = (AbstractC2176a.C0372a) AbstractC1684a.e(c0372a.f(1835297121));
        int iD = d(k(((AbstractC2176a.b) AbstractC1684a.e(c0372a2.g(1751411826))).f43890b));
        if (iD == -1) {
            return null;
        }
        h hVarY = y(((AbstractC2176a.b) AbstractC1684a.e(c0372a.g(1953196132))).f43890b);
        if (j9 == -9223372036854775807L) {
            bVar2 = bVar;
            j10 = hVarY.f43920b;
        } else {
            bVar2 = bVar;
            j10 = j9;
        }
        long j11 = p(bVar2.f43890b).f43906b;
        long jC1 = j10 != -9223372036854775807L ? k0.c1(j10, 1000000L, j11) : -9223372036854775807L;
        AbstractC2176a.C0372a c0372a3 = (AbstractC2176a.C0372a) AbstractC1684a.e(((AbstractC2176a.C0372a) AbstractC1684a.e(c0372a2.f(1835626086))).f(1937007212));
        Pair pairM = m(((AbstractC2176a.b) AbstractC1684a.e(c0372a2.g(1835296868))).f43890b);
        AbstractC2176a.b bVarG = c0372a3.g(1937011556);
        if (bVarG == null) {
            throw C0897l1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        e eVarW = w(bVarG.f43890b, hVarY.f43919a, hVarY.f43921c, (String) pairM.second, c1056m, z10);
        if (z9 || (c0372aF = c0372a.f(1701082227)) == null || (pairH = h(c0372aF)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairH.first;
            jArr2 = (long[]) pairH.second;
            jArr = jArr3;
        }
        if (eVarW.f43908b == null) {
            return null;
        }
        return new C2190o(hVarY.f43919a, iD, ((Long) pairM.first).longValue(), j11, jC1, eVarW.f43908b, eVarW.f43910d, eVarW.f43907a, eVarW.f43909c, jArr, jArr2);
    }
}
