package u0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u0.AbstractC2808H;
import u0.i0;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f51091b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PackageManager f51093d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51095f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f51094e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BroadcastReceiver f51096g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f51097h = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f51092c = new Handler();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            k0.this.g();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.g();
        }
    }

    public interface c {
        void a(AbstractC2808H abstractC2808H);

        void b(AbstractC2808H abstractC2808H);

        void d(i0 i0Var, AbstractC2808H.e eVar);
    }

    public k0(Context context, c cVar) {
        this.f51090a = context;
        this.f51091b = cVar;
        this.f51093d = context.getPackageManager();
    }

    public static boolean e(List list, ServiceInfo serviceInfo) {
        if (serviceInfo != null && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo2 = (ServiceInfo) it.next();
                if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(String str, String str2) {
        int size = this.f51094e.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((i0) this.f51094e.get(i9)).G(str, str2)) {
                return i9;
            }
        }
        return -1;
    }

    public List c() {
        Intent intent = new Intent("android.media.MediaRoute2ProviderService");
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = this.f51093d.queryIntentServices(intent, 0).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().serviceInfo);
        }
        return arrayList;
    }

    public final /* synthetic */ void d(i0 i0Var, AbstractC2808H.e eVar) {
        this.f51091b.d(i0Var, eVar);
    }

    public void f() {
        this.f51092c.post(this.f51097h);
    }

    public void g() {
        int i9;
        if (this.f51095f) {
            List arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                arrayList = c();
            }
            int i10 = 0;
            Iterator<ResolveInfo> it = this.f51093d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && (!C2812L.p() || !e(arrayList, serviceInfo))) {
                    int iB = b(serviceInfo.packageName, serviceInfo.name);
                    if (iB < 0) {
                        final i0 i0Var = new i0(this.f51090a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        i0Var.P(new i0.b() { // from class: u0.j0
                            @Override // u0.i0.b
                            public final void a(AbstractC2808H.e eVar) {
                                this.f51088a.d(i0Var, eVar);
                            }
                        });
                        i0Var.R();
                        i9 = i10 + 1;
                        this.f51094e.add(i10, i0Var);
                        this.f51091b.a(i0Var);
                    } else if (iB >= i10) {
                        i0 i0Var2 = (i0) this.f51094e.get(iB);
                        i0Var2.R();
                        i0Var2.O();
                        i9 = i10 + 1;
                        Collections.swap(this.f51094e, iB, i10);
                    }
                    i10 = i9;
                }
            }
            if (i10 < this.f51094e.size()) {
                for (int size = this.f51094e.size() - 1; size >= i10; size--) {
                    i0 i0Var3 = (i0) this.f51094e.get(size);
                    this.f51091b.b(i0Var3);
                    this.f51094e.remove(i0Var3);
                    i0Var3.P(null);
                    i0Var3.S();
                }
            }
        }
    }

    public void h() {
        if (this.f51095f) {
            return;
        }
        this.f51095f = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        this.f51090a.registerReceiver(this.f51096g, intentFilter, null, this.f51092c);
        this.f51092c.post(this.f51097h);
    }
}
