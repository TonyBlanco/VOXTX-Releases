package Q5;

import Q5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends D.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8392i;

    public z(int i9, String str, int i10, long j9, long j10, boolean z9, int i11, String str2, String str3) {
        this.f8384a = i9;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f8385b = str;
        this.f8386c = i10;
        this.f8387d = j9;
        this.f8388e = j10;
        this.f8389f = z9;
        this.f8390g = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f8391h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f8392i = str3;
    }

    @Override // Q5.D.b
    public int a() {
        return this.f8384a;
    }

    @Override // Q5.D.b
    public int b() {
        return this.f8386c;
    }

    @Override // Q5.D.b
    public long d() {
        return this.f8388e;
    }

    @Override // Q5.D.b
    public boolean e() {
        return this.f8389f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.b)) {
            return false;
        }
        D.b bVar = (D.b) obj;
        return this.f8384a == bVar.a() && this.f8385b.equals(bVar.g()) && this.f8386c == bVar.b() && this.f8387d == bVar.j() && this.f8388e == bVar.d() && this.f8389f == bVar.e() && this.f8390g == bVar.i() && this.f8391h.equals(bVar.f()) && this.f8392i.equals(bVar.h());
    }

    @Override // Q5.D.b
    public String f() {
        return this.f8391h;
    }

    @Override // Q5.D.b
    public String g() {
        return this.f8385b;
    }

    @Override // Q5.D.b
    public String h() {
        return this.f8392i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f8384a ^ 1000003) * 1000003) ^ this.f8385b.hashCode()) * 1000003) ^ this.f8386c) * 1000003;
        long j9 = this.f8387d;
        int i9 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f8388e;
        return ((((((((i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f8389f ? 1231 : 1237)) * 1000003) ^ this.f8390g) * 1000003) ^ this.f8391h.hashCode()) * 1000003) ^ this.f8392i.hashCode();
    }

    @Override // Q5.D.b
    public int i() {
        return this.f8390g;
    }

    @Override // Q5.D.b
    public long j() {
        return this.f8387d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f8384a + ", model=" + this.f8385b + ", availableProcessors=" + this.f8386c + ", totalRam=" + this.f8387d + ", diskSpace=" + this.f8388e + ", isEmulator=" + this.f8389f + ", state=" + this.f8390g + ", manufacturer=" + this.f8391h + ", modelClass=" + this.f8392i + "}";
    }
}
