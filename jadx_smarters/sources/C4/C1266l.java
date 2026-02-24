package c4;

import d4.AbstractC1681B;
import d4.AbstractC1684a;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: renamed from: c4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1266l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f18262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1271q f18264e;

    /* JADX INFO: renamed from: c4.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18266b;

        public a(long j9, long j10) {
            this.f18265a = j9;
            this.f18266b = j10;
        }

        public boolean a(long j9, long j10) {
            long j11 = this.f18266b;
            if (j11 == -1) {
                return j9 >= this.f18265a;
            }
            if (j10 == -1) {
                return false;
            }
            long j12 = this.f18265a;
            return j12 <= j9 && j9 + j10 <= j12 + j11;
        }

        public boolean b(long j9, long j10) {
            long j11 = this.f18265a;
            if (j11 > j9) {
                return j10 == -1 || j9 + j10 > j11;
            }
            long j12 = this.f18266b;
            return j12 == -1 || j11 + j12 > j9;
        }
    }

    public C1266l(int i9, String str) {
        this(i9, str, C1271q.f18287c);
    }

    public C1266l(int i9, String str, C1271q c1271q) {
        this.f18260a = i9;
        this.f18261b = str;
        this.f18264e = c1271q;
        this.f18262c = new TreeSet();
        this.f18263d = new ArrayList();
    }

    public void a(u uVar) {
        this.f18262c.add(uVar);
    }

    public boolean b(C1270p c1270p) {
        this.f18264e = this.f18264e.e(c1270p);
        return !r2.equals(r0);
    }

    public long c(long j9, long j10) {
        AbstractC1684a.a(j9 >= 0);
        AbstractC1684a.a(j10 >= 0);
        u uVarE = e(j9, j10);
        if (uVarE.b()) {
            return -Math.min(uVarE.h() ? Long.MAX_VALUE : uVarE.f18246d, j10);
        }
        long j11 = j9 + j10;
        long j12 = j11 >= 0 ? j11 : Long.MAX_VALUE;
        long jMax = uVarE.f18245c + uVarE.f18246d;
        if (jMax < j12) {
            for (u uVar : this.f18262c.tailSet(uVarE, false)) {
                long j13 = uVar.f18245c;
                if (j13 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j13 + uVar.f18246d);
                if (jMax >= j12) {
                    break;
                }
            }
        }
        return Math.min(jMax - j9, j10);
    }

    public C1271q d() {
        return this.f18264e;
    }

    public u e(long j9, long j10) {
        u uVarO = u.o(this.f18261b, j9);
        u uVar = (u) this.f18262c.floor(uVarO);
        if (uVar != null && uVar.f18245c + uVar.f18246d > j9) {
            return uVar;
        }
        u uVar2 = (u) this.f18262c.ceiling(uVarO);
        if (uVar2 != null) {
            long j11 = uVar2.f18245c - j9;
            j10 = j10 == -1 ? j11 : Math.min(j11, j10);
        }
        return u.n(this.f18261b, j9, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1266l.class != obj.getClass()) {
            return false;
        }
        C1266l c1266l = (C1266l) obj;
        return this.f18260a == c1266l.f18260a && this.f18261b.equals(c1266l.f18261b) && this.f18262c.equals(c1266l.f18262c) && this.f18264e.equals(c1266l.f18264e);
    }

    public TreeSet f() {
        return this.f18262c;
    }

    public boolean g() {
        return this.f18262c.isEmpty();
    }

    public boolean h(long j9, long j10) {
        for (int i9 = 0; i9 < this.f18263d.size(); i9++) {
            if (((a) this.f18263d.get(i9)).a(j9, j10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f18260a * 31) + this.f18261b.hashCode()) * 31) + this.f18264e.hashCode();
    }

    public boolean i() {
        return this.f18263d.isEmpty();
    }

    public boolean j(long j9, long j10) {
        for (int i9 = 0; i9 < this.f18263d.size(); i9++) {
            if (((a) this.f18263d.get(i9)).b(j9, j10)) {
                return false;
            }
        }
        this.f18263d.add(new a(j9, j10));
        return true;
    }

    public boolean k(AbstractC1264j abstractC1264j) {
        if (!this.f18262c.remove(abstractC1264j)) {
            return false;
        }
        File file = abstractC1264j.f18248f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public u l(u uVar, long j9, boolean z9) {
        AbstractC1684a.g(this.f18262c.remove(uVar));
        File file = (File) AbstractC1684a.e(uVar.f18248f);
        if (z9) {
            File fileP = u.p((File) AbstractC1684a.e(file.getParentFile()), this.f18260a, uVar.f18245c, j9);
            if (file.renameTo(fileP)) {
                file = fileP;
            } else {
                AbstractC1681B.j("CachedContent", "Failed to rename " + file + " to " + fileP);
            }
        }
        u uVarI = uVar.i(file, j9);
        this.f18262c.add(uVarI);
        return uVarI;
    }

    public void m(long j9) {
        for (int i9 = 0; i9 < this.f18263d.size(); i9++) {
            if (((a) this.f18263d.get(i9)).f18265a == j9) {
                this.f18263d.remove(i9);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
