package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1994l3 extends AbstractC1999m3 implements Consumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f42698b;

    C1994l3(int i9) {
        this.f42698b = new Object[i9];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i9 = this.f42709a;
        this.f42709a = i9 + 1;
        this.f42698b[i9] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }
}
