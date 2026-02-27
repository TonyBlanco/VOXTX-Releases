package D8;

import java.util.Iterator;
import p8.AbstractC2511b;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f1524a;

        public a(p pVar) {
            this.f1524a = pVar;
        }

        @Override // D8.d
        public Iterator iterator() {
            return g.a(this.f1524a);
        }
    }

    public static Iterator a(p block) {
        kotlin.jvm.internal.l.e(block, "block");
        e eVar = new e();
        eVar.e(AbstractC2511b.b(block, eVar, eVar));
        return eVar;
    }

    public static d b(p block) {
        kotlin.jvm.internal.l.e(block, "block");
        return new a(block);
    }
}
