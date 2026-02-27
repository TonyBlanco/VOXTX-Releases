package Y6;

/* JADX INFO: loaded from: classes.dex */
public class v implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10736a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10737c;

    public v(int i9, int i10) {
        this.f10736a = i9;
        this.f10737c = i10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(v vVar) {
        int i9 = this.f10737c * this.f10736a;
        int i10 = vVar.f10737c * vVar.f10736a;
        if (i10 < i9) {
            return 1;
        }
        return i10 > i9 ? -1 : 0;
    }

    public v b() {
        return new v(this.f10737c, this.f10736a);
    }

    public v c(v vVar) {
        int i9 = this.f10736a;
        int i10 = vVar.f10737c;
        int i11 = i9 * i10;
        int i12 = vVar.f10736a;
        int i13 = this.f10737c;
        return i11 <= i12 * i13 ? new v(i12, (i13 * i12) / i9) : new v((i9 * i10) / i13, i10);
    }

    public v d(v vVar) {
        int i9 = this.f10736a;
        int i10 = vVar.f10737c;
        int i11 = i9 * i10;
        int i12 = vVar.f10736a;
        int i13 = this.f10737c;
        return i11 >= i12 * i13 ? new v(i12, (i13 * i12) / i9) : new v((i9 * i10) / i13, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f10736a == vVar.f10736a && this.f10737c == vVar.f10737c;
    }

    public int hashCode() {
        return (this.f10736a * 31) + this.f10737c;
    }

    public String toString() {
        return this.f10736a + "x" + this.f10737c;
    }
}
