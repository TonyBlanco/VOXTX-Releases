package a1;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public R0.j f11463a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WorkerParameters.a f11465d;

    public l(R0.j jVar, String str, WorkerParameters.a aVar) {
        this.f11463a = jVar;
        this.f11464c = str;
        this.f11465d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11463a.o().k(this.f11464c, this.f11465d);
    }
}
