package com.google.android.material.button;

import P.AbstractC0976s;
import P.C0959a;
import P.L;
import Q.C;
import R4.k;
import R4.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import f5.u;
import f5.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import l5.C2192a;
import l5.InterfaceC2194c;
import l5.k;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f27127l = "MaterialButtonToggleGroup";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f27128m = k.f8865s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27129a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f27130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f27131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Comparator f27132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer[] f27133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set f27138k;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends C0959a {
        public b() {
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            c9.a0(C.c.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InterfaceC2194c f27141e = new C2192a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC2194c f27142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC2194c f27143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public InterfaceC2194c f27144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC2194c f27145d;

        public c(InterfaceC2194c interfaceC2194c, InterfaceC2194c interfaceC2194c2, InterfaceC2194c interfaceC2194c3, InterfaceC2194c interfaceC2194c4) {
            this.f27142a = interfaceC2194c;
            this.f27143b = interfaceC2194c3;
            this.f27144c = interfaceC2194c4;
            this.f27145d = interfaceC2194c2;
        }

        public static c a(c cVar) {
            InterfaceC2194c interfaceC2194c = f27141e;
            return new c(interfaceC2194c, cVar.f27145d, interfaceC2194c, cVar.f27144c);
        }

        public static c b(c cVar, View view) {
            return w.e(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            InterfaceC2194c interfaceC2194c = cVar.f27142a;
            InterfaceC2194c interfaceC2194c2 = cVar.f27145d;
            InterfaceC2194c interfaceC2194c3 = f27141e;
            return new c(interfaceC2194c, interfaceC2194c2, interfaceC2194c3, interfaceC2194c3);
        }

        public static c d(c cVar) {
            InterfaceC2194c interfaceC2194c = f27141e;
            return new c(interfaceC2194c, interfaceC2194c, cVar.f27143b, cVar.f27144c);
        }

        public static c e(c cVar, View view) {
            return w.e(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            InterfaceC2194c interfaceC2194c = cVar.f27142a;
            InterfaceC2194c interfaceC2194c2 = f27141e;
            return new c(interfaceC2194c, interfaceC2194c2, cVar.f27143b, interfaceC2194c2);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i9, boolean z9);
    }

    public class e implements MaterialButton.a {
        public e() {
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z9) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8686u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f27128m;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        this.f27129a = new ArrayList();
        this.f27130c = new e(this, null);
        this.f27131d = new LinkedHashSet();
        this.f27132e = new a();
        this.f27134g = false;
        this.f27138k = new HashSet();
        TypedArray typedArrayH = u.h(getContext(), attributeSet, l.f9128f3, i9, i10, new int[0]);
        setSingleSelection(typedArrayH.getBoolean(l.f9155i3, false));
        this.f27137j = typedArrayH.getResourceId(l.f9137g3, -1);
        this.f27136i = typedArrayH.getBoolean(l.f9146h3, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayH.recycle();
        L.C0(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            if (k(i9)) {
                return i9;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && k(i10)) {
                i9++;
            }
        }
        return i9;
    }

    public static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f27142a).t(cVar.f27145d).F(cVar.f27143b).x(cVar.f27144c);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(L.m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f27130c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f27127l, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i9, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        l5.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f27129a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        L.s0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f27131d.add(dVar);
    }

    public final void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i9 = firstVisibleChildIndex + 1; i9 < getChildCount(); i9++) {
            MaterialButton materialButtonH = h(i9);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i9 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                AbstractC0976s.c(layoutParamsD, 0);
                AbstractC0976s.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                AbstractC0976s.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public final void e(int i9, boolean z9) {
        if (i9 == -1) {
            Log.e(f27127l, "Button ID is not valid: " + i9);
            return;
        }
        HashSet hashSet = new HashSet(this.f27138k);
        if (z9 && !hashSet.contains(Integer.valueOf(i9))) {
            if (this.f27135h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i9));
        } else {
            if (z9 || !hashSet.contains(Integer.valueOf(i9))) {
                return;
            }
            if (!this.f27136i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i9));
            }
        }
        q(hashSet);
    }

    public void f() {
        q(new HashSet());
    }

    public final void g(int i9, boolean z9) {
        Iterator it = this.f27131d.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i9, z9);
        }
    }

    public int getCheckedButtonId() {
        if (!this.f27135h || this.f27138k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f27138k.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            int id = h(i9).getId();
            if (this.f27138k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i9, int i10) {
        Integer[] numArr = this.f27133f;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w(f27127l, "Child order wasn't updated");
        return i10;
    }

    public final MaterialButton h(int i9) {
        return (MaterialButton) getChildAt(i9);
    }

    public final int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) == view) {
                return i9;
            }
            if ((getChildAt(i10) instanceof MaterialButton) && k(i10)) {
                i9++;
            }
        }
        return -1;
    }

    public final c j(int i9, int i10, int i11) {
        c cVar = (c) this.f27129a.get(i9);
        if (i10 == i11) {
            return cVar;
        }
        boolean z9 = getOrientation() == 0;
        if (i9 == i10) {
            return z9 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i9 == i11) {
            return z9 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    public final boolean k(int i9) {
        return getChildAt(i9).getVisibility() != 8;
    }

    public boolean l() {
        return this.f27135h;
    }

    public void m(MaterialButton materialButton, boolean z9) {
        if (this.f27134g) {
            return;
        }
        e(materialButton.getId(), z9);
    }

    public final void n(int i9) {
        if (getChildCount() == 0 || i9 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i9).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            AbstractC0976s.c(layoutParams, 0);
            AbstractC0976s.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void o(int i9, boolean z9) {
        View viewFindViewById = findViewById(i9);
        if (viewFindViewById instanceof MaterialButton) {
            this.f27134g = true;
            ((MaterialButton) viewFindViewById).setChecked(z9);
            this.f27134g = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i9 = this.f27137j;
        if (i9 != -1) {
            q(Collections.singleton(Integer.valueOf(i9)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C.y0(accessibilityNodeInfo).Z(C.b.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        s();
        c();
        super.onMeasure(i9, i10);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f27129a.remove(iIndexOfChild);
        }
        s();
        c();
    }

    public final void q(Set set) {
        Set set2 = this.f27138k;
        this.f27138k = new HashSet(set);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            int id = h(i9).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    public final void r() {
        TreeMap treeMap = new TreeMap(this.f27132e);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            treeMap.put(h(i9), Integer.valueOf(i9));
        }
        this.f27133f = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i9 = 0; i9 < childCount; i9++) {
            MaterialButton materialButtonH = h(i9);
            if (materialButtonH.getVisibility() != 8) {
                k.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i9, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    public void setSelectionRequired(boolean z9) {
        this.f27136i = z9;
    }

    public void setSingleSelection(int i9) {
        setSingleSelection(getResources().getBoolean(i9));
    }

    public void setSingleSelection(boolean z9) {
        if (this.f27135h != z9) {
            this.f27135h = z9;
            f();
        }
    }
}
