package b4;

import android.net.Uri;
import b4.C;
import b4.x;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.facebook.ads.AdError;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HTTP;
import s5.AbstractC2717A;
import s5.AbstractC2737s;
import s5.Z;

/* JADX INFO: loaded from: classes3.dex */
public class x extends AbstractC1216g implements C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C.f f17672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C.f f17673j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f17674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r5.n f17675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1227s f17676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HttpURLConnection f17677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InputStream f17678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17682s;

    public static final class b implements C.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public S f17684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r5.n f17685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f17686d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f17689g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f17690h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C.f f17683a = new C.f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17687e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17688f = 8000;

        @Override // b4.InterfaceC1224o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a() {
            x xVar = new x(this.f17686d, this.f17687e, this.f17688f, this.f17689g, this.f17683a, this.f17685c, this.f17690h);
            S s9 = this.f17684b;
            if (s9 != null) {
                xVar.g(s9);
            }
            return xVar;
        }

        public b c(String str) {
            this.f17686d = str;
            return this;
        }
    }

    public static class c extends AbstractC2737s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f17691a;

        public c(Map map) {
            this.f17691a = map;
        }

        public static /* synthetic */ boolean j(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean k(String str) {
            return str != null;
        }

        @Override // s5.AbstractC2738t
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.f17691a;
        }

        @Override // s5.AbstractC2737s, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.d(obj);
        }

        @Override // s5.AbstractC2737s, java.util.Map
        public Set entrySet() {
            return Z.b(super.entrySet(), new r5.n() { // from class: b4.z
                @Override // r5.n
                public final boolean apply(Object obj) {
                    return x.c.j((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.e(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.f();
        }

        @Override // s5.AbstractC2737s, java.util.Map
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // s5.AbstractC2737s, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // s5.AbstractC2737s, java.util.Map
        public Set keySet() {
            return Z.b(super.keySet(), new r5.n() { // from class: b4.y
                @Override // r5.n
                public final boolean apply(Object obj) {
                    return x.c.k((String) obj);
                }
            });
        }

        @Override // s5.AbstractC2737s, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public x(String str, int i9, int i10, boolean z9, C.f fVar, r5.n nVar, boolean z10) {
        super(true);
        this.f17671h = str;
        this.f17669f = i9;
        this.f17670g = i10;
        this.f17668e = z9;
        this.f17672i = fVar;
        this.f17675l = nVar;
        this.f17673j = new C.f();
        this.f17674k = z10;
    }

    public static void C(HttpURLConnection httpURLConnection, long j9) {
        int i9;
        if (httpURLConnection == null || (i9 = k0.f39777a) < 19 || i9 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j9 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j9 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) AbstractC1684a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    private void F(long j9, C1227s c1227s) throws IOException {
        if (j9 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j9 > 0) {
            int i9 = ((InputStream) k0.j(this.f17678o)).read(bArr, 0, (int) Math.min(j9, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new C.c(new InterruptedIOException(), c1227s, AdError.SERVER_ERROR_CODE, 1);
            }
            if (i9 == -1) {
                throw new C.c(c1227s, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
            j9 -= (long) i9;
            t(i9);
        }
    }

    public static boolean z(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public final HttpURLConnection A(C1227s c1227s) throws IOException {
        HttpURLConnection httpURLConnectionB;
        URL url;
        URL url2 = new URL(c1227s.f17598a.toString());
        int i9 = c1227s.f17600c;
        byte[] bArr = c1227s.f17601d;
        long j9 = c1227s.f17604g;
        long j10 = c1227s.f17605h;
        boolean zD = c1227s.d(1);
        if (!this.f17668e && !this.f17674k) {
            return B(url2, i9, bArr, j9, j10, zD, true, c1227s.f17602e);
        }
        int i10 = 0;
        URL urlY = url2;
        int i11 = i9;
        byte[] bArr2 = bArr;
        while (true) {
            int i12 = i10 + 1;
            if (i10 > 20) {
                throw new C.c(new NoRouteToHostException("Too many redirects: " + i12), c1227s, AdError.INTERNAL_ERROR_CODE, 1);
            }
            long j11 = j9;
            long j12 = j9;
            int i13 = i11;
            URL url3 = urlY;
            long j13 = j10;
            httpURLConnectionB = B(urlY, i11, bArr2, j11, j10, zD, false, c1227s.f17602e);
            int responseCode = httpURLConnectionB.getResponseCode();
            String headerField = httpURLConnectionB.getHeaderField("Location");
            if ((i13 == 1 || i13 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionB.disconnect();
                urlY = y(url3, headerField, c1227s);
                i11 = i13;
            } else {
                if (i13 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionB.disconnect();
                if (this.f17674k && responseCode == 302) {
                    i11 = i13;
                    url = url3;
                } else {
                    bArr2 = null;
                    url = url3;
                    i11 = 1;
                }
                urlY = y(url, headerField, c1227s);
            }
            i10 = i12;
            j9 = j12;
            j10 = j13;
        }
        return httpURLConnectionB;
    }

    public final HttpURLConnection B(URL url, int i9, byte[] bArr, long j9, long j10, boolean z9, boolean z10, Map map) throws IOException {
        HttpURLConnection httpURLConnectionD = D(url);
        httpURLConnectionD.setConnectTimeout(this.f17669f);
        httpURLConnectionD.setReadTimeout(this.f17670g);
        HashMap map2 = new HashMap();
        C.f fVar = this.f17672i;
        if (fVar != null) {
            map2.putAll(fVar.a());
        }
        map2.putAll(this.f17673j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionD.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = D.a(j9, j10);
        if (strA != null) {
            httpURLConnectionD.setRequestProperty("Range", strA);
        }
        String str = this.f17671h;
        if (str != null) {
            httpURLConnectionD.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionD.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z9 ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnectionD.setInstanceFollowRedirects(z10);
        httpURLConnectionD.setDoOutput(bArr != null);
        httpURLConnectionD.setRequestMethod(C1227s.c(i9));
        if (bArr != null) {
            httpURLConnectionD.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionD.connect();
            OutputStream outputStream = httpURLConnectionD.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionD.connect();
        }
        return httpURLConnectionD;
    }

    public HttpURLConnection D(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public final int E(byte[] bArr, int i9, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j9 = this.f17681r;
        if (j9 != -1) {
            long j10 = j9 - this.f17682s;
            if (j10 == 0) {
                return -1;
            }
            i10 = (int) Math.min(i10, j10);
        }
        int i11 = ((InputStream) k0.j(this.f17678o)).read(bArr, i9, i10);
        if (i11 == -1) {
            return -1;
        }
        this.f17682s += (long) i11;
        t(i11);
        return i11;
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws C.c {
        byte[] bArrP1;
        this.f17676m = c1227s;
        long j9 = 0;
        this.f17682s = 0L;
        this.f17681r = 0L;
        v(c1227s);
        try {
            HttpURLConnection httpURLConnectionA = A(c1227s);
            this.f17677n = httpURLConnectionA;
            this.f17680q = httpURLConnectionA.getResponseCode();
            String responseMessage = httpURLConnectionA.getResponseMessage();
            int i9 = this.f17680q;
            if (i9 < 200 || i9 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
                if (this.f17680q == 416) {
                    if (c1227s.f17604g == D.c(httpURLConnectionA.getHeaderField("Content-Range"))) {
                        this.f17679p = true;
                        w(c1227s);
                        long j10 = c1227s.f17605h;
                        if (j10 != -1) {
                            return j10;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionA.getErrorStream();
                try {
                    bArrP1 = errorStream != null ? k0.p1(errorStream) : k0.f39782f;
                } catch (IOException unused) {
                    bArrP1 = k0.f39782f;
                }
                byte[] bArr = bArrP1;
                x();
                throw new C.e(this.f17680q, responseMessage, this.f17680q == 416 ? new C1225p(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, c1227s, bArr);
            }
            String contentType = httpURLConnectionA.getContentType();
            r5.n nVar = this.f17675l;
            if (nVar != null && !nVar.apply(contentType)) {
                x();
                throw new C.d(contentType, c1227s);
            }
            if (this.f17680q == 200) {
                long j11 = c1227s.f17604g;
                if (j11 != 0) {
                    j9 = j11;
                }
            }
            boolean z9 = z(httpURLConnectionA);
            if (z9) {
                this.f17681r = c1227s.f17605h;
            } else {
                long j12 = c1227s.f17605h;
                if (j12 != -1) {
                    this.f17681r = j12;
                } else {
                    long jB = D.b(httpURLConnectionA.getHeaderField("Content-Length"), httpURLConnectionA.getHeaderField("Content-Range"));
                    this.f17681r = jB != -1 ? jB - j9 : -1L;
                }
            }
            try {
                this.f17678o = httpURLConnectionA.getInputStream();
                if (z9) {
                    this.f17678o = new GZIPInputStream(this.f17678o);
                }
                this.f17679p = true;
                w(c1227s);
                try {
                    F(j9, c1227s);
                    return this.f17681r;
                } catch (IOException e9) {
                    x();
                    if (e9 instanceof C.c) {
                        throw ((C.c) e9);
                    }
                    throw new C.c(e9, c1227s, AdError.SERVER_ERROR_CODE, 1);
                }
            } catch (IOException e10) {
                x();
                throw new C.c(e10, c1227s, AdError.SERVER_ERROR_CODE, 1);
            }
        } catch (IOException e11) {
            x();
            throw C.c.c(e11, c1227s, 1);
        }
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        try {
            InputStream inputStream = this.f17678o;
            if (inputStream != null) {
                long j9 = this.f17681r;
                long j10 = -1;
                if (j9 != -1) {
                    j10 = j9 - this.f17682s;
                }
                C(this.f17677n, j10);
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    throw new C.c(e9, (C1227s) k0.j(this.f17676m), AdError.SERVER_ERROR_CODE, 3);
                }
            }
        } finally {
            this.f17678o = null;
            x();
            if (this.f17679p) {
                this.f17679p = false;
                u();
            }
        }
    }

    @Override // b4.AbstractC1216g, b4.InterfaceC1224o
    public Map e() {
        HttpURLConnection httpURLConnection = this.f17677n;
        return httpURLConnection == null ? AbstractC2717A.k() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f17677n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws C.c {
        try {
            return E(bArr, i9, i10);
        } catch (IOException e9) {
            throw C.c.c(e9, (C1227s) k0.j(this.f17676m), 2);
        }
    }

    public final void x() {
        HttpURLConnection httpURLConnection = this.f17677n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e9) {
                AbstractC1681B.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e9);
            }
            this.f17677n = null;
        }
    }

    public final URL y(URL url, String str, C1227s c1227s) throws C.c {
        if (str == null) {
            throw new C.c("Null location redirect", c1227s, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ClientConstants.DOMAIN_SCHEME.equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                throw new C.c("Unsupported protocol redirect: " + protocol, c1227s, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.f17668e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c1227s, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e9) {
            throw new C.c(e9, c1227s, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }
}
