package Z1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f10865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f10866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f10868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public URL f10869e;

    public d(String str) {
        this(str, e.f10871b);
    }

    public d(String str, e eVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.f10867c = str;
        this.f10865a = null;
        this.f10866b = eVar;
    }

    public d(URL url) {
        this(url, e.f10871b);
    }

    public d(URL url, e eVar) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.f10865a = url;
        this.f10867c = null;
        this.f10866b = eVar;
    }

    public String a() {
        String str = this.f10867c;
        return str != null ? str : this.f10865a.toString();
    }

    public Map b() {
        return this.f10866b.getHeaders();
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f10868d)) {
            String string = this.f10867c;
            if (TextUtils.isEmpty(string)) {
                string = this.f10865a.toString();
            }
            this.f10868d = Uri.encode(string, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f10868d;
    }

    public final URL d() {
        if (this.f10869e == null) {
            this.f10869e = new URL(c());
        }
        return this.f10869e;
    }

    public URL e() {
        return d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a().equals(dVar.a()) && this.f10866b.equals(dVar.f10866b);
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f10866b.hashCode();
    }

    public String toString() {
        return a() + '\n' + this.f10866b.toString();
    }
}
