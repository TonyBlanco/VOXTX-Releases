package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements IntConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f42385a;

    public /* synthetic */ r(Consumer consumer) {
        this.f42385a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        this.f42385a.accept(Integer.valueOf(i9));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }
}
