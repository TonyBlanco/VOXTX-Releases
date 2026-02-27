package g2;

import Z1.l;

/* JADX INFO: loaded from: classes.dex */
public class g implements l {

    public static class a implements T1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q1.a f41300a;

        public a(Q1.a aVar) {
            this.f41300a = aVar;
        }

        @Override // T1.c
        public void a() {
        }

        @Override // T1.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Q1.a b(O1.i iVar) {
            return this.f41300a;
        }

        @Override // T1.c
        public void cancel() {
        }

        @Override // T1.c
        public String getId() {
            return String.valueOf(this.f41300a.d());
        }
    }

    @Override // Z1.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T1.c a(Q1.a aVar, int i9, int i10) {
        return new a(aVar);
    }
}
