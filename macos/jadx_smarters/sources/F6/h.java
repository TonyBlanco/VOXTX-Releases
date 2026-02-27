package f6;

import d6.InterfaceC1711a;
import d6.InterfaceC1712b;
import f6.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f40847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c6.e f40848c;

    public static final class a implements InterfaceC1712b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.e f40849d = new c6.e() { // from class: f6.g
            @Override // c6.b
            public final void encode(Object obj, Object obj2) {
                h.a.d(obj, (c6.f) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f40850a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f40851b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c6.e f40852c = f40849d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(Object obj, c6.f fVar) {
            throw new c6.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h b() {
            return new h(new HashMap(this.f40850a), new HashMap(this.f40851b), this.f40852c);
        }

        public a c(InterfaceC1711a interfaceC1711a) {
            interfaceC1711a.configure(this);
            return this;
        }

        @Override // d6.InterfaceC1712b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a registerEncoder(Class cls, c6.e eVar) {
            this.f40850a.put(cls, eVar);
            this.f40851b.remove(cls);
            return this;
        }
    }

    public h(Map map, Map map2, c6.e eVar) {
        this.f40846a = map;
        this.f40847b = map2;
        this.f40848c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f40846a, this.f40847b, this.f40848c).o(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
