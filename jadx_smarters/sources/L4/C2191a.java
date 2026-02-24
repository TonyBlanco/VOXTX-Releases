package l4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: renamed from: l4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2191a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lock f44073c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C2191a f44074d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f44075a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f44076b;

    public C2191a(Context context) {
        this.f44076b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C2191a a(Context context) {
        r.m(context);
        Lock lock = f44073c;
        lock.lock();
        try {
            if (f44074d == null) {
                f44074d = new C2191a(context.getApplicationContext());
            }
            C2191a c2191a = f44074d;
            lock.unlock();
            return c2191a;
        } catch (Throwable th) {
            f44073c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strC2) || (strC = c(d("googleSignInAccount", strC2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.R(strC);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.f44075a.lock();
        try {
            return this.f44076b.getString(str, null);
        } finally {
            this.f44075a.unlock();
        }
    }
}
