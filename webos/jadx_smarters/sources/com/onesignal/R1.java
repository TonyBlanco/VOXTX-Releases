package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.F1;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class R1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f38511a = F1.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap f38512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f38513c;

    public static class a extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f38514a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f38515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f38516d;

        /* JADX INFO: renamed from: com.onesignal.R1$a$a, reason: collision with other inner class name */
        public class RunnableC0300a implements Runnable {
            public RunnableC0300a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        public a(String str) {
            super(str);
            this.f38515c = 0L;
        }

        public final void c() {
            for (String str : R1.f38512b.keySet()) {
                SharedPreferences.Editor editorEdit = R1.e(str).edit();
                HashMap map = (HashMap) R1.f38512b.get(str);
                synchronized (map) {
                    try {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            if (obj instanceof String) {
                                editorEdit.putString(str2, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(str2, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Integer) {
                                editorEdit.putInt(str2, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(str2, ((Long) obj).longValue());
                            } else if (obj instanceof Set) {
                                editorEdit.putStringSet(str2, (Set) obj);
                            } else if (obj == null) {
                                editorEdit.remove(str2);
                            }
                        }
                        map.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                editorEdit.apply();
            }
            this.f38515c = F1.v0().a();
        }

        public final synchronized void d() {
            try {
                Handler handler = this.f38514a;
                if (handler == null) {
                    return;
                }
                handler.removeCallbacksAndMessages(null);
                if (this.f38515c == 0) {
                    this.f38515c = F1.v0().a();
                }
                long jA = (this.f38515c - F1.v0().a()) + 200;
                this.f38514a.postDelayed(new RunnableC0300a(), jA);
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void e() {
            if (F1.f38270b == null) {
                return;
            }
            f();
            d();
        }

        public final void f() {
            if (this.f38516d) {
                return;
            }
            start();
            this.f38516d = true;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.f38514a = new Handler(getLooper());
            d();
        }
    }

    static {
        h();
    }

    public static Object a(String str, String str2, Class cls, Object obj) {
        HashMap map = (HashMap) f38512b.get(str);
        synchronized (map) {
            try {
                if (cls.equals(Object.class) && map.containsKey(str2)) {
                    return Boolean.TRUE;
                }
                Object obj2 = map.get(str2);
                if (obj2 == null && !map.containsKey(str2)) {
                    SharedPreferences sharedPreferencesE = e(str);
                    if (sharedPreferencesE == null) {
                        return obj;
                    }
                    if (cls.equals(String.class)) {
                        return sharedPreferencesE.getString(str2, (String) obj);
                    }
                    if (cls.equals(Boolean.class)) {
                        return Boolean.valueOf(sharedPreferencesE.getBoolean(str2, ((Boolean) obj).booleanValue()));
                    }
                    if (cls.equals(Integer.class)) {
                        return Integer.valueOf(sharedPreferencesE.getInt(str2, ((Integer) obj).intValue()));
                    }
                    if (cls.equals(Long.class)) {
                        return Long.valueOf(sharedPreferencesE.getLong(str2, ((Long) obj).longValue()));
                    }
                    if (cls.equals(Set.class)) {
                        return sharedPreferencesE.getStringSet(str2, (Set) obj);
                    }
                    if (cls.equals(Object.class)) {
                        return Boolean.valueOf(sharedPreferencesE.contains(str2));
                    }
                    return null;
                }
                return obj2;
            } finally {
            }
        }
    }

    public static boolean b(String str, String str2, boolean z9) {
        return ((Boolean) a(str, str2, Boolean.class, Boolean.valueOf(z9))).booleanValue();
    }

    public static int c(String str, String str2, int i9) {
        return ((Integer) a(str, str2, Integer.class, Integer.valueOf(i9))).intValue();
    }

    public static long d(String str, String str2, long j9) {
        return ((Long) a(str, str2, Long.class, Long.valueOf(j9))).longValue();
    }

    public static synchronized SharedPreferences e(String str) {
        Context context = F1.f38270b;
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        F1.b(F1.v.WARN, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
        return null;
    }

    public static String f(String str, String str2, String str3) {
        return (String) a(str, str2, String.class, str3);
    }

    public static Set g(String str, String str2, Set set) {
        return (Set) a(str, str2, Set.class, set);
    }

    public static void h() {
        HashMap map = new HashMap();
        f38512b = map;
        map.put(f38511a, new HashMap());
        f38512b.put("GTPlayerPurchases", new HashMap());
        f38512b.put("OneSignalTriggers", new HashMap());
        f38513c = new a("OSH_WritePrefs");
    }

    public static void i(String str, String str2, Object obj) {
        HashMap map = (HashMap) f38512b.get(str);
        synchronized (map) {
            map.put(str2, obj);
        }
        o();
    }

    public static void j(String str, String str2, boolean z9) {
        i(str, str2, Boolean.valueOf(z9));
    }

    public static void k(String str, String str2, int i9) {
        i(str, str2, Integer.valueOf(i9));
    }

    public static void l(String str, String str2, long j9) {
        i(str, str2, Long.valueOf(j9));
    }

    public static void m(String str, String str2, String str3) {
        i(str, str2, str3);
    }

    public static void n(String str, String str2, Set set) {
        i(str, str2, set);
    }

    public static void o() {
        f38513c.e();
    }
}
