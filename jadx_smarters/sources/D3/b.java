package D3;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1355d;

    public b(long j9, long j10) {
        this.f1353b = j9;
        this.f1354c = j10;
        f();
    }

    public final void c() {
        long j9 = this.f1355d;
        if (j9 < this.f1353b || j9 > this.f1354c) {
            throw new NoSuchElementException();
        }
    }

    public final long d() {
        return this.f1355d;
    }

    public boolean e() {
        return this.f1355d > this.f1354c;
    }

    public void f() {
        this.f1355d = this.f1353b - 1;
    }

    @Override // D3.o
    public boolean next() {
        this.f1355d++;
        return !e();
    }
}
