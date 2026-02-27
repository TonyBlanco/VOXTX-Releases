package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2156c implements C8.b, Serializable {
    public static final Object NO_RECEIVER = a.f43682a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C8.b reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.c$a */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43682a = new a();
    }

    public AbstractC2156c(Object obj, Class cls, String str, String str2, boolean z9) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z9;
    }

    @Override // C8.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // C8.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C8.b compute() {
        C8.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C8.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract C8.b computeReflected();

    @Override // C8.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C8.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C.c(cls) : C.b(cls);
    }

    @Override // C8.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public C8.b getReflected() {
        C8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new v8.b();
    }

    @Override // C8.b
    public C8.m getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // C8.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // C8.b
    public C8.n getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // C8.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // C8.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // C8.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // C8.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
