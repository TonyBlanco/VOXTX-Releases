package com.google.android.exoplayer2.extractor;

import O2.C0897l1;
import android.util.Base64;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d3.y;
import d4.AbstractC1681B;
import d4.M;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q3.C2540a;
import y3.C2984a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f25427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25428c;

        public a(String str, String[] strArr, int i9) {
            this.f25426a = str;
            this.f25427b = strArr;
            this.f25428c = i9;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f25429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f25432d;

        public b(boolean z9, int i9, int i10, int i11) {
            this.f25429a = z9;
            this.f25430b = i9;
            this.f25431c = i10;
            this.f25432d = i11;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f25436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f25437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f25438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f25439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f25440h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f25441i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f25442j;

        public c(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9, byte[] bArr) {
            this.f25433a = i9;
            this.f25434b = i10;
            this.f25435c = i11;
            this.f25436d = i12;
            this.f25437e = i13;
            this.f25438f = i14;
            this.f25439g = i15;
            this.f25440h = i16;
            this.f25441i = z9;
            this.f25442j = bArr;
        }
    }

    public static int a(int i9) {
        int i10 = 0;
        while (i9 > 0) {
            i10++;
            i9 >>>= 1;
        }
        return i10;
    }

    public static long b(long j9, long j10) {
        return (long) Math.floor(Math.pow(j9, 1.0d / j10));
    }

    public static C2540a c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = (String) list.get(i9);
            String[] strArrJ1 = k0.j1(str, "=");
            if (strArrJ1.length != 2) {
                AbstractC1681B.j("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrJ1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new M(Base64.decode(strArrJ1[1], 0))));
                } catch (RuntimeException e9) {
                    AbstractC1681B.k("VorbisUtil", "Failed to parse vorbis picture", e9);
                }
            } else {
                arrayList.add(new C2984a(strArrJ1[0], strArrJ1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2540a(arrayList);
    }

    public static void d(y yVar) throws C0897l1 {
        int iD = yVar.d(6) + 1;
        for (int i9 = 0; i9 < iD; i9++) {
            int iD2 = yVar.d(16);
            if (iD2 == 0) {
                yVar.e(8);
                yVar.e(16);
                yVar.e(16);
                yVar.e(6);
                yVar.e(8);
                int iD3 = yVar.d(4) + 1;
                for (int i10 = 0; i10 < iD3; i10++) {
                    yVar.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw C0897l1.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = yVar.d(5);
                int[] iArr = new int[iD4];
                int i11 = -1;
                for (int i12 = 0; i12 < iD4; i12++) {
                    int iD5 = yVar.d(4);
                    iArr[i12] = iD5;
                    if (iD5 > i11) {
                        i11 = iD5;
                    }
                }
                int i13 = i11 + 1;
                int[] iArr2 = new int[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    iArr2[i14] = yVar.d(3) + 1;
                    int iD6 = yVar.d(2);
                    if (iD6 > 0) {
                        yVar.e(8);
                    }
                    for (int i15 = 0; i15 < (1 << iD6); i15++) {
                        yVar.e(8);
                    }
                }
                yVar.e(2);
                int iD7 = yVar.d(4);
                int i16 = 0;
                int i17 = 0;
                for (int i18 = 0; i18 < iD4; i18++) {
                    i16 += iArr2[iArr[i18]];
                    while (i17 < i16) {
                        yVar.e(iD7);
                        i17++;
                    }
                }
            }
        }
    }

    public static void e(int i9, y yVar) throws C0897l1 {
        int iD = yVar.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = yVar.d(16);
            if (iD2 != 0) {
                AbstractC1681B.d("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = yVar.c() ? yVar.d(4) + 1 : 1;
                if (yVar.c()) {
                    int iD4 = yVar.d(8) + 1;
                    for (int i11 = 0; i11 < iD4; i11++) {
                        int i12 = i9 - 1;
                        yVar.e(a(i12));
                        yVar.e(a(i12));
                    }
                }
                if (yVar.d(2) != 0) {
                    throw C0897l1.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i13 = 0; i13 < i9; i13++) {
                        yVar.e(4);
                    }
                }
                for (int i14 = 0; i14 < iD3; i14++) {
                    yVar.e(8);
                    yVar.e(8);
                    yVar.e(8);
                }
            }
        }
    }

    public static b[] f(y yVar) {
        int iD = yVar.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i9 = 0; i9 < iD; i9++) {
            bVarArr[i9] = new b(yVar.c(), yVar.d(16), yVar.d(16), yVar.d(8));
        }
        return bVarArr;
    }

    public static void g(y yVar) throws C0897l1 {
        int iD = yVar.d(6) + 1;
        for (int i9 = 0; i9 < iD; i9++) {
            if (yVar.d(16) > 2) {
                throw C0897l1.a("residueType greater than 2 is not decodable", null);
            }
            yVar.e(24);
            yVar.e(24);
            yVar.e(24);
            int iD2 = yVar.d(6) + 1;
            yVar.e(8);
            int[] iArr = new int[iD2];
            for (int i10 = 0; i10 < iD2; i10++) {
                iArr[i10] = ((yVar.c() ? yVar.d(5) : 0) * 8) + yVar.d(3);
            }
            for (int i11 = 0; i11 < iD2; i11++) {
                for (int i12 = 0; i12 < 8; i12++) {
                    if ((iArr[i11] & (1 << i12)) != 0) {
                        yVar.e(8);
                    }
                }
            }
        }
    }

    public static a h(M m9) {
        return i(m9, true, true);
    }

    public static a i(M m9, boolean z9, boolean z10) throws C0897l1 {
        if (z9) {
            m(3, m9, false);
        }
        String strE = m9.E((int) m9.x());
        int length = strE.length();
        long jX = m9.x();
        String[] strArr = new String[(int) jX];
        int length2 = length + 15;
        for (int i9 = 0; i9 < jX; i9++) {
            String strE2 = m9.E((int) m9.x());
            strArr[i9] = strE2;
            length2 = length2 + 4 + strE2.length();
        }
        if (z10 && (m9.H() & 1) == 0) {
            throw C0897l1.a("framing bit expected to be set", null);
        }
        return new a(strE, strArr, length2 + 1);
    }

    public static c j(M m9) throws C0897l1 {
        m(1, m9, false);
        int iY = m9.y();
        int iH = m9.H();
        int iY2 = m9.y();
        int iU = m9.u();
        if (iU <= 0) {
            iU = -1;
        }
        int iU2 = m9.u();
        if (iU2 <= 0) {
            iU2 = -1;
        }
        int iU3 = m9.u();
        if (iU3 <= 0) {
            iU3 = -1;
        }
        int iH2 = m9.H();
        return new c(iY, iH, iY2, iU, iU2, iU3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & 240) >> 4), (m9.H() & 1) > 0, Arrays.copyOf(m9.e(), m9.g()));
    }

    public static b[] k(M m9, int i9) throws C0897l1 {
        m(5, m9, false);
        int iH = m9.H() + 1;
        y yVar = new y(m9.e());
        yVar.e(m9.f() * 8);
        for (int i10 = 0; i10 < iH; i10++) {
            l(yVar);
        }
        int iD = yVar.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            if (yVar.d(16) != 0) {
                throw C0897l1.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        d(yVar);
        g(yVar);
        e(i9, yVar);
        b[] bVarArrF = f(yVar);
        if (yVar.c()) {
            return bVarArrF;
        }
        throw C0897l1.a("framing bit after modes not set as expected", null);
    }

    public static void l(y yVar) throws C0897l1 {
        if (yVar.d(24) != 5653314) {
            throw C0897l1.a("expected code book to start with [0x56, 0x43, 0x42] at " + yVar.b(), null);
        }
        int iD = yVar.d(16);
        int iD2 = yVar.d(24);
        int iD3 = 0;
        if (yVar.c()) {
            yVar.e(5);
            while (iD3 < iD2) {
                iD3 += yVar.d(a(iD2 - iD3));
            }
        } else {
            boolean zC = yVar.c();
            while (iD3 < iD2) {
                if (!zC || yVar.c()) {
                    yVar.e(5);
                }
                iD3++;
            }
        }
        int iD4 = yVar.d(4);
        if (iD4 > 2) {
            throw C0897l1.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            yVar.e(32);
            yVar.e(32);
            int iD5 = yVar.d(4) + 1;
            yVar.e(1);
            yVar.e((int) ((iD4 == 1 ? iD != 0 ? b(iD2, iD) : 0L : ((long) iD) * ((long) iD2)) * ((long) iD5)));
        }
    }

    public static boolean m(int i9, M m9, boolean z9) throws C0897l1 {
        if (m9.a() < 7) {
            if (z9) {
                return false;
            }
            throw C0897l1.a("too short header: " + m9.a(), null);
        }
        if (m9.H() != i9) {
            if (z9) {
                return false;
            }
            throw C0897l1.a("expected header type " + Integer.toHexString(i9), null);
        }
        if (m9.H() == 118 && m9.H() == 111 && m9.H() == 114 && m9.H() == 98 && m9.H() == 105 && m9.H() == 115) {
            return true;
        }
        if (z9) {
            return false;
        }
        throw C0897l1.a("expected characters 'vorbis'", null);
    }
}
