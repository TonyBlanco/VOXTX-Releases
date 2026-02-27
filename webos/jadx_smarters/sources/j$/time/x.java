package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
final class x extends ZoneId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f42166d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j$.time.zone.f f42168c;

    x(String str, j$.time.zone.f fVar) {
        this.f42167b = str;
        this.f42168c = fVar;
    }

    static x H(String str, boolean z9) {
        j$.time.zone.f fVarA;
        Objects.a(str, "zoneId");
        int length = str.length();
        if (length < 2) {
            throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i9 == 0) && ((cCharAt < '0' || cCharAt > '9' || i9 == 0) && ((cCharAt != '~' || i9 == 0) && ((cCharAt != '.' || i9 == 0) && ((cCharAt != '_' || i9 == 0) && ((cCharAt != '+' || i9 == 0) && (cCharAt != '-' || i9 == 0))))))))) {
                throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        try {
            fVarA = j$.time.zone.j.a(str, true);
        } catch (j$.time.zone.g e9) {
            if (z9) {
                throw e9;
            }
            fVarA = null;
        }
        return new x(str, fVarA);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f C() {
        j$.time.zone.f fVar = this.f42168c;
        return fVar != null ? fVar : j$.time.zone.j.a(this.f42167b, false);
    }

    @Override // j$.time.ZoneId
    final void G(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f42167b);
    }

    final void I(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f42167b);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f42167b;
    }
}
