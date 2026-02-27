package u0;

import android.os.Bundle;

/* JADX INFO: renamed from: u0.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2807G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f50885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2811K f50886b;

    public C2807G(C2811K c2811k, boolean z9) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f50885a = bundle;
        this.f50886b = c2811k;
        bundle.putBundle("selector", c2811k.a());
        bundle.putBoolean("activeScan", z9);
    }

    public Bundle a() {
        return this.f50885a;
    }

    public final void b() {
        if (this.f50886b == null) {
            C2811K c2811kD = C2811K.d(this.f50885a.getBundle("selector"));
            this.f50886b = c2811kD;
            if (c2811kD == null) {
                this.f50886b = C2811K.f50924c;
            }
        }
    }

    public C2811K c() {
        b();
        return this.f50886b;
    }

    public boolean d() {
        return this.f50885a.getBoolean("activeScan");
    }

    public boolean e() {
        b();
        return this.f50886b.g();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2807G)) {
            return false;
        }
        C2807G c2807g = (C2807G) obj;
        return c().equals(c2807g.c()) && d() == c2807g.d();
    }

    public int hashCode() {
        return c().hashCode() ^ d();
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + c() + ", activeScan=" + d() + ", isValid=" + e() + " }";
    }
}
