package M0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s.C2695a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2695a f4165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2695a f4166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2695a f4167c;

    public b(C2695a c2695a, C2695a c2695a2, C2695a c2695a3) {
        this.f4165a = c2695a;
        this.f4166b = c2695a2;
        this.f4167c = c2695a3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i9) {
        w(i9);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i9) {
        w(i9);
        C(charSequence);
    }

    public abstract void E(int i9);

    public void F(int i9, int i10) {
        w(i10);
        E(i9);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i9) {
        w(i9);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i9) {
        w(i9);
        I(str);
    }

    public void K(d dVar, b bVar) {
        try {
            e(dVar.getClass()).invoke(null, dVar, bVar);
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (!(e12.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
            }
            throw ((RuntimeException) e12.getCause());
        }
    }

    public void L(d dVar) {
        if (dVar == null) {
            I(null);
            return;
        }
        N(dVar);
        b bVarB = b();
        K(dVar, bVarB);
        bVarB.a();
    }

    public void M(d dVar, int i9) {
        w(i9);
        L(dVar);
    }

    public final void N(d dVar) {
        try {
            I(c(dVar.getClass()).getName());
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e9);
        }
    }

    public abstract void a();

    public abstract b b();

    public final Class c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f4167c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f4167c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) throws NoSuchMethodException {
        Method method = (Method) this.f4165a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        this.f4165a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f4166b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, b.class);
        this.f4166b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z9, int i9) {
        return !m(i9) ? z9 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i9) {
        return !m(i9) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i9) {
        return !m(i9) ? charSequence : k();
    }

    public abstract boolean m(int i9);

    public d n(String str, b bVar) {
        try {
            return (d) d(str).invoke(null, bVar);
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract int o();

    public int p(int i9, int i10) {
        return !m(i10) ? i9 : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i9) {
        return !m(i9) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i9) {
        return !m(i9) ? str : s();
    }

    public d u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return n(strS, b());
    }

    public d v(d dVar, int i9) {
        return !m(i9) ? dVar : u();
    }

    public abstract void w(int i9);

    public void x(boolean z9, boolean z10) {
    }

    public abstract void y(boolean z9);

    public void z(boolean z9, int i9) {
        w(i9);
        y(z9);
    }
}
