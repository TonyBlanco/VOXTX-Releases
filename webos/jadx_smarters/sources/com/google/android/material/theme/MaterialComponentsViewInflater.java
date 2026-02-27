package com.google.android.material.theme;

import X4.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import d.C1644w;
import h5.C1861a;
import k.C2108c;
import k.C2110e;
import o5.C2355g;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends C1644w {
    @Override // d.C1644w
    public C2108c c(Context context, AttributeSet attributeSet) {
        return new C2355g(context, attributeSet);
    }

    @Override // d.C1644w
    public C2110e d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // d.C1644w
    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // d.C1644w
    public AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new C1861a(context, attributeSet);
    }

    @Override // d.C1644w
    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
