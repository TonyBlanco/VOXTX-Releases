package d0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import com.google.android.gms.common.api.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f39459a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.AbstractC0170e f39461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39462e = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39463f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39464g = true;

    public static class a extends e.AbstractC0170e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference f39465a;

        public a(EditText editText) {
            this.f39465a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0170e
        public void b() {
            super.b();
            g.b((EditText) this.f39465a.get(), 1);
        }
    }

    public g(EditText editText, boolean z9) {
        this.f39459a = editText;
        this.f39460c = z9;
    }

    public static void b(EditText editText, int i9) {
        if (i9 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final e.AbstractC0170e a() {
        if (this.f39461d == null) {
            this.f39461d = new a(this.f39459a);
        }
        return this.f39461d;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    public void c(boolean z9) {
        if (this.f39464g != z9) {
            if (this.f39461d != null) {
                androidx.emoji2.text.e.b().t(this.f39461d);
            }
            this.f39464g = z9;
            if (z9) {
                b(this.f39459a, androidx.emoji2.text.e.b().d());
            }
        }
    }

    public final boolean d() {
        return (this.f39464g && (this.f39460c || androidx.emoji2.text.e.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (this.f39459a.isInEditMode() || d() || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iD = androidx.emoji2.text.e.b().d();
        if (iD != 0) {
            if (iD == 1) {
                androidx.emoji2.text.e.b().r((Spannable) charSequence, i9, i9 + i11, this.f39462e, this.f39463f);
                return;
            } else if (iD != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.b().s(a());
    }
}
