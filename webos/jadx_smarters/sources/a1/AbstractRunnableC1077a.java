package a1;

import Q0.n;
import Q0.t;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: renamed from: a1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1077a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.c f11442a = new R0.c();

    /* JADX INFO: renamed from: a1.a$a, reason: collision with other inner class name */
    public class C0154a extends AbstractRunnableC1077a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ R0.j f11443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ UUID f11444d;

        public C0154a(R0.j jVar, UUID uuid) {
            this.f11443c = jVar;
            this.f11444d = uuid;
        }

        @Override // a1.AbstractRunnableC1077a
        public void h() {
            WorkDatabase workDatabaseQ = this.f11443c.q();
            workDatabaseQ.c();
            try {
                a(this.f11443c, this.f11444d.toString());
                workDatabaseQ.r();
                workDatabaseQ.g();
                g(this.f11443c);
            } catch (Throwable th) {
                workDatabaseQ.g();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a1.a$b */
    public class b extends AbstractRunnableC1077a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ R0.j f11445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f11446d;

        public b(R0.j jVar, String str) {
            this.f11445c = jVar;
            this.f11446d = str;
        }

        @Override // a1.AbstractRunnableC1077a
        public void h() {
            WorkDatabase workDatabaseQ = this.f11445c.q();
            workDatabaseQ.c();
            try {
                Iterator it = workDatabaseQ.B().i(this.f11446d).iterator();
                while (it.hasNext()) {
                    a(this.f11445c, (String) it.next());
                }
                workDatabaseQ.r();
                workDatabaseQ.g();
                g(this.f11445c);
            } catch (Throwable th) {
                workDatabaseQ.g();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a1.a$c */
    public class c extends AbstractRunnableC1077a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ R0.j f11447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f11448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f11449e;

        public c(R0.j jVar, String str, boolean z9) {
            this.f11447c = jVar;
            this.f11448d = str;
            this.f11449e = z9;
        }

        @Override // a1.AbstractRunnableC1077a
        public void h() {
            WorkDatabase workDatabaseQ = this.f11447c.q();
            workDatabaseQ.c();
            try {
                Iterator it = workDatabaseQ.B().e(this.f11448d).iterator();
                while (it.hasNext()) {
                    a(this.f11447c, (String) it.next());
                }
                workDatabaseQ.r();
                workDatabaseQ.g();
                if (this.f11449e) {
                    g(this.f11447c);
                }
            } catch (Throwable th) {
                workDatabaseQ.g();
                throw th;
            }
        }
    }

    public static AbstractRunnableC1077a b(UUID uuid, R0.j jVar) {
        return new C0154a(jVar, uuid);
    }

    public static AbstractRunnableC1077a c(String str, R0.j jVar, boolean z9) {
        return new c(jVar, str, z9);
    }

    public static AbstractRunnableC1077a d(String str, R0.j jVar) {
        return new b(jVar, str);
    }

    public void a(R0.j jVar, String str) {
        f(jVar.q(), str);
        jVar.o().l(str);
        Iterator it = jVar.p().iterator();
        while (it.hasNext()) {
            ((R0.e) it.next()).a(str);
        }
    }

    public Q0.n e() {
        return this.f11442a;
    }

    public final void f(WorkDatabase workDatabase, String str) {
        Z0.q qVarB = workDatabase.B();
        Z0.b bVarT = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            t tVarG = qVarB.g(str2);
            if (tVarG != t.SUCCEEDED && tVarG != t.FAILED) {
                qVarB.d(t.CANCELLED, str2);
            }
            linkedList.addAll(bVarT.a(str2));
        }
    }

    public void g(R0.j jVar) {
        R0.f.b(jVar.k(), jVar.q(), jVar.p());
    }

    public abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f11442a.a(Q0.n.f7464a);
        } catch (Throwable th) {
            this.f11442a.a(new n.b.a(th));
        }
    }
}
