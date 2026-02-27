package U2;

import android.media.MediaCodec;
import com.google.ads.interactivemedia.v3.internal.S;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f9673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f9674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f9676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f9677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f9681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f9682j;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f9683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f9684b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f9683a = cryptoInfo;
            this.f9684b = S.a(0, 0);
        }

        public final void b(int i9, int i10) {
            this.f9684b.set(i9, i10);
            this.f9683a.setPattern(this.f9684b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f9681i = cryptoInfo;
        this.f9682j = k0.f39777a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f9681i;
    }

    public void b(int i9) {
        if (i9 == 0) {
            return;
        }
        if (this.f9676d == null) {
            int[] iArr = new int[1];
            this.f9676d = iArr;
            this.f9681i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f9676d;
        iArr2[0] = iArr2[0] + i9;
    }

    public void c(int i9, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this.f9678f = i9;
        this.f9676d = iArr;
        this.f9677e = iArr2;
        this.f9674b = bArr;
        this.f9673a = bArr2;
        this.f9675c = i10;
        this.f9679g = i11;
        this.f9680h = i12;
        MediaCodec.CryptoInfo cryptoInfo = this.f9681i;
        cryptoInfo.numSubSamples = i9;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i10;
        if (k0.f39777a >= 24) {
            ((b) AbstractC1684a.e(this.f9682j)).b(i11, i12);
        }
    }
}
