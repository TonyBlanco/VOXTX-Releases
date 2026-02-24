package t6;

/* JADX INFO: renamed from: t6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2796b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f50776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2795a f50777f;

    public C2796b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, n logEnvironment, C2795a androidAppInfo) {
        kotlin.jvm.internal.l.e(appId, "appId");
        kotlin.jvm.internal.l.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.l.e(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.l.e(osVersion, "osVersion");
        kotlin.jvm.internal.l.e(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.l.e(androidAppInfo, "androidAppInfo");
        this.f50772a = appId;
        this.f50773b = deviceModel;
        this.f50774c = sessionSdkVersion;
        this.f50775d = osVersion;
        this.f50776e = logEnvironment;
        this.f50777f = androidAppInfo;
    }

    public final C2795a a() {
        return this.f50777f;
    }

    public final String b() {
        return this.f50772a;
    }

    public final String c() {
        return this.f50773b;
    }

    public final n d() {
        return this.f50776e;
    }

    public final String e() {
        return this.f50775d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2796b)) {
            return false;
        }
        C2796b c2796b = (C2796b) obj;
        return kotlin.jvm.internal.l.a(this.f50772a, c2796b.f50772a) && kotlin.jvm.internal.l.a(this.f50773b, c2796b.f50773b) && kotlin.jvm.internal.l.a(this.f50774c, c2796b.f50774c) && kotlin.jvm.internal.l.a(this.f50775d, c2796b.f50775d) && this.f50776e == c2796b.f50776e && kotlin.jvm.internal.l.a(this.f50777f, c2796b.f50777f);
    }

    public final String f() {
        return this.f50774c;
    }

    public int hashCode() {
        return (((((((((this.f50772a.hashCode() * 31) + this.f50773b.hashCode()) * 31) + this.f50774c.hashCode()) * 31) + this.f50775d.hashCode()) * 31) + this.f50776e.hashCode()) * 31) + this.f50777f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f50772a + ", deviceModel=" + this.f50773b + ", sessionSdkVersion=" + this.f50774c + ", osVersion=" + this.f50775d + ", logEnvironment=" + this.f50776e + ", androidAppInfo=" + this.f50777f + ')';
    }
}
