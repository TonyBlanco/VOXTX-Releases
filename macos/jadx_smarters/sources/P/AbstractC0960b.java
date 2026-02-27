package P;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: P.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0960b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f6811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0079b f6812c;

    /* JADX INFO: renamed from: P.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: P.b$b, reason: collision with other inner class name */
    public interface InterfaceC0079b {
        void onActionProviderVisibilityChanged(boolean z9);
    }

    public AbstractC0960b(Context context) {
        this.f6810a = context;
    }

    public Context a() {
        return this.f6810a;
    }

    public boolean b() {
        return false;
    }

    public abstract boolean c();

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public abstract boolean f();

    public void g(SubMenu subMenu) {
    }

    public abstract boolean h();

    public void i() {
        if (this.f6812c == null || !h()) {
            return;
        }
        this.f6812c.onActionProviderVisibilityChanged(c());
    }

    public void j() {
        this.f6812c = null;
        this.f6811b = null;
    }

    public void k(a aVar) {
        this.f6811b = aVar;
    }

    public void l(InterfaceC0079b interfaceC0079b) {
        if (this.f6812c != null && interfaceC0079b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f6812c = interfaceC0079b;
    }
}
