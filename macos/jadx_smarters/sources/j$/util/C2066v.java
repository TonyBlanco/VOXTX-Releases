package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2066v implements LongConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f42812a;

    public /* synthetic */ C2066v(Consumer consumer) {
        this.f42812a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j9) {
        this.f42812a.accept(Long.valueOf(j9));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }
}
