package k;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import d0.C1648a;

/* JADX INFO: renamed from: k.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2116k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f43367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1648a f43368b;

    public C2116k(EditText editText) {
        this.f43367a = editText;
        this.f43368b = new C1648a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f43368b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i9) {
        TypedArray typedArrayObtainStyledAttributes = this.f43367a.getContext().obtainStyledAttributes(attributeSet, c.j.f18079g0, i9, 0);
        try {
            boolean z9 = typedArrayObtainStyledAttributes.hasValue(c.j.f18149u0) ? typedArrayObtainStyledAttributes.getBoolean(c.j.f18149u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z9);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f43368b.b(inputConnection, editorInfo);
    }

    public void e(boolean z9) {
        this.f43368b.c(z9);
    }
}
