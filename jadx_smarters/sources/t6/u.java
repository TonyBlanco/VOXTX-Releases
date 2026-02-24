package t6;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f50858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f50859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f50860f;

    public u(String sessionId, String firstSessionId, int i9, long j9, f dataCollectionStatus, String firebaseInstallationId) {
        kotlin.jvm.internal.l.e(sessionId, "sessionId");
        kotlin.jvm.internal.l.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.l.e(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.l.e(firebaseInstallationId, "firebaseInstallationId");
        this.f50855a = sessionId;
        this.f50856b = firstSessionId;
        this.f50857c = i9;
        this.f50858d = j9;
        this.f50859e = dataCollectionStatus;
        this.f50860f = firebaseInstallationId;
    }

    public /* synthetic */ u(String str, String str2, int i9, long j9, f fVar, String str3, int i10, kotlin.jvm.internal.g gVar) {
        this(str, str2, i9, j9, (i10 & 16) != 0 ? new f(null, null, 0.0d, 7, null) : fVar, (i10 & 32) != 0 ? "" : str3);
    }

    public final f a() {
        return this.f50859e;
    }

    public final long b() {
        return this.f50858d;
    }

    public final String c() {
        return this.f50860f;
    }

    public final String d() {
        return this.f50856b;
    }

    public final String e() {
        return this.f50855a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.l.a(this.f50855a, uVar.f50855a) && kotlin.jvm.internal.l.a(this.f50856b, uVar.f50856b) && this.f50857c == uVar.f50857c && this.f50858d == uVar.f50858d && kotlin.jvm.internal.l.a(this.f50859e, uVar.f50859e) && kotlin.jvm.internal.l.a(this.f50860f, uVar.f50860f);
    }

    public final int f() {
        return this.f50857c;
    }

    public final void g(String str) {
        kotlin.jvm.internal.l.e(str, "<set-?>");
        this.f50860f = str;
    }

    public int hashCode() {
        return (((((((((this.f50855a.hashCode() * 31) + this.f50856b.hashCode()) * 31) + this.f50857c) * 31) + p.a(this.f50858d)) * 31) + this.f50859e.hashCode()) * 31) + this.f50860f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f50855a + ", firstSessionId=" + this.f50856b + ", sessionIndex=" + this.f50857c + ", eventTimestampUs=" + this.f50858d + ", dataCollectionStatus=" + this.f50859e + ", firebaseInstallationId=" + this.f50860f + ')';
    }
}
