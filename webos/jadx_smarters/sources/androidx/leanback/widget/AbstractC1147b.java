package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.leanback.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1147b extends RecyclerView {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final C1158m f15622M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f15623N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f15624O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public RecyclerView.l f15625P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public RecyclerView.w f15626Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public e f15627R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f15628S0;

    /* JADX INFO: renamed from: androidx.leanback.widget.b$a */
    public class a implements RecyclerView.w {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.w
        public void a(RecyclerView.D d9) {
            AbstractC1147b.this.f15622M0.F3(d9);
            RecyclerView.w wVar = AbstractC1147b.this.f15626Q0;
            if (wVar != null) {
                wVar.a(d9);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0176b {
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.b$c */
    public interface c {
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.b$d */
    public interface d {
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.b$e */
    public interface e {
        boolean a(KeyEvent keyEvent);
    }

    public AbstractC1147b(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15623N0 = true;
        this.f15624O0 = true;
        this.f15628S0 = 4;
        C1158m c1158m = new C1158m(this);
        this.f15622M0 = c1158m;
        setLayoutManager(c1158m);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((androidx.recyclerview.widget.n) getItemAnimator()).R(false);
        super.setRecyclerListener(new a());
    }

    public void C1(View view, int[] iArr) {
        this.f15622M0.j3(view, iArr);
    }

    public void D1(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.l.f41071A);
        this.f15622M0.a4(typedArrayObtainStyledAttributes.getBoolean(g0.l.f41076F, false), typedArrayObtainStyledAttributes.getBoolean(g0.l.f41075E, false));
        this.f15622M0.b4(typedArrayObtainStyledAttributes.getBoolean(g0.l.f41078H, true), typedArrayObtainStyledAttributes.getBoolean(g0.l.f41077G, true));
        this.f15622M0.y4(typedArrayObtainStyledAttributes.getDimensionPixelSize(g0.l.f41074D, typedArrayObtainStyledAttributes.getDimensionPixelSize(g0.l.f41080J, 0)));
        this.f15622M0.f4(typedArrayObtainStyledAttributes.getDimensionPixelSize(g0.l.f41073C, typedArrayObtainStyledAttributes.getDimensionPixelSize(g0.l.f41079I, 0)));
        if (typedArrayObtainStyledAttributes.hasValue(g0.l.f41072B)) {
            setGravity(typedArrayObtainStyledAttributes.getInt(g0.l.f41072B, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean E1() {
        return isChildrenDrawingOrderEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        e eVar = this.f15627R0;
        return eVar != null && eVar.a(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public View focusSearch(int i9) {
        if (isFocused()) {
            C1158m c1158m = this.f15622M0;
            View viewA0 = c1158m.a0(c1158m.U2());
            if (viewA0 != null) {
                return focusSearch(viewA0, i9);
            }
        }
        return super.focusSearch(i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public int getChildDrawingOrder(int i9, int i10) {
        return this.f15622M0.B2(this, i9, i10);
    }

    public int getExtraLayoutSpace() {
        return this.f15622M0.E2();
    }

    public int getFocusScrollStrategy() {
        return this.f15622M0.G2();
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.f15622M0.H2();
    }

    public int getHorizontalSpacing() {
        return this.f15622M0.H2();
    }

    public int getInitialPrefetchItemCount() {
        return this.f15628S0;
    }

    public int getItemAlignmentOffset() {
        return this.f15622M0.I2();
    }

    public float getItemAlignmentOffsetPercent() {
        return this.f15622M0.J2();
    }

    public int getItemAlignmentViewId() {
        return this.f15622M0.K2();
    }

    public e getOnUnhandledKeyListener() {
        return this.f15627R0;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.f15622M0.f15706f0.c();
    }

    public final int getSaveChildrenPolicy() {
        return this.f15622M0.f15706f0.d();
    }

    public int getSelectedPosition() {
        return this.f15622M0.U2();
    }

    public int getSelectedSubPosition() {
        return this.f15622M0.Y2();
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.f15622M0.a3();
    }

    public int getVerticalSpacing() {
        return this.f15622M0.a3();
    }

    public int getWindowAlignment() {
        return this.f15622M0.k3();
    }

    public int getWindowAlignmentOffset() {
        return this.f15622M0.l3();
    }

    public float getWindowAlignmentOffsetPercent() {
        return this.f15622M0.m3();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f15624O0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void m1(int i9) {
        if (this.f15622M0.x3()) {
            this.f15622M0.x4(i9, 0, 0);
        } else {
            super.m1(i9);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        this.f15622M0.G3(z9, i9, rect);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        return this.f15622M0.n3(this, i9, rect);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i9) {
        this.f15622M0.H3(i9);
    }

    public void setAnimateChildLayout(boolean z9) {
        RecyclerView.l lVar;
        if (this.f15623N0 != z9) {
            this.f15623N0 = z9;
            if (z9) {
                lVar = this.f15625P0;
            } else {
                this.f15625P0 = getItemAnimator();
                lVar = null;
            }
            super.setItemAnimator(lVar);
        }
    }

    public void setChildrenVisibility(int i9) {
        this.f15622M0.Y3(i9);
    }

    public void setExtraLayoutSpace(int i9) {
        this.f15622M0.Z3(i9);
    }

    public void setFocusDrawingOrderEnabled(boolean z9) {
        super.setChildrenDrawingOrderEnabled(z9);
    }

    public void setFocusScrollStrategy(int i9) {
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.f15622M0.c4(i9);
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z9) {
        setDescendantFocusability(z9 ? 393216 : 262144);
        this.f15622M0.d4(z9);
    }

    public void setGravity(int i9) {
        this.f15622M0.e4(i9);
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z9) {
        this.f15624O0 = z9;
    }

    @Deprecated
    public void setHorizontalMargin(int i9) {
        setHorizontalSpacing(i9);
    }

    public void setHorizontalSpacing(int i9) {
        this.f15622M0.f4(i9);
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i9) {
        this.f15628S0 = i9;
    }

    public void setItemAlignmentOffset(int i9) {
        this.f15622M0.g4(i9);
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f9) {
        this.f15622M0.h4(f9);
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z9) {
        this.f15622M0.i4(z9);
        requestLayout();
    }

    public void setItemAlignmentViewId(int i9) {
        this.f15622M0.j4(i9);
    }

    @Deprecated
    public void setItemMargin(int i9) {
        setItemSpacing(i9);
    }

    public void setItemSpacing(int i9) {
        this.f15622M0.k4(i9);
        requestLayout();
    }

    public void setLayoutEnabled(boolean z9) {
        this.f15622M0.l4(z9);
    }

    public void setOnChildLaidOutListener(InterfaceC1170z interfaceC1170z) {
        this.f15622M0.n4(interfaceC1170z);
    }

    public void setOnChildSelectedListener(A a9) {
        this.f15622M0.o4(a9);
    }

    public void setOnChildViewHolderSelectedListener(B b9) {
        this.f15622M0.p4(b9);
    }

    public void setOnKeyInterceptListener(InterfaceC0176b interfaceC0176b) {
    }

    public void setOnMotionInterceptListener(c cVar) {
    }

    public void setOnTouchInterceptListener(d dVar) {
    }

    public void setOnUnhandledKeyListener(e eVar) {
        this.f15627R0 = eVar;
    }

    public void setPruneChild(boolean z9) {
        this.f15622M0.r4(z9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.w wVar) {
        this.f15626Q0 = wVar;
    }

    public final void setSaveChildrenLimitNumber(int i9) {
        this.f15622M0.f15706f0.m(i9);
    }

    public final void setSaveChildrenPolicy(int i9) {
        this.f15622M0.f15706f0.n(i9);
    }

    public void setScrollEnabled(boolean z9) {
        this.f15622M0.t4(z9);
    }

    public void setSelectedPosition(int i9) {
        this.f15622M0.u4(i9, 0);
    }

    public void setSelectedPositionSmooth(int i9) {
        this.f15622M0.w4(i9);
    }

    @Deprecated
    public void setVerticalMargin(int i9) {
        setVerticalSpacing(i9);
    }

    public void setVerticalSpacing(int i9) {
        this.f15622M0.y4(i9);
        requestLayout();
    }

    public void setWindowAlignment(int i9) {
        this.f15622M0.z4(i9);
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i9) {
        this.f15622M0.A4(i9);
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f9) {
        this.f15622M0.B4(f9);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z9) {
        this.f15622M0.f15701a0.a().u(z9);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z9) {
        this.f15622M0.f15701a0.a().v(z9);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void u1(int i9) {
        if (this.f15622M0.x3()) {
            this.f15622M0.x4(i9, 0, 0);
        } else {
            super.u1(i9);
        }
    }
}
