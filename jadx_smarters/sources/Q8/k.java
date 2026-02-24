package q8;

import kotlin.jvm.internal.C;
import o8.InterfaceC2372d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends AbstractC2651j implements kotlin.jvm.internal.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49614a;

    public k(int i9, InterfaceC2372d interfaceC2372d) {
        super(interfaceC2372d);
        this.f49614a = i9;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.f49614a;
    }

    @Override // q8.AbstractC2642a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = C.h(this);
        kotlin.jvm.internal.l.d(strH, "renderLambdaToString(this)");
        return strH;
    }
}
