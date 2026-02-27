package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1180j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f15160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f15161b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15168i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f15172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f15174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f15175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f15176q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f15178s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f15162c = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15169j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15177r = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f15180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15183e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15184f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public AbstractC1180j.c f15185g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC1180j.c f15186h;

        public a() {
        }

        public a(int i9, Fragment fragment) {
            this.f15179a = i9;
            this.f15180b = fragment;
            AbstractC1180j.c cVar = AbstractC1180j.c.RESUMED;
            this.f15185g = cVar;
            this.f15186h = cVar;
        }

        public a(int i9, Fragment fragment, AbstractC1180j.c cVar) {
            this.f15179a = i9;
            this.f15180b = fragment;
            this.f15185g = fragment.mMaxState;
            this.f15186h = cVar;
        }
    }

    public w(i iVar, ClassLoader classLoader) {
        this.f15160a = iVar;
        this.f15161b = classLoader;
    }

    public w b(int i9, Fragment fragment) {
        o(i9, fragment, null, 1);
        return this;
    }

    public w c(int i9, Fragment fragment, String str) {
        o(i9, fragment, str, 1);
        return this;
    }

    public w d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public w e(Fragment fragment, String str) {
        o(0, fragment, str, 1);
        return this;
    }

    public void f(a aVar) {
        this.f15162c.add(aVar);
        aVar.f15181c = this.f15163d;
        aVar.f15182d = this.f15164e;
        aVar.f15183e = this.f15165f;
        aVar.f15184f = this.f15166g;
    }

    public w g(String str) {
        if (!this.f15169j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f15168i = true;
        this.f15170k = str;
        return this;
    }

    public w h(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public abstract int i();

    public abstract int j();

    public abstract void k();

    public abstract void l();

    public w m(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public w n() {
        if (this.f15168i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f15169j = false;
        return this;
    }

    public void o(int i9, Fragment fragment, String str, int i10) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i9 != 0) {
            if (i9 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i11 = fragment.mFragmentId;
            if (i11 != 0 && i11 != i9) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i9);
            }
            fragment.mFragmentId = i9;
            fragment.mContainerId = i9;
        }
        f(new a(i10, fragment));
    }

    public w p(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public w q(int i9, Fragment fragment) {
        return r(i9, fragment, null);
    }

    public w r(int i9, Fragment fragment, String str) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        o(i9, fragment, str, 2);
        return this;
    }

    public w s(int i9, int i10) {
        return t(i9, i10, 0, 0);
    }

    public w t(int i9, int i10, int i11, int i12) {
        this.f15163d = i9;
        this.f15164e = i10;
        this.f15165f = i11;
        this.f15166g = i12;
        return this;
    }

    public w u(Fragment fragment, AbstractC1180j.c cVar) {
        f(new a(10, fragment, cVar));
        return this;
    }

    public w v(Fragment fragment) {
        f(new a(8, fragment));
        return this;
    }

    public w w(boolean z9) {
        this.f15177r = z9;
        return this;
    }
}
