package j$.time;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f42120d = new r(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42123c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.k(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    private r(int i9, int i10, int i11) {
        this.f42121a = i9;
        this.f42122b = i10;
        this.f42123c = i11;
    }

    static r a(DataInput dataInput) throws IOException {
        int i9 = dataInput.readInt();
        int i10 = dataInput.readInt();
        int i11 = dataInput.readInt();
        return ((i9 | i10) | i11) == 0 ? f42120d : new r(i9, i10, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 14, this);
    }

    final void b(DataOutput dataOutput) {
        dataOutput.writeInt(this.f42121a);
        dataOutput.writeInt(this.f42122b);
        dataOutput.writeInt(this.f42123c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f42121a == rVar.f42121a && this.f42122b == rVar.f42122b && this.f42123c == rVar.f42123c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f42123c, 16) + Integer.rotateLeft(this.f42122b, 8) + this.f42121a;
    }

    public final String toString() {
        if (this == f42120d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i9 = this.f42121a;
        if (i9 != 0) {
            sb.append(i9);
            sb.append('Y');
        }
        int i10 = this.f42122b;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        int i11 = this.f42123c;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('D');
        }
        return sb.toString();
    }
}
