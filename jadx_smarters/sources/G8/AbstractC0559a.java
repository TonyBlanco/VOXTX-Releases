package G8;

import o8.InterfaceC2372d;
import org.apache.http.message.TokenParser;

/* JADX INFO: renamed from: G8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0559a extends E0 implements InterfaceC0605x0, InterfaceC2372d, L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8.g f2316c;

    public AbstractC0559a(o8.g gVar, boolean z9, boolean z10) {
        super(z10);
        if (z9) {
            g0((InterfaceC0605x0) gVar.a(InterfaceC0605x0.f2366b0));
        }
        this.f2316c = gVar.V(this);
    }

    public void K0(Object obj) {
        D(obj);
    }

    @Override // G8.E0
    public String L() {
        return P.a(this) + " was cancelled";
    }

    public void L0(Throwable th, boolean z9) {
    }

    public void M0(Object obj) {
    }

    public final void N0(N n9, Object obj, w8.p pVar) throws Throwable {
        n9.invoke(pVar, obj, this);
    }

    @Override // G8.E0
    public final void f0(Throwable th) {
        K.a(this.f2316c, th);
    }

    @Override // o8.InterfaceC2372d
    public final o8.g getContext() {
        return this.f2316c;
    }

    @Override // G8.E0, G8.InterfaceC0605x0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // G8.E0
    public String p0() {
        String strB = G.b(this.f2316c);
        if (strB == null) {
            return super.p0();
        }
        return TokenParser.DQUOTE + strB + "\":" + super.p0();
    }

    @Override // o8.InterfaceC2372d
    public final void resumeWith(Object obj) {
        Object objN0 = n0(F.d(obj, null, 1, null));
        if (objN0 == F0.f2280b) {
            return;
        }
        K0(objN0);
    }

    @Override // G8.L
    public o8.g t() {
        return this.f2316c;
    }

    @Override // G8.E0
    public final void u0(Object obj) {
        if (!(obj instanceof B)) {
            M0(obj);
        } else {
            B b9 = (B) obj;
            L0(b9.f2261a, b9.a());
        }
    }
}
