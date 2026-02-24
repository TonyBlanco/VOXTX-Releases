package androidx.preference;

import F.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import z0.AbstractC2997c;
import z0.AbstractC3000f;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f16490K;

    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f16491a;

        public static a b() {
            if (f16491a == null) {
                f16491a = new a();
            }
            return f16491a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.M()) ? editTextPreference.h().getString(AbstractC3000f.f52511a) : editTextPreference.M();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, AbstractC2997c.f52502d, R.attr.editTextPreferenceStyle));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52611v, i9, i10);
        int i11 = AbstractC3001g.f52613w;
        if (k.b(typedArrayObtainStyledAttributes, i11, i11, false)) {
            J(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object C(TypedArray typedArray, int i9) {
        return typedArray.getString(i9);
    }

    @Override // androidx.preference.Preference
    public boolean K() {
        return TextUtils.isEmpty(this.f16490K) || super.K();
    }

    public String M() {
        return this.f16490K;
    }
}
