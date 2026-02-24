package androidx.preference;

import F.k;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import z0.AbstractC2997c;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, AbstractC2997c.f52503e, R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
    }

    @Override // androidx.preference.Preference
    public boolean K() {
        return !super.w();
    }

    @Override // androidx.preference.Preference
    public boolean w() {
        return false;
    }
}
