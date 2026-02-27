package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1116a;
import androidx.datastore.preferences.protobuf.AbstractC1139y;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1137w extends AbstractC1116a {
    private static Map<Object, AbstractC1137w> defaultInstanceMap = new ConcurrentHashMap();
    protected m0 unknownFields = m0.e();
    protected int memoizedSerializedSize = -1;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends AbstractC1116a.AbstractC0165a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1137w f14764a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC1137w f14765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f14766d = false;

        public a(AbstractC1137w abstractC1137w) {
            this.f14764a = abstractC1137w;
            this.f14765c = (AbstractC1137w) abstractC1137w.p(d.NEW_MUTABLE_INSTANCE);
        }

        public final AbstractC1137w l() {
            AbstractC1137w abstractC1137wR = r();
            if (abstractC1137wR.x()) {
                return abstractC1137wR;
            }
            throw AbstractC1116a.AbstractC0165a.k(abstractC1137wR);
        }

        @Override // androidx.datastore.preferences.protobuf.O.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public AbstractC1137w r() {
            if (this.f14766d) {
                return this.f14765c;
            }
            this.f14765c.z();
            this.f14766d = true;
            return this.f14765c;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarE = f().e();
            aVarE.s(r());
            return aVarE;
        }

        public void o() {
            if (this.f14766d) {
                AbstractC1137w abstractC1137w = (AbstractC1137w) this.f14765c.p(d.NEW_MUTABLE_INSTANCE);
                t(abstractC1137w, this.f14765c);
                this.f14765c = abstractC1137w;
                this.f14766d = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.P
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public AbstractC1137w f() {
            return this.f14764a;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1116a.AbstractC0165a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a i(AbstractC1137w abstractC1137w) {
            return s(abstractC1137w);
        }

        public a s(AbstractC1137w abstractC1137w) {
            o();
            t(this.f14765c, abstractC1137w);
            return this;
        }

        public final void t(AbstractC1137w abstractC1137w, AbstractC1137w abstractC1137w2) {
            a0.a().d(abstractC1137w).a(abstractC1137w, abstractC1137w2);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static class b extends AbstractC1117b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC1137w f14767b;

        public b(AbstractC1137w abstractC1137w) {
            this.f14767b = abstractC1137w;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends AbstractC1128m {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static AbstractC1139y.b A(AbstractC1139y.b bVar) {
        int size = bVar.size();
        return bVar.w(size == 0 ? 10 : size * 2);
    }

    public static Object C(O o9, String str, Object[] objArr) {
        return new c0(o9, str, objArr);
    }

    public static AbstractC1137w D(AbstractC1137w abstractC1137w, InputStream inputStream) {
        return n(E(abstractC1137w, AbstractC1123h.f(inputStream), C1130o.b()));
    }

    public static AbstractC1137w E(AbstractC1137w abstractC1137w, AbstractC1123h abstractC1123h, C1130o c1130o) throws C1140z {
        AbstractC1137w abstractC1137w2 = (AbstractC1137w) abstractC1137w.p(d.NEW_MUTABLE_INSTANCE);
        try {
            e0 e0VarD = a0.a().d(abstractC1137w2);
            e0VarD.b(abstractC1137w2, C1124i.P(abstractC1123h), c1130o);
            e0VarD.c(abstractC1137w2);
            return abstractC1137w2;
        } catch (IOException e9) {
            if (e9.getCause() instanceof C1140z) {
                throw ((C1140z) e9.getCause());
            }
            throw new C1140z(e9.getMessage()).i(abstractC1137w2);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof C1140z) {
                throw ((C1140z) e10.getCause());
            }
            throw e10;
        }
    }

    public static void F(Class cls, AbstractC1137w abstractC1137w) {
        defaultInstanceMap.put(cls, abstractC1137w);
    }

    public static AbstractC1137w n(AbstractC1137w abstractC1137w) throws C1140z {
        if (abstractC1137w == null || abstractC1137w.x()) {
            return abstractC1137w;
        }
        throw abstractC1137w.j().a().i(abstractC1137w);
    }

    public static AbstractC1139y.b t() {
        return b0.f();
    }

    public static AbstractC1137w u(Class cls) {
        AbstractC1137w abstractC1137wF = defaultInstanceMap.get(cls);
        if (abstractC1137wF == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1137wF = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (abstractC1137wF == null) {
            abstractC1137wF = ((AbstractC1137w) p0.i(cls)).f();
            if (abstractC1137wF == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC1137wF);
        }
        return abstractC1137wF;
    }

    public static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e9);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean y(AbstractC1137w abstractC1137w, boolean z9) {
        byte bByteValue = ((Byte) abstractC1137w.p(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = a0.a().d(abstractC1137w).d(abstractC1137w);
        if (z9) {
            abstractC1137w.q(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC1137w : null);
        }
        return zD;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final a e() {
        return (a) p(d.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.O
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a b() {
        a aVar = (a) p(d.NEW_BUILDER);
        aVar.s(this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public int d() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = a0.a().d(this).e(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (f().getClass().isInstance(obj)) {
            return a0.a().d(this).i(this, (AbstractC1137w) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public void g(AbstractC1125j abstractC1125j) {
        a0.a().d(this).h(this, C1126k.P(abstractC1125j));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1116a
    public int h() {
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i9 = this.memoizedHashCode;
        if (i9 != 0) {
            return i9;
        }
        int iG = a0.a().d(this).g(this);
        this.memoizedHashCode = iG;
        return iG;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1116a
    public void k(int i9) {
        this.memoizedSerializedSize = i9;
    }

    public Object m() {
        return p(d.BUILD_MESSAGE_INFO);
    }

    public final a o() {
        return (a) p(d.NEW_BUILDER);
    }

    public Object p(d dVar) {
        return s(dVar, null, null);
    }

    public Object q(d dVar, Object obj) {
        return s(dVar, obj, null);
    }

    public abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return Q.e(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC1137w f() {
        return (AbstractC1137w) p(d.GET_DEFAULT_INSTANCE);
    }

    public final boolean x() {
        return y(this, true);
    }

    public void z() {
        a0.a().d(this).c(this);
    }
}
