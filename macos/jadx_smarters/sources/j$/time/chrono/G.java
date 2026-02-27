package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class G implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f41987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f41988b;

    public G() {
    }

    G(byte b9, Object obj) {
        this.f41987a = b9;
        this.f41988b = obj;
    }

    private Object readResolve() {
        return this.f41988b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objI;
        byte b9 = objectInput.readByte();
        this.f41987a = b9;
        switch (b9) {
            case 1:
                int i9 = AbstractC1905a.f41996c;
                objI = AbstractC1905a.i(objectInput.readUTF());
                break;
            case 2:
                objI = ((InterfaceC1906b) objectInput.readObject()).s((j$.time.k) objectInput.readObject());
                break;
            case 3:
                objI = ((InterfaceC1909e) objectInput.readObject()).n((ZoneOffset) objectInput.readObject()).h((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = z.f42035d;
                int i10 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                x.f42033d.getClass();
                objI = new z(j$.time.h.N(i10, b10, b11));
                break;
            case 5:
                A a9 = A.f41977d;
                objI = A.A(objectInput.readByte());
                break;
            case 6:
                q qVar = (q) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                qVar.getClass();
                objI = s.K(qVar, i11, b12, b13);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                C.f41983d.getClass();
                objI = new E(j$.time.h.N(i12 + 1911, b14, b15));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b16 = objectInput.readByte();
                byte b17 = objectInput.readByte();
                I.f41990d.getClass();
                objI = new K(j$.time.h.N(i13 - 543, b16, b17));
                break;
            case 9:
                int i14 = C1912h.f42001e;
                objI = new C1912h(AbstractC1905a.i(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f41988b = objI;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b9 = this.f41987a;
        Object obj = this.f41988b;
        objectOutput.writeByte(b9);
        switch (b9) {
            case 1:
                objectOutput.writeUTF(((AbstractC1905a) obj).getId());
                return;
            case 2:
                ((C1911g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((m) obj).writeExternal(objectOutput);
                return;
            case 4:
                z zVar = (z) obj;
                zVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(zVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(zVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(zVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((A) obj).E(objectOutput);
                return;
            case 6:
                ((s) obj).writeExternal(objectOutput);
                return;
            case 7:
                E e9 = (E) obj;
                e9.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(e9, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(e9, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(e9, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                K k9 = (K) obj;
                k9.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(k9, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(k9, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(k9, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C1912h) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
