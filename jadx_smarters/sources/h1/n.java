package h1;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import h1.InterfaceC1847b;
import h1.p;
import h1.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.a f41546a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f41550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p.a f41551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f41552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f41553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f41556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r f41559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1847b.a f41560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f41561q;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f41562a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f41563c;

        public a(String str, long j9) {
            this.f41562a = str;
            this.f41563c = j9;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f41546a.a(this.f41562a, this.f41563c);
            n.this.f41546a.b(n.this.toString());
        }
    }

    public interface b {
        void a(n nVar, p pVar);

        void b(n nVar);
    }

    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public n(int i9, String str, p.a aVar) {
        this.f41546a = v.a.f41585c ? new v.a() : null;
        this.f41550f = new Object();
        this.f41554j = true;
        this.f41555k = false;
        this.f41556l = false;
        this.f41557m = false;
        this.f41558n = false;
        this.f41560p = null;
        this.f41547c = i9;
        this.f41548d = str;
        this.f41551g = aVar;
        R(new e());
        this.f41549e = o(str);
    }

    public static int o(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public String A() {
        return x();
    }

    public abstract c B();

    public r C() {
        return this.f41559o;
    }

    public final int D() {
        return C().c();
    }

    public int E() {
        return this.f41549e;
    }

    public String F() {
        return this.f41548d;
    }

    public boolean G() {
        boolean z9;
        synchronized (this.f41550f) {
            z9 = this.f41556l;
        }
        return z9;
    }

    public boolean H() {
        boolean z9;
        synchronized (this.f41550f) {
            z9 = this.f41555k;
        }
        return z9;
    }

    public void I() {
        synchronized (this.f41550f) {
            this.f41556l = true;
        }
    }

    public void J() {
        b bVar;
        synchronized (this.f41550f) {
            bVar = this.f41561q;
        }
        if (bVar != null) {
            bVar.b(this);
        }
    }

    public void K(p pVar) {
        b bVar;
        synchronized (this.f41550f) {
            bVar = this.f41561q;
        }
        if (bVar != null) {
            bVar.a(this, pVar);
        }
    }

    public u L(u uVar) {
        return uVar;
    }

    public abstract p M(k kVar);

    public void N(int i9) {
        o oVar = this.f41553i;
        if (oVar != null) {
            oVar.e(this, i9);
        }
    }

    public n O(InterfaceC1847b.a aVar) {
        this.f41560p = aVar;
        return this;
    }

    public void P(b bVar) {
        synchronized (this.f41550f) {
            this.f41561q = bVar;
        }
    }

    public n Q(o oVar) {
        this.f41553i = oVar;
        return this;
    }

    public n R(r rVar) {
        this.f41559o = rVar;
        return this;
    }

    public final n S(int i9) {
        this.f41552h = Integer.valueOf(i9);
        return this;
    }

    public final boolean T() {
        return this.f41554j;
    }

    public final boolean U() {
        return this.f41558n;
    }

    public final boolean V() {
        return this.f41557m;
    }

    public void b(String str) {
        if (v.a.f41585c) {
            this.f41546a.a(str, Thread.currentThread().getId());
        }
    }

    public void h() {
        synchronized (this.f41550f) {
            this.f41555k = true;
            this.f41551g = null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        c cVarB = B();
        c cVarB2 = nVar.B();
        return cVarB == cVarB2 ? this.f41552h.intValue() - nVar.f41552h.intValue() : cVarB2.ordinal() - cVarB.ordinal();
    }

    public void j(u uVar) {
        p.a aVar;
        synchronized (this.f41550f) {
            aVar = this.f41551g;
        }
        if (aVar != null) {
            aVar.a(uVar);
        }
    }

    public abstract void l(Object obj);

    public final byte[] n(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode((String) entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e9) {
            throw new RuntimeException("Encoding not supported: " + str, e9);
        }
    }

    public void p(String str) {
        o oVar = this.f41553i;
        if (oVar != null) {
            oVar.c(this);
        }
        if (v.a.f41585c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id));
            } else {
                this.f41546a.a(str, id);
                this.f41546a.b(toString());
            }
        }
    }

    public byte[] q() {
        Map mapW = w();
        if (mapW == null || mapW.size() <= 0) {
            return null;
        }
        return n(mapW, x());
    }

    public String r() {
        return "application/x-www-form-urlencoded; charset=" + x();
    }

    public InterfaceC1847b.a s() {
        return this.f41560p;
    }

    public String t() {
        String strF = F();
        int iV = v();
        if (iV == 0 || iV == -1) {
            return strF;
        }
        return Integer.toString(iV) + '-' + strF;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(E());
        StringBuilder sb = new StringBuilder();
        sb.append(H() ? "[X] " : "[ ] ");
        sb.append(F());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(B());
        sb.append(" ");
        sb.append(this.f41552h);
        return sb.toString();
    }

    public Map u() {
        return Collections.emptyMap();
    }

    public int v() {
        return this.f41547c;
    }

    public Map w() {
        return null;
    }

    public String x() {
        return "UTF-8";
    }

    public byte[] y() {
        Map mapZ = z();
        if (mapZ == null || mapZ.size() <= 0) {
            return null;
        }
        return n(mapZ, A());
    }

    public Map z() {
        return w();
    }
}
