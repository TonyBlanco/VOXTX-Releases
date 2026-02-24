package O5;

import u6.InterfaceC2857b;

/* JADX INFO: renamed from: O5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0946j implements InterfaceC2857b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0956u f6574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6575b = null;

    public C0946j(C0956u c0956u) {
        this.f6574a = c0956u;
    }

    @Override // u6.InterfaceC2857b
    public void a(InterfaceC2857b.C0469b c0469b) {
        L5.f.f().b("App Quality Sessions session changed: " + c0469b);
        this.f6575b = c0469b.a();
    }

    @Override // u6.InterfaceC2857b
    public boolean b() {
        return this.f6574a.d();
    }

    @Override // u6.InterfaceC2857b
    public InterfaceC2857b.a c() {
        return InterfaceC2857b.a.CRASHLYTICS;
    }

    public String d() {
        return this.f6575b;
    }
}
