package j$.util.function;

import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f42362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f42363c;

    public /* synthetic */ c(Function function, Function function2, int i9) {
        this.f42361a = i9;
        this.f42362b = function;
        this.f42363c = function2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f42361a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f42361a) {
            case 0:
                return this.f42363c.apply(this.f42362b.apply(obj));
            default:
                return this.f42362b.apply(this.f42363c.apply(obj));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f42361a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
