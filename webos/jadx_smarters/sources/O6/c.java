package O6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6697c;

    public c(List list, int i9, boolean z9) {
        this.f6695a = new ArrayList(list);
        this.f6696b = i9;
        this.f6697c = z9;
    }

    public List a() {
        return this.f6695a;
    }

    public int b() {
        return this.f6696b;
    }

    public boolean c(List list) {
        return this.f6695a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6695a.equals(cVar.f6695a) && this.f6697c == cVar.f6697c;
    }

    public int hashCode() {
        return this.f6695a.hashCode() ^ Boolean.valueOf(this.f6697c).hashCode();
    }

    public String toString() {
        return "{ " + this.f6695a + " }";
    }
}
