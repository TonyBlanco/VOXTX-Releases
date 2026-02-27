package K3;

import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import okhttp3.internal.http2.Settings;
import v5.AbstractC2884d;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f3714l = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f3715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f3718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f3720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f3724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f3725k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f3726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f3728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f3730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f3732g = e.f3714l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f3733h = e.f3714l;

        public e i() {
            return new e(this);
        }

        public b j(byte[] bArr) {
            AbstractC1684a.e(bArr);
            this.f3732g = bArr;
            return this;
        }

        public b k(boolean z9) {
            this.f3727b = z9;
            return this;
        }

        public b l(boolean z9) {
            this.f3726a = z9;
            return this;
        }

        public b m(byte[] bArr) {
            AbstractC1684a.e(bArr);
            this.f3733h = bArr;
            return this;
        }

        public b n(byte b9) {
            this.f3728c = b9;
            return this;
        }

        public b o(int i9) {
            AbstractC1684a.a(i9 >= 0 && i9 <= 65535);
            this.f3729d = i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            return this;
        }

        public b p(int i9) {
            this.f3731f = i9;
            return this;
        }

        public b q(long j9) {
            this.f3730e = j9;
            return this;
        }
    }

    public e(b bVar) {
        this.f3715a = (byte) 2;
        this.f3716b = bVar.f3726a;
        this.f3717c = false;
        this.f3719e = bVar.f3727b;
        this.f3720f = bVar.f3728c;
        this.f3721g = bVar.f3729d;
        this.f3722h = bVar.f3730e;
        this.f3723i = bVar.f3731f;
        byte[] bArr = bVar.f3732g;
        this.f3724j = bArr;
        this.f3718d = (byte) (bArr.length / 4);
        this.f3725k = bVar.f3733h;
    }

    public static int b(int i9) {
        return AbstractC2884d.b(i9 + 1, 65536);
    }

    public static int c(int i9) {
        return AbstractC2884d.b(i9 - 1, 65536);
    }

    public static e d(M m9) {
        byte[] bArr;
        if (m9.a() < 12) {
            return null;
        }
        int iH = m9.H();
        byte b9 = (byte) (iH >> 6);
        boolean z9 = ((iH >> 5) & 1) == 1;
        byte b10 = (byte) (iH & 15);
        if (b9 != 2) {
            return null;
        }
        int iH2 = m9.H();
        boolean z10 = ((iH2 >> 7) & 1) == 1;
        byte b11 = (byte) (iH2 & 127);
        int iN = m9.N();
        long J9 = m9.J();
        int iQ = m9.q();
        if (b10 > 0) {
            bArr = new byte[b10 * 4];
            for (int i9 = 0; i9 < b10; i9++) {
                m9.l(bArr, i9 * 4, 4);
            }
        } else {
            bArr = f3714l;
        }
        byte[] bArr2 = new byte[m9.a()];
        m9.l(bArr2, 0, m9.a());
        return new b().l(z9).k(z10).n(b11).o(iN).q(J9).p(iQ).j(bArr).m(bArr2).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3720f == eVar.f3720f && this.f3721g == eVar.f3721g && this.f3719e == eVar.f3719e && this.f3722h == eVar.f3722h && this.f3723i == eVar.f3723i;
    }

    public int hashCode() {
        int i9 = (((((527 + this.f3720f) * 31) + this.f3721g) * 31) + (this.f3719e ? 1 : 0)) * 31;
        long j9 = this.f3722h;
        return ((i9 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f3723i;
    }

    public String toString() {
        return k0.D("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f3720f), Integer.valueOf(this.f3721g), Long.valueOf(this.f3722h), Integer.valueOf(this.f3723i), Boolean.valueOf(this.f3719e));
    }
}
