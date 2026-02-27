package D8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends h {

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f1525a;

        public a(Iterator it) {
            this.f1525a = it;
        }

        @Override // D8.d
        public Iterator iterator() {
            return this.f1525a;
        }
    }

    public static d c(Iterator it) {
        kotlin.jvm.internal.l.e(it, "<this>");
        return d(new a(it));
    }

    public static final d d(d dVar) {
        kotlin.jvm.internal.l.e(dVar, "<this>");
        return dVar instanceof D8.a ? dVar : new D8.a(dVar);
    }
}
