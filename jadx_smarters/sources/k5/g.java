package K5;

import O5.AbstractC0945i;
import O5.AbstractC0958w;
import O5.C0937a;
import O5.C0942f;
import O5.C0946j;
import O5.C0951o;
import O5.C0956u;
import O5.y;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j6.InterfaceC2101a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import k6.h;
import t6.l;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0951o f3818a;

    public class a implements Continuation {
        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task task) {
            if (task.isSuccessful()) {
                return null;
            }
            L5.f.f().e("Error fetching settings.", task.getException());
            return null;
        }
    }

    public class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f3819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0951o f3820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V5.f f3821c;

        public b(boolean z9, C0951o c0951o, V5.f fVar) {
            this.f3819a = z9;
            this.f3820b = c0951o;
            this.f3821c = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!this.f3819a) {
                return null;
            }
            this.f3820b.g(this.f3821c);
            return null;
        }
    }

    public g(C0951o c0951o) {
        this.f3818a = c0951o;
    }

    public static g a(A5.f fVar, h hVar, l lVar, InterfaceC2101a interfaceC2101a, InterfaceC2101a interfaceC2101a2) {
        Context contextL = fVar.l();
        String packageName = contextL.getPackageName();
        L5.f.f().g("Initializing Firebase Crashlytics " + C0951o.i() + " for " + packageName);
        T5.f fVar2 = new T5.f(contextL);
        C0956u c0956u = new C0956u(fVar);
        y yVar = new y(contextL, packageName, hVar, c0956u);
        L5.d dVar = new L5.d(interfaceC2101a);
        d dVar2 = new d(interfaceC2101a2);
        ExecutorService executorServiceC = AbstractC0958w.c("Crashlytics Exception Handler");
        C0946j c0946j = new C0946j(c0956u);
        lVar.c(c0946j);
        C0951o c0951o = new C0951o(fVar, yVar, dVar, c0956u, dVar2.e(), dVar2.d(), fVar2, executorServiceC, c0946j);
        String strC = fVar.p().c();
        String strO = AbstractC0945i.o(contextL);
        List<C0942f> listL = AbstractC0945i.l(contextL);
        L5.f.f().b("Mapping file ID is: " + strO);
        for (C0942f c0942f : listL) {
            L5.f.f().b(String.format("Build id for %s on %s: %s", c0942f.c(), c0942f.a(), c0942f.b()));
        }
        try {
            C0937a c0937aA = C0937a.a(contextL, yVar, strC, strO, listL, new L5.e(contextL));
            L5.f.f().i("Installer package name is: " + c0937aA.f6552d);
            ExecutorService executorServiceC2 = AbstractC0958w.c("com.google.firebase.crashlytics.startup");
            V5.f fVarL = V5.f.l(contextL, strC, yVar, new S5.b(), c0937aA.f6554f, c0937aA.f6555g, fVar2, c0956u);
            fVarL.p(executorServiceC2).continueWith(executorServiceC2, new a());
            Tasks.call(executorServiceC2, new b(c0951o.n(c0937aA, fVarL), c0951o, fVarL));
            return new g(c0951o);
        } catch (PackageManager.NameNotFoundException e9) {
            L5.f.f().e("Error retrieving app package info.", e9);
            return null;
        }
    }
}
