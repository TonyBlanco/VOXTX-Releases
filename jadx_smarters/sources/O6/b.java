package O6;

import com.amazonaws.services.s3.internal.Constants;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.b f6692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N6.b f6693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N6.c f6694c;

    public b(N6.b bVar, N6.b bVar2, N6.c cVar) {
        this.f6692a = bVar;
        this.f6693b = bVar2;
        this.f6694c = cVar;
    }

    public N6.c a() {
        return this.f6694c;
    }

    public N6.b b() {
        return this.f6692a;
    }

    public N6.b c() {
        return this.f6693b;
    }

    public boolean d() {
        return this.f6693b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f6692a, bVar.f6692a) && Objects.equals(this.f6693b, bVar.f6693b) && Objects.equals(this.f6694c, bVar.f6694c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f6692a) ^ Objects.hashCode(this.f6693b)) ^ Objects.hashCode(this.f6694c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f6692a);
        sb.append(" , ");
        sb.append(this.f6693b);
        sb.append(" : ");
        N6.c cVar = this.f6694c;
        sb.append(cVar == null ? Constants.NULL_VERSION_ID : Integer.valueOf(cVar.c()));
        sb.append(" ]");
        return sb.toString();
    }
}
