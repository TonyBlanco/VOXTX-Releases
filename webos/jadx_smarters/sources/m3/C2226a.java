package m3;

import O2.C0897l1;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1675l;
import d3.InterfaceC1673j;
import d3.u;
import d4.AbstractC1684a;
import d4.k0;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: m3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2226a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f44321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f44324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f44326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f44328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f44329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f44330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f44331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f44332l;

    /* JADX INFO: renamed from: m3.a$b */
    public final class b implements com.google.android.exoplayer2.extractor.g {
        public b() {
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public g.a e(long j9) {
            return new g.a(new u(j9, k0.s((C2226a.this.f44322b + BigInteger.valueOf(C2226a.this.f44324d.c(j9)).multiply(BigInteger.valueOf(C2226a.this.f44323c - C2226a.this.f44322b)).divide(BigInteger.valueOf(C2226a.this.f44326f)).longValue()) - 30000, C2226a.this.f44322b, C2226a.this.f44323c - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public boolean g() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public long i() {
            return C2226a.this.f44324d.b(C2226a.this.f44326f);
        }
    }

    public C2226a(i iVar, long j9, long j10, long j11, long j12, boolean z9) {
        AbstractC1684a.a(j9 >= 0 && j10 > j9);
        this.f44324d = iVar;
        this.f44322b = j9;
        this.f44323c = j10;
        if (j11 == j10 - j9 || z9) {
            this.f44326f = j12;
            this.f44325e = 4;
        } else {
            this.f44325e = 0;
        }
        this.f44321a = new f();
    }

    @Override // m3.g
    public long a(InterfaceC1673j interfaceC1673j) throws IOException {
        int i9 = this.f44325e;
        if (i9 == 0) {
            long position = interfaceC1673j.getPosition();
            this.f44327g = position;
            this.f44325e = 1;
            long j9 = this.f44323c - 65307;
            if (j9 > position) {
                return j9;
            }
        } else if (i9 != 1) {
            if (i9 == 2) {
                long jI = i(interfaceC1673j);
                if (jI != -1) {
                    return jI;
                }
                this.f44325e = 3;
            } else if (i9 != 3) {
                if (i9 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC1673j);
            this.f44325e = 4;
            return -(this.f44331k + 2);
        }
        this.f44326f = j(interfaceC1673j);
        this.f44325e = 4;
        return this.f44327g;
    }

    @Override // m3.g
    public void c(long j9) {
        this.f44328h = k0.s(j9, 0L, this.f44326f - 1);
        this.f44325e = 2;
        this.f44329i = this.f44322b;
        this.f44330j = this.f44323c;
        this.f44331k = 0L;
        this.f44332l = this.f44326f;
    }

    @Override // m3.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f44326f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(InterfaceC1673j interfaceC1673j) throws IOException {
        if (this.f44329i == this.f44330j) {
            return -1L;
        }
        long position = interfaceC1673j.getPosition();
        if (!this.f44321a.d(interfaceC1673j, this.f44330j)) {
            long j9 = this.f44329i;
            if (j9 != position) {
                return j9;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f44321a.a(interfaceC1673j, false);
        interfaceC1673j.f();
        long j10 = this.f44328h;
        f fVar = this.f44321a;
        long j11 = fVar.f44351c;
        long j12 = j10 - j11;
        int i9 = fVar.f44356h + fVar.f44357i;
        if (0 <= j12 && j12 < 72000) {
            return -1L;
        }
        if (j12 < 0) {
            this.f44330j = position;
            this.f44332l = j11;
        } else {
            this.f44329i = interfaceC1673j.getPosition() + ((long) i9);
            this.f44331k = this.f44321a.f44351c;
        }
        long j13 = this.f44330j;
        long j14 = this.f44329i;
        if (j13 - j14 < 100000) {
            this.f44330j = j14;
            return j14;
        }
        long position2 = interfaceC1673j.getPosition() - (((long) i9) * (j12 <= 0 ? 2L : 1L));
        long j15 = this.f44330j;
        long j16 = this.f44329i;
        return k0.s(position2 + ((j12 * (j15 - j16)) / (this.f44332l - this.f44331k)), j16, j15 - 1);
    }

    public long j(InterfaceC1673j interfaceC1673j) throws C0897l1, EOFException {
        long j9;
        f fVar;
        this.f44321a.b();
        if (!this.f44321a.c(interfaceC1673j)) {
            throw new EOFException();
        }
        this.f44321a.a(interfaceC1673j, false);
        f fVar2 = this.f44321a;
        interfaceC1673j.q(fVar2.f44356h + fVar2.f44357i);
        do {
            j9 = this.f44321a.f44351c;
            f fVar3 = this.f44321a;
            if ((fVar3.f44350b & 4) == 4 || !fVar3.c(interfaceC1673j) || interfaceC1673j.getPosition() >= this.f44323c || !this.f44321a.a(interfaceC1673j, true)) {
                break;
            }
            fVar = this.f44321a;
        } while (AbstractC1675l.e(interfaceC1673j, fVar.f44356h + fVar.f44357i));
        return j9;
    }

    public final void k(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        while (true) {
            this.f44321a.c(interfaceC1673j);
            this.f44321a.a(interfaceC1673j, false);
            f fVar = this.f44321a;
            if (fVar.f44351c > this.f44328h) {
                interfaceC1673j.f();
                return;
            } else {
                interfaceC1673j.q(fVar.f44356h + fVar.f44357i);
                this.f44329i = interfaceC1673j.getPosition();
                this.f44331k = this.f44321a.f44351c;
            }
        }
    }
}
