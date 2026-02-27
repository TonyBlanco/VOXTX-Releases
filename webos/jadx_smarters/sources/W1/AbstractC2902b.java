package w1;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: w1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2902b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f51586a = new a(EnumC0475b.CACHE_ONLY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f51587b = new c(EnumC0475b.NETWORK_ONLY, 0, null, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f51588c = new a(EnumC0475b.CACHE_FIRST);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f51589d = new a(EnumC0475b.NETWORK_FIRST);

    /* JADX INFO: renamed from: w1.b$a */
    public static final class a extends c {
        public a(EnumC0475b enumC0475b) {
            super(enumC0475b, 0L, null, false);
        }
    }

    /* JADX INFO: renamed from: w1.b$b, reason: collision with other inner class name */
    public enum EnumC0475b {
        CACHE_ONLY,
        NETWORK_ONLY,
        CACHE_FIRST,
        NETWORK_FIRST
    }

    /* JADX INFO: renamed from: w1.b$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC0475b f51590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f51591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f51592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f51593d;

        public c(EnumC0475b enumC0475b, long j9, TimeUnit timeUnit, boolean z9) {
            this.f51590a = enumC0475b;
            this.f51591b = j9;
            this.f51592c = timeUnit;
            this.f51593d = z9;
        }

        public long a() {
            TimeUnit timeUnit = this.f51592c;
            if (timeUnit == null) {
                return 0L;
            }
            return timeUnit.toMillis(this.f51591b);
        }
    }
}
