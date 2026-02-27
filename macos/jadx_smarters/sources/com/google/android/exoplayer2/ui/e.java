package com.google.android.exoplayer2.ui;

import B3.g0;
import O2.AbstractC0926v1;
import O2.AbstractC0928w0;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.C0936z0;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import Z3.x;
import Z3.z;
import a4.AbstractC1100n;
import a4.AbstractC1102p;
import a4.AbstractC1103q;
import a4.AbstractC1104s;
import a4.AbstractC1105t;
import a4.AbstractC1106u;
import a4.AbstractC1107v;
import a4.AbstractC1108w;
import a4.AbstractC1109x;
import a4.AbstractC1110y;
import a4.C1094h;
import a4.X;
import a4.c0;
import a4.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.f;
import d4.AbstractC1684a;
import d4.P;
import d4.k0;
import e4.C1737C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public class e extends FrameLayout {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final float[] f26053C0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f26054A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public long f26055A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f26056B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f26057B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f26058C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final TextView f26059D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final TextView f26060E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.f f26061F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final StringBuilder f26062G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Formatter f26063H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Q1.b f26064I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Q1.d f26065J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Runnable f26066K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Drawable f26067L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Drawable f26068M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Drawable f26069N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f26070O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final String f26071P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f26072Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Drawable f26073R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Drawable f26074S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final float f26075T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final float f26076U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final String f26077V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final String f26078W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f26079a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f26080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f26081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f26082e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Drawable f26083e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f26084f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Drawable f26085f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f26086g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f26087g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0250e f26088h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f26089h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f26090i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final Drawable f26091i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f26092j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Drawable f26093j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c0 f26094k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final String f26095k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow f26096l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f26097l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f26098m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public InterfaceC0920t1 f26099m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f26100n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public d f26101n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f26102o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f26103o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f26104p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f26105p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f26106q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f26107q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f26108r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f26109r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f26110s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f26111s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f26112t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f26113t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f26114u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f26115u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f26116v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f26117v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f26118w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long[] f26119w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f26120x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean[] f26121x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f26122y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long[] f26123y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f26124z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean[] f26125z0;

    public final class b extends l {
        public b() {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.e.l
        public void n0(i iVar) {
            iVar.f26140t.setText(AbstractC1108w.f11741w);
            iVar.f26141u.setVisibility(s0(((InterfaceC0920t1) AbstractC1684a.e(e.this.f26099m0)).y()) ? 4 : 0);
            iVar.f16733a.setOnClickListener(new View.OnClickListener() { // from class: a4.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11509a.x0(view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.e.l
        public void q0(String str) {
            e.this.f26086g.m0(1, str);
        }

        public final boolean s0(z zVar) {
            for (int i9 = 0; i9 < this.f26146d.size(); i9++) {
                if (zVar.f11322z.containsKey(((k) this.f26146d.get(i9)).f26143a.b())) {
                    return true;
                }
            }
            return false;
        }

        public void t0(List list) {
            h hVar;
            String string;
            Resources resources;
            int i9;
            this.f26146d = list;
            z zVarY = ((InterfaceC0920t1) AbstractC1684a.e(e.this.f26099m0)).y();
            if (list.isEmpty()) {
                hVar = e.this.f26086g;
                resources = e.this.getResources();
                i9 = AbstractC1108w.f11742x;
            } else {
                if (s0(zVarY)) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        k kVar = (k) list.get(i10);
                        if (kVar.a()) {
                            hVar = e.this.f26086g;
                            string = kVar.f26145c;
                            hVar.m0(1, string);
                        }
                    }
                    return;
                }
                hVar = e.this.f26086g;
                resources = e.this.getResources();
                i9 = AbstractC1108w.f11741w;
            }
            string = resources.getString(i9);
            hVar.m0(1, string);
        }

        public final /* synthetic */ void x0(View view) {
            if (e.this.f26099m0 == null || !e.this.f26099m0.t(29)) {
                return;
            }
            ((InterfaceC0920t1) k0.j(e.this.f26099m0)).i(e.this.f26099m0.y().B().C(1).L(1, false).B());
            e.this.f26086g.m0(1, e.this.getResources().getString(AbstractC1108w.f11741w));
            e.this.f26096l.dismiss();
        }
    }

    public final class c implements InterfaceC0920t1.d, f.a, View.OnClickListener, PopupWindow.OnDismissListener {
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

        @Override // com.google.android.exoplayer2.ui.f.a
        public void C(com.google.android.exoplayer2.ui.f fVar, long j9, boolean z9) {
            e.this.f26111s0 = false;
            if (!z9 && e.this.f26099m0 != null) {
                e eVar = e.this;
                eVar.k0(eVar.f26099m0, j9);
            }
            e.this.f26079a.W();
        }

        @Override // com.google.android.exoplayer2.ui.f.a
        public void D(com.google.android.exoplayer2.ui.f fVar, long j9) {
            e.this.f26111s0 = true;
            if (e.this.f26060E != null) {
                e.this.f26060E.setText(k0.m0(e.this.f26062G, e.this.f26063H, j9));
            }
            e.this.f26079a.V();
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void E(int i9) {
            AbstractC0926v1.p(this, i9);
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
        public /* synthetic */ void l0(C0909p1 c0909p1) {
            AbstractC0926v1.r(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
            if (cVar.b(4, 5, 13)) {
                e.this.t0();
            }
            if (cVar.b(4, 5, 7, 13)) {
                e.this.v0();
            }
            if (cVar.b(8, 13)) {
                e.this.w0();
            }
            if (cVar.b(9, 13)) {
                e.this.A0();
            }
            if (cVar.b(8, 9, 11, 0, 16, 17, 13)) {
                e.this.s0();
            }
            if (cVar.b(11, 0, 13)) {
                e.this.B0();
            }
            if (cVar.b(12, 13)) {
                e.this.u0();
            }
            if (cVar.b(2, 13)) {
                e.this.C0();
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void n0(boolean z9) {
            AbstractC0926v1.i(this, z9);
        }

        @Override // com.google.android.exoplayer2.ui.f.a
        public void o(com.google.android.exoplayer2.ui.f fVar, long j9) {
            if (e.this.f26060E != null) {
                e.this.f26060E.setText(k0.m0(e.this.f26062G, e.this.f26063H, j9));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar;
            RecyclerView.g gVar;
            View view2;
            InterfaceC0920t1 interfaceC0920t1 = e.this.f26099m0;
            if (interfaceC0920t1 == null) {
                return;
            }
            e.this.f26079a.W();
            if (e.this.f26102o == view) {
                if (interfaceC0920t1.t(9)) {
                    interfaceC0920t1.z();
                    return;
                }
                return;
            }
            if (e.this.f26100n == view) {
                if (interfaceC0920t1.t(7)) {
                    interfaceC0920t1.m();
                    return;
                }
                return;
            }
            if (e.this.f26106q == view) {
                if (interfaceC0920t1.getPlaybackState() == 4 || !interfaceC0920t1.t(12)) {
                    return;
                }
                interfaceC0920t1.b0();
                return;
            }
            if (e.this.f26108r == view) {
                if (interfaceC0920t1.t(11)) {
                    interfaceC0920t1.d0();
                    return;
                }
                return;
            }
            if (e.this.f26104p == view) {
                k0.v0(interfaceC0920t1);
                return;
            }
            if (e.this.f26114u == view) {
                if (interfaceC0920t1.t(15)) {
                    interfaceC0920t1.setRepeatMode(P.a(interfaceC0920t1.getRepeatMode(), e.this.f26117v0));
                    return;
                }
                return;
            }
            if (e.this.f26116v == view) {
                if (interfaceC0920t1.t(14)) {
                    interfaceC0920t1.F(!interfaceC0920t1.Z());
                    return;
                }
                return;
            }
            if (e.this.f26054A == view) {
                e.this.f26079a.V();
                eVar = e.this;
                gVar = eVar.f26086g;
                view2 = e.this.f26054A;
            } else if (e.this.f26056B == view) {
                e.this.f26079a.V();
                eVar = e.this;
                gVar = eVar.f26088h;
                view2 = e.this.f26056B;
            } else if (e.this.f26058C == view) {
                e.this.f26079a.V();
                eVar = e.this;
                gVar = eVar.f26092j;
                view2 = e.this.f26058C;
            } else {
                if (e.this.f26120x != view) {
                    return;
                }
                e.this.f26079a.V();
                eVar = e.this;
                gVar = eVar.f26090i;
                view2 = e.this.f26120x;
            }
            eVar.U(gVar, view2);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (e.this.f26057B0) {
                e.this.f26079a.W();
            }
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
        public /* synthetic */ void u(P3.f fVar) {
            AbstractC0926v1.c(this, fVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public interface d {
        void C(boolean z9);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.e$e, reason: collision with other inner class name */
    public final class C0250e extends RecyclerView.g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String[] f26128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float[] f26129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f26130f;

        public C0250e(String[] strArr, float[] fArr) {
            this.f26128d = strArr;
            this.f26129e = fArr;
        }

        public String k0() {
            return this.f26128d[this.f26130f];
        }

        public final /* synthetic */ void l0(int i9, View view) {
            if (i9 != this.f26130f) {
                e.this.setPlaybackSpeed(this.f26129e[i9]);
            }
            e.this.f26096l.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void E(i iVar, final int i9) {
            View view;
            String[] strArr = this.f26128d;
            if (i9 < strArr.length) {
                iVar.f26140t.setText(strArr[i9]);
            }
            int i10 = 0;
            if (i9 == this.f26130f) {
                iVar.f16733a.setSelected(true);
                view = iVar.f26141u;
            } else {
                iVar.f16733a.setSelected(false);
                view = iVar.f26141u;
                i10 = 4;
            }
            view.setVisibility(i10);
            iVar.f16733a.setOnClickListener(new View.OnClickListener() { // from class: a4.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11510a.l0(i9, view2);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int n() {
            return this.f26128d.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public i L(ViewGroup viewGroup, int i9) {
            return new i(LayoutInflater.from(e.this.getContext()).inflate(AbstractC1106u.f11709h, viewGroup, false));
        }

        public void p0(float f9) {
            int i9 = 0;
            int i10 = 0;
            float f10 = Float.MAX_VALUE;
            while (true) {
                float[] fArr = this.f26129e;
                if (i9 >= fArr.length) {
                    this.f26130f = i10;
                    return;
                }
                float fAbs = Math.abs(f9 - fArr[i9]);
                if (fAbs < f10) {
                    i10 = i9;
                    f10 = fAbs;
                }
                i9++;
            }
        }
    }

    public interface f {
    }

    public final class g extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final TextView f26132t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final TextView f26133u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final ImageView f26134v;

        public g(View view) {
            super(view);
            if (k0.f39777a < 26) {
                view.setFocusable(true);
            }
            this.f26132t = (TextView) view.findViewById(AbstractC1104s.f11694u);
            this.f26133u = (TextView) view.findViewById(AbstractC1104s.f11666P);
            this.f26134v = (ImageView) view.findViewById(AbstractC1104s.f11693t);
            view.setOnClickListener(new View.OnClickListener() { // from class: a4.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11512a.T(view2);
                }
            });
        }

        public final /* synthetic */ void T(View view) {
            e.this.h0(m());
        }
    }

    public class h extends RecyclerView.g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String[] f26136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f26137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Drawable[] f26138f;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f26136d = strArr;
            this.f26137e = new String[strArr.length];
            this.f26138f = drawableArr;
        }

        public boolean j0() {
            return n0(1) || n0(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public void E(g gVar, int i9) {
            View view;
            RecyclerView.p pVar;
            if (n0(i9)) {
                view = gVar.f16733a;
                pVar = new RecyclerView.p(-1, -2);
            } else {
                view = gVar.f16733a;
                pVar = new RecyclerView.p(0, 0);
            }
            view.setLayoutParams(pVar);
            gVar.f26132t.setText(this.f26136d[i9]);
            if (this.f26137e[i9] == null) {
                gVar.f26133u.setVisibility(8);
            } else {
                gVar.f26133u.setText(this.f26137e[i9]);
            }
            Drawable drawable = this.f26138f[i9];
            ImageView imageView = gVar.f26134v;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(this.f26138f[i9]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public g L(ViewGroup viewGroup, int i9) {
            return e.this.new g(LayoutInflater.from(e.this.getContext()).inflate(AbstractC1106u.f11708g, viewGroup, false));
        }

        public void m0(int i9, String str) {
            this.f26137e[i9] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int n() {
            return this.f26136d.length;
        }

        public final boolean n0(int i9) {
            if (e.this.f26099m0 == null) {
                return false;
            }
            if (i9 == 0) {
                return e.this.f26099m0.t(13);
            }
            if (i9 != 1) {
                return true;
            }
            return e.this.f26099m0.t(30) && e.this.f26099m0.t(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public long o(int i9) {
            return i9;
        }
    }

    public static class i extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final TextView f26140t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final View f26141u;

        public i(View view) {
            super(view);
            if (k0.f39777a < 26) {
                view.setFocusable(true);
            }
            this.f26140t = (TextView) view.findViewById(AbstractC1104s.f11669S);
            this.f26141u = view.findViewById(AbstractC1104s.f11681h);
        }
    }

    public final class j extends l {
        public j() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t0(View view) {
            if (e.this.f26099m0 == null || !e.this.f26099m0.t(29)) {
                return;
            }
            e.this.f26099m0.i(e.this.f26099m0.y().B().C(3).H(-3).B());
            e.this.f26096l.dismiss();
        }

        @Override // com.google.android.exoplayer2.ui.e.l, androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void E(i iVar, int i9) {
            super.E(iVar, i9);
            if (i9 > 0) {
                iVar.f26141u.setVisibility(((k) this.f26146d.get(i9 + (-1))).a() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.e.l
        public void n0(i iVar) {
            boolean z9;
            iVar.f26140t.setText(AbstractC1108w.f11742x);
            int i9 = 0;
            while (true) {
                if (i9 >= this.f26146d.size()) {
                    z9 = true;
                    break;
                } else {
                    if (((k) this.f26146d.get(i9)).a()) {
                        z9 = false;
                        break;
                    }
                    i9++;
                }
            }
            iVar.f26141u.setVisibility(z9 ? 0 : 4);
            iVar.f16733a.setOnClickListener(new View.OnClickListener() { // from class: a4.H
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11513a.t0(view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.e.l
        public void q0(String str) {
        }

        public void s0(List list) {
            boolean z9 = false;
            int i9 = 0;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                }
                if (((k) list.get(i9)).a()) {
                    z9 = true;
                    break;
                }
                i9++;
            }
            if (e.this.f26120x != null) {
                ImageView imageView = e.this.f26120x;
                e eVar = e.this;
                imageView.setImageDrawable(z9 ? eVar.f26083e0 : eVar.f26085f0);
                e.this.f26120x.setContentDescription(z9 ? e.this.f26087g0 : e.this.f26089h0);
            }
            this.f26146d = list;
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V1.a f26143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26145c;

        public k(V1 v12, int i9, int i10, String str) {
            this.f26143a = (V1.a) v12.c().get(i9);
            this.f26144b = i10;
            this.f26145c = str;
        }

        public boolean a() {
            return this.f26143a.j(this.f26144b);
        }
    }

    public abstract class l extends RecyclerView.g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f26146d = new ArrayList();

        public l() {
        }

        public void k0() {
            this.f26146d = Collections.emptyList();
        }

        public final /* synthetic */ void l0(InterfaceC0920t1 interfaceC0920t1, g0 g0Var, k kVar, View view) {
            if (interfaceC0920t1.t(29)) {
                interfaceC0920t1.i(interfaceC0920t1.y().B().I(new x(g0Var, AbstractC2743y.A(Integer.valueOf(kVar.f26144b)))).L(kVar.f26143a.e(), false).B());
                q0(kVar.f26145c);
                e.this.f26096l.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: m0 */
        public void E(i iVar, int i9) {
            final InterfaceC0920t1 interfaceC0920t1 = e.this.f26099m0;
            if (interfaceC0920t1 == null) {
                return;
            }
            if (i9 == 0) {
                n0(iVar);
                return;
            }
            final k kVar = (k) this.f26146d.get(i9 - 1);
            final g0 g0VarB = kVar.f26143a.b();
            boolean z9 = interfaceC0920t1.y().f11322z.get(g0VarB) != null && kVar.a();
            iVar.f26140t.setText(kVar.f26145c);
            iVar.f26141u.setVisibility(z9 ? 0 : 4);
            iVar.f16733a.setOnClickListener(new View.OnClickListener() { // from class: a4.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11514a.l0(interfaceC0920t1, g0VarB, kVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int n() {
            if (this.f26146d.isEmpty()) {
                return 0;
            }
            return this.f26146d.size() + 1;
        }

        public abstract void n0(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public i L(ViewGroup viewGroup, int i9) {
            return new i(LayoutInflater.from(e.this.getContext()).inflate(AbstractC1106u.f11709h, viewGroup, false));
        }

        public abstract void q0(String str);
    }

    public interface m {
        void o(int i9);
    }

    static {
        AbstractC0928w0.a("goog.exo.ui");
        f26053C0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public e(Context context, AttributeSet attributeSet, int i9, AttributeSet attributeSet2) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        c cVar;
        boolean z17;
        boolean z18;
        TextView textView;
        super(context, attributeSet, i9);
        int resourceId = AbstractC1106u.f11705d;
        this.f26113t0 = 5000;
        this.f26117v0 = 0;
        this.f26115u0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, AbstractC1110y.f11761P, i9, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC1110y.f11763R, resourceId);
                this.f26113t0 = typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11771Z, this.f26113t0);
                this.f26117v0 = W(typedArrayObtainStyledAttributes, this.f26117v0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11768W, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11765T, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11767V, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11766U, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11769X, false);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11770Y, false);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11773a0, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(AbstractC1110y.f11775b0, this.f26115u0));
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(AbstractC1110y.f11762Q, true);
                typedArrayObtainStyledAttributes.recycle();
                z16 = z24;
                z13 = z21;
                z10 = z25;
                z14 = z22;
                z11 = z19;
                z12 = z20;
                z9 = z26;
                z15 = z23;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z9 = true;
            z10 = false;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = false;
            z16 = false;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c cVar2 = new c();
        this.f26081d = cVar2;
        this.f26082e = new CopyOnWriteArrayList();
        this.f26064I = new Q1.b();
        this.f26065J = new Q1.d();
        StringBuilder sb = new StringBuilder();
        this.f26062G = sb;
        this.f26063H = new Formatter(sb, Locale.getDefault());
        this.f26119w0 = new long[0];
        this.f26121x0 = new boolean[0];
        this.f26123y0 = new long[0];
        this.f26125z0 = new boolean[0];
        this.f26066K = new Runnable() { // from class: a4.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f11506a.v0();
            }
        };
        this.f26059D = (TextView) findViewById(AbstractC1104s.f11686m);
        this.f26060E = (TextView) findViewById(AbstractC1104s.f11656F);
        ImageView imageView = (ImageView) findViewById(AbstractC1104s.f11667Q);
        this.f26120x = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar2);
        }
        ImageView imageView2 = (ImageView) findViewById(AbstractC1104s.f11692s);
        this.f26122y = imageView2;
        a0(imageView2, new View.OnClickListener() { // from class: a4.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11507a.f0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(AbstractC1104s.f11696w);
        this.f26124z = imageView3;
        a0(imageView3, new View.OnClickListener() { // from class: a4.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11507a.f0(view);
            }
        });
        View viewFindViewById = findViewById(AbstractC1104s.f11663M);
        this.f26054A = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar2);
        }
        View viewFindViewById2 = findViewById(AbstractC1104s.f11655E);
        this.f26056B = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar2);
        }
        View viewFindViewById3 = findViewById(AbstractC1104s.f11676c);
        this.f26058C = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar2);
        }
        com.google.android.exoplayer2.ui.f fVar = (com.google.android.exoplayer2.ui.f) findViewById(AbstractC1104s.f11658H);
        View viewFindViewById4 = findViewById(AbstractC1104s.f11659I);
        if (fVar != null) {
            this.f26061F = fVar;
            cVar = cVar2;
            z17 = z9;
            z18 = z10;
            textView = null;
        } else if (viewFindViewById4 != null) {
            textView = null;
            cVar = cVar2;
            z17 = z9;
            z18 = z10;
            com.google.android.exoplayer2.ui.b bVar = new com.google.android.exoplayer2.ui.b(context, null, 0, attributeSet2, AbstractC1109x.f11745a);
            bVar.setId(AbstractC1104s.f11658H);
            bVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(bVar, iIndexOfChild);
            this.f26061F = bVar;
        } else {
            cVar = cVar2;
            z17 = z9;
            z18 = z10;
            textView = null;
            this.f26061F = null;
        }
        com.google.android.exoplayer2.ui.f fVar2 = this.f26061F;
        c cVar3 = cVar;
        if (fVar2 != null) {
            fVar2.a(cVar3);
        }
        View viewFindViewById5 = findViewById(AbstractC1104s.f11654D);
        this.f26104p = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar3);
        }
        View viewFindViewById6 = findViewById(AbstractC1104s.f11657G);
        this.f26100n = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar3);
        }
        View viewFindViewById7 = findViewById(AbstractC1104s.f11697x);
        this.f26102o = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar3);
        }
        Typeface typefaceH = F.h.h(context, r.f11650a);
        View viewFindViewById8 = findViewById(AbstractC1104s.f11661K);
        TextView textView2 = viewFindViewById8 == null ? (TextView) findViewById(AbstractC1104s.f11662L) : textView;
        this.f26112t = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceH);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView2 : viewFindViewById8;
        this.f26108r = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(cVar3);
        }
        View viewFindViewById9 = findViewById(AbstractC1104s.f11690q);
        TextView textView3 = viewFindViewById9 == null ? (TextView) findViewById(AbstractC1104s.f11691r) : null;
        this.f26110s = textView3;
        if (textView3 != null) {
            textView3.setTypeface(typefaceH);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView3 : viewFindViewById9;
        this.f26106q = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(cVar3);
        }
        ImageView imageView4 = (ImageView) findViewById(AbstractC1104s.f11660J);
        this.f26114u = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar3);
        }
        ImageView imageView5 = (ImageView) findViewById(AbstractC1104s.f11664N);
        this.f26116v = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar3);
        }
        Resources resources = context.getResources();
        this.f26080c = resources;
        this.f26075T = resources.getInteger(AbstractC1105t.f11701b) / 100.0f;
        this.f26076U = resources.getInteger(AbstractC1105t.f11700a) / 100.0f;
        View viewFindViewById10 = findViewById(AbstractC1104s.f11672V);
        this.f26118w = viewFindViewById10;
        boolean z27 = z16;
        if (viewFindViewById10 != null) {
            o0(false, viewFindViewById10);
        }
        X x9 = new X(this);
        this.f26079a = x9;
        x9.X(z17);
        boolean z28 = z15;
        h hVar = new h(new String[]{resources.getString(AbstractC1108w.f11726h), resources.getString(AbstractC1108w.f11743y)}, new Drawable[]{k0.X(context, resources, AbstractC1103q.f11647q), k0.X(context, resources, AbstractC1103q.f11637g)});
        this.f26086g = hVar;
        this.f26098m = resources.getDimensionPixelSize(AbstractC1102p.f11627a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(AbstractC1106u.f11707f, (ViewGroup) null);
        this.f26084f = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f26096l = popupWindow;
        if (k0.f39777a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(cVar3);
        this.f26057B0 = true;
        this.f26094k = new C1094h(getResources());
        this.f26083e0 = k0.X(context, resources, AbstractC1103q.f11649s);
        this.f26085f0 = k0.X(context, resources, AbstractC1103q.f11648r);
        this.f26087g0 = resources.getString(AbstractC1108w.f11720b);
        this.f26089h0 = resources.getString(AbstractC1108w.f11719a);
        this.f26090i = new j();
        this.f26092j = new b();
        this.f26088h = new C0250e(resources.getStringArray(AbstractC1100n.f11625a), f26053C0);
        this.f26091i0 = k0.X(context, resources, AbstractC1103q.f11639i);
        this.f26093j0 = k0.X(context, resources, AbstractC1103q.f11638h);
        this.f26067L = k0.X(context, resources, AbstractC1103q.f11643m);
        this.f26068M = k0.X(context, resources, AbstractC1103q.f11644n);
        this.f26069N = k0.X(context, resources, AbstractC1103q.f11642l);
        this.f26073R = k0.X(context, resources, AbstractC1103q.f11646p);
        this.f26074S = k0.X(context, resources, AbstractC1103q.f11645o);
        this.f26095k0 = resources.getString(AbstractC1108w.f11722d);
        this.f26097l0 = resources.getString(AbstractC1108w.f11721c);
        this.f26070O = resources.getString(AbstractC1108w.f11728j);
        this.f26071P = resources.getString(AbstractC1108w.f11729k);
        this.f26072Q = resources.getString(AbstractC1108w.f11727i);
        this.f26077V = resources.getString(AbstractC1108w.f11732n);
        this.f26078W = resources.getString(AbstractC1108w.f11731m);
        x9.Y((ViewGroup) findViewById(AbstractC1104s.f11678e), true);
        x9.Y(viewFindViewById9, z12);
        x9.Y(viewFindViewById8, z11);
        x9.Y(viewFindViewById6, z13);
        x9.Y(viewFindViewById7, z14);
        x9.Y(imageView5, z28);
        x9.Y(imageView, z27);
        x9.Y(viewFindViewById10, z18);
        x9.Y(imageView4, this.f26117v0 != 0);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: a4.D
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f11508a.g0(view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    public static boolean S(InterfaceC0920t1 interfaceC0920t1, Q1.d dVar) {
        Q1 q1W;
        int iU;
        if (!interfaceC0920t1.t(17) || (iU = (q1W = interfaceC0920t1.w()).u()) <= 1 || iU > 100) {
            return false;
        }
        for (int i9 = 0; i9 < iU; i9++) {
            if (q1W.s(i9, dVar).f5757o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public static int W(TypedArray typedArray, int i9) {
        return typedArray.getInt(AbstractC1110y.f11764S, i9);
    }

    public static void a0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    public static boolean c0(int i9) {
        return i9 == 90 || i9 == 89 || i9 == 85 || i9 == 79 || i9 == 126 || i9 == 127 || i9 == 87 || i9 == 88;
    }

    public static void r0(View view, boolean z9) {
        if (view == null) {
            return;
        }
        view.setVisibility(z9 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f9) {
        InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
        if (interfaceC0920t1 == null || !interfaceC0920t1.t(13)) {
            return;
        }
        InterfaceC0920t1 interfaceC0920t12 = this.f26099m0;
        interfaceC0920t12.b(interfaceC0920t12.c().d(f9));
    }

    public final void A0() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (d0() && this.f26105p0 && (imageView = this.f26116v) != null) {
            InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
            if (!this.f26079a.A(imageView)) {
                o0(false, this.f26116v);
                return;
            }
            if (interfaceC0920t1 != null && interfaceC0920t1.t(14)) {
                o0(true, this.f26116v);
                this.f26116v.setImageDrawable(interfaceC0920t1.Z() ? this.f26073R : this.f26074S);
                imageView2 = this.f26116v;
                if (interfaceC0920t1.Z()) {
                    str = this.f26077V;
                }
                imageView2.setContentDescription(str);
            }
            o0(false, this.f26116v);
            this.f26116v.setImageDrawable(this.f26074S);
            imageView2 = this.f26116v;
            str = this.f26078W;
            imageView2.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0() {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.e.B0():void");
    }

    public final void C0() {
        Z();
        o0(this.f26090i.n() > 0, this.f26120x);
        y0();
    }

    public void R(m mVar) {
        AbstractC1684a.e(mVar);
        this.f26082e.add(mVar);
    }

    public boolean T(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
        if (interfaceC0920t1 == null || !c0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (interfaceC0920t1.getPlaybackState() == 4 || !interfaceC0920t1.t(12)) {
                return true;
            }
            interfaceC0920t1.b0();
            return true;
        }
        if (keyCode == 89 && interfaceC0920t1.t(11)) {
            interfaceC0920t1.d0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            k0.v0(interfaceC0920t1);
            return true;
        }
        if (keyCode == 87) {
            if (!interfaceC0920t1.t(9)) {
                return true;
            }
            interfaceC0920t1.z();
            return true;
        }
        if (keyCode == 88) {
            if (!interfaceC0920t1.t(7)) {
                return true;
            }
            interfaceC0920t1.m();
            return true;
        }
        if (keyCode == 126) {
            k0.u0(interfaceC0920t1);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        k0.t0(interfaceC0920t1);
        return true;
    }

    public final void U(RecyclerView.g gVar, View view) {
        this.f26084f.setAdapter(gVar);
        z0();
        this.f26057B0 = false;
        this.f26096l.dismiss();
        this.f26057B0 = true;
        this.f26096l.showAsDropDown(view, (getWidth() - this.f26096l.getWidth()) - this.f26098m, (-this.f26096l.getHeight()) - this.f26098m);
    }

    public final AbstractC2743y V(V1 v12, int i9) {
        AbstractC2743y.a aVar = new AbstractC2743y.a();
        AbstractC2743y abstractC2743yC = v12.c();
        for (int i10 = 0; i10 < abstractC2743yC.size(); i10++) {
            V1.a aVar2 = (V1.a) abstractC2743yC.get(i10);
            if (aVar2.e() == i9) {
                for (int i11 = 0; i11 < aVar2.f5916a; i11++) {
                    if (aVar2.k(i11)) {
                        C0936z0 c0936z0C = aVar2.c(i11);
                        if ((c0936z0C.f6459e & 2) == 0) {
                            aVar.a(new k(v12, i10, i11, this.f26094k.a(c0936z0C)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    public void X() {
        this.f26079a.C();
    }

    public void Y() {
        this.f26079a.F();
    }

    public final void Z() {
        this.f26090i.k0();
        this.f26092j.k0();
        InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
        if (interfaceC0920t1 != null && interfaceC0920t1.t(30) && this.f26099m0.t(29)) {
            V1 v1P = this.f26099m0.p();
            this.f26092j.t0(V(v1P, 1));
            if (this.f26079a.A(this.f26120x)) {
                this.f26090i.s0(V(v1P, 3));
            } else {
                this.f26090i.s0(AbstractC2743y.z());
            }
        }
    }

    public boolean b0() {
        return this.f26079a.I();
    }

    public boolean d0() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return T(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void e0() {
        Iterator it = this.f26082e.iterator();
        while (it.hasNext()) {
            ((m) it.next()).o(getVisibility());
        }
    }

    public final void f0(View view) {
        if (this.f26101n0 == null) {
            return;
        }
        boolean z9 = !this.f26103o0;
        this.f26103o0 = z9;
        q0(this.f26122y, z9);
        q0(this.f26124z, this.f26103o0);
        d dVar = this.f26101n0;
        if (dVar != null) {
            dVar.C(this.f26103o0);
        }
    }

    public final void g0(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i12 - i10;
        int i18 = i16 - i14;
        if (!(i11 - i9 == i15 - i13 && i17 == i18) && this.f26096l.isShowing()) {
            z0();
            this.f26096l.update(view, (getWidth() - this.f26096l.getWidth()) - this.f26098m, (-this.f26096l.getHeight()) - this.f26098m, -1, -1);
        }
    }

    public InterfaceC0920t1 getPlayer() {
        return this.f26099m0;
    }

    public int getRepeatToggleModes() {
        return this.f26117v0;
    }

    public boolean getShowShuffleButton() {
        return this.f26079a.A(this.f26116v);
    }

    public boolean getShowSubtitleButton() {
        return this.f26079a.A(this.f26120x);
    }

    public int getShowTimeoutMs() {
        return this.f26113t0;
    }

    public boolean getShowVrButton() {
        return this.f26079a.A(this.f26118w);
    }

    public final void h0(int i9) {
        RecyclerView.g gVar;
        if (i9 == 0) {
            gVar = this.f26088h;
        } else {
            if (i9 != 1) {
                this.f26096l.dismiss();
                return;
            }
            gVar = this.f26092j;
        }
        U(gVar, (View) AbstractC1684a.e(this.f26054A));
    }

    public void i0(m mVar) {
        this.f26082e.remove(mVar);
    }

    public void j0() {
        View view = this.f26104p;
        if (view != null) {
            view.requestFocus();
        }
    }

    public final void k0(InterfaceC0920t1 interfaceC0920t1, long j9) {
        if (this.f26109r0) {
            if (interfaceC0920t1.t(17) && interfaceC0920t1.t(10)) {
                Q1 q1W = interfaceC0920t1.w();
                int iU = q1W.u();
                int i9 = 0;
                while (true) {
                    long jF = q1W.s(i9, this.f26065J).f();
                    if (j9 < jF) {
                        break;
                    }
                    if (i9 == iU - 1) {
                        j9 = jF;
                        break;
                    } else {
                        j9 -= jF;
                        i9++;
                    }
                }
                interfaceC0920t1.C(i9, j9);
            }
        } else if (interfaceC0920t1.t(5)) {
            interfaceC0920t1.seekTo(j9);
        }
        v0();
    }

    public final boolean l0() {
        InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
        return (interfaceC0920t1 == null || !interfaceC0920t1.t(1) || (this.f26099m0.t(17) && this.f26099m0.w().v())) ? false : true;
    }

    public void m0() {
        this.f26079a.b0();
    }

    public void n0() {
        t0();
        s0();
        w0();
        A0();
        C0();
        u0();
        B0();
    }

    public final void o0(boolean z9, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z9);
        view.setAlpha(z9 ? this.f26075T : this.f26076U);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26079a.O();
        this.f26105p0 = true;
        if (b0()) {
            this.f26079a.W();
        }
        n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26079a.P();
        this.f26105p0 = false;
        removeCallbacks(this.f26066K);
        this.f26079a.V();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        this.f26079a.Q(z9, i9, i10, i11, i12);
    }

    public final void p0() {
        InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
        int iP = (int) ((interfaceC0920t1 != null ? interfaceC0920t1.P() : 15000L) / 1000);
        TextView textView = this.f26110s;
        if (textView != null) {
            textView.setText(String.valueOf(iP));
        }
        View view = this.f26106q;
        if (view != null) {
            view.setContentDescription(this.f26080c.getQuantityString(AbstractC1107v.f11711a, iP, Integer.valueOf(iP)));
        }
    }

    public final void q0(ImageView imageView, boolean z9) {
        String str;
        if (imageView == null) {
            return;
        }
        if (z9) {
            imageView.setImageDrawable(this.f26091i0);
            str = this.f26095k0;
        } else {
            imageView.setImageDrawable(this.f26093j0);
            str = this.f26097l0;
        }
        imageView.setContentDescription(str);
    }

    public final void s0() {
        boolean zT;
        boolean zT2;
        boolean zT3;
        boolean zT4;
        boolean zT5;
        if (d0() && this.f26105p0) {
            InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
            if (interfaceC0920t1 != null) {
                zT = interfaceC0920t1.t((this.f26107q0 && S(interfaceC0920t1, this.f26065J)) ? 10 : 5);
                zT3 = interfaceC0920t1.t(7);
                zT4 = interfaceC0920t1.t(11);
                zT5 = interfaceC0920t1.t(12);
                zT2 = interfaceC0920t1.t(9);
            } else {
                zT = false;
                zT2 = false;
                zT3 = false;
                zT4 = false;
                zT5 = false;
            }
            if (zT4) {
                x0();
            }
            if (zT5) {
                p0();
            }
            o0(zT3, this.f26100n);
            o0(zT4, this.f26108r);
            o0(zT5, this.f26106q);
            o0(zT2, this.f26102o);
            com.google.android.exoplayer2.ui.f fVar = this.f26061F;
            if (fVar != null) {
                fVar.setEnabled(zT);
            }
        }
    }

    public void setAnimationEnabled(boolean z9) {
        this.f26079a.X(z9);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f26101n0 = dVar;
        r0(this.f26122y, dVar != null);
        r0(this.f26124z, dVar != null);
    }

    public void setPlayer(InterfaceC0920t1 interfaceC0920t1) {
        AbstractC1684a.g(Looper.myLooper() == Looper.getMainLooper());
        AbstractC1684a.a(interfaceC0920t1 == null || interfaceC0920t1.x() == Looper.getMainLooper());
        InterfaceC0920t1 interfaceC0920t12 = this.f26099m0;
        if (interfaceC0920t12 == interfaceC0920t1) {
            return;
        }
        if (interfaceC0920t12 != null) {
            interfaceC0920t12.l(this.f26081d);
        }
        this.f26099m0 = interfaceC0920t1;
        if (interfaceC0920t1 != null) {
            interfaceC0920t1.B(this.f26081d);
        }
        n0();
    }

    public void setProgressUpdateListener(f fVar) {
    }

    public void setRepeatToggleModes(int i9) {
        this.f26117v0 = i9;
        InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
        if (interfaceC0920t1 != null && interfaceC0920t1.t(15)) {
            int repeatMode = this.f26099m0.getRepeatMode();
            if (i9 == 0 && repeatMode != 0) {
                this.f26099m0.setRepeatMode(0);
            } else if (i9 == 1 && repeatMode == 2) {
                this.f26099m0.setRepeatMode(1);
            } else if (i9 == 2 && repeatMode == 1) {
                this.f26099m0.setRepeatMode(2);
            }
        }
        this.f26079a.Y(this.f26114u, i9 != 0);
        w0();
    }

    public void setShowFastForwardButton(boolean z9) {
        this.f26079a.Y(this.f26106q, z9);
        s0();
    }

    public void setShowMultiWindowTimeBar(boolean z9) {
        this.f26107q0 = z9;
        B0();
    }

    public void setShowNextButton(boolean z9) {
        this.f26079a.Y(this.f26102o, z9);
        s0();
    }

    public void setShowPreviousButton(boolean z9) {
        this.f26079a.Y(this.f26100n, z9);
        s0();
    }

    public void setShowRewindButton(boolean z9) {
        this.f26079a.Y(this.f26108r, z9);
        s0();
    }

    public void setShowShuffleButton(boolean z9) {
        this.f26079a.Y(this.f26116v, z9);
        A0();
    }

    public void setShowSubtitleButton(boolean z9) {
        this.f26079a.Y(this.f26120x, z9);
    }

    public void setShowTimeoutMs(int i9) {
        this.f26113t0 = i9;
        if (b0()) {
            this.f26079a.W();
        }
    }

    public void setShowVrButton(boolean z9) {
        this.f26079a.Y(this.f26118w, z9);
    }

    public void setTimeBarMinUpdateInterval(int i9) {
        this.f26115u0 = k0.r(i9, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f26118w;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            o0(onClickListener != null, this.f26118w);
        }
    }

    public final void t0() {
        if (d0() && this.f26105p0 && this.f26104p != null) {
            boolean zF1 = k0.f1(this.f26099m0);
            int i9 = zF1 ? AbstractC1103q.f11641k : AbstractC1103q.f11640j;
            int i10 = zF1 ? AbstractC1108w.f11725g : AbstractC1108w.f11724f;
            ((ImageView) this.f26104p).setImageDrawable(k0.X(getContext(), this.f26080c, i9));
            this.f26104p.setContentDescription(this.f26080c.getString(i10));
            o0(l0(), this.f26104p);
        }
    }

    public final void u0() {
        InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
        if (interfaceC0920t1 == null) {
            return;
        }
        this.f26088h.p0(interfaceC0920t1.c().f6231a);
        this.f26086g.m0(0, this.f26088h.k0());
        y0();
    }

    public final void v0() {
        long jR;
        long jA0;
        if (d0() && this.f26105p0) {
            InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
            if (interfaceC0920t1 == null || !interfaceC0920t1.t(16)) {
                jR = 0;
                jA0 = 0;
            } else {
                jR = this.f26055A0 + interfaceC0920t1.R();
                jA0 = this.f26055A0 + interfaceC0920t1.a0();
            }
            TextView textView = this.f26060E;
            if (textView != null && !this.f26111s0) {
                textView.setText(k0.m0(this.f26062G, this.f26063H, jR));
            }
            com.google.android.exoplayer2.ui.f fVar = this.f26061F;
            if (fVar != null) {
                fVar.setPosition(jR);
                this.f26061F.setBufferedPosition(jA0);
            }
            removeCallbacks(this.f26066K);
            int playbackState = interfaceC0920t1 == null ? 1 : interfaceC0920t1.getPlaybackState();
            if (interfaceC0920t1 == null || !interfaceC0920t1.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.f26066K, 1000L);
                return;
            }
            com.google.android.exoplayer2.ui.f fVar2 = this.f26061F;
            long jMin = Math.min(fVar2 != null ? fVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jR % 1000));
            float f9 = interfaceC0920t1.c().f6231a;
            postDelayed(this.f26066K, k0.s(f9 > 0.0f ? (long) (jMin / f9) : 1000L, this.f26115u0, 1000L));
        }
    }

    public final void w0() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (d0() && this.f26105p0 && (imageView = this.f26114u) != null) {
            if (this.f26117v0 == 0) {
                o0(false, imageView);
                return;
            }
            InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
            if (interfaceC0920t1 == null || !interfaceC0920t1.t(15)) {
                o0(false, this.f26114u);
                this.f26114u.setImageDrawable(this.f26067L);
                this.f26114u.setContentDescription(this.f26070O);
                return;
            }
            o0(true, this.f26114u);
            int repeatMode = interfaceC0920t1.getRepeatMode();
            if (repeatMode == 0) {
                this.f26114u.setImageDrawable(this.f26067L);
                imageView2 = this.f26114u;
                str = this.f26070O;
            } else if (repeatMode == 1) {
                this.f26114u.setImageDrawable(this.f26068M);
                imageView2 = this.f26114u;
                str = this.f26071P;
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f26114u.setImageDrawable(this.f26069N);
                imageView2 = this.f26114u;
                str = this.f26072Q;
            }
            imageView2.setContentDescription(str);
        }
    }

    public final void x0() {
        InterfaceC0920t1 interfaceC0920t1 = this.f26099m0;
        int iF0 = (int) ((interfaceC0920t1 != null ? interfaceC0920t1.f0() : 5000L) / 1000);
        TextView textView = this.f26112t;
        if (textView != null) {
            textView.setText(String.valueOf(iF0));
        }
        View view = this.f26108r;
        if (view != null) {
            view.setContentDescription(this.f26080c.getQuantityString(AbstractC1107v.f11712b, iF0, Integer.valueOf(iF0)));
        }
    }

    public final void y0() {
        o0(this.f26086g.j0(), this.f26054A);
    }

    public final void z0() {
        this.f26084f.measure(0, 0);
        this.f26096l.setWidth(Math.min(this.f26084f.getMeasuredWidth(), getWidth() - (this.f26098m * 2)));
        this.f26096l.setHeight(Math.min(getHeight() - (this.f26098m * 2), this.f26084f.getMeasuredHeight()));
    }
}
