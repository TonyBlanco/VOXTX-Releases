package i5;

import android.graphics.Typeface;

/* JADX INFO: renamed from: i5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1891a extends AbstractC1896f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f41866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0346a f41867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41868c;

    /* JADX INFO: renamed from: i5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0346a {
        void a(Typeface typeface);
    }

    public C1891a(InterfaceC0346a interfaceC0346a, Typeface typeface) {
        this.f41866a = typeface;
        this.f41867b = interfaceC0346a;
    }

    @Override // i5.AbstractC1896f
    public void a(int i9) {
        d(this.f41866a);
    }

    @Override // i5.AbstractC1896f
    public void b(Typeface typeface, boolean z9) {
        d(typeface);
    }

    public void c() {
        this.f41868c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f41868c) {
            return;
        }
        this.f41867b.a(typeface);
    }
}
