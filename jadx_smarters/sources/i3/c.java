package i3;

import d3.InterfaceC1673j;
import d3.q;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41850b;

    public c(InterfaceC1673j interfaceC1673j, long j9) {
        super(interfaceC1673j);
        AbstractC1684a.a(interfaceC1673j.getPosition() >= j9);
        this.f41850b = j9;
    }

    @Override // d3.q, d3.InterfaceC1673j
    public long getLength() {
        return super.getLength() - this.f41850b;
    }

    @Override // d3.q, d3.InterfaceC1673j
    public long getPosition() {
        return super.getPosition() - this.f41850b;
    }

    @Override // d3.q, d3.InterfaceC1673j
    public long k() {
        return super.k() - this.f41850b;
    }

    @Override // d3.q, d3.InterfaceC1673j
    public void o(long j9, Throwable th) {
        super.o(j9 + this.f41850b, th);
    }
}
