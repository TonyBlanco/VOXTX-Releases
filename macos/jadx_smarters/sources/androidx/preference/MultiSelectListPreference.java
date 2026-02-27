package androidx.preference;

import F.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import z0.AbstractC2997c;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CharSequence[] f16498K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CharSequence[] f16499L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Set f16500M;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, AbstractC2997c.f52500b, R.attr.dialogPreferenceStyle));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f16500M = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52518D, i9, i10);
        this.f16498K = k.q(typedArrayObtainStyledAttributes, AbstractC3001g.f52524G, AbstractC3001g.f52520E);
        this.f16499L = k.q(typedArrayObtainStyledAttributes, AbstractC3001g.f52526H, AbstractC3001g.f52522F);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object C(TypedArray typedArray, int i9) {
        CharSequence[] textArray = typedArray.getTextArray(i9);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
