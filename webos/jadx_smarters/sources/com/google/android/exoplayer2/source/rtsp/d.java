package com.google.android.exoplayer2.source.rtsp;

import K3.o;
import K3.p;
import K3.s;
import K3.t;
import K3.u;
import K3.v;
import K3.w;
import K3.x;
import K3.z;
import O2.C0897l1;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.e;
import com.google.android.exoplayer2.source.rtsp.f;
import com.google.android.exoplayer2.source.rtsp.g;
import com.google.android.exoplayer2.source.rtsp.h;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.k0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import org.apache.http.HttpStatus;
import r5.C2678g;
import r5.q;
import s5.AbstractC2717A;
import s5.AbstractC2743y;
import s5.C2744z;
import s5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f25637a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f25638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SocketFactory f25640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25641f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Uri f25645j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h.a f25647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f25648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f25649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.google.android.exoplayer2.source.rtsp.c f25650o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f25653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25654s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f25642g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f25643h = new SparseArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0244d f25644i = new C0244d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f25646k = new g(new c());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25655t = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25651p = -1;

    public final class b implements Runnable, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f25656a = k0.x();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f25657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f25658d;

        public b(long j9) {
            this.f25657c = j9;
        }

        public void a() {
            if (this.f25658d) {
                return;
            }
            this.f25658d = true;
            this.f25656a.postDelayed(this, this.f25657c);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f25658d = false;
            this.f25656a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f25644i.e(d.this.f25645j, d.this.f25648m);
            this.f25656a.postDelayed(this, this.f25657c);
        }
    }

    public final class c implements g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f25660a = k0.x();

        public c() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.g.d
        public /* synthetic */ void a(Exception exc) {
            p.a(this, exc);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.g.d
        public /* synthetic */ void b(List list, Exception exc) {
            p.b(this, list, exc);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.g.d
        public void c(final List list) {
            this.f25660a.post(new Runnable() { // from class: K3.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3745a.h(list);
                }
            });
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final void h(List list) {
            d.this.m0(list);
            if (h.e(list)) {
                g(list);
            } else {
                f(list);
            }
        }

        public final void f(List list) {
            d.this.f25644i.d(Integer.parseInt((String) AbstractC1684a.e(h.k(list).f3766c.d("CSeq"))));
        }

        public final void g(List list) {
            AbstractC2743y abstractC2743yZ;
            v vVarL = h.l(list);
            int i9 = Integer.parseInt((String) AbstractC1684a.e(vVarL.f3769b.d("CSeq")));
            u uVar = (u) d.this.f25643h.get(i9);
            if (uVar == null) {
                return;
            }
            d.this.f25643h.remove(i9);
            int i10 = uVar.f3765b;
            try {
                try {
                    int i11 = vVarL.f3768a;
                    if (i11 == 200) {
                        switch (i10) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                i(new K3.k(vVarL.f3769b, i11, z.b(vVarL.f3770c)));
                                return;
                            case 4:
                                j(new s(i11, h.j(vVarL.f3769b.d("Public"))));
                                return;
                            case 5:
                                k();
                                return;
                            case 6:
                                String strD = vVarL.f3769b.d("Range");
                                w wVarD = strD == null ? w.f3771c : w.d(strD);
                                try {
                                    String strD2 = vVarL.f3769b.d("RTP-Info");
                                    abstractC2743yZ = strD2 == null ? AbstractC2743y.z() : x.a(strD2, d.this.f25645j);
                                } catch (C0897l1 unused) {
                                    abstractC2743yZ = AbstractC2743y.z();
                                }
                                l(new t(vVarL.f3768a, wVarD, abstractC2743yZ));
                                return;
                            case 10:
                                String strD3 = vVarL.f3769b.d("Session");
                                String strD4 = vVarL.f3769b.d("Transport");
                                if (strD3 == null || strD4 == null) {
                                    throw C0897l1.c("Missing mandatory session or transport header", null);
                                }
                                m(new i(vVarL.f3768a, h.m(strD3), strD4));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i11 == 401) {
                        if (d.this.f25647l == null || d.this.f25653r) {
                            d.this.j0(new RtspMediaSource.c(h.t(i10) + " " + vVarL.f3768a));
                            return;
                        }
                        AbstractC2743y abstractC2743yE = vVarL.f3769b.e("WWW-Authenticate");
                        if (abstractC2743yE.isEmpty()) {
                            throw C0897l1.c("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i12 = 0; i12 < abstractC2743yE.size(); i12++) {
                            d.this.f25650o = h.o((String) abstractC2743yE.get(i12));
                            if (d.this.f25650o.f25633a == 2) {
                                break;
                            }
                        }
                        d.this.f25644i.b();
                        d.this.f25653r = true;
                        return;
                    }
                    if (i11 == 461) {
                        String str = h.t(i10) + " " + vVarL.f3768a;
                        d.this.j0((i10 != 10 || ((String) AbstractC1684a.e(uVar.f3766c.d("Transport"))).contains("TCP")) ? new RtspMediaSource.c(str) : new RtspMediaSource.d(str));
                        return;
                    }
                    if (i11 != 301 && i11 != 302) {
                        d.this.j0(new RtspMediaSource.c(h.t(i10) + " " + vVarL.f3768a));
                        return;
                    }
                    if (d.this.f25651p != -1) {
                        d.this.f25651p = 0;
                    }
                    String strD5 = vVarL.f3769b.d("Location");
                    if (strD5 == null) {
                        d.this.f25637a.b("Redirection without new location.", null);
                        return;
                    }
                    Uri uri = Uri.parse(strD5);
                    d.this.f25645j = h.p(uri);
                    d.this.f25647l = h.n(uri);
                    d.this.f25644i.c(d.this.f25645j, d.this.f25648m);
                } catch (C0897l1 e9) {
                    e = e9;
                    d.this.j0(new RtspMediaSource.c(e));
                }
            } catch (IllegalArgumentException e10) {
                e = e10;
                d.this.j0(new RtspMediaSource.c(e));
            }
        }

        public final void i(K3.k kVar) {
            w wVarD = w.f3771c;
            String str = (String) kVar.f3749c.f3778a.get("range");
            if (str != null) {
                try {
                    wVarD = w.d(str);
                } catch (C0897l1 e9) {
                    d.this.f25637a.b("SDP format error.", e9);
                    return;
                }
            }
            AbstractC2743y abstractC2743yH0 = d.h0(kVar, d.this.f25645j);
            if (abstractC2743yH0.isEmpty()) {
                d.this.f25637a.b("No playable track.", null);
            } else {
                d.this.f25637a.f(wVarD, abstractC2743yH0);
                d.this.f25652q = true;
            }
        }

        public final void j(s sVar) {
            if (d.this.f25649n != null) {
                return;
            }
            if (d.q0(sVar.f3760b)) {
                d.this.f25644i.c(d.this.f25645j, d.this.f25648m);
            } else {
                d.this.f25637a.b("DESCRIBE not supported.", null);
            }
        }

        public final void k() {
            AbstractC1684a.g(d.this.f25651p == 2);
            d.this.f25651p = 1;
            d.this.f25654s = false;
            if (d.this.f25655t != -9223372036854775807L) {
                d dVar = d.this;
                dVar.u0(k0.x1(dVar.f25655t));
            }
        }

        public final void l(t tVar) {
            boolean z9 = true;
            if (d.this.f25651p != 1 && d.this.f25651p != 2) {
                z9 = false;
            }
            AbstractC1684a.g(z9);
            d.this.f25651p = 2;
            if (d.this.f25649n == null) {
                d dVar = d.this;
                dVar.f25649n = dVar.new b(30000L);
                d.this.f25649n.a();
            }
            d.this.f25655t = -9223372036854775807L;
            d.this.f25638c.a(k0.P0(tVar.f3762b.f3773a), tVar.f3763c);
        }

        public final void m(i iVar) {
            AbstractC1684a.g(d.this.f25651p != -1);
            d.this.f25651p = 1;
            d.this.f25648m = iVar.f25735b.f25732a;
            d.this.i0();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.d$d, reason: collision with other inner class name */
    public final class C0244d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u f25663b;

        public C0244d() {
        }

        public final u a(int i9, String str, Map map, Uri uri) {
            String str2 = d.this.f25639d;
            int i10 = this.f25662a;
            this.f25662a = i10 + 1;
            e.b bVar = new e.b(str2, str, i10);
            if (d.this.f25650o != null) {
                AbstractC1684a.i(d.this.f25647l);
                try {
                    bVar.b("Authorization", d.this.f25650o.a(d.this.f25647l, uri, i9));
                } catch (C0897l1 e9) {
                    d.this.j0(new RtspMediaSource.c(e9));
                }
            }
            bVar.d(map);
            return new u(uri, i9, bVar.e(), "");
        }

        public void b() {
            AbstractC1684a.i(this.f25663b);
            C2744z c2744zB = this.f25663b.f3766c.b();
            HashMap map = new HashMap();
            for (String str : c2744zB.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    map.put(str, (String) D.d(c2744zB.get((Object) str)));
                }
            }
            h(a(this.f25663b.f3765b, d.this.f25648m, map, this.f25663b.f3764a));
        }

        public void c(Uri uri, String str) {
            h(a(2, str, AbstractC2717A.k(), uri));
        }

        public void d(int i9) {
            i(new v(HttpStatus.SC_METHOD_NOT_ALLOWED, new e.b(d.this.f25639d, d.this.f25648m, i9).e()));
            this.f25662a = Math.max(this.f25662a, i9 + 1);
        }

        public void e(Uri uri, String str) {
            h(a(4, str, AbstractC2717A.k(), uri));
        }

        public void f(Uri uri, String str) {
            AbstractC1684a.g(d.this.f25651p == 2);
            h(a(5, str, AbstractC2717A.k(), uri));
            d.this.f25654s = true;
        }

        public void g(Uri uri, long j9, String str) {
            boolean z9 = true;
            if (d.this.f25651p != 1 && d.this.f25651p != 2) {
                z9 = false;
            }
            AbstractC1684a.g(z9);
            h(a(6, str, AbstractC2717A.m("Range", w.b(j9)), uri));
        }

        public final void h(u uVar) {
            int i9 = Integer.parseInt((String) AbstractC1684a.e(uVar.f3766c.d("CSeq")));
            AbstractC1684a.g(d.this.f25643h.get(i9) == null);
            d.this.f25643h.append(i9, uVar);
            AbstractC2743y abstractC2743yQ = h.q(uVar);
            d.this.m0(abstractC2743yQ);
            d.this.f25646k.h(abstractC2743yQ);
            this.f25663b = uVar;
        }

        public final void i(v vVar) {
            AbstractC2743y abstractC2743yR = h.r(vVar);
            d.this.m0(abstractC2743yR);
            d.this.f25646k.h(abstractC2743yR);
        }

        public void j(Uri uri, String str, String str2) {
            d.this.f25651p = 0;
            h(a(10, str2, AbstractC2717A.m("Transport", str), uri));
        }

        public void k(Uri uri, String str) {
            if (d.this.f25651p == -1 || d.this.f25651p == 0) {
                return;
            }
            d.this.f25651p = 0;
            h(a(12, str, AbstractC2717A.k(), uri));
        }
    }

    public interface e {
        void a(long j9, AbstractC2743y abstractC2743y);

        void c(RtspMediaSource.c cVar);

        void d();
    }

    public interface f {
        void b(String str, Throwable th);

        void f(w wVar, AbstractC2743y abstractC2743y);
    }

    public d(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z9) {
        this.f25637a = fVar;
        this.f25638c = eVar;
        this.f25639d = str;
        this.f25640e = socketFactory;
        this.f25641f = z9;
        this.f25645j = h.p(uri);
        this.f25647l = h.n(uri);
    }

    public static AbstractC2743y h0(K3.k kVar, Uri uri) {
        AbstractC2743y.a aVar = new AbstractC2743y.a();
        for (int i9 = 0; i9 < kVar.f3749c.f3779b.size(); i9++) {
            K3.a aVar2 = (K3.a) kVar.f3749c.f3779b.get(i9);
            if (K3.h.c(aVar2)) {
                aVar.a(new o(kVar.f3747a, aVar2, uri));
            }
        }
        return aVar.k();
    }

    public static boolean q0(List list) {
        return list.isEmpty() || list.contains(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f25649n;
        if (bVar != null) {
            bVar.close();
            this.f25649n = null;
            this.f25644i.k(this.f25645j, (String) AbstractC1684a.e(this.f25648m));
        }
        this.f25646k.close();
    }

    public final void i0() {
        f.d dVar = (f.d) this.f25642g.pollFirst();
        if (dVar == null) {
            this.f25638c.d();
        } else {
            this.f25644i.j(dVar.c(), dVar.d(), this.f25648m);
        }
    }

    public final void j0(Throwable th) {
        RtspMediaSource.c cVar = th instanceof RtspMediaSource.c ? (RtspMediaSource.c) th : new RtspMediaSource.c(th);
        if (this.f25652q) {
            this.f25638c.c(cVar);
        } else {
            this.f25637a.b(q.d(th.getMessage()), th);
        }
    }

    public final Socket k0(Uri uri) {
        AbstractC1684a.a(uri.getHost() != null);
        return this.f25640e.createSocket((String) AbstractC1684a.e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    public int l0() {
        return this.f25651p;
    }

    public final void m0(List list) {
        if (this.f25641f) {
            AbstractC1681B.b("RtspClient", C2678g.g("\n").d(list));
        }
    }

    public void n0(int i9, g.b bVar) {
        this.f25646k.g(i9, bVar);
    }

    public void o0() {
        try {
            close();
            g gVar = new g(new c());
            this.f25646k = gVar;
            gVar.e(k0(this.f25645j));
            this.f25648m = null;
            this.f25653r = false;
            this.f25650o = null;
        } catch (IOException e9) {
            this.f25638c.c(new RtspMediaSource.c(e9));
        }
    }

    public void p0(long j9) {
        if (this.f25651p == 2 && !this.f25654s) {
            this.f25644i.f(this.f25645j, (String) AbstractC1684a.e(this.f25648m));
        }
        this.f25655t = j9;
    }

    public void r0(List list) {
        this.f25642g.addAll(list);
        i0();
    }

    public void s0() {
        this.f25651p = 1;
    }

    public void t0() throws IOException {
        try {
            this.f25646k.e(k0(this.f25645j));
            this.f25644i.e(this.f25645j, this.f25648m);
        } catch (IOException e9) {
            k0.o(this.f25646k);
            throw e9;
        }
    }

    public void u0(long j9) {
        this.f25644i.g(this.f25645j, j9, (String) AbstractC1684a.e(this.f25648m));
    }
}
