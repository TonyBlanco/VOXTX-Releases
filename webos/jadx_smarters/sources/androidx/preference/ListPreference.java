package androidx.preference;

import F.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import z0.AbstractC2997c;
import z0.AbstractC3000f;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CharSequence[] f16492K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CharSequence[] f16493L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f16494M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f16495N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f16496O;

    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f16497a;

        public static a b() {
            if (f16497a == null) {
                f16497a = new a();
            }
            return f16497a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.O()) ? listPreference.h().getString(AbstractC3000f.f52511a) : listPreference.O();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, AbstractC2997c.f52500b, R.attr.dialogPreferenceStyle));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52615x, i9, i10);
        this.f16492K = k.q(typedArrayObtainStyledAttributes, AbstractC3001g.f52512A, AbstractC3001g.f52617y);
        this.f16493L = k.q(typedArrayObtainStyledAttributes, AbstractC3001g.f52514B, AbstractC3001g.f52619z);
        int i11 = AbstractC3001g.f52516C;
        if (k.b(typedArrayObtainStyledAttributes, i11, i11, false)) {
            J(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52528I, i9, i10);
        this.f16495N = k.o(typedArrayObtainStyledAttributes2, AbstractC3001g.f52602q0, AbstractC3001g.f52544Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public Object C(TypedArray typedArray, int i9) {
        return typedArray.getString(i9);
    }

    public int M(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f16493L) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f16493L[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] N() {
        return this.f16492K;
    }

    public CharSequence O() {
        CharSequence[] charSequenceArr;
        int iR = R();
        if (iR < 0 || (charSequenceArr = this.f16492K) == null) {
            return null;
        }
        return charSequenceArr[iR];
    }

    public CharSequence[] P() {
        return this.f16493L;
    }

    public String Q() {
        return this.f16494M;
    }

    public final int R() {
        return M(this.f16494M);
    }

    public void S(String str) {
        boolean z9 = !TextUtils.equals(this.f16494M, str);
        if (z9 || !this.f16496O) {
            this.f16494M = str;
            this.f16496O = true;
            I(str);
            if (z9) {
                y();
            }
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence s() {
        if (t() != null) {
            return t().a(this);
        }
        CharSequence charSequenceO = O();
        CharSequence charSequenceS = super.s();
        String str = this.f16495N;
        if (str == null) {
            return charSequenceS;
        }
        if (charSequenceO == null) {
            charSequenceO = "";
        }
        String str2 = String.format(str, charSequenceO);
        if (TextUtils.equals(str2, charSequenceS)) {
            return charSequenceS;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }
}
