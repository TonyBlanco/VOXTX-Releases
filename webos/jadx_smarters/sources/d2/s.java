package d2;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class s implements InterfaceC1651a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39570c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f39571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39572b;

    public static class a {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public s() {
        this(f39570c, -1);
    }

    public s(a aVar, int i9) {
        this.f39571a = aVar;
        this.f39572b = i9;
    }

    public Bitmap a(ParcelFileDescriptor parcelFileDescriptor, V1.b bVar, int i9, int i10, S1.a aVar) throws IOException {
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f39571a.a();
        mediaMetadataRetrieverA.setDataSource(parcelFileDescriptor.getFileDescriptor());
        int i11 = this.f39572b;
        Bitmap frameAtTime = i11 >= 0 ? mediaMetadataRetrieverA.getFrameAtTime(i11) : mediaMetadataRetrieverA.getFrameAtTime();
        mediaMetadataRetrieverA.release();
        parcelFileDescriptor.close();
        return frameAtTime;
    }
}
