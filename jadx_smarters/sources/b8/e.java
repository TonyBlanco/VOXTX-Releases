package B8;

import java.util.NoSuchElementException;
import l8.y;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f770a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f773e;

    public e(long j9, long j10, long j11) {
        this.f770a = j11;
        this.f771c = j10;
        boolean z9 = false;
        if (j11 <= 0 ? j9 >= j10 : j9 <= j10) {
            z9 = true;
        }
        this.f772d = z9;
        this.f773e = z9 ? j9 : j10;
    }

    @Override // l8.y
    public long b() {
        long j9 = this.f773e;
        if (j9 != this.f771c) {
            this.f773e = this.f770a + j9;
        } else {
            if (!this.f772d) {
                throw new NoSuchElementException();
            }
            this.f772d = false;
        }
        return j9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f772d;
    }
}
