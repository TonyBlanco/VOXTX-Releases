package C2;

import K2.InterfaceC0689d;
import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v implements Closeable {

    public interface a {
        a a(Context context);

        v build();
    }

    public abstract InterfaceC0689d a();

    public abstract u c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
