package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes2.dex */
final class s implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f42124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f42125b;

    public s() {
    }

    s(byte b9, Object obj) {
        this.f42124a = b9;
        this.f42125b = obj;
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b9, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b9) {
            case 1:
                Duration duration = Duration.f41956c;
                return Duration.q(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f41959c;
                return Instant.F(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.f42095d;
                return h.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.R(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f41962c;
                h hVar2 = h.f42095d;
                return LocalDateTime.K(h.N(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.R(objectInput));
            case 6:
                return z.G(objectInput);
            case 7:
                int i9 = x.f42166d;
                return ZoneId.D(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.N(objectInput);
            case 9:
                return q.E(objectInput);
            case 10:
                return OffsetDateTime.F(objectInput);
            case 11:
                int i10 = u.f42160b;
                return u.C(objectInput.readInt());
            case 12:
                return w.G(objectInput);
            case 13:
                return o.C(objectInput);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return r.a(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f42125b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b9 = objectInput.readByte();
        this.f42124a = b9;
        this.f42125b = b(b9, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b9 = this.f42124a;
        Object obj = this.f42125b;
        objectOutput.writeByte(b9);
        switch (b9) {
            case 1:
                ((Duration) obj).t(objectOutput);
                return;
            case 2:
                ((Instant) obj).I(objectOutput);
                return;
            case 3:
                ((h) obj).Z(objectOutput);
                return;
            case 4:
                ((k) obj).W(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).T(objectOutput);
                return;
            case 6:
                ((z) obj).J(objectOutput);
                return;
            case 7:
                ((x) obj).I(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).O(objectOutput);
                return;
            case 9:
                ((q) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((u) obj).G(objectOutput);
                return;
            case 12:
                ((w) obj).J(objectOutput);
                return;
            case 13:
                ((o) obj).D(objectOutput);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((r) obj).b(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
