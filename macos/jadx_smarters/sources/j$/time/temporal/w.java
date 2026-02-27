package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f42158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f42159d;

    private w(long j9, long j10, long j11, long j12) {
        this.f42156a = j9;
        this.f42157b = j10;
        this.f42158c = j11;
        this.f42159d = j12;
    }

    private String c(long j9, r rVar) {
        if (rVar == null) {
            return "Invalid value (valid values " + this + "): " + j9;
        }
        return "Invalid value for " + rVar + " (valid values " + this + "): " + j9;
    }

    public static w j(long j9, long j10) {
        if (j9 <= j10) {
            return new w(j9, j9, j10, j10);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static w k(long j9, long j10) {
        if (j9 > j10) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 <= j10) {
            return new w(1L, 1L, j9, j10);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j9 = this.f42156a;
        long j10 = this.f42157b;
        if (j9 > j10) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j11 = this.f42158c;
        long j12 = this.f42159d;
        if (j11 > j12) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j10 > j12) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j9, r rVar) {
        if (h() && i(j9)) {
            return (int) j9;
        }
        throw new j$.time.c(c(j9, rVar));
    }

    public final void b(long j9, r rVar) {
        if (!i(j9)) {
            throw new j$.time.c(c(j9, rVar));
        }
    }

    public final long d() {
        return this.f42159d;
    }

    public final long e() {
        return this.f42156a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f42156a == wVar.f42156a && this.f42157b == wVar.f42157b && this.f42158c == wVar.f42158c && this.f42159d == wVar.f42159d;
    }

    public final long f() {
        return this.f42158c;
    }

    public final boolean g() {
        return this.f42156a == this.f42157b && this.f42158c == this.f42159d;
    }

    public final boolean h() {
        return this.f42156a >= -2147483648L && this.f42159d <= 2147483647L;
    }

    public final int hashCode() {
        long j9 = this.f42157b;
        long j10 = this.f42156a + (j9 << 16) + (j9 >> 48);
        long j11 = this.f42158c;
        long j12 = j10 + (j11 << 32) + (j11 >> 32);
        long j13 = this.f42159d;
        long j14 = j12 + (j13 << 48) + (j13 >> 16);
        return (int) ((j14 >>> 32) ^ j14);
    }

    public final boolean i(long j9) {
        return j9 >= this.f42156a && j9 <= this.f42159d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j9 = this.f42156a;
        sb.append(j9);
        long j10 = this.f42157b;
        if (j9 != j10) {
            sb.append('/');
            sb.append(j10);
        }
        sb.append(" - ");
        long j11 = this.f42158c;
        sb.append(j11);
        long j12 = this.f42159d;
        if (j11 != j12) {
            sb.append('/');
            sb.append(j12);
        }
        return sb.toString();
    }
}
