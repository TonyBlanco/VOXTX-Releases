package W1;

import W1.a;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements a.InterfaceC0132a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10210b;

    public interface a {
        File a();
    }

    public d(a aVar, int i9) {
        this.f10209a = i9;
        this.f10210b = aVar;
    }

    @Override // W1.a.InterfaceC0132a
    public W1.a build() {
        File fileA = this.f10210b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.mkdirs() || (fileA.exists() && fileA.isDirectory())) {
            return e.d(fileA, this.f10209a);
        }
        return null;
    }
}
