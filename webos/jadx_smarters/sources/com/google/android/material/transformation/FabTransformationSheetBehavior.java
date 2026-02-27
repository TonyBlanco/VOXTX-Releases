package com.google.android.material.transformation;

import P.L;
import R4.a;
import S4.f;
import S4.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f27831i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View view, View view2, boolean z9, boolean z10) {
        b0(view2, z9);
        return super.H(view, view2, z9, z10);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.b Z(Context context, boolean z9) {
        int i9 = z9 ? a.f8654d : a.f8653c;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f27824a = f.c(context, i9);
        bVar.f27825b = new h(17, 0.0f, 0.0f);
        return bVar;
    }

    public final void b0(View view, boolean z9) {
        int iIntValue;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z9) {
                this.f27831i = new HashMap(childCount);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = coordinatorLayout.getChildAt(i9);
                boolean z10 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z10) {
                    Map map = this.f27831i;
                    if (z9) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        iIntValue = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        iIntValue = ((Integer) this.f27831i.get(childAt)).intValue();
                    }
                    L.C0(childAt, iIntValue);
                }
            }
            if (z9) {
                return;
            }
            this.f27831i = null;
        }
    }
}
