package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;

/* JADX INFO: loaded from: classes.dex */
public interface H {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, i.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i9);

    void j(CharSequence charSequence);

    Menu k();

    int l();

    P.S m(int i9, long j9);

    ViewGroup n();

    void o(boolean z9);

    void p();

    void q(boolean z9);

    void r();

    void s(androidx.appcompat.widget.c cVar);

    void setIcon(int i9);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(int i9);

    void u(int i9);

    void v(i.a aVar, e.a aVar2);

    void w(int i9);

    int x();

    void y();
}
