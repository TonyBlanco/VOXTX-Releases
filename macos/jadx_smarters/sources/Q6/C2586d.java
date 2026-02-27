package q6;

import D.AbstractC0529l;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q6.AbstractC2584b;

/* JADX INFO: renamed from: q6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2586d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f47036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f47037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f47038c;

    public C2586d(Context context, J j9, Executor executor) {
        this.f47036a = executor;
        this.f47037b = context;
        this.f47038c = j9;
    }

    public boolean a() {
        if (this.f47038c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        F fD = d();
        AbstractC2584b.a aVarE = AbstractC2584b.e(this.f47037b, this.f47038c);
        e(aVarE.f47023a, fD);
        c(aVarE);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.f47037b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C4.m.f()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f47037b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void c(AbstractC2584b.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f47037b.getSystemService(TransferService.INTENT_KEY_NOTIFICATION)).notify(aVar.f47024b, aVar.f47025c, aVar.f47023a.c());
    }

    public final F d() {
        F fD = F.d(this.f47038c.p("gcm.n.image"));
        if (fD != null) {
            fD.g(this.f47036a);
        }
        return fD;
    }

    public final void e(AbstractC0529l.e eVar, F f9) {
        if (f9 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(f9.e(), 5L, TimeUnit.SECONDS);
            eVar.u(bitmap);
            eVar.F(new AbstractC0529l.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            f9.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e9) {
            Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(e9.getCause())));
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            f9.close();
        }
    }
}
