package G8;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0605x0 f2312a;

    public X0(String str) {
        this(str, null);
    }

    public X0(String str, InterfaceC0605x0 interfaceC0605x0) {
        super(str);
        this.f2312a = interfaceC0605x0;
    }
}
