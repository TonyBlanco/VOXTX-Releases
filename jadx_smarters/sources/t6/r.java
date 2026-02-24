package t6;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f50843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f50844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2796b f50845c;

    public r(j eventType, u sessionData, C2796b applicationInfo) {
        kotlin.jvm.internal.l.e(eventType, "eventType");
        kotlin.jvm.internal.l.e(sessionData, "sessionData");
        kotlin.jvm.internal.l.e(applicationInfo, "applicationInfo");
        this.f50843a = eventType;
        this.f50844b = sessionData;
        this.f50845c = applicationInfo;
    }

    public final C2796b a() {
        return this.f50845c;
    }

    public final j b() {
        return this.f50843a;
    }

    public final u c() {
        return this.f50844b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f50843a == rVar.f50843a && kotlin.jvm.internal.l.a(this.f50844b, rVar.f50844b) && kotlin.jvm.internal.l.a(this.f50845c, rVar.f50845c);
    }

    public int hashCode() {
        return (((this.f50843a.hashCode() * 31) + this.f50844b.hashCode()) * 31) + this.f50845c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f50843a + ", sessionData=" + this.f50844b + ", applicationInfo=" + this.f50845c + ')';
    }
}
