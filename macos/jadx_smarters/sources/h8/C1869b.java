package h8;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Binder;
import de.blinkt.openvpn.api.ConfirmDialog;
import de.blinkt.openvpn.core.B;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: h8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1869b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41707a;

    public C1869b(Context context) {
        this.f41707a = context;
    }

    public void a(String str) {
        Set setE = e();
        setE.add(str);
        h(setE);
    }

    public String b(PackageManager packageManager) {
        for (String str : e()) {
            try {
            } catch (PackageManager.NameNotFoundException unused) {
                g(str);
            }
            if (Binder.getCallingUid() == packageManager.getApplicationInfo(str, 0).uid) {
                return str;
            }
        }
        throw new SecurityException("Unauthorized OpenVPN API Caller");
    }

    public boolean c(Context context, String str) {
        if (str == null) {
            str = "de.blinkt.openvpn.ANYPACKAGE";
        }
        if (f(str)) {
            return true;
        }
        Intent intent = new Intent(context, (Class<?>) ConfirmDialog.class);
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.PACKAGE_NAME", str);
        context.startActivity(intent);
        return false;
    }

    public void d() {
        h(new HashSet());
    }

    public Set e() {
        return B.a(this.f41707a).getStringSet("allowed_apps", new HashSet());
    }

    public boolean f(String str) {
        return e().contains(str);
    }

    public void g(String str) {
        Set setE = e();
        setE.remove(str);
        h(setE);
    }

    public final void h(Set set) {
        SharedPreferences sharedPreferencesA = B.a(this.f41707a);
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        editorEdit.putStringSet("allowed_apps", set);
        editorEdit.putInt("counter", sharedPreferencesA.getInt("counter", 0) + 1);
        editorEdit.apply();
    }
}
