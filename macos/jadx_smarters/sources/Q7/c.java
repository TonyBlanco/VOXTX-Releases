package Q7;

import com.onesignal.InterfaceC1565l1;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1565l1 f8410a;

    public c(InterfaceC1565l1 interfaceC1565l1) {
        this.f8410a = interfaceC1565l1;
    }

    @Override // Q7.b
    public String getLanguage() {
        InterfaceC1565l1 interfaceC1565l1 = this.f8410a;
        return interfaceC1565l1.d(interfaceC1565l1.i(), "PREFS_OS_LANGUAGE", "en");
    }
}
