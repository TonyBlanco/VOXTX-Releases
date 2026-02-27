package v6;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.l;
import o8.InterfaceC2372d;
import v6.InterfaceC2894h;

/* JADX INFO: renamed from: v6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2888b implements InterfaceC2894h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f51409b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f51410a;

    /* JADX INFO: renamed from: v6.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public C2888b(Context context) {
        l.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f51410a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // v6.InterfaceC2894h
    public Boolean a() {
        if (this.f51410a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f51410a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // v6.InterfaceC2894h
    public F8.a b() {
        if (this.f51410a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return F8.a.c(F8.c.o(this.f51410a.getInt("firebase_sessions_sessions_restart_timeout"), F8.d.SECONDS));
        }
        return null;
    }

    @Override // v6.InterfaceC2894h
    public Double c() {
        if (this.f51410a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f51410a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // v6.InterfaceC2894h
    public Object d(InterfaceC2372d interfaceC2372d) {
        return InterfaceC2894h.a.a(this, interfaceC2372d);
    }
}
