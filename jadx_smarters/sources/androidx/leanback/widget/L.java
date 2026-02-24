package androidx.leanback.widget;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.leanback.widget.E;
import d.AbstractC1617D;
import g0.AbstractC1800e;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
public class L extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f15374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15376e;

    public static class a extends E.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f15379e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public RowHeaderView f15380f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f15381g;

        public a(View view) {
            super(view);
            this.f15380f = (RowHeaderView) view.findViewById(AbstractC1801f.f41041y);
            this.f15381g = (TextView) view.findViewById(AbstractC1801f.f41042z);
            a();
        }

        public void a() {
            RowHeaderView rowHeaderView = this.f15380f;
            if (rowHeaderView != null) {
                this.f15378d = rowHeaderView.getCurrentTextColor();
            }
            this.f15379e = this.f15344a.getResources().getFraction(AbstractC1800e.f41003a, 1, 1);
        }
    }

    public L() {
        this(g0.h.f41055h);
    }

    public L(int i9) {
        this(i9, true);
    }

    public L(int i9, boolean z9) {
        this.f15374c = new Paint(1);
        this.f15373b = i9;
        this.f15376e = z9;
    }

    public static float i(TextView textView, Paint paint) {
        if (paint.getTextSize() != textView.getTextSize()) {
            paint.setTextSize(textView.getTextSize());
        }
        if (paint.getTypeface() != textView.getTypeface()) {
            paint.setTypeface(textView.getTypeface());
        }
        return paint.descent();
    }

    @Override // androidx.leanback.widget.E
    public void b(E.a aVar, Object obj) {
        if (obj != null) {
            AbstractC1617D.a(obj);
            throw null;
        }
        a aVar2 = (a) aVar;
        RowHeaderView rowHeaderView = aVar2.f15380f;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aVar2.f15381g;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        aVar.f15344a.setContentDescription(null);
        if (this.f15375d) {
            aVar.f15344a.setVisibility(8);
        }
    }

    @Override // androidx.leanback.widget.E
    public E.a e(ViewGroup viewGroup) {
        a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f15373b, viewGroup, false));
        if (this.f15376e) {
            m(aVar, 0.0f);
        }
        return aVar;
    }

    @Override // androidx.leanback.widget.E
    public void f(E.a aVar) {
        a aVar2 = (a) aVar;
        RowHeaderView rowHeaderView = aVar2.f15380f;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = aVar2.f15381g;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.f15376e) {
            m(aVar2, 0.0f);
        }
    }

    public int j(a aVar) {
        int paddingBottom = aVar.f15344a.getPaddingBottom();
        View view = aVar.f15344a;
        return view instanceof TextView ? paddingBottom + ((int) i((TextView) view, this.f15374c)) : paddingBottom;
    }

    public void k(a aVar) {
        if (this.f15376e) {
            View view = aVar.f15344a;
            float f9 = aVar.f15379e;
            view.setAlpha(f9 + (aVar.f15377c * (1.0f - f9)));
        }
    }

    public void l(boolean z9) {
        this.f15375d = z9;
    }

    public final void m(a aVar, float f9) {
        aVar.f15377c = f9;
        k(aVar);
    }
}
