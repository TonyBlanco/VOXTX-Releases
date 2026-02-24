package d0;

import android.text.Editable;
import androidx.emoji2.text.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f39443a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Editable.Factory f39444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f39445c;

    public b() {
        try {
            f39445c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f39444b == null) {
            synchronized (f39443a) {
                try {
                    if (f39444b == null) {
                        f39444b = new b();
                    }
                } finally {
                }
            }
        }
        return f39444b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f39445c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
