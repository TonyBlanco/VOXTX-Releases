package c4;

import java.io.File;

/* JADX INFO: renamed from: c4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1264j implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18244a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f18248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18249g;

    public AbstractC1264j(String str, long j9, long j10, long j11, File file) {
        this.f18244a = str;
        this.f18245c = j9;
        this.f18246d = j10;
        this.f18247e = file != null;
        this.f18248f = file;
        this.f18249g = j11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC1264j abstractC1264j) {
        if (!this.f18244a.equals(abstractC1264j.f18244a)) {
            return this.f18244a.compareTo(abstractC1264j.f18244a);
        }
        long j9 = this.f18245c - abstractC1264j.f18245c;
        if (j9 == 0) {
            return 0;
        }
        return j9 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f18247e;
    }

    public boolean h() {
        return this.f18246d == -1;
    }

    public String toString() {
        return "[" + this.f18245c + ", " + this.f18246d + "]";
    }
}
