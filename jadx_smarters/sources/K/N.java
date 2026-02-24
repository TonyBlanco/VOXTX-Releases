package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import c.AbstractC1238a;
import f.AbstractC1752c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class N extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f43147a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f43153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public P.S f43157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public T.f f43158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f43159n;

    public static class a {
        public static void a(View view, float f9, float f10) {
            view.drawableHotspotChanged(f9, f10);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Method f43160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f43161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f43162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f43163d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f43160a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f43161b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f43162c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f43163d = true;
            } catch (NoSuchMethodException e9) {
                e9.printStackTrace();
            }
        }

        public static boolean a() {
            return f43163d;
        }

        public static void b(N n9, int i9, View view) {
            try {
                f43160a.invoke(n9, Integer.valueOf(i9), view, Boolean.FALSE, -1, -1);
                f43161b.invoke(n9, Integer.valueOf(i9));
                f43162c.invoke(n9, Integer.valueOf(i9));
            } catch (IllegalAccessException | InvocationTargetException e9) {
                e9.printStackTrace();
            }
        }
    }

    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z9) {
            absListView.setSelectedChildViewEnabled(z9);
        }
    }

    public static class d extends AbstractC1752c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f43164c;

        public d(Drawable drawable) {
            super(drawable);
            this.f43164c = true;
        }

        public void b(boolean z9) {
            this.f43164c = z9;
        }

        @Override // f.AbstractC1752c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f43164c) {
                super.draw(canvas);
            }
        }

        @Override // f.AbstractC1752c, android.graphics.drawable.Drawable
        public void setHotspot(float f9, float f10) {
            if (this.f43164c) {
                super.setHotspot(f9, f10);
            }
        }

        @Override // f.AbstractC1752c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i9, int i10, int i11, int i12) {
            if (this.f43164c) {
                super.setHotspotBounds(i9, i10, i11, i12);
            }
        }

        @Override // f.AbstractC1752c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f43164c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // f.AbstractC1752c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z9, boolean z10) {
            if (this.f43164c) {
                return super.setVisible(z9, z10);
            }
            return false;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f43165a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                e9.printStackTrace();
            }
            f43165a = declaredField;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f43165a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z9) {
            Field field = f43165a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z9));
                } catch (IllegalAccessException e9) {
                    e9.printStackTrace();
                }
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public void a() {
            N n9 = N.this;
            n9.f43159n = null;
            n9.removeCallbacks(this);
        }

        public void b() {
            N.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            N n9 = N.this;
            n9.f43159n = null;
            n9.drawableStateChanged();
        }
    }

    public N(Context context, boolean z9) {
        super(context, null, AbstractC1238a.f17724A);
        this.f43147a = new Rect();
        this.f43148c = 0;
        this.f43149d = 0;
        this.f43150e = 0;
        this.f43151f = 0;
        this.f43155j = z9;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f43156k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f43152g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        P.S s9 = this.f43157l;
        if (s9 != null) {
            s9.c();
            this.f43157l = null;
        }
    }

    public final void b(View view, int i9) {
        performItemClick(view, i9, getItemIdAtPosition(i9));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f43147a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f43147a);
        selector.draw(canvas);
    }

    public int d(int i9, int i10, int i11, int i12, int i13) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < count) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i17 = layoutParams.height;
            view.measure(i9, i17 > 0 ? View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i12) {
                return (i13 < 0 || i14 <= i13 || i16 <= 0 || measuredHeight == i12) ? i12 : i16;
            }
            if (i13 >= 0 && i14 >= i13) {
                i16 = measuredHeight;
            }
            i14++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f43159n != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            T.f r9 = r7.f43158m
            if (r9 != 0) goto L5a
            T.f r9 = new T.f
            r9.<init>(r7)
            r7.f43158m = r9
        L5a:
            T.f r9 = r7.f43158m
            r9.m(r1)
            T.f r9 = r7.f43158m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            T.f r8 = r7.f43158m
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k.N.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i9, View view) {
        Rect rect = this.f43147a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f43148c;
        rect.top -= this.f43149d;
        rect.right += this.f43150e;
        rect.bottom += this.f43151f;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i9 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void g(int i9, View view) {
        Drawable selector = getSelector();
        boolean z9 = (selector == null || i9 == -1) ? false : true;
        if (z9) {
            selector.setVisible(false, false);
        }
        f(i9, view);
        if (z9) {
            Rect rect = this.f43147a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            H.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    public final void h(int i9, View view, float f9, float f10) {
        g(i9, view);
        Drawable selector = getSelector();
        if (selector == null || i9 == -1) {
            return;
        }
        H.a.k(selector, f9, f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f43155j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f43155j || super.hasWindowFocus();
    }

    public final void i(View view, int i9, float f9, float f10) {
        View childAt;
        this.f43156k = true;
        a.a(this, f9, f10);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i10 = this.f43152g;
        if (i10 != -1 && (childAt = getChildAt(i10 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f43152g = i9;
        a.a(view, f9 - view.getLeft(), f10 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i9, view, f9, f10);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f43155j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f43155j && this.f43154i) || super.isInTouchMode();
    }

    public final void j(boolean z9) {
        d dVar = this.f43153h;
        if (dVar != null) {
            dVar.b(z9);
        }
    }

    public final boolean k() {
        return L.a.d() ? c.a(this) : e.a(this);
    }

    public final void l(boolean z9) {
        if (L.a.d()) {
            c.b(this, z9);
        } else {
            e.b(this, z9);
        }
    }

    public final boolean m() {
        return this.f43156k;
    }

    public final void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f43159n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f43159n == null) {
            f fVar = new f();
            this.f43159n = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i9 < 30 || !b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, iPointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f43152g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f43159n;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z9) {
        this.f43154i = z9;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f43153h = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f43148c = rect.left;
        this.f43149d = rect.top;
        this.f43150e = rect.right;
        this.f43151f = rect.bottom;
    }
}
