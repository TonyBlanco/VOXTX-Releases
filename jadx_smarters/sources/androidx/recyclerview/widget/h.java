package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public class h extends RecyclerView.z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f17072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f17073l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f17075n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f17070i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f17071j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17074m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17076o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17077p = 0;

    public h(Context context) {
        this.f17073l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f17074m) {
            this.f17075n = v(this.f17073l);
            this.f17074m = true;
        }
        return this.f17075n;
    }

    public int B() {
        PointF pointF = this.f17072k;
        if (pointF != null) {
            float f9 = pointF.y;
            if (f9 != 0.0f) {
                return f9 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void C(RecyclerView.z.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f17072k = pointFA;
        this.f17076o = (int) (pointFA.x * 10000.0f);
        this.f17077p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f17076o * 1.2f), (int) (this.f17077p * 1.2f), (int) (x(Constants.MAXIMUM_UPLOAD_PARTS) * 1.2f), this.f17070i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void l(int i9, int i10, RecyclerView.A a9, RecyclerView.z.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f17076o = y(this.f17076o, i9);
        int iY = y(this.f17077p, i10);
        this.f17077p = iY;
        if (this.f17076o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void n() {
        this.f17077p = 0;
        this.f17076o = 0;
        this.f17072k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public void o(View view, RecyclerView.A a9, RecyclerView.z.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f17071j);
        }
    }

    public int s(int i9, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i9;
        }
        if (i13 != 0) {
            if (i13 == 1) {
                return i12 - i10;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i14 = i11 - i9;
        if (i14 > 0) {
            return i14;
        }
        int i15 = i12 - i10;
        if (i15 < 0) {
            return i15;
        }
        return 0;
    }

    public int t(View view, int i9) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.H()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(oVarE.o0(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, oVarE.r0(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, oVarE.o(), oVarE.I0() - oVarE.k(), i9);
    }

    public int u(View view, int i9) {
        RecyclerView.o oVarE = e();
        if (oVarE == null || !oVarE.I()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(oVarE.s0(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, oVarE.m0(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, oVarE.n(), oVarE.u0() - oVarE.b(), i9);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i9) {
        return (int) Math.ceil(((double) x(i9)) / 0.3356d);
    }

    public int x(int i9) {
        return (int) Math.ceil(Math.abs(i9) * A());
    }

    public final int y(int i9, int i10) {
        int i11 = i9 - i10;
        if (i9 * i11 <= 0) {
            return 0;
        }
        return i11;
    }

    public int z() {
        PointF pointF = this.f17072k;
        if (pointF != null) {
            float f9 = pointF.x;
            if (f9 != 0.0f) {
                return f9 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
