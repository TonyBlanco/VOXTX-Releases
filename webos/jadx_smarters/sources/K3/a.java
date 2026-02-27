package K3;

import O2.C0897l1;
import d4.AbstractC1684a;
import d4.k0;
import java.util.HashMap;
import s5.AbstractC2717A;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC2717A f3683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f3684j;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashMap f3689e = new HashMap();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3690f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f3691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f3692h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f3693i;

        public b(String str, int i9, String str2, int i10) {
            this.f3685a = str;
            this.f3686b = i9;
            this.f3687c = str2;
            this.f3688d = i10;
        }

        public static String k(int i9, String str, int i10, int i11) {
            return k0.D("%d %s/%d/%d", Integer.valueOf(i9), str, Integer.valueOf(i10), Integer.valueOf(i11));
        }

        public static String l(int i9) {
            AbstractC1684a.a(i9 < 96);
            if (i9 == 0) {
                return k(0, "PCMU", 8000, 1);
            }
            if (i9 == 8) {
                return k(8, "PCMA", 8000, 1);
            }
            if (i9 == 10) {
                return k(10, "L16", 44100, 2);
            }
            if (i9 == 11) {
                return k(11, "L16", 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type " + i9);
        }

        public b i(String str, String str2) {
            this.f3689e.put(str, str2);
            return this;
        }

        public a j() {
            try {
                return new a(this, AbstractC2717A.d(this.f3689e), c.a(this.f3689e.containsKey("rtpmap") ? (String) k0.j((String) this.f3689e.get("rtpmap")) : l(this.f3688d)));
            } catch (C0897l1 e9) {
                throw new IllegalStateException(e9);
            }
        }

        public b m(int i9) {
            this.f3690f = i9;
            return this;
        }

        public b n(String str) {
            this.f3692h = str;
            return this;
        }

        public b o(String str) {
            this.f3693i = str;
            return this;
        }

        public b p(String str) {
            this.f3691g = str;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3697d;

        public c(int i9, String str, int i10, int i11) {
            this.f3694a = i9;
            this.f3695b = str;
            this.f3696c = i10;
            this.f3697d = i11;
        }

        public static c a(String str) throws C0897l1 {
            String[] strArrJ1 = k0.j1(str, " ");
            AbstractC1684a.a(strArrJ1.length == 2);
            int iH = com.google.android.exoplayer2.source.rtsp.h.h(strArrJ1[0]);
            String[] strArrI1 = k0.i1(strArrJ1[1].trim(), "/");
            AbstractC1684a.a(strArrI1.length >= 2);
            return new c(iH, strArrI1[0], com.google.android.exoplayer2.source.rtsp.h.h(strArrI1[1]), strArrI1.length == 3 ? com.google.android.exoplayer2.source.rtsp.h.h(strArrI1[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3694a == cVar.f3694a && this.f3695b.equals(cVar.f3695b) && this.f3696c == cVar.f3696c && this.f3697d == cVar.f3697d;
        }

        public int hashCode() {
            return ((((((217 + this.f3694a) * 31) + this.f3695b.hashCode()) * 31) + this.f3696c) * 31) + this.f3697d;
        }
    }

    public a(b bVar, AbstractC2717A abstractC2717A, c cVar) {
        this.f3675a = bVar.f3685a;
        this.f3676b = bVar.f3686b;
        this.f3677c = bVar.f3687c;
        this.f3678d = bVar.f3688d;
        this.f3680f = bVar.f3691g;
        this.f3681g = bVar.f3692h;
        this.f3679e = bVar.f3690f;
        this.f3682h = bVar.f3693i;
        this.f3683i = abstractC2717A;
        this.f3684j = cVar;
    }

    public AbstractC2717A a() {
        String str = (String) this.f3683i.get("fmtp");
        if (str == null) {
            return AbstractC2717A.k();
        }
        String[] strArrJ1 = k0.j1(str, " ");
        AbstractC1684a.b(strArrJ1.length == 2, str);
        String[] strArrSplit = strArrJ1[1].split(";\\s?", 0);
        AbstractC2717A.a aVar = new AbstractC2717A.a();
        for (String str2 : strArrSplit) {
            String[] strArrJ12 = k0.j1(str2, "=");
            aVar.f(strArrJ12[0], strArrJ12[1]);
        }
        return aVar.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3675a.equals(aVar.f3675a) && this.f3676b == aVar.f3676b && this.f3677c.equals(aVar.f3677c) && this.f3678d == aVar.f3678d && this.f3679e == aVar.f3679e && this.f3683i.equals(aVar.f3683i) && this.f3684j.equals(aVar.f3684j) && k0.c(this.f3680f, aVar.f3680f) && k0.c(this.f3681g, aVar.f3681g) && k0.c(this.f3682h, aVar.f3682h);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.f3675a.hashCode()) * 31) + this.f3676b) * 31) + this.f3677c.hashCode()) * 31) + this.f3678d) * 31) + this.f3679e) * 31) + this.f3683i.hashCode()) * 31) + this.f3684j.hashCode()) * 31;
        String str = this.f3680f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3681g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3682h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
