package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes3.dex */
public class b implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27795a;

    public b(int i9) {
        this.f27795a = i9;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i11, i12, charSequence.subSequence(i9, i10).toString());
            if (Integer.parseInt(sb.toString()) <= this.f27795a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
