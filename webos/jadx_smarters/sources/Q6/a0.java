package q6;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f47018d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47021c;

    public a0(String str, String str2) {
        this.f47019a = d(str2, str);
        this.f47020b = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f47021c = sb.toString();
    }

    public static a0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new a0(strArrSplit[0], strArrSplit[1]);
    }

    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f47018d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static a0 f(String str) {
        return new a0("S", str);
    }

    public String b() {
        return this.f47020b;
    }

    public String c() {
        return this.f47019a;
    }

    public String e() {
        return this.f47021c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f47019a.equals(a0Var.f47019a) && this.f47020b.equals(a0Var.f47020b);
    }

    public int hashCode() {
        return AbstractC1418q.c(this.f47020b, this.f47019a);
    }
}
