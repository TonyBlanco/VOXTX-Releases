package t4;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: renamed from: t4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2775b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50712d;

    public C2775b(String str) {
        this(str, null);
    }

    public C2775b(String str, String str2) {
        com.google.android.gms.common.internal.r.h(str, "The log tag cannot be null or empty.");
        this.f50709a = str;
        this.f50710b = str.length() <= 23;
        this.f50711c = false;
        this.f50712d = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
    }

    public void a(String str, Object... objArr) {
        if (i()) {
            Log.d(this.f50709a, h(str, objArr));
        }
    }

    public void b(Throwable th, String str, Object... objArr) {
        if (i()) {
            Log.d(this.f50709a, h(str, objArr), th);
        }
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f50709a, h(str, objArr));
    }

    public void d(Throwable th, String str, Object... objArr) {
        Log.e(this.f50709a, h(str, objArr), th);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f50709a, h(str, objArr));
    }

    public void f(String str, Object... objArr) {
        Log.w(this.f50709a, h(str, objArr));
    }

    public void g(Throwable th, String str, Object... objArr) {
        Log.w(this.f50709a, h(str, objArr), th);
    }

    public final String h(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        return !TextUtils.isEmpty(this.f50712d) ? String.valueOf(this.f50712d).concat(String.valueOf(str)) : str;
    }

    public final boolean i() {
        if (Build.TYPE.equals("user")) {
            return false;
        }
        if (this.f50711c) {
            return true;
        }
        return this.f50710b && Log.isLoggable(this.f50709a, 3);
    }
}
