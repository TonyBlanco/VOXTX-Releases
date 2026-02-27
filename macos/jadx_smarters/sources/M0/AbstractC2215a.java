package m0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: m0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2215a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f44277a = new LinkedHashMap();

    /* JADX INFO: renamed from: m0.a$a, reason: collision with other inner class name */
    public static final class C0379a extends AbstractC2215a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0379a f44278b = new C0379a();

        @Override // m0.AbstractC2215a
        public Object a(b key) {
            l.e(key, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: m0.a$b */
    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f44277a;
    }
}
