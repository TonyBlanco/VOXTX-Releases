package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bqj;
import com.google.ads.interactivemedia.v3.internal.bqn;
import com.google.android.gms.common.api.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bqn<MessageType extends bqn<MessageType, BuilderType>, BuilderType extends bqj<MessageType, BuilderType>> extends bon<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f22108a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22110d = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected bsx f22109c = bsx.c();

    public static bqn aB(bqn bqnVar, bpb bpbVar) throws bqw {
        bqb bqbVar = bqb.f22027a;
        bpg bpgVarL = bpbVar.l();
        bqn bqnVarAA = bqnVar.aA();
        try {
            bsi bsiVarC = bsa.a().c(bqnVarAA);
            bsiVarC.h(bqnVarAA, bpi.q(bpgVarL), bqbVar);
            bsiVarC.f(bqnVarAA);
            bpgVarL.z(0);
            e(bqnVarAA);
            e(bqnVarAA);
            return bqnVarAA;
        } catch (bqw e9) {
            if (e9.k()) {
                throw new bqw(e9);
            }
            throw e9;
        } catch (bsw e10) {
            throw e10.a();
        } catch (IOException e11) {
            if (e11.getCause() instanceof bqw) {
                throw ((bqw) e11.getCause());
            }
            throw new bqw(e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof bqw) {
                throw ((bqw) e12.getCause());
            }
            throw e12;
        }
    }

    public static bqn aC(bqn bqnVar, bpb bpbVar, bqb bqbVar) throws bqw {
        bpg bpgVarL = bpbVar.l();
        bqn bqnVarAA = bqnVar.aA();
        try {
            bsi bsiVarC = bsa.a().c(bqnVarAA);
            bsiVarC.h(bqnVarAA, bpi.q(bpgVarL), bqbVar);
            bsiVarC.f(bqnVarAA);
            bpgVarL.z(0);
            e(bqnVarAA);
            return bqnVarAA;
        } catch (bqw e9) {
            if (e9.k()) {
                throw new bqw(e9);
            }
            throw e9;
        } catch (bsw e10) {
            throw e10.a();
        } catch (IOException e11) {
            if (e11.getCause() instanceof bqw) {
                throw ((bqw) e11.getCause());
            }
            throw new bqw(e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof bqw) {
                throw ((bqw) e12.getCause());
            }
            throw e12;
        }
    }

    public static bqn aD(bqn bqnVar, byte[] bArr, bqb bqbVar) throws bqw {
        bqn bqnVarF = f(bqnVar, bArr, bArr.length, bqbVar);
        e(bqnVarF);
        return bqnVarF;
    }

    public static bqs aE() {
        return bqo.f();
    }

    public static bqt aF() {
        return bsb.e();
    }

    public static bqt aG(bqt bqtVar) {
        int size = bqtVar.size();
        return bqtVar.d(size == 0 ? 10 : size + size);
    }

    public static Object aH(Method method, Object obj, Object... objArr) {
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

    public static Object aI(brs brsVar, String str, Object[] objArr) {
        return new bsc(brsVar, str, objArr);
    }

    public static void aL(Class cls, bqn bqnVar) {
        f22108a.put(cls, bqnVar);
        bqnVar.aJ();
    }

    public static final boolean aN(bqn bqnVar, boolean z9) {
        byte bByteValue = ((Byte) bqnVar.aP(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zL = bsa.a().c(bqnVar).l(bqnVar);
        if (z9) {
            bqnVar.i(2, true != zL ? null : bqnVar);
        }
        return zL;
    }

    public static bpz aQ(brs brsVar, Object obj, brs brsVar2, bqq bqqVar, int i9, btk btkVar, Class cls) {
        return new bpz(brsVar, brsVar2, new bqm(bqqVar, i9, btkVar, false));
    }

    public static bpz aR(brs brsVar, brs brsVar2, int i9, btk btkVar, Class cls) {
        Collections.emptyList();
        return new bpz(brsVar, brsVar2, new bqm(null, i9, btkVar, true));
    }

    public static bqn az(Class cls) {
        Map map = f22108a;
        bqn bqnVar = (bqn) map.get(cls);
        if (bqnVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                bqnVar = (bqn) map.get(cls);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException("Class initialization cannot fail.", e9);
            }
        }
        if (bqnVar == null) {
            bqnVar = (bqn) ((bqn) btf.g(cls)).aP(6);
            if (bqnVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, bqnVar);
        }
        return bqnVar;
    }

    private final int c(bsi bsiVar) {
        return bsiVar == null ? bsa.a().c(this).a(this) : bsiVar.a(this);
    }

    private static void e(bqn bqnVar) throws bqw {
        if (bqnVar != null && !bqnVar.bd()) {
            throw new bsw().a();
        }
    }

    private static bqn f(bqn bqnVar, byte[] bArr, int i9, bqb bqbVar) throws bqw {
        bqn bqnVarAA = bqnVar.aA();
        try {
            bsi bsiVarC = bsa.a().c(bqnVarAA);
            bsiVarC.i(bqnVarAA, bArr, 0, i9, new boq(bqbVar));
            bsiVarC.f(bqnVarAA);
            return bqnVarAA;
        } catch (bqw e9) {
            if (e9.k()) {
                throw new bqw(e9);
            }
            throw e9;
        } catch (bsw e10) {
            throw e10.a();
        } catch (IOException e11) {
            if (e11.getCause() instanceof bqw) {
                throw ((bqw) e11.getCause());
            }
            throw new bqw(e11);
        } catch (IndexOutOfBoundsException unused) {
            throw bqw.i();
        }
    }

    public final bqn aA() {
        return (bqn) aP(4);
    }

    public final void aJ() {
        bsa.a().c(this).f(this);
        aK();
    }

    public final void aK() {
        this.f22110d &= a.e.API_PRIORITY_OTHER;
    }

    public final void aM(int i9) {
        this.f22110d = (this.f22110d & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    public final boolean aO() {
        return (this.f22110d & Integer.MIN_VALUE) != 0;
    }

    public final Object aP(int i9) {
        return i(i9, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bon
    public final int at(bsi bsiVar) {
        if (aO()) {
            int iC = c(bsiVar);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iC);
        }
        int i9 = this.f22110d & a.e.API_PRIORITY_OTHER;
        if (i9 != Integer.MAX_VALUE) {
            return i9;
        }
        int iC2 = c(bsiVar);
        if (iC2 >= 0) {
            this.f22110d = (this.f22110d & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iC2);
    }

    public final int aw() {
        return bsa.a().c(this).b(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brs
    public final int ax() {
        int iC;
        if (aO()) {
            iC = c(null);
            if (iC < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iC);
            }
        } else {
            iC = this.f22110d & a.e.API_PRIORITY_OTHER;
            if (iC == Integer.MAX_VALUE) {
                iC = c(null);
                if (iC < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iC);
                }
                this.f22110d = (this.f22110d & Integer.MIN_VALUE) | iC;
            }
        }
        return iC;
    }

    public final bqj ay() {
        return (bqj) aP(5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brt
    public final /* synthetic */ brs ba() {
        return (bqn) aP(6);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brt
    public final boolean bd() {
        return aN(this, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brs
    public final /* synthetic */ brr bp() {
        return (bqj) aP(5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brs
    public final /* synthetic */ brr bq() {
        bqj bqjVar = (bqj) aP(5);
        bqjVar.be(this);
        return bqjVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brs
    public final void br(bpk bpkVar) throws IOException {
        bsa.a().c(this).j(this, bpl.a(bpkVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return bsa.a().c(this).k(this, (bqn) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (aO()) {
            return aw();
        }
        int i9 = this.f21854b;
        if (i9 != 0) {
            return i9;
        }
        int iAw = aw();
        this.f21854b = iAw;
        return iAw;
    }

    public abstract Object i(int i9, Object obj);

    public final String toString() {
        return bru.a(this, super.toString());
    }
}
