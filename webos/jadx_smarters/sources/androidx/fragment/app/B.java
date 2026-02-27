package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class B extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14873a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f14874c = new StringBuilder(128);

    public B(String str) {
        this.f14873a = str;
    }

    public final void a() {
        if (this.f14874c.length() > 0) {
            Log.d(this.f14873a, this.f14874c.toString());
            StringBuilder sb = this.f14874c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i9, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c9 = cArr[i9 + i11];
            if (c9 == '\n') {
                a();
            } else {
                this.f14874c.append(c9);
            }
        }
    }
}
