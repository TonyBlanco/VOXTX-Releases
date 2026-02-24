package Z1;

import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public abstract class r implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10901a;

    public r(l lVar) {
        this.f10901a = lVar;
    }

    @Override // Z1.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T1.c a(URL url, int i9, int i10) {
        return this.f10901a.a(new d(url), i9, i10);
    }
}
