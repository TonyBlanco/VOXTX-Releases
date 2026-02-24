package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1906b extends j$.time.temporal.m, j$.time.temporal.p, Comparable {
    n a();

    @Override // j$.time.temporal.m
    InterfaceC1906b d(long j9, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    InterfaceC1906b e(long j9, j$.time.temporal.u uVar);

    @Override // j$.time.temporal.o
    boolean f(j$.time.temporal.r rVar);

    int hashCode();

    long r();

    InterfaceC1909e s(j$.time.k kVar);

    String toString();

    /* JADX INFO: renamed from: z */
    int compareTo(InterfaceC1906b interfaceC1906b);
}
