package o5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import f5.u;
import k.C2108c;
import k.Q;
import p5.AbstractC2451a;

/* JADX INFO: renamed from: o5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2355g extends C2108c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q f46113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f46114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f46115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f46116i;

    /* JADX INFO: renamed from: o5.g$a */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            C2355g c2355g = C2355g.this;
            C2355g.this.f(i9 < 0 ? c2355g.f46113f.u() : c2355g.getAdapter().getItem(i9));
            AdapterView.OnItemClickListener onItemClickListener = C2355g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i9 < 0) {
                    view = C2355g.this.f46113f.x();
                    i9 = C2355g.this.f46113f.w();
                    j9 = C2355g.this.f46113f.v();
                }
                onItemClickListener.onItemClick(C2355g.this.f46113f.o(), view, i9, j9);
            }
            C2355g.this.f46113f.dismiss();
        }
    }

    public C2355g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8667b);
    }

    public C2355g(Context context, AttributeSet attributeSet, int i9) {
        super(AbstractC2451a.c(context, attributeSet, i9, 0), attributeSet, i9);
        this.f46115h = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = u.h(context2, attributeSet, R4.l.f8930H2, i9, R4.k.f8850d, new int[0]);
        if (typedArrayH.hasValue(R4.l.f8938I2) && typedArrayH.getInt(R4.l.f8938I2, 0) == 0) {
            setKeyListener(null);
        }
        this.f46116i = typedArrayH.getResourceId(R4.l.f8946J2, R4.h.f8817l);
        this.f46114g = (AccessibilityManager) context2.getSystemService("accessibility");
        Q q9 = new Q(context2);
        this.f46113f = q9;
        q9.I(true);
        q9.C(this);
        q9.H(2);
        q9.m(getAdapter());
        q9.K(new a());
        if (typedArrayH.hasValue(R4.l.f8954K2)) {
            setSimpleItems(typedArrayH.getResourceId(R4.l.f8954K2, 0));
        }
        typedArrayH.recycle();
    }

    public final TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutD = d();
        int i9 = 0;
        if (adapter == null || textInputLayoutD == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f46113f.w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutD);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableG = this.f46113f.g();
        if (drawableG != null) {
            drawableG.getPadding(this.f46115h);
            Rect rect = this.f46115h;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutD.getEndIconView().getMeasuredWidth();
    }

    public final void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutD = d();
        return (textInputLayoutD == null || !textInputLayoutD.O()) ? super.getHint() : textInputLayoutD.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutD = d();
        if (textInputLayoutD != null && textInputLayoutD.O() && super.getHint() == null && f5.g.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t9) {
        super.setAdapter(t9);
        this.f46113f.m(getAdapter());
    }

    public void setSimpleItems(int i9) {
        setSimpleItems(getResources().getStringArray(i9));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f46116i, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f46114g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f46113f.show();
        }
    }
}
