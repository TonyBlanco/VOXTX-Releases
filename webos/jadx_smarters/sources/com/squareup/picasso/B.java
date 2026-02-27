package com.squareup.picasso;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes4.dex */
public class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f39024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f39025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f39026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f39027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f39028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f39029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f39030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f39031n;

    public B(int i9, int i10, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i11, int i12, int i13, long j17) {
        this.f39018a = i9;
        this.f39019b = i10;
        this.f39020c = j9;
        this.f39021d = j10;
        this.f39022e = j11;
        this.f39023f = j12;
        this.f39024g = j13;
        this.f39025h = j14;
        this.f39026i = j15;
        this.f39027j = j16;
        this.f39028k = i11;
        this.f39029l = i12;
        this.f39030m = i13;
        this.f39031n = j17;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f39018a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f39019b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f39019b / this.f39018a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f39020c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f39021d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f39028k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f39022e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f39025h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f39029l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f39023f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f39030m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f39024g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f39026i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f39027j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f39018a + ", size=" + this.f39019b + ", cacheHits=" + this.f39020c + ", cacheMisses=" + this.f39021d + ", downloadCount=" + this.f39028k + ", totalDownloadSize=" + this.f39022e + ", averageDownloadSize=" + this.f39025h + ", totalOriginalBitmapSize=" + this.f39023f + ", totalTransformedBitmapSize=" + this.f39024g + ", averageOriginalBitmapSize=" + this.f39026i + ", averageTransformedBitmapSize=" + this.f39027j + ", originalBitmapCount=" + this.f39029l + ", transformedBitmapCount=" + this.f39030m + ", timeStamp=" + this.f39031n + '}';
    }
}
