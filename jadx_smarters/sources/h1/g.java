package h1;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41534b;

    public g(String str, String str2) {
        this.f41533a = str;
        this.f41534b = str2;
    }

    public final String a() {
        return this.f41533a;
    }

    public final String b() {
        return this.f41534b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f41533a, gVar.f41533a) && TextUtils.equals(this.f41534b, gVar.f41534b);
    }

    public int hashCode() {
        return (this.f41533a.hashCode() * 31) + this.f41534b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f41533a + ",value=" + this.f41534b + "]";
    }
}
