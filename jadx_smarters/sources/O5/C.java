package O5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {
    public static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[Segment.SIZE];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i9 = inputStream.read(bArr);
                    if (i9 <= 0) {
                        gZIPOutputStream2.finish();
                        AbstractC0945i.f(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i9);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC0945i.f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B b9 = (B) it.next();
            InputStream inputStreamF = null;
            try {
                inputStreamF = b9.f();
                if (inputStreamF != null) {
                    a(inputStreamF, new File(file, b9.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                AbstractC0945i.f(null);
                throw th;
            }
            AbstractC0945i.f(inputStreamF);
        }
    }
}
