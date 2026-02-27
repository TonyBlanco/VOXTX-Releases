package Z1;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f10876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParcelFileDescriptor f10877b;

    public g(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f10876a = inputStream;
        this.f10877b = parcelFileDescriptor;
    }

    public ParcelFileDescriptor a() {
        return this.f10877b;
    }

    public InputStream b() {
        return this.f10876a;
    }
}
