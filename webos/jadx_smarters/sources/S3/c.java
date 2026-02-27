package s3;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f49898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f49899b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        this.f49898a = byteArrayOutputStream;
        this.f49899b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(C2707a c2707a) {
        this.f49898a.reset();
        try {
            b(this.f49899b, c2707a.f49892a);
            String str = c2707a.f49893c;
            if (str == null) {
                str = "";
            }
            b(this.f49899b, str);
            this.f49899b.writeLong(c2707a.f49894d);
            this.f49899b.writeLong(c2707a.f49895e);
            this.f49899b.write(c2707a.f49896f);
            this.f49899b.flush();
            return this.f49898a.toByteArray();
        } catch (IOException e9) {
            throw new RuntimeException(e9);
        }
    }
}
