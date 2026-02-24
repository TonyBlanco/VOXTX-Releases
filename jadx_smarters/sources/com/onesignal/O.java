package com.onesignal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.F1;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f38398c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f38400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Thread f38401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f38402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Location f38403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f38404i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f38396a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ConcurrentHashMap f38397b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f38399d = new a();

    public class a {
    }

    public interface b {
        void a(d dVar);

        f getType();
    }

    public static class c extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f38405a;

        public c() {
            super("OSH_LocationHandlerThread");
            start();
            this.f38405a = new Handler(getLooper());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f38406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Double f38407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Float f38408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f38409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Boolean f38410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f38411f;

        public String toString() {
            return "LocationPoint{lat=" + this.f38406a + ", log=" + this.f38407b + ", accuracy=" + this.f38408c + ", type=" + this.f38409d + ", bg=" + this.f38410e + ", timeStamp=" + this.f38411f + '}';
        }
    }

    public static abstract class e implements b {
        public void b(F1.z zVar) {
        }
    }

    public enum f {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    public static void a(b bVar) {
        if (bVar instanceof e) {
            List list = f38396a;
            synchronized (list) {
                list.add((e) bVar);
            }
        }
    }

    public static void b(Context context, boolean z9, boolean z10) {
        A a9 = X1.f38626a.a(context, context.getPackageName(), 4096);
        if (!a9.b() || a9.a() == null) {
            n(z9, F1.z.ERROR);
            return;
        }
        if (Arrays.asList(a9.a().requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            f38404i = "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        if (f38404i != null && z9) {
            P.f38435a.d(z10, f38404i);
        } else {
            n(z9, F1.z.PERMISSION_GRANTED);
            p();
        }
    }

    public static void c(d dVar) {
        Thread thread;
        HashMap map = new HashMap();
        synchronized (O.class) {
            map.putAll(f38397b);
            f38397b.clear();
            thread = f38401f;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((b) map.get((f) it.next())).a(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f38401f) {
            synchronized (O.class) {
                try {
                    if (thread == f38401f) {
                        f38401f = null;
                    }
                } finally {
                }
            }
        }
        o(F1.v0().a());
    }

    public static void d(Location location) {
        double longitude;
        F1.a(F1.v.DEBUG, "LocationController fireCompleteForLocation with location: " + location);
        d dVar = new d();
        dVar.f38408c = Float.valueOf(location.getAccuracy());
        dVar.f38410e = Boolean.valueOf(F1.N0() ^ true);
        dVar.f38409d = Integer.valueOf(!f38398c ? 1 : 0);
        dVar.f38411f = Long.valueOf(location.getTime());
        if (f38398c) {
            BigDecimal bigDecimal = new BigDecimal(location.getLatitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            dVar.f38406a = Double.valueOf(bigDecimal.setScale(7, roundingMode).doubleValue());
            longitude = new BigDecimal(location.getLongitude()).setScale(7, roundingMode).doubleValue();
        } else {
            dVar.f38406a = Double.valueOf(location.getLatitude());
            longitude = location.getLongitude();
        }
        dVar.f38407b = Double.valueOf(longitude);
        c(dVar);
        m(f38402g);
    }

    public static void e() {
        synchronized (f38399d) {
            try {
                if (j()) {
                    AbstractC1592v.e();
                } else if (k()) {
                    D.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(null);
    }

    public static long f() {
        return R1.d(R1.f38511a, "OS_LAST_LOCATION_TIME", -600000L);
    }

    public static void g(Context context, boolean z9, boolean z10, b bVar) {
        int iA;
        a(bVar);
        f38402g = context;
        f38397b.put(bVar.getType(), bVar);
        if (!F1.P0()) {
            n(z9, F1.z.ERROR);
            e();
            return;
        }
        int iA2 = AbstractC1551h.a(context, "android.permission.ACCESS_FINE_LOCATION");
        if (iA2 == -1) {
            iA = AbstractC1551h.a(context, "android.permission.ACCESS_COARSE_LOCATION");
            f38398c = true;
        } else {
            iA = -1;
        }
        int i9 = Build.VERSION.SDK_INT;
        int iA3 = i9 >= 29 ? AbstractC1551h.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") : -1;
        if (i9 < 23) {
            if (iA2 != 0 && iA != 0) {
                n(z9, F1.z.LOCATION_PERMISSIONS_MISSING_MANIFEST);
                bVar.a(null);
                return;
            }
        } else if (iA2 != 0) {
            A a9 = X1.f38626a.a(context, context.getPackageName(), 4096);
            if (!a9.b() || a9.a() == null) {
                n(z9, F1.z.ERROR);
                return;
            }
            List listAsList = Arrays.asList(a9.a().requestedPermissions);
            F1.z zVar = F1.z.PERMISSION_DENIED;
            if (listAsList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                f38404i = "android.permission.ACCESS_FINE_LOCATION";
            } else if (!listAsList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                F1.c1(F1.v.INFO, "Location permissions not added on AndroidManifest file");
                zVar = F1.z.LOCATION_PERMISSIONS_MISSING_MANIFEST;
            } else if (iA != 0) {
                f38404i = "android.permission.ACCESS_COARSE_LOCATION";
            } else if (i9 >= 29 && listAsList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                f38404i = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (f38404i != null && z9) {
                P.f38435a.d(z10, f38404i);
                return;
            } else if (iA != 0) {
                n(z9, zVar);
                e();
                return;
            }
        } else if (i9 >= 29 && iA3 != 0) {
            b(context, z9, z10);
            return;
        }
        n(z9, F1.z.PERMISSION_GRANTED);
        p();
    }

    public static c h() {
        if (f38400e == null) {
            synchronized (f38399d) {
                try {
                    if (f38400e == null) {
                        f38400e = new c();
                    }
                } finally {
                }
            }
        }
        return f38400e;
    }

    public static boolean i(Context context) {
        return AbstractC1551h.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC1551h.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static boolean j() {
        return OSUtils.B() && OSUtils.s();
    }

    public static boolean k() {
        return OSUtils.G() && OSUtils.v();
    }

    public static void l() {
        synchronized (f38399d) {
            try {
                if (j()) {
                    AbstractC1592v.l();
                } else {
                    if (k()) {
                        D.l();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean m(Context context) {
        F1.v vVar;
        String str;
        if (!i(context)) {
            vVar = F1.v.DEBUG;
            str = "LocationController scheduleUpdate not possible, location permission not enabled";
        } else {
            if (F1.P0()) {
                long jA = F1.v0().a() - f();
                long j9 = (F1.N0() ? 300L : 600L) * 1000;
                F1.c1(F1.v.DEBUG, "LocationController scheduleUpdate lastTime: " + jA + " minTime: " + j9);
                C1574o1.q().r(context, j9 - jA);
                return true;
            }
            vVar = F1.v.DEBUG;
            str = "LocationController scheduleUpdate not possible, location shared not enabled";
        }
        F1.c1(vVar, str);
        return false;
    }

    public static void n(boolean z9, F1.z zVar) {
        if (!z9) {
            F1.c1(F1.v.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List list = f38396a;
        synchronized (list) {
            try {
                F1.c1(F1.v.DEBUG, "LocationController calling prompt handlers");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).b(zVar);
                }
                f38396a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o(long j9) {
        R1.l(R1.f38511a, "OS_LAST_LOCATION_TIME", j9);
    }

    public static void p() {
        F1.a(F1.v.DEBUG, "LocationController startGetLocation with lastLocation: " + f38403h);
        try {
            if (j()) {
                AbstractC1592v.p();
            } else if (k()) {
                D.p();
            } else {
                F1.a(F1.v.WARN, "LocationController startGetLocation not possible, no location dependency found");
                e();
            }
        } catch (Throwable th) {
            F1.b(F1.v.WARN, "Location permission exists but there was an error initializing: ", th);
            e();
        }
    }
}
