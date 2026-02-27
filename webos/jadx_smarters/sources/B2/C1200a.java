package b2;

import Z1.k;
import Z1.l;
import Z1.m;
import android.content.Context;

/* JADX INFO: renamed from: b2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1200a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f17465a;

    /* JADX INFO: renamed from: b2.a$a, reason: collision with other inner class name */
    public static class C0210a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f17466a = new k(500);

        @Override // Z1.m
        public void a() {
        }

        @Override // Z1.m
        public l b(Context context, Z1.c cVar) {
            return new C1200a(this.f17466a);
        }
    }

    public C1200a(k kVar) {
        this.f17465a = kVar;
    }

    @Override // Z1.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T1.c a(Z1.d dVar, int i9, int i10) {
        k kVar = this.f17465a;
        if (kVar != null) {
            Z1.d dVar2 = (Z1.d) kVar.a(dVar, 0, 0);
            if (dVar2 == null) {
                this.f17465a.b(dVar, 0, 0, dVar);
            } else {
                dVar = dVar2;
            }
        }
        return new T1.f(dVar);
    }
}
