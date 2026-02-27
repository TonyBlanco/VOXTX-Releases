package M4;

import android.content.ComponentName;

/* JADX INFO: renamed from: M4.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0730d4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f4655a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0754h4 f4656c;

    public RunnableC0730d4(ServiceConnectionC0754h4 serviceConnectionC0754h4, ComponentName componentName) {
        this.f4656c = serviceConnectionC0754h4;
        this.f4655a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4.M(this.f4656c.f4724d, this.f4655a);
    }
}
