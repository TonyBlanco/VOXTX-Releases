package q6;

import com.google.android.gms.internal.firebase_messaging.zzi;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: q6.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2597o {
    public static ScheduledExecutorService a() {
        return new ScheduledThreadPoolExecutor(1, new D4.b("Firebase-Messaging-Init"));
    }

    public static ExecutorService b() {
        zzi.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new D4.b("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ExecutorService c() {
        return Executors.newSingleThreadExecutor(new D4.b("Firebase-Messaging-Network-Io"));
    }

    public static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new D4.b("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService e() {
        return new ScheduledThreadPoolExecutor(1, new D4.b("Firebase-Messaging-Topics-Io"));
    }
}
