package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1962f1 extends N0 implements C0 {
    @Override // j$.util.stream.C0
    public final K0 a() {
        int i9 = this.f42484b;
        Object[] objArr = this.f42483a;
        if (i9 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f42484b), Integer.valueOf(objArr.length)));
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
    public final /* synthetic */ void accept(long j9) {
        AbstractC2055y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void q(Object obj) {
        int i9 = this.f42484b;
        Object[] objArr = this.f42483a;
        if (i9 >= objArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
        }
        this.f42484b = 1 + i9;
        objArr[i9] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void l() {
        int i9 = this.f42484b;
        Object[] objArr = this.f42483a;
        if (i9 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f42484b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        Object[] objArr = this.f42483a;
        if (j9 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j9), Integer.valueOf(objArr.length)));
        }
        this.f42484b = 0;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // j$.util.stream.N0
    public final String toString() {
        Object[] objArr = this.f42483a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f42484b), Arrays.toString(objArr));
    }
}
