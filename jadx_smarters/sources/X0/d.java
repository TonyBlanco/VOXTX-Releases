package X0;

import Q0.k;
import android.content.Context;
import c1.InterfaceC1247a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f10375f = k.f("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1247a f10376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10378c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f10379d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10380e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f10381a;

        public a(List list) {
            this.f10381a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f10381a.iterator();
            while (it.hasNext()) {
                ((V0.a) it.next()).a(d.this.f10380e);
            }
        }
    }

    public d(Context context, InterfaceC1247a interfaceC1247a) {
        this.f10377b = context.getApplicationContext();
        this.f10376a = interfaceC1247a;
    }

    public void a(V0.a aVar) {
        synchronized (this.f10378c) {
            try {
                if (this.f10379d.add(aVar)) {
                    if (this.f10379d.size() == 1) {
                        this.f10380e = b();
                        k.c().a(f10375f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f10380e), new Throwable[0]);
                        e();
                    }
                    aVar.a(this.f10380e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object b();

    public void c(V0.a aVar) {
        synchronized (this.f10378c) {
            try {
                if (this.f10379d.remove(aVar) && this.f10379d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Object obj) {
        synchronized (this.f10378c) {
            try {
                Object obj2 = this.f10380e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f10380e = obj;
                    this.f10376a.a().execute(new a(new ArrayList(this.f10379d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
