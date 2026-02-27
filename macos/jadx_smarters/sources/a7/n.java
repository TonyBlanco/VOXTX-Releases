package a7;

import android.content.Context;
import android.widget.Toast;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f13474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static n f13475c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toast f13476a;

    public n(Context context) {
        f13474b = new WeakReference(context);
    }

    public static n a(Context context) {
        if (f13475c == null || f13474b.get() == null) {
            f13475c = new n(context);
        }
        return f13475c;
    }

    public void b(int i9) {
        c(((Context) f13474b.get()).getResources().getString(i9));
    }

    public void c(String str) {
        Toast toast = this.f13476a;
        if (toast == null) {
            this.f13476a = Toast.makeText((Context) f13474b.get(), str, 0);
        } else {
            toast.setText(str);
            this.f13476a.setDuration(0);
        }
        this.f13476a.show();
    }
}
