package P;

import P.C0959a;
import P.X;
import Q.C;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import d.AbstractC1617D;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f6744c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ThreadLocal f6746e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f6742a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakHashMap f6743b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f6745d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f6747f = {C.c.f801b, C.c.f802c, C.c.f813n, C.c.f824y, C.c.f782B, C.c.f783C, C.c.f784D, C.c.f785E, C.c.f786F, C.c.f787G, C.c.f803d, C.c.f804e, C.c.f805f, C.c.f806g, C.c.f807h, C.c.f808i, C.c.f809j, C.c.f810k, C.c.f811l, C.c.f812m, C.c.f814o, C.c.f815p, C.c.f816q, C.c.f817r, C.c.f818s, C.c.f819t, C.c.f820u, C.c.f821v, C.c.f822w, C.c.f823x, C.c.f825z, C.c.f781A};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final G f6748g = new G() { // from class: P.K
        @Override // P.G
        public final C0962d a(C0962d c0962d) {
            return L.a0(c0962d);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f6749h = new e();

    public class a extends f {
        public a(int i9, Class cls, int i10) {
            super(i9, cls, i10);
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(q.d(view));
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            q.i(view, bool.booleanValue());
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class b extends f {
        public b(int i9, Class cls, int i10, int i11) {
            super(i9, cls, i10, i11);
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return q.b(view);
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            q.h(view, charSequence);
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class c extends f {
        public c(int i9, Class cls, int i10, int i11) {
            super(i9, cls, i10, i11);
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return s.a(view);
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            s.b(view, charSequence);
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends f {
        public d(int i9, Class cls, int i10) {
            super(i9, cls, i10);
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(q.c(view));
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            q.g(view, bool.booleanValue());
        }

        @Override // P.L.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap f6750a = new WeakHashMap();

        public void a(View view) {
            this.f6750a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        public final void b(View view, boolean z9) {
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (z9 != z10) {
                L.b0(view, z10 ? 16 : 32);
                this.f6750a.put(view, Boolean.valueOf(z10));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f6750a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f6750a.entrySet()) {
                    b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f6752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6754d;

        public f(int i9, Class cls, int i10) {
            this(i9, cls, 0, i10);
        }

        public f(int i9, Class cls, int i10, int i11) {
            this.f6751a = i9;
            this.f6752b = cls;
            this.f6754d = i10;
            this.f6753c = i11;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return true;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.f6753c;
        }

        public abstract Object d(View view);

        public abstract void e(View view, Object obj);

        public Object f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            Object tag = view.getTag(this.f6751a);
            if (this.f6752b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void g(View view, Object obj) {
            if (c()) {
                e(view, obj);
            } else if (b() && h(f(view), obj)) {
                L.l(view);
                view.setTag(this.f6751a, obj);
                L.b0(view, this.f6754d);
            }
        }

        public abstract boolean h(Object obj, Object obj2);
    }

    public static class g {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class h {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i9, Bundle bundle) {
            return view.performAccessibilityAction(i9, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i9, int i10, int i11, int i12) {
            view.postInvalidateOnAnimation(i9, i10, i11, i12);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j9) {
            view.postOnAnimationDelayed(runnable, j9);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z9) {
            view.setHasTransientState(z9);
        }

        public static void s(View view, int i9) {
            view.setImportantForAccessibility(i9);
        }
    }

    public static class i {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i9) {
            view.setLabelFor(i9);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i9) {
            view.setLayoutDirection(i9);
        }

        public static void k(View view, int i9, int i10, int i11, int i12) {
            view.setPaddingRelative(i9, i10, i11, i12);
        }
    }

    public static class j {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class k {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i9) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i9);
        }

        public static void f(View view, int i9) {
            view.setAccessibilityLiveRegion(i9);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i9) {
            accessibilityEvent.setContentChangeTypes(i9);
        }
    }

    public static class l {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class m {

        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public X f6755a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f6756b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ E f6757c;

            public a(View view, E e9) {
                this.f6756b = view;
                this.f6757c = e9;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                X xV = X.v(windowInsets, view);
                int i9 = Build.VERSION.SDK_INT;
                if (i9 < 30) {
                    m.a(windowInsets, this.f6756b);
                    if (xV.equals(this.f6755a)) {
                        return this.f6757c.a(view, xV).t();
                    }
                }
                this.f6755a = xV;
                X xA = this.f6757c.a(view, xV);
                if (i9 >= 30) {
                    return xA.t();
                }
                L.p0(view);
                return xA.t();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C.c.f799S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static X b(View view, X x9, Rect rect) {
            WindowInsets windowInsetsT = x9.t();
            if (windowInsetsT != null) {
                return X.v(view.computeSystemWindowInsets(windowInsetsT, rect), view);
            }
            rect.setEmpty();
            return x9;
        }

        public static boolean c(View view, float f9, float f10, boolean z9) {
            return view.dispatchNestedFling(f9, f10, z9);
        }

        public static boolean d(View view, float f9, float f10) {
            return view.dispatchNestedPreFling(f9, f10);
        }

        public static boolean e(View view, int i9, int i10, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i9, i10, iArr, iArr2);
        }

        public static boolean f(View view, int i9, int i10, int i11, int i12, int[] iArr) {
            return view.dispatchNestedScroll(i9, i10, i11, i12, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static X j(View view) {
            return X.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f9) {
            view.setElevation(f9);
        }

        public static void t(View view, boolean z9) {
            view.setNestedScrollingEnabled(z9);
        }

        public static void u(View view, E e9) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C.c.f792L, e9);
            }
            if (e9 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C.c.f799S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, e9));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f9) {
            view.setTranslationZ(f9);
        }

        public static void x(View view, float f9) {
            view.setZ(f9);
        }

        public static boolean y(View view, int i9) {
            return view.startNestedScroll(i9);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class n {
        public static X a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            X xU = X.u(rootWindowInsets);
            xU.r(xU);
            xU.d(view.getRootView());
            return xU;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i9) {
            view.setScrollIndicators(i9);
        }

        public static void d(View view, int i9, int i10) {
            view.setScrollIndicators(i9, i10);
        }
    }

    public static class o {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i9) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i9);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static class p {
        public static void a(View view, Collection<View> collection, int i9) {
            view.addKeyboardNavigationClusters(collection, i9);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i9) {
            return view.keyboardNavigationClusterSearch(view2, i9);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z9) {
            view.setFocusedByDefault(z9);
        }

        public static void l(View view, int i9) {
            view.setImportantForAutofill(i9);
        }

        public static void m(View view, boolean z9) {
            view.setKeyboardNavigationCluster(z9);
        }

        public static void n(View view, int i9) {
            view.setNextClusterForwardId(i9);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class q {
        public static void a(View view, final v vVar) {
            s.i iVar = (s.i) view.getTag(C.c.f798R);
            if (iVar == null) {
                iVar = new s.i();
                view.setTag(C.c.f798R, iVar);
            }
            Objects.requireNonNull(vVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(vVar) { // from class: P.M
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            iVar.put(vVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            s.i iVar = (s.i) view.getTag(C.c.f798R);
            if (iVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.get(vVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i9) {
            return (T) view.requireViewById(i9);
        }

        public static void g(View view, boolean z9) {
            view.setAccessibilityHeading(z9);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z9) {
            view.setScreenReaderFocusable(z9);
        }
    }

    public static class r {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i9, int i10) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i9, i10);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class s {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class t {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C0962d b(View view, C0962d c0962d) {
            ContentInfo contentInfoF = c0962d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c0962d : C0962d.g(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, F f9) {
            if (f9 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(f9));
            }
        }
    }

    public static final class u implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final F f6758a;

        public u(F f9) {
            this.f6758a = f9;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0962d c0962dG = C0962d.g(contentInfo);
            C0962d c0962dA = this.f6758a.a(view, c0962dG);
            if (c0962dA == null) {
                return null;
            }
            return c0962dA == c0962dG ? contentInfo : c0962dA.f();
        }
    }

    public interface v {
    }

    public static class w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ArrayList f6759d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakHashMap f6760a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray f6761b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference f6762c = null;

        public static w a(View view) {
            w wVar = (w) view.getTag(C.c.f797Q);
            if (wVar != null) {
                return wVar;
            }
            w wVar2 = new w();
            view.setTag(C.c.f797Q, wVar2);
            return wVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f6760a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray d() {
            if (this.f6761b == null) {
                this.f6761b = new SparseArray();
            }
            return this.f6761b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(C.c.f798R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            AbstractC1617D.a(arrayList.get(size));
            throw null;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f6762c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f6762c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && L.V(view)) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap weakHashMap = this.f6760a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f6759d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f6760a == null) {
                        this.f6760a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f6759d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f6760a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f6760a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static G A(View view) {
        return view instanceof G ? (G) view : f6748g;
    }

    public static void A0(View view, float f9) {
        m.s(view, f9);
    }

    public static boolean B(View view) {
        return h.b(view);
    }

    public static void B0(View view, boolean z9) {
        h.r(view, z9);
    }

    public static int C(View view) {
        return h.c(view);
    }

    public static void C0(View view, int i9) {
        h.s(view, i9);
    }

    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.b(view);
        }
        return 0;
    }

    public static void D0(View view, int i9) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.l(view, i9);
        }
    }

    public static int E(View view) {
        return i.d(view);
    }

    public static void E0(View view, E e9) {
        m.u(view, e9);
    }

    public static int F(View view) {
        return h.d(view);
    }

    public static void F0(View view, int i9, int i10, int i11, int i12) {
        i.k(view, i9, i10, i11, i12);
    }

    public static int G(View view) {
        return h.e(view);
    }

    public static void G0(View view, I i9) {
        if (Build.VERSION.SDK_INT >= 24) {
            o.d(view, J.a(i9 != null ? i9.a() : null));
        }
    }

    public static String[] H(View view) {
        return Build.VERSION.SDK_INT >= 31 ? t.a(view) : (String[]) view.getTag(C.c.f794N);
    }

    public static void H0(View view, boolean z9) {
        r0().g(view, Boolean.valueOf(z9));
    }

    public static int I(View view) {
        return i.e(view);
    }

    public static void I0(View view, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i9, i10);
        }
    }

    public static int J(View view) {
        return i.f(view);
    }

    public static void J0(View view, CharSequence charSequence) {
        P0().g(view, charSequence);
    }

    public static X K(View view) {
        return Build.VERSION.SDK_INT >= 23 ? n.a(view) : m.j(view);
    }

    public static void K0(View view, String str) {
        m.v(view, str);
    }

    public static CharSequence L(View view) {
        return (CharSequence) P0().f(view);
    }

    public static void L0(View view, float f9) {
        view.setTranslationX(f9);
    }

    public static String M(View view) {
        return m.k(view);
    }

    public static void M0(View view, float f9) {
        view.setTranslationY(f9);
    }

    public static float N(View view) {
        return view.getTranslationY();
    }

    public static void N0(View view) {
        if (C(view) == 0) {
            C0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C((View) parent) == 4) {
                C0(view, 2);
                return;
            }
        }
    }

    public static int O(View view) {
        return h.g(view);
    }

    public static void O0(View view, float f9) {
        m.x(view, f9);
    }

    public static float P(View view) {
        return m.m(view);
    }

    public static f P0() {
        return new c(C.c.f796P, CharSequence.class, 64, 30);
    }

    public static boolean Q(View view) {
        return o(view) != null;
    }

    public static void Q0(View view) {
        m.z(view);
    }

    public static boolean R(View view) {
        return g.a(view);
    }

    public static void R0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean S(View view) {
        return h.h(view);
    }

    public static boolean T(View view) {
        return h.i(view);
    }

    public static boolean U(View view) {
        Boolean bool = (Boolean) b().f(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean V(View view) {
        return k.b(view);
    }

    public static boolean W(View view) {
        return k.c(view);
    }

    public static boolean X(View view) {
        return m.p(view);
    }

    public static boolean Y(View view) {
        return i.g(view);
    }

    public static boolean Z(View view) {
        Boolean bool = (Boolean) r0().f(view);
        return bool != null && bool.booleanValue();
    }

    public static /* synthetic */ C0962d a0(C0962d c0962d) {
        return c0962d;
    }

    public static f b() {
        return new d(C.c.f790J, Boolean.class, 28);
    }

    public static void b0(View view, int i9) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z9 = r(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (q(view) != 0 || z9) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z9 ? 32 : 2048);
                k.g(accessibilityEventObtain, i9);
                if (z9) {
                    accessibilityEventObtain.getText().add(r(view));
                    N0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i9 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                k.g(accessibilityEventObtain2, i9);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(r(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i9);
                } catch (AbstractMethodError e9) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e9);
                }
            }
        }
    }

    public static int c(View view, CharSequence charSequence, Q.F f9) {
        int iT = t(view, charSequence);
        if (iT != -1) {
            d(view, new C.a(iT, charSequence, f9));
        }
        return iT;
    }

    public static void c0(View view, int i9) {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i9);
            return;
        }
        Rect rectZ = z();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectZ.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z9 = !rectZ.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z9 = false;
        }
        f(view, i9);
        if (z9 && rectZ.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectZ);
        }
    }

    public static void d(View view, C.a aVar) {
        l(view);
        n0(aVar.b(), view);
        s(view).add(aVar);
        b0(view, 0);
    }

    public static void d0(View view, int i9) {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i9);
            return;
        }
        Rect rectZ = z();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectZ.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z9 = !rectZ.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z9 = false;
        }
        g(view, i9);
        if (z9 && rectZ.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectZ);
        }
    }

    public static S e(View view) {
        if (f6743b == null) {
            f6743b = new WeakHashMap();
        }
        S s9 = (S) f6743b.get(view);
        if (s9 != null) {
            return s9;
        }
        S s10 = new S(view);
        f6743b.put(view, s10);
        return s10;
    }

    public static X e0(View view, X x9) {
        WindowInsets windowInsetsT = x9.t();
        if (windowInsetsT != null) {
            WindowInsets windowInsetsB = l.b(view, windowInsetsT);
            if (!windowInsetsB.equals(windowInsetsT)) {
                return X.v(windowInsetsB, view);
            }
        }
        return x9;
    }

    public static void f(View view, int i9) {
        view.offsetLeftAndRight(i9);
        if (view.getVisibility() == 0) {
            R0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                R0((View) parent);
            }
        }
    }

    public static void f0(View view, Q.C c9) {
        view.onInitializeAccessibilityNodeInfo(c9.x0());
    }

    public static void g(View view, int i9) {
        view.offsetTopAndBottom(i9);
        if (view.getVisibility() == 0) {
            R0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                R0((View) parent);
            }
        }
    }

    public static f g0() {
        return new b(C.c.f791K, CharSequence.class, 8, 28);
    }

    public static X h(View view, X x9, Rect rect) {
        return m.b(view, x9, rect);
    }

    public static boolean h0(View view, int i9, Bundle bundle) {
        return h.j(view, i9, bundle);
    }

    public static X i(View view, X x9) {
        WindowInsets windowInsetsT = x9.t();
        if (windowInsetsT != null) {
            WindowInsets windowInsetsA = l.a(view, windowInsetsT);
            if (!windowInsetsA.equals(windowInsetsT)) {
                return X.v(windowInsetsA, view);
            }
        }
        return x9;
    }

    public static C0962d i0(View view, C0962d c0962d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0962d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.b(view, c0962d);
        }
        F f9 = (F) view.getTag(C.c.f793M);
        if (f9 == null) {
            return A(view).a(c0962d);
        }
        C0962d c0962dA = f9.a(view, c0962d);
        if (c0962dA == null) {
            return null;
        }
        return A(view).a(c0962dA);
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).b(view, keyEvent);
    }

    public static void j0(View view) {
        h.k(view);
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.a(view).f(keyEvent);
    }

    public static void k0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static void l(View view) {
        C0959a c0959aN = n(view);
        if (c0959aN == null) {
            c0959aN = new C0959a();
        }
        s0(view, c0959aN);
    }

    public static void l0(View view, Runnable runnable, long j9) {
        h.n(view, runnable, j9);
    }

    public static int m() {
        return i.a();
    }

    public static void m0(View view, int i9) {
        n0(i9, view);
        b0(view, 0);
    }

    public static C0959a n(View view) {
        View.AccessibilityDelegate accessibilityDelegateO = o(view);
        if (accessibilityDelegateO == null) {
            return null;
        }
        return accessibilityDelegateO instanceof C0959a.C0078a ? ((C0959a.C0078a) accessibilityDelegateO).f6809a : new C0959a(accessibilityDelegateO);
    }

    public static void n0(int i9, View view) {
        List listS = s(view);
        for (int i10 = 0; i10 < listS.size(); i10++) {
            if (((C.a) listS.get(i10)).b() == i9) {
                listS.remove(i10);
                return;
            }
        }
    }

    public static View.AccessibilityDelegate o(View view) {
        return Build.VERSION.SDK_INT >= 29 ? r.a(view) : p(view);
    }

    public static void o0(View view, C.a aVar, CharSequence charSequence, Q.F f9) {
        if (f9 == null && charSequence == null) {
            m0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, f9));
        }
    }

    public static View.AccessibilityDelegate p(View view) {
        if (f6745d) {
            return null;
        }
        if (f6744c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6744c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6745d = true;
                return null;
            }
        }
        try {
            Object obj = f6744c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f6745d = true;
            return null;
        }
    }

    public static void p0(View view) {
        l.c(view);
    }

    public static int q(View view) {
        return k.a(view);
    }

    public static void q0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.c(view, context, iArr, attributeSet, typedArray, i9, i10);
        }
    }

    public static CharSequence r(View view) {
        return (CharSequence) g0().f(view);
    }

    public static f r0() {
        return new a(C.c.f795O, Boolean.class, 28);
    }

    public static List s(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C.c.f788H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C.c.f788H, arrayList2);
        return arrayList2;
    }

    public static void s0(View view, C0959a c0959a) {
        if (c0959a == null && (o(view) instanceof C0959a.C0078a)) {
            c0959a = new C0959a();
        }
        view.setAccessibilityDelegate(c0959a == null ? null : c0959a.d());
    }

    public static int t(View view, CharSequence charSequence) {
        List listS = s(view);
        for (int i9 = 0; i9 < listS.size(); i9++) {
            if (TextUtils.equals(charSequence, ((C.a) listS.get(i9)).c())) {
                return ((C.a) listS.get(i9)).b();
            }
        }
        int i10 = 0;
        int i11 = -1;
        while (true) {
            int[] iArr = f6747f;
            if (i10 >= iArr.length || i11 != -1) {
                break;
            }
            int i12 = iArr[i10];
            boolean z9 = true;
            for (int i13 = 0; i13 < listS.size(); i13++) {
                z9 &= ((C.a) listS.get(i13)).b() != i12;
            }
            if (z9) {
                i11 = i12;
            }
            i10++;
        }
        return i11;
    }

    public static void t0(View view, boolean z9) {
        b().g(view, Boolean.valueOf(z9));
    }

    public static ColorStateList u(View view) {
        return m.g(view);
    }

    public static void u0(View view, int i9) {
        k.f(view, i9);
    }

    public static PorterDuff.Mode v(View view) {
        return m.h(view);
    }

    public static void v0(View view, CharSequence charSequence) {
        g0().g(view, charSequence);
        if (charSequence != null) {
            f6749h.a(view);
        } else {
            f6749h.d(view);
        }
    }

    public static Rect w(View view) {
        return j.a(view);
    }

    public static void w0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static Display x(View view) {
        return i.b(view);
    }

    public static void x0(View view, ColorStateList colorStateList) {
        int i9 = Build.VERSION.SDK_INT;
        m.q(view, colorStateList);
        if (i9 == 21) {
            Drawable background = view.getBackground();
            boolean z9 = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background == null || !z9) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static float y(View view) {
        return m.i(view);
    }

    public static void y0(View view, PorterDuff.Mode mode) {
        int i9 = Build.VERSION.SDK_INT;
        m.r(view, mode);
        if (i9 == 21) {
            Drawable background = view.getBackground();
            boolean z9 = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background == null || !z9) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static Rect z() {
        if (f6746e == null) {
            f6746e = new ThreadLocal();
        }
        Rect rect = (Rect) f6746e.get();
        if (rect == null) {
            rect = new Rect();
            f6746e.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void z0(View view, Rect rect) {
        j.c(view, rect);
    }
}
