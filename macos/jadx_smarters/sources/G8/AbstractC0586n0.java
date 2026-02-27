package G8;

import java.io.Closeable;
import o8.AbstractC2370b;
import o8.g;

/* JADX INFO: renamed from: G8.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0586n0 extends H implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2347d = new a(null);

    /* JADX INFO: renamed from: G8.n0$a */
    public static final class a extends AbstractC2370b {

        /* JADX INFO: renamed from: G8.n0$a$a, reason: collision with other inner class name */
        public static final class C0040a extends kotlin.jvm.internal.m implements w8.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0040a f2348a = new C0040a();

            public C0040a() {
                super(1);
            }

            @Override // w8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC0586n0 invoke(g.b bVar) {
                if (bVar instanceof AbstractC0586n0) {
                    return (AbstractC0586n0) bVar;
                }
                return null;
            }
        }

        public a() {
            super(H.f2291c, C0040a.f2348a);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }
}
