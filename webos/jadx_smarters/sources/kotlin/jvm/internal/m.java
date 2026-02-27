package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements h, Serializable {
    private final int arity;

    public m(int i9) {
        this.arity = i9;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strI = C.i(this);
        l.d(strI, "renderLambdaToString(this)");
        return strI;
    }
}
