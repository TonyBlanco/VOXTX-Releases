package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes4.dex */
public class k extends m {
    public final Void A() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    @Override // kotlinx.coroutines.internal.m
    public boolean t() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.m
    public /* bridge */ /* synthetic */ boolean u() {
        return ((Boolean) A()).booleanValue();
    }

    public final boolean z() {
        return o() == this;
    }
}
