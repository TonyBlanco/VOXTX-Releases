package com.onesignal;

import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.methods.HttpPut;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T1 {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38583a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f38585d;

        public a(String str, JSONObject jSONObject, g gVar) {
            this.f38583a = str;
            this.f38584c = jSONObject;
            this.f38585d = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            T1.h(this.f38583a, HttpPut.METHOD_NAME, this.f38584c, this.f38585d, 120000, null);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38586a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f38588d;

        public b(String str, JSONObject jSONObject, g gVar) {
            this.f38586a = str;
            this.f38587c = jSONObject;
            this.f38588d = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            T1.h(this.f38586a, "POST", this.f38587c, this.f38588d, 120000, null);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38589a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f38590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38591d;

        public c(String str, g gVar, String str2) {
            this.f38589a = str;
            this.f38590c = gVar;
            this.f38591d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            T1.h(this.f38589a, null, null, this.f38590c, DateTimeConstants.MILLIS_PER_MINUTE, this.f38591d);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Thread[] f38592a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38594d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g f38596f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f38597g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f38598h;

        public d(Thread[] threadArr, String str, String str2, JSONObject jSONObject, g gVar, int i9, String str3) {
            this.f38592a = threadArr;
            this.f38593c = str;
            this.f38594d = str2;
            this.f38595e = jSONObject;
            this.f38596f = gVar;
            this.f38597g = i9;
            this.f38598h = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38592a[0] = T1.n(this.f38593c, this.f38594d, this.f38595e, this.f38596f, this.f38597g, this.f38598h);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f38599a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38600c;

        public e(g gVar, String str) {
            this.f38599a = gVar;
            this.f38600c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38599a.b(this.f38600c);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f38601a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f38603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Throwable f38604e;

        public f(g gVar, int i9, String str, Throwable th) {
            this.f38601a = gVar;
            this.f38602c = i9;
            this.f38603d = str;
            this.f38604e = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38601a.a(this.f38602c, this.f38603d, this.f38604e);
        }
    }

    public static abstract class g {
        public void a(int i9, String str, Throwable th) {
        }

        public void b(String str) {
        }
    }

    public static Thread c(g gVar, int i9, String str, Throwable th) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new f(gVar, i9, str, th), "OS_REST_FAILURE_CALLBACK");
        OSUtils.W(thread);
        return thread;
    }

    public static Thread d(g gVar, String str) {
        if (gVar == null) {
            return null;
        }
        Thread thread = new Thread(new e(gVar, str), "OS_REST_SUCCESS_CALLBACK");
        OSUtils.W(thread);
        return thread;
    }

    public static void e(String str, g gVar, String str2) {
        OSUtils.W(new Thread(new c(str, gVar, str2), "OS_REST_ASYNC_GET"));
    }

    public static void f(String str, g gVar, String str2) {
        h(str, null, null, gVar, DateTimeConstants.MILLIS_PER_MINUTE, str2);
    }

    public static int g(int i9) {
        return i9 + 5000;
    }

    public static void h(String str, String str2, JSONObject jSONObject, g gVar, int i9, String str3) {
        if (OSUtils.H()) {
            throw new C1585s1("Method: " + str2 + " was called from the Main Thread!");
        }
        if (str2 == null || !F1.I1(null)) {
            Thread[] threadArr = new Thread[1];
            Thread thread = new Thread(new d(threadArr, str, str2, jSONObject, gVar, i9, str3), "OS_HTTPConnection");
            OSUtils.W(thread);
            try {
                thread.join(g(i9));
                if (thread.getState() != Thread.State.TERMINATED) {
                    thread.interrupt();
                }
                Thread thread2 = threadArr[0];
                if (thread2 != null) {
                    thread2.join();
                }
            } catch (InterruptedException e9) {
                e9.printStackTrace();
            }
        }
    }

    public static HttpURLConnection i(String str) {
        return (HttpURLConnection) new URL("TryRoom" + str).openConnection();
    }

    public static void j(String str, JSONObject jSONObject, g gVar) {
        OSUtils.W(new Thread(new b(str, jSONObject, gVar), "OS_REST_ASYNC_POST"));
    }

    public static void k(String str, JSONObject jSONObject, g gVar) {
        h(str, "POST", jSONObject, gVar, 120000, null);
    }

    public static void l(String str, JSONObject jSONObject, g gVar) {
        OSUtils.W(new Thread(new a(str, jSONObject, gVar), "OS_REST_ASYNC_PUT"));
    }

    public static void m(String str, JSONObject jSONObject, g gVar) {
        h(str, HttpPut.METHOD_NAME, jSONObject, gVar, 120000, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c A[Catch: all -> 0x004b, TryCatch #3 {all -> 0x004b, blocks: (B:9:0x0037, B:11:0x003b, B:14:0x004e, B:16:0x007c, B:18:0x0081, B:21:0x0092, B:24:0x00c3, B:26:0x00da, B:27:0x00f3, B:35:0x0123, B:37:0x013d, B:39:0x0143, B:41:0x0152, B:42:0x0156, B:44:0x0198, B:43:0x0175, B:45:0x019e, B:49:0x01c0), top: B:96:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:9:0x0037, B:11:0x003b, B:14:0x004e, B:16:0x007c, B:18:0x0081, B:21:0x0092, B:24:0x00c3, B:26:0x00da, B:27:0x00f3, B:35:0x0123, B:37:0x013d, B:39:0x0143, B:41:0x0152, B:42:0x0156, B:44:0x0198, B:43:0x0175, B:45:0x019e, B:49:0x01c0), top: B:96:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:9:0x0037, B:11:0x003b, B:14:0x004e, B:16:0x007c, B:18:0x0081, B:21:0x0092, B:24:0x00c3, B:26:0x00da, B:27:0x00f3, B:35:0x0123, B:37:0x013d, B:39:0x0143, B:41:0x0152, B:42:0x0156, B:44:0x0198, B:43:0x0175, B:45:0x019e, B:49:0x01c0), top: B:96:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #3 {all -> 0x004b, blocks: (B:9:0x0037, B:11:0x003b, B:14:0x004e, B:16:0x007c, B:18:0x0081, B:21:0x0092, B:24:0x00c3, B:26:0x00da, B:27:0x00f3, B:35:0x0123, B:37:0x013d, B:39:0x0143, B:41:0x0152, B:42:0x0156, B:44:0x0198, B:43:0x0175, B:45:0x019e, B:49:0x01c0), top: B:96:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d8 A[Catch: all -> 0x027b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x027b, blocks: (B:28:0x00f7, B:51:0x01d8), top: B:94:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0201 A[Catch: all -> 0x0206, TryCatch #1 {all -> 0x0206, blocks: (B:53:0x01df, B:55:0x0201, B:58:0x020b, B:62:0x021a, B:64:0x022c, B:66:0x0234, B:67:0x0273), top: B:92:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a7 A[Catch: all -> 0x02a5, TryCatch #0 {all -> 0x02a5, blocks: (B:73:0x0281, B:75:0x0285, B:78:0x028a, B:83:0x02c6, B:82:0x02a7), top: B:90:0x0281 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Thread n(java.lang.String r16, java.lang.String r17, org.json.JSONObject r18, com.onesignal.T1.g r19, int r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.T1.n(java.lang.String, java.lang.String, org.json.JSONObject, com.onesignal.T1$g, int, java.lang.String):java.lang.Thread");
    }
}
