package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* JADX INFO: loaded from: classes2.dex */
final class A1 extends AbstractC2055y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f42387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f42388i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A1(EnumC1964f3 enumC1964f3, LongBinaryOperator longBinaryOperator, long j9) {
        super(enumC1964f3);
        this.f42387h = longBinaryOperator;
        this.f42388i = j9;
    }

    @Override // j$.util.stream.AbstractC2055y0
    public final U1 e0() {
        return new S1(this.f42388i, this.f42387h);
    }
}
