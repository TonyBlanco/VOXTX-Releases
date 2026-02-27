package k;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import c.AbstractC1238a;
import e.AbstractC1726a;

/* JADX INFO: renamed from: k.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2127w extends Spinner {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f43407j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2109d f43408a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f43409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P f43410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SpinnerAdapter f43411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f43413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f43415i;

    /* JADX INFO: renamed from: k.w$a */
    public class a extends P {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ h f43416k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, h hVar) {
            super(view);
            this.f43416k = hVar;
        }

        @Override // k.P
        public j.f b() {
            return this.f43416k;
        }

        @Override // k.P
        public boolean c() {
            if (C2127w.this.getInternalPopup().a()) {
                return true;
            }
            C2127w.this.b();
            return true;
        }
    }

    /* JADX INFO: renamed from: k.w$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C2127w.this.getInternalPopup().a()) {
                C2127w.this.b();
            }
            ViewTreeObserver viewTreeObserver = C2127w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    /* JADX INFO: renamed from: k.w$c */
    public static final class c {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: renamed from: k.w$d */
    public static final class d {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i9) {
            view.setTextAlignment(i9);
        }

        public static void d(View view, int i9) {
            view.setTextDirection(i9);
        }
    }

    /* JADX INFO: renamed from: k.w$e */
    public static final class e {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (O.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: k.w$f */
    public class f implements j, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.a f43419a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ListAdapter f43420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f43421d;

        public f() {
        }

        @Override // k.C2127w.j
        public boolean a() {
            androidx.appcompat.app.a aVar = this.f43419a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // k.C2127w.j
        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // k.C2127w.j
        public int c() {
            return 0;
        }

        @Override // k.C2127w.j
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f43419a;
            if (aVar != null) {
                aVar.dismiss();
                this.f43419a = null;
            }
        }

        @Override // k.C2127w.j
        public void e(int i9) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // k.C2127w.j
        public CharSequence f() {
            return this.f43421d;
        }

        @Override // k.C2127w.j
        public Drawable g() {
            return null;
        }

        @Override // k.C2127w.j
        public void h(CharSequence charSequence) {
            this.f43421d = charSequence;
        }

        @Override // k.C2127w.j
        public void i(int i9) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // k.C2127w.j
        public void j(int i9) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // k.C2127w.j
        public void k(int i9, int i10) {
            if (this.f43420c == null) {
                return;
            }
            a.C0158a c0158a = new a.C0158a(C2127w.this.getPopupContext());
            CharSequence charSequence = this.f43421d;
            if (charSequence != null) {
                c0158a.setTitle(charSequence);
            }
            androidx.appcompat.app.a aVarCreate = c0158a.k(this.f43420c, C2127w.this.getSelectedItemPosition(), this).create();
            this.f43419a = aVarCreate;
            ListView listViewF = aVarCreate.f();
            d.d(listViewF, i9);
            d.c(listViewF, i10);
            this.f43419a.show();
        }

        @Override // k.C2127w.j
        public int l() {
            return 0;
        }

        @Override // k.C2127w.j
        public void m(ListAdapter listAdapter) {
            this.f43420c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            C2127w.this.setSelection(i9);
            if (C2127w.this.getOnItemClickListener() != null) {
                C2127w.this.performItemClick(null, i9, this.f43420c.getItemId(i9));
            }
            dismiss();
        }
    }

    /* JADX INFO: renamed from: k.w$g */
    public static class g implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f43423a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ListAdapter f43424c;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f43423a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f43424c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || Build.VERSION.SDK_INT < 23 || !AbstractC2128x.a(spinnerAdapter)) {
                return;
            }
            e.a(AbstractC2129y.a(spinnerAdapter), theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f43424c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f43423a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i9, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f43423a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i9, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i9) {
            SpinnerAdapter spinnerAdapter = this.f43423a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i9);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i9) {
            SpinnerAdapter spinnerAdapter = this.f43423a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i9);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i9) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i9, View view, ViewGroup viewGroup) {
            return getDropDownView(i9, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f43423a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i9) {
            ListAdapter listAdapter = this.f43424c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i9);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f43423a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f43423a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: k.w$h */
    public class h extends Q implements j {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public CharSequence f43425K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public ListAdapter f43426L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public final Rect f43427M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f43428N;

        /* JADX INFO: renamed from: k.w$h$a */
        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2127w f43430a;

            public a(C2127w c2127w) {
                this.f43430a = c2127w;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
                C2127w.this.setSelection(i9);
                if (C2127w.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    C2127w.this.performItemClick(view, i9, hVar.f43426L.getItemId(i9));
                }
                h.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: k.w$h$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.T(C2127w.this)) {
                    h.this.dismiss();
                } else {
                    h.this.R();
                    h.super.show();
                }
            }
        }

        /* JADX INFO: renamed from: k.w$h$c */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f43433a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f43433a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C2127w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f43433a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i9) {
            super(context, attributeSet, i9);
            this.f43427M = new Rect();
            C(C2127w.this);
            I(true);
            N(0);
            K(new a(C2127w.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void R() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.g()
                if (r0 == 0) goto L24
                k.w r1 = k.C2127w.this
                android.graphics.Rect r1 = r1.f43415i
                r0.getPadding(r1)
                k.w r0 = k.C2127w.this
                boolean r0 = k.m0.b(r0)
                if (r0 == 0) goto L1c
                k.w r0 = k.C2127w.this
                android.graphics.Rect r0 = r0.f43415i
                int r0 = r0.right
                goto L2e
            L1c:
                k.w r0 = k.C2127w.this
                android.graphics.Rect r0 = r0.f43415i
                int r0 = r0.left
                int r0 = -r0
                goto L2e
            L24:
                k.w r0 = k.C2127w.this
                android.graphics.Rect r0 = r0.f43415i
                r1 = 0
                r0.right = r1
                r0.left = r1
                r0 = 0
            L2e:
                k.w r1 = k.C2127w.this
                int r1 = r1.getPaddingLeft()
                k.w r2 = k.C2127w.this
                int r2 = r2.getPaddingRight()
                k.w r3 = k.C2127w.this
                int r3 = r3.getWidth()
                k.w r4 = k.C2127w.this
                int r5 = r4.f43414h
                r6 = -2
                if (r5 != r6) goto L7b
                android.widget.ListAdapter r5 = r8.f43426L
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.g()
                int r4 = r4.a(r5, r6)
                k.w r5 = k.C2127w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                k.w r6 = k.C2127w.this
                android.graphics.Rect r6 = r6.f43415i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r1
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
            L77:
                r8.E(r4)
                goto L85
            L7b:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r1
                int r4 = r4 - r2
                goto L77
            L82:
                r8.E(r5)
            L85:
                k.w r4 = k.C2127w.this
                boolean r4 = k.m0.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r1 = r8.y()
                int r3 = r3 - r1
                int r1 = r8.S()
                int r3 = r3 - r1
                int r0 = r0 + r3
                goto La0
            L9a:
                int r2 = r8.S()
                int r1 = r1 + r2
                int r0 = r0 + r1
            La0:
                r8.e(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k.C2127w.h.R():void");
        }

        public int S() {
            return this.f43428N;
        }

        public boolean T(View view) {
            return P.L.V(view) && view.getGlobalVisibleRect(this.f43427M);
        }

        @Override // k.C2127w.j
        public CharSequence f() {
            return this.f43425K;
        }

        @Override // k.C2127w.j
        public void h(CharSequence charSequence) {
            this.f43425K = charSequence;
        }

        @Override // k.C2127w.j
        public void j(int i9) {
            this.f43428N = i9;
        }

        @Override // k.C2127w.j
        public void k(int i9, int i10) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            R();
            H(2);
            super.show();
            ListView listViewO = o();
            listViewO.setChoiceMode(1);
            d.d(listViewO, i9);
            d.c(listViewO, i10);
            O(C2127w.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = C2127w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // k.Q, k.C2127w.j
        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.f43426L = listAdapter;
        }
    }

    /* JADX INFO: renamed from: k.w$i */
    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f43435a;

        /* JADX INFO: renamed from: k.w$i$a */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i9) {
                return new i[i9];
            }
        }

        public i(Parcel parcel) {
            super(parcel);
            this.f43435a = parcel.readByte() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeByte(this.f43435a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: k.w$j */
    public interface j {
        boolean a();

        void b(Drawable drawable);

        int c();

        void dismiss();

        void e(int i9);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i9);

        void j(int i9);

        void k(int i9, int i10);

        int l();

        void m(ListAdapter listAdapter);
    }

    public C2127w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17737N);
    }

    public C2127w(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, -1);
    }

    public C2127w(Context context, AttributeSet attributeSet, int i9, int i10) {
        this(context, attributeSet, i9, i10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, k.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2127w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C2127w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i9 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f43415i);
        Rect rect = this.f43415i;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        this.f43413g.k(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2109d c2109d = this.f43408a;
        if (c2109d != null) {
            c2109d.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f43413g;
        return jVar != null ? jVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f43413g;
        return jVar != null ? jVar.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f43413g != null ? this.f43414h : super.getDropDownWidth();
    }

    public final j getInternalPopup() {
        return this.f43413g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f43413g;
        return jVar != null ? jVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f43409c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f43413g;
        return jVar != null ? jVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f43408a;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f43408a;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f43413g;
        if (jVar == null || !jVar.a()) {
            return;
        }
        this.f43413g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f43413g == null || View.MeasureSpec.getMode(i9) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f43435a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f43413g;
        iVar.f43435a = jVar != null && jVar.a();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        P p9 = this.f43410d;
        if (p9 == null || !p9.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f43413g;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f43412f) {
            this.f43411e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f43413g != null) {
            Context context = this.f43409c;
            if (context == null) {
                context = getContext();
            }
            this.f43413g.m(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f43408a;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f43408a;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i9) {
        j jVar = this.f43413g;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i9);
        } else {
            jVar.j(i9);
            this.f43413g.e(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i9) {
        j jVar = this.f43413g;
        if (jVar != null) {
            jVar.i(i9);
        } else {
            super.setDropDownVerticalOffset(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i9) {
        if (this.f43413g != null) {
            this.f43414h = i9;
        } else {
            super.setDropDownWidth(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f43413g;
        if (jVar != null) {
            jVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i9) {
        setPopupBackgroundDrawable(AbstractC1726a.b(getPopupContext(), i9));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f43413g;
        if (jVar != null) {
            jVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2109d c2109d = this.f43408a;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f43408a;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }
}
