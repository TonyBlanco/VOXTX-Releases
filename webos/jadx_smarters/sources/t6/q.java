package t6;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f50842d;

    public q(String sessionId, String firstSessionId, int i9, long j9) {
        kotlin.jvm.internal.l.e(sessionId, "sessionId");
        kotlin.jvm.internal.l.e(firstSessionId, "firstSessionId");
        this.f50839a = sessionId;
        this.f50840b = firstSessionId;
        this.f50841c = i9;
        this.f50842d = j9;
    }

    public final String a() {
        return this.f50840b;
    }

    public final String b() {
        return this.f50839a;
    }

    public final int c() {
        return this.f50841c;
    }

    public final long d() {
        return this.f50842d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.l.a(this.f50839a, qVar.f50839a) && kotlin.jvm.internal.l.a(this.f50840b, qVar.f50840b) && this.f50841c == qVar.f50841c && this.f50842d == qVar.f50842d;
    }

    public int hashCode() {
        return (((((this.f50839a.hashCode() * 31) + this.f50840b.hashCode()) * 31) + this.f50841c) * 31) + p.a(this.f50842d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f50839a + ", firstSessionId=" + this.f50840b + ", sessionIndex=" + this.f50841c + ", sessionStartTimestampUs=" + this.f50842d + ')';
    }
}
