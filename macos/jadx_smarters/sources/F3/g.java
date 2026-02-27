package F3;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f1972e;

    public g(String str, long j9, List list, List list2) {
        this(str, j9, list, list2, null);
    }

    public g(String str, long j9, List list, List list2, e eVar) {
        this.f1968a = str;
        this.f1969b = j9;
        this.f1970c = Collections.unmodifiableList(list);
        this.f1971d = Collections.unmodifiableList(list2);
        this.f1972e = eVar;
    }

    public int a(int i9) {
        int size = this.f1970c.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((a) this.f1970c.get(i10)).f1924b == i9) {
                return i10;
            }
        }
        return -1;
    }
}
