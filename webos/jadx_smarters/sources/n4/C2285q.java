package n4;

import com.google.android.gms.common.internal.AbstractC1418q;
import org.json.JSONObject;

/* JADX INFO: renamed from: n4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2285q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f45485d;

    /* JADX INFO: renamed from: n4.q$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f45486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45487b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public JSONObject f45489d;

        public C2285q a() {
            return new C2285q(this.f45486a, this.f45487b, this.f45488c, this.f45489d, null);
        }

        public a b(JSONObject jSONObject) {
            this.f45489d = jSONObject;
            return this;
        }

        public a c(boolean z9) {
            this.f45488c = z9;
            return this;
        }

        public a d(long j9) {
            this.f45486a = j9;
            return this;
        }

        public a e(int i9) {
            this.f45487b = i9;
            return this;
        }
    }

    public /* synthetic */ C2285q(long j9, int i9, boolean z9, JSONObject jSONObject, r0 r0Var) {
        this.f45482a = j9;
        this.f45483b = i9;
        this.f45484c = z9;
        this.f45485d = jSONObject;
    }

    public JSONObject a() {
        return this.f45485d;
    }

    public long b() {
        return this.f45482a;
    }

    public int c() {
        return this.f45483b;
    }

    public boolean d() {
        return this.f45484c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2285q)) {
            return false;
        }
        C2285q c2285q = (C2285q) obj;
        return this.f45482a == c2285q.f45482a && this.f45483b == c2285q.f45483b && this.f45484c == c2285q.f45484c && AbstractC1418q.b(this.f45485d, c2285q.f45485d);
    }

    public int hashCode() {
        return AbstractC1418q.c(Long.valueOf(this.f45482a), Integer.valueOf(this.f45483b), Boolean.valueOf(this.f45484c), this.f45485d);
    }
}
