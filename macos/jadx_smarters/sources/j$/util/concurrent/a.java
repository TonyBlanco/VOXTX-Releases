package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
abstract class a extends p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f42297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    l f42298j;

    a(l[] lVarArr, int i9, int i10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i9, 0, i10);
        this.f42297i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.f42318b != null;
    }

    public final boolean hasNext() {
        return this.f42318b != null;
    }

    public final void remove() {
        l lVar = this.f42298j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f42298j = null;
        this.f42297i.g(lVar.f42310b, null, null);
    }
}
