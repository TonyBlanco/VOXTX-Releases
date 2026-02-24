package Z1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import q2.C2532a;

/* JADX INFO: loaded from: classes.dex */
public class o implements S1.b {
    @Override // S1.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArrB = C2532a.a().b();
        while (true) {
            try {
                try {
                    int i9 = inputStream.read(bArrB);
                    if (i9 == -1) {
                        C2532a.a().c(bArrB);
                        return true;
                    }
                    outputStream.write(bArrB, 0, i9);
                } catch (IOException e9) {
                    if (Log.isLoggable("StreamEncoder", 3)) {
                        Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e9);
                    }
                    C2532a.a().c(bArrB);
                    return false;
                }
            } catch (Throwable th) {
                C2532a.a().c(bArrB);
                throw th;
            }
        }
    }

    @Override // S1.b
    public String getId() {
        return "";
    }
}
