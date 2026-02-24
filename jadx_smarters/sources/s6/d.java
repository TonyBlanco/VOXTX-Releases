package s6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d f50169b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f50170a = new HashSet();

    public static d a() {
        d dVar = f50169b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f50169b;
                    if (dVar == null) {
                        dVar = new d();
                        f50169b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    public Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f50170a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f50170a);
        }
        return setUnmodifiableSet;
    }
}
