package h2;

import U1.l;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class e implements S1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.e f41610a;

    public e(S1.e eVar) {
        this.f41610a = eVar;
    }

    @Override // S1.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l a(InputStream inputStream, int i9, int i10) {
        return this.f41610a.a(new Z1.g(inputStream, null), i9, i10);
    }

    @Override // S1.e
    public String getId() {
        return this.f41610a.getId();
    }
}
