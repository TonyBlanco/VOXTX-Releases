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
import z0.AbstractC2997c;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final a f16477J;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z9))) {
                CheckBoxPreference.this.N(z9);
            } else {
                compoundButton.setChecked(!z9);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, AbstractC2997c.f52499a, R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f16477J = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52567b, i9, i10);
        Q(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52583h, AbstractC3001g.f52570c));
        P(k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52581g, AbstractC3001g.f52573d));
        O(k.b(typedArrayObtainStyledAttributes, AbstractC3001g.f52579f, AbstractC3001g.f52576e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void F(View view) {
        super.F(view);
        T(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(View view) {
        boolean z9 = view instanceof CompoundButton;
        if (z9) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f16563E);
        }
        if (z9) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f16477J);
        }
    }

    public final void T(View view) {
        if (((AccessibilityManager) h().getSystemService("accessibility")).isEnabled()) {
            S(view.findViewById(R.id.checkbox));
            R(view.findViewById(R.id.summary));
        }
    }
}
