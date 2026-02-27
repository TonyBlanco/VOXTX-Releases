package o2;

import q2.AbstractC2539h;

/* JADX INFO: renamed from: o2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2312g extends AbstractC2306a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45754c;

    public AbstractC2312g() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC2312g(int i9, int i10) {
        this.f45753b = i9;
        this.f45754c = i10;
    }

    @Override // o2.InterfaceC2315j
    public final void i(InterfaceC2313h interfaceC2313h) {
        if (AbstractC2539h.k(this.f45753b, this.f45754c)) {
            interfaceC2313h.e(this.f45753b, this.f45754c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f45753b + " and height: " + this.f45754c + ", either provide dimensions in the constructor or call override()");
    }
}
