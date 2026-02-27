package androidx.fragment.app;

import P.L;
import P.X;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.amplifyframework.core.model.ModelIdentifier;
import e0.AbstractC1729c;
import java.util.ArrayList;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f14936a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f14937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f14938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14939e;

    public FragmentContainerView(Context context) {
        super(context);
        this.f14939e = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i9) {
        String str;
        super(context, attributeSet, i9);
        this.f14939e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1729c.f40143h);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(AbstractC1729c.f40144i);
                str = "android:name";
            } else {
                str = Name.LABEL;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, m mVar) {
        String str;
        super(context, attributeSet);
        this.f14939e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1729c.f40143h);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(AbstractC1729c.f40144i) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(AbstractC1729c.f40145j);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentG0 = mVar.g0(id);
        if (classAttribute != null && fragmentG0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentA = mVar.q0().a(context.getClassLoader(), classAttribute);
            fragmentA.onInflate(context, attributeSet, (Bundle) null);
            mVar.m().w(true).d(this, fragmentA, string).l();
        }
        mVar.U0(this);
    }

    public final void a(View view) {
        ArrayList arrayList = this.f14937c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f14936a == null) {
            this.f14936a = new ArrayList();
        }
        this.f14936a.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (m.z0(view) != null) {
            super.addView(view, i9, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z9) {
        if (m.z0(view) != null) {
            return super.addViewInLayout(view, i9, layoutParams, z9);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        X xU = X.u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f14938d;
        X xU2 = onApplyWindowInsetsListener != null ? X.u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : L.e0(this, xU);
        if (!xU2.n()) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                L.i(getChildAt(i9), xU2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f14939e && this.f14936a != null) {
            for (int i9 = 0; i9 < this.f14936a.size(); i9++) {
                super.drawChild(canvas, (View) this.f14936a.get(i9), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j9) {
        ArrayList arrayList;
        if (!this.f14939e || (arrayList = this.f14936a) == null || arrayList.size() <= 0 || !this.f14936a.contains(view)) {
            return super.drawChild(canvas, view, j9);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.f14937c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f14936a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f14939e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z9) {
        if (z9) {
            a(view);
        }
        super.removeDetachedView(view, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i9) {
        a(getChildAt(i9));
        super.removeViewAt(i9);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            a(getChildAt(i11));
        }
        super.removeViews(i9, i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            a(getChildAt(i11));
        }
        super.removeViewsInLayout(i9, i10);
    }

    public void setDrawDisappearingViewsLast(boolean z9) {
        this.f14939e = z9;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f14938d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f14937c == null) {
                this.f14937c = new ArrayList();
            }
            this.f14937c.add(view);
        }
        super.startViewTransition(view);
    }
}
