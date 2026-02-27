package G8;

/* JADX INFO: loaded from: classes4.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f2306a = new U0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2307b = new ThreadLocal();

    public final AbstractC0574h0 a() {
        return (AbstractC0574h0) f2307b.get();
    }

    public final AbstractC0574h0 b() {
        ThreadLocal threadLocal = f2307b;
        AbstractC0574h0 abstractC0574h0 = (AbstractC0574h0) threadLocal.get();
        if (abstractC0574h0 != null) {
            return abstractC0574h0;
        }
        AbstractC0574h0 abstractC0574h0A = AbstractC0580k0.a();
        threadLocal.set(abstractC0574h0A);
        return abstractC0574h0A;
    }

    public final void c() {
        f2307b.set(null);
    }

    public final void d(AbstractC0574h0 abstractC0574h0) {
        f2307b.set(abstractC0574h0);
    }
}
