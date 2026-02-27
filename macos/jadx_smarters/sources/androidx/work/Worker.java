package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import b1.C1199c;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1199c f17262g;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f17262g.p(Worker.this.r());
            } catch (Throwable th) {
                Worker.this.f17262g.q(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC2987b p() {
        this.f17262g = C1199c.t();
        c().execute(new a());
        return this.f17262g;
    }

    public abstract ListenableWorker.a r();
}
