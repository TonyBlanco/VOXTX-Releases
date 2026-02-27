package t6;

/* JADX INFO: renamed from: t6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2795a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50771d;

    public C2795a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer) {
        kotlin.jvm.internal.l.e(packageName, "packageName");
        kotlin.jvm.internal.l.e(versionName, "versionName");
        kotlin.jvm.internal.l.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.l.e(deviceManufacturer, "deviceManufacturer");
        this.f50768a = packageName;
        this.f50769b = versionName;
        this.f50770c = appBuildVersion;
        this.f50771d = deviceManufacturer;
    }

    public final String a() {
        return this.f50770c;
    }

    public final String b() {
        return this.f50771d;
    }

    public final String c() {
        return this.f50768a;
    }

    public final String d() {
        return this.f50769b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2795a)) {
            return false;
        }
        C2795a c2795a = (C2795a) obj;
        return kotlin.jvm.internal.l.a(this.f50768a, c2795a.f50768a) && kotlin.jvm.internal.l.a(this.f50769b, c2795a.f50769b) && kotlin.jvm.internal.l.a(this.f50770c, c2795a.f50770c) && kotlin.jvm.internal.l.a(this.f50771d, c2795a.f50771d);
    }

    public int hashCode() {
        return (((((this.f50768a.hashCode() * 31) + this.f50769b.hashCode()) * 31) + this.f50770c.hashCode()) * 31) + this.f50771d.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f50768a + ", versionName=" + this.f50769b + ", appBuildVersion=" + this.f50770c + ", deviceManufacturer=" + this.f50771d + ')';
    }
}
