package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.AbstractC1238a;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Q implements j.f {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static Method f43178H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static Method f43179I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static Method f43180J;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final e f43181A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Runnable f43182B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Handler f43183C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f43184D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Rect f43185E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f43186F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public PopupWindow f43187G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f43188a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListAdapter f43189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N f43190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f43198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f43200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f43201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f43202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f43203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f43204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DataSetObserver f43205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f43206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f43207u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemClickListener f43208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f43209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f43210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h f43211y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g f43212z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = Q.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            Q.this.show();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            N n9;
            if (i9 == -1 || (n9 = Q.this.f43190d) == null) {
                return;
            }
            n9.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i9, boolean z9) {
            return popupWindow.getMaxAvailableHeight(view, i9, z9);
        }
    }

    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z9) {
            popupWindow.setIsClippedToScreen(z9);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Q.this.q();
        }
    }

    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (Q.this.a()) {
                Q.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            Q.this.dismiss();
        }
    }

    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i9, int i10, int i11) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i9) {
            if (i9 != 1 || Q.this.z() || Q.this.f43187G.getContentView() == null) {
                return;
            }
            Q q9 = Q.this;
            q9.f43183C.removeCallbacks(q9.f43210x);
            Q.this.f43210x.run();
        }
    }

    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = Q.this.f43187G) != null && popupWindow.isShowing() && x9 >= 0 && x9 < Q.this.f43187G.getWidth() && y9 >= 0 && y9 < Q.this.f43187G.getHeight()) {
                Q q9 = Q.this;
                q9.f43183C.postDelayed(q9.f43210x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            Q q10 = Q.this;
            q10.f43183C.removeCallbacks(q10.f43210x);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            N n9 = Q.this.f43190d;
            if (n9 == null || !P.L.V(n9) || Q.this.f43190d.getCount() <= Q.this.f43190d.getChildCount()) {
                return;
            }
            int childCount = Q.this.f43190d.getChildCount();
            Q q9 = Q.this;
            if (childCount <= q9.f43202p) {
                q9.f43187G.setInputMethodMode(2);
                Q.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f43178H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f43180J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f43179I = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public Q(Context context) {
        this(context, null, AbstractC1238a.f17729F);
    }

    public Q(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public Q(Context context, AttributeSet attributeSet, int i9, int i10) {
        this.f43191e = -2;
        this.f43192f = -2;
        this.f43195i = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f43199m = 0;
        this.f43200n = false;
        this.f43201o = false;
        this.f43202p = a.e.API_PRIORITY_OTHER;
        this.f43204r = 0;
        this.f43210x = new i();
        this.f43211y = new h();
        this.f43212z = new g();
        this.f43181A = new e();
        this.f43184D = new Rect();
        this.f43188a = context;
        this.f43183C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.f18145t1, i9, i10);
        this.f43193g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.j.f18150u1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.j.f18155v1, 0);
        this.f43194h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f43196j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2122q c2122q = new C2122q(context, attributeSet, i9, i10);
        this.f43187G = c2122q;
        c2122q.setInputMethodMode(1);
    }

    public boolean A() {
        return this.f43186F;
    }

    public final void B() {
        View view = this.f43203q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f43203q);
            }
        }
    }

    public void C(View view) {
        this.f43206t = view;
    }

    public void D(int i9) {
        this.f43187G.setAnimationStyle(i9);
    }

    public void E(int i9) {
        Drawable background = this.f43187G.getBackground();
        if (background == null) {
            P(i9);
            return;
        }
        background.getPadding(this.f43184D);
        Rect rect = this.f43184D;
        this.f43192f = rect.left + rect.right + i9;
    }

    public void F(int i9) {
        this.f43199m = i9;
    }

    public void G(Rect rect) {
        this.f43185E = rect != null ? new Rect(rect) : null;
    }

    public void H(int i9) {
        this.f43187G.setInputMethodMode(i9);
    }

    public void I(boolean z9) {
        this.f43186F = z9;
        this.f43187G.setFocusable(z9);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.f43187G.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f43208v = onItemClickListener;
    }

    public void L(boolean z9) {
        this.f43198l = true;
        this.f43197k = z9;
    }

    public final void M(boolean z9) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f43187G, z9);
            return;
        }
        Method method = f43178H;
        if (method != null) {
            try {
                method.invoke(this.f43187G, Boolean.valueOf(z9));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void N(int i9) {
        this.f43204r = i9;
    }

    public void O(int i9) {
        N n9 = this.f43190d;
        if (!a() || n9 == null) {
            return;
        }
        n9.setListSelectionHidden(false);
        n9.setSelection(i9);
        if (n9.getChoiceMode() != 0) {
            n9.setItemChecked(i9, true);
        }
    }

    public void P(int i9) {
        this.f43192f = i9;
    }

    @Override // j.f
    public boolean a() {
        return this.f43187G.isShowing();
    }

    public void b(Drawable drawable) {
        this.f43187G.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f43193g;
    }

    @Override // j.f
    public void dismiss() {
        this.f43187G.dismiss();
        B();
        this.f43187G.setContentView(null);
        this.f43190d = null;
        this.f43183C.removeCallbacks(this.f43210x);
    }

    public void e(int i9) {
        this.f43193g = i9;
    }

    public Drawable g() {
        return this.f43187G.getBackground();
    }

    public void i(int i9) {
        this.f43194h = i9;
        this.f43196j = true;
    }

    public int l() {
        if (this.f43196j) {
            return this.f43194h;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f43205s;
        if (dataSetObserver == null) {
            this.f43205s = new f();
        } else {
            ListAdapter listAdapter2 = this.f43189c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f43189c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f43205s);
        }
        N n9 = this.f43190d;
        if (n9 != null) {
            n9.setAdapter(this.f43189c);
        }
    }

    @Override // j.f
    public ListView o() {
        return this.f43190d;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012c A[PHI: r1
      0x012c: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x0120, B:47:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p() {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.Q.p():int");
    }

    public void q() {
        N n9 = this.f43190d;
        if (n9 != null) {
            n9.setListSelectionHidden(true);
            n9.requestLayout();
        }
    }

    public N r(Context context, boolean z9) {
        return new N(context, z9);
    }

    public View s() {
        return this.f43206t;
    }

    @Override // j.f
    public void show() {
        int iP = p();
        boolean z9 = z();
        T.h.b(this.f43187G, this.f43195i);
        if (this.f43187G.isShowing()) {
            if (P.L.V(s())) {
                int width = this.f43192f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i9 = this.f43191e;
                if (i9 == -1) {
                    if (!z9) {
                        iP = -1;
                    }
                    if (z9) {
                        this.f43187G.setWidth(this.f43192f == -1 ? -1 : 0);
                        this.f43187G.setHeight(0);
                    } else {
                        this.f43187G.setWidth(this.f43192f == -1 ? -1 : 0);
                        this.f43187G.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    iP = i9;
                }
                this.f43187G.setOutsideTouchable((this.f43201o || this.f43200n) ? false : true);
                this.f43187G.update(s(), this.f43193g, this.f43194h, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f43192f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i10 = this.f43191e;
        if (i10 == -1) {
            iP = -1;
        } else if (i10 != -2) {
            iP = i10;
        }
        this.f43187G.setWidth(width2);
        this.f43187G.setHeight(iP);
        M(true);
        this.f43187G.setOutsideTouchable((this.f43201o || this.f43200n) ? false : true);
        this.f43187G.setTouchInterceptor(this.f43211y);
        if (this.f43198l) {
            T.h.a(this.f43187G, this.f43197k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f43180J;
            if (method != null) {
                try {
                    method.invoke(this.f43187G, this.f43185E);
                } catch (Exception e9) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e9);
                }
            }
        } else {
            d.a(this.f43187G, this.f43185E);
        }
        T.h.c(this.f43187G, s(), this.f43193g, this.f43194h, this.f43199m);
        this.f43190d.setSelection(-1);
        if (!this.f43186F || this.f43190d.isInTouchMode()) {
            q();
        }
        if (this.f43186F) {
            return;
        }
        this.f43183C.post(this.f43181A);
    }

    public final int t(View view, int i9, boolean z9) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.f43187G, view, i9, z9);
        }
        Method method = f43179I;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f43187G, view, Integer.valueOf(i9), Boolean.valueOf(z9))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f43187G.getMaxAvailableHeight(view, i9);
    }

    public Object u() {
        if (a()) {
            return this.f43190d.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f43190d.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f43190d.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f43190d.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f43192f;
    }

    public boolean z() {
        return this.f43187G.getInputMethodMode() == 2;
    }
}
