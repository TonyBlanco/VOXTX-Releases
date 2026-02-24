package z2;

/* JADX INFO: renamed from: z2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3015c {
    public static AbstractC3015c d(int i9, Object obj) {
        return new C3013a(Integer.valueOf(i9), obj, EnumC3016d.DEFAULT);
    }

    public static AbstractC3015c e(Object obj) {
        return new C3013a(null, obj, EnumC3016d.DEFAULT);
    }

    public static AbstractC3015c f(int i9, Object obj) {
        return new C3013a(Integer.valueOf(i9), obj, EnumC3016d.VERY_LOW);
    }

    public static AbstractC3015c g(Object obj) {
        return new C3013a(null, obj, EnumC3016d.VERY_LOW);
    }

    public static AbstractC3015c h(Object obj) {
        return new C3013a(null, obj, EnumC3016d.HIGHEST);
    }

    public abstract Integer a();

    public abstract Object b();

    public abstract EnumC3016d c();
}
