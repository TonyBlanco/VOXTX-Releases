package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.m;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f15039a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f15040b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.l f15041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15042b;

        public a(m.l lVar, boolean z9) {
            this.f15041a = lVar;
            this.f15042b = z9;
        }
    }

    public l(m mVar) {
        this.f15040b = mVar;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().a(fragment, bundle, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.a(this.f15040b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z9) {
        Context contextF = this.f15040b.t0().f();
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().b(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.b(this.f15040b, fragment, contextF);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().c(fragment, bundle, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.c(this.f15040b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().d(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.d(this.f15040b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().e(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.e(this.f15040b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().f(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.f(this.f15040b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z9) {
        Context contextF = this.f15040b.t0().f();
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().g(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.g(this.f15040b, fragment, contextF);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().h(fragment, bundle, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.h(this.f15040b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().i(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.i(this.f15040b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().j(fragment, bundle, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.j(this.f15040b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().k(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.k(this.f15040b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().l(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.l(this.f15040b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().m(fragment, view, bundle, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.m(this.f15040b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z9) {
        Fragment fragmentW0 = this.f15040b.w0();
        if (fragmentW0 != null) {
            fragmentW0.getParentFragmentManager().v0().n(fragment, true);
        }
        for (a aVar : this.f15039a) {
            if (!z9 || aVar.f15042b) {
                aVar.f15041a.n(this.f15040b, fragment);
            }
        }
    }

    public void o(m.l lVar, boolean z9) {
        this.f15039a.add(new a(lVar, z9));
    }

    public void p(m.l lVar) {
        synchronized (this.f15039a) {
            try {
                int size = this.f15039a.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    if (((a) this.f15039a.get(i9)).f15041a == lVar) {
                        this.f15039a.remove(i9);
                        break;
                    }
                    i9++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
