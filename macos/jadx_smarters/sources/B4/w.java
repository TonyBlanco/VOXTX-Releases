package b4;

import android.content.Context;
import android.net.Uri;
import b3.C1207a;
import b4.InterfaceC1224o;
import b4.x;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements InterfaceC1224o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17655b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1224o f17656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1224o f17657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1224o f17658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1224o f17659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1224o f17660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1224o f17661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC1224o f17662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC1224o f17663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC1224o f17664k;

    public static final class a implements InterfaceC1224o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1224o.a f17666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public S f17667c;

        public a(Context context) {
            this(context, new x.b());
        }

        public a(Context context, InterfaceC1224o.a aVar) {
            this.f17665a = context.getApplicationContext();
            this.f17666b = aVar;
        }

        @Override // b4.InterfaceC1224o.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w a() {
            w wVar = new w(this.f17665a, this.f17666b.a());
            S s9 = this.f17667c;
            if (s9 != null) {
                wVar.g(s9);
            }
            return wVar;
        }
    }

    public w(Context context, InterfaceC1224o interfaceC1224o) {
        this.f17654a = context.getApplicationContext();
        this.f17656c = (InterfaceC1224o) AbstractC1684a.e(interfaceC1224o);
    }

    public final void A(InterfaceC1224o interfaceC1224o, S s9) {
        if (interfaceC1224o != null) {
            interfaceC1224o.g(s9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // b4.InterfaceC1224o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(b4.C1227s r3) {
        /*
            r2 = this;
            b4.o r0 = r2.f17664k
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            d4.AbstractC1684a.g(r0)
            android.net.Uri r0 = r3.f17598a
            java.lang.String r0 = r0.getScheme()
            android.net.Uri r1 = r3.f17598a
            boolean r1 = d4.k0.F0(r1)
            if (r1 == 0) goto L2e
            android.net.Uri r0 = r3.f17598a
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L29
            java.lang.String r1 = "/android_asset/"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L29
            goto L36
        L29:
            b4.o r0 = r2.w()
            goto L3a
        L2e:
            java.lang.String r1 = "asset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3d
        L36:
            b4.o r0 = r2.t()
        L3a:
            r2.f17664k = r0
            goto L8a
        L3d:
            java.lang.String r1 = "content"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4a
            b4.o r0 = r2.u()
            goto L3a
        L4a:
            java.lang.String r1 = "rtmp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L57
            b4.o r0 = r2.y()
            goto L3a
        L57:
            java.lang.String r1 = "udp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L64
            b4.o r0 = r2.z()
            goto L3a
        L64:
            java.lang.String r1 = "data"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L71
            b4.o r0 = r2.v()
            goto L3a
        L71:
            java.lang.String r1 = "rawresource"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L85
            java.lang.String r1 = "android.resource"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L82
            goto L85
        L82:
            b4.o r0 = r2.f17656c
            goto L3a
        L85:
            b4.o r0 = r2.x()
            goto L3a
        L8a:
            b4.o r0 = r2.f17664k
            long r0 = r0.a(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.w.a(b4.s):long");
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        InterfaceC1224o interfaceC1224o = this.f17664k;
        if (interfaceC1224o != null) {
            try {
                interfaceC1224o.close();
            } finally {
                this.f17664k = null;
            }
        }
    }

    @Override // b4.InterfaceC1224o
    public Map e() {
        InterfaceC1224o interfaceC1224o = this.f17664k;
        return interfaceC1224o == null ? Collections.emptyMap() : interfaceC1224o.e();
    }

    @Override // b4.InterfaceC1224o
    public void g(S s9) {
        AbstractC1684a.e(s9);
        this.f17656c.g(s9);
        this.f17655b.add(s9);
        A(this.f17657d, s9);
        A(this.f17658e, s9);
        A(this.f17659f, s9);
        A(this.f17660g, s9);
        A(this.f17661h, s9);
        A(this.f17662i, s9);
        A(this.f17663j, s9);
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        InterfaceC1224o interfaceC1224o = this.f17664k;
        if (interfaceC1224o == null) {
            return null;
        }
        return interfaceC1224o.getUri();
    }

    public final void j(InterfaceC1224o interfaceC1224o) {
        for (int i9 = 0; i9 < this.f17655b.size(); i9++) {
            interfaceC1224o.g((S) this.f17655b.get(i9));
        }
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) {
        return ((InterfaceC1224o) AbstractC1684a.e(this.f17664k)).read(bArr, i9, i10);
    }

    public final InterfaceC1224o t() {
        if (this.f17658e == null) {
            C1212c c1212c = new C1212c(this.f17654a);
            this.f17658e = c1212c;
            j(c1212c);
        }
        return this.f17658e;
    }

    public final InterfaceC1224o u() {
        if (this.f17659f == null) {
            C1219j c1219j = new C1219j(this.f17654a);
            this.f17659f = c1219j;
            j(c1219j);
        }
        return this.f17659f;
    }

    public final InterfaceC1224o v() {
        if (this.f17662i == null) {
            C1221l c1221l = new C1221l();
            this.f17662i = c1221l;
            j(c1221l);
        }
        return this.f17662i;
    }

    public final InterfaceC1224o w() {
        if (this.f17657d == null) {
            C1209B c1209b = new C1209B();
            this.f17657d = c1209b;
            j(c1209b);
        }
        return this.f17657d;
    }

    public final InterfaceC1224o x() {
        if (this.f17663j == null) {
            L l9 = new L(this.f17654a);
            this.f17663j = l9;
            j(l9);
        }
        return this.f17663j;
    }

    public final InterfaceC1224o y() {
        if (this.f17660g == null) {
            try {
                int i9 = C1207a.f17468g;
                InterfaceC1224o interfaceC1224o = (InterfaceC1224o) C1207a.class.getConstructor(null).newInstance(null);
                this.f17660g = interfaceC1224o;
                j(interfaceC1224o);
            } catch (ClassNotFoundException unused) {
                AbstractC1681B.j("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating RTMP extension", e9);
            }
            if (this.f17660g == null) {
                this.f17660g = this.f17656c;
            }
        }
        return this.f17660g;
    }

    public final InterfaceC1224o z() {
        if (this.f17661h == null) {
            T t9 = new T();
            this.f17661h = t9;
            j(t9);
        }
        return this.f17661h;
    }
}
