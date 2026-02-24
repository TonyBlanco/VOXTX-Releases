package j$.util.function;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements BinaryOperator, Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42358b;

    public /* synthetic */ a(Object obj, int i9) {
        this.f42357a = i9;
        this.f42358b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j$.com.android.tools.r8.a.a(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f42357a) {
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f42357a) {
            case 0:
                if (((Comparator) this.f42358b).compare(obj, obj2) < 0) {
                    break;
                }
                break;
            default:
                if (((Comparator) this.f42358b).compare(obj, obj2) > 0) {
                    break;
                }
                break;
        }
        return obj2;
    }

    public Predicate negate() {
        return new a(this, 2);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j$.com.android.tools.r8.a.h(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f42358b).test(obj);
    }
}
