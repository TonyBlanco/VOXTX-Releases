package com.google.android.material.timepicker;

import R4.f;
import R4.h;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import f5.t;
import f5.w;

/* JADX INFO: loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chip f27744a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextInputLayout f27745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f27746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextWatcher f27747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f27748f;

    public class b extends t {
        public b() {
        }

        @Override // f5.t, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f27744a.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f27744a.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(h.f8814i, (ViewGroup) this, false);
        this.f27744a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(h.f8815j, (ViewGroup) this, false);
        this.f27745c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f27746d = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f27747e = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f27748f = (TextView) findViewById(f.f8788l);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public final String c(CharSequence charSequence) {
        return d.a(getResources(), charSequence);
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f27746d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f27744a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        this.f27744a.setChecked(z9);
        this.f27746d.setVisibility(z9 ? 0 : 4);
        this.f27744a.setVisibility(z9 ? 8 : 0);
        if (isChecked()) {
            w.h(this.f27746d);
            if (TextUtils.isEmpty(this.f27746d.getText())) {
                return;
            }
            EditText editText = this.f27746d;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f27744a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i9, Object obj) {
        this.f27744a.setTag(i9, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f27744a.toggle();
    }
}
