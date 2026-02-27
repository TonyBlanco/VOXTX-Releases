package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f41956c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f41957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41958b;

    static {
        BigInteger.valueOf(1000000000L);
    }

    private Duration(long j9, int i9) {
        this.f41957a = j9;
        this.f41958b = i9;
    }

    private static Duration i(long j9, int i9) {
        return (((long) i9) | j9) == 0 ? f41956c : new Duration(j9, i9);
    }

    public static Duration l(long j9) {
        return i(j9, 0);
    }

    public static Duration q(long j9, long j10) {
        return i(j$.com.android.tools.r8.a.i(j9, j$.com.android.tools.r8.a.n(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.m(j10, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f41957a, duration2.f41957a);
        return iCompare != 0 ? iCompare : this.f41958b - duration2.f41958b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f41957a == duration.f41957a && this.f41958b == duration.f41958b;
    }

    public final int hashCode() {
        long j9 = this.f41957a;
        return (this.f41958b * 51) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final long k() {
        return this.f41957a;
    }

    final void t(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f41957a);
        dataOutput.writeInt(this.f41958b);
    }

    public long toMillis() {
        long j9 = this.f41958b;
        long j10 = this.f41957a;
        if (j10 < 0) {
            j10++;
            j9 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.i(j$.com.android.tools.r8.a.o(j10, 1000), j9 / 1000000);
    }

    public final String toString() {
        if (this == f41956c) {
            return "PT0S";
        }
        long j9 = this.f41957a;
        int i9 = this.f41958b;
        long j10 = (j9 >= 0 || i9 <= 0) ? j9 : 1 + j9;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j11 != 0) {
            sb.append(j11);
            sb.append('H');
        }
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        if (i11 == 0 && i9 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j9 >= 0 || i9 <= 0 || i11 != 0) {
            sb.append(i11);
        } else {
            sb.append("-0");
        }
        if (i9 > 0) {
            int length = sb.length();
            sb.append(j9 < 0 ? 2000000000 - ((long) i9) : ((long) i9) + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
