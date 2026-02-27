package j0;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.B;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import d.AbstractC1617D;
import g0.AbstractC1798c;
import g0.AbstractC1801f;
import g0.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2072a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f42851a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f42852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f42853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f42854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f42855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f42856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f42857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f42858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Interpolator f42860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Interpolator f42861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f42862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f42863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f42864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f42865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f42866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f42867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f42868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B f42869t;

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    public class C0353a extends B {
        public C0353a() {
        }

        @Override // androidx.leanback.widget.B
        public void a(RecyclerView recyclerView, RecyclerView.D d9, int i9, int i10) {
            int iIndexOf = AbstractC2072a.this.f42853d.indexOf(recyclerView);
            AbstractC2072a.this.h(iIndexOf, true);
            if (d9 != null) {
                AbstractC2072a.this.c(iIndexOf, ((C2073b) AbstractC2072a.this.f42854e.get(iIndexOf)).e() + i9);
            }
        }
    }

    /* JADX INFO: renamed from: j0.a$b */
    public class b extends RecyclerView.g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f42871d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f42872e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f42873f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C2073b f42874g;

        public b(Context context, int i9, int i10, int i11) {
            this.f42871d = i9;
            this.f42872e = i11;
            this.f42873f = i10;
            this.f42874g = (C2073b) AbstractC2072a.this.f42854e.get(i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void E(c cVar, int i9) {
            C2073b c2073b;
            TextView textView = cVar.f42876t;
            if (textView != null && (c2073b = this.f42874g) != null) {
                textView.setText(c2073b.c(c2073b.e() + i9));
            }
            AbstractC2072a abstractC2072a = AbstractC2072a.this;
            abstractC2072a.g(cVar.f16733a, ((VerticalGridView) abstractC2072a.f42853d.get(this.f42872e)).getSelectedPosition() == i9, this.f42872e, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public c L(ViewGroup viewGroup, int i9) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f42871d, viewGroup, false);
            int i10 = this.f42873f;
            return new c(viewInflate, i10 != 0 ? (TextView) viewInflate.findViewById(i10) : (TextView) viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public void W(c cVar) {
            cVar.f16733a.setFocusable(AbstractC2072a.this.isActivated());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int n() {
            C2073b c2073b = this.f42874g;
            if (c2073b == null) {
                return 0;
            }
            return c2073b.a();
        }
    }

    /* JADX INFO: renamed from: j0.a$c */
    public static class c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final TextView f42876t;

        public c(View view, TextView textView) {
            super(view);
            this.f42876t = textView;
        }
    }

    public AbstractC2072a(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f42853d = new ArrayList();
        this.f42863n = 3.0f;
        this.f42864o = 1.0f;
        this.f42865p = 0;
        this.f42866q = new ArrayList();
        this.f42867r = h.f41051d;
        this.f42868s = 0;
        this.f42869t = new C0353a();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f42856g = 1.0f;
        this.f42855f = 1.0f;
        this.f42857h = 0.5f;
        this.f42858i = 0.0f;
        this.f42859j = 200;
        this.f42860k = new DecelerateInterpolator(2.5f);
        this.f42861l = new AccelerateInterpolator(2.5f);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(h.f41049b, (ViewGroup) this, true);
        this.f42851a = viewGroup;
        this.f42852c = (ViewGroup) viewGroup.findViewById(AbstractC1801f.f41038v);
    }

    public C2073b a(int i9) {
        ArrayList arrayList = this.f42854e;
        if (arrayList == null) {
            return null;
        }
        return (C2073b) arrayList.get(i9);
    }

    public final void b(int i9) {
        int size;
        if (this.f42862m == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC1617D.a(this.f42862m.get(size));
        throw null;
    }

    public abstract void c(int i9, int i10);

    public void d(int i9, C2073b c2073b) {
        this.f42854e.set(i9, c2073b);
        VerticalGridView verticalGridView = (VerticalGridView) this.f42853d.get(i9);
        b bVar = (b) verticalGridView.getAdapter();
        if (bVar != null) {
            bVar.w();
        }
        verticalGridView.setSelectedPosition(c2073b.b() - c2073b.e());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public void e(int i9, int i10, boolean z9) {
        C2073b c2073b = (C2073b) this.f42854e.get(i9);
        if (c2073b.b() != i10) {
            c2073b.f(i10);
            b(i9);
            VerticalGridView verticalGridView = (VerticalGridView) this.f42853d.get(i9);
            if (verticalGridView != null) {
                int iE = i10 - ((C2073b) this.f42854e.get(i9)).e();
                if (z9) {
                    verticalGridView.setSelectedPositionSmooth(iE);
                } else {
                    verticalGridView.setSelectedPosition(iE);
                }
            }
        }
    }

    public final void f(View view, boolean z9, float f9, float f10, Interpolator interpolator) {
        view.animate().cancel();
        if (!z9) {
            view.setAlpha(f9);
            return;
        }
        if (f10 >= 0.0f) {
            view.setAlpha(f10);
        }
        view.animate().alpha(f9).setDuration(this.f42859j).setInterpolator(interpolator).start();
    }

    public void g(View view, boolean z9, int i9, boolean z10) {
        boolean z11 = i9 == this.f42865p || !hasFocus();
        f(view, z10, z9 ? z11 ? this.f42856g : this.f42855f : z11 ? this.f42857h : this.f42858i, -1.0f, this.f42860k);
    }

    public float getActivatedVisibleItemCount() {
        return this.f42863n;
    }

    public int getColumnsCount() {
        ArrayList arrayList = this.f42854e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1798c.f40996x);
    }

    public final int getPickerItemLayoutId() {
        return this.f42867r;
    }

    public final int getPickerItemTextViewId() {
        return this.f42868s;
    }

    public int getSelectedColumn() {
        return this.f42865p;
    }

    public final CharSequence getSeparator() {
        return (CharSequence) this.f42866q.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.f42866q;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    public void h(int i9, boolean z9) {
        VerticalGridView verticalGridView = (VerticalGridView) this.f42853d.get(i9);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i10 = 0;
        while (i10 < verticalGridView.getAdapter().n()) {
            View viewA0 = verticalGridView.getLayoutManager().a0(i10);
            if (viewA0 != null) {
                g(viewA0, selectedPosition == i10, i9, z9);
            }
            i10++;
        }
    }

    public final void i() {
        for (int i9 = 0; i9 < getColumnsCount(); i9++) {
            j((VerticalGridView) this.f42853d.get(i9));
        }
    }

    public final void j(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) ((getPickerItemHeightPixels() * activatedVisibleItemCount) + (verticalGridView.getVerticalSpacing() * (activatedVisibleItemCount - 1.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }

    public final void k() {
        boolean zIsActivated = isActivated();
        for (int i9 = 0; i9 < getColumnsCount(); i9++) {
            VerticalGridView verticalGridView = (VerticalGridView) this.f42853d.get(i9);
            for (int i10 = 0; i10 < verticalGridView.getChildCount(); i10++) {
                verticalGridView.getChildAt(i10).setFocusable(zIsActivated);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < this.f42853d.size()) {
            return ((VerticalGridView) this.f42853d.get(selectedColumn)).requestFocus(i9, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i9 = 0; i9 < this.f42853d.size(); i9++) {
            if (((VerticalGridView) this.f42853d.get(i9)).hasFocus()) {
                setSelectedColumn(i9);
            }
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z9) {
        boolean zIsActivated = isActivated();
        super.setActivated(z9);
        if (z9 == zIsActivated) {
            return;
        }
        boolean zHasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z9 && zHasFocus && isFocusable()) {
            requestFocus();
        }
        for (int i9 = 0; i9 < getColumnsCount(); i9++) {
            ((VerticalGridView) this.f42853d.get(i9)).setFocusable(z9);
        }
        i();
        k();
        if (z9 && zHasFocus && selectedColumn >= 0) {
            ((VerticalGridView) this.f42853d.get(selectedColumn)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f9) {
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f42863n != f9) {
            this.f42863n = f9;
            if (isActivated()) {
                i();
            }
        }
    }

    public void setColumns(List<C2073b> list) {
        if (this.f42866q.size() == 0) {
            throw new IllegalStateException("Separators size is: " + this.f42866q.size() + ". At least one separator must be provided");
        }
        if (this.f42866q.size() == 1) {
            CharSequence charSequence = (CharSequence) this.f42866q.get(0);
            this.f42866q.clear();
            this.f42866q.add("");
            for (int i9 = 0; i9 < list.size() - 1; i9++) {
                this.f42866q.add(charSequence);
            }
            this.f42866q.add("");
        } else if (this.f42866q.size() != list.size() + 1) {
            throw new IllegalStateException("Separators size: " + this.f42866q.size() + " mustequal the size of columns: " + list.size() + " + 1");
        }
        this.f42853d.clear();
        this.f42852c.removeAllViews();
        ArrayList arrayList = new ArrayList(list);
        this.f42854e = arrayList;
        if (this.f42865p > arrayList.size() - 1) {
            this.f42865p = this.f42854e.size() - 1;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int columnsCount = getColumnsCount();
        if (!TextUtils.isEmpty((CharSequence) this.f42866q.get(0))) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(h.f41052e, this.f42852c, false);
            textView.setText((CharSequence) this.f42866q.get(0));
            this.f42852c.addView(textView);
        }
        int i10 = 0;
        while (i10 < columnsCount) {
            VerticalGridView verticalGridView = (VerticalGridView) layoutInflaterFrom.inflate(h.f41050c, this.f42852c, false);
            j(verticalGridView);
            verticalGridView.setWindowAlignment(0);
            verticalGridView.setHasFixedSize(false);
            verticalGridView.setFocusable(isActivated());
            verticalGridView.setItemViewCacheSize(0);
            this.f42853d.add(verticalGridView);
            this.f42852c.addView(verticalGridView);
            int i11 = i10 + 1;
            if (!TextUtils.isEmpty((CharSequence) this.f42866q.get(i11))) {
                TextView textView2 = (TextView) layoutInflaterFrom.inflate(h.f41052e, this.f42852c, false);
                textView2.setText((CharSequence) this.f42866q.get(i11));
                this.f42852c.addView(textView2);
            }
            verticalGridView.setAdapter(new b(getContext(), getPickerItemLayoutId(), getPickerItemTextViewId(), i10));
            verticalGridView.setOnChildViewHolderSelectedListener(this.f42869t);
            i10 = i11;
        }
    }

    public final void setPickerItemTextViewId(int i9) {
        this.f42868s = i9;
    }

    public void setSelectedColumn(int i9) {
        if (this.f42865p != i9) {
            this.f42865p = i9;
            for (int i10 = 0; i10 < this.f42853d.size(); i10++) {
                h(i10, true);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        this.f42866q.clear();
        this.f42866q.addAll(list);
    }

    public void setVisibleItemCount(float f9) {
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        if (this.f42864o != f9) {
            this.f42864o = f9;
            if (isActivated()) {
                return;
            }
            i();
        }
    }
}
