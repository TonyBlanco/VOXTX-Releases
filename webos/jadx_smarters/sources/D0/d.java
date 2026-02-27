package d0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f39448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e.AbstractC0170e f39449b;

    public static class a extends e.AbstractC0170e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference f39450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Reference f39451b;

        public a(TextView textView, d dVar) {
            this.f39450a = new WeakReference(textView);
            this.f39451b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.e.AbstractC0170e
        public void b() {
            CharSequence text;
            CharSequence charSequenceO;
            super.b();
            TextView textView = (TextView) this.f39450a.get();
            if (c(textView, (InputFilter) this.f39451b.get()) && textView.isAttachedToWindow() && text != (charSequenceO = androidx.emoji2.text.e.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceO);
                int selectionEnd = Selection.getSelectionEnd(charSequenceO);
                textView.setText(charSequenceO);
                if (charSequenceO instanceof Spannable) {
                    d.b((Spannable) charSequenceO, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(TextView textView) {
        this.f39448a = textView;
    }

    public static void b(Spannable spannable, int i9, int i10) {
        if (i9 >= 0 && i10 >= 0) {
            Selection.setSelection(spannable, i9, i10);
        } else if (i9 >= 0) {
            Selection.setSelection(spannable, i9);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        }
    }

    public final e.AbstractC0170e a() {
        if (this.f39449b == null) {
            this.f39449b = new a(this.f39448a, this);
        }
        return this.f39449b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        if (this.f39448a.isInEditMode()) {
            return charSequence;
        }
        int iD = androidx.emoji2.text.e.b().d();
        if (iD != 0) {
            if (iD == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == this.f39448a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i9 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i9, i10);
                }
                return androidx.emoji2.text.e.b().p(charSequence, 0, charSequence.length());
            }
            if (iD != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.b().s(a());
        return charSequence;
    }
}
