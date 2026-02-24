package androidx.preference;

import F.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import z0.AbstractC2997c;
import z0.AbstractC2998d;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final a f16559J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CharSequence f16560K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CharSequence f16561L;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z9))) {
                SwitchPreferenceCompat.this.N(z9);
            } else {
                compoundButton.setChecked(!z9);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2997c.f52507i);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f16559J = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52553U0, i9, i10);
        Q(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52572c1, AbstractC3001g.f52555V0));
        P(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52569b1, AbstractC3001g.f52557W0));
        T(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52578e1, AbstractC3001g.f52561Y0));
        S(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52575d1, AbstractC3001g.f52563Z0));
        O(k.b(typedArrayObtainStyledAttributes, AbstractC3001g.f52566a1, AbstractC3001g.f52559X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void U(View view) {
        boolean z9 = view instanceof SwitchCompat;
        if (z9) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16563E);
        }
        if (z9) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f16560K);
            switchCompat.setTextOff(this.f16561L);
            switchCompat.setOnCheckedChangeListener(this.f16559J);
        }
    }

    private void V(View view) {
        if (((AccessibilityManager) h().getSystemService("accessibility")).isEnabled()) {
            U(view.findViewById(AbstractC2998d.f52509a));
            R(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void F(View view) {
        super.F(view);
        V(view);
    }

    public void S(CharSequence charSequence) {
        this.f16561L = charSequence;
        y();
    }

    public void T(CharSequence charSequence) {
        this.f16560K = charSequence;
        y();
    }
}
