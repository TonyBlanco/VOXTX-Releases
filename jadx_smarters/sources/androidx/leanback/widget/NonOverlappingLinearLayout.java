package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15408a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15410d;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15408a = false;
        this.f15410d = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void focusableViewAvailable(View view) {
        int iIndexOfChild;
        if (!this.f15409c) {
            super.focusableViewAvailable(view);
            return;
        }
        for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
            if (view2.getParent() == this) {
                iIndexOfChild = indexOfChild(view2);
                break;
            }
        }
        iIndexOfChild = -1;
        if (iIndexOfChild != -1) {
            ((ArrayList) this.f15410d.get(iIndexOfChild)).add(view);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int i13 = 0;
        try {
            boolean z10 = this.f15408a && getOrientation() == 0 && getLayoutDirection() == 1;
            this.f15409c = z10;
            if (z10) {
                while (this.f15410d.size() > getChildCount()) {
                    ArrayList arrayList = this.f15410d;
                    arrayList.remove(arrayList.size() - 1);
                }
                while (this.f15410d.size() < getChildCount()) {
                    this.f15410d.add(new ArrayList());
                }
            }
            super.onLayout(z9, i9, i10, i11, i12);
            if (this.f15409c) {
                for (int i14 = 0; i14 < this.f15410d.size(); i14++) {
                    for (int i15 = 0; i15 < ((ArrayList) this.f15410d.get(i14)).size(); i15++) {
                        super.focusableViewAvailable((View) ((ArrayList) this.f15410d.get(i14)).get(i15));
                    }
                }
            }
            if (this.f15409c) {
                this.f15409c = false;
                while (i13 < this.f15410d.size()) {
                    ((ArrayList) this.f15410d.get(i13)).clear();
                    i13++;
                }
            }
        } catch (Throwable th) {
            if (this.f15409c) {
                this.f15409c = false;
                while (i13 < this.f15410d.size()) {
                    ((ArrayList) this.f15410d.get(i13)).clear();
                    i13++;
                }
            }
            throw th;
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z9) {
        this.f15408a = z9;
    }
}
