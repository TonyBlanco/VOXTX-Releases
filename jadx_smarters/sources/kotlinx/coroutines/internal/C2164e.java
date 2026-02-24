package kotlinx.coroutines.internal;

import G8.L;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2164e implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.g f43749a;

    public C2164e(o8.g gVar) {
        this.f43749a = gVar;
    }

    @Override // G8.L
    public o8.g t() {
        return this.f43749a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + t() + ')';
    }
}
