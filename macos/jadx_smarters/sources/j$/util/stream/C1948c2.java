package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1948c2 implements IntFunction, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42601a;

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i9 = this.f42601a;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f42601a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i9) {
        switch (this.f42601a) {
            case 0:
                return new Object[i9];
            case 1:
                return new Integer[i9];
            case 2:
                return new Long[i9];
            case 3:
                return new Double[i9];
            case 4:
            case 5:
            default:
                return new Double[i9];
            case 6:
                return new Integer[i9];
            case 7:
                return new Integer[i9];
            case 8:
                return new Long[i9];
            case 9:
                return new Long[i9];
            case 10:
                return new Double[i9];
        }
    }
}
