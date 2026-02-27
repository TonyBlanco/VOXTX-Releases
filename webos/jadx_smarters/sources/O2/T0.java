package O2;

import B3.C;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C.b f5880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5888i;

    public T0(C.b bVar, long j9, long j10, long j11, long j12, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        AbstractC1684a.a(!z12 || z10);
        AbstractC1684a.a(!z11 || z10);
        if (z9 && (z10 || z11 || z12)) {
            z13 = false;
        }
        AbstractC1684a.a(z13);
        this.f5880a = bVar;
        this.f5881b = j9;
        this.f5882c = j10;
        this.f5883d = j11;
        this.f5884e = j12;
        this.f5885f = z9;
        this.f5886g = z10;
        this.f5887h = z11;
        this.f5888i = z12;
    }

    public T0 a(long j9) {
        return j9 == this.f5882c ? this : new T0(this.f5880a, this.f5881b, j9, this.f5883d, this.f5884e, this.f5885f, this.f5886g, this.f5887h, this.f5888i);
    }

    public T0 b(long j9) {
        return j9 == this.f5881b ? this : new T0(this.f5880a, j9, this.f5882c, this.f5883d, this.f5884e, this.f5885f, this.f5886g, this.f5887h, this.f5888i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T0.class != obj.getClass()) {
            return false;
        }
        T0 t02 = (T0) obj;
        return this.f5881b == t02.f5881b && this.f5882c == t02.f5882c && this.f5883d == t02.f5883d && this.f5884e == t02.f5884e && this.f5885f == t02.f5885f && this.f5886g == t02.f5886g && this.f5887h == t02.f5887h && this.f5888i == t02.f5888i && d4.k0.c(this.f5880a, t02.f5880a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f5880a.hashCode()) * 31) + ((int) this.f5881b)) * 31) + ((int) this.f5882c)) * 31) + ((int) this.f5883d)) * 31) + ((int) this.f5884e)) * 31) + (this.f5885f ? 1 : 0)) * 31) + (this.f5886g ? 1 : 0)) * 31) + (this.f5887h ? 1 : 0)) * 31) + (this.f5888i ? 1 : 0);
    }
}
