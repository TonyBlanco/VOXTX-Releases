package j2;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;

/* JADX INFO: renamed from: j2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC2084j extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2075a f42891a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2086l f42892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O1.j f42893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f42894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FragmentC2084j f42895f;

    /* JADX INFO: renamed from: j2.j$b */
    public class b implements InterfaceC2086l {
        public b() {
        }
    }

    public FragmentC2084j() {
        this(new C2075a());
    }

    public FragmentC2084j(C2075a c2075a) {
        this.f42892c = new b();
        this.f42894e = new HashSet();
        this.f42891a = c2075a;
    }

    public final void a(FragmentC2084j fragmentC2084j) {
        this.f42894e.add(fragmentC2084j);
    }

    public C2075a b() {
        return this.f42891a;
    }

    public O1.j c() {
        return this.f42893d;
    }

    public InterfaceC2086l d() {
        return this.f42892c;
    }

    public final void e(FragmentC2084j fragmentC2084j) {
        this.f42894e.remove(fragmentC2084j);
    }

    public void f(O1.j jVar) {
        this.f42893d = jVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            FragmentC2084j fragmentC2084jH = C2085k.f().h(getActivity().getFragmentManager());
            this.f42895f = fragmentC2084jH;
            if (fragmentC2084jH != this) {
                fragmentC2084jH.a(this);
            }
        } catch (IllegalStateException e9) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e9);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f42891a.b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        FragmentC2084j fragmentC2084j = this.f42895f;
        if (fragmentC2084j != null) {
            fragmentC2084j.e(this);
            this.f42895f = null;
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        O1.j jVar = this.f42893d;
        if (jVar != null) {
            jVar.s();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f42891a.c();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f42891a.d();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks2
    public void onTrimMemory(int i9) {
        O1.j jVar = this.f42893d;
        if (jVar != null) {
            jVar.t(i9);
        }
    }
}
