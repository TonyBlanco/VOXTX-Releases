package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.picasso.j;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class s implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f39124a;

    public s(Context context) {
        this(G.f(context));
    }

    public s(OkHttpClient okHttpClient) {
        this.f39124a = okHttpClient;
    }

    public s(File file) {
        this(file, G.a(file));
    }

    public s(File file, long j9) {
        this(b());
        try {
            this.f39124a.setCache(new Cache(file, j9));
        } catch (IOException unused) {
        }
    }

    public static OkHttpClient b() {
        OkHttpClient okHttpClient = new OkHttpClient();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        okHttpClient.setConnectTimeout(15000L, timeUnit);
        okHttpClient.setReadTimeout(20000L, timeUnit);
        okHttpClient.setWriteTimeout(20000L, timeUnit);
        return okHttpClient;
    }

    @Override // com.squareup.picasso.j
    public j.a a(Uri uri, int i9) throws IOException {
        CacheControl cacheControlBuild;
        if (i9 == 0) {
            cacheControlBuild = null;
        } else if (q.isOfflineOnly(i9)) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!q.shouldReadFromDiskCache(i9)) {
                builder.noCache();
            }
            if (!q.shouldWriteToDiskCache(i9)) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        Request.Builder builderUrl = new Request.Builder().url(uri.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        Response responseExecute = this.f39124a.newCall(builderUrl.build()).execute();
        int iCode = responseExecute.code();
        if (iCode < 300) {
            boolean z9 = responseExecute.cacheResponse() != null;
            ResponseBody responseBodyBody = responseExecute.body();
            return new j.a(responseBodyBody.byteStream(), z9, responseBodyBody.contentLength());
        }
        responseExecute.body().close();
        throw new j.b(iCode + " " + responseExecute.message(), i9, iCode);
    }
}
