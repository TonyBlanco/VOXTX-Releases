package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import k.d0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f13691d = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f13692a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13693c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        d0 d0VarV = d0.v(context, attributeSet, f13691d, i9, 0);
        if (d0VarV.s(0)) {
            setBackgroundDrawable(d0VarV.g(0));
        }
        if (d0VarV.s(1)) {
            setDivider(d0VarV.g(1));
        }
        d0VarV.w();
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar) {
        this.f13692a = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean d(g gVar) {
        return this.f13692a.L(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.f13693c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
        d((g) getAdapter().getItem(i9));
    }
}
