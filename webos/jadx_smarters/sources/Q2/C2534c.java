package q2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: renamed from: q2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2534c extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Queue f46803d = AbstractC2539h.c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f46804a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f46805c;

    public static C2534c c(InputStream inputStream) {
        C2534c c2534c;
        Queue queue = f46803d;
        synchronized (queue) {
            c2534c = (C2534c) queue.poll();
        }
        if (c2534c == null) {
            c2534c = new C2534c();
        }
        c2534c.e(inputStream);
        return c2534c;
    }

    public IOException a() {
        return this.f46805c;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f46804a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f46804a.close();
    }

    public void d() {
        this.f46805c = null;
        this.f46804a = null;
        Queue queue = f46803d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void e(InputStream inputStream) {
        this.f46804a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i9) {
        this.f46804a.mark(i9);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f46804a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f46804a.read();
        } catch (IOException e9) {
            this.f46805c = e9;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f46804a.read(bArr);
        } catch (IOException e9) {
            this.f46805c = e9;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) {
        try {
            return this.f46804a.read(bArr, i9, i10);
        } catch (IOException e9) {
            this.f46805c = e9;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f46804a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j9) {
        try {
            return this.f46804a.skip(j9);
        } catch (IOException e9) {
            this.f46805c = e9;
            return 0L;
        }
    }
}
