package P2;

import android.media.metrics.LogSessionId;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f7159b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7160a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f7161b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f7162a;

        public a(LogSessionId logSessionId) {
            this.f7162a = logSessionId;
        }
    }

    static {
        f7159b = d4.k0.f39777a < 31 ? new v0() : new v0(a.f7161b);
    }

    public v0() {
        this((a) null);
        AbstractC1684a.g(d4.k0.f39777a < 31);
    }

    public v0(a aVar) {
        this.f7160a = aVar;
    }

    public v0(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public LogSessionId a() {
        return ((a) AbstractC1684a.e(this.f7160a)).f7162a;
    }
}
