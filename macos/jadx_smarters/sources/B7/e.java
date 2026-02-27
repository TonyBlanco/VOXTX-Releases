package b7;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f17712c = null;

    public e(String str, String str2) {
        d(str);
        e(str2);
    }

    public File a() {
        return this.f17712c;
    }

    public String b() {
        return this.f17710a;
    }

    public String c() {
        return this.f17711b;
    }

    public void d(String str) {
        this.f17710a = str;
    }

    public void e(String str) {
        this.f17711b = str;
    }
}
