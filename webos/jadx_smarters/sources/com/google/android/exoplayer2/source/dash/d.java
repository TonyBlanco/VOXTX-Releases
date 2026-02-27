package com.google.android.exoplayer2.source.dash;

import B3.X;
import D3.f;
import O2.A0;
import O2.C0897l1;
import O2.C0936z0;
import android.os.Handler;
import android.os.Message;
import b4.InterfaceC1211b;
import b4.InterfaceC1220k;
import d3.v;
import d3.w;
import d4.M;
import d4.k0;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import q3.C2540a;
import q3.C2544e;
import s3.C2707a;
import s3.C2708b;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1211b f25560a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f25561c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F3.c f25565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25569k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap f25564f = new TreeMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f25563e = k0.y(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2708b f25562d = new C2708b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25571b;

        public a(long j9, long j10) {
            this.f25570a = j9;
            this.f25571b = j10;
        }
    }

    public interface b {
        void a(long j9);

        void b();
    }

    public final class c implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X f25572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final A0 f25573b = new A0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2544e f25574c = new C2544e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f25575d = -9223372036854775807L;

        public c(InterfaceC1211b interfaceC1211b) {
            this.f25572a = X.l(interfaceC1211b);
        }

        @Override // d3.w
        public /* synthetic */ int a(InterfaceC1220k interfaceC1220k, int i9, boolean z9) {
            return v.a(this, interfaceC1220k, i9, z9);
        }

        @Override // d3.w
        public /* synthetic */ void b(M m9, int i9) {
            v.b(this, m9, i9);
        }

        @Override // d3.w
        public void c(M m9, int i9, int i10) {
            this.f25572a.b(m9, i9);
        }

        @Override // d3.w
        public void d(C0936z0 c0936z0) {
            this.f25572a.d(c0936z0);
        }

        @Override // d3.w
        public int e(InterfaceC1220k interfaceC1220k, int i9, boolean z9, int i10) {
            return this.f25572a.a(interfaceC1220k, i9, z9);
        }

        @Override // d3.w
        public void f(long j9, int i9, int i10, int i11, w.a aVar) {
            this.f25572a.f(j9, i9, i10, i11, aVar);
            l();
        }

        public final C2544e g() {
            this.f25574c.clear();
            if (this.f25572a.S(this.f25573b, this.f25574c, 0, false) != -4) {
                return null;
            }
            this.f25574c.i();
            return this.f25574c;
        }

        public boolean h(long j9) {
            return d.this.j(j9);
        }

        public void i(f fVar) {
            long j9 = this.f25575d;
            if (j9 == -9223372036854775807L || fVar.f1383i > j9) {
                this.f25575d = fVar.f1383i;
            }
            d.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j9 = this.f25575d;
            return d.this.n(j9 != -9223372036854775807L && j9 < fVar.f1382h);
        }

        public final void k(long j9, long j10) {
            d.this.f25563e.sendMessage(d.this.f25563e.obtainMessage(1, new a(j9, j10)));
        }

        public final void l() {
            while (this.f25572a.K(false)) {
                C2544e c2544eG = g();
                if (c2544eG != null) {
                    long j9 = c2544eG.f9701f;
                    C2540a c2540aA = d.this.f25562d.a(c2544eG);
                    if (c2540aA != null) {
                        C2707a c2707a = (C2707a) c2540aA.e(0);
                        if (d.h(c2707a.f49892a, c2707a.f49893c)) {
                            m(j9, c2707a);
                        }
                    }
                }
            }
            this.f25572a.s();
        }

        public final void m(long j9, C2707a c2707a) {
            long jF = d.f(c2707a);
            if (jF == -9223372036854775807L) {
                return;
            }
            k(j9, jF);
        }

        public void n() {
            this.f25572a.T();
        }
    }

    public d(F3.c cVar, b bVar, InterfaceC1211b interfaceC1211b) {
        this.f25565g = cVar;
        this.f25561c = bVar;
        this.f25560a = interfaceC1211b;
    }

    public static long f(C2707a c2707a) {
        try {
            return k0.W0(k0.E(c2707a.f49896f));
        } catch (C0897l1 unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    public final Map.Entry e(long j9) {
        return this.f25564f.ceilingEntry(Long.valueOf(j9));
    }

    public final void g(long j9, long j10) {
        Long l9 = (Long) this.f25564f.get(Long.valueOf(j10));
        if (l9 != null && l9.longValue() <= j9) {
            return;
        }
        this.f25564f.put(Long.valueOf(j10), Long.valueOf(j9));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f25569k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f25570a, aVar.f25571b);
        return true;
    }

    public final void i() {
        if (this.f25567i) {
            this.f25568j = true;
            this.f25567i = false;
            this.f25561c.b();
        }
    }

    public boolean j(long j9) {
        F3.c cVar = this.f25565g;
        boolean z9 = false;
        if (!cVar.f1936d) {
            return false;
        }
        if (this.f25568j) {
            return true;
        }
        Map.Entry entryE = e(cVar.f1940h);
        if (entryE != null && ((Long) entryE.getValue()).longValue() < j9) {
            this.f25566h = ((Long) entryE.getKey()).longValue();
            l();
            z9 = true;
        }
        if (z9) {
            i();
        }
        return z9;
    }

    public c k() {
        return new c(this.f25560a);
    }

    public final void l() {
        this.f25561c.a(this.f25566h);
    }

    public void m(f fVar) {
        this.f25567i = true;
    }

    public boolean n(boolean z9) {
        if (!this.f25565g.f1936d) {
            return false;
        }
        if (this.f25568j) {
            return true;
        }
        if (!z9) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f25569k = true;
        this.f25563e.removeCallbacksAndMessages(null);
    }

    public final void p() {
        Iterator it = this.f25564f.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f25565g.f1940h) {
                it.remove();
            }
        }
    }

    public void q(F3.c cVar) {
        this.f25568j = false;
        this.f25566h = -9223372036854775807L;
        this.f25565g = cVar;
        p();
    }
}
