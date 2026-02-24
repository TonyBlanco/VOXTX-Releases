package M5;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f5159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f5161c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f5163e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5162d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5164f = false;

    public c(e eVar, int i9, TimeUnit timeUnit) {
        this.f5159a = eVar;
        this.f5160b = i9;
        this.f5161c = timeUnit;
    }

    @Override // M5.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f5162d) {
            try {
                L5.f.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f5163e = new CountDownLatch(1);
                this.f5164f = false;
                this.f5159a.a(str, bundle);
                L5.f.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f5163e.await(this.f5160b, this.f5161c)) {
                        this.f5164f = true;
                        L5.f.f().i("App exception callback received from Analytics listener.");
                    } else {
                        L5.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    L5.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f5163e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M5.b
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f5163e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
