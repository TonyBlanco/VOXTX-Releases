package v4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static w f51378e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f51380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f51381c = new q(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51382d = 1;

    public w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f51380b = scheduledExecutorService;
        this.f51379a = context.getApplicationContext();
    }

    public static synchronized w b(Context context) {
        try {
            if (f51378e == null) {
                zze.zza();
                f51378e = new w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new D4.b("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f51378e;
    }

    public final Task c(int i9, Bundle bundle) {
        return g(new s(f(), 2, bundle));
    }

    public final Task d(int i9, Bundle bundle) {
        return g(new v(f(), 1, bundle));
    }

    public final synchronized int f() {
        int i9;
        i9 = this.f51382d;
        this.f51382d = i9 + 1;
        return i9;
    }

    public final synchronized Task g(t tVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(tVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(strValueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.f51381c.g(tVar)) {
                q qVar = new q(this, null);
                this.f51381c = qVar;
                qVar.g(tVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return tVar.f51375b.getTask();
    }
}
