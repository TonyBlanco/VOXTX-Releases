package c4;

import d4.AbstractC1684a;
import d4.k0;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: c4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1273s extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18290a;

    public C1273s(OutputStream outputStream) {
        super(outputStream);
    }

    public C1273s(OutputStream outputStream, int i9) {
        super(outputStream, i9);
    }

    public void a(OutputStream outputStream) {
        AbstractC1684a.g(this.f18290a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f18290a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f18290a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            k0.g1(th);
        }
    }
}
