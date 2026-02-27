package C2;

import z2.AbstractC3015c;
import z2.C3014b;
import z2.InterfaceC3017e;
import z2.InterfaceC3018f;
import z2.InterfaceC3020h;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements InterfaceC3018f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f1021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3014b f1023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3017e f1024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f1025e;

    public s(p pVar, String str, C3014b c3014b, InterfaceC3017e interfaceC3017e, t tVar) {
        this.f1021a = pVar;
        this.f1022b = str;
        this.f1023c = c3014b;
        this.f1024d = interfaceC3017e;
        this.f1025e = tVar;
    }

    public static /* synthetic */ void e(Exception exc) {
    }

    @Override // z2.InterfaceC3018f
    public void a(AbstractC3015c abstractC3015c) {
        b(abstractC3015c, new InterfaceC3020h() { // from class: C2.r
            @Override // z2.InterfaceC3020h
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    @Override // z2.InterfaceC3018f
    public void b(AbstractC3015c abstractC3015c, InterfaceC3020h interfaceC3020h) {
        this.f1025e.a(o.a().e(this.f1021a).c(abstractC3015c).f(this.f1022b).d(this.f1024d).b(this.f1023c).a(), interfaceC3020h);
    }

    public p d() {
        return this.f1021a;
    }
}
