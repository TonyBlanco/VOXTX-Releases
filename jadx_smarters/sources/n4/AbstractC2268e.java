package n4;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC1418q;
import java.util.UUID;
import t4.AbstractC2786m;

/* JADX INFO: renamed from: n4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2268e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f45380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f45381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0252a f45382c;

    /* JADX INFO: renamed from: n4.e$a */
    public interface a extends com.google.android.gms.common.api.h {
        C2266d A();

        boolean d();

        String f();

        String getSessionId();
    }

    /* JADX INFO: renamed from: n4.e$b */
    public interface b {
    }

    /* JADX INFO: renamed from: n4.e$c */
    public static final class c implements a.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CastDevice f45383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f45384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f45385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f45386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f45387f = UUID.randomUUID().toString();

        /* JADX INFO: renamed from: n4.e$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CastDevice f45388a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f45389b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f45390c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Bundle f45391d;

            public a(CastDevice castDevice, d dVar) {
                com.google.android.gms.common.internal.r.n(castDevice, "CastDevice parameter cannot be null");
                com.google.android.gms.common.internal.r.n(dVar, "CastListener parameter cannot be null");
                this.f45388a = castDevice;
                this.f45389b = dVar;
                this.f45390c = 0;
            }

            public c a() {
                return new c(this, null);
            }

            public final a d(Bundle bundle) {
                this.f45391d = bundle;
                return this;
            }
        }

        public /* synthetic */ c(a aVar, B0 b02) {
            this.f45383b = aVar.f45388a;
            this.f45384c = aVar.f45389b;
            this.f45386e = aVar.f45390c;
            this.f45385d = aVar.f45391d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC1418q.b(this.f45383b, cVar.f45383b) && AbstractC1418q.a(this.f45385d, cVar.f45385d) && this.f45386e == cVar.f45386e && AbstractC1418q.b(this.f45387f, cVar.f45387f);
        }

        public int hashCode() {
            return AbstractC1418q.c(this.f45383b, this.f45385d, Integer.valueOf(this.f45386e), this.f45387f);
        }
    }

    /* JADX INFO: renamed from: n4.e$d */
    public static class d {
        public void onActiveInputStateChanged(int i9) {
        }

        public void onApplicationDisconnected(int i9) {
        }

        public void onApplicationMetadataChanged(C2266d c2266d) {
        }

        public void onApplicationStatusChanged() {
        }

        public void onDeviceNameChanged() {
        }

        public void onStandbyStateChanged(int i9) {
        }

        public void onVolumeChanged() {
        }
    }

    /* JADX INFO: renamed from: n4.e$e, reason: collision with other inner class name */
    public interface InterfaceC0394e {
        void a(CastDevice castDevice, String str, String str2);
    }

    static {
        z0 z0Var = new z0();
        f45382c = z0Var;
        f45380a = new com.google.android.gms.common.api.a("Cast.API", z0Var, AbstractC2786m.f50721a);
        f45381b = new A0();
    }

    public static D0 a(Context context, c cVar) {
        return new Y(context, cVar);
    }
}
