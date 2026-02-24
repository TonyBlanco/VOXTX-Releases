package Q5;

import Q5.B;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import d.AbstractC1617D;
import d6.InterfaceC1711a;
import d6.InterfaceC1712b;
import org.apache.http.cookie.ClientCookie;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: renamed from: Q5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1040a implements InterfaceC1711a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1711a f8044a = new C1040a();

    /* JADX INFO: renamed from: Q5.a$a, reason: collision with other inner class name */
    public static final class C0109a implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0109a f8045a = new C0109a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8046b = c6.d.d("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8047c = c6.d.d("libraryName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8048d = c6.d.d("buildId");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.a.AbstractC0093a abstractC0093a, c6.f fVar) {
            fVar.add(f8046b, abstractC0093a.b());
            fVar.add(f8047c, abstractC0093a.d());
            fVar.add(f8048d, abstractC0093a.c());
        }
    }

    /* JADX INFO: renamed from: Q5.a$b */
    public static final class b implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8049a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8050b = c6.d.d("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8051c = c6.d.d("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8052d = c6.d.d("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8053e = c6.d.d("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8054f = c6.d.d("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c6.d f8055g = c6.d.d("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c6.d f8056h = c6.d.d("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c6.d f8057i = c6.d.d("traceFile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c6.d f8058j = c6.d.d("buildIdMappingForArch");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.a aVar, c6.f fVar) {
            fVar.add(f8050b, aVar.d());
            fVar.add(f8051c, aVar.e());
            fVar.add(f8052d, aVar.g());
            fVar.add(f8053e, aVar.c());
            fVar.add(f8054f, aVar.f());
            fVar.add(f8055g, aVar.h());
            fVar.add(f8056h, aVar.i());
            fVar.add(f8057i, aVar.j());
            fVar.add(f8058j, aVar.b());
        }
    }

    /* JADX INFO: renamed from: Q5.a$c */
    public static final class c implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8059a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8060b = c6.d.d("key");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8061c = c6.d.d("value");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.c cVar, c6.f fVar) {
            fVar.add(f8060b, cVar.b());
            fVar.add(f8061c, cVar.c());
        }
    }

    /* JADX INFO: renamed from: Q5.a$d */
    public static final class d implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f8062a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8063b = c6.d.d("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8064c = c6.d.d("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8065d = c6.d.d("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8066e = c6.d.d("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8067f = c6.d.d("firebaseInstallationId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c6.d f8068g = c6.d.d("buildVersion");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c6.d f8069h = c6.d.d("displayVersion");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c6.d f8070i = c6.d.d("session");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c6.d f8071j = c6.d.d("ndkPayload");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final c6.d f8072k = c6.d.d("appExitInfo");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B b9, c6.f fVar) {
            fVar.add(f8063b, b9.k());
            fVar.add(f8064c, b9.g());
            fVar.add(f8065d, b9.j());
            fVar.add(f8066e, b9.h());
            fVar.add(f8067f, b9.f());
            fVar.add(f8068g, b9.d());
            fVar.add(f8069h, b9.e());
            fVar.add(f8070i, b9.l());
            fVar.add(f8071j, b9.i());
            fVar.add(f8072k, b9.c());
        }
    }

    /* JADX INFO: renamed from: Q5.a$e */
    public static final class e implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f8073a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8074b = c6.d.d("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8075c = c6.d.d("orgId");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.d dVar, c6.f fVar) {
            fVar.add(f8074b, dVar.b());
            fVar.add(f8075c, dVar.c());
        }
    }

    /* JADX INFO: renamed from: Q5.a$f */
    public static final class f implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f8076a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8077b = c6.d.d("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8078c = c6.d.d("contents");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.d.b bVar, c6.f fVar) {
            fVar.add(f8077b, bVar.c());
            fVar.add(f8078c, bVar.b());
        }
    }

    /* JADX INFO: renamed from: Q5.a$g */
    public static final class g implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f8079a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8080b = c6.d.d("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8081c = c6.d.d(ClientCookie.VERSION_ATTR);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8082d = c6.d.d("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8083e = c6.d.d("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8084f = c6.d.d("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c6.d f8085g = c6.d.d("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c6.d f8086h = c6.d.d("developmentPlatformVersion");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.a aVar, c6.f fVar) {
            fVar.add(f8080b, aVar.e());
            fVar.add(f8081c, aVar.h());
            fVar.add(f8082d, aVar.d());
            c6.d dVar = f8083e;
            aVar.g();
            fVar.add(dVar, (Object) null);
            fVar.add(f8084f, aVar.f());
            fVar.add(f8085g, aVar.b());
            fVar.add(f8086h, aVar.c());
        }
    }

    /* JADX INFO: renamed from: Q5.a$h */
    public static final class h implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f8087a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8088b = c6.d.d("clsId");

        public void a(B.e.a.b bVar, c6.f fVar) {
            throw null;
        }

        @Override // c6.b
        public /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
            AbstractC1617D.a(obj);
            a(null, (c6.f) obj2);
        }
    }

    /* JADX INFO: renamed from: Q5.a$i */
    public static final class i implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f8089a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8090b = c6.d.d("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8091c = c6.d.d("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8092d = c6.d.d("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8093e = c6.d.d("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8094f = c6.d.d("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c6.d f8095g = c6.d.d("simulator");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c6.d f8096h = c6.d.d("state");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c6.d f8097i = c6.d.d("manufacturer");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c6.d f8098j = c6.d.d("modelClass");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.c cVar, c6.f fVar) {
            fVar.add(f8090b, cVar.b());
            fVar.add(f8091c, cVar.f());
            fVar.add(f8092d, cVar.c());
            fVar.add(f8093e, cVar.h());
            fVar.add(f8094f, cVar.d());
            fVar.add(f8095g, cVar.j());
            fVar.add(f8096h, cVar.i());
            fVar.add(f8097i, cVar.e());
            fVar.add(f8098j, cVar.g());
        }
    }

    /* JADX INFO: renamed from: Q5.a$j */
    public static final class j implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f8099a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8100b = c6.d.d("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8101c = c6.d.d("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8102d = c6.d.d("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8103e = c6.d.d("startedAt");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8104f = c6.d.d("endedAt");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c6.d f8105g = c6.d.d("crashed");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c6.d f8106h = c6.d.d("app");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c6.d f8107i = c6.d.d("user");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final c6.d f8108j = c6.d.d("os");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final c6.d f8109k = c6.d.d("device");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final c6.d f8110l = c6.d.d("events");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final c6.d f8111m = c6.d.d("generatorType");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e eVar, c6.f fVar) {
            fVar.add(f8100b, eVar.g());
            fVar.add(f8101c, eVar.j());
            fVar.add(f8102d, eVar.c());
            fVar.add(f8103e, eVar.l());
            fVar.add(f8104f, eVar.e());
            fVar.add(f8105g, eVar.n());
            fVar.add(f8106h, eVar.b());
            fVar.add(f8107i, eVar.m());
            fVar.add(f8108j, eVar.k());
            fVar.add(f8109k, eVar.d());
            fVar.add(f8110l, eVar.f());
            fVar.add(f8111m, eVar.h());
        }
    }

    /* JADX INFO: renamed from: Q5.a$k */
    public static final class k implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f8112a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8113b = c6.d.d("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8114c = c6.d.d("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8115d = c6.d.d("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8116e = c6.d.d("background");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8117f = c6.d.d("uiOrientation");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.a aVar, c6.f fVar) {
            fVar.add(f8113b, aVar.d());
            fVar.add(f8114c, aVar.c());
            fVar.add(f8115d, aVar.e());
            fVar.add(f8116e, aVar.b());
            fVar.add(f8117f, aVar.f());
        }
    }

    /* JADX INFO: renamed from: Q5.a$l */
    public static final class l implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f8118a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8119b = c6.d.d("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8120c = c6.d.d("size");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8121d = c6.d.d("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8122e = c6.d.d("uuid");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.a.b.AbstractC0097a abstractC0097a, c6.f fVar) {
            fVar.add(f8119b, abstractC0097a.b());
            fVar.add(f8120c, abstractC0097a.d());
            fVar.add(f8121d, abstractC0097a.c());
            fVar.add(f8122e, abstractC0097a.f());
        }
    }

    /* JADX INFO: renamed from: Q5.a$m */
    public static final class m implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f8123a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8124b = c6.d.d("threads");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8125c = c6.d.d("exception");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8126d = c6.d.d("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8127e = c6.d.d("signal");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8128f = c6.d.d("binaries");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.a.b bVar, c6.f fVar) {
            fVar.add(f8124b, bVar.f());
            fVar.add(f8125c, bVar.d());
            fVar.add(f8126d, bVar.b());
            fVar.add(f8127e, bVar.e());
            fVar.add(f8128f, bVar.c());
        }
    }

    /* JADX INFO: renamed from: Q5.a$n */
    public static final class n implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f8129a = new n();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8130b = c6.d.d("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8131c = c6.d.d("reason");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8132d = c6.d.d("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8133e = c6.d.d("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8134f = c6.d.d("overflowCount");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.a.b.c cVar, c6.f fVar) {
            fVar.add(f8130b, cVar.f());
            fVar.add(f8131c, cVar.e());
            fVar.add(f8132d, cVar.c());
            fVar.add(f8133e, cVar.b());
            fVar.add(f8134f, cVar.d());
        }
    }

    /* JADX INFO: renamed from: Q5.a$o */
    public static final class o implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f8135a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8136b = c6.d.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8137c = c6.d.d("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8138d = c6.d.d("address");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.a.b.AbstractC0101d abstractC0101d, c6.f fVar) {
            fVar.add(f8136b, abstractC0101d.d());
            fVar.add(f8137c, abstractC0101d.c());
            fVar.add(f8138d, abstractC0101d.b());
        }
    }

    /* JADX INFO: renamed from: Q5.a$p */
    public static final class p implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f8139a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8140b = c6.d.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8141c = c6.d.d("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8142d = c6.d.d("frames");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.a.b.AbstractC0103e abstractC0103e, c6.f fVar) {
            fVar.add(f8140b, abstractC0103e.d());
            fVar.add(f8141c, abstractC0103e.c());
            fVar.add(f8142d, abstractC0103e.b());
        }
    }

    /* JADX INFO: renamed from: Q5.a$q */
    public static final class q implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f8143a = new q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8144b = c6.d.d("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8145c = c6.d.d("symbol");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8146d = c6.d.d(TransferTable.COLUMN_FILE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8147e = c6.d.d(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8148f = c6.d.d("importance");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.a.b.AbstractC0103e.AbstractC0105b abstractC0105b, c6.f fVar) {
            fVar.add(f8144b, abstractC0105b.e());
            fVar.add(f8145c, abstractC0105b.f());
            fVar.add(f8146d, abstractC0105b.b());
            fVar.add(f8147e, abstractC0105b.d());
            fVar.add(f8148f, abstractC0105b.c());
        }
    }

    /* JADX INFO: renamed from: Q5.a$r */
    public static final class r implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f8149a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8150b = c6.d.d("batteryLevel");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8151c = c6.d.d("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8152d = c6.d.d("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8153e = c6.d.d("orientation");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8154f = c6.d.d("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c6.d f8155g = c6.d.d("diskUsed");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.c cVar, c6.f fVar) {
            fVar.add(f8150b, cVar.b());
            fVar.add(f8151c, cVar.c());
            fVar.add(f8152d, cVar.g());
            fVar.add(f8153e, cVar.e());
            fVar.add(f8154f, cVar.f());
            fVar.add(f8155g, cVar.d());
        }
    }

    /* JADX INFO: renamed from: Q5.a$s */
    public static final class s implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f8156a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8157b = c6.d.d("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8158c = c6.d.d("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8159d = c6.d.d("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8160e = c6.d.d("device");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f8161f = c6.d.d("log");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d dVar, c6.f fVar) {
            fVar.add(f8157b, dVar.e());
            fVar.add(f8158c, dVar.f());
            fVar.add(f8159d, dVar.b());
            fVar.add(f8160e, dVar.c());
            fVar.add(f8161f, dVar.d());
        }
    }

    /* JADX INFO: renamed from: Q5.a$t */
    public static final class t implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f8162a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8163b = c6.d.d("content");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.d.AbstractC0107d abstractC0107d, c6.f fVar) {
            fVar.add(f8163b, abstractC0107d.b());
        }
    }

    /* JADX INFO: renamed from: Q5.a$u */
    public static final class u implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f8164a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8165b = c6.d.d("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f8166c = c6.d.d(ClientCookie.VERSION_ATTR);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f8167d = c6.d.d("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f8168e = c6.d.d("jailbroken");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.AbstractC0108e abstractC0108e, c6.f fVar) {
            fVar.add(f8165b, abstractC0108e.c());
            fVar.add(f8166c, abstractC0108e.d());
            fVar.add(f8167d, abstractC0108e.b());
            fVar.add(f8168e, abstractC0108e.e());
        }
    }

    /* JADX INFO: renamed from: Q5.a$v */
    public static final class v implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f8169a = new v();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f8170b = c6.d.d("identifier");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(B.e.f fVar, c6.f fVar2) {
            fVar2.add(f8170b, fVar.b());
        }
    }

    @Override // d6.InterfaceC1711a
    public void configure(InterfaceC1712b interfaceC1712b) {
        d dVar = d.f8062a;
        interfaceC1712b.registerEncoder(B.class, dVar);
        interfaceC1712b.registerEncoder(C1041b.class, dVar);
        j jVar = j.f8099a;
        interfaceC1712b.registerEncoder(B.e.class, jVar);
        interfaceC1712b.registerEncoder(Q5.h.class, jVar);
        g gVar = g.f8079a;
        interfaceC1712b.registerEncoder(B.e.a.class, gVar);
        interfaceC1712b.registerEncoder(Q5.i.class, gVar);
        h hVar = h.f8087a;
        interfaceC1712b.registerEncoder(B.e.a.b.class, hVar);
        interfaceC1712b.registerEncoder(Q5.j.class, hVar);
        v vVar = v.f8169a;
        interfaceC1712b.registerEncoder(B.e.f.class, vVar);
        interfaceC1712b.registerEncoder(w.class, vVar);
        u uVar = u.f8164a;
        interfaceC1712b.registerEncoder(B.e.AbstractC0108e.class, uVar);
        interfaceC1712b.registerEncoder(Q5.v.class, uVar);
        i iVar = i.f8089a;
        interfaceC1712b.registerEncoder(B.e.c.class, iVar);
        interfaceC1712b.registerEncoder(Q5.k.class, iVar);
        s sVar = s.f8156a;
        interfaceC1712b.registerEncoder(B.e.d.class, sVar);
        interfaceC1712b.registerEncoder(Q5.l.class, sVar);
        k kVar = k.f8112a;
        interfaceC1712b.registerEncoder(B.e.d.a.class, kVar);
        interfaceC1712b.registerEncoder(Q5.m.class, kVar);
        m mVar = m.f8123a;
        interfaceC1712b.registerEncoder(B.e.d.a.b.class, mVar);
        interfaceC1712b.registerEncoder(Q5.n.class, mVar);
        p pVar = p.f8139a;
        interfaceC1712b.registerEncoder(B.e.d.a.b.AbstractC0103e.class, pVar);
        interfaceC1712b.registerEncoder(Q5.r.class, pVar);
        q qVar = q.f8143a;
        interfaceC1712b.registerEncoder(B.e.d.a.b.AbstractC0103e.AbstractC0105b.class, qVar);
        interfaceC1712b.registerEncoder(Q5.s.class, qVar);
        n nVar = n.f8129a;
        interfaceC1712b.registerEncoder(B.e.d.a.b.c.class, nVar);
        interfaceC1712b.registerEncoder(Q5.p.class, nVar);
        b bVar = b.f8049a;
        interfaceC1712b.registerEncoder(B.a.class, bVar);
        interfaceC1712b.registerEncoder(C1042c.class, bVar);
        C0109a c0109a = C0109a.f8045a;
        interfaceC1712b.registerEncoder(B.a.AbstractC0093a.class, c0109a);
        interfaceC1712b.registerEncoder(C1043d.class, c0109a);
        o oVar = o.f8135a;
        interfaceC1712b.registerEncoder(B.e.d.a.b.AbstractC0101d.class, oVar);
        interfaceC1712b.registerEncoder(Q5.q.class, oVar);
        l lVar = l.f8118a;
        interfaceC1712b.registerEncoder(B.e.d.a.b.AbstractC0097a.class, lVar);
        interfaceC1712b.registerEncoder(Q5.o.class, lVar);
        c cVar = c.f8059a;
        interfaceC1712b.registerEncoder(B.c.class, cVar);
        interfaceC1712b.registerEncoder(Q5.e.class, cVar);
        r rVar = r.f8149a;
        interfaceC1712b.registerEncoder(B.e.d.c.class, rVar);
        interfaceC1712b.registerEncoder(Q5.t.class, rVar);
        t tVar = t.f8162a;
        interfaceC1712b.registerEncoder(B.e.d.AbstractC0107d.class, tVar);
        interfaceC1712b.registerEncoder(Q5.u.class, tVar);
        e eVar = e.f8073a;
        interfaceC1712b.registerEncoder(B.d.class, eVar);
        interfaceC1712b.registerEncoder(Q5.f.class, eVar);
        f fVar = f.f8076a;
        interfaceC1712b.registerEncoder(B.d.b.class, fVar);
        interfaceC1712b.registerEncoder(Q5.g.class, fVar);
    }
}
