package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2017q1 extends C2012p1 implements B0 {
    @Override // j$.util.stream.B0, j$.util.stream.C0
    public final I0 a() {
        int i9 = this.f42732b;
        long[] jArr = this.f42731a;
        if (i9 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f42732b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.C0
    public final /* bridge */ /* synthetic */ K0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(int i9) {
        AbstractC2055y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        int i9 = this.f42732b;
        long[] jArr = this.f42731a;
        if (i9 >= jArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
        }
        this.f42732b = 1 + i9;
        jArr[i9] = j9;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2013p2
    public final /* synthetic */ void k(Long l9) {
        AbstractC2055y0.i(this, l9);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void l() {
        int i9 = this.f42732b;
        long[] jArr = this.f42731a;
        if (i9 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f42732b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        long[] jArr = this.f42731a;
        if (j9 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j9), Integer.valueOf(jArr.length)));
        }
        this.f42732b = 0;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // j$.util.stream.C2012p1
    public final String toString() {
        long[] jArr = this.f42731a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f42732b), Arrays.toString(jArr));
    }
}
