package com.nst.iptvsmarterstvbox.view.activity;

import B3.i0;
import O2.AbstractC0926v1;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.H0;
import O2.I1;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import P3.f;
import Q2.C1019e;
import Z3.m;
import Z3.z;
import a7.g;
import a7.j;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import b4.InterfaceC1224o;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.ui.e;
import d4.InterfaceC1699p;
import d4.k0;
import e4.C1737C;
import java.util.Collections;
import java.util.List;
import p3.AbstractC2392B;
import p3.t;
import p3.u;
import q3.C2540a;
import r7.AbstractC2683b;

/* JADX INFO: loaded from: classes4.dex */
public class ExoPlayerMoviesSeriesActivity extends androidx.appcompat.app.b implements View.OnClickListener, e.m {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f29779B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StyledPlayerView f29780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f29781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public I1 f29782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f29784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC1224o.a f29785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f29786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m f29787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m.d f29788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i0 f29789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f29792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SharedPreferences f29793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SharedPreferences f29794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f29795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f29796t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f29801y;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f29797u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f29798v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f29799w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f29800x = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f29802z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f29778A = "";

    public class b implements InterfaceC1699p {
        public b() {
        }

        @Override // d4.InterfaceC1699p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair a(C0909p1 c0909p1) {
            String string = ExoPlayerMoviesSeriesActivity.this.getString(j.f13065M1);
            Throwable cause = c0909p1.getCause();
            if (cause instanceof u.b) {
                u.b bVar = (u.b) cause;
                t tVar = bVar.f46381d;
                string = tVar == null ? bVar.getCause() instanceof AbstractC2392B.c ? ExoPlayerMoviesSeriesActivity.this.getString(j.f13115R1) : bVar.f46380c ? ExoPlayerMoviesSeriesActivity.this.getString(j.f13095P1, bVar.f46379a) : ExoPlayerMoviesSeriesActivity.this.getString(j.f13085O1, bVar.f46379a) : ExoPlayerMoviesSeriesActivity.this.getString(j.f13075N1, tVar.f46299a);
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
                ExoPlayerMoviesSeriesActivity.this.C1();
            }
            ExoPlayerMoviesSeriesActivity.this.F1();
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
        public /* synthetic */ void f0(V1 v12) {
            AbstractC0926v1.D(this, v12);
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
                ExoPlayerMoviesSeriesActivity.this.f29782f.g();
                ExoPlayerMoviesSeriesActivity.this.f29782f.prepare();
            } else {
                ExoPlayerMoviesSeriesActivity.this.F1();
                ExoPlayerMoviesSeriesActivity.this.C1();
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

    private void D1(int i9) {
        E1(getString(i9));
    }

    private void E1(String str) {
        Toast.makeText(getApplicationContext(), str, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F1() {
        Button button = this.f29784h;
        I1 i12 = this.f29782f;
        button.setEnabled(i12 != null && com.nst.iptvsmarterstvbox.view.demo.b.b0(i12));
    }

    private void G1() {
        I1 i12 = this.f29782f;
        if (i12 != null) {
            this.f29790n = i12.E();
            this.f29791o = this.f29782f.l0();
            this.f29792p = Math.max(0L, this.f29782f.R());
        }
    }

    private void H1() {
        m mVar = this.f29787k;
        if (mVar != null) {
            this.f29788l = mVar.c();
        }
    }

    public void A1() {
        if (this.f29782f != null) {
            H1();
            G1();
            this.f29782f.release();
            this.f29782f = null;
            this.f29786j = Collections.emptyList();
            this.f29787k = null;
        }
    }

    public void B1() {
        setContentView(g.f12750Y3);
    }

    public final void C1() {
        this.f29781e.setVisibility(0);
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f29780d.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.google.android.exoplayer2.ui.e.m
    public void o(int i9) {
        this.f29781e.setVisibility(i9);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f29784h && !this.f29783g && com.nst.iptvsmarterstvbox.view.demo.b.b0(this.f29782f)) {
            this.f29783g = true;
            com.nst.iptvsmarterstvbox.view.demo.b.P(this.f29782f, new DialogInterface.OnDismissListener() { // from class: p7.A
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f46574a.z1(dialogInterface);
                }
            }).show(getSupportFragmentManager(), (String) null);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29795s = this;
        super.onCreate(bundle);
        this.f29785i = AbstractC2683b.d(this);
        B1();
        this.f29781e = (LinearLayout) findViewById(a7.f.f12525s2);
        Button button = (Button) findViewById(a7.f.Xf);
        this.f29784h = button;
        button.setOnClickListener(this);
        StyledPlayerView styledPlayerView = (StyledPlayerView) findViewById(a7.f.Bc);
        this.f29780d = styledPlayerView;
        styledPlayerView.setControllerVisibilityListener(this);
        this.f29780d.setErrorMessageProvider(new b());
        this.f29780d.requestFocus();
        if (bundle == null) {
            this.f29788l = new m.e(this).B();
            x1();
        } else {
            this.f29788l = (m.d) bundle.getParcelable("track_selector_parameters");
            this.f29790n = bundle.getBoolean("auto_play");
            this.f29791o = bundle.getInt("window");
            this.f29792p = bundle.getLong("position");
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A1();
        x1();
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        if (k0.f39777a <= 23) {
            StyledPlayerView styledPlayerView = this.f29780d;
            if (styledPlayerView != null) {
                styledPlayerView.B();
            }
            A1();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            y1();
        } else {
            D1(j.f13091O7);
            finish();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (k0.f39777a <= 23 || this.f29782f == null) {
            y1();
            StyledPlayerView styledPlayerView = this.f29780d;
            if (styledPlayerView != null) {
                styledPlayerView.C();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        H1();
        G1();
        bundle.putBundle("track_selector_parameters", this.f29788l.h());
        bundle.putBoolean("auto_play", this.f29790n);
        bundle.putInt("window", this.f29791o);
        bundle.putLong("position", this.f29792p);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        super.onStart();
        if (k0.f39777a > 23) {
            y1();
            StyledPlayerView styledPlayerView = this.f29780d;
            if (styledPlayerView != null) {
                styledPlayerView.C();
            }
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        if (k0.f39777a > 23) {
            StyledPlayerView styledPlayerView = this.f29780d;
            if (styledPlayerView != null) {
                styledPlayerView.B();
            }
            A1();
        }
    }

    public void x1() {
        this.f29790n = true;
        this.f29791o = -1;
        this.f29792p = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187 A[PHI: r17
      0x0187: PHI (r17v6 android.content.Intent) = 
      (r17v5 android.content.Intent)
      (r17v5 android.content.Intent)
      (r17v5 android.content.Intent)
      (r17v5 android.content.Intent)
      (r17v5 android.content.Intent)
      (r17v7 android.content.Intent)
     binds: [B:68:0x01ab, B:70:0x01b1, B:72:0x01b9, B:74:0x01c3, B:65:0x01a6, B:55:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean y1() {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeriesActivity.y1():boolean");
    }

    public final /* synthetic */ void z1(DialogInterface dialogInterface) {
        this.f29783g = false;
    }
}
