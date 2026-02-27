package D3;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f1428a = new a();

    public class a implements o {
        @Override // D3.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // D3.o
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // D3.o
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
