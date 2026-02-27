package com.google.android.exoplayer2.ui;

import B3.g0;
import O2.C0936z0;
import O2.V1;
import Z3.x;
import a4.AbstractC1106u;
import a4.AbstractC1108w;
import a4.C1094h;
import a4.c0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import d4.AbstractC1684a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25924a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f25925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f25926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckedTextView f25927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f25928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f25929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f25930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c0 f25933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CheckedTextView[][] f25934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Comparator f25936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f25937o;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V1.a f25939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25940b;

        public c(V1.a aVar, int i9) {
            this.f25939a = aVar;
            this.f25940b = i9;
        }

        public C0936z0 a() {
            return this.f25939a.c(this.f25940b);
        }
    }

    public interface d {
        void l(boolean z9, Map map);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f25924a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f25925c = layoutInflaterFrom;
        b bVar = new b();
        this.f25928f = bVar;
        this.f25933k = new C1094h(getResources());
        this.f25929g = new ArrayList();
        this.f25930h = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f25926d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(AbstractC1108w.f11742x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(AbstractC1106u.f11702a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f25927e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(AbstractC1108w.f11741w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public static Map c(Map map, List list, boolean z9) {
        HashMap map2 = new HashMap();
        for (int i9 = 0; i9 < list.size(); i9++) {
            x xVar = (x) map.get(((V1.a) list.get(i9)).b());
            if (xVar != null && (z9 || map2.isEmpty())) {
                map2.put(xVar.f11266a, xVar);
            }
        }
        return map2;
    }

    public static /* synthetic */ int e(Comparator comparator, c cVar, c cVar2) {
        return comparator.compare(cVar.a(), cVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        if (view == this.f25926d) {
            g();
        } else if (view == this.f25927e) {
            f();
        } else {
            h(view);
        }
        k();
        d dVar = this.f25937o;
        if (dVar != null) {
            dVar.l(getIsDisabled(), getOverrides());
        }
    }

    public void d(List list, boolean z9, Map map, final Comparator comparator, d dVar) {
        this.f25935m = z9;
        this.f25936n = comparator == null ? null : new Comparator() { // from class: a4.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TrackSelectionView.e(comparator, (TrackSelectionView.c) obj, (TrackSelectionView.c) obj2);
            }
        };
        this.f25937o = dVar;
        this.f25929g.clear();
        this.f25929g.addAll(list);
        this.f25930h.clear();
        this.f25930h.putAll(c(map, list, this.f25932j));
        l();
    }

    public final void f() {
        this.f25935m = false;
        this.f25930h.clear();
    }

    public final void g() {
        this.f25935m = true;
        this.f25930h.clear();
    }

    public boolean getIsDisabled() {
        return this.f25935m;
    }

    public Map<g0, x> getOverrides() {
        return this.f25930h;
    }

    public final void h(View view) {
        Map map;
        x xVar;
        this.f25935m = false;
        c cVar = (c) AbstractC1684a.e(view.getTag());
        g0 g0VarB = cVar.f25939a.b();
        int i9 = cVar.f25940b;
        x xVar2 = (x) this.f25930h.get(g0VarB);
        if (xVar2 == null) {
            if (!this.f25932j && this.f25930h.size() > 0) {
                this.f25930h.clear();
            }
            map = this.f25930h;
            xVar = new x(g0VarB, AbstractC2743y.A(Integer.valueOf(i9)));
        } else {
            ArrayList arrayList = new ArrayList(xVar2.f11267c);
            boolean zIsChecked = ((CheckedTextView) view).isChecked();
            boolean zI = i(cVar.f25939a);
            boolean z9 = zI || j();
            if (zIsChecked && z9) {
                arrayList.remove(Integer.valueOf(i9));
                if (arrayList.isEmpty()) {
                    this.f25930h.remove(g0VarB);
                    return;
                } else {
                    map = this.f25930h;
                    xVar = new x(g0VarB, arrayList);
                }
            } else {
                if (zIsChecked) {
                    return;
                }
                if (zI) {
                    arrayList.add(Integer.valueOf(i9));
                    map = this.f25930h;
                    xVar = new x(g0VarB, arrayList);
                } else {
                    map = this.f25930h;
                    xVar = new x(g0VarB, AbstractC2743y.A(Integer.valueOf(i9)));
                }
            }
        }
        map.put(g0VarB, xVar);
    }

    public final boolean i(V1.a aVar) {
        return this.f25931i && aVar.f();
    }

    public final boolean j() {
        return this.f25932j && this.f25929g.size() > 1;
    }

    public final void k() {
        this.f25926d.setChecked(this.f25935m);
        this.f25927e.setChecked(!this.f25935m && this.f25930h.size() == 0);
        for (int i9 = 0; i9 < this.f25934l.length; i9++) {
            x xVar = (x) this.f25930h.get(((V1.a) this.f25929g.get(i9)).b());
            int i10 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f25934l[i9];
                if (i10 < checkedTextViewArr.length) {
                    if (xVar != null) {
                        this.f25934l[i9][i10].setChecked(xVar.f11267c.contains(Integer.valueOf(((c) AbstractC1684a.e(checkedTextViewArr[i10].getTag())).f25940b)));
                    } else {
                        checkedTextViewArr[i10].setChecked(false);
                    }
                    i10++;
                }
            }
        }
    }

    public final void l() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f25929g.isEmpty()) {
            this.f25926d.setEnabled(false);
            this.f25927e.setEnabled(false);
            return;
        }
        this.f25926d.setEnabled(true);
        this.f25927e.setEnabled(true);
        this.f25934l = new CheckedTextView[this.f25929g.size()][];
        boolean zJ = j();
        for (int i9 = 0; i9 < this.f25929g.size(); i9++) {
            V1.a aVar = (V1.a) this.f25929g.get(i9);
            boolean zI = i(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f25934l;
            int i10 = aVar.f5916a;
            checkedTextViewArr[i9] = new CheckedTextView[i10];
            c[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < aVar.f5916a; i11++) {
                cVarArr[i11] = new c(aVar, i11);
            }
            Comparator comparator = this.f25936n;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                if (i12 == 0) {
                    addView(this.f25925c.inflate(AbstractC1106u.f11702a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f25925c.inflate((zI || zJ) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f25924a);
                checkedTextView.setText(this.f25933k.a(cVarArr[i12].a()));
                checkedTextView.setTag(cVarArr[i12]);
                if (aVar.k(i12)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f25928f);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f25934l[i9][i12] = checkedTextView;
                addView(checkedTextView);
            }
        }
        k();
    }

    public void setAllowAdaptiveSelections(boolean z9) {
        if (this.f25931i != z9) {
            this.f25931i = z9;
            l();
        }
    }

    public void setAllowMultipleOverrides(boolean z9) {
        if (this.f25932j != z9) {
            this.f25932j = z9;
            if (!z9 && this.f25930h.size() > 1) {
                Map mapC = c(this.f25930h, this.f25929g, false);
                this.f25930h.clear();
                this.f25930h.putAll(mapC);
            }
            l();
        }
    }

    public void setShowDisableOption(boolean z9) {
        this.f25926d.setVisibility(z9 ? 0 : 8);
    }

    public void setTrackNameProvider(c0 c0Var) {
        this.f25933k = (c0) AbstractC1684a.e(c0Var);
        l();
    }
}
