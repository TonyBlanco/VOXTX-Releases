package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import m0.AbstractC2215a;
import m0.C2218d;

/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f15863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2215a f15865c;

    public static class a extends c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static a f15867f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Application f15869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0178a f15866e = new C0178a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AbstractC2215a.b f15868g = C0178a.C0179a.f15870a;

        /* JADX INFO: renamed from: androidx.lifecycle.J$a$a, reason: collision with other inner class name */
        public static final class C0178a {

            /* JADX INFO: renamed from: androidx.lifecycle.J$a$a$a, reason: collision with other inner class name */
            public static final class C0179a implements AbstractC2215a.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0179a f15870a = new C0179a();
            }

            public C0178a() {
            }

            public /* synthetic */ C0178a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.l.e(application, "application");
                if (a.f15867f == null) {
                    a.f15867f = new a(application);
                }
                a aVar = a.f15867f;
                kotlin.jvm.internal.l.b(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.l.e(application, "application");
        }

        public a(Application application, int i9) {
            this.f15869d = application;
        }

        @Override // androidx.lifecycle.J.c, androidx.lifecycle.J.b
        public I a(Class modelClass, AbstractC2215a extras) {
            kotlin.jvm.internal.l.e(modelClass, "modelClass");
            kotlin.jvm.internal.l.e(extras, "extras");
            if (this.f15869d != null) {
                return b(modelClass);
            }
            Application application = (Application) extras.a(f15868g);
            if (application != null) {
                return g(modelClass, application);
            }
            if (AbstractC1171a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.b(modelClass);
        }

        @Override // androidx.lifecycle.J.c, androidx.lifecycle.J.b
        public I b(Class modelClass) {
            kotlin.jvm.internal.l.e(modelClass, "modelClass");
            Application application = this.f15869d;
            if (application != null) {
                return g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final I g(Class cls, Application application) {
            if (!AbstractC1171a.class.isAssignableFrom(cls)) {
                return super.b(cls);
            }
            try {
                I i9 = (I) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.l.d(i9, "{\n                try {\n…          }\n            }");
                return i9;
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }
    }

    public interface b {
        I a(Class cls, AbstractC2215a abstractC2215a);

        I b(Class cls);
    }

    public static class c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static c f15872b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15871a = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AbstractC2215a.b f15873c = a.C0180a.f15874a;

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.J$c$a$a, reason: collision with other inner class name */
            public static final class C0180a implements AbstractC2215a.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0180a f15874a = new C0180a();
            }

            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final c a() {
                if (c.f15872b == null) {
                    c.f15872b = new c();
                }
                c cVar = c.f15872b;
                kotlin.jvm.internal.l.b(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.J.b
        public /* synthetic */ I a(Class cls, AbstractC2215a abstractC2215a) {
            return K.b(this, cls, abstractC2215a);
        }

        @Override // androidx.lifecycle.J.b
        public I b(Class modelClass) {
            kotlin.jvm.internal.l.e(modelClass, "modelClass");
            try {
                Object objNewInstance = modelClass.newInstance();
                kotlin.jvm.internal.l.d(objNewInstance, "{\n                modelC…wInstance()\n            }");
                return (I) objNewInstance;
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            }
        }
    }

    public static class d {
        public abstract void c(I i9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(M store, b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.l.e(store, "store");
        kotlin.jvm.internal.l.e(factory, "factory");
    }

    public J(M store, b factory, AbstractC2215a defaultCreationExtras) {
        kotlin.jvm.internal.l.e(store, "store");
        kotlin.jvm.internal.l.e(factory, "factory");
        kotlin.jvm.internal.l.e(defaultCreationExtras, "defaultCreationExtras");
        this.f15863a = store;
        this.f15864b = factory;
        this.f15865c = defaultCreationExtras;
    }

    public /* synthetic */ J(M m9, b bVar, AbstractC2215a abstractC2215a, int i9, kotlin.jvm.internal.g gVar) {
        this(m9, bVar, (i9 & 4) != 0 ? AbstractC2215a.C0379a.f44278b : abstractC2215a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public J(N owner, b factory) {
        kotlin.jvm.internal.l.e(owner, "owner");
        kotlin.jvm.internal.l.e(factory, "factory");
        M viewModelStore = owner.getViewModelStore();
        kotlin.jvm.internal.l.d(viewModelStore, "owner.viewModelStore");
        this(viewModelStore, factory, L.a(owner));
    }

    public I a(Class modelClass) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public I b(String key, Class modelClass) {
        I iB;
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        I viewModel = this.f15863a.b(key);
        if (!modelClass.isInstance(viewModel)) {
            C2218d c2218d = new C2218d(this.f15865c);
            c2218d.c(c.f15873c, key);
            try {
                iB = this.f15864b.a(modelClass, c2218d);
            } catch (AbstractMethodError unused) {
                iB = this.f15864b.b(modelClass);
            }
            this.f15863a.d(key, iB);
            return iB;
        }
        Object obj = this.f15864b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            kotlin.jvm.internal.l.d(viewModel, "viewModel");
            dVar.c(viewModel);
        }
        if (viewModel != null) {
            return viewModel;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
    }
}
