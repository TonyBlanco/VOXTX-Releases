package Q2;

import Q2.X;
import java.math.RoundingMode;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import v5.AbstractC2884d;

/* JADX INFO: loaded from: classes3.dex */
public class Y implements X.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7719g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7720a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7721b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7722c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7723d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7724e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7725f = 2;

        public Y g() {
            return new Y(this);
        }
    }

    public Y(a aVar) {
        this.f7714b = aVar.f7720a;
        this.f7715c = aVar.f7721b;
        this.f7716d = aVar.f7722c;
        this.f7717e = aVar.f7723d;
        this.f7718f = aVar.f7724e;
        this.f7719g = aVar.f7725f;
    }

    public static int b(int i9, int i10, int i11) {
        return w5.f.d(((((long) i9) * ((long) i10)) * ((long) i11)) / 1000000);
    }

    public static int d(int i9) {
        switch (i9) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 3062500;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return 8000;
            case 16:
                return 256000;
            case LangUtils.HASH_SEED /* 17 */:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // Q2.X.e
    public int a(int i9, int i10, int i11, int i12, int i13, int i14, double d9) {
        return (((Math.max(i9, (int) (((double) c(i9, i10, i11, i12, i13, i14)) * d9)) + i12) - 1) / i12) * i12;
    }

    public int c(int i9, int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 0) {
            return g(i9, i13, i12);
        }
        if (i11 == 1) {
            return e(i10);
        }
        if (i11 == 2) {
            return f(i10, i14);
        }
        throw new IllegalArgumentException();
    }

    public int e(int i9) {
        return w5.f.d((((long) this.f7718f) * ((long) d(i9))) / 1000000);
    }

    public int f(int i9, int i10) {
        int i11 = this.f7717e;
        if (i9 == 5) {
            i11 *= this.f7719g;
        }
        return w5.f.d((((long) i11) * ((long) (i10 != -1 ? AbstractC2884d.a(i10, 8, RoundingMode.CEILING) : d(i9)))) / 1000000);
    }

    public int g(int i9, int i10, int i11) {
        return d4.k0.r(i9 * this.f7716d, b(this.f7714b, i10, i11), b(this.f7715c, i10, i11));
    }
}
