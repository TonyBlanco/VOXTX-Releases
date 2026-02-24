package K2;

import K2.C0686a;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: renamed from: K2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0690e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0690e f3649a = a().f(10485760).d(200).b(Constants.MAXIMUM_UPLOAD_PARTS).c(604800000).e(81920).a();

    /* JADX INFO: renamed from: K2.e$a */
    public static abstract class a {
        public abstract AbstractC0690e a();

        public abstract a b(int i9);

        public abstract a c(long j9);

        public abstract a d(int i9);

        public abstract a e(int i9);

        public abstract a f(long j9);
    }

    public static a a() {
        return new C0686a.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}
