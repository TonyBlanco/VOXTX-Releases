package com.google.android.material.datepicker;

import P.C0959a;
import P.L;
import Q.C;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import d.AbstractC1617D;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class i<S> extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f27283l = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f27284m = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f27285n = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f27286o = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.material.datepicker.a f27288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.google.android.material.datepicker.l f27289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f27290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.material.datepicker.c f27291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f27292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f27293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f27294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f27295k;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27296a;

        public a(int i9) {
            this.f27296a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f27293i.u1(this.f27296a);
        }
    }

    public class b extends C0959a {
        public b() {
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            c9.Z(null);
        }
    }

    public class c extends q {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public final /* synthetic */ int f27299I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i9, boolean z9, int i10) {
            super(context, i9, z9);
            this.f27299I = i10;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void k2(RecyclerView.A a9, int[] iArr) {
            if (this.f27299I == 0) {
                iArr[0] = i.this.f27293i.getWidth();
                iArr[1] = i.this.f27293i.getWidth();
            } else {
                iArr[0] = i.this.f27293i.getHeight();
                iArr[1] = i.this.f27293i.getHeight();
            }
        }
    }

    public class d implements l {
        public d() {
        }

        @Override // com.google.android.material.datepicker.i.l
        public void a(long j9) {
            if (i.this.f27288d.f().b(j9)) {
                i.D(i.this);
                throw null;
            }
        }
    }

    public class e extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Calendar f27302a = v.k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Calendar f27303b = v.k();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a9) {
            if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                i.D(i.this);
                throw null;
            }
        }
    }

    public class f extends C0959a {
        public f() {
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            i iVar;
            int i9;
            super.g(view, c9);
            if (i.this.f27295k.getVisibility() == 0) {
                iVar = i.this;
                i9 = R4.j.f8845s;
            } else {
                iVar = i.this;
                i9 = R4.j.f8843q;
            }
            c9.h0(iVar.getString(i9));
        }
    }

    public class g extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f27306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MaterialButton f27307b;

        public g(n nVar, MaterialButton materialButton) {
            this.f27306a = nVar;
            this.f27307b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i9) {
            if (i9 == 0) {
                recyclerView.announceForAccessibility(this.f27307b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i9, int i10) {
            LinearLayoutManager linearLayoutManagerB0 = i.this.b0();
            int iX2 = i9 < 0 ? linearLayoutManagerB0.x2() : linearLayoutManagerB0.A2();
            i.this.f27289e = this.f27306a.k0(iX2);
            this.f27307b.setText(this.f27306a.l0(iX2));
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.l0();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    public class ViewOnClickListenerC0260i implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f27310a;

        public ViewOnClickListenerC0260i(n nVar) {
            this.f27310a = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iX2 = i.this.b0().x2() + 1;
            if (iX2 < i.this.f27293i.getAdapter().n()) {
                i.this.j0(this.f27310a.k0(iX2));
            }
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f27312a;

        public j(n nVar) {
            this.f27312a = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iA2 = i.this.b0().A2() - 1;
            if (iA2 >= 0) {
                i.this.j0(this.f27312a.k0(iA2));
            }
        }
    }

    public enum k {
        DAY,
        YEAR
    }

    public interface l {
        void a(long j9);
    }

    public static /* synthetic */ com.google.android.material.datepicker.d D(i iVar) {
        iVar.getClass();
        return null;
    }

    public static int Y(Context context) {
        return context.getResources().getDimensionPixelSize(R4.d.f8709H);
    }

    public static int Z(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R4.d.f8716O) + resources.getDimensionPixelOffset(R4.d.f8717P) + resources.getDimensionPixelOffset(R4.d.f8715N);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R4.d.f8711J);
        int i9 = m.f27354f;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R4.d.f8709H) * i9) + ((i9 - 1) * resources.getDimensionPixelOffset(R4.d.f8714M)) + resources.getDimensionPixelOffset(R4.d.f8707F);
    }

    public static i c0(com.google.android.material.datepicker.d dVar, int i9, com.google.android.material.datepicker.a aVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i9);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.k());
        iVar.setArguments(bundle);
        return iVar;
    }

    public final void L(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R4.f.f8792p);
        materialButton.setTag(f27286o);
        L.s0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R4.f.f8794r);
        materialButton2.setTag(f27284m);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R4.f.f8793q);
        materialButton3.setTag(f27285n);
        this.f27294j = view.findViewById(R4.f.f8802z);
        this.f27295k = view.findViewById(R4.f.f8797u);
        k0(k.DAY);
        materialButton.setText(this.f27289e.w());
        this.f27293i.l(new g(nVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new ViewOnClickListenerC0260i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    public final RecyclerView.n P() {
        return new e();
    }

    public com.google.android.material.datepicker.a S() {
        return this.f27288d;
    }

    public com.google.android.material.datepicker.c T() {
        return this.f27291g;
    }

    public com.google.android.material.datepicker.l W() {
        return this.f27289e;
    }

    public com.google.android.material.datepicker.d X() {
        return null;
    }

    public LinearLayoutManager b0() {
        return (LinearLayoutManager) this.f27293i.getLayoutManager();
    }

    public final void i0(int i9) {
        this.f27293i.post(new a(i9));
    }

    public void j0(com.google.android.material.datepicker.l lVar) {
        RecyclerView recyclerView;
        int i9;
        n nVar = (n) this.f27293i.getAdapter();
        int iM0 = nVar.m0(lVar);
        int iM02 = iM0 - nVar.m0(this.f27289e);
        boolean z9 = Math.abs(iM02) > 3;
        boolean z10 = iM02 > 0;
        this.f27289e = lVar;
        if (!z9 || !z10) {
            if (z9) {
                recyclerView = this.f27293i;
                i9 = iM0 + 3;
            }
            i0(iM0);
        }
        recyclerView = this.f27293i;
        i9 = iM0 - 3;
        recyclerView.m1(i9);
        i0(iM0);
    }

    public void k0(k kVar) {
        this.f27290f = kVar;
        if (kVar == k.YEAR) {
            this.f27292h.getLayoutManager().U1(((w) this.f27292h.getAdapter()).j0(this.f27289e.f27349d));
            this.f27294j.setVisibility(0);
            this.f27295k.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f27294j.setVisibility(8);
            this.f27295k.setVisibility(0);
            j0(this.f27289e);
        }
    }

    public void l0() {
        k kVar = this.f27290f;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            k0(k.DAY);
        } else if (kVar == k.DAY) {
            k0(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f27287c = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC1617D.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f27288d = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f27289e = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i9;
        int i10;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f27287c);
        this.f27291g = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l lVarM = this.f27288d.m();
        if (com.google.android.material.datepicker.j.W(contextThemeWrapper)) {
            i9 = R4.h.f8822q;
            i10 = 1;
        } else {
            i9 = R4.h.f8820o;
            i10 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i9, viewGroup, false);
        viewInflate.setMinimumHeight(Z(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(R4.f.f8798v);
        L.s0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.h());
        gridView.setNumColumns(lVarM.f27350e);
        gridView.setEnabled(false);
        this.f27293i = (RecyclerView) viewInflate.findViewById(R4.f.f8801y);
        this.f27293i.setLayoutManager(new c(getContext(), i10, false, i10));
        this.f27293i.setTag(f27283l);
        n nVar = new n(contextThemeWrapper, null, this.f27288d, new d());
        this.f27293i.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(R4.g.f8805c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R4.f.f8802z);
        this.f27292h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f27292h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f27292h.setAdapter(new w(this));
            this.f27292h.h(P());
        }
        if (viewInflate.findViewById(R4.f.f8792p) != null) {
            L(viewInflate, nVar);
        }
        if (!com.google.android.material.datepicker.j.W(contextThemeWrapper)) {
            new androidx.recyclerview.widget.k().b(this.f27293i);
        }
        this.f27293i.m1(nVar.m0(this.f27289e));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f27287c);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f27288d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f27289e);
    }

    @Override // com.google.android.material.datepicker.p
    public boolean x(o oVar) {
        return super.x(oVar);
    }
}
