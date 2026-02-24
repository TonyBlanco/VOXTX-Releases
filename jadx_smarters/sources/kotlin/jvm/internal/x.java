package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x extends AbstractC2156c implements C8.i {
    public x(Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return getOwner().equals(xVar.getOwner()) && getName().equals(xVar.getName()) && getSignature().equals(xVar.getSignature()) && l.a(getBoundReceiver(), xVar.getBoundReceiver());
        }
        if (obj instanceof C8.i) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.AbstractC2156c
    public C8.i getReflected() {
        return (C8.i) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // C8.i
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // C8.i
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
