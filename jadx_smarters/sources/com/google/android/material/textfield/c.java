package com.google.android.material.textfield;

import R4.e;
import R4.j;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import f5.t;
import o5.AbstractC2352d;

/* JADX INFO: loaded from: classes3.dex */
public class c extends AbstractC2352d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextWatcher f27735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextInputLayout.f f27736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextInputLayout.g f27737g;

    public class a extends t {
        public a() {
        }

        @Override // f5.t, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            c.this.f46084c.setChecked(!r1.g());
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c.this.f46084c.setChecked(!r0.g());
            editText.removeTextChangedListener(c.this.f27735e);
            editText.addTextChangedListener(c.this.f27735e);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.c$c, reason: collision with other inner class name */
    public class C0267c implements TextInputLayout.g {

        /* JADX INFO: renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditText f27741a;

            public a(EditText editText) {
                this.f27741a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f27741a.removeTextChangedListener(c.this.f27735e);
            }
        }

        public C0267c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i9) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i9 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = c.this.f46082a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(c.this.g() ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            c.this.f46082a.U();
        }
    }

    public c(TextInputLayout textInputLayout, int i9) {
        super(textInputLayout, i9);
        this.f27735e = new a();
        this.f27736f = new b();
        this.f27737g = new C0267c();
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    @Override // o5.AbstractC2352d
    public void a() {
        TextInputLayout textInputLayout = this.f46082a;
        int i9 = this.f46085d;
        if (i9 == 0) {
            i9 = e.f8754a;
        }
        textInputLayout.setEndIconDrawable(i9);
        TextInputLayout textInputLayout2 = this.f46082a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(j.f8846t));
        this.f46082a.setEndIconVisible(true);
        this.f46082a.setEndIconCheckable(true);
        this.f46082a.setEndIconOnClickListener(new d());
        this.f46082a.g(this.f27736f);
        this.f46082a.h(this.f27737g);
        EditText editText = this.f46082a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.f46082a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
