package w7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

/* JADX INFO: renamed from: w7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2937a implements IMediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RandomAccessFile f51689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f51690b;

    public C2937a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.f51689a = randomAccessFile;
        this.f51690b = randomAccessFile.length();
    }

    public static String a() {
        return "SVBUViBTbWFydGVycyBQcm8=";
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public void close() throws IOException {
        this.f51690b = 0L;
        this.f51689a.close();
        this.f51689a = null;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public long getSize() {
        return this.f51690b;
    }

    @Override // tv.danmaku.ijk.media.player.misc.IMediaDataSource
    public int readAt(long j9, byte[] bArr, int i9, int i10) throws IOException {
        if (this.f51689a.getFilePointer() != j9) {
            this.f51689a.seek(j9);
        }
        if (i10 == 0) {
            return 0;
        }
        return this.f51689a.read(bArr, 0, i10);
    }
}
