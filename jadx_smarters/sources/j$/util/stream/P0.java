package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
final class P0 extends R0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f42500k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(AbstractC1940b abstractC1940b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i9) {
        super(abstractC1940b, spliterator, longFunction, binaryOperator);
        this.f42500k = i9;
    }

    @Override // j$.util.stream.R0, j$.util.stream.AbstractC1955e
    protected final /* bridge */ /* synthetic */ Object a() {
        switch (this.f42500k) {
        }
        return a();
    }

    @Override // j$.util.stream.R0, j$.util.stream.AbstractC1955e
    protected final AbstractC1955e e(Spliterator spliterator) {
        switch (this.f42500k) {
        }
        return new R0(this, spliterator);
    }
}
