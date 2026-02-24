package com.onesignal;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import com.amazonaws.services.s3.internal.Constants;
import com.onesignal.C1577p1;
import com.onesignal.F1;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.onesignal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1530a implements C1577p1.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f38640d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f38641e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f38642f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OSFocusHandler f38643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f38644b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38645c = false;

    /* JADX INFO: renamed from: com.onesignal.a$a, reason: collision with other inner class name */
    public class C0302a extends Thread {
        public C0302a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            F1.a0().c();
            C1530a.this.f38643a.k("FOCUS_LOST_WORKER_TAG", 2000L, F1.f38270b);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.a$b */
    public static abstract class b {
        public abstract void a(Activity activity);

        public void b(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: com.onesignal.a$c */
    public static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1577p1.c f38647a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1577p1.b f38648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f38649d;

        public c(C1577p1.b bVar, C1577p1.c cVar, String str) {
            this.f38648c = bVar;
            this.f38647a = cVar;
            this.f38649d = str;
        }

        public /* synthetic */ c(C1577p1.b bVar, C1577p1.c cVar, String str, C0302a c0302a) {
            this(bVar, cVar, str);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C1.l(new WeakReference(F1.P()))) {
                return;
            }
            this.f38648c.a(this.f38649d, this);
            this.f38647a.a();
        }
    }

    public C1530a(OSFocusHandler oSFocusHandler) {
        this.f38643a = oSFocusHandler;
    }

    @Override // com.onesignal.C1577p1.b
    public void a(String str, c cVar) {
        Activity activity = this.f38644b;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(cVar);
        }
        f38642f.remove(str);
        f38641e.remove(str);
    }

    public void c(String str, b bVar) {
        f38640d.put(str, bVar);
        Activity activity = this.f38644b;
        if (activity != null) {
            bVar.a(activity);
        }
    }

    public void d(String str, C1577p1.c cVar) {
        Activity activity = this.f38644b;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            c cVar2 = new c(this, cVar, str, null);
            viewTreeObserver.addOnGlobalLayoutListener(cVar2);
            f38642f.put(str, cVar2);
        }
        f38641e.put(str, cVar);
    }

    public Activity e() {
        return this.f38644b;
    }

    public final void f() {
        F1.v vVar = F1.v.DEBUG;
        F1.c1(vVar, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.f38645c);
        if (!this.f38643a.f() && !this.f38645c) {
            F1.c1(vVar, "ActivityLifecycleHandler cancel background lost focus worker");
            this.f38643a.e("FOCUS_LOST_WORKER_TAG", F1.f38270b);
        } else {
            F1.c1(vVar, "ActivityLifecycleHandler reset background state, call app focus");
            this.f38645c = false;
            this.f38643a.j();
        }
    }

    public final void g() {
        F1.c1(F1.v.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.f38643a;
        if (oSFocusHandler != null) {
            if (!oSFocusHandler.f() || this.f38643a.g()) {
                new C0302a().start();
            }
        }
    }

    public final void h() {
        String str;
        F1.v vVar = F1.v.DEBUG;
        StringBuilder sb = new StringBuilder();
        sb.append("curActivity is NOW: ");
        if (this.f38644b != null) {
            str = "" + this.f38644b.getClass().getName() + ":" + this.f38644b;
        } else {
            str = Constants.NULL_VERSION_ID;
        }
        sb.append(str);
        F1.a(vVar, sb.toString());
    }

    public final void i(int i9, Activity activity) {
        F1.v vVar;
        StringBuilder sb;
        String str;
        if (i9 == 2) {
            vVar = F1.v.DEBUG;
            sb = new StringBuilder();
            str = "Configuration Orientation Change: LANDSCAPE (";
        } else {
            if (i9 != 1) {
                return;
            }
            vVar = F1.v.DEBUG;
            sb = new StringBuilder();
            str = "Configuration Orientation Change: PORTRAIT (";
        }
        sb.append(str);
        sb.append(i9);
        sb.append(") on activity: ");
        sb.append(activity);
        F1.c1(vVar, sb.toString());
    }

    public void j(Activity activity) {
    }

    public void k(Activity activity) {
        F1.a(F1.v.DEBUG, "onActivityDestroyed: " + activity);
        f38642f.clear();
        if (activity == this.f38644b) {
            this.f38644b = null;
            g();
        }
        h();
    }

    public void l(Activity activity) {
        F1.a(F1.v.DEBUG, "onActivityPaused: " + activity);
        if (activity == this.f38644b) {
            this.f38644b = null;
            g();
        }
        h();
    }

    public void m(Activity activity) {
        F1.a(F1.v.DEBUG, "onActivityResumed: " + activity);
        s(activity);
        h();
        f();
    }

    public void n(Activity activity) {
        this.f38643a.l();
    }

    public void o(Activity activity) {
        F1.a(F1.v.DEBUG, "onActivityStopped: " + activity);
        if (activity == this.f38644b) {
            this.f38644b = null;
            g();
        }
        Iterator it = f38640d.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).b(activity);
        }
        h();
        if (this.f38644b == null) {
            this.f38643a.m();
        }
    }

    public void p(Configuration configuration, Activity activity) {
        Activity activity2 = this.f38644b;
        if (activity2 == null || !OSUtils.q(activity2, 128)) {
            return;
        }
        i(configuration.orientation, activity);
        q(activity);
    }

    public final void q(Activity activity) {
        g();
        Iterator it = f38640d.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).b(activity);
        }
        Iterator it2 = f38640d.entrySet().iterator();
        while (it2.hasNext()) {
            ((b) ((Map.Entry) it2.next()).getValue()).a(this.f38644b);
        }
        ViewTreeObserver viewTreeObserver = this.f38644b.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry entry : f38641e.entrySet()) {
            c cVar = new c(this, (C1577p1.c) entry.getValue(), (String) entry.getKey(), null);
            viewTreeObserver.addOnGlobalLayoutListener(cVar);
            f38642f.put((String) entry.getKey(), cVar);
        }
        f();
    }

    public void r(String str) {
        f38640d.remove(str);
    }

    public void s(Activity activity) {
        this.f38644b = activity;
        Iterator it = f38640d.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).a(this.f38644b);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f38644b.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry entry : f38641e.entrySet()) {
                c cVar = new c(this, (C1577p1.c) entry.getValue(), (String) entry.getKey(), null);
                viewTreeObserver.addOnGlobalLayoutListener(cVar);
                f38642f.put((String) entry.getKey(), cVar);
            }
        } catch (RuntimeException e9) {
            e9.printStackTrace();
        }
    }

    public void t(boolean z9) {
        this.f38645c = z9;
    }
}
