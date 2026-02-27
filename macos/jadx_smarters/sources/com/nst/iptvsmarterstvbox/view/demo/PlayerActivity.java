package com.nst.iptvsmarterstvbox.view.demo;

import B3.C;
import B3.C0509q;
import C3.e;
import O2.AbstractC0926v1;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.InterfaceC0933y;
import O2.Q1;
import O2.R0;
import O2.V1;
import P3.f;
import Q2.C1019e;
import V2.C1055l;
import V2.L;
import Z2.d;
import Z2.h;
import Z3.z;
import a7.g;
import a7.j;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import b4.InterfaceC1224o;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import d4.C1694k;
import d4.C1700q;
import d4.InterfaceC1699p;
import d4.k0;
import e4.C1737C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.AbstractC2392B;
import p3.t;
import p3.u;
import q3.C2540a;
import r7.AbstractC2683b;
import r7.AbstractC2688g;
import z3.C3052w;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class PlayerActivity extends androidx.appcompat.app.b implements View.OnClickListener, StyledPlayerView.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StyledPlayerView f34767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f34768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0933y f34770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f34772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC1224o.a f34773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f34774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z f34775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1694k f34776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public V1 f34777n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f34778o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f34780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f34781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h.c f34782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h.c.C0149c f34783t;

    public class b implements InterfaceC1699p {
        public b() {
        }

        @Override // d4.InterfaceC1699p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair a(C0909p1 c0909p1) {
            String string = PlayerActivity.this.getString(j.f13065M1);
            Throwable cause = c0909p1.getCause();
            if (cause instanceof u.b) {
                u.b bVar = (u.b) cause;
                t tVar = bVar.f46381d;
                string = tVar == null ? bVar.getCause() instanceof AbstractC2392B.c ? PlayerActivity.this.getString(j.f13115R1) : bVar.f46380c ? PlayerActivity.this.getString(j.f13095P1, bVar.f46379a) : PlayerActivity.this.getString(j.f13085O1, bVar.f46379a) : PlayerActivity.this.getString(j.f13075N1, tVar.f46299a);
            }
            return Pair.create(0, string);
        }
    }

    public class c implements InterfaceC0920t1.d {
        public c() {
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void A(C1019e c1019e) {
            AbstractC0926v1.a(this, c1019e);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void B(boolean z9) {
            AbstractC0926v1.j(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public void E(int i9) {
            if (i9 == 4) {
                PlayerActivity.this.R1();
            }
            PlayerActivity.this.U1();
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void J(boolean z9) {
            AbstractC0926v1.y(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void M(int i9, boolean z9) {
            AbstractC0926v1.f(this, i9, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void O(InterfaceC0920t1.b bVar) {
            AbstractC0926v1.b(this, bVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void P() {
            AbstractC0926v1.w(this);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void S(InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
            AbstractC0926v1.v(this, eVar, eVar2, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void U(int i9, int i10) {
            AbstractC0926v1.A(this, i9, i10);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void V(Q1 q12, int i9) {
            AbstractC0926v1.B(this, q12, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void W(C0909p1 c0909p1) {
            AbstractC0926v1.s(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void Y(z zVar) {
            AbstractC0926v1.C(this, zVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a(boolean z9) {
            AbstractC0926v1.z(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a0(C0921u c0921u) {
            AbstractC0926v1.e(this, c0921u);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void b0(int i9) {
            AbstractC0926v1.u(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void d0(boolean z9) {
            AbstractC0926v1.h(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void e(C2540a c2540a) {
            AbstractC0926v1.m(this, c2540a);
        }

        @Override // O2.InterfaceC0920t1.d
        public void f0(V1 v12) {
            PlayerActivity.this.U1();
            if (v12 == PlayerActivity.this.f34777n) {
                return;
            }
            if (v12.b(2) && !v12.g(2, true)) {
                PlayerActivity.this.S1(j.f13144U1);
            }
            if (v12.b(1) && !v12.g(1, true)) {
                PlayerActivity.this.S1(j.f13135T1);
            }
            PlayerActivity.this.f34777n = v12;
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void g0(boolean z9, int i9) {
            AbstractC0926v1.t(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void h0(H0 h02, int i9) {
            AbstractC0926v1.k(this, h02, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void i0(R0 r02) {
            AbstractC0926v1.l(this, r02);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j(C1737C c1737c) {
            AbstractC0926v1.E(this, c1737c);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j0(boolean z9, int i9) {
            AbstractC0926v1.n(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void k(List list) {
            AbstractC0926v1.d(this, list);
        }

        @Override // O2.InterfaceC0920t1.d
        public void l0(C0909p1 c0909p1) {
            if (c0909p1.f6177a == 1002) {
                PlayerActivity.this.f34770g.g();
                PlayerActivity.this.f34770g.prepare();
            } else {
                PlayerActivity.this.U1();
                PlayerActivity.this.R1();
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
            AbstractC0926v1.g(this, interfaceC0920t1, cVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void n0(boolean z9) {
            AbstractC0926v1.i(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void onRepeatModeChanged(int i9) {
            AbstractC0926v1.x(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void t(C0917s1 c0917s1) {
            AbstractC0926v1.o(this, c0917s1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void u(f fVar) {
            AbstractC0926v1.c(this, fVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public static List E1(Intent intent, com.nst.iptvsmarterstvbox.view.demo.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (H0 h02 : AbstractC2688g.f(intent)) {
            arrayList.add(J1(h02, aVar.f(h02.f5528c.f5625a)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1(DialogInterface dialogInterface) {
        this.f34771h = false;
    }

    public static H0 J1(H0 h02, C3052w c3052w) {
        if (c3052w == null) {
            return h02;
        }
        H0.c cVarB = h02.b();
        cVarB.g(c3052w.f52801a).m(c3052w.f52802c).d(c3052w.f52806g).i(c3052w.f52803d).j(c3052w.f52804e);
        H0.f fVar = h02.f5528c.f5627d;
        if (fVar != null) {
            cVarB.e(fVar.c().m(c3052w.f52805f).i());
        }
        return cVarB.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1() {
        this.f34768e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1(int i9) {
        T1(getString(i9));
    }

    private void T1(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1() {
        Button button = this.f34772i;
        InterfaceC0933y interfaceC0933y = this.f34770g;
        button.setEnabled(interfaceC0933y != null && com.nst.iptvsmarterstvbox.view.demo.b.b0(interfaceC0933y));
    }

    private void V1() {
        InterfaceC0933y interfaceC0933y = this.f34770g;
        if (interfaceC0933y != null) {
            this.f34778o = interfaceC0933y.E();
            this.f34779p = this.f34770g.X();
            this.f34780q = Math.max(0L, this.f34770g.R());
        }
    }

    private void W1() {
        InterfaceC0933y interfaceC0933y = this.f34770g;
        if (interfaceC0933y != null) {
            this.f34775l = interfaceC0933y.y();
        }
    }

    public void B1() {
        this.f34778o = true;
        this.f34779p = -1;
        this.f34780q = -9223372036854775807L;
    }

    public final void C1() {
        this.f34782s.k(this.f34770g);
    }

    @Override // com.google.android.exoplayer2.ui.StyledPlayerView.b
    public void D(int i9) {
        this.f34768e.setVisibility(i9);
    }

    public final List D1(Intent intent) {
        int i9;
        String action = intent.getAction();
        if ("com.google.android.exoplayer.demo.action.VIEW_LIST".equals(action) || "com.google.android.exoplayer.demo.action.VIEW".equals(action)) {
            List listE1 = E1(intent, AbstractC2683b.f(this));
            for (int i10 = 0; i10 < listE1.size(); i10++) {
                H0 h02 = (H0) listE1.get(i10);
                if (!k0.n(h02)) {
                    i9 = j.f13025I1;
                } else {
                    if (k0.N0(this, h02)) {
                        return Collections.emptyList();
                    }
                    H0.f fVar = h02.f5528c.f5627d;
                    if (fVar != null && !L.z(fVar.f5581a)) {
                        i9 = j.f13045K1;
                    }
                }
                S1(i9);
            }
            return listE1;
        }
        T1(getString(j.f13225c8, action));
        finish();
        return Collections.emptyList();
    }

    public final C.a F1() {
        C1055l c1055l = new C1055l();
        c1055l.c(AbstractC2683b.g(this));
        h.c.a aVar = new h.c.a(this, this.f34767d);
        h.c.C0149c c0149c = this.f34783t;
        if (c0149c != null) {
            aVar.b(c0149c);
        }
        h.c cVarA = aVar.a();
        this.f34782s = cVarA;
        return new C0509q(this).m(this.f34773j).d(c1055l).p(new e.b() { // from class: r7.r
            @Override // C3.e.b
            public final C3.e a(H0.b bVar) {
                return this.f49791a.G1(bVar);
            }
        }, this.f34767d).q(new h.e(cVarA, new C0509q(this).m(this.f34773j)));
    }

    public final e G1(H0.b bVar) {
        if (this.f34781r == null) {
            this.f34781r = new d.b(this).a();
        }
        this.f34781r.f(this.f34770g);
        return this.f34781r;
    }

    public boolean H1() {
        if (this.f34770g == null) {
            Intent intent = getIntent();
            List listD1 = D1(intent);
            this.f34774k = listD1;
            if (listD1.isEmpty()) {
                return false;
            }
            this.f34777n = V1.f5907c;
            InterfaceC0933y.b bVarU = new InterfaceC0933y.b(this).u(F1());
            Q1(bVarU, intent.getBooleanExtra("prefer_extension_decoders", false));
            InterfaceC0933y interfaceC0933yJ = bVarU.j();
            this.f34770g = interfaceC0933yJ;
            interfaceC0933yJ.i(this.f34775l);
            this.f34770g.B(new c());
            this.f34770g.W(new C1700q());
            this.f34770g.O(C1019e.f7784h, true);
            this.f34770g.o(this.f34778o);
            this.f34767d.setPlayer(this.f34770g);
            C1();
            C1694k c1694k = new C1694k(this.f34770g, this.f34769f);
            this.f34776m = c1694k;
            c1694k.i();
        }
        int i9 = this.f34779p;
        boolean z9 = i9 != -1;
        if (z9) {
            this.f34770g.C(i9, this.f34780q);
        }
        this.f34770g.h(this.f34774k, !z9);
        this.f34770g.prepare();
        U1();
        return true;
    }

    public final void K1() {
        e eVar = this.f34781r;
        if (eVar != null) {
            eVar.release();
            this.f34781r = null;
            this.f34767d.getAdViewGroup().removeAllViews();
        }
    }

    public void L1() {
        if (this.f34770g != null) {
            W1();
            V1();
            M1();
            this.f34776m.j();
            this.f34776m = null;
            this.f34770g.release();
            this.f34770g = null;
            this.f34767d.setPlayer(null);
            this.f34774k = Collections.emptyList();
        }
        e eVar = this.f34781r;
        if (eVar != null) {
            eVar.f(null);
        } else {
            this.f34767d.getAdViewGroup().removeAllViews();
        }
    }

    public final void M1() {
        this.f34783t = this.f34782s.i();
        this.f34782s = null;
    }

    public final void N1(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("server_side_ads_loader_state");
        if (bundle2 != null) {
            this.f34783t = (h.c.C0149c) h.c.C0149c.f11023d.a(bundle2);
        }
    }

    public final void O1(Bundle bundle) {
        h.c.C0149c c0149c = this.f34783t;
        if (c0149c != null) {
            bundle.putBundle("server_side_ads_loader_state", c0149c.h());
        }
    }

    public void P1() {
        setContentView(g.f12750Y3);
    }

    public final void Q1(InterfaceC0933y.b bVar, boolean z9) {
        bVar.v(AbstractC2683b.b(this, z9));
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f34767d.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f34772i && !this.f34771h && com.nst.iptvsmarterstvbox.view.demo.b.b0(this.f34770g)) {
            this.f34771h = true;
            com.nst.iptvsmarterstvbox.view.demo.b.P(this.f34770g, new DialogInterface.OnDismissListener() { // from class: r7.q
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f49790a.I1(dialogInterface);
                }
            }).show(getSupportFragmentManager(), (String) null);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34773j = AbstractC2683b.d(this);
        P1();
        this.f34768e = (LinearLayout) findViewById(a7.f.f12525s2);
        this.f34769f = (TextView) findViewById(a7.f.f12149G2);
        Button button = (Button) findViewById(a7.f.Xf);
        this.f34772i = button;
        button.setOnClickListener(this);
        StyledPlayerView styledPlayerView = (StyledPlayerView) findViewById(a7.f.Bc);
        this.f34767d = styledPlayerView;
        styledPlayerView.setControllerVisibilityListener(this);
        this.f34767d.setErrorMessageProvider(new b());
        this.f34767d.requestFocus();
        if (bundle == null) {
            this.f34775l = new z.a(this).B();
            B1();
            return;
        }
        this.f34775l = z.C(bundle.getBundle("track_selection_parameters"));
        this.f34778o = bundle.getBoolean("auto_play");
        this.f34779p = bundle.getInt("item_index");
        this.f34780q = bundle.getLong("position");
        N1(bundle);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        K1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        L1();
        K1();
        B1();
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT <= 23) {
            StyledPlayerView styledPlayerView = this.f34767d;
            if (styledPlayerView != null) {
                styledPlayerView.B();
            }
            L1();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            H1();
        } else {
            S1(j.f13091O7);
            finish();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT <= 23 || this.f34770g == null) {
            H1();
            StyledPlayerView styledPlayerView = this.f34767d;
            if (styledPlayerView != null) {
                styledPlayerView.C();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        W1();
        V1();
        bundle.putBundle("track_selection_parameters", this.f34775l.h());
        bundle.putBoolean("auto_play", this.f34778o);
        bundle.putInt("item_index", this.f34779p);
        bundle.putLong("position", this.f34780q);
        O1(bundle);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT > 23) {
            H1();
            StyledPlayerView styledPlayerView = this.f34767d;
            if (styledPlayerView != null) {
                styledPlayerView.C();
            }
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT > 23) {
            StyledPlayerView styledPlayerView = this.f34767d;
            if (styledPlayerView != null) {
                styledPlayerView.B();
            }
            L1();
        }
    }
}
