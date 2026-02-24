package k1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import d.AbstractC1617D;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import l1.C2173b;
import m1.C2219a;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Okio;
import org.json.JSONArray;
import org.json.JSONObject;
import p1.InterfaceC2387a;
import p1.InterfaceC2388b;
import p1.InterfaceC2389c;
import q1.C2528a;
import s1.AbstractC2703a;
import s1.AbstractC2705c;

/* JADX INFO: renamed from: k1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2132a {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final MediaType f43440O = MediaType.parse("application/json; charset=utf-8");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final MediaType f43441P = MediaType.parse("text/x-markdown; charset=utf-8");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Object f43442Q = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f43443A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f43444B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC2389c f43445C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC2388b f43446D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public p1.f f43447E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Bitmap.Config f43448F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f43449G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f43450H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ImageView.ScaleType f43451I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CacheControl f43452J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Executor f43453K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public OkHttpClient f43454L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f43455M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Type f43456N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k1.e f43458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f43462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k1.f f43463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f43464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f43465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap f43466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap f43467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap f43468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap f43469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f43470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f43471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f43472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f43473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f43474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f43475s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public File f43476t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public MediaType f43477u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Future f43478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Call f43479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f43480x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f43481y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f43482z;

    /* JADX INFO: renamed from: k1.a$a, reason: collision with other inner class name */
    public class C0362a implements InterfaceC2388b {
        public C0362a() {
        }

        @Override // p1.InterfaceC2388b
        public void a(long j9, long j10) {
            if (C2132a.this.f43446D == null || C2132a.this.f43481y) {
                return;
            }
            C2132a.this.f43446D.a(j9, j10);
        }
    }

    /* JADX INFO: renamed from: k1.a$b */
    public class b implements p1.f {
        public b() {
        }

        @Override // p1.f
        public void a(long j9, long j10) {
            C2132a.this.f43480x = (int) ((100 * j9) / j10);
            if (C2132a.this.f43447E == null || C2132a.this.f43481y) {
                return;
            }
            C2132a.this.f43447E.a(j9, j10);
        }
    }

    /* JADX INFO: renamed from: k1.a$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2133b f43485a;

        public c(C2133b c2133b) {
            this.f43485a = c2133b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2132a.this.k(this.f43485a);
        }
    }

    /* JADX INFO: renamed from: k1.a$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2133b f43487a;

        public d(C2133b c2133b) {
            this.f43487a = c2133b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2132a.this.k(this.f43487a);
        }
    }

    /* JADX INFO: renamed from: k1.a$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response f43489a;

        public e(Response response) {
            this.f43489a = response;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2132a.f(C2132a.this);
            C2132a.this.m();
        }
    }

    /* JADX INFO: renamed from: k1.a$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response f43491a;

        public f(Response response) {
            this.f43491a = response;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2132a.f(C2132a.this);
            C2132a.this.m();
        }
    }

    /* JADX INFO: renamed from: k1.a$g */
    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43493a;

        static {
            int[] iArr = new int[k1.f.values().length];
            f43493a = iArr;
            try {
                iArr[k1.f.JSON_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43493a[k1.f.JSON_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43493a[k1.f.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43493a[k1.f.BITMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43493a[k1.f.PARSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43493a[k1.f.PREFETCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: k1.a$h */
    public static class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f43496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f43497d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bitmap.Config f43498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f43499f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f43500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ImageView.ScaleType f43501h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CacheControl f43505l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Executor f43506m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public OkHttpClient f43507n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f43508o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k1.e f43494a = k1.e.MEDIUM;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public HashMap f43502i = new HashMap();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public HashMap f43503j = new HashMap();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public HashMap f43504k = new HashMap();

        public h(String str) {
            this.f43495b = 0;
            this.f43496c = str;
            this.f43495b = 0;
        }

        public h p(String str, String str2) {
            List arrayList = (List) this.f43502i.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f43502i.put(str, arrayList);
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
            return this;
        }

        public C2132a q() {
            return new C2132a(this);
        }

        public h r(OkHttpClient okHttpClient) {
            this.f43507n = okHttpClient;
            return this;
        }

        public h s(k1.e eVar) {
            this.f43494a = eVar;
            return this;
        }

        public h t(Object obj) {
            this.f43497d = obj;
            return this;
        }
    }

    /* JADX INFO: renamed from: k1.a$i */
    public static class i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f43511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f43512d;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CacheControl f43522n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Executor f43523o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public OkHttpClient f43524p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public String f43525q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f43526r;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k1.e f43509a = k1.e.MEDIUM;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f43513e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f43514f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f43515g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public File f43516h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public HashMap f43517i = new HashMap();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public HashMap f43518j = new HashMap();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public HashMap f43519k = new HashMap();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public HashMap f43520l = new HashMap();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HashMap f43521m = new HashMap();

        public i(String str) {
            this.f43510b = 1;
            this.f43511c = str;
            this.f43510b = 1;
        }

        public i s(String str, String str2) {
            this.f43518j.put(str, str2);
            return this;
        }

        public i t(String str, String str2) {
            List arrayList = (List) this.f43517i.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f43517i.put(str, arrayList);
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
            return this;
        }

        public C2132a u() {
            return new C2132a(this);
        }

        public i v(k1.e eVar) {
            this.f43509a = eVar;
            return this;
        }

        public i w(Object obj) {
            this.f43512d = obj;
            return this;
        }
    }

    public C2132a(h hVar) {
        this.f43464h = new HashMap();
        this.f43465i = new HashMap();
        this.f43466j = new HashMap();
        this.f43467k = new HashMap();
        this.f43468l = new HashMap();
        this.f43469m = new HashMap();
        this.f43470n = new HashMap();
        this.f43473q = null;
        this.f43474r = null;
        this.f43475s = null;
        this.f43476t = null;
        this.f43477u = null;
        this.f43444B = 0;
        this.f43452J = null;
        this.f43453K = null;
        this.f43454L = null;
        this.f43455M = null;
        this.f43456N = null;
        this.f43459c = 0;
        this.f43457a = hVar.f43495b;
        this.f43458b = hVar.f43494a;
        this.f43460d = hVar.f43496c;
        this.f43462f = hVar.f43497d;
        this.f43464h = hVar.f43502i;
        this.f43448F = hVar.f43498e;
        this.f43450H = hVar.f43500g;
        this.f43449G = hVar.f43499f;
        this.f43451I = hVar.f43501h;
        this.f43468l = hVar.f43503j;
        this.f43469m = hVar.f43504k;
        this.f43452J = hVar.f43505l;
        this.f43453K = hVar.f43506m;
        this.f43454L = hVar.f43507n;
        this.f43455M = hVar.f43508o;
    }

    public C2132a(i iVar) {
        this.f43464h = new HashMap();
        this.f43465i = new HashMap();
        this.f43466j = new HashMap();
        this.f43467k = new HashMap();
        this.f43468l = new HashMap();
        this.f43469m = new HashMap();
        this.f43470n = new HashMap();
        this.f43473q = null;
        this.f43474r = null;
        this.f43475s = null;
        this.f43476t = null;
        this.f43477u = null;
        this.f43444B = 0;
        this.f43452J = null;
        this.f43453K = null;
        this.f43454L = null;
        this.f43455M = null;
        this.f43456N = null;
        this.f43459c = 0;
        this.f43457a = iVar.f43510b;
        this.f43458b = iVar.f43509a;
        this.f43460d = iVar.f43511c;
        this.f43462f = iVar.f43512d;
        this.f43464h = iVar.f43517i;
        this.f43465i = iVar.f43518j;
        this.f43466j = iVar.f43519k;
        this.f43468l = iVar.f43520l;
        this.f43469m = iVar.f43521m;
        this.f43473q = iVar.f43513e;
        this.f43474r = iVar.f43514f;
        this.f43476t = iVar.f43516h;
        this.f43475s = iVar.f43515g;
        this.f43452J = iVar.f43522n;
        this.f43453K = iVar.f43523o;
        this.f43454L = iVar.f43524p;
        this.f43455M = iVar.f43525q;
        if (iVar.f43526r != null) {
            this.f43477u = MediaType.parse(iVar.f43526r);
        }
    }

    public static /* synthetic */ p1.d f(C2132a c2132a) {
        c2132a.getClass();
        return null;
    }

    public int A() {
        return this.f43459c;
    }

    public k1.f B() {
        return this.f43463g;
    }

    public int C() {
        return this.f43461e;
    }

    public p1.f D() {
        return new b();
    }

    public String E() {
        String strReplace = this.f43460d;
        for (Map.Entry entry : this.f43469m.entrySet()) {
            strReplace = strReplace.replace("{" + ((String) entry.getKey()) + "}", String.valueOf(entry.getValue()));
        }
        HttpUrl.Builder builderNewBuilder = HttpUrl.parse(strReplace).newBuilder();
        HashMap map = this.f43468l;
        if (map != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                String str = (String) entry2.getKey();
                List list = (List) entry2.getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        builderNewBuilder.addQueryParameter(str, (String) it.next());
                    }
                }
            }
        }
        return builderNewBuilder.build().toString();
    }

    public String F() {
        return this.f43455M;
    }

    public C2219a G(C2219a c2219a) {
        try {
            if (c2219a.a() != null && c2219a.a().body() != null && c2219a.a().body().source() != null) {
                c2219a.c(Okio.buffer(c2219a.a().body().source()).readUtf8());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return c2219a;
    }

    public C2133b H(Response response) {
        C2219a c2219a;
        C2133b c2133bB;
        switch (g.f43493a[this.f43463g.ordinal()]) {
            case 1:
                try {
                    return C2133b.f(new JSONArray(Okio.buffer(response.body().source()).readUtf8()));
                } catch (Exception e9) {
                    c2219a = new C2219a(e9);
                }
                break;
            case 2:
                try {
                    return C2133b.f(new JSONObject(Okio.buffer(response.body().source()).readUtf8()));
                } catch (Exception e10) {
                    c2219a = new C2219a(e10);
                }
                break;
            case 3:
                try {
                    return C2133b.f(Okio.buffer(response.body().source()).readUtf8());
                } catch (Exception e11) {
                    c2219a = new C2219a(e11);
                }
                break;
            case 4:
                synchronized (f43442Q) {
                    try {
                        try {
                            c2133bB = AbstractC2705c.b(response, this.f43449G, this.f43450H, this.f43448F, this.f43451I);
                        } catch (Exception e12) {
                            return C2133b.a(AbstractC2705c.e(new C2219a(e12)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c2133bB;
            case 5:
                try {
                    return C2133b.f(AbstractC2703a.a().a(this.f43456N).convert(response.body()));
                } catch (Exception e13) {
                    c2219a = new C2219a(e13);
                }
                break;
            case 6:
                try {
                    Okio.buffer(response.body().source()).skip(Long.MAX_VALUE);
                    return C2133b.f("prefetch");
                } catch (Exception e14) {
                    c2219a = new C2219a(e14);
                }
                break;
            default:
                return null;
        }
        return C2133b.a(AbstractC2705c.e(c2219a));
    }

    public void I(Call call) {
        this.f43479w = call;
    }

    public void J(Future future) {
        this.f43478v = future;
    }

    public void K(boolean z9) {
        this.f43443A = z9;
    }

    public void L(int i9) {
        this.f43461e = i9;
    }

    public void M(String str) {
        this.f43455M = str;
    }

    public void N() {
        this.f43482z = true;
        m();
    }

    public synchronized void g(C2219a c2219a) {
        try {
            try {
                if (!this.f43482z) {
                    if (this.f43481y) {
                        c2219a.b();
                        c2219a.d(0);
                    }
                    h(c2219a);
                }
                this.f43482z = true;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(C2219a c2219a) {
        InterfaceC2389c interfaceC2389c = this.f43445C;
        if (interfaceC2389c != null) {
            interfaceC2389c.b(c2219a);
        }
    }

    public void i(Response response) {
        Runnable fVar;
        try {
            this.f43482z = true;
            if (this.f43481y) {
                C2219a c2219a = new C2219a();
                c2219a.b();
                c2219a.d(0);
                m();
                return;
            }
            Executor executorA = this.f43453K;
            if (executorA != null) {
                fVar = new e(response);
            } else {
                executorA = C2173b.b().a().a();
                fVar = new f(response);
            }
            executorA.execute(fVar);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void j(C2133b c2133b) {
        Runnable dVar;
        try {
            this.f43482z = true;
            if (this.f43481y) {
                C2219a c2219a = new C2219a();
                c2219a.b();
                c2219a.d(0);
                h(c2219a);
                m();
                return;
            }
            Executor executorA = this.f43453K;
            if (executorA != null) {
                dVar = new c(c2133b);
            } else {
                executorA = C2173b.b().a().a();
                dVar = new d(c2133b);
            }
            executorA.execute(dVar);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void k(C2133b c2133b) {
        InterfaceC2389c interfaceC2389c = this.f43445C;
        if (interfaceC2389c != null) {
            interfaceC2389c.a((JSONObject) c2133b.c());
        }
        m();
    }

    public void l() {
        this.f43445C = null;
        this.f43446D = null;
        this.f43447E = null;
    }

    public void m() {
        l();
        C2528a.c().b(this);
    }

    public InterfaceC2387a n() {
        return null;
    }

    public void o(InterfaceC2389c interfaceC2389c) {
        this.f43463g = k1.f.JSON_OBJECT;
        this.f43445C = interfaceC2389c;
        C2528a.c().a(this);
    }

    public CacheControl p() {
        return this.f43452J;
    }

    public Call q() {
        return this.f43479w;
    }

    public String r() {
        return this.f43471o;
    }

    public InterfaceC2388b s() {
        return new C0362a();
    }

    public String t() {
        return this.f43472p;
    }

    public String toString() {
        return "ANRequest{sequenceNumber='" + this.f43461e + ", mMethod=" + this.f43457a + ", mPriority=" + this.f43458b + ", mRequestType=" + this.f43459c + ", mUrl=" + this.f43460d + '}';
    }

    public Headers u() {
        Headers.Builder builder = new Headers.Builder();
        try {
            HashMap map = this.f43464h;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            builder.add(str, (String) it.next());
                        }
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return builder.build();
    }

    public int v() {
        return this.f43457a;
    }

    public RequestBody w() {
        Iterator it;
        MultipartBody.Builder builder = new MultipartBody.Builder();
        MediaType mediaType = this.f43477u;
        if (mediaType == null) {
            mediaType = MultipartBody.FORM;
        }
        MultipartBody.Builder type = builder.setType(mediaType);
        try {
            it = this.f43467k.entrySet().iterator();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        if (it.hasNext()) {
            AbstractC1617D.a(((Map.Entry) it.next()).getValue());
            throw null;
        }
        Iterator it2 = this.f43470n.entrySet().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((List) ((Map.Entry) it2.next()).getValue()).iterator();
            if (it3.hasNext()) {
                AbstractC1617D.a(it3.next());
                throw null;
            }
        }
        return type.build();
    }

    public OkHttpClient x() {
        return this.f43454L;
    }

    public k1.e y() {
        return this.f43458b;
    }

    public RequestBody z() {
        String str = this.f43473q;
        if (str != null) {
            MediaType mediaType = this.f43477u;
            return mediaType != null ? RequestBody.create(mediaType, str) : RequestBody.create(f43440O, str);
        }
        String str2 = this.f43474r;
        if (str2 != null) {
            MediaType mediaType2 = this.f43477u;
            return mediaType2 != null ? RequestBody.create(mediaType2, str2) : RequestBody.create(f43441P, str2);
        }
        File file = this.f43476t;
        if (file != null) {
            MediaType mediaType3 = this.f43477u;
            return mediaType3 != null ? RequestBody.create(mediaType3, file) : RequestBody.create(f43441P, file);
        }
        byte[] bArr = this.f43475s;
        if (bArr != null) {
            MediaType mediaType4 = this.f43477u;
            return mediaType4 != null ? RequestBody.create(mediaType4, bArr) : RequestBody.create(f43441P, bArr);
        }
        FormBody.Builder builder = new FormBody.Builder();
        try {
            for (Map.Entry entry : this.f43465i.entrySet()) {
                builder.add((String) entry.getKey(), (String) entry.getValue());
            }
            for (Map.Entry entry2 : this.f43466j.entrySet()) {
                builder.addEncoded((String) entry2.getKey(), (String) entry2.getValue());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return builder.build();
    }
}
