package T1;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import q2.C2533b;

/* JADX INFO: loaded from: classes.dex */
public class f implements T1.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f9505f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.d f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f9507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f9508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f9509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f9510e;

    public static class b implements c {
        public b() {
        }

        @Override // T1.f.c
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface c {
        HttpURLConnection a(URL url);
    }

    public f(Z1.d dVar) {
        this(dVar, f9505f);
    }

    public f(Z1.d dVar, c cVar) {
        this.f9506a = dVar;
        this.f9507b = cVar;
    }

    @Override // T1.c
    public void a() {
        InputStream inputStream = this.f9509d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9508c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final InputStream c(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = C2533b.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f9509d = inputStream;
        return this.f9509d;
    }

    @Override // T1.c
    public void cancel() {
        this.f9510e = true;
    }

    @Override // T1.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream b(O1.i iVar) {
        return e(this.f9506a.e(), 0, null, this.f9506a.b());
    }

    public final InputStream e(URL url, int i9, URL url2, Map map) throws IOException {
        if (i9 >= 5) {
            throw new IOException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new IOException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f9508c = this.f9507b.a(url);
        for (Map.Entry entry : map.entrySet()) {
            this.f9508c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.f9508c.setConnectTimeout(2500);
        this.f9508c.setReadTimeout(2500);
        this.f9508c.setUseCaches(false);
        this.f9508c.setDoInput(true);
        this.f9508c.connect();
        if (this.f9510e) {
            return null;
        }
        int responseCode = this.f9508c.getResponseCode();
        int i10 = responseCode / 100;
        if (i10 == 2) {
            return c(this.f9508c);
        }
        if (i10 == 3) {
            String headerField = this.f9508c.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new IOException("Received empty or null redirect url");
            }
            return e(new URL(url, headerField), i9 + 1, url, map);
        }
        if (responseCode == -1) {
            throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
        }
        throw new IOException("Request failed " + responseCode + ": " + this.f9508c.getResponseMessage());
    }

    @Override // T1.c
    public String getId() {
        return this.f9506a.a();
    }
}
