package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0776l2 f4459a;

    public S1(S4 s42) {
        this.f4459a = s42.b0();
    }

    public final boolean a() {
        try {
            E4.d dVarA = E4.e.a(this.f4459a.c());
            if (dVarA != null) {
                return dVarA.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f4459a.d().v().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e9) {
            this.f4459a.d().v().b("Failed to retrieve Play Store version for Install Referrer", e9);
            return false;
        }
    }
}
