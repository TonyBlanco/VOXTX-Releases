package d0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.a;

/* JADX INFO: renamed from: d0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1648a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f39438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39439b = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39440c = 0;

    /* JADX INFO: renamed from: d0.a$a, reason: collision with other inner class name */
    public static class C0311a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f39441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f39442b;

        public C0311a(EditText editText, boolean z9) {
            this.f39441a = editText;
            g gVar = new g(editText, z9);
            this.f39442b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(d0.b.getInstance());
        }

        @Override // d0.C1648a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // d0.C1648a.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f39441a, inputConnection, editorInfo);
        }

        @Override // d0.C1648a.b
        public void c(boolean z9) {
            this.f39442b.c(z9);
        }
    }

    /* JADX INFO: renamed from: d0.a$b */
    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void c(boolean z9);
    }

    public C1648a(EditText editText, boolean z9) {
        O.h.g(editText, "editText cannot be null");
        this.f39438a = new C0311a(editText, z9);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f39438a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f39438a.b(inputConnection, editorInfo);
    }

    public void c(boolean z9) {
        this.f39438a.c(z9);
    }
}
