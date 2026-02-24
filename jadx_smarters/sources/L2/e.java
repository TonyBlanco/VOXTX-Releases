package l2;

import Z1.l;
import i2.InterfaceC1881c;

/* JADX INFO: loaded from: classes.dex */
public class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f43883a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1881c f43884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2175b f43885d;

    public e(l lVar, InterfaceC1881c interfaceC1881c, InterfaceC2175b interfaceC2175b) {
        if (lVar == null) {
            throw new NullPointerException("ModelLoader must not be null");
        }
        this.f43883a = lVar;
        if (interfaceC1881c == null) {
            throw new NullPointerException("Transcoder must not be null");
        }
        this.f43884c = interfaceC1881c;
        if (interfaceC2175b == null) {
            throw new NullPointerException("DataLoadProvider must not be null");
        }
        this.f43885d = interfaceC2175b;
    }

    @Override // l2.InterfaceC2175b
    public S1.b b() {
        return this.f43885d.b();
    }

    @Override // l2.f
    public InterfaceC1881c d() {
        return this.f43884c;
    }

    @Override // l2.InterfaceC2175b
    public S1.f e() {
        return this.f43885d.e();
    }

    @Override // l2.InterfaceC2175b
    public S1.e f() {
        return this.f43885d.f();
    }

    @Override // l2.InterfaceC2175b
    public S1.e g() {
        return this.f43885d.g();
    }

    @Override // l2.f
    public l h() {
        return this.f43883a;
    }
}
