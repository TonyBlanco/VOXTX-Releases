package j$.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f41952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f41953b = null;

    a(BufferedReader bufferedReader) {
        this.f41952a = bufferedReader;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f41953b != null) {
            return true;
        }
        try {
            String line = this.f41952a.readLine();
            this.f41953b = line;
            return line != null;
        } catch (IOException e9) {
            throw new UncheckedIOException(e9);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f41953b == null && !hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f41953b;
        this.f41953b = null;
        return str;
    }
}
