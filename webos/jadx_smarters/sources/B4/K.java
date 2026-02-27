package b4;

import android.net.Uri;
import b4.InterfaceC1224o;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements InterfaceC1224o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f17524a = new K();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1224o.a f17525b = new InterfaceC1224o.a() { // from class: b4.J
        @Override // b4.InterfaceC1224o.a
        public final InterfaceC1224o a() {
            return K.j();
        }
    };

    public static /* synthetic */ K j() {
        return new K();
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // b4.InterfaceC1224o
    public void close() {
    }

    @Override // b4.InterfaceC1224o
    public /* synthetic */ Map e() {
        return AbstractC1223n.a(this);
    }

    @Override // b4.InterfaceC1224o
    public void g(S s9) {
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return null;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) {
        throw new UnsupportedOperationException();
    }
}
