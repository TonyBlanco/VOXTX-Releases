package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import com.squareup.picasso.j;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class F implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Object f39032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f39033c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f39034d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39035a;

    public static class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    public static class b {
        public static Object a(Context context) {
            File fileF = G.f(context);
            HttpResponseCache installed = HttpResponseCache.getInstalled();
            return installed == null ? HttpResponseCache.install(fileF, G.a(fileF)) : installed;
        }
    }

    public F(Context context) {
        this.f39035a = context.getApplicationContext();
    }

    public static void b(Context context) {
        if (f39032b == null) {
            try {
                synchronized (f39033c) {
                    try {
                        if (f39032b == null) {
                            f39032b = b.a(context);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.squareup.picasso.j
    public j.a a(Uri uri, int i9) throws IOException {
        String string;
        b(this.f39035a);
        HttpURLConnection httpURLConnectionC = c(uri);
        httpURLConnectionC.setUseCaches(true);
        if (i9 != 0) {
            if (q.isOfflineOnly(i9)) {
                string = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = (StringBuilder) f39034d.get();
                sb.setLength(0);
                if (!q.shouldReadFromDiskCache(i9)) {
                    sb.append("no-cache");
                }
                if (!q.shouldWriteToDiskCache(i9)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                string = sb.toString();
            }
            httpURLConnectionC.setRequestProperty("Cache-Control", string);
        }
        int responseCode = httpURLConnectionC.getResponseCode();
        if (responseCode < 300) {
            return new j.a(httpURLConnectionC.getInputStream(), G.w(httpURLConnectionC.getHeaderField("X-Android-Response-Source")), httpURLConnectionC.getHeaderFieldInt("Content-Length", -1));
        }
        httpURLConnectionC.disconnect();
        throw new j.b(responseCode + " " + httpURLConnectionC.getResponseMessage(), i9, responseCode);
    }

    public HttpURLConnection c(Uri uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }
}
