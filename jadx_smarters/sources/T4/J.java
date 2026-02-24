package t4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2775b f50654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2792t f50656c;

    public J(String str, String str2, String str3) {
        AbstractC2774a.f(str);
        this.f50655b = str;
        this.f50654a = new C2775b("MediaControlChannel", null);
    }

    public final long a() {
        InterfaceC2792t interfaceC2792t = this.f50656c;
        if (interfaceC2792t != null) {
            return interfaceC2792t.zza();
        }
        this.f50654a.c("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }

    public final String b() {
        return this.f50655b;
    }

    public abstract void c();

    public final void d(String str, long j9, String str2) {
        InterfaceC2792t interfaceC2792t = this.f50656c;
        if (interfaceC2792t == null) {
            this.f50654a.c("Attempt to send text message without a sink", new Object[0]);
        } else {
            interfaceC2792t.a(this.f50655b, str, j9, null);
        }
    }

    public final void e(InterfaceC2792t interfaceC2792t) {
        this.f50656c = interfaceC2792t;
        if (interfaceC2792t == null) {
            c();
        }
    }
}
