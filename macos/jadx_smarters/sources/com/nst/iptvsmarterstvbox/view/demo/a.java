package com.nst.iptvsmarterstvbox.view.demo;

import B3.g0;
import B3.i0;
import O2.C0936z0;
import O2.G1;
import O2.H0;
import O2.V1;
import V2.C1056m;
import V2.InterfaceC1058o;
import V2.InterfaceC1065w;
import V2.V;
import Z3.u;
import Z3.z;
import a7.j;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import androidx.fragment.app.m;
import b4.InterfaceC1224o;
import com.nst.iptvsmarterstvbox.view.demo.b;
import d4.AbstractC1681B;
import d4.k0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import r7.AbstractServiceC2682a;
import z3.AbstractC3050u;
import z3.AbstractServiceC3053x;
import z3.C3032c;
import z3.C3043n;
import z3.C3048s;
import z3.C3052w;
import z3.InterfaceC3034e;
import z3.InterfaceC3045p;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1224o.a f34803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f34804c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f34805d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3045p f34806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f34807f;

    public class b implements C3048s.d {
        public b() {
        }

        @Override // z3.C3048s.d
        public void a(C3048s c3048s, C3032c c3032c, Exception exc) {
            a.this.f34805d.put(c3032c.f52714a.f52802c, c3032c);
            Iterator it = a.this.f34804c.iterator();
            while (it.hasNext()) {
                ((c) it.next()).Y0();
            }
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void b(C3048s c3048s, A3.c cVar, int i9) {
            AbstractC3050u.e(this, c3048s, cVar, i9);
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void c(C3048s c3048s) {
            AbstractC3050u.c(this, c3048s);
        }

        @Override // z3.C3048s.d
        public void d(C3048s c3048s, C3032c c3032c) {
            a.this.f34805d.remove(c3032c.f52714a.f52802c);
            Iterator it = a.this.f34804c.iterator();
            while (it.hasNext()) {
                ((c) it.next()).Y0();
            }
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void e(C3048s c3048s, boolean z9) {
            AbstractC3050u.b(this, c3048s, z9);
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void f(C3048s c3048s, boolean z9) {
            AbstractC3050u.f(this, c3048s, z9);
        }

        @Override // z3.C3048s.d
        public /* synthetic */ void g(C3048s c3048s) {
            AbstractC3050u.d(this, c3048s);
        }
    }

    public interface c {
        void Y0();
    }

    public final class d implements C3043n.c, b.InterfaceC0285b, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f34809a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C3043n f34810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final H0 f34811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.nst.iptvsmarterstvbox.view.demo.b f34812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e f34813f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f34814g;

        public d(m mVar, C3043n c3043n, H0 h02) {
            this.f34809a = mVar;
            this.f34810c = c3043n;
            this.f34811d = h02;
            c3043n.H(this);
        }

        @Override // z3.C3043n.c
        public void a(C3043n c3043n, IOException iOException) {
            boolean z9 = iOException instanceof C3043n.f;
            int i9 = z9 ? j.f13188Z0 : j.f13218c1;
            String str = z9 ? "Downloading live content unsupported" : "Failed to start download";
            Toast.makeText(a.this.f34802a, i9, 1).show();
            AbstractC1681B.e("DownloadTracker", str, iOException);
        }

        @Override // com.nst.iptvsmarterstvbox.view.demo.b.InterfaceC0285b
        public void b(z zVar) {
            for (int i9 = 0; i9 < this.f34810c.u(); i9++) {
                this.f34810c.m(i9);
                this.f34810c.j(i9, zVar);
            }
            C3052w c3052wF = f();
            if (c3052wF.f52804e.isEmpty()) {
                return;
            }
            n(c3052wF);
        }

        @Override // z3.C3043n.c
        public void c(C3043n c3043n) {
            C0936z0 c0936z0G = g(c3043n);
            if (c0936z0G == null) {
                i(c3043n);
                return;
            }
            if (k0.f39777a < 18) {
                Toast.makeText(a.this.f34802a, j.f13035J1, 1).show();
                AbstractC1681B.d("DownloadTracker", "Downloading DRM protected content is not supported on API versions below 18");
            } else if (!h(c0936z0G.f6470p)) {
                Toast.makeText(a.this.f34802a, j.f13228d1, 1).show();
                AbstractC1681B.d("DownloadTracker", "Downloading content where DRM scheme data is not located in the manifest is not supported");
            } else {
                e eVar = new e(c0936z0G, this.f34811d.f5528c.f5627d, a.this.f34803b, this, c3043n);
                this.f34813f = eVar;
                eVar.execute(new Void[0]);
            }
        }

        public final C3052w f() {
            return this.f34810c.s(k0.s0((String) r5.m.k(this.f34811d.f5531f.f5805a.toString()))).a(this.f34814g);
        }

        public final C0936z0 g(C3043n c3043n) {
            for (int i9 = 0; i9 < c3043n.u(); i9++) {
                u.a aVarT = c3043n.t(i9);
                for (int i10 = 0; i10 < aVarT.d(); i10++) {
                    i0 i0VarF = aVarT.f(i10);
                    for (int i11 = 0; i11 < i0VarF.f590a; i11++) {
                        g0 g0VarB = i0VarF.b(i11);
                        for (int i12 = 0; i12 < g0VarB.f581a; i12++) {
                            C0936z0 c0936z0C = g0VarB.c(i12);
                            if (c0936z0C.f6470p != null) {
                                return c0936z0C;
                            }
                        }
                    }
                }
            }
            return null;
        }

        public final boolean h(C1056m c1056m) {
            for (int i9 = 0; i9 < c1056m.f10009e; i9++) {
                if (c1056m.f(i9).d()) {
                    return true;
                }
            }
            return false;
        }

        public final void i(C3043n c3043n) {
            if (c3043n.u() == 0) {
                AbstractC1681B.b("DownloadTracker", "No periods found. Downloading entire stream.");
                m();
                this.f34810c.I();
                return;
            }
            V1 v1W = this.f34810c.w(0);
            if (com.nst.iptvsmarterstvbox.view.demo.b.c0(v1W)) {
                com.nst.iptvsmarterstvbox.view.demo.b bVarS = com.nst.iptvsmarterstvbox.view.demo.b.S(S2.a.f9388b, v1W, C3043n.q(a.this.f34802a), false, true, this, this);
                this.f34812e = bVarS;
                bVarS.show(this.f34809a, (String) null);
            } else {
                AbstractC1681B.b("DownloadTracker", "No dialog content. Downloading entire stream.");
                m();
                this.f34810c.I();
            }
        }

        public final void j(C3043n c3043n, byte[] bArr) {
            this.f34814g = bArr;
            i(c3043n);
        }

        public final void k(InterfaceC1058o.a aVar) {
            Toast.makeText(a.this.f34802a, j.f13228d1, 1).show();
            AbstractC1681B.e("DownloadTracker", "Failed to fetch offline DRM license", aVar);
        }

        public void l() {
            this.f34810c.I();
            com.nst.iptvsmarterstvbox.view.demo.b bVar = this.f34812e;
            if (bVar != null) {
                bVar.dismiss();
            }
            e eVar = this.f34813f;
            if (eVar != null) {
                eVar.cancel(false);
            }
        }

        public final void m() {
            n(f());
        }

        public final void n(C3052w c3052w) {
            AbstractServiceC3053x.x(a.this.f34802a, AbstractServiceC2682a.class, c3052w, false);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f34812e = null;
            this.f34810c.I();
        }
    }

    public static final class e extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0936z0 f34816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final H0.f f34817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC1224o.a f34818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f34819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C3043n f34820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f34821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC1058o.a f34822g;

        public e(C0936z0 c0936z0, H0.f fVar, InterfaceC1224o.a aVar, d dVar, C3043n c3043n) {
            this.f34816a = c0936z0;
            this.f34817b = fVar;
            this.f34818c = aVar;
            this.f34819d = dVar;
            this.f34820e = c3043n;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            String string = this.f34817b.f5583d.toString();
            H0.f fVar = this.f34817b;
            V vM = V.m(string, fVar.f5588i, this.f34818c, fVar.f5585f, new InterfaceC1065w.a());
            try {
                try {
                    this.f34821f = vM.h(this.f34816a);
                } catch (InterfaceC1058o.a e9) {
                    this.f34822g = e9;
                }
                return null;
            } finally {
                vM.n();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r32) {
            InterfaceC1058o.a aVar = this.f34822g;
            if (aVar != null) {
                this.f34819d.k(aVar);
            } else {
                this.f34819d.j(this.f34820e, (byte[]) r5.m.k(this.f34821f));
            }
        }
    }

    public a(Context context, InterfaceC1224o.a aVar, C3048s c3048s) {
        this.f34802a = context.getApplicationContext();
        this.f34803b = aVar;
        this.f34806e = c3048s.f();
        c3048s.d(new b());
        h();
    }

    public void e(c cVar) {
        this.f34804c.add((c) r5.m.k(cVar));
    }

    public C3052w f(Uri uri) {
        C3032c c3032c = (C3032c) this.f34805d.get(uri);
        if (c3032c == null || c3032c.f52715b == 4) {
            return null;
        }
        return c3032c.f52714a;
    }

    public boolean g(H0 h02) {
        C3032c c3032c = (C3032c) this.f34805d.get(((H0.h) r5.m.k(h02.f5528c)).f5625a);
        return (c3032c == null || c3032c.f52715b == 4) ? false : true;
    }

    public final void h() {
        try {
            InterfaceC3034e interfaceC3034eD = this.f34806e.d(new int[0]);
            while (interfaceC3034eD.a0()) {
                try {
                    C3032c c3032cJ = interfaceC3034eD.J();
                    this.f34805d.put(c3032cJ.f52714a.f52802c, c3032cJ);
                } finally {
                }
            }
            interfaceC3034eD.close();
        } catch (IOException e9) {
            AbstractC1681B.k("DownloadTracker", "Failed to query downloads", e9);
        }
    }

    public void i(c cVar) {
        this.f34804c.remove(cVar);
    }

    public void j(m mVar, H0 h02, G1 g12) {
        C3032c c3032c = (C3032c) this.f34805d.get(((H0.h) r5.m.k(h02.f5528c)).f5625a);
        if (c3032c != null && c3032c.f52715b != 4) {
            AbstractServiceC3053x.y(this.f34802a, AbstractServiceC2682a.class, c3032c.f52714a.f52801a, false);
            return;
        }
        d dVar = this.f34807f;
        if (dVar != null) {
            dVar.l();
        }
        this.f34807f = new d(mVar, C3043n.p(this.f34802a, h02, g12, this.f34803b), h02);
    }
}
