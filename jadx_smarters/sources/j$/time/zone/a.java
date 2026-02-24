package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f42173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f42174b;

    public a() {
    }

    a(byte b9, Object obj) {
        this.f42173a = b9;
        this.f42174b = obj;
    }

    static long a(DataInput dataInput) {
        int i9 = dataInput.readByte() & 255;
        if (i9 == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i9 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    static ZoneOffset b(DataInput dataInput) throws IOException {
        byte b9 = dataInput.readByte();
        return b9 == 127 ? ZoneOffset.L(dataInput.readInt()) : ZoneOffset.L(b9 * 900);
    }

    static void c(long j9, DataOutput dataOutput) {
        if (j9 < -4575744000L || j9 >= 10413792000L || j9 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j9);
        } else {
            int i9 = (int) ((j9 + 4575744000L) / 900);
            dataOutput.writeByte((i9 >>> 16) & 255);
            dataOutput.writeByte((i9 >>> 8) & 255);
            dataOutput.writeByte(i9 & 255);
        }
    }

    static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int I9 = zoneOffset.I();
        int i9 = I9 % 900 == 0 ? I9 / 900 : 127;
        dataOutput.writeByte(i9);
        if (i9 == 127) {
            dataOutput.writeInt(I9);
        }
    }

    private Object readResolve() {
        return this.f42174b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objK;
        byte b9 = objectInput.readByte();
        this.f42173a = b9;
        if (b9 == 1) {
            objK = f.k(objectInput);
        } else if (b9 == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            objK = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b9 == 3) {
            objK = e.b(objectInput);
        } else {
            if (b9 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            objK = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f42174b = objK;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b9 = this.f42173a;
        Object obj = this.f42174b;
        objectOutput.writeByte(b9);
        if (b9 == 1) {
            ((f) obj).l(objectOutput);
            return;
        }
        if (b9 == 2) {
            ((b) obj).C(objectOutput);
        } else if (b9 == 3) {
            ((e) obj).c(objectOutput);
        } else {
            if (b9 != 100) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((f) obj).m(objectOutput);
        }
    }
}
