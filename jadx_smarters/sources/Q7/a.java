package Q7;

import com.onesignal.InterfaceC1565l1;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f8408b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f8409a;

    public a(InterfaceC1565l1 interfaceC1565l1) {
        f8408b = this;
        if (interfaceC1565l1.d(interfaceC1565l1.i(), "PREFS_OS_LANGUAGE", null) != null) {
            this.f8409a = new c(interfaceC1565l1);
        } else {
            this.f8409a = new d();
        }
    }

    public static a a() {
        return f8408b;
    }

    public String b() {
        return this.f8409a.getLanguage();
    }
}
