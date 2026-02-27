package j$.time.chrono;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1912h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f42001e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f42002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f42003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f42004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f42005d;

    static {
        j$.com.android.tools.r8.a.k(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    C1912h(n nVar, int i9, int i10, int i11) {
        this.f42002a = nVar;
        this.f42003b = i9;
        this.f42004c = i10;
        this.f42005d = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f42002a.getId());
        dataOutput.writeInt(this.f42003b);
        dataOutput.writeInt(this.f42004c);
        dataOutput.writeInt(this.f42005d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1912h)) {
            return false;
        }
        C1912h c1912h = (C1912h) obj;
        if (this.f42003b == c1912h.f42003b && this.f42004c == c1912h.f42004c && this.f42005d == c1912h.f42005d) {
            if (((AbstractC1905a) this.f42002a).equals(c1912h.f42002a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC1905a) this.f42002a).hashCode() ^ (Integer.rotateLeft(this.f42005d, 16) + (Integer.rotateLeft(this.f42004c, 8) + this.f42003b));
    }

    public final String toString() {
        n nVar = this.f42002a;
        int i9 = this.f42005d;
        int i10 = this.f42004c;
        int i11 = this.f42003b;
        if (i11 == 0 && i10 == 0 && i9 == 0) {
            return ((AbstractC1905a) nVar).getId() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC1905a) nVar).getId());
        sb.append(" P");
        if (i11 != 0) {
            sb.append(i11);
            sb.append('Y');
        }
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append('D');
        }
        return sb.toString();
    }

    protected Object writeReplace() {
        return new G((byte) 9, this);
    }
}
