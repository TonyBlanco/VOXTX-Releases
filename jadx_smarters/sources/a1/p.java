package a1;

import Q0.t;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import b1.C1199c;
import c1.InterfaceC1247a;
import java.util.UUID;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public class p implements Q0.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11483d = Q0.k.f("WMFgUpdater");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1247a f11484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y0.a f11485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z0.q f11486c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1199c f11487a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UUID f11488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q0.e f11489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f11490e;

        public a(C1199c c1199c, UUID uuid, Q0.e eVar, Context context) {
            this.f11487a = c1199c;
            this.f11488c = uuid;
            this.f11489d = eVar;
            this.f11490e = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f11487a.isCancelled()) {
                    String string = this.f11488c.toString();
                    t tVarG = p.this.f11486c.g(string);
                    if (tVarG == null || tVarG.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    p.this.f11485b.b(string, this.f11489d);
                    this.f11490e.startService(androidx.work.impl.foreground.a.a(this.f11490e, string, this.f11489d));
                }
                this.f11487a.p(null);
            } catch (Throwable th) {
                this.f11487a.q(th);
            }
        }
    }

    public p(WorkDatabase workDatabase, Y0.a aVar, InterfaceC1247a interfaceC1247a) {
        this.f11485b = aVar;
        this.f11484a = interfaceC1247a;
        this.f11486c = workDatabase.B();
    }

    @Override // Q0.f
    public InterfaceFutureC2987b a(Context context, UUID uuid, Q0.e eVar) {
        C1199c c1199cT = C1199c.t();
        this.f11484a.b(new a(c1199cT, uuid, eVar, context));
        return c1199cT;
    }
}
