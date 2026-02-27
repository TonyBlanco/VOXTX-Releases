package M4;

/* JADX INFO: renamed from: M4.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0775l1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f4792h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0757i1 f4794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4797e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f4798f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Object f4799g = null;

    public /* synthetic */ C0775l1(String str, Object obj, Object obj2, InterfaceC0757i1 interfaceC0757i1, AbstractC0769k1 abstractC0769k1) {
        this.f4793a = str;
        this.f4795c = obj;
        this.f4796d = obj2;
        this.f4794b = interfaceC0757i1;
    }

    public final Object a(Object obj) {
        synchronized (this.f4797e) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC0763j1.f4755a == null) {
            return this.f4795c;
        }
        synchronized (f4792h) {
            try {
                if (C0719c.a()) {
                    return this.f4799g == null ? this.f4795c : this.f4799g;
                }
                try {
                    for (C0775l1 c0775l1 : AbstractC0781m1.f4884a) {
                        if (C0719c.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC0757i1 interfaceC0757i1 = c0775l1.f4794b;
                            if (interfaceC0757i1 != null) {
                                objZza = interfaceC0757i1.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f4792h) {
                            c0775l1.f4799g = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC0757i1 interfaceC0757i12 = this.f4794b;
                if (interfaceC0757i12 == null) {
                    return this.f4795c;
                }
                try {
                    return interfaceC0757i12.zza();
                } catch (IllegalStateException unused3) {
                    return this.f4795c;
                } catch (SecurityException unused4) {
                    return this.f4795c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f4793a;
    }
}
