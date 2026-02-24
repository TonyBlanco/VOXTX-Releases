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
import android.widget.Switch;
import z0.AbstractC2997c;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final a f16555J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CharSequence f16556K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CharSequence f16557L;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
            if (SwitchPreference.this.a(Boolean.valueOf(z9))) {
                SwitchPreference.this.N(z9);
            } else {
                compoundButton.setChecked(!z9);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, AbstractC2997c.f52508j, R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f16555J = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52531J0, i9, i10);
        Q(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52547R0, AbstractC3001g.f52533K0));
        P(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52545Q0, AbstractC3001g.f52535L0));
        T(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52551T0, AbstractC3001g.f52539N0));
        S(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52549S0, AbstractC3001g.f52541O0));
        O(k.b(typedArrayObtainStyledAttributes, AbstractC3001g.f52543P0, AbstractC3001g.f52537M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void V(View view) {
        if (((AccessibilityManager) h().getSystemService("accessibility")).isEnabled()) {
            U(view.findViewById(R.id.switch_widget));
            R(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void F(View view) {
        super.F(view);
        V(view);
    }

    public void S(CharSequence charSequence) {
        this.f16557L = charSequence;
        y();
    }

    public void T(CharSequence charSequence) {
        this.f16556K = charSequence;
        y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(View view) {
        boolean z9 = view instanceof Switch;
        if (z9) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16563E);
        }
        if (z9) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f16556K);
            r42.setTextOff(this.f16557L);
            r42.setOnCheckedChangeListener(this.f16555J);
        }
    }
}
