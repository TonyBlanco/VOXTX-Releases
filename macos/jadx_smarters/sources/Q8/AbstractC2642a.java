package q8;

import java.io.Serializable;
import k8.j;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;

/* JADX INFO: renamed from: q8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2642a implements InterfaceC2372d, InterfaceC2646e, Serializable {

    @Nullable
    private final InterfaceC2372d completion;

    public AbstractC2642a(InterfaceC2372d interfaceC2372d) {
        this.completion = interfaceC2372d;
    }

    @NotNull
    public InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d completion) {
        kotlin.jvm.internal.l.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @NotNull
    public InterfaceC2372d create(@NotNull InterfaceC2372d completion) {
        kotlin.jvm.internal.l.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public InterfaceC2646e getCallerFrame() {
        InterfaceC2372d interfaceC2372d = this.completion;
        if (interfaceC2372d instanceof InterfaceC2646e) {
            return (InterfaceC2646e) interfaceC2372d;
        }
        return null;
    }

    @Nullable
    public final InterfaceC2372d getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return AbstractC2648g.d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // o8.InterfaceC2372d
    public final void resumeWith(@NotNull Object obj) {
        Object objInvokeSuspend;
        InterfaceC2372d interfaceC2372d = this;
        while (true) {
            AbstractC2649h.b(interfaceC2372d);
            AbstractC2642a abstractC2642a = (AbstractC2642a) interfaceC2372d;
            InterfaceC2372d interfaceC2372d2 = abstractC2642a.completion;
            kotlin.jvm.internal.l.b(interfaceC2372d2);
            try {
                objInvokeSuspend = abstractC2642a.invokeSuspend(obj);
            } catch (Throwable th) {
                j.a aVar = k8.j.f43666c;
                obj = k8.j.b(k8.k.a(th));
            }
            if (objInvokeSuspend == AbstractC2512c.d()) {
                return;
            }
            obj = k8.j.b(objInvokeSuspend);
            abstractC2642a.releaseIntercepted();
            if (!(interfaceC2372d2 instanceof AbstractC2642a)) {
                interfaceC2372d2.resumeWith(obj);
                return;
            }
            interfaceC2372d = interfaceC2372d2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
