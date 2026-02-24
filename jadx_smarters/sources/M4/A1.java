package M4;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f4185d;

    public A1(String str, String str2, Bundle bundle, long j9) {
        this.f4182a = str;
        this.f4183b = str2;
        this.f4185d = bundle;
        this.f4184c = j9;
    }

    public static A1 b(C0832v c0832v) {
        return new A1(c0832v.f5088f, c0832v.f5090h, c0832v.f5089g.J(), c0832v.f5091i);
    }

    public final C0832v a() {
        return new C0832v(this.f4182a, new C0820t(new Bundle(this.f4185d)), this.f4183b, this.f4184c);
    }

    public final String toString() {
        return "origin=" + this.f4183b + ",name=" + this.f4182a + ",params=" + this.f4185d.toString();
    }
}
