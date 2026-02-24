package F3;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f1927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f1928f;

    public a(int i9, int i10, List list, List list2, List list3, List list4) {
        this.f1923a = i9;
        this.f1924b = i10;
        this.f1925c = Collections.unmodifiableList(list);
        this.f1926d = Collections.unmodifiableList(list2);
        this.f1927e = Collections.unmodifiableList(list3);
        this.f1928f = Collections.unmodifiableList(list4);
    }
}
