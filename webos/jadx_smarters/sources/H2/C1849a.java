package h2;

import U1.l;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1849a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f41596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f41597b;

    public C1849a(l lVar, l lVar2) {
        if (lVar != null && lVar2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (lVar == null && lVar2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        }
        this.f41597b = lVar;
        this.f41596a = lVar2;
    }

    public l a() {
        return this.f41597b;
    }

    public l b() {
        return this.f41596a;
    }

    public int c() {
        l lVar = this.f41597b;
        return lVar != null ? lVar.getSize() : this.f41596a.getSize();
    }
}
