package t6;

import android.util.Log;
import j6.InterfaceC2102b;
import z2.AbstractC3015c;
import z2.C3014b;
import z2.InterfaceC3017e;
import z2.InterfaceC3019g;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50810b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2102b f50811a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public h(InterfaceC2102b transportFactoryProvider) {
        kotlin.jvm.internal.l.e(transportFactoryProvider, "transportFactoryProvider");
        this.f50811a = transportFactoryProvider;
    }

    @Override // t6.i
    public void a(r sessionEvent) {
        kotlin.jvm.internal.l.e(sessionEvent, "sessionEvent");
        ((InterfaceC3019g) this.f50811a.get()).a("FIREBASE_APPQUALITY_SESSION", r.class, C3014b.b("json"), new InterfaceC3017e() { // from class: t6.g
            @Override // z2.InterfaceC3017e
            public final Object apply(Object obj) {
                return this.f50809a.c((r) obj);
            }
        }).a(AbstractC3015c.e(sessionEvent));
    }

    public final byte[] c(r rVar) {
        String strEncode = s.f50846a.b().encode(rVar);
        kotlin.jvm.internal.l.d(strEncode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + strEncode);
        byte[] bytes = strEncode.getBytes(E8.c.f1714b);
        kotlin.jvm.internal.l.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
