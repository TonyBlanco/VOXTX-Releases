package I5;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2911a;

    public s(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f2911a = list;
    }
}
