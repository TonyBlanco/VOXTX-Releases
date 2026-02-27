package d4;

import android.media.MediaFormat;
import e4.C1740c;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, C1740c c1740c) {
        if (c1740c != null) {
            d(mediaFormat, "color-transfer", c1740c.f40200d);
            d(mediaFormat, "color-standard", c1740c.f40198a);
            d(mediaFormat, "color-range", c1740c.f40199c);
            a(mediaFormat, "hdr-static-info", c1740c.f40201e);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f9) {
        if (f9 != -1.0f) {
            mediaFormat.setFloat(str, f9);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i9) {
        if (i9 != -1) {
            mediaFormat.setInteger(str, i9);
        }
    }

    public static void e(MediaFormat mediaFormat, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            mediaFormat.setByteBuffer("csd-" + i9, ByteBuffer.wrap((byte[]) list.get(i9)));
        }
    }
}
