package androidx.work.impl.foreground;

import Q0.e;
import Q0.k;
import R0.j;
import V0.c;
import V0.d;
import Z0.p;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import c1.InterfaceC1247a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a implements c, R0.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f17388l = k.f("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f17389a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f17390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1247a f17391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17392e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f17394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f17395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f17396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f17397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f17398k;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0205a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WorkDatabase f17399a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f17400c;

        public RunnableC0205a(WorkDatabase workDatabase, String str) {
            this.f17399a = workDatabase;
            this.f17400c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVarH = this.f17399a.B().h(this.f17400c);
            if (pVarH == null || !pVarH.b()) {
                return;
            }
            synchronized (a.this.f17392e) {
                a.this.f17395h.put(this.f17400c, pVarH);
                a.this.f17396i.add(pVarH);
                a aVar = a.this;
                aVar.f17397j.d(aVar.f17396i);
            }
        }
    }

    public interface b {
        void a(int i9, Notification notification);

        void c(int i9, int i10, Notification notification);

        void d(int i9);

        void stop();
    }

    public a(Context context) {
        this.f17389a = context;
        j jVarM = j.m(context);
        this.f17390c = jVarM;
        InterfaceC1247a interfaceC1247aR = jVarM.r();
        this.f17391d = interfaceC1247aR;
        this.f17393f = null;
        this.f17394g = new LinkedHashMap();
        this.f17396i = new HashSet();
        this.f17395h = new HashMap();
        this.f17397j = new d(this.f17389a, interfaceC1247aR, this);
        this.f17390c.o().c(this);
    }

    public static Intent a(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // V0.c
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k.c().a(f17388l, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f17390c.y(str);
        }
    }

    @Override // R0.b
    public void d(String str, boolean z9) {
        Map.Entry entry;
        synchronized (this.f17392e) {
            try {
                p pVar = (p) this.f17395h.remove(str);
                if (pVar != null ? this.f17396i.remove(pVar) : false) {
                    this.f17397j.d(this.f17396i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = (e) this.f17394g.remove(str);
        if (str.equals(this.f17393f) && this.f17394g.size() > 0) {
            Iterator it = this.f17394g.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.f17393f = (String) entry.getKey();
            if (this.f17398k != null) {
                e eVar2 = (e) entry.getValue();
                this.f17398k.c(eVar2.c(), eVar2.a(), eVar2.b());
                this.f17398k.d(eVar2.c());
            }
        }
        b bVar = this.f17398k;
        if (eVar == null || bVar == null) {
            return;
        }
        k.c().a(f17388l, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(eVar.c()), str, Integer.valueOf(eVar.a())), new Throwable[0]);
        bVar.d(eVar.c());
    }

    @Override // V0.c
    public void f(List list) {
    }

    public final void g(Intent intent) {
        k.c().d(f17388l, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f17390c.h(UUID.fromString(stringExtra));
    }

    public final void h(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        k.c().a(f17388l, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f17398k == null) {
            return;
        }
        this.f17394g.put(stringExtra, new e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f17393f)) {
            this.f17393f = stringExtra;
            this.f17398k.c(intExtra, intExtra2, notification);
            return;
        }
        this.f17398k.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f17394g.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((e) ((Map.Entry) it.next()).getValue()).a();
        }
        e eVar = (e) this.f17394g.get(this.f17393f);
        if (eVar != null) {
            this.f17398k.c(eVar.c(), iA, eVar.b());
        }
    }

    public final void i(Intent intent) {
        k.c().d(f17388l, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f17391d.b(new RunnableC0205a(this.f17390c.q(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void j(Intent intent) {
        k.c().d(f17388l, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f17398k;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void k() {
        this.f17398k = null;
        synchronized (this.f17392e) {
            this.f17397j.e();
        }
        this.f17390c.o().i(this);
    }

    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                g(intent);
                return;
            } else {
                if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    j(intent);
                    return;
                }
                return;
            }
        }
        h(intent);
    }

    public void m(b bVar) {
        if (this.f17398k != null) {
            k.c().b(f17388l, "A callback already exists.", new Throwable[0]);
        } else {
            this.f17398k = bVar;
        }
    }
}
