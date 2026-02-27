package M;

import android.util.Base64;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4131e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4132f;

    public e(String str, String str2, String str3, List list) {
        this.f4127a = (String) O.h.f(str);
        this.f4128b = (String) O.h.f(str2);
        this.f4129c = (String) O.h.f(str3);
        this.f4130d = (List) O.h.f(list);
        this.f4132f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f4130d;
    }

    public int c() {
        return this.f4131e;
    }

    public String d() {
        return this.f4132f;
    }

    public String e() {
        return this.f4127a;
    }

    public String f() {
        return this.f4128b;
    }

    public String g() {
        return this.f4129c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4127a + ", mProviderPackage: " + this.f4128b + ", mQuery: " + this.f4129c + ", mCertificates:");
        for (int i9 = 0; i9 < this.f4130d.size(); i9++) {
            sb.append(" [");
            List list = (List) this.f4130d.get(i9);
            for (int i10 = 0; i10 < list.size(); i10++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i10), 0));
                sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f4131e);
        return sb.toString();
    }
}
