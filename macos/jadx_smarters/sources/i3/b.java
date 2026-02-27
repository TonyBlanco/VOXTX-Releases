package i3;

import java.util.List;
import w3.C2908b;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41845b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f41848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f41849d;

        public a(String str, String str2, long j9, long j10) {
            this.f41846a = str;
            this.f41847b = str2;
            this.f41848c = j9;
            this.f41849d = j10;
        }
    }

    public b(long j9, List list) {
        this.f41844a = j9;
        this.f41845b = list;
    }

    public C2908b a(long j9) {
        long j10;
        if (this.f41845b.size() < 2) {
            return null;
        }
        long j11 = j9;
        long j12 = -1;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        boolean z9 = false;
        for (int size = this.f41845b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f41845b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f41846a) | z9;
            if (size == 0) {
                j11 -= aVar.f41849d;
                j10 = 0;
            } else {
                j10 = j11 - aVar.f41848c;
            }
            long j16 = j11;
            j11 = j10;
            if (!zEquals || j11 == j16) {
                z9 = zEquals;
            } else {
                j15 = j16 - j11;
                j14 = j11;
                z9 = false;
            }
            if (size == 0) {
                j12 = j11;
                j13 = j16;
            }
        }
        if (j14 == -1 || j15 == -1 || j12 == -1 || j13 == -1) {
            return null;
        }
        return new C2908b(j12, j13, this.f41844a, j14, j15);
    }
}
