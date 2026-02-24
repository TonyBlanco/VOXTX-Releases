package X2;

import O2.AbstractC0928w0;
import android.net.Uri;
import android.text.TextUtils;
import b4.AbstractC1216g;
import b4.C;
import b4.C1225p;
import b4.C1227s;
import b4.D;
import b4.S;
import b4.x;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import d4.C1691h;
import d4.InterfaceC1688e;
import d4.k0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import r5.AbstractC2673b;
import r5.n;
import w5.h;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AbstractC1216g implements C {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f10403A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile long f10404B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UrlRequest.Callback f10405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CronetEngine f10406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f10407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f10413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C.f f10414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C.f f10415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1691h f10416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1688e f10417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f10418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10421u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public UrlRequest f10422v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1227s f10423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ByteBuffer f10424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public UrlResponseInfo f10425y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public IOException f10426z;

    public class a extends UrlRequest.StatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f10427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1691h f10428b;

        public a(int[] iArr, C1691h c1691h) {
            this.f10427a = iArr;
            this.f10428b = c1691h;
        }

        @Override // org.chromium.net.UrlRequest.StatusListener
        public void onStatus(int i9) {
            this.f10427a[0] = i9;
            this.f10428b.f();
        }
    }

    /* JADX INFO: renamed from: X2.b$b, reason: collision with other inner class name */
    public static final class C0140b implements C.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CronetEngine f10429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f10430b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C.b f10433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n f10434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public S f10435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f10436h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10440l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f10441m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f10442n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C.f f10431c = new C.f();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x.b f10432d = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10437i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f10438j = 8000;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10439k = 8000;

        public C0140b(CronetEngine cronetEngine, Executor executor) {
            this.f10429a = (CronetEngine) AbstractC1684a.e(cronetEngine);
            this.f10430b = executor;
        }

        @Override // b4.InterfaceC1224o.a
        public C a() {
            if (this.f10429a == null) {
                C.b bVar = this.f10433e;
                return bVar != null ? bVar.a() : ((x.b) AbstractC1684a.e(this.f10432d)).a();
            }
            b bVar2 = new b(this.f10429a, this.f10430b, this.f10437i, this.f10438j, this.f10439k, this.f10440l, this.f10441m, this.f10436h, this.f10431c, this.f10434f, this.f10442n);
            S s9 = this.f10435g;
            if (s9 != null) {
                bVar2.g(s9);
            }
            return bVar2;
        }
    }

    public static final class c extends C.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10443e;

        public c(C1227s c1227s, int i9, int i10) {
            super(c1227s, i9, 1);
            this.f10443e = i10;
        }

        public c(IOException iOException, C1227s c1227s, int i9, int i10) {
            super(iOException, c1227s, i9, 1);
            this.f10443e = i10;
        }

        public c(String str, C1227s c1227s, int i9, int i10) {
            super(str, c1227s, i9, 1);
            this.f10443e = i10;
        }
    }

    public final class d extends UrlRequest.Callback {
        public d() {
        }

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            try {
                if (urlRequest != b.this.f10422v) {
                    return;
                }
                if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
                    b.this.f10426z = new UnknownHostException();
                } else {
                    b.this.f10426z = cronetException;
                }
                b.this.f10416p.f();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (urlRequest != b.this.f10422v) {
                return;
            }
            b.this.f10416p.f();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            if (urlRequest != b.this.f10422v) {
                return;
            }
            UrlRequest urlRequest2 = (UrlRequest) AbstractC1684a.e(b.this.f10422v);
            C1227s c1227s = (C1227s) AbstractC1684a.e(b.this.f10423w);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (c1227s.f17600c == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                b.this.f10426z = new C.e(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getAllHeaders(), c1227s, k0.f39782f);
                b.this.f10416p.f();
                return;
            }
            if (b.this.f10411k) {
                b.this.U();
            }
            boolean z9 = b.this.f10419s && c1227s.f17600c == 2 && httpStatusCode == 302;
            if (!z9 && !b.this.f10412l) {
                urlRequest.followRedirect();
                return;
            }
            String strR = b.R(urlResponseInfo.getAllHeaders().get(SM.SET_COOKIE));
            if (!z9 && TextUtils.isEmpty(strR)) {
                urlRequest.followRedirect();
                return;
            }
            urlRequest2.cancel();
            try {
                UrlRequest.Builder builderM = b.this.M((z9 || c1227s.f17600c != 2) ? c1227s.g(Uri.parse(str)) : c1227s.a().j(str).d(1).c(null).a());
                b.K(builderM, strR);
                b.this.f10422v = builderM.build();
                b.this.f10422v.start();
            } catch (IOException e9) {
                b.this.f10426z = e9;
            }
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (urlRequest != b.this.f10422v) {
                return;
            }
            b.this.f10425y = urlResponseInfo;
            b.this.f10416p.f();
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (urlRequest != b.this.f10422v) {
                return;
            }
            b.this.f10403A = true;
            b.this.f10416p.f();
        }
    }

    static {
        AbstractC0928w0.a("goog.exo.cronet");
    }

    public b(CronetEngine cronetEngine, Executor executor, int i9, int i10, int i11, boolean z9, boolean z10, String str, C.f fVar, n nVar, boolean z11) {
        super(true);
        this.f10406f = (CronetEngine) AbstractC1684a.e(cronetEngine);
        this.f10407g = (Executor) AbstractC1684a.e(executor);
        this.f10408h = i9;
        this.f10409i = i10;
        this.f10410j = i11;
        this.f10411k = z9;
        this.f10412l = z10;
        this.f10413m = str;
        this.f10414n = fVar;
        this.f10418r = nVar;
        this.f10419s = z11;
        this.f10417q = InterfaceC1688e.f39758a;
        this.f10405e = new d(this, null);
        this.f10415o = new C.f();
        this.f10416p = new C1691h();
    }

    public static void K(UrlRequest.Builder builder, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        builder.addHeader(SM.COOKIE, str);
    }

    public static String N(Map map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public static int P(UrlRequest urlRequest) {
        C1691h c1691h = new C1691h();
        int[] iArr = new int[1];
        urlRequest.getStatus(new a(iArr, c1691h));
        c1691h.a();
        return iArr[0];
    }

    public static boolean Q(UrlResponseInfo urlResponseInfo) {
        Iterator<Map.Entry<String, String>> it = urlResponseInfo.getAllHeadersAsList().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equalsIgnoreCase("Content-Encoding")) {
                return !r0.getValue().equalsIgnoreCase(HTTP.IDENTITY_CODING);
            }
        }
        return false;
    }

    public static String R(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(";", list);
    }

    public final boolean L() {
        long jB = this.f10417q.b();
        boolean zB = false;
        while (!zB && jB < this.f10404B) {
            zB = this.f10416p.b((this.f10404B - jB) + 5);
            jB = this.f10417q.b();
        }
        return zB;
    }

    public UrlRequest.Builder M(C1227s c1227s) throws c {
        UrlRequest.Builder builderAllowDirectExecutor = this.f10406f.newUrlRequestBuilder(c1227s.f17598a.toString(), this.f10405e, this.f10407g).setPriority(this.f10408h).allowDirectExecutor();
        HashMap map = new HashMap();
        C.f fVar = this.f10414n;
        if (fVar != null) {
            map.putAll(fVar.a());
        }
        map.putAll(this.f10415o.a());
        map.putAll(c1227s.f17602e);
        for (Map.Entry entry : map.entrySet()) {
            builderAllowDirectExecutor.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (c1227s.f17601d != null && !map.containsKey("Content-Type")) {
            throw new c("HTTP request with non-empty body must set Content-Type", c1227s, 1004, 0);
        }
        String strA = D.a(c1227s.f17604g, c1227s.f17605h);
        if (strA != null) {
            builderAllowDirectExecutor.addHeader("Range", strA);
        }
        String str = this.f10413m;
        if (str != null) {
            builderAllowDirectExecutor.addHeader("User-Agent", str);
        }
        builderAllowDirectExecutor.setHttpMethod(c1227s.b());
        byte[] bArr = c1227s.f17601d;
        if (bArr != null) {
            builderAllowDirectExecutor.setUploadDataProvider(new X2.a(bArr), this.f10407g);
        }
        return builderAllowDirectExecutor;
    }

    public final ByteBuffer O() {
        if (this.f10424x == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.f10424x = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.f10424x;
    }

    public final void S(ByteBuffer byteBuffer, C1227s c1227s) throws C.c {
        IOException cVar;
        ((UrlRequest) k0.j(this.f10422v)).read(byteBuffer);
        try {
            if (!this.f10416p.b(this.f10410j)) {
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException unused) {
            if (byteBuffer == this.f10424x) {
                this.f10424x = null;
            }
            Thread.currentThread().interrupt();
            cVar = new InterruptedIOException();
            this.f10426z = cVar;
        } catch (SocketTimeoutException e9) {
            if (byteBuffer == this.f10424x) {
                this.f10424x = null;
            }
            cVar = new C.c(e9, c1227s, AdError.CACHE_ERROR_CODE, 2);
            this.f10426z = cVar;
        }
        IOException iOException = this.f10426z;
        if (iOException != null) {
            if (!(iOException instanceof C.c)) {
                throw C.c.c(iOException, c1227s, 2);
            }
            throw ((C.c) iOException);
        }
    }

    public final byte[] T() throws C.c {
        byte[] bArrCopyOf = k0.f39782f;
        ByteBuffer byteBufferO = O();
        while (!this.f10403A) {
            this.f10416p.d();
            byteBufferO.clear();
            S(byteBufferO, (C1227s) k0.j(this.f10423w));
            byteBufferO.flip();
            if (byteBufferO.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + byteBufferO.remaining());
                byteBufferO.get(bArrCopyOf, length, byteBufferO.remaining());
            }
        }
        return bArrCopyOf;
    }

    public final void U() {
        this.f10404B = this.f10417q.b() + ((long) this.f10409i);
    }

    public final void V(long j9, C1227s c1227s) throws C.c {
        if (j9 == 0) {
            return;
        }
        ByteBuffer byteBufferO = O();
        while (j9 > 0) {
            try {
                this.f10416p.d();
                byteBufferO.clear();
                S(byteBufferO, c1227s);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.f10403A) {
                    throw new c(c1227s, AdError.REMOTE_ADS_SERVICE_ERROR, 14);
                }
                byteBufferO.flip();
                AbstractC1684a.g(byteBufferO.hasRemaining());
                int iMin = (int) Math.min(byteBufferO.remaining(), j9);
                byteBufferO.position(byteBufferO.position() + iMin);
                j9 -= (long) iMin;
            } catch (IOException e9) {
                if (e9 instanceof C.c) {
                    throw ((C.c) e9);
                }
                throw new c(e9, c1227s, e9 instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : AdError.INTERNAL_ERROR_CODE, 14);
            }
        }
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws C.c {
        byte[] bArrT;
        String strN;
        AbstractC1684a.e(c1227s);
        AbstractC1684a.g(!this.f10420t);
        this.f10416p.d();
        U();
        this.f10423w = c1227s;
        try {
            UrlRequest urlRequestBuild = M(c1227s).build();
            this.f10422v = urlRequestBuild;
            urlRequestBuild.start();
            v(c1227s);
            try {
                boolean zL = L();
                IOException iOException = this.f10426z;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !AbstractC2673b.e(message).contains("err_cleartext_not_permitted")) {
                        throw new c(iOException, c1227s, AdError.INTERNAL_ERROR_CODE, P(urlRequestBuild));
                    }
                    throw new C.a(iOException, c1227s);
                }
                if (!zL) {
                    throw new c(new SocketTimeoutException(), c1227s, AdError.CACHE_ERROR_CODE, P(urlRequestBuild));
                }
                UrlResponseInfo urlResponseInfo = (UrlResponseInfo) AbstractC1684a.e(this.f10425y);
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                long j9 = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (c1227s.f17604g == D.c(N(allHeaders, "Content-Range"))) {
                            this.f10420t = true;
                            w(c1227s);
                            long j10 = c1227s.f17605h;
                            if (j10 != -1) {
                                return j10;
                            }
                            return 0L;
                        }
                    }
                    try {
                        bArrT = T();
                    } catch (IOException unused) {
                        bArrT = k0.f39782f;
                    }
                    throw new C.e(httpStatusCode, urlResponseInfo.getHttpStatusText(), httpStatusCode == 416 ? new C1225p(AdError.REMOTE_ADS_SERVICE_ERROR) : null, allHeaders, c1227s, bArrT);
                }
                n nVar = this.f10418r;
                if (nVar != null && (strN = N(allHeaders, "Content-Type")) != null && !nVar.apply(strN)) {
                    throw new C.d(strN, c1227s);
                }
                if (httpStatusCode == 200) {
                    long j11 = c1227s.f17604g;
                    if (j11 != 0) {
                        j9 = j11;
                    }
                }
                if (Q(urlResponseInfo)) {
                    this.f10421u = c1227s.f17605h;
                } else {
                    long j12 = c1227s.f17605h;
                    if (j12 != -1) {
                        this.f10421u = j12;
                    } else {
                        long jB = D.b(N(allHeaders, "Content-Length"), N(allHeaders, "Content-Range"));
                        this.f10421u = jB != -1 ? jB - j9 : -1L;
                    }
                }
                this.f10420t = true;
                w(c1227s);
                V(j9, c1227s);
                return this.f10421u;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new c(new InterruptedIOException(), c1227s, 1004, -1);
            }
        } catch (IOException e9) {
            if (e9 instanceof C.c) {
                throw ((C.c) e9);
            }
            throw new c(e9, c1227s, AdError.SERVER_ERROR_CODE, 0);
        }
    }

    @Override // b4.InterfaceC1224o
    public synchronized void close() {
        try {
            UrlRequest urlRequest = this.f10422v;
            if (urlRequest != null) {
                urlRequest.cancel();
                this.f10422v = null;
            }
            ByteBuffer byteBuffer = this.f10424x;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.f10423w = null;
            this.f10425y = null;
            this.f10426z = null;
            this.f10403A = false;
            if (this.f10420t) {
                this.f10420t = false;
                u();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // b4.AbstractC1216g, b4.InterfaceC1224o
    public Map e() {
        UrlResponseInfo urlResponseInfo = this.f10425y;
        return urlResponseInfo == null ? Collections.emptyMap() : urlResponseInfo.getAllHeaders();
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.f10425y;
        if (urlResponseInfo == null) {
            return null;
        }
        return Uri.parse(urlResponseInfo.getUrl());
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws C.c {
        AbstractC1684a.g(this.f10420t);
        if (i10 == 0) {
            return 0;
        }
        if (this.f10421u == 0) {
            return -1;
        }
        ByteBuffer byteBufferO = O();
        if (!byteBufferO.hasRemaining()) {
            this.f10416p.d();
            byteBufferO.clear();
            S(byteBufferO, (C1227s) k0.j(this.f10423w));
            if (this.f10403A) {
                this.f10421u = 0L;
                return -1;
            }
            byteBufferO.flip();
            AbstractC1684a.g(byteBufferO.hasRemaining());
        }
        long j9 = this.f10421u;
        if (j9 == -1) {
            j9 = Long.MAX_VALUE;
        }
        int iD = (int) h.d(j9, byteBufferO.remaining(), i10);
        byteBufferO.get(bArr, i9, iD);
        long j10 = this.f10421u;
        if (j10 != -1) {
            this.f10421u = j10 - ((long) iD);
        }
        t(iD);
        return iD;
    }
}
