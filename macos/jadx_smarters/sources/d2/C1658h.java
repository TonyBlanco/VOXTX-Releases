package d2;

import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: d2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1658h implements S1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f39532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f39533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public S1.a f39534c;

    public C1658h(V1.b bVar, S1.a aVar) {
        this(new s(), bVar, aVar);
    }

    public C1658h(s sVar, V1.b bVar, S1.a aVar) {
        this.f39532a = sVar;
        this.f39533b = bVar;
        this.f39534c = aVar;
    }

    @Override // S1.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U1.l a(ParcelFileDescriptor parcelFileDescriptor, int i9, int i10) {
        return C1653c.c(this.f39532a.a(parcelFileDescriptor, this.f39533b, i9, i10, this.f39534c), this.f39533b);
    }

    @Override // S1.e
    public String getId() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
