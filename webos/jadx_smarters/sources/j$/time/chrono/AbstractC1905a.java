package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.ServiceLoader;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1905a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f41994a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f41995b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f41996c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    protected AbstractC1905a() {
    }

    static n i(String str) {
        Objects.a(str, Name.MARK);
        while (true) {
            ConcurrentHashMap concurrentHashMap = f41994a;
            n nVar = (n) concurrentHashMap.get(str);
            if (nVar == null) {
                nVar = (n) f41995b.get(str);
            }
            if (nVar != null) {
                return nVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (n nVar2 : ServiceLoader.load(n.class)) {
                    if (str.equals(nVar2.getId()) || str.equals(nVar2.p())) {
                        return nVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: ".concat(str));
            }
            q qVar = q.f42012o;
            k(qVar, qVar.getId());
            x xVar = x.f42033d;
            xVar.getClass();
            k(xVar, "Japanese");
            C c9 = C.f41983d;
            c9.getClass();
            k(c9, "Minguo");
            I i9 = I.f41990d;
            i9.getClass();
            k(i9, "ThaiBuddhist");
            for (AbstractC1905a abstractC1905a : ServiceLoader.load(AbstractC1905a.class, null)) {
                if (!abstractC1905a.getId().equals("ISO")) {
                    k(abstractC1905a, abstractC1905a.getId());
                }
            }
            u uVar = u.f42030d;
            uVar.getClass();
            k(uVar, "ISO");
        }
    }

    static n k(n nVar, String str) {
        String strP;
        n nVar2 = (n) f41994a.putIfAbsent(str, nVar);
        if (nVar2 == null && (strP = nVar.p()) != null) {
            f41995b.putIfAbsent(strP, nVar);
        }
        return nVar2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((n) obj).getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1905a) && getId().compareTo(((AbstractC1905a) obj).getId()) == 0;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.n
    public InterfaceC1909e m(LocalDateTime localDateTime) {
        try {
            return j(localDateTime).s(j$.time.k.E(localDateTime));
        } catch (j$.time.c e9) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e9);
        }
    }

    public final String toString() {
        return getId();
    }
}
