package q8;

import o8.InterfaceC2372d;
import o8.InterfaceC2373e;
import o8.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: q8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2645d extends AbstractC2642a {

    @Nullable
    private final o8.g _context;

    @Nullable
    private transient InterfaceC2372d intercepted;

    public AbstractC2645d(InterfaceC2372d interfaceC2372d) {
        this(interfaceC2372d, interfaceC2372d != null ? interfaceC2372d.getContext() : null);
    }

    public AbstractC2645d(InterfaceC2372d interfaceC2372d, o8.g gVar) {
        super(interfaceC2372d);
        this._context = gVar;
    }

    @Override // o8.InterfaceC2372d
    @NotNull
    public o8.g getContext() {
        o8.g gVar = this._context;
        kotlin.jvm.internal.l.b(gVar);
        return gVar;
    }

    @NotNull
    public final InterfaceC2372d intercepted() {
        InterfaceC2372d interfaceC2372dO = this.intercepted;
        if (interfaceC2372dO == null) {
            InterfaceC2373e interfaceC2373e = (InterfaceC2373e) getContext().a(InterfaceC2373e.f46141d0);
            if (interfaceC2373e == null || (interfaceC2372dO = interfaceC2373e.o(this)) == null) {
                interfaceC2372dO = this;
            }
            this.intercepted = interfaceC2372dO;
        }
        return interfaceC2372dO;
    }

    @Override // q8.AbstractC2642a
    public void releaseIntercepted() {
        InterfaceC2372d interfaceC2372d = this.intercepted;
        if (interfaceC2372d != null && interfaceC2372d != this) {
            g.b bVarA = getContext().a(InterfaceC2373e.f46141d0);
            kotlin.jvm.internal.l.b(bVarA);
            ((InterfaceC2373e) bVarA).T(interfaceC2372d);
        }
        this.intercepted = C2644c.f49607a;
    }
}
