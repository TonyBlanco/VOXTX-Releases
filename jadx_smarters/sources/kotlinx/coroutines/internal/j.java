package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final void a(int i9) {
        if (i9 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i9).toString());
    }
}
