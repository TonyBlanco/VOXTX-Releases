package Z1;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10860a;

    public b(l lVar) {
        this.f10860a = lVar;
    }

    @Override // Z1.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T1.c a(File file, int i9, int i10) {
        return this.f10860a.a(Uri.fromFile(file), i9, i10);
    }
}
