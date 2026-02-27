package t6;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f50849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w8.a f50850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f50853f;

    public /* synthetic */ class a extends kotlin.jvm.internal.j implements w8.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f50854d = new a();

        public a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // w8.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public t(boolean z9, y timeProvider, w8.a uuidGenerator) {
        kotlin.jvm.internal.l.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.l.e(uuidGenerator, "uuidGenerator");
        this.f50848a = z9;
        this.f50849b = timeProvider;
        this.f50850c = uuidGenerator;
        this.f50851d = b();
        this.f50852e = -1;
    }

    public /* synthetic */ t(boolean z9, y yVar, w8.a aVar, int i9, kotlin.jvm.internal.g gVar) {
        this(z9, yVar, (i9 & 4) != 0 ? a.f50854d : aVar);
    }

    public final q a() {
        int i9 = this.f50852e + 1;
        this.f50852e = i9;
        this.f50853f = new q(i9 == 0 ? this.f50851d : b(), this.f50851d, this.f50852e, this.f50849b.b());
        return d();
    }

    public final String b() {
        String string = ((UUID) this.f50850c.invoke()).toString();
        kotlin.jvm.internal.l.d(string, "uuidGenerator().toString()");
        String lowerCase = E8.n.x(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final boolean c() {
        return this.f50848a;
    }

    public final q d() {
        q qVar = this.f50853f;
        if (qVar != null) {
            return qVar;
        }
        kotlin.jvm.internal.l.s("currentSession");
        return null;
    }

    public final boolean e() {
        return this.f50853f != null;
    }
}
