package z1;

/* JADX INFO: renamed from: z1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3008g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x1.d f52631a = x1.d.a();

    /* JADX INFO: renamed from: z1.g$a */
    public class a implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3011j f52632a;

        public a(C3011j c3011j) {
            this.f52632a = c3011j;
        }

        @Override // x1.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC3007f apply(AbstractC3008g abstractC3008g) {
            return abstractC3008g.b(this.f52632a);
        }
    }

    public abstract AbstractC3007f a(C3011j c3011j);

    public final AbstractC3007f b(C3011j c3011j) {
        return this.f52631a.f() ? a(c3011j).a((AbstractC3007f) this.f52631a.g(new a(c3011j)).e()) : a(c3011j);
    }
}
