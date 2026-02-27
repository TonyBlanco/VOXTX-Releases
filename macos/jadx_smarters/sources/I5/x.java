package I5;

import j6.InterfaceC2102b;

/* JADX INFO: loaded from: classes3.dex */
public class x implements InterfaceC2102b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2916c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f2917a = f2916c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile InterfaceC2102b f2918b;

    public x(InterfaceC2102b interfaceC2102b) {
        this.f2918b = interfaceC2102b;
    }

    @Override // j6.InterfaceC2102b
    public Object get() {
        Object obj = this.f2917a;
        Object obj2 = f2916c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f2917a;
                    if (obj == obj2) {
                        obj = this.f2918b.get();
                        this.f2917a = obj;
                        this.f2918b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
