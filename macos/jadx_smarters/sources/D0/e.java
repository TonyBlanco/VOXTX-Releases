package d0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f39452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39453b;

    public static class a {
        public boolean a(Editable editable, int i9, KeyEvent keyEvent) {
            return androidx.emoji2.text.e.f(editable, i9, keyEvent);
        }
    }

    public e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public e(KeyListener keyListener, a aVar) {
        this.f39452a = keyListener;
        this.f39453b = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i9) {
        this.f39452a.clearMetaKeyState(view, editable, i9);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f39452a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i9, KeyEvent keyEvent) {
        return this.f39453b.a(editable, i9, keyEvent) || this.f39452a.onKeyDown(view, editable, i9, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f39452a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i9, KeyEvent keyEvent) {
        return this.f39452a.onKeyUp(view, editable, i9, keyEvent);
    }
}
