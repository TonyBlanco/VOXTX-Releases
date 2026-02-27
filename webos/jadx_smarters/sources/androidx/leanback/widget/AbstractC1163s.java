package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.C1158m;
import androidx.leanback.widget.r;

/* JADX INFO: renamed from: androidx.leanback.widget.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1163s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Rect f15771a = new Rect();

    public static int a(View view, r.a aVar, int i9) {
        View viewFindViewById;
        int iG;
        C1158m.e eVar = (C1158m.e) view.getLayoutParams();
        int i10 = aVar.f15765a;
        if (i10 == 0 || (viewFindViewById = view.findViewById(i10)) == null) {
            viewFindViewById = view;
        }
        int iT = aVar.f15767c;
        if (i9 != 0) {
            if (aVar.f15769e) {
                float f9 = aVar.f15768d;
                if (f9 == 0.0f) {
                    iT += viewFindViewById.getPaddingTop();
                } else if (f9 == 100.0f) {
                    iT -= viewFindViewById.getPaddingBottom();
                }
            }
            if (aVar.f15768d != -1.0f) {
                iT += (int) (((viewFindViewById == view ? eVar.t(viewFindViewById) : viewFindViewById.getHeight()) * aVar.f15768d) / 100.0f);
            }
            if (view != viewFindViewById) {
                Rect rect = f15771a;
                rect.top = iT;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect);
                iG = f15771a.top - eVar.G();
            } else {
                iG = iT;
            }
            return aVar.d() ? iG + viewFindViewById.getBaseline() : iG;
        }
        if (view.getLayoutDirection() == 1) {
            int iH = (viewFindViewById == view ? eVar.H(viewFindViewById) : viewFindViewById.getWidth()) - iT;
            if (aVar.f15769e) {
                float f10 = aVar.f15768d;
                if (f10 == 0.0f) {
                    iH -= viewFindViewById.getPaddingRight();
                } else if (f10 == 100.0f) {
                    iH += viewFindViewById.getPaddingLeft();
                }
            }
            if (aVar.f15768d != -1.0f) {
                iH -= (int) (((viewFindViewById == view ? eVar.H(viewFindViewById) : viewFindViewById.getWidth()) * aVar.f15768d) / 100.0f);
            }
            if (view == viewFindViewById) {
                return iH;
            }
            Rect rect2 = f15771a;
            rect2.right = iH;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect2);
            return f15771a.right + eVar.A();
        }
        if (aVar.f15769e) {
            float f11 = aVar.f15768d;
            if (f11 == 0.0f) {
                iT += viewFindViewById.getPaddingLeft();
            } else if (f11 == 100.0f) {
                iT -= viewFindViewById.getPaddingRight();
            }
        }
        if (aVar.f15768d != -1.0f) {
            iT += (int) (((viewFindViewById == view ? eVar.H(viewFindViewById) : viewFindViewById.getWidth()) * aVar.f15768d) / 100.0f);
        }
        int i11 = iT;
        if (view == viewFindViewById) {
            return i11;
        }
        Rect rect3 = f15771a;
        rect3.left = i11;
        ((ViewGroup) view).offsetDescendantRectToMyCoords(viewFindViewById, rect3);
        return f15771a.left - eVar.w();
    }
}
