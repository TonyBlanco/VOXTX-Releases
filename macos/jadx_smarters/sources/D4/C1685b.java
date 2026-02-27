package d4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: d4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1685b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f39752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f39753b;

    /* JADX INFO: renamed from: d4.b$a */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileOutputStream f39754a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f39755c = false;

        public a(File file) {
            this.f39754a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f39755c) {
                return;
            }
            this.f39755c = true;
            flush();
            try {
                this.f39754a.getFD().sync();
            } catch (IOException e9) {
                AbstractC1681B.k("AtomicFile", "Failed to sync file descriptor:", e9);
            }
            this.f39754a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f39754a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i9) throws IOException {
            this.f39754a.write(i9);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f39754a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i9, int i10) throws IOException {
            this.f39754a.write(bArr, i9, i10);
        }
    }

    public C1685b(File file) {
        this.f39752a = file;
        this.f39753b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.f39752a.delete();
        this.f39753b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f39753b.delete();
    }

    public boolean c() {
        return this.f39752a.exists() || this.f39753b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f39752a);
    }

    public final void e() {
        if (this.f39753b.exists()) {
            this.f39752a.delete();
            this.f39753b.renameTo(this.f39752a);
        }
    }

    public OutputStream f() throws IOException {
        if (this.f39752a.exists()) {
            if (this.f39753b.exists()) {
                this.f39752a.delete();
            } else if (!this.f39752a.renameTo(this.f39753b)) {
                AbstractC1681B.j("AtomicFile", "Couldn't rename file " + this.f39752a + " to backup file " + this.f39753b);
            }
        }
        try {
            return new a(this.f39752a);
        } catch (FileNotFoundException e9) {
            File parentFile = this.f39752a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f39752a, e9);
            }
            try {
                return new a(this.f39752a);
            } catch (FileNotFoundException e10) {
                throw new IOException("Couldn't create " + this.f39752a, e10);
            }
        }
    }
}
