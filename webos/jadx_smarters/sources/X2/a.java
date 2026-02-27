package X2;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends UploadDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10401a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10402c;

    public a(byte[] bArr) {
        this.f10401a = bArr;
    }

    @Override // org.chromium.net.UploadDataProvider
    public long getLength() {
        return this.f10401a.length;
    }

    @Override // org.chromium.net.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int iMin = Math.min(byteBuffer.remaining(), this.f10401a.length - this.f10402c);
        byteBuffer.put(this.f10401a, this.f10402c, iMin);
        this.f10402c += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) {
        this.f10402c = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
