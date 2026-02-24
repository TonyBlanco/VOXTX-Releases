package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f42739b;

    public /* synthetic */ r(BiConsumer biConsumer, int i9) {
        this.f42738a = i9;
        this.f42739b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f42738a) {
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f42738a) {
            case 0:
                this.f42739b.accept(obj, obj2);
                break;
            case 1:
                this.f42739b.accept(obj, obj2);
                break;
            default:
                this.f42739b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
