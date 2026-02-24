package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC1905a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f42030d = new u();
    private static final long serialVersionUID = -1440403870442975015L;

    private u() {
    }

    public static boolean l(long j9) {
        return (3 & j9) == 0 && (j9 % 100 != 0 || j9 % 400 == 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final o A(int i9) {
        if (i9 == 0) {
            return v.BCE;
        }
        if (i9 == 1) {
            return v.CE;
        }
        throw new j$.time.c("Invalid era: " + i9);
    }

    @Override // j$.time.chrono.n
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.n
    public final InterfaceC1906b j(j$.time.temporal.o oVar) {
        return j$.time.h.E(oVar);
    }

    @Override // j$.time.chrono.AbstractC1905a, j$.time.chrono.n
    public final InterfaceC1909e m(LocalDateTime localDateTime) {
        return LocalDateTime.D(localDateTime);
    }

    @Override // j$.time.chrono.n
    public final String p() {
        return "iso8601";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC1915k x(Instant instant, ZoneId zoneId) {
        return j$.time.z.D(instant, zoneId);
    }
}
