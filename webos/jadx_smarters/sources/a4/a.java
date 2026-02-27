package A4;

import android.util.Log;
import com.google.android.gms.common.internal.C1411j;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1411j f113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f114d;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f112b = string;
        this.f111a = str;
        this.f113c = new C1411j(str);
        int i9 = 2;
        while (i9 <= 7 && !Log.isLoggable(this.f111a, i9)) {
            i9++;
        }
        this.f114d = i9;
    }

    public void a(String str, Object... objArr) {
        if (e(3)) {
            Log.d(this.f111a, d(str, objArr));
        }
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.e(this.f111a, d(str, objArr), th);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f111a, d(str, objArr));
    }

    public String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f112b.concat(str);
    }

    public boolean e(int i9) {
        return this.f114d <= i9;
    }

    public void f(String str, Object... objArr) {
        if (e(2)) {
            Log.v(this.f111a, d(str, objArr));
        }
    }

    public void g(String str, Object... objArr) {
        Log.w(this.f111a, d(str, objArr));
    }

    public void h(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f111a, d(str, objArr), th);
    }

    public void i(Throwable th) {
        Log.wtf(this.f111a, th);
    }
}
