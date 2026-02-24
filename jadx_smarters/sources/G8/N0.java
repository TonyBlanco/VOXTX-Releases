package G8;

/* JADX INFO: loaded from: classes4.dex */
public final class N0 extends AbstractC0569f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.internal.m f2299a;

    public N0(kotlinx.coroutines.internal.m mVar) {
        this.f2299a = mVar;
    }

    @Override // G8.AbstractC0583m
    public void a(Throwable th) {
        this.f2299a.u();
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return k8.q.f43674a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f2299a + ']';
    }
}
