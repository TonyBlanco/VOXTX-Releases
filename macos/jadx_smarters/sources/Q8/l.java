package q8;

import kotlin.jvm.internal.C;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends AbstractC2645d implements kotlin.jvm.internal.h {
    private final int arity;

    public l(int i9, InterfaceC2372d interfaceC2372d) {
        super(interfaceC2372d);
        this.arity = i9;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = C.h(this);
        kotlin.jvm.internal.l.d(strH, "renderLambdaToString(this)");
        return strH;
    }
}
