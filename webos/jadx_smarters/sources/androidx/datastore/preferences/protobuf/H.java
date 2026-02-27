package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14580c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0.b f14581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f14582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r0.b f14583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f14584d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f14581a = bVar;
            this.f14582b = obj;
            this.f14583c = bVar2;
            this.f14584d = obj2;
        }
    }

    public H(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f14578a = new a(bVar, obj, bVar2, obj2);
        this.f14579b = obj;
        this.f14580c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C1133s.b(aVar.f14581a, 1, obj) + C1133s.b(aVar.f14583c, 2, obj2);
    }

    public static H d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new H(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC1125j abstractC1125j, a aVar, Object obj, Object obj2) {
        C1133s.u(abstractC1125j, aVar.f14581a, 1, obj);
        C1133s.u(abstractC1125j, aVar.f14583c, 2, obj2);
    }

    public int a(int i9, Object obj, Object obj2) {
        return AbstractC1125j.P(i9) + AbstractC1125j.y(b(this.f14578a, obj, obj2));
    }

    public a c() {
        return this.f14578a;
    }
}
