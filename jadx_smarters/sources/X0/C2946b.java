package x0;

import androidx.navigation.l;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: x0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2946b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f51867a;

    /* JADX INFO: renamed from: x0.b$b, reason: collision with other inner class name */
    public static final class C0477b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f51868a;

        public C0477b(l lVar) {
            HashSet hashSet = new HashSet();
            this.f51868a = hashSet;
            hashSet.add(Integer.valueOf(AbstractC2947c.a(lVar).i()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2946b a() {
            return new C2946b(this.f51868a, null, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: x0.b$c */
    public interface c {
    }

    public C2946b(Set set, W.c cVar, c cVar2) {
        this.f51867a = set;
    }

    public c a() {
        return null;
    }

    public W.c b() {
        return null;
    }

    public Set c() {
        return this.f51867a;
    }
}
