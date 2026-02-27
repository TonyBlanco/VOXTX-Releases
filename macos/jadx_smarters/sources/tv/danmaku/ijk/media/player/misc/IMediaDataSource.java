package tv.danmaku.ijk.media.player.misc;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface IMediaDataSource {
    void close() throws IOException;

    long getSize() throws IOException;

    int readAt(long j9, byte[] bArr, int i9, int i10) throws IOException;
}
