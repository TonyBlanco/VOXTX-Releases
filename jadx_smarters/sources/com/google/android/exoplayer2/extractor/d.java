package com.google.android.exoplayer2.extractor;

import O2.C0897l1;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d3.InterfaceC1673j;
import d3.s;
import d4.L;
import d4.M;
import java.util.Arrays;
import java.util.List;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f25415a;

        public a(FlacStreamMetadata flacStreamMetadata) {
            this.f25415a = flacStreamMetadata;
        }
    }

    public static boolean a(InterfaceC1673j interfaceC1673j) {
        M m9 = new M(4);
        interfaceC1673j.s(m9.e(), 0, 4);
        return m9.J() == 1716281667;
    }

    public static int b(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        interfaceC1673j.f();
        M m9 = new M(2);
        interfaceC1673j.s(m9.e(), 0, 2);
        int iN = m9.N();
        int i9 = iN >> 2;
        interfaceC1673j.f();
        if (i9 == 16382) {
            return iN;
        }
        throw C0897l1.a("First frame does not start with sync code.", null);
    }

    public static C2540a c(InterfaceC1673j interfaceC1673j, boolean z9) {
        C2540a c2540aA = new s().a(interfaceC1673j, z9 ? null : v3.h.f51311b);
        if (c2540aA == null || c2540aA.f() == 0) {
            return null;
        }
        return c2540aA;
    }

    public static C2540a d(InterfaceC1673j interfaceC1673j, boolean z9) {
        interfaceC1673j.f();
        long jK = interfaceC1673j.k();
        C2540a c2540aC = c(interfaceC1673j, z9);
        interfaceC1673j.q((int) (interfaceC1673j.k() - jK));
        return c2540aC;
    }

    public static boolean e(InterfaceC1673j interfaceC1673j, a aVar) {
        FlacStreamMetadata flacStreamMetadataCopyWithPictureFrames;
        interfaceC1673j.f();
        L l9 = new L(new byte[4]);
        interfaceC1673j.s(l9.f39700a, 0, 4);
        boolean zG = l9.g();
        int iH = l9.h(7);
        int iH2 = l9.h(24) + 4;
        if (iH == 0) {
            flacStreamMetadataCopyWithPictureFrames = h(interfaceC1673j);
        } else {
            FlacStreamMetadata flacStreamMetadata = aVar.f25415a;
            if (flacStreamMetadata == null) {
                throw new IllegalArgumentException();
            }
            if (iH == 3) {
                flacStreamMetadataCopyWithPictureFrames = flacStreamMetadata.copyWithSeekTable(f(interfaceC1673j, iH2));
            } else if (iH == 4) {
                flacStreamMetadataCopyWithPictureFrames = flacStreamMetadata.copyWithVorbisComments(j(interfaceC1673j, iH2));
            } else {
                if (iH != 6) {
                    interfaceC1673j.q(iH2);
                    return zG;
                }
                M m9 = new M(iH2);
                interfaceC1673j.m(m9.e(), 0, iH2);
                m9.V(4);
                flacStreamMetadataCopyWithPictureFrames = flacStreamMetadata.copyWithPictureFrames(AbstractC2743y.A(PictureFrame.fromPictureBlock(m9)));
            }
        }
        aVar.f25415a = flacStreamMetadataCopyWithPictureFrames;
        return zG;
    }

    public static FlacStreamMetadata.a f(InterfaceC1673j interfaceC1673j, int i9) {
        M m9 = new M(i9);
        interfaceC1673j.m(m9.e(), 0, i9);
        return g(m9);
    }

    public static FlacStreamMetadata.a g(M m9) {
        m9.V(1);
        int iK = m9.K();
        long jF = ((long) m9.f()) + ((long) iK);
        int i9 = iK / 18;
        long[] jArrCopyOf = new long[i9];
        long[] jArrCopyOf2 = new long[i9];
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            long jA = m9.A();
            if (jA == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jA;
            jArrCopyOf2[i10] = m9.A();
            m9.V(2);
            i10++;
        }
        m9.V((int) (jF - ((long) m9.f())));
        return new FlacStreamMetadata.a(jArrCopyOf, jArrCopyOf2);
    }

    public static FlacStreamMetadata h(InterfaceC1673j interfaceC1673j) {
        byte[] bArr = new byte[38];
        interfaceC1673j.m(bArr, 0, 38);
        return new FlacStreamMetadata(bArr, 4);
    }

    public static void i(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        M m9 = new M(4);
        interfaceC1673j.m(m9.e(), 0, 4);
        if (m9.J() != 1716281667) {
            throw C0897l1.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static List j(InterfaceC1673j interfaceC1673j, int i9) {
        M m9 = new M(i9);
        interfaceC1673j.m(m9.e(), 0, i9);
        m9.V(4);
        return Arrays.asList(h.i(m9, false, false).f25427b);
    }
}
