package d2;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: d2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1663m implements S1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.e f39551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S1.e f39552b;

    public C1663m(S1.e eVar, S1.e eVar2) {
        this.f39551a = eVar;
        this.f39552b = eVar2;
    }

    @Override // S1.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U1.l a(Z1.g gVar, int i9, int i10) {
        U1.l lVarA;
        ParcelFileDescriptor parcelFileDescriptorA;
        InputStream inputStreamB = gVar.b();
        if (inputStreamB != null) {
            try {
                lVarA = this.f39551a.a(inputStreamB, i9, i10);
            } catch (IOException e9) {
                if (Log.isLoggable("ImageVideoDecoder", 2)) {
                    Log.v("ImageVideoDecoder", "Failed to load image from stream, trying FileDescriptor", e9);
                }
                lVarA = null;
            }
        } else {
            lVarA = null;
        }
        return (lVarA != null || (parcelFileDescriptorA = gVar.a()) == null) ? lVarA : this.f39552b.a(parcelFileDescriptorA, i9, i10);
    }

    @Override // S1.e
    public String getId() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
