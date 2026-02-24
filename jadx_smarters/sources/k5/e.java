package K5;

import C5.a;
import android.os.Bundle;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M5.b f3815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M5.b f3816b;

    public static void b(M5.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.onEvent(str, bundle);
    }

    @Override // C5.a.b
    public void a(int i9, Bundle bundle) {
        String string;
        L5.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i9), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public final void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f3815a : this.f3816b, str, bundle);
    }

    public void d(M5.b bVar) {
        this.f3816b = bVar;
    }

    public void e(M5.b bVar) {
        this.f3815a = bVar;
    }
}
