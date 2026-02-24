package n3;

import android.util.SparseArray;
import d3.InterfaceC1674k;
import d4.M;
import d4.Z;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface I {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f44969c;

        public a(String str, int i9, byte[] bArr) {
            this.f44967a = str;
            this.f44968b = i9;
            this.f44969c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f44971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f44972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f44973d;

        public b(int i9, String str, List list, byte[] bArr) {
            this.f44970a = i9;
            this.f44971b = str;
            this.f44972c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f44973d = bArr;
        }
    }

    public interface c {
        SparseArray a();

        I b(int i9, b bVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f44978e;

        public d(int i9, int i10) {
            this(Integer.MIN_VALUE, i9, i10);
        }

        public d(int i9, int i10, int i11) {
            String str;
            if (i9 != Integer.MIN_VALUE) {
                str = i9 + "/";
            } else {
                str = "";
            }
            this.f44974a = str;
            this.f44975b = i10;
            this.f44976c = i11;
            this.f44977d = Integer.MIN_VALUE;
            this.f44978e = "";
        }

        public void a() {
            int i9 = this.f44977d;
            this.f44977d = i9 == Integer.MIN_VALUE ? this.f44975b : i9 + this.f44976c;
            this.f44978e = this.f44974a + this.f44977d;
        }

        public String b() {
            d();
            return this.f44978e;
        }

        public int c() {
            d();
            return this.f44977d;
        }

        public final void d() {
            if (this.f44977d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    void a(Z z9, InterfaceC1674k interfaceC1674k, d dVar);

    void b(M m9, int i9);

    void c();
}
