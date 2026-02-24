package de.blinkt.openvpn.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static z f40120f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f40123c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40121a = "org.torproject.android.intent.extra.SOCKS_PROXY_HOST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40122b = "org.torproject.android.intent.extra.SOCKS_PROXY_PORT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f40124d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BroadcastReceiver f40125e = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), "org.torproject.android.intent.action.STATUS")) {
                Iterator it = z.this.f40124d.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).b(intent);
                }
                String stringExtra = intent.getStringExtra("org.torproject.android.intent.extra.STATUS");
                if (!TextUtils.equals(stringExtra, "ON")) {
                    if (TextUtils.equals(stringExtra, "STARTS_DISABLED")) {
                        Iterator it2 = z.this.f40124d.iterator();
                        while (it2.hasNext()) {
                            ((b) it2.next()).d(intent);
                        }
                        return;
                    }
                    return;
                }
                int intExtra = intent.getIntExtra(z.this.f40122b, 9050);
                String stringExtra2 = intent.getStringExtra(z.this.f40121a);
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = "127.0.0.1";
                }
                Iterator it3 = z.this.f40124d.iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).c(intent, stringExtra2, intExtra);
                }
            }
        }
    }

    public interface b {
        void a();

        void b(Intent intent);

        void c(Intent intent, String str, int i9);

        void d(Intent intent);
    }

    public static boolean c(Context context) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(e(context), 0);
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }

    public static z d(OpenVPNService openVPNService) {
        if (f40120f == null) {
            f40120f = new z();
        }
        return f40120f;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent("org.torproject.android.intent.action.START");
        intent.setPackage("org.torproject.android");
        intent.putExtra("org.torproject.android.intent.extra.PACKAGE_NAME", context.getPackageName());
        return intent;
    }

    public synchronized z b(Context context, b bVar) {
        try {
            if (this.f40124d.size() == 0) {
                context.getApplicationContext().registerReceiver(this.f40125e, new IntentFilter("org.torproject.android.intent.action.STATUS"));
                this.f40123c = context.getApplicationContext();
            }
            if (!c(context)) {
                bVar.a();
            }
            this.f40124d.add(bVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized void f(b bVar) {
        this.f40124d.remove(bVar);
        if (this.f40124d.size() == 0) {
            this.f40123c.unregisterReceiver(this.f40125e);
        }
    }

    public void g() {
        Context context = this.f40123c;
        context.sendBroadcast(e(context));
    }
}
