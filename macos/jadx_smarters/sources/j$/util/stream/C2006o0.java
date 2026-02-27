package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2006o0 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnumC2040v0 f42719b;

    public /* synthetic */ C2006o0(EnumC2040v0 enumC2040v0, int i9) {
        this.f42718a = i9;
        this.f42719b = enumC2040v0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f42718a) {
            case 0:
                return new C2025s0(this.f42719b);
            case 1:
                return new C2020r0(this.f42719b);
            default:
                return new C2030t0(this.f42719b);
        }
    }
}
