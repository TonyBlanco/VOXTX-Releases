package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ScheduledThreadPoolExecutor {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f46725a = new c();
    }

    public c() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    public static c a() {
        return b.f46725a;
    }
}
