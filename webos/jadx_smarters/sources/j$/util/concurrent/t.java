package j$.util.concurrent;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, BiFunction, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42337c;

    public /* synthetic */ t(int i9, Object obj, Object obj2) {
        this.f42335a = i9;
        this.f42336b = obj;
        this.f42337c = obj2;
    }

    public /* synthetic */ t(BiFunction biFunction, Function function) {
        this.f42335a = 2;
        this.f42337c = biFunction;
        this.f42336b = function;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f42336b).accept(obj);
        ((Consumer) this.f42337c).accept(obj);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f42335a) {
            case 0:
                break;
            default:
                ((BiConsumer) this.f42336b).accept(obj, obj2);
                ((BiConsumer) this.f42337c).accept(obj, obj2);
                return;
        }
        do {
            Object objApply = ((BiFunction) this.f42337c).apply(obj, obj2);
            java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) this.f42336b;
            if (concurrentMap.replace(obj, obj2, objApply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f42335a) {
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f42336b).apply(((BiFunction) this.f42337c).apply(obj, obj2));
    }
}
