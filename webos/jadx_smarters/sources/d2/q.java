package d2;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class q implements S1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1656f f39566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V1.b f39567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S1.a f39568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39569d;

    public q(V1.b bVar, S1.a aVar) {
        this(AbstractC1656f.f39525c, bVar, aVar);
    }

    public q(AbstractC1656f abstractC1656f, V1.b bVar, S1.a aVar) {
        this.f39566a = abstractC1656f;
        this.f39567b = bVar;
        this.f39568c = aVar;
    }

    @Override // S1.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U1.l a(InputStream inputStream, int i9, int i10) {
        return C1653c.c(this.f39566a.a(inputStream, this.f39567b, i9, i10, this.f39568c), this.f39567b);
    }

    @Override // S1.e
    public String getId() {
        if (this.f39569d == null) {
            this.f39569d = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap" + this.f39566a.getId() + this.f39568c.name();
        }
        return this.f39569d;
    }
}
