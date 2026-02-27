package kotlinx.coroutines.scheduling;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f43810j = new c();

    public c() {
        super(l.f43822b, l.f43823c, l.f43824d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // G8.H
    public String toString() {
        return "Dispatchers.Default";
    }
}
