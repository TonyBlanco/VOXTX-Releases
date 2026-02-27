package j2;

import android.app.Activity;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashSet;

/* JADX INFO: renamed from: j2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2088n extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O1.j f42905a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2075a f42906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2086l f42907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f42908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2088n f42909f;

    /* JADX INFO: renamed from: j2.n$b */
    public class b implements InterfaceC2086l {
        public b() {
        }
    }

    public C2088n() {
        this(new C2075a());
    }

    public C2088n(C2075a c2075a) {
        this.f42907d = new b();
        this.f42908e = new HashSet();
        this.f42906c = c2075a;
    }

    public O1.j A() {
        return this.f42905a;
    }

    public InterfaceC2086l B() {
        return this.f42907d;
    }

    public final void D(C2088n c2088n) {
        this.f42908e.remove(c2088n);
    }

    public void E(O1.j jVar) {
        this.f42905a = jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            C2088n c2088nI = C2085k.f().i(getActivity().getSupportFragmentManager());
            this.f42909f = c2088nI;
            if (c2088nI != this) {
                c2088nI.x(this);
            }
        } catch (IllegalStateException e9) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e9);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f42906c.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        C2088n c2088n = this.f42909f;
        if (c2088n != null) {
            c2088n.D(this);
            this.f42909f = null;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        O1.j jVar = this.f42905a;
        if (jVar != null) {
            jVar.s();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f42906c.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f42906c.d();
    }

    public final void x(C2088n c2088n) {
        this.f42908e.add(c2088n);
    }

    public C2075a z() {
        return this.f42906c;
    }
}
