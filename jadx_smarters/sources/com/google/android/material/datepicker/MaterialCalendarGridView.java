package com.google.android.material.datepicker;

import P.C0959a;
import P.L;
import Q.C;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f27249a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27250c;

    public class a extends C0959a {
        public a() {
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            c9.Z(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f27249a = v.k();
        if (j.W(getContext())) {
            setNextFocusLeftId(R4.f.f8777a);
            setNextFocusRightId(R4.f.f8779c);
        }
        this.f27250c = j.X(getContext());
        L.s0(this, new a());
    }

    public final void a(int i9, Rect rect) {
        int iB;
        if (i9 == 33) {
            iB = getAdapter().g();
        } else {
            if (i9 != 130) {
                super.onFocusChanged(true, i9, rect);
                return;
            }
            iB = getAdapter().b();
        }
        setSelection(iB);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m getAdapter() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m adapter = getAdapter();
        adapter.getClass();
        int iMax = Math.max(adapter.b(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.g(), getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z9, int i9, Rect rect) {
        if (z9) {
            a(i9, rect);
        } else {
            super.onFocusChanged(false, i9, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (!super.onKeyDown(i9, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i9) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i9, int i10) {
        if (!this.f27250c) {
            super.onMeasure(i9, i10);
            return;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof m)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i9) {
        if (i9 < getAdapter().b()) {
            i9 = getAdapter().b();
        }
        super.setSelection(i9);
    }
}
