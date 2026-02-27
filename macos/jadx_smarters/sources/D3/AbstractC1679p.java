package d3;

import O2.C0897l1;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import d4.M;
import d4.k0;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: d3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1679p {

    /* JADX INFO: renamed from: d3.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f39602a;
    }

    public static boolean a(M m9, FlacStreamMetadata flacStreamMetadata, int i9) {
        int iJ = j(m9, i9);
        return iJ != -1 && iJ <= flacStreamMetadata.maxBlockSizeSamples;
    }

    public static boolean b(M m9, int i9) {
        return m9.H() == k0.v(m9.e(), i9, m9.f() - 1, 0);
    }

    public static boolean c(M m9, FlacStreamMetadata flacStreamMetadata, boolean z9, a aVar) {
        try {
            long jO = m9.O();
            if (!z9) {
                jO *= (long) flacStreamMetadata.maxBlockSizeSamples;
            }
            aVar.f39602a = jO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(M m9, FlacStreamMetadata flacStreamMetadata, int i9, a aVar) {
        int iF = m9.f();
        long J9 = m9.J();
        long j9 = J9 >>> 16;
        if (j9 != i9) {
            return false;
        }
        return g((int) (15 & (J9 >> 4)), flacStreamMetadata) && f((int) ((J9 >> 1) & 7), flacStreamMetadata) && !(((J9 & 1) > 1L ? 1 : ((J9 & 1) == 1L ? 0 : -1)) == 0) && c(m9, flacStreamMetadata, ((j9 & 1) > 1L ? 1 : ((j9 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(m9, flacStreamMetadata, (int) ((J9 >> 12) & 15)) && e(m9, flacStreamMetadata, (int) ((J9 >> 8) & 15)) && b(m9, iF);
    }

    public static boolean e(M m9, FlacStreamMetadata flacStreamMetadata, int i9) {
        int i10 = flacStreamMetadata.sampleRate;
        if (i9 == 0) {
            return true;
        }
        if (i9 <= 11) {
            return i9 == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i9 == 12) {
            return m9.H() * 1000 == i10;
        }
        if (i9 > 14) {
            return false;
        }
        int iN = m9.N();
        if (i9 == 14) {
            iN *= 10;
        }
        return iN == i10;
    }

    public static boolean f(int i9, FlacStreamMetadata flacStreamMetadata) {
        return i9 == 0 || i9 == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    public static boolean g(int i9, FlacStreamMetadata flacStreamMetadata) {
        return i9 <= 7 ? i9 == flacStreamMetadata.channels - 1 : i9 <= 10 && flacStreamMetadata.channels == 2;
    }

    public static boolean h(InterfaceC1673j interfaceC1673j, FlacStreamMetadata flacStreamMetadata, int i9, a aVar) {
        long jK = interfaceC1673j.k();
        byte[] bArr = new byte[2];
        interfaceC1673j.s(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i9) {
            interfaceC1673j.f();
            interfaceC1673j.n((int) (jK - interfaceC1673j.getPosition()));
            return false;
        }
        M m9 = new M(16);
        System.arraycopy(bArr, 0, m9.e(), 0, 2);
        m9.T(AbstractC1675l.c(interfaceC1673j, m9.e(), 2, 14));
        interfaceC1673j.f();
        interfaceC1673j.n((int) (jK - interfaceC1673j.getPosition()));
        return d(m9, flacStreamMetadata, i9, aVar);
    }

    public static long i(InterfaceC1673j interfaceC1673j, FlacStreamMetadata flacStreamMetadata) throws C0897l1 {
        interfaceC1673j.f();
        interfaceC1673j.n(1);
        byte[] bArr = new byte[1];
        interfaceC1673j.s(bArr, 0, 1);
        boolean z9 = (bArr[0] & 1) == 1;
        interfaceC1673j.n(2);
        int i9 = z9 ? 7 : 6;
        M m9 = new M(i9);
        m9.T(AbstractC1675l.c(interfaceC1673j, m9.e(), 0, i9));
        interfaceC1673j.f();
        a aVar = new a();
        if (c(m9, flacStreamMetadata, z9, aVar)) {
            return aVar.f39602a;
        }
        throw C0897l1.a(null, null);
    }

    public static int j(M m9, int i9) {
        switch (i9) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i9 - 2);
            case 6:
                return m9.H() + 1;
            case 7:
                return m9.N() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH << (i9 - 8);
            default:
                return -1;
        }
    }
}
