package e6;

import c6.InterfaceC1275a;
import c6.g;
import c6.h;
import com.amazonaws.util.DateUtils;
import d6.InterfaceC1711a;
import d6.InterfaceC1712b;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC1712b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c6.e f40432e = new c6.e() { // from class: e6.a
        @Override // c6.b
        public final void encode(Object obj, Object obj2) {
            d.k(obj, (c6.f) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f40433f = new g() { // from class: e6.b
        @Override // c6.b
        public final void encode(Object obj, Object obj2) {
            ((h) obj2).add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f40434g = new g() { // from class: e6.c
        @Override // c6.b
        public final void encode(Object obj, Object obj2) {
            d.m((Boolean) obj, (h) obj2);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f40435h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40436a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f40437b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c6.e f40438c = f40432e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40439d = false;

    public class a implements InterfaceC1275a {
        public a() {
        }

        @Override // c6.InterfaceC1275a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f40436a, d.this.f40437b, d.this.f40438c, d.this.f40439d);
            eVar.d(obj, false);
            eVar.n();
        }

        @Override // c6.InterfaceC1275a
        public String encode(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFormat f40441a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
            f40441a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(Date date, h hVar) {
            hVar.add(f40441a.format(date));
        }
    }

    public d() {
        o(String.class, f40433f);
        o(Boolean.class, f40434g);
        o(Date.class, f40435h);
    }

    public static /* synthetic */ void k(Object obj, c6.f fVar) {
        throw new c6.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void m(Boolean bool, h hVar) {
        hVar.add(bool.booleanValue());
    }

    public InterfaceC1275a h() {
        return new a();
    }

    public d i(InterfaceC1711a interfaceC1711a) {
        interfaceC1711a.configure(this);
        return this;
    }

    public d j(boolean z9) {
        this.f40439d = z9;
        return this;
    }

    @Override // d6.InterfaceC1712b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public d registerEncoder(Class cls, c6.e eVar) {
        this.f40436a.put(cls, eVar);
        this.f40437b.remove(cls);
        return this;
    }

    public d o(Class cls, g gVar) {
        this.f40437b.put(cls, gVar);
        this.f40436a.remove(cls);
        return this;
    }
}
