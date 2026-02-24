package androidx.work.impl;

import C0.d;
import C0.e;
import G0.c;
import R0.h;
import Z0.k;
import Z0.n;
import Z0.q;
import Z0.t;
import android.content.Context;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f17305l = TimeUnit.DAYS.toMillis(1);

    public class a implements c.InterfaceC0032c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17306a;

        public a(Context context) {
            this.f17306a = context;
        }

        @Override // G0.c.InterfaceC0032c
        public c a(c.b bVar) {
            c.b.a aVarA = c.b.a(this.f17306a);
            aVarA.c(bVar.f2138b).b(bVar.f2139c).d(true);
            return new H0.c().a(aVarA.a());
        }
    }

    public class b extends e.b {
        @Override // C0.e.b
        public void c(G0.b bVar) {
            super.c(bVar);
            bVar.u();
            try {
                bVar.C(WorkDatabase.w());
                bVar.G();
            } finally {
                bVar.I();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z9) {
        e.a aVarA;
        if (z9) {
            aVarA = d.c(context, WorkDatabase.class).c();
        } else {
            aVarA = d.a(context, WorkDatabase.class, h.d());
            aVarA.f(new a(context));
        }
        return (WorkDatabase) aVarA.g(executor).a(u()).b(androidx.work.impl.a.f17315a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f17316b).b(androidx.work.impl.a.f17317c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f17318d).b(androidx.work.impl.a.f17319e).b(androidx.work.impl.a.f17320f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f17321g).e().d();
    }

    public static e.b u() {
        return new b();
    }

    public static long v() {
        return System.currentTimeMillis() - f17305l;
    }

    public static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract Z0.b t();

    public abstract Z0.e x();

    public abstract Z0.h y();

    public abstract k z();
}
