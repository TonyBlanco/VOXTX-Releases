package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2016q0 extends AbstractC2035u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC2040v0 f42734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Predicate f42735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2016q0(EnumC2040v0 enumC2040v0, Predicate predicate) {
        super(enumC2040v0);
        this.f42734c = enumC2040v0;
        this.f42735d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f42757a) {
            return;
        }
        boolean zTest = this.f42735d.test(obj);
        EnumC2040v0 enumC2040v0 = this.f42734c;
        if (zTest == enumC2040v0.f42764a) {
            this.f42757a = true;
            this.f42758b = enumC2040v0.f42765b;
        }
    }
}
