package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class a extends b implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final a f41975b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ZoneId f41976a;

    static {
        System.currentTimeMillis();
        f41975b = new a(ZoneOffset.UTC);
    }

    a(ZoneId zoneId) {
        this.f41976a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.b
    public final long a() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f41976a.equals(((a) obj).f41976a);
    }

    public final int hashCode() {
        return this.f41976a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f41976a + "]";
    }
}
