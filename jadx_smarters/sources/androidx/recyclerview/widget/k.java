package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class k extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f17082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f17083e;

    public class a extends h {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.z
        public void o(View view, RecyclerView.A a9, RecyclerView.z.a aVar) {
            k kVar = k.this;
            int[] iArrC = kVar.c(kVar.f17090a.getLayoutManager(), view);
            int i9 = iArrC[0];
            int i10 = iArrC[1];
            int iW = w(Math.max(Math.abs(i9), Math.abs(i10)));
            if (iW > 0) {
                aVar.d(i9, i10, iW, this.f17071j);
            }
        }

        @Override // androidx.recyclerview.widget.h
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.h
        public int x(int i9) {
            return Math.min(100, super.x(i9));
        }
    }

    @Override // androidx.recyclerview.widget.o
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.H()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.I()) {
            iArr[1] = l(oVar, view, p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.o
    public h e(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new a(this.f17090a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.o
    public View g(RecyclerView.o oVar) {
        j jVarN;
        if (oVar.I()) {
            jVarN = p(oVar);
        } else {
            if (!oVar.H()) {
                return null;
            }
            jVarN = n(oVar);
        }
        return m(oVar, jVarN);
    }

    @Override // androidx.recyclerview.widget.o
    public int h(RecyclerView.o oVar, int i9, int i10) {
        j jVarO;
        int iW0 = oVar.w0();
        if (iW0 == 0 || (jVarO = o(oVar)) == null) {
            return -1;
        }
        int iH0 = oVar.h0();
        View view = null;
        View view2 = null;
        int i11 = Integer.MIN_VALUE;
        int i12 = a.e.API_PRIORITY_OTHER;
        for (int i13 = 0; i13 < iH0; i13++) {
            View viewG0 = oVar.g0(i13);
            if (viewG0 != null) {
                int iL = l(oVar, viewG0, jVarO);
                if (iL <= 0 && iL > i11) {
                    view2 = viewG0;
                    i11 = iL;
                }
                if (iL >= 0 && iL < i12) {
                    view = viewG0;
                    i12 = iL;
                }
            }
        }
        boolean zQ = q(oVar, i9, i10);
        if (zQ && view != null) {
            return oVar.B0(view);
        }
        if (!zQ && view2 != null) {
            return oVar.B0(view2);
        }
        if (zQ) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iB0 = oVar.B0(view) + (r(oVar) == zQ ? -1 : 1);
        if (iB0 < 0 || iB0 >= iW0) {
            return -1;
        }
        return iB0;
    }

    public final int l(RecyclerView.o oVar, View view, j jVar) {
        return (jVar.g(view) + (jVar.e(view) / 2)) - (jVar.m() + (jVar.n() / 2));
    }

    public final View m(RecyclerView.o oVar, j jVar) {
        int iH0 = oVar.h0();
        View view = null;
        if (iH0 == 0) {
            return null;
        }
        int iM = jVar.m() + (jVar.n() / 2);
        int i9 = a.e.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < iH0; i10++) {
            View viewG0 = oVar.g0(i10);
            int iAbs = Math.abs((jVar.g(viewG0) + (jVar.e(viewG0) / 2)) - iM);
            if (iAbs < i9) {
                view = viewG0;
                i9 = iAbs;
            }
        }
        return view;
    }

    public final j n(RecyclerView.o oVar) {
        j jVar = this.f17083e;
        if (jVar == null || jVar.f17079a != oVar) {
            this.f17083e = j.a(oVar);
        }
        return this.f17083e;
    }

    public final j o(RecyclerView.o oVar) {
        if (oVar.I()) {
            return p(oVar);
        }
        if (oVar.H()) {
            return n(oVar);
        }
        return null;
    }

    public final j p(RecyclerView.o oVar) {
        j jVar = this.f17082d;
        if (jVar == null || jVar.f17079a != oVar) {
            this.f17082d = j.c(oVar);
        }
        return this.f17082d;
    }

    public final boolean q(RecyclerView.o oVar, int i9, int i10) {
        return oVar.H() ? i9 > 0 : i10 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r(RecyclerView.o oVar) {
        PointF pointFE;
        int iW0 = oVar.w0();
        if (!(oVar instanceof RecyclerView.z.b) || (pointFE = ((RecyclerView.z.b) oVar).e(iW0 - 1)) == null) {
            return false;
        }
        return pointFE.x < 0.0f || pointFE.y < 0.0f;
    }
}
