package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f16563E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f16564F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f16565G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f16566H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f16567I;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
    }

    @Override // androidx.preference.Preference
    public void A() {
        super.A();
        boolean z9 = !M();
        if (a(Boolean.valueOf(z9))) {
            N(z9);
        }
    }

    @Override // androidx.preference.Preference
    public Object C(TypedArray typedArray, int i9) {
        return Boolean.valueOf(typedArray.getBoolean(i9, false));
    }

    @Override // androidx.preference.Preference
    public boolean K() {
        return (this.f16567I ? this.f16563E : !this.f16563E) || super.K();
    }

    public boolean M() {
        return this.f16563E;
    }

    public void N(boolean z9) {
        boolean z10 = this.f16563E != z9;
        if (z10 || !this.f16566H) {
            this.f16563E = z9;
            this.f16566H = true;
            G(z9);
            if (z10) {
                z(K());
                y();
            }
        }
    }

    public void O(boolean z9) {
        this.f16567I = z9;
    }

    public void P(CharSequence charSequence) {
        this.f16565G = charSequence;
        if (M()) {
            return;
        }
        y();
    }

    public void Q(CharSequence charSequence) {
        this.f16564F = charSequence;
        if (M()) {
            y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f16563E
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f16564F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f16564F
        L16:
            r5.setText(r0)
            r0 = 0
            goto L2b
        L1b:
            boolean r0 = r4.f16563E
            if (r0 != 0) goto L2a
            java.lang.CharSequence r0 = r4.f16565G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2a
            java.lang.CharSequence r0 = r4.f16565G
            goto L16
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L3b
            java.lang.CharSequence r2 = r4.s()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3b
            r5.setText(r2)
            r0 = 0
        L3b:
            if (r0 != 0) goto L3e
            goto L40
        L3e:
            r1 = 8
        L40:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L49
            r5.setVisibility(r1)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.R(android.view.View):void");
    }
}
