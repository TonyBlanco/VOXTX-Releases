package P3;

import d4.AbstractC1684a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends com.google.android.exoplayer2.decoder.a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f7255a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7256c;

    @Override // P3.i
    public int a(long j9) {
        return ((i) AbstractC1684a.e(this.f7255a)).a(j9 - this.f7256c);
    }

    @Override // P3.i
    public List b(long j9) {
        return ((i) AbstractC1684a.e(this.f7255a)).b(j9 - this.f7256c);
    }

    @Override // P3.i
    public long c(int i9) {
        return ((i) AbstractC1684a.e(this.f7255a)).c(i9) + this.f7256c;
    }

    @Override // U2.a
    public void clear() {
        super.clear();
        this.f7255a = null;
    }

    public void d(long j9, i iVar, long j10) {
        this.timeUs = j9;
        this.f7255a = iVar;
        if (j10 != Long.MAX_VALUE) {
            j9 = j10;
        }
        this.f7256c = j9;
    }

    @Override // P3.i
    public int h() {
        return ((i) AbstractC1684a.e(this.f7255a)).h();
    }
}
