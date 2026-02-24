package B2;

import B2.l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f244g;

    public static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f251g;

        @Override // B2.l.a
        public l a() {
            String str = "";
            if (this.f245a == null) {
                str = " eventTimeMs";
            }
            if (this.f247c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f250f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f245a.longValue(), this.f246b, this.f247c.longValue(), this.f248d, this.f249e, this.f250f.longValue(), this.f251g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // B2.l.a
        public l.a b(Integer num) {
            this.f246b = num;
            return this;
        }

        @Override // B2.l.a
        public l.a c(long j9) {
            this.f245a = Long.valueOf(j9);
            return this;
        }

        @Override // B2.l.a
        public l.a d(long j9) {
            this.f247c = Long.valueOf(j9);
            return this;
        }

        @Override // B2.l.a
        public l.a e(o oVar) {
            this.f251g = oVar;
            return this;
        }

        @Override // B2.l.a
        public l.a f(byte[] bArr) {
            this.f248d = bArr;
            return this;
        }

        @Override // B2.l.a
        public l.a g(String str) {
            this.f249e = str;
            return this;
        }

        @Override // B2.l.a
        public l.a h(long j9) {
            this.f250f = Long.valueOf(j9);
            return this;
        }
    }

    public f(long j9, Integer num, long j10, byte[] bArr, String str, long j11, o oVar) {
        this.f238a = j9;
        this.f239b = num;
        this.f240c = j10;
        this.f241d = bArr;
        this.f242e = str;
        this.f243f = j11;
        this.f244g = oVar;
    }

    @Override // B2.l
    public Integer b() {
        return this.f239b;
    }

    @Override // B2.l
    public long c() {
        return this.f238a;
    }

    @Override // B2.l
    public long d() {
        return this.f240c;
    }

    @Override // B2.l
    public o e() {
        return this.f244g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f238a == lVar.c() && ((num = this.f239b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f240c == lVar.d()) {
            if (Arrays.equals(this.f241d, lVar instanceof f ? ((f) lVar).f241d : lVar.f()) && ((str = this.f242e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f243f == lVar.h()) {
                o oVar = this.f244g;
                o oVarE = lVar.e();
                if (oVar == null) {
                    if (oVarE == null) {
                        return true;
                    }
                } else if (oVar.equals(oVarE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // B2.l
    public byte[] f() {
        return this.f241d;
    }

    @Override // B2.l
    public String g() {
        return this.f242e;
    }

    @Override // B2.l
    public long h() {
        return this.f243f;
    }

    public int hashCode() {
        long j9 = this.f238a;
        int i9 = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f239b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j10 = this.f240c;
        int iHashCode2 = (((((i9 ^ iHashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f241d)) * 1000003;
        String str = this.f242e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j11 = this.f243f;
        int i10 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f244g;
        return i10 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f238a + ", eventCode=" + this.f239b + ", eventUptimeMs=" + this.f240c + ", sourceExtension=" + Arrays.toString(this.f241d) + ", sourceExtensionJsonProto3=" + this.f242e + ", timezoneOffsetSeconds=" + this.f243f + ", networkConnectionInfo=" + this.f244g + "}";
    }
}
