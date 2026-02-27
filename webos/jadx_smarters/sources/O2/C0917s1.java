package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1684a;

/* JADX INFO: renamed from: O2.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0917s1 implements InterfaceC0901n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0917s1 f6227e = new C0917s1(1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f6228f = d4.k0.A0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f6229g = d4.k0.A0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC0901n.a f6230h = new InterfaceC0901n.a() { // from class: O2.r1
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return C0917s1.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6231a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f6232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6233d;

    public C0917s1(float f9) {
        this(f9, 1.0f);
    }

    public C0917s1(float f9, float f10) {
        AbstractC1684a.a(f9 > 0.0f);
        AbstractC1684a.a(f10 > 0.0f);
        this.f6231a = f9;
        this.f6232c = f10;
        this.f6233d = Math.round(f9 * 1000.0f);
    }

    public static /* synthetic */ C0917s1 c(Bundle bundle) {
        return new C0917s1(bundle.getFloat(f6228f, 1.0f), bundle.getFloat(f6229g, 1.0f));
    }

    public long b(long j9) {
        return j9 * ((long) this.f6233d);
    }

    public C0917s1 d(float f9) {
        return new C0917s1(f9, this.f6232c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0917s1.class != obj.getClass()) {
            return false;
        }
        C0917s1 c0917s1 = (C0917s1) obj;
        return this.f6231a == c0917s1.f6231a && this.f6232c == c0917s1.f6232c;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f6228f, this.f6231a);
        bundle.putFloat(f6229g, this.f6232c);
        return bundle;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f6231a)) * 31) + Float.floatToRawIntBits(this.f6232c);
    }

    public String toString() {
        return d4.k0.D("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f6231a), Float.valueOf(this.f6232c));
    }
}
