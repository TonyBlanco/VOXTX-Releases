package com.google.android.material.datepicker;

import P.L;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;

/* JADX INFO: loaded from: classes3.dex */
public class n extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.material.datepicker.a f27359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i.l f27360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27361f;

    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f27362a;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f27362a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            if (this.f27362a.getAdapter().l(i9)) {
                n.this.f27360e.a(this.f27362a.getAdapter().getItem(i9).longValue());
            }
        }
    }

    public static class b extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final TextView f27364t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final MaterialCalendarGridView f27365u;

        public b(LinearLayout linearLayout, boolean z9) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R4.f.f8795s);
            this.f27364t = textView;
            L.t0(textView, true);
            this.f27365u = (MaterialCalendarGridView) linearLayout.findViewById(R4.f.f8791o);
            if (z9) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public n(Context context, d dVar, com.google.android.material.datepicker.a aVar, i.l lVar) {
        l lVarM = aVar.m();
        l lVarG = aVar.g();
        l lVarK = aVar.k();
        if (lVarM.compareTo(lVarK) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (lVarK.compareTo(lVarG) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f27361f = (m.f27354f * i.Y(context)) + (j.W(context) ? i.Y(context) : 0);
        this.f27359d = aVar;
        this.f27360e = lVar;
        c0(true);
    }

    public l k0(int i9) {
        return this.f27359d.m().A(i9);
    }

    public CharSequence l0(int i9) {
        return k0(i9).w();
    }

    public int m0(l lVar) {
        return this.f27359d.m().C(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f27359d.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void E(b bVar, int i9) {
        l lVarA = this.f27359d.m().A(i9);
        bVar.f27364t.setText(lVarA.w());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f27365u.findViewById(R4.f.f8791o);
        if (materialCalendarGridView.getAdapter() == null || !lVarA.equals(materialCalendarGridView.getAdapter().f27355a)) {
            m mVar = new m(lVarA, null, this.f27359d);
            materialCalendarGridView.setNumColumns(lVarA.f27350e);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().k(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long o(int i9) {
        return this.f27359d.m().A(i9).x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b L(ViewGroup viewGroup, int i9) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R4.h.f8821p, viewGroup, false);
        if (!j.W(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f27361f));
        return new b(linearLayout, true);
    }
}
