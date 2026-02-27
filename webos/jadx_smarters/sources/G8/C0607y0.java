package G8;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: G8.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0607y0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0605x0 f2368a;

    public C0607y0(String str, Throwable th, InterfaceC0605x0 interfaceC0605x0) {
        super(str);
        this.f2368a = interfaceC0605x0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0607y0) {
                C0607y0 c0607y0 = (C0607y0) obj;
                if (!kotlin.jvm.internal.l.a(c0607y0.getMessage(), getMessage()) || !kotlin.jvm.internal.l.a(c0607y0.f2368a, this.f2368a) || !kotlin.jvm.internal.l.a(c0607y0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.l.b(message);
        int iHashCode = ((message.hashCode() * 31) + this.f2368a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f2368a;
    }
}
