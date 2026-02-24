package androidx.coordinatorlayout.widget;

import P.AbstractC0974p;
import P.B;
import P.C;
import P.D;
import P.E;
import P.L;
import P.X;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements B, C {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f14468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Class[] f14469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f14470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Comparator f14471y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final O.e f14472z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14473a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B.b f14474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f14476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f14477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f14478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f14479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f14482k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f14483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f14484m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f14485n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public X f14487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f14489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f14490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public E f14491t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D f14492u;

    public class a implements E {
        public a() {
        }

        @Override // P.E
        public X a(View view, X x9) {
            return CoordinatorLayout.this.X(x9);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i9, int i10) {
            if (i10 == 0) {
                return z(coordinatorLayout, view, view2, view3, i9);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i9) {
            if (i9 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return DefaultRenderer.BACKGROUND_COLOR;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public X f(CoordinatorLayout coordinatorLayout, View view, X x9) {
            return x9;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int i12) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f9, float f10, boolean z9) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f9, float f10) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr, int i11) {
            if (i11 == 0) {
                p(coordinatorLayout, view, view2, i9, i10, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int i11, int i12) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int i11, int i12, int i13) {
            if (i13 == 0) {
                r(coordinatorLayout, view, view2, i9, i10, i11, i12);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
            s(coordinatorLayout, view, view2, i9, i10, i11, i12, i13);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i9) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i9, int i10) {
            if (i10 == 0) {
                u(coordinatorLayout, view, view2, view3, i9);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i9) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f14490s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.I(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f14490s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f14495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14502h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14503i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f14504j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f14505k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f14506l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f14507m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f14508n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f14509o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f14510p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Rect f14511q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f14512r;

        public f(int i9, int i10) {
            super(i9, i10);
            this.f14496b = false;
            this.f14497c = 0;
            this.f14498d = 0;
            this.f14499e = -1;
            this.f14500f = -1;
            this.f14501g = 0;
            this.f14502h = 0;
            this.f14511q = new Rect();
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14496b = false;
            this.f14497c = 0;
            this.f14498d = 0;
            this.f14499e = -1;
            this.f14500f = -1;
            this.f14501g = 0;
            this.f14502h = 0;
            this.f14511q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.c.f8e);
            this.f14497c = typedArrayObtainStyledAttributes.getInteger(A.c.f9f, 0);
            this.f14500f = typedArrayObtainStyledAttributes.getResourceId(A.c.f10g, -1);
            this.f14498d = typedArrayObtainStyledAttributes.getInteger(A.c.f11h, 0);
            this.f14499e = typedArrayObtainStyledAttributes.getInteger(A.c.f15l, -1);
            this.f14501g = typedArrayObtainStyledAttributes.getInt(A.c.f14k, 0);
            this.f14502h = typedArrayObtainStyledAttributes.getInt(A.c.f13j, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(A.c.f12i);
            this.f14496b = zHasValue;
            if (zHasValue) {
                this.f14495a = CoordinatorLayout.L(context, attributeSet, typedArrayObtainStyledAttributes.getString(A.c.f12i));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f14495a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14496b = false;
            this.f14497c = 0;
            this.f14498d = 0;
            this.f14499e = -1;
            this.f14500f = -1;
            this.f14501g = 0;
            this.f14502h = 0;
            this.f14511q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14496b = false;
            this.f14497c = 0;
            this.f14498d = 0;
            this.f14499e = -1;
            this.f14500f = -1;
            this.f14501g = 0;
            this.f14502h = 0;
            this.f14511q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f14496b = false;
            this.f14497c = 0;
            this.f14498d = 0;
            this.f14499e = -1;
            this.f14500f = -1;
            this.f14501g = 0;
            this.f14502h = 0;
            this.f14511q = new Rect();
        }

        public boolean a() {
            return this.f14505k == null && this.f14500f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f14506l || s(view2, L.E(coordinatorLayout)) || ((cVar = this.f14495a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        public boolean c() {
            if (this.f14495a == null) {
                this.f14507m = false;
            }
            return this.f14507m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f14500f == -1) {
                this.f14506l = null;
                this.f14505k = null;
                return null;
            }
            if (this.f14505k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f14505k;
        }

        public int e() {
            return this.f14500f;
        }

        public c f() {
            return this.f14495a;
        }

        public boolean g() {
            return this.f14510p;
        }

        public Rect h() {
            return this.f14511q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z9 = this.f14507m;
            if (z9) {
                return true;
            }
            c cVar = this.f14495a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z9;
            this.f14507m = zA;
            return zA;
        }

        public boolean j(int i9) {
            if (i9 == 0) {
                return this.f14508n;
            }
            if (i9 != 1) {
                return false;
            }
            return this.f14509o;
        }

        public void k() {
            this.f14510p = false;
        }

        public void l(int i9) {
            r(i9, false);
        }

        public void m() {
            this.f14507m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f14500f);
            this.f14505k = viewFindViewById;
            if (viewFindViewById != null) {
                if (viewFindViewById != coordinatorLayout) {
                    for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                viewFindViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f14506l = viewFindViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f14500f) + " to anchor view " + view);
            }
            this.f14506l = null;
            this.f14505k = null;
        }

        public void o(c cVar) {
            c cVar2 = this.f14495a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f14495a = cVar;
                this.f14512r = null;
                this.f14496b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        public void p(boolean z9) {
            this.f14510p = z9;
        }

        public void q(Rect rect) {
            this.f14511q.set(rect);
        }

        public void r(int i9, boolean z9) {
            if (i9 == 0) {
                this.f14508n = z9;
            } else {
                if (i9 != 1) {
                    return;
                }
                this.f14509o = z9;
            }
        }

        public final boolean s(View view, int i9) {
            int iB = AbstractC0974p.b(((f) view.getLayoutParams()).f14501g, i9);
            return iB != 0 && (AbstractC0974p.b(this.f14502h, i9) & iB) == iB;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f14505k.getId() != this.f14500f) {
                return false;
            }
            View view2 = this.f14505k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f14506l = null;
                    this.f14505k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f14506l = view2;
            return true;
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.I(0);
            return true;
        }
    }

    public static class h extends V.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SparseArray f14514d;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i9) {
                return new h[i9];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i9 = parcel.readInt();
            int[] iArr = new int[i9];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f14514d = new SparseArray(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                this.f14514d.append(iArr[i10], parcelableArray[i10]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            SparseArray sparseArray = this.f14514d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.f14514d.keyAt(i10);
                parcelableArr[i10] = (Parcelable) this.f14514d.valueAt(i10);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i9);
        }
    }

    public static class i implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fP = L.P(view);
            float fP2 = L.P(view2);
            if (fP > fP2) {
                return -1;
            }
            return fP < fP2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f14468v = r02 != null ? r02.getName() : null;
        f14471y = new i();
        f14469w = new Class[]{Context.class, AttributeSet.class};
        f14470x = new ThreadLocal();
        f14472z = new O.g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A.a.f2a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f14473a = new ArrayList();
        this.f14474c = new B.b();
        this.f14475d = new ArrayList();
        this.f14476e = new ArrayList();
        this.f14478g = new int[2];
        this.f14479h = new int[2];
        this.f14492u = new D(this);
        int[] iArr = A.c.f5b;
        TypedArray typedArrayObtainStyledAttributes = i9 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, A.b.f3a) : context.obtainStyledAttributes(attributeSet, iArr, i9, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = A.c.f5b;
            if (i9 == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, 0, A.b.f3a);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i9, 0);
            }
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(A.c.f6c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f14482k = resources.getIntArray(resourceId);
            float f9 = resources.getDisplayMetrics().density;
            int length = this.f14482k.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f14482k[i10] = (int) (r12[i10] * f9);
            }
        }
        this.f14489r = typedArrayObtainStyledAttributes.getDrawable(A.c.f7d);
        typedArrayObtainStyledAttributes.recycle();
        Y();
        super.setOnHierarchyChangeListener(new e());
        if (L.C(this) == 0) {
            L.C0(this, 1);
        }
    }

    public static c L(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(InstructionFileId.DOT)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f14468v;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f14470x;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f14469w);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e9) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e9);
        }
    }

    public static void P(Rect rect) {
        rect.setEmpty();
        f14472z.a(rect);
    }

    public static int S(int i9) {
        if (i9 == 0) {
            return 17;
        }
        return i9;
    }

    public static int T(int i9) {
        if ((i9 & 7) == 0) {
            i9 |= 8388611;
        }
        return (i9 & 112) == 0 ? i9 | 48 : i9;
    }

    public static int U(int i9) {
        if (i9 == 0) {
            return 8388661;
        }
        return i9;
    }

    public static Rect a() {
        Rect rect = (Rect) f14472z.b();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i9, int i10, int i11) {
        return i9 < i10 ? i10 : i9 > i11 ? i11 : i9;
    }

    public final void A(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i9) : i9));
        }
        Comparator comparator = f14471y;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean B(View view) {
        return this.f14474c.j(view);
    }

    public boolean C(View view, int i9, int i10) {
        Rect rectA = a();
        u(view, rectA);
        try {
            return rectA.contains(i9, i10);
        } finally {
            P(rectA);
        }
    }

    public final void D(View view, int i9) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f14487p != null && L.B(this) && !L.B(view)) {
            rectA.left += this.f14487p.i();
            rectA.top += this.f14487p.k();
            rectA.right -= this.f14487p.j();
            rectA.bottom -= this.f14487p.h();
        }
        Rect rectA2 = a();
        AbstractC0974p.a(T(fVar.f14497c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i9);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        P(rectA);
        P(rectA2);
    }

    public final void E(View view, View view2, int i9) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            u(view2, rectA);
            v(view, i9, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            P(rectA);
            P(rectA2);
        }
    }

    public final void F(View view, int i9, int i10) {
        f fVar = (f) view.getLayoutParams();
        int iB = AbstractC0974p.b(U(fVar.f14497c), i10);
        int i11 = iB & 7;
        int i12 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 == 1) {
            i9 = width - i9;
        }
        int iX = x(i9) - measuredWidth;
        if (i11 == 1) {
            iX += measuredWidth / 2;
        } else if (i11 == 5) {
            iX += measuredWidth;
        }
        int i13 = i12 != 16 ? i12 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iX, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i13, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public final void G(View view, Rect rect, int i9) {
        boolean z9;
        boolean z10;
        int width;
        int i10;
        int i11;
        int i12;
        int height;
        int i13;
        int i14;
        int i15;
        if (L.W(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            P(rectA2);
            if (rectA.isEmpty()) {
                P(rectA);
                return;
            }
            int iB = AbstractC0974p.b(fVar.f14502h, i9);
            boolean z11 = true;
            if ((iB & 48) != 48 || (i14 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f14504j) >= (i15 = rect.top)) {
                z9 = false;
            } else {
                W(view, i15 - i14);
                z9 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f14504j) < (i13 = rect.bottom)) {
                W(view, height - i13);
                z9 = true;
            }
            if (!z9) {
                W(view, 0);
            }
            if ((iB & 3) != 3 || (i11 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f14503i) >= (i12 = rect.left)) {
                z10 = false;
            } else {
                V(view, i12 - i11);
                z10 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f14503i) >= (i10 = rect.right)) {
                z11 = z10;
            } else {
                V(view, width - i10);
            }
            if (!z11) {
                V(view, 0);
            }
            P(rectA);
        }
    }

    public void H(View view, int i9) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f14505k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            u(fVar.f14505k, rectA);
            r(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(view, i9, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z9 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i10 = rectA3.left - rectA2.left;
            int i11 = rectA3.top - rectA2.top;
            if (i10 != 0) {
                L.c0(view, i10);
            }
            if (i11 != 0) {
                L.d0(view, i11);
            }
            if (z9 && (cVarF = fVar.f()) != null) {
                cVarF.h(this, view, fVar.f14505k);
            }
            P(rectA);
            P(rectA2);
            P(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(int r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.I(int):void");
    }

    public void J(View view, int i9) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f14505k;
        if (view2 != null) {
            E(view, view2, i9);
            return;
        }
        int i10 = fVar.f14499e;
        if (i10 >= 0) {
            F(view, i10, i9);
        } else {
            D(view, i9);
        }
    }

    public void K(View view, int i9, int i10, int i11, int i12) {
        measureChildWithMargins(view, i9, i10, i11, i12);
    }

    public final boolean M(MotionEvent motionEvent, int i9) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f14475d;
        A(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) list.get(i10);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zK || z9) || actionMasked == 0) {
                if (!zK && cVarF != null) {
                    if (i9 == 0) {
                        zK = cVarF.k(this, view, motionEvent);
                    } else if (i9 == 1) {
                        zK = cVarF.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.f14483l = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z9 = zI && !zC;
                if (zI && !z9) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i9 == 0) {
                    cVarF.k(this, view, motionEventObtain);
                } else if (i9 == 1) {
                    cVarF.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    public final void N() {
        this.f14473a.clear();
        this.f14474c.c();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            f fVarZ = z(childAt);
            fVarZ.d(this, childAt);
            this.f14474c.b(childAt);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (i10 != i9) {
                    View childAt2 = getChildAt(i10);
                    if (fVarZ.b(this, childAt, childAt2)) {
                        if (!this.f14474c.d(childAt2)) {
                            this.f14474c.b(childAt2);
                        }
                        this.f14474c.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f14473a.addAll(this.f14474c.i());
        Collections.reverse(this.f14473a);
    }

    public void O(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    public void Q() {
        if (this.f14481j && this.f14485n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f14485n);
        }
        this.f14486o = false;
    }

    public final void R(boolean z9) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z9) {
                    cVarF.k(this, childAt, motionEventObtain);
                } else {
                    cVarF.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).m();
        }
        this.f14483l = null;
        this.f14480i = false;
    }

    public final void V(View view, int i9) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.f14503i;
        if (i10 != i9) {
            L.c0(view, i9 - i10);
            fVar.f14503i = i9;
        }
    }

    public final void W(View view, int i9) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.f14504j;
        if (i10 != i9) {
            L.d0(view, i9 - i10);
            fVar.f14504j = i9;
        }
    }

    public final X X(X x9) {
        if (O.c.a(this.f14487p, x9)) {
            return x9;
        }
        this.f14487p = x9;
        boolean z9 = false;
        boolean z10 = x9 != null && x9.k() > 0;
        this.f14488q = z10;
        if (!z10 && getBackground() == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        X xE = e(x9);
        requestLayout();
        return xE;
    }

    public final void Y() {
        if (!L.B(this)) {
            L.E0(this, null);
            return;
        }
        if (this.f14491t == null) {
            this.f14491t = new a();
        }
        L.E0(this, this.f14491t);
        setSystemUiVisibility(1280);
    }

    public void b() {
        if (this.f14481j) {
            if (this.f14485n == null) {
                this.f14485n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f14485n);
        }
        this.f14486o = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(f fVar, Rect rect, int i9, int i10) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i9) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i9 + iMax, i10 + iMax2);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j9) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f14495a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f14477f == null) {
                    this.f14477f = new Paint();
                }
                this.f14477f.setColor(fVar.f14495a.c(this, view));
                this.f14477f.setAlpha(c(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f14477f);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14489r;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final X e(X x9) {
        c cVarF;
        if (x9.n()) {
            return x9;
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (L.B(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                x9 = cVarF.f(this, childAt, x9);
                if (x9.n()) {
                    break;
                }
            }
        }
        return x9;
    }

    public void f(View view) {
        List listG = this.f14474c.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < listG.size(); i9++) {
            View view2 = (View) listG.get(i9);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.h(this, view2, view);
            }
        }
    }

    public boolean g(View view, View view2) {
        boolean z9 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectA = a();
        r(view, view.getParent() != this, rectA);
        Rect rectA2 = a();
        r(view2, view2.getParent() != this, rectA2);
        try {
            if (rectA.left <= rectA2.right && rectA.top <= rectA2.bottom && rectA.right >= rectA2.left) {
                if (rectA.bottom >= rectA2.top) {
                    z9 = true;
                }
            }
            return z9;
        } finally {
            P(rectA);
            P(rectA2);
        }
    }

    public final List<View> getDependencySortedChildren() {
        N();
        return Collections.unmodifiableList(this.f14473a);
    }

    public final X getLastWindowInsets() {
        return this.f14487p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f14492u.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f14489r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h() {
        int childCount = getChildCount();
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            if (B(getChildAt(i9))) {
                z9 = true;
                break;
            }
            i9++;
        }
        if (z9 != this.f14486o) {
            if (z9) {
                b();
            } else {
                Q();
            }
        }
    }

    @Override // P.B
    public void i(View view, View view2, int i9, int i10) {
        c cVarF;
        this.f14492u.c(view, view2, i9, i10);
        this.f14484m = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10) && (cVarF = fVar.f()) != null) {
                cVarF.v(this, childAt, view, view2, i9, i10);
            }
        }
    }

    @Override // P.B
    public void j(View view, int i9) {
        this.f14492u.d(view, i9);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i9)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.C(this, childAt, view, i9);
                }
                fVar.l(i9);
                fVar.k();
            }
        }
        this.f14484m = null;
    }

    @Override // P.B
    public void k(View view, int i9, int i10, int[] iArr, int i11) {
        c cVarF;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i11) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f14478g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.q(this, childAt, view, i9, i10, iArr2, i11);
                    int[] iArr3 = this.f14478g;
                    iMax = i9 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f14478g;
                    iMax2 = i10 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z9) {
            I(1);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // P.C
    public void m(View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i13) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f14478g;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.t(this, childAt, view, i9, i10, i11, i12, i13, iArr2);
                    int[] iArr3 = this.f14478g;
                    iMax = i11 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    iMax2 = i12 > 0 ? Math.max(iMax2, this.f14478g[1]) : Math.min(iMax2, this.f14478g[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z9) {
            I(1);
        }
    }

    @Override // P.B
    public void n(View view, int i9, int i10, int i11, int i12, int i13) {
        m(view, i9, i10, i11, i12, 0, this.f14479h);
    }

    @Override // P.B
    public boolean o(View view, View view2, int i9, int i10) {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zA = cVarF.A(this, childAt, view, view2, i9, i10);
                    z9 |= zA;
                    fVar.r(i10, zA);
                } else {
                    fVar.r(i10, false);
                }
            }
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R(false);
        if (this.f14486o) {
            if (this.f14485n == null) {
                this.f14485n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f14485n);
        }
        if (this.f14487p == null && L.B(this)) {
            L.p0(this);
        }
        this.f14481j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        R(false);
        if (this.f14486o && this.f14485n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f14485n);
        }
        View view = this.f14484m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f14481j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f14488q || this.f14489r == null) {
            return;
        }
        X x9 = this.f14487p;
        int iK = x9 != null ? x9.k() : 0;
        if (iK > 0) {
            this.f14489r.setBounds(0, 0, getWidth(), iK);
            this.f14489r.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R(true);
        }
        boolean zM = M(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            R(true);
        }
        return zM;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        c cVarF;
        int iE = L.E(this);
        int size = this.f14473a.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) this.f14473a.get(i13);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.l(this, view, iE))) {
                J(view, iE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f9, float f10, boolean z9) {
        c cVarF;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zN |= cVarF.n(this, childAt, view, f9, f10, z9);
                }
            }
        }
        if (zN) {
            I(1);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f9, float f10) {
        c cVarF;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    zO |= cVarF.o(this, childAt, view, f9, f10);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        k(view, i9, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        n(view, i9, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i9) {
        i(view, view2, i9, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f14514d;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int id = childAt.getId();
            c cVarF = z(childAt).f();
            if (id != -1 && cVarF != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVarF.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int id = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && cVarF != null && (parcelableY = cVarF.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        hVar.f14514d = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i9) {
        return o(view, view2, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f14483l
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.M(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2c
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.f14483l
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f14483l
            boolean r6 = r6.D(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f14483l
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.R(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public void r(View view, boolean z9, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z9) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.w(this, view, rect, z9)) {
            return super.requestChildRectangleOnScreen(view, rect, z9);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (!z9 || this.f14480i) {
            return;
        }
        R(false);
        this.f14480i = true;
    }

    public List s(View view) {
        List listH = this.f14474c.h(view);
        this.f14476e.clear();
        if (listH != null) {
            this.f14476e.addAll(listH);
        }
        return this.f14476e;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z9) {
        super.setFitsSystemWindows(z9);
        Y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f14490s = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f14489r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f14489r = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f14489r.setState(getDrawableState());
                }
                H.a.m(this.f14489r, L.E(this));
                this.f14489r.setVisible(getVisibility() == 0, false);
                this.f14489r.setCallback(this);
            }
            L.j0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i9) {
        setStatusBarBackground(new ColorDrawable(i9));
    }

    public void setStatusBarBackgroundResource(int i9) {
        setStatusBarBackground(i9 != 0 ? E.b.getDrawable(getContext(), i9) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        boolean z9 = i9 == 0;
        Drawable drawable = this.f14489r;
        if (drawable == null || drawable.isVisible() == z9) {
            return;
        }
        this.f14489r.setVisible(z9, false);
    }

    public List t(View view) {
        List listG = this.f14474c.g(view);
        this.f14476e.clear();
        if (listG != null) {
            this.f14476e.addAll(listG);
        }
        return this.f14476e;
    }

    public void u(View view, Rect rect) {
        B.c.a(this, view, rect);
    }

    public void v(View view, int i9, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(view, i9, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14489r;
    }

    public final void w(View view, int i9, Rect rect, Rect rect2, f fVar, int i10, int i11) {
        int iB = AbstractC0974p.b(S(fVar.f14497c), i9);
        int iB2 = AbstractC0974p.b(T(fVar.f14498d), i9);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int i14 = iB2 & 7;
        int i15 = iB2 & 112;
        int iWidth = i14 != 1 ? i14 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i15 != 16 ? i15 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i12 == 1) {
            iWidth -= i10 / 2;
        } else if (i12 != 5) {
            iWidth -= i10;
        }
        if (i13 == 16) {
            iHeight -= i11 / 2;
        } else if (i13 != 80) {
            iHeight -= i11;
        }
        rect2.set(iWidth, iHeight, i10 + iWidth, i11 + iHeight);
    }

    public final int x(int i9) {
        StringBuilder sb;
        int[] iArr = this.f14482k;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i9);
        } else {
            if (i9 >= 0 && i9 < iArr.length) {
                return iArr[i9];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i9);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f14496b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e9) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e9);
                    }
                }
            }
            fVar.f14496b = true;
        }
        return fVar;
    }
}
