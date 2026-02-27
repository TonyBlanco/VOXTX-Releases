package tv.danmaku.ijk.media.player.misc;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface IAndroidIO {
    int close() throws IOException;

    int open(String str) throws IOException;

    int read(byte[] bArr, int i9) throws IOException;

    long seek(long j9, int i9) throws IOException;
}
