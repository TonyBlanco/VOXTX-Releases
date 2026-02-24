package d0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f39446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39447b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i9, int i10, boolean z9) {
            return androidx.emoji2.text.e.e(inputConnection, editable, i9, i10, z9);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.e.h()) {
                androidx.emoji2.text.e.b().u(editorInfo);
            }
        }
    }

    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f39446a = textView;
        this.f39447b = aVar;
        aVar.b(editorInfo);
    }

    public final Editable a() {
        return this.f39446a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i9, int i10) {
        return this.f39447b.a(this, a(), i9, i10, false) || super.deleteSurroundingText(i9, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        return this.f39447b.a(this, a(), i9, i10, true) || super.deleteSurroundingTextInCodePoints(i9, i10);
    }
}
