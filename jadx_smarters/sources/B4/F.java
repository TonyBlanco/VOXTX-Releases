package b4;

import B3.C0512u;
import B3.C0515x;
import d4.AbstractC1684a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface F {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17491d;

        public a(int i9, int i10, int i11, int i12) {
            this.f17488a = i9;
            this.f17489b = i10;
            this.f17490c = i11;
            this.f17491d = i12;
        }

        public boolean a(int i9) {
            if (i9 == 1) {
                if (this.f17488a - this.f17489b <= 1) {
                    return false;
                }
            } else if (this.f17490c - this.f17491d <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17493b;

        public b(int i9, long j9) {
            AbstractC1684a.a(j9 >= 0);
            this.f17492a = i9;
            this.f17493b = j9;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0512u f17494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0515x f17495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f17496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17497d;

        public c(C0512u c0512u, C0515x c0515x, IOException iOException, int i9) {
            this.f17494a = c0512u;
            this.f17495b = c0515x;
            this.f17496c = iOException;
            this.f17497d = i9;
        }
    }

    b a(a aVar, c cVar);

    int b(int i9);

    long c(c cVar);

    void d(long j9);
}
