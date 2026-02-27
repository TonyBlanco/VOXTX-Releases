package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.leanback.widget.SearchOrbView;
import g0.AbstractC1797b;
import g0.AbstractC1799d;
import g0.AbstractC1800e;

/* JADX INFO: loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f15580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SearchOrbView.c f15581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SearchOrbView.c f15582v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15584x;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15583w = 0;
        this.f15584x = false;
        Resources resources = context.getResources();
        this.f15580t = resources.getFraction(AbstractC1800e.f41008f, 1, 1);
        this.f15582v = new SearchOrbView.c(resources.getColor(AbstractC1797b.f40968j), resources.getColor(AbstractC1797b.f40970l), resources.getColor(AbstractC1797b.f40969k));
        this.f15581u = new SearchOrbView.c(resources.getColor(AbstractC1797b.f40971m), resources.getColor(AbstractC1797b.f40971m), 0);
        g();
    }

    public void f() {
        setOrbColors(this.f15581u);
        setOrbIcon(getResources().getDrawable(AbstractC1799d.f40999c));
        a(true);
        b(false);
        c(1.0f);
        this.f15583w = 0;
        this.f15584x = true;
    }

    public void g() {
        setOrbColors(this.f15582v);
        setOrbIcon(getResources().getDrawable(AbstractC1799d.f41000d));
        a(hasFocus());
        c(1.0f);
        this.f15584x = false;
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return g0.h.f41060m;
    }

    public void setListeningOrbColors(SearchOrbView.c cVar) {
        this.f15581u = cVar;
    }

    public void setNotListeningOrbColors(SearchOrbView.c cVar) {
        this.f15582v = cVar;
    }

    public void setSoundLevel(int i9) {
        if (this.f15584x) {
            int i10 = this.f15583w;
            if (i9 > i10) {
                this.f15583w = i10 + ((i9 - i10) / 2);
            } else {
                this.f15583w = (int) (i10 * 0.7f);
            }
            c((((this.f15580t - getFocusedZoom()) * this.f15583w) / 100.0f) + 1.0f);
        }
    }
}
