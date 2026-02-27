package F2;

import f6.InterfaceC1779c;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f1903c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1905b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1906a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f1907b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f1906a, this.f1907b);
        }

        public a b(long j9) {
            this.f1906a = j9;
            return this;
        }

        public a c(b bVar) {
            this.f1907b = bVar;
            return this;
        }
    }

    public enum b implements InterfaceC1779c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i9) {
            this.number_ = i9;
        }

        @Override // f6.InterfaceC1779c
        public int getNumber() {
            return this.number_;
        }
    }

    public c(long j9, b bVar) {
        this.f1904a = j9;
        this.f1905b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f1904a;
    }

    public b b() {
        return this.f1905b;
    }
}
