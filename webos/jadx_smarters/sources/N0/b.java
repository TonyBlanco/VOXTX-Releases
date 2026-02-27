package n0;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1186p;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import m0.AbstractC2215a;
import n0.AbstractC2242a;
import o0.AbstractC2303c;
import s.j;

/* JADX INFO: loaded from: classes.dex */
public class b extends AbstractC2242a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f44869c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1186p f44870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f44871b;

    public static class a extends u implements AbstractC2303c.b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f44872l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Bundle f44873m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AbstractC2303c f44874n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public InterfaceC1186p f44875o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public C0392b f44876p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public AbstractC2303c f44877q;

        public a(int i9, Bundle bundle, AbstractC2303c abstractC2303c, AbstractC2303c abstractC2303c2) {
            this.f44872l = i9;
            this.f44873m = bundle;
            this.f44874n = abstractC2303c;
            this.f44877q = abstractC2303c2;
            abstractC2303c.t(i9, this);
        }

        @Override // o0.AbstractC2303c.b
        public void a(AbstractC2303c abstractC2303c, Object obj) {
            if (b.f44869c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                o(obj);
                return;
            }
            if (b.f44869c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        @Override // androidx.lifecycle.LiveData
        public void j() {
            if (b.f44869c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f44874n.w();
        }

        @Override // androidx.lifecycle.LiveData
        public void k() {
            if (b.f44869c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f44874n.x();
        }

        @Override // androidx.lifecycle.LiveData
        public void m(v vVar) {
            super.m(vVar);
            this.f44875o = null;
            this.f44876p = null;
        }

        @Override // androidx.lifecycle.u, androidx.lifecycle.LiveData
        public void o(Object obj) {
            super.o(obj);
            AbstractC2303c abstractC2303c = this.f44877q;
            if (abstractC2303c != null) {
                abstractC2303c.u();
                this.f44877q = null;
            }
        }

        public AbstractC2303c p(boolean z9) {
            if (b.f44869c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f44874n.b();
            this.f44874n.a();
            C0392b c0392b = this.f44876p;
            if (c0392b != null) {
                m(c0392b);
                if (z9) {
                    c0392b.d();
                }
            }
            this.f44874n.z(this);
            if ((c0392b == null || c0392b.c()) && !z9) {
                return this.f44874n;
            }
            this.f44874n.u();
            return this.f44877q;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f44872l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f44873m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f44874n);
            this.f44874n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f44876p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f44876p);
                this.f44876p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(r().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        public AbstractC2303c r() {
            return this.f44874n;
        }

        public void s() {
            InterfaceC1186p interfaceC1186p = this.f44875o;
            C0392b c0392b = this.f44876p;
            if (interfaceC1186p == null || c0392b == null) {
                return;
            }
            super.m(c0392b);
            h(interfaceC1186p, c0392b);
        }

        public AbstractC2303c t(InterfaceC1186p interfaceC1186p, AbstractC2242a.InterfaceC0391a interfaceC0391a) {
            C0392b c0392b = new C0392b(this.f44874n, interfaceC0391a);
            h(interfaceC1186p, c0392b);
            v vVar = this.f44876p;
            if (vVar != null) {
                m(vVar);
            }
            this.f44875o = interfaceC1186p;
            this.f44876p = c0392b;
            return this.f44874n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f44872l);
            sb.append(" : ");
            O.b.a(this.f44874n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: n0.b$b, reason: collision with other inner class name */
    public static class C0392b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2303c f44878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2242a.InterfaceC0391a f44879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f44880c = false;

        public C0392b(AbstractC2303c abstractC2303c, AbstractC2242a.InterfaceC0391a interfaceC0391a) {
            this.f44878a = abstractC2303c;
            this.f44879b = interfaceC0391a;
        }

        @Override // androidx.lifecycle.v
        public void a(Object obj) {
            if (b.f44869c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f44878a + ": " + this.f44878a.d(obj));
            }
            this.f44879b.c(this.f44878a, obj);
            this.f44880c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f44880c);
        }

        public boolean c() {
            return this.f44880c;
        }

        public void d() {
            if (this.f44880c) {
                if (b.f44869c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f44878a);
                }
                this.f44879b.b(this.f44878a);
            }
        }

        public String toString() {
            return this.f44879b.toString();
        }
    }

    public static class c extends I {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final J.b f44881c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f44882a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44883b = false;

        public static class a implements J.b {
            @Override // androidx.lifecycle.J.b
            public /* synthetic */ I a(Class cls, AbstractC2215a abstractC2215a) {
                return K.b(this, cls, abstractC2215a);
            }

            @Override // androidx.lifecycle.J.b
            public I b(Class cls) {
                return new c();
            }
        }

        public static c d(M m9) {
            return (c) new J(m9, f44881c).a(c.class);
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f44882a.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i9 = 0; i9 < this.f44882a.m(); i9++) {
                    a aVar = (a) this.f44882a.n(i9);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f44882a.j(i9));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void c() {
            this.f44883b = false;
        }

        public a e(int i9) {
            return (a) this.f44882a.g(i9);
        }

        public boolean f() {
            return this.f44883b;
        }

        public void g() {
            int iM = this.f44882a.m();
            for (int i9 = 0; i9 < iM; i9++) {
                ((a) this.f44882a.n(i9)).s();
            }
        }

        public void h(int i9, a aVar) {
            this.f44882a.k(i9, aVar);
        }

        public void i() {
            this.f44883b = true;
        }

        @Override // androidx.lifecycle.I
        public void onCleared() {
            super.onCleared();
            int iM = this.f44882a.m();
            for (int i9 = 0; i9 < iM; i9++) {
                ((a) this.f44882a.n(i9)).p(true);
            }
            this.f44882a.d();
        }
    }

    public b(InterfaceC1186p interfaceC1186p, M m9) {
        this.f44870a = interfaceC1186p;
        this.f44871b = c.d(m9);
    }

    @Override // n0.AbstractC2242a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f44871b.b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // n0.AbstractC2242a
    public AbstractC2303c c(int i9, Bundle bundle, AbstractC2242a.InterfaceC0391a interfaceC0391a) {
        if (this.f44871b.f()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarE = this.f44871b.e(i9);
        if (f44869c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarE == null) {
            return e(i9, bundle, interfaceC0391a, null);
        }
        if (f44869c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarE);
        }
        return aVarE.t(this.f44870a, interfaceC0391a);
    }

    @Override // n0.AbstractC2242a
    public void d() {
        this.f44871b.g();
    }

    public final AbstractC2303c e(int i9, Bundle bundle, AbstractC2242a.InterfaceC0391a interfaceC0391a, AbstractC2303c abstractC2303c) {
        try {
            this.f44871b.i();
            AbstractC2303c abstractC2303cA = interfaceC0391a.a(i9, bundle);
            if (abstractC2303cA == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (abstractC2303cA.getClass().isMemberClass() && !Modifier.isStatic(abstractC2303cA.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + abstractC2303cA);
            }
            a aVar = new a(i9, bundle, abstractC2303cA, abstractC2303c);
            if (f44869c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f44871b.h(i9, aVar);
            this.f44871b.c();
            return aVar.t(this.f44870a, interfaceC0391a);
        } catch (Throwable th) {
            this.f44871b.c();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        O.b.a(this.f44870a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
