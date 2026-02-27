package t6;

import F8.a;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50872a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    @Override // t6.y
    public long a() {
        a.C0031a c0031a = F8.a.f2095c;
        return F8.c.p(SystemClock.elapsedRealtime(), F8.d.MILLISECONDS);
    }

    @Override // t6.y
    public long b() {
        return System.currentTimeMillis() * 1000;
    }
}
