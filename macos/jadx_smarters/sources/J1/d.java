package J1;

import v1.InterfaceC2865c;
import v1.InterfaceC2866d;

/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC2866d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f3010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K1.d f3011b;

    public d(h hVar, K1.d dVar) {
        this.f3010a = hVar;
        this.f3011b = dVar;
    }

    @Override // v1.InterfaceC2866d
    public void a(String str, InterfaceC2865c interfaceC2865c) {
        x1.g.c(str, "fieldName == null");
        if (interfaceC2865c == null) {
            this.f3010a.g(str).h();
            return;
        }
        this.f3010a.g(str).c();
        interfaceC2865c.marshal(this);
        this.f3010a.e();
    }

    @Override // v1.InterfaceC2866d
    public void b(String str, Integer num) {
        x1.g.c(str, "fieldName == null");
        if (num != null) {
            this.f3010a.g(str).o(num);
        } else {
            this.f3010a.g(str).h();
        }
    }

    @Override // v1.InterfaceC2866d
    public void c(String str, String str2) {
        x1.g.c(str, "fieldName == null");
        if (str2 != null) {
            this.f3010a.g(str).p(str2);
        } else {
            this.f3010a.g(str).h();
        }
    }
}
