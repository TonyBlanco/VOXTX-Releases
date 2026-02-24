package C2;

import C2.i;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f975f;

    /* JADX INFO: renamed from: C2.b$b, reason: collision with other inner class name */
    public static final class C0009b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map f981f;

        @Override // C2.i.a
        public i d() {
            String str = "";
            if (this.f976a == null) {
                str = " transportName";
            }
            if (this.f978c == null) {
                str = str + " encodedPayload";
            }
            if (this.f979d == null) {
                str = str + " eventMillis";
            }
            if (this.f980e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f981f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f976a, this.f977b, this.f978c, this.f979d.longValue(), this.f980e.longValue(), this.f981f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C2.i.a
        public Map e() {
            Map map = this.f981f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // C2.i.a
        public i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f981f = map;
            return this;
        }

        @Override // C2.i.a
        public i.a g(Integer num) {
            this.f977b = num;
            return this;
        }

        @Override // C2.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f978c = hVar;
            return this;
        }

        @Override // C2.i.a
        public i.a i(long j9) {
            this.f979d = Long.valueOf(j9);
            return this;
        }

        @Override // C2.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f976a = str;
            return this;
        }

        @Override // C2.i.a
        public i.a k(long j9) {
            this.f980e = Long.valueOf(j9);
            return this;
        }
    }

    public b(String str, Integer num, h hVar, long j9, long j10, Map map) {
        this.f970a = str;
        this.f971b = num;
        this.f972c = hVar;
        this.f973d = j9;
        this.f974e = j10;
        this.f975f = map;
    }

    @Override // C2.i
    public Map c() {
        return this.f975f;
    }

    @Override // C2.i
    public Integer d() {
        return this.f971b;
    }

    @Override // C2.i
    public h e() {
        return this.f972c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f970a.equals(iVar.j()) && ((num = this.f971b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f972c.equals(iVar.e()) && this.f973d == iVar.f() && this.f974e == iVar.k() && this.f975f.equals(iVar.c());
    }

    @Override // C2.i
    public long f() {
        return this.f973d;
    }

    public int hashCode() {
        int iHashCode = (this.f970a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f971b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f972c.hashCode()) * 1000003;
        long j9 = this.f973d;
        int i9 = (iHashCode2 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f974e;
        return ((i9 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f975f.hashCode();
    }

    @Override // C2.i
    public String j() {
        return this.f970a;
    }

    @Override // C2.i
    public long k() {
        return this.f974e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f970a + ", code=" + this.f971b + ", encodedPayload=" + this.f972c + ", eventMillis=" + this.f973d + ", uptimeMillis=" + this.f974e + ", autoMetadata=" + this.f975f + "}";
    }
}
