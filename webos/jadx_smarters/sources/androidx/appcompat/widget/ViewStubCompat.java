package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c.j;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14165a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f14167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f14168e;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f14165a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f18040Y3, i9, 0);
        this.f14166c = typedArrayObtainStyledAttributes.getResourceId(j.f18057b4, -1);
        this.f14165a = typedArrayObtainStyledAttributes.getResourceId(j.f18051a4, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(j.f18045Z3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f14165a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f14168e;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f14165a, viewGroup, false);
        int i9 = this.f14166c;
        if (i9 != -1) {
            viewInflate.setId(i9);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f14167d = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f14166c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f14168e;
    }

    public int getLayoutResource() {
        return this.f14165a;
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i9) {
        this.f14166c = i9;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f14168e = layoutInflater;
    }

    public void setLayoutResource(int i9) {
        this.f14165a = i9;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        WeakReference weakReference = this.f14167d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i9);
            return;
        }
        super.setVisibility(i9);
        if (i9 == 0 || i9 == 4) {
            a();
        }
    }
}
