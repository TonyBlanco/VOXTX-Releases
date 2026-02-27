package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.squareup.okhttp.OkHttpClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StringBuilder f39036a = new StringBuilder();

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    public static class b {
        public static int a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    public static class c {
        public static int a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    public static class d {
        public static j a(Context context) {
            return new s(context);
        }
    }

    public static class e extends Thread {
        public e(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class f implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new e(runnable);
        }
    }

    public static long a(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), 5242880L);
    }

    public static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) p(context, "activity");
        boolean z9 = (context.getApplicationInfo().flags & Constants.MB) != 0;
        int memoryClass = activityManager.getMemoryClass();
        if (z9) {
            memoryClass = b.a(activityManager);
        }
        return (memoryClass * Constants.MB) / 7;
    }

    public static void c() {
        if (!s()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void e(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static j g(Context context) {
        try {
            int i9 = OkHttpClient.f39000a;
            return d.a(context);
        } catch (ClassNotFoundException unused) {
            return new F(context);
        }
    }

    public static String h(w wVar) {
        StringBuilder sb = f39036a;
        String strI = i(wVar, sb);
        sb.setLength(0);
        return strI;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(com.squareup.picasso.w r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.f39172f
            r1 = 50
            if (r0 == 0) goto L14
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.f39172f
        L10:
            r5.append(r0)
            goto L2d
        L14:
            android.net.Uri r0 = r4.f39170d
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
            goto L10
        L25:
            r5.ensureCapacity(r1)
            int r0 = r4.f39171e
            r5.append(r0)
        L2d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.f39179m
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L5e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.f39179m
            r5.append(r1)
            boolean r1 = r4.f39182p
            if (r1 == 0) goto L5b
            r1 = 64
            r5.append(r1)
            float r1 = r4.f39180n
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.f39181o
            r5.append(r1)
        L5b:
            r5.append(r0)
        L5e:
            boolean r1 = r4.c()
            if (r1 == 0) goto L79
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.f39174h
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.f39175i
            r5.append(r1)
            r5.append(r0)
        L79:
            boolean r1 = r4.f39176j
            if (r1 == 0) goto L86
            java.lang.String r1 = "centerCrop"
        L7f:
            r5.append(r1)
            r5.append(r0)
            goto L8d
        L86:
            boolean r1 = r4.f39177k
            if (r1 == 0) goto L8d
            java.lang.String r1 = "centerInside"
            goto L7f
        L8d:
            java.util.List r0 = r4.f39173g
            if (r0 == 0) goto La4
            int r0 = r0.size()
            if (r0 > 0) goto L98
            goto La4
        L98:
            java.util.List r4 = r4.f39173g
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            d.AbstractC1617D.a(r4)
            r4 = 0
            throw r4
        La4:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.G.i(com.squareup.picasso.w, java.lang.StringBuilder):java.lang.String");
    }

    public static void j(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    public static int k(Bitmap bitmap) {
        int iA = c.a(bitmap);
        if (iA >= 0) {
            return iA;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String l(RunnableC1609c runnableC1609c) {
        return m(runnableC1609c, "");
    }

    public static String m(RunnableC1609c runnableC1609c, String str) {
        StringBuilder sb = new StringBuilder(str);
        AbstractC1607a abstractC1607aH = runnableC1609c.h();
        if (abstractC1607aH != null) {
            sb.append(abstractC1607aH.f39038b.d());
        }
        List listI = runnableC1609c.i();
        if (listI != null) {
            int size = listI.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (i9 > 0 || abstractC1607aH != null) {
                    sb.append(", ");
                }
                sb.append(((AbstractC1607a) listI.get(i9)).f39038b.d());
            }
        }
        return sb.toString();
    }

    public static int n(Resources resources, w wVar) throws FileNotFoundException {
        Uri uri;
        int i9 = wVar.f39171e;
        if (i9 != 0 || (uri = wVar.f39170d) == null) {
            return i9;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + wVar.f39170d);
        }
        List<String> pathSegments = wVar.f39170d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + wVar.f39170d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + wVar.f39170d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + wVar.f39170d);
    }

    public static Resources o(Context context, w wVar) throws FileNotFoundException {
        Uri uri;
        if (wVar.f39171e != 0 || (uri = wVar.f39170d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + wVar.f39170d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + wVar.f39170d);
        }
    }

    public static Object p(Context context, String str) {
        return context.getSystemService(str);
    }

    public static boolean q(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean r(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static boolean s() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean t(InputStream inputStream) {
        byte[] bArr = new byte[12];
        return inputStream.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
    }

    public static void u(String str, String str2, String str3) {
        v(str, str2, str3, "");
    }

    public static void v(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    public static boolean w(String str) {
        if (str == null) {
            return false;
        }
        String[] strArrSplit = str.split(" ", 2);
        if ("CACHE".equals(strArrSplit[0])) {
            return true;
        }
        if (strArrSplit.length == 1) {
            return false;
        }
        try {
            if ("CONDITIONAL_CACHE".equals(strArrSplit[0])) {
                return Integer.parseInt(strArrSplit[1]) == 304;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] x(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i9 = inputStream.read(bArr);
            if (-1 == i9) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i9);
        }
    }
}
