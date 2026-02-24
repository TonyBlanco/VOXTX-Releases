package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2011p0 implements Supplier, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42730c;

    public /* synthetic */ C2011p0(int i9, Object obj, Object obj2) {
        this.f42728a = i9;
        this.f42729b = obj;
        this.f42730c = obj2;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f42728a) {
            case 1:
                ((C2004n3) this.f42729b).b((Consumer) this.f42730c, obj);
                break;
            case 2:
                if (obj != null) {
                    ((ConcurrentHashMap) this.f42730c).putIfAbsent(obj, Boolean.TRUE);
                } else {
                    ((AtomicBoolean) this.f42729b).set(true);
                }
                break;
            default:
                ((BiConsumer) this.f42729b).accept(this.f42730c, obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f42728a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C2016q0((EnumC2040v0) this.f42729b, (Predicate) this.f42730c);
    }
}
