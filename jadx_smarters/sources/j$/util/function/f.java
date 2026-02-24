package j$.util.function;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f42369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f42370c;

    public /* synthetic */ f(Predicate predicate, Predicate predicate2, int i9) {
        this.f42368a = i9;
        this.f42369b = predicate;
        this.f42370c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f42368a) {
        }
        return j$.com.android.tools.r8.a.a(this, predicate);
    }

    public final Predicate negate() {
        switch (this.f42368a) {
        }
        return new a(this, 2);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f42368a) {
        }
        return j$.com.android.tools.r8.a.h(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f42368a) {
            case 0:
                return this.f42369b.test(obj) && this.f42370c.test(obj);
            default:
                return this.f42369b.test(obj) || this.f42370c.test(obj);
        }
    }
}
