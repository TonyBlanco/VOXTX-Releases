package D6;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1456a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1457c;

    public a() {
        this.f1457c = 0;
        this.f1456a = new int[1];
    }

    public a(int i9) {
        this.f1457c = i9;
        this.f1456a = o(i9);
    }

    public a(int[] iArr, int i9) {
        this.f1456a = iArr;
        this.f1457c = i9;
    }

    public static int[] o(int i9) {
        return new int[(i9 + 31) / 32];
    }

    public void b(boolean z9) {
        g(this.f1457c + 1);
        if (z9) {
            int[] iArr = this.f1456a;
            int i9 = this.f1457c;
            int i10 = i9 / 32;
            iArr[i10] = (1 << (i9 & 31)) | iArr[i10];
        }
        this.f1457c++;
    }

    public void c(a aVar) {
        int i9 = aVar.f1457c;
        g(this.f1457c + i9);
        for (int i10 = 0; i10 < i9; i10++) {
            b(aVar.h(i10));
        }
    }

    public void d(int i9, int i10) {
        if (i10 < 0 || i10 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        g(this.f1457c + i10);
        while (i10 > 0) {
            boolean z9 = true;
            if (((i9 >> (i10 - 1)) & 1) != 1) {
                z9 = false;
            }
            b(z9);
            i10--;
        }
    }

    public void e() {
        int length = this.f1456a.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f1456a[i9] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1457c == aVar.f1457c && Arrays.equals(this.f1456a, aVar.f1456a);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f1456a.clone(), this.f1457c);
    }

    public final void g(int i9) {
        if (i9 > (this.f1456a.length << 5)) {
            int[] iArrO = o(i9);
            int[] iArr = this.f1456a;
            System.arraycopy(iArr, 0, iArrO, 0, iArr.length);
            this.f1456a = iArrO;
        }
    }

    public boolean h(int i9) {
        return ((1 << (i9 & 31)) & this.f1456a[i9 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f1457c * 31) + Arrays.hashCode(this.f1456a);
    }

    public int[] i() {
        return this.f1456a;
    }

    public int j(int i9) {
        int i10 = this.f1457c;
        if (i9 >= i10) {
            return i10;
        }
        int i11 = i9 / 32;
        int i12 = (-(1 << (i9 & 31))) & this.f1456a[i11];
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f1456a;
            if (i11 == iArr.length) {
                return this.f1457c;
            }
            i12 = iArr[i11];
        }
        return Math.min((i11 << 5) + Integer.numberOfTrailingZeros(i12), this.f1457c);
    }

    public int k(int i9) {
        int i10 = this.f1457c;
        if (i9 >= i10) {
            return i10;
        }
        int i11 = i9 / 32;
        int i12 = (-(1 << (i9 & 31))) & (~this.f1456a[i11]);
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f1456a;
            if (i11 == iArr.length) {
                return this.f1457c;
            }
            i12 = ~iArr[i11];
        }
        return Math.min((i11 << 5) + Integer.numberOfTrailingZeros(i12), this.f1457c);
    }

    public int l() {
        return this.f1457c;
    }

    public int m() {
        return (this.f1457c + 7) / 8;
    }

    public boolean n(int i9, int i10, boolean z9) {
        if (i10 < i9 || i9 < 0 || i10 > this.f1457c) {
            throw new IllegalArgumentException();
        }
        if (i10 == i9) {
            return true;
        }
        int i11 = i10 - 1;
        int i12 = i9 / 32;
        int i13 = i11 / 32;
        int i14 = i12;
        while (i14 <= i13) {
            int i15 = (2 << (i14 >= i13 ? 31 & i11 : 31)) - (1 << (i14 > i12 ? 0 : i9 & 31));
            int i16 = this.f1456a[i14] & i15;
            if (!z9) {
                i15 = 0;
            }
            if (i16 != i15) {
                return false;
            }
            i14++;
        }
        return true;
    }

    public void p() {
        int[] iArr = new int[this.f1456a.length];
        int i9 = (this.f1457c - 1) / 32;
        int i10 = i9 + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            long j9 = this.f1456a[i11];
            long j10 = ((j9 & 1431655765) << 1) | ((j9 >> 1) & 1431655765);
            long j11 = ((j10 & 858993459) << 2) | ((j10 >> 2) & 858993459);
            long j12 = ((j11 & 252645135) << 4) | ((j11 >> 4) & 252645135);
            long j13 = ((j12 & 16711935) << 8) | ((j12 >> 8) & 16711935);
            iArr[i9 - i11] = (int) (((j13 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j13 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i12 = this.f1457c;
        int i13 = i10 << 5;
        if (i12 != i13) {
            int i14 = i13 - i12;
            int i15 = iArr[0] >>> i14;
            for (int i16 = 1; i16 < i10; i16++) {
                int i17 = iArr[i16];
                iArr[i16 - 1] = i15 | (i17 << (32 - i14));
                i15 = i17 >>> i14;
            }
            iArr[i9] = i15;
        }
        this.f1456a = iArr;
    }

    public void q(int i9) {
        int[] iArr = this.f1456a;
        int i10 = i9 / 32;
        iArr[i10] = (1 << (i9 & 31)) | iArr[i10];
    }

    public void s(int i9, int i10) {
        this.f1456a[i9 / 32] = i10;
    }

    public void t(int i9, byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < 8; i14++) {
                if (h(i9)) {
                    i13 |= 1 << (7 - i14);
                }
                i9++;
            }
            bArr[i10 + i12] = (byte) i13;
        }
    }

    public String toString() {
        int i9 = this.f1457c;
        StringBuilder sb = new StringBuilder(i9 + (i9 / 8) + 1);
        for (int i10 = 0; i10 < this.f1457c; i10++) {
            if ((i10 & 7) == 0) {
                sb.append(TokenParser.SP);
            }
            sb.append(h(i10) ? 'X' : '.');
        }
        return sb.toString();
    }

    public void u(a aVar) {
        if (this.f1457c != aVar.f1457c) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i9 = 0;
        while (true) {
            int[] iArr = this.f1456a;
            if (i9 >= iArr.length) {
                return;
            }
            iArr[i9] = iArr[i9] ^ aVar.f1456a[i9];
            i9++;
        }
    }
}
