package u6;

import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: u6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2857b {

    /* JADX INFO: renamed from: u6.b$a */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* JADX INFO: renamed from: u6.b$b, reason: collision with other inner class name */
    public static final class C0469b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51226a;

        public C0469b(String sessionId) {
            l.e(sessionId, "sessionId");
            this.f51226a = sessionId;
        }

        public final String a() {
            return this.f51226a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0469b) && l.a(this.f51226a, ((C0469b) obj).f51226a);
        }

        public int hashCode() {
            return this.f51226a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f51226a + ')';
        }
    }

    void a(C0469b c0469b);

    boolean b();

    a c();
}
