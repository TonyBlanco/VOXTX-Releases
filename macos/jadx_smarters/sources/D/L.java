package D;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f1180d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c f1183g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f1185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1179c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Set f1181e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f1182f = new Object();

    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f1188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Notification f1189d;

        public a(String str, int i9, String str2, Notification notification) {
            this.f1186a = str;
            this.f1187b = i9;
            this.f1188c = str2;
            this.f1189d = notification;
        }

        @Override // D.L.d
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f1186a, this.f1187b, this.f1188c, this.f1189d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f1186a + ", id:" + this.f1187b + ", tag:" + this.f1188c + "]";
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f1190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f1191b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f1190a = componentName;
            this.f1191b = iBinder;
        }
    }

    public static class c implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1192a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HandlerThread f1193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f1194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Map f1195e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set f1196f = new HashSet();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentName f1197a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public INotificationSideChannel f1199c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f1198b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public ArrayDeque f1200d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f1201e = 0;

            public a(ComponentName componentName) {
                this.f1197a = componentName;
            }
        }

        public c(Context context) {
            this.f1192a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f1193c = handlerThread;
            handlerThread.start();
            this.f1194d = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f1198b) {
                return true;
            }
            boolean zBindService = this.f1192a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1197a), this, 33);
            aVar.f1198b = zBindService;
            if (zBindService) {
                aVar.f1201e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1197a);
                this.f1192a.unbindService(this);
            }
            return aVar.f1198b;
        }

        public final void b(a aVar) {
            if (aVar.f1198b) {
                this.f1192a.unbindService(this);
                aVar.f1198b = false;
            }
            aVar.f1199c = null;
        }

        public final void c(d dVar) {
            j();
            for (a aVar : this.f1195e.values()) {
                aVar.f1200d.add(dVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = (a) this.f1195e.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f1195e.get(componentName);
            if (aVar != null) {
                aVar.f1199c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f1201e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = (a) this.f1195e.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1197a + ", " + aVar.f1200d.size() + " queued tasks");
            }
            if (aVar.f1200d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f1199c == null) {
                i(aVar);
                return;
            }
            while (true) {
                d dVar = (d) aVar.f1200d.peek();
                if (dVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + dVar);
                    }
                    dVar.a(aVar.f1199c);
                    aVar.f1200d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f1197a);
                    }
                } catch (RemoteException e9) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1197a, e9);
                }
            }
            if (aVar.f1200d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(d dVar) {
            this.f1194d.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 0) {
                c((d) message.obj);
                return true;
            }
            if (i9 == 1) {
                b bVar = (b) message.obj;
                e(bVar.f1190a, bVar.f1191b);
                return true;
            }
            if (i9 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i9 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        public final void i(a aVar) {
            if (this.f1194d.hasMessages(3, aVar.f1197a)) {
                return;
            }
            int i9 = aVar.f1201e;
            int i10 = i9 + 1;
            aVar.f1201e = i10;
            if (i10 <= 6) {
                int i11 = (1 << i9) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f1194d.sendMessageDelayed(this.f1194d.obtainMessage(3, aVar.f1197a), i11);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1200d.size() + " tasks to " + aVar.f1197a + " after " + aVar.f1201e + " retries");
            aVar.f1200d.clear();
        }

        public final void j() {
            Set setE = L.e(this.f1192a);
            if (setE.equals(this.f1196f)) {
                return;
            }
            this.f1196f = setE;
            List<ResolveInfo> listQueryIntentServices = this.f1192a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setE.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f1195e.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f1195e.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f1195e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1194d.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1194d.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface d {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    public L(Context context) {
        this.f1184a = context;
        this.f1185b = (NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
    }

    public static L d(Context context) {
        return new L(context);
    }

    public static Set e(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1179c) {
            if (string != null) {
                try {
                    if (!string.equals(f1180d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f1181e = hashSet;
                        f1180d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f1181e;
        }
        return set;
    }

    public static boolean i(Notification notification) {
        Bundle bundleA = AbstractC0529l.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f1185b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1184a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1184a.getApplicationInfo();
        String packageName = this.f1184a.getApplicationContext().getPackageName();
        int i9 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i9), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i9) {
        c(null, i9);
    }

    public void c(String str, int i9) {
        this.f1185b.cancel(str, i9);
    }

    public void f(int i9, Notification notification) {
        g(null, i9, notification);
    }

    public void g(String str, int i9, Notification notification) {
        if (!i(notification)) {
            this.f1185b.notify(str, i9, notification);
        } else {
            h(new a(this.f1184a.getPackageName(), i9, str, notification));
            this.f1185b.cancel(str, i9);
        }
    }

    public final void h(d dVar) {
        synchronized (f1182f) {
            try {
                if (f1183g == null) {
                    f1183g = new c(this.f1184a.getApplicationContext());
                }
                f1183g.h(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
