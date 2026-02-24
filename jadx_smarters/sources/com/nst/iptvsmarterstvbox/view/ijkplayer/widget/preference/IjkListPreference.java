package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.preference;

import a7.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.ListPreference;

/* JADX INFO: loaded from: classes4.dex */
public class IjkListPreference extends ListPreference {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence[] f37680P;

    public IjkListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T(context, attributeSet);
    }

    public static String U() {
        return "W91ciBUViBTZXJ2aWNlIFByb3ZpZGVyIGhhcyBub3QgcHJvdmlkZWQgeW91ciB0aGUgb3JpZ2luYWwgYXBwLg==";
    }

    public static String V() {
        return "3VjaCBraW5kIG9mIGFwcHMgY291bGQgc2VuZCB0aGUgZGF0YSB0byBsZWdhbCBhdXRob3JpdGllcy4=";
    }

    public static String W() {
        return "W";
    }

    public final void T(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13466a, 0, 0);
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        this.f37680P = typedArrayObtainStyledAttributes.getTextArray(l.f13467b);
        typedArrayObtainStyledAttributes.recycle();
    }
}
