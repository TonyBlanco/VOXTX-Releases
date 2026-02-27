package z2;

/* JADX INFO: renamed from: z2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3013a extends AbstractC3015c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f52657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC3016d f52659c;

    public C3013a(Integer num, Object obj, EnumC3016d enumC3016d) {
        this.f52657a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f52658b = obj;
        if (enumC3016d == null) {
            throw new NullPointerException("Null priority");
        }
        this.f52659c = enumC3016d;
    }

    @Override // z2.AbstractC3015c
    public Integer a() {
        return this.f52657a;
    }

    @Override // z2.AbstractC3015c
    public Object b() {
        return this.f52658b;
    }

    @Override // z2.AbstractC3015c
    public EnumC3016d c() {
        return this.f52659c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3015c)) {
            return false;
        }
        AbstractC3015c abstractC3015c = (AbstractC3015c) obj;
        Integer num = this.f52657a;
        if (num != null ? num.equals(abstractC3015c.a()) : abstractC3015c.a() == null) {
            if (this.f52658b.equals(abstractC3015c.b()) && this.f52659c.equals(abstractC3015c.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f52657a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f52658b.hashCode()) * 1000003) ^ this.f52659c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f52657a + ", payload=" + this.f52658b + ", priority=" + this.f52659c + "}";
    }
}
