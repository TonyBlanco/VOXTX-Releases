package i1;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import h1.n;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;

/* JADX INFO: loaded from: classes.dex */
public class h extends AbstractC1874a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f41816a;

    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpURLConnection f41817a;

        public a(HttpURLConnection httpURLConnection) {
            super(h.j(httpURLConnection));
            this.f41817a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f41817a.disconnect();
        }
    }

    public interface b {
    }

    public h() {
        this(null);
    }

    public h(b bVar) {
        this(bVar, null);
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f41816a = sSLSocketFactory;
    }

    public static List e(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new h1.g((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static boolean i(int i9, int i10) {
        return (i9 == 4 || (100 <= i10 && i10 < 200) || i10 == 204 || i10 == 304) ? false : true;
    }

    public static InputStream j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    @Override // i1.AbstractC1874a
    public f a(n nVar, Map map) {
        String strF = nVar.F();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(nVar.u());
        HttpURLConnection httpURLConnectionK = k(new URL(strF), nVar);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionK.setRequestProperty(str, (String) map2.get(str));
            }
            l(httpURLConnectionK, nVar);
            int responseCode = httpURLConnectionK.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (i(nVar.v(), responseCode)) {
                return new f(responseCode, e(httpURLConnectionK.getHeaderFields()), httpURLConnectionK.getContentLength(), g(nVar, httpURLConnectionK));
            }
            f fVar = new f(responseCode, e(httpURLConnectionK.getHeaderFields()));
            httpURLConnectionK.disconnect();
            return fVar;
        } catch (Throwable th) {
            if (0 == 0) {
                httpURLConnectionK.disconnect();
            }
            throw th;
        }
    }

    public final void c(HttpURLConnection httpURLConnection, n nVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", nVar.r());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(h(nVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public final void d(HttpURLConnection httpURLConnection, n nVar) throws IOException {
        byte[] bArrQ = nVar.q();
        if (bArrQ != null) {
            c(httpURLConnection, nVar, bArrQ);
        }
    }

    public HttpURLConnection f(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    public InputStream g(n nVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    public OutputStream h(n nVar, HttpURLConnection httpURLConnection, int i9) {
        return httpURLConnection.getOutputStream();
    }

    public final HttpURLConnection k(URL url, n nVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionF = f(url);
        int iD = nVar.D();
        httpURLConnectionF.setConnectTimeout(iD);
        httpURLConnectionF.setReadTimeout(iD);
        httpURLConnectionF.setUseCaches(false);
        httpURLConnectionF.setDoInput(true);
        if (ClientConstants.DOMAIN_SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.f41816a) != null) {
            ((HttpsURLConnection) httpURLConnectionF).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionF;
    }

    public void l(HttpURLConnection httpURLConnection, n nVar) throws IOException {
        String str;
        String str2;
        switch (nVar.v()) {
            case -1:
                byte[] bArrY = nVar.y();
                if (bArrY != null) {
                    httpURLConnection.setRequestMethod("POST");
                    c(httpURLConnection, nVar, bArrY);
                    return;
                }
                return;
            case 0:
                str = HttpGet.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                d(httpURLConnection, nVar);
                return;
            case 2:
                str2 = HttpPut.METHOD_NAME;
                httpURLConnection.setRequestMethod(str2);
                d(httpURLConnection, nVar);
                return;
            case 3:
                str = HttpDelete.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 4:
                str = HttpHead.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 5:
                str = HttpOptions.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 6:
                str = HttpTrace.METHOD_NAME;
                httpURLConnection.setRequestMethod(str);
                return;
            case 7:
                str2 = HttpPatch.METHOD_NAME;
                httpURLConnection.setRequestMethod(str2);
                d(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
