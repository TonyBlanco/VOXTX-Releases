package com.google.android.material.datepicker;

import P.E;
import P.L;
import P.X;
import a5.ViewOnTouchListenerC1112a;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import d.AbstractC1617D;
import e.AbstractC1726a;
import i5.AbstractC1892b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l5.C2198g;

/* JADX INFO: loaded from: classes3.dex */
public final class j<S> extends DialogInterfaceOnCancelListenerC1144d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f27314w = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f27315x = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f27316y = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f27317a = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f27318c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f27319d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f27320e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f27322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.material.datepicker.a f27323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f27324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f27326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f27330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f27332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f27333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CheckableImageButton f27334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2198g f27335t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Button f27336u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27337v;

    public class a implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f27339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27340c;

        public a(int i9, View view, int i10) {
            this.f27338a = i9;
            this.f27339b = view;
            this.f27340c = i10;
        }

        @Override // P.E
        public X a(View view, X x9) {
            int i9 = x9.f(X.m.c()).f2105b;
            if (this.f27338a >= 0) {
                this.f27339b.getLayoutParams().height = this.f27338a + i9;
                View view2 = this.f27339b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f27339b;
            view3.setPadding(view3.getPaddingLeft(), this.f27340c + i9, this.f27339b.getPaddingRight(), this.f27339b.getPaddingBottom());
            return x9;
        }
    }

    public class b extends o {
        public b() {
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Button unused = j.this.f27336u;
            j.A(j.this);
            throw null;
        }
    }

    public static /* synthetic */ d A(j jVar) {
        jVar.J();
        return null;
    }

    public static Drawable D(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC1726a.b(context, R4.e.f8755b));
        stateListDrawable.addState(new int[0], AbstractC1726a.b(context, R4.e.f8756c));
        return stateListDrawable;
    }

    private d J() {
        AbstractC1617D.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    public static int P(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R4.d.f8708G);
        int i9 = l.h().f27350e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(R4.d.f8710I) * i9) + ((i9 - 1) * resources.getDimensionPixelOffset(R4.d.f8713L));
    }

    public static boolean W(Context context) {
        return Y(context, R.attr.windowFullscreen);
    }

    public static boolean X(Context context) {
        return Y(context, R4.b.f8655A);
    }

    public static boolean Y(Context context, int i9) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1892b.d(context, R4.b.f8687v, i.class.getCanonicalName()), new int[]{i9});
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z9;
    }

    public final void E(Window window) {
        if (this.f27337v) {
            return;
        }
        View viewFindViewById = requireView().findViewById(R4.f.f8782f);
        f5.d.a(window, true, f5.w.c(viewFindViewById), null);
        L.E0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f27337v = true;
    }

    public String L() {
        J();
        getContext();
        throw null;
    }

    public final int S(Context context) {
        int i9 = this.f27321f;
        if (i9 != 0) {
            return i9;
        }
        J();
        throw null;
    }

    public final void T(Context context) {
        this.f27334s.setTag(f27316y);
        this.f27334s.setImageDrawable(D(context));
        this.f27334s.setChecked(this.f27328m != 0);
        L.s0(this.f27334s, null);
        c0(this.f27334s);
        this.f27334s.setOnClickListener(new c());
    }

    public final void Z() {
        p pVarA;
        int iS = S(requireContext());
        J();
        this.f27324i = i.c0(null, iS, this.f27323h);
        if (this.f27334s.isChecked()) {
            J();
            pVarA = k.A(null, iS, this.f27323h);
        } else {
            pVarA = this.f27324i;
        }
        this.f27322g = pVarA;
        b0();
        androidx.fragment.app.w wVarM = getChildFragmentManager().m();
        wVarM.q(R4.f.f8799w, this.f27322g);
        wVarM.k();
        this.f27322g.x(new b());
    }

    public final void b0() {
        String strL = L();
        this.f27333r.setContentDescription(String.format(getString(R4.j.f8839m), strL));
        this.f27333r.setText(strL);
    }

    public final void c0(CheckableImageButton checkableImageButton) {
        this.f27334s.setContentDescription(checkableImageButton.getContext().getString(this.f27334s.isChecked() ? R4.j.f8842p : R4.j.f8844r));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f27319d.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f27321f = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC1617D.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f27323h = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f27325j = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f27326k = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f27328m = bundle.getInt("INPUT_MODE_KEY");
        this.f27329n = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f27330o = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f27331p = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f27332q = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), S(requireContext()));
        Context context = dialog.getContext();
        this.f27327l = W(context);
        int iD = AbstractC1892b.d(context, R4.b.f8678m, j.class.getCanonicalName());
        C2198g c2198g = new C2198g(context, null, R4.b.f8687v, R4.k.f8866t);
        this.f27335t = c2198g;
        c2198g.L(context);
        this.f27335t.W(ColorStateList.valueOf(iD));
        this.f27335t.V(L.y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewFindViewById;
        LinearLayout.LayoutParams layoutParams;
        View viewInflate = layoutInflater.inflate(this.f27327l ? R4.h.f8825t : R4.h.f8824s, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f27327l) {
            viewFindViewById = viewInflate.findViewById(R4.f.f8799w);
            layoutParams = new LinearLayout.LayoutParams(P(context), -2);
        } else {
            viewFindViewById = viewInflate.findViewById(R4.f.f8800x);
            layoutParams = new LinearLayout.LayoutParams(P(context), -1);
        }
        viewFindViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) viewInflate.findViewById(R4.f.f8763C);
        this.f27333r = textView;
        L.u0(textView, 1);
        this.f27334s = (CheckableImageButton) viewInflate.findViewById(R4.f.f8764D);
        TextView textView2 = (TextView) viewInflate.findViewById(R4.f.f8765E);
        CharSequence charSequence = this.f27326k;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f27325j);
        }
        T(context);
        this.f27336u = (Button) viewInflate.findViewById(R4.f.f8779c);
        J();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f27320e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f27321f);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f27323h);
        if (this.f27324i.W() != null) {
            bVar.b(this.f27324i.W().f27352g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f27325j);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f27326k);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f27329n);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f27330o);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f27331p);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f27332q);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f27327l) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f27335t);
            E(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R4.d.f8712K);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f27335t, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC1112a(requireDialog(), rect));
        }
        Z();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public void onStop() {
        this.f27322g.z();
        super.onStop();
    }
}
