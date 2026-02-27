package G0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends Closeable {
    List B();

    void C(String str);

    Cursor D(e eVar);

    void G();

    void H(String str, Object[] objArr);

    void I();

    Cursor K(e eVar, CancellationSignal cancellationSignal);

    f Q(String str);

    Cursor U(String str);

    boolean Z();

    String getPath();

    boolean isOpen();

    void u();
}
