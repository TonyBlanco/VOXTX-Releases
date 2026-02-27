package r6;

import com.google.android.gms.internal.firebase_messaging.zze;

/* JADX INFO: renamed from: r6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2681b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2681b f49779b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2680a f49780a;

    /* JADX INFO: renamed from: r6.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C2680a f49781a = null;

        public C2681b a() {
            return new C2681b(this.f49781a);
        }

        public a b(C2680a c2680a) {
            this.f49781a = c2680a;
            return this;
        }
    }

    public C2681b(C2680a c2680a) {
        this.f49780a = c2680a;
    }

    public static a b() {
        return new a();
    }

    public C2680a a() {
        return this.f49780a;
    }

    public byte[] c() {
        return zze.zzc(this);
    }
}
