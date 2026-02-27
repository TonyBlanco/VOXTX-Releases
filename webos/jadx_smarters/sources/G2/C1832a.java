package g2;

import Q1.a;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: g2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1832a implements a.InterfaceC0086a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V1.b f41258a;

    public C1832a(V1.b bVar) {
        this.f41258a = bVar;
    }

    @Override // Q1.a.InterfaceC0086a
    public void a(Bitmap bitmap) {
        if (this.f41258a.a(bitmap)) {
            return;
        }
        bitmap.recycle();
    }

    @Override // Q1.a.InterfaceC0086a
    public Bitmap b(int i9, int i10, Bitmap.Config config) {
        return this.f41258a.e(i9, i10, config);
    }
}
