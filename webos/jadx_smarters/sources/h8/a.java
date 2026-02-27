package H8;

import G8.I0;
import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.p;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p {
    @Override // kotlinx.coroutines.internal.p
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.p
    public I0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.p
    public int c() {
        return 1073741823;
    }
}
