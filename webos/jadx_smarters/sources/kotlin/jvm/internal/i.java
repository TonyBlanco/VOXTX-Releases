package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends AbstractC2156c implements h, C8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43691a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43692c;

    public i(int i9, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f43691a = i9;
        this.f43692c = i10 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC2156c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8.e getReflected() {
        return (C8.e) super.getReflected();
    }

    @Override // kotlin.jvm.internal.AbstractC2156c
    public C8.b computeReflected() {
        return C.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.f43692c == iVar.f43692c && this.f43691a == iVar.f43691a && l.a(getBoundReceiver(), iVar.getBoundReceiver()) && l.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof C8.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.f43691a;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.jvm.internal.AbstractC2156c, C8.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
