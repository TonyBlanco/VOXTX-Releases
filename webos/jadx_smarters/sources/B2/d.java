package B2;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f233a;

    public d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f233a = list;
    }

    @Override // B2.j
    public List c() {
        return this.f233a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f233a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f233a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f233a + "}";
    }
}
