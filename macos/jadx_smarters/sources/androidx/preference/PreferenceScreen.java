package androidx.preference;

import F.k;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import z0.AbstractC2997c;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f16540M;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, AbstractC2997c.f52504f, R.attr.preferenceScreenStyle));
        this.f16540M = true;
    }

    @Override // androidx.preference.Preference
    public void A() {
        if (l() == null && j() == null && N() != 0) {
            r();
            throw null;
        }
    }
}
