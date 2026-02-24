package K3;

import android.net.Uri;
import d4.k0;
import java.util.HashMap;
import s5.AbstractC2717A;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2717A f3778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2743y f3779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f3784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f3788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f3789l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f3790a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2743y.a f3791b = new AbstractC2743y.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3792c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f3793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f3794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f3795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Uri f3796g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f3797h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f3798i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f3799j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f3800k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f3801l;

        public b m(String str, String str2) {
            this.f3790a.put(str, str2);
            return this;
        }

        public b n(K3.a aVar) {
            this.f3791b.a(aVar);
            return this;
        }

        public y o() {
            return new y(this);
        }

        public b p(int i9) {
            this.f3792c = i9;
            return this;
        }

        public b q(String str) {
            this.f3797h = str;
            return this;
        }

        public b r(String str) {
            this.f3800k = str;
            return this;
        }

        public b s(String str) {
            this.f3798i = str;
            return this;
        }

        public b t(String str) {
            this.f3794e = str;
            return this;
        }

        public b u(String str) {
            this.f3801l = str;
            return this;
        }

        public b v(String str) {
            this.f3799j = str;
            return this;
        }

        public b w(String str) {
            this.f3793d = str;
            return this;
        }

        public b x(String str) {
            this.f3795f = str;
            return this;
        }

        public b y(Uri uri) {
            this.f3796g = uri;
            return this;
        }
    }

    public y(b bVar) {
        this.f3778a = AbstractC2717A.d(bVar.f3790a);
        this.f3779b = bVar.f3791b.k();
        this.f3780c = (String) k0.j(bVar.f3793d);
        this.f3781d = (String) k0.j(bVar.f3794e);
        this.f3782e = (String) k0.j(bVar.f3795f);
        this.f3784g = bVar.f3796g;
        this.f3785h = bVar.f3797h;
        this.f3783f = bVar.f3792c;
        this.f3786i = bVar.f3798i;
        this.f3787j = bVar.f3800k;
        this.f3788k = bVar.f3801l;
        this.f3789l = bVar.f3799j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f3783f == yVar.f3783f && this.f3778a.equals(yVar.f3778a) && this.f3779b.equals(yVar.f3779b) && k0.c(this.f3781d, yVar.f3781d) && k0.c(this.f3780c, yVar.f3780c) && k0.c(this.f3782e, yVar.f3782e) && k0.c(this.f3789l, yVar.f3789l) && k0.c(this.f3784g, yVar.f3784g) && k0.c(this.f3787j, yVar.f3787j) && k0.c(this.f3788k, yVar.f3788k) && k0.c(this.f3785h, yVar.f3785h) && k0.c(this.f3786i, yVar.f3786i);
    }

    public int hashCode() {
        int iHashCode = (((217 + this.f3778a.hashCode()) * 31) + this.f3779b.hashCode()) * 31;
        String str = this.f3781d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3780c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3782e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f3783f) * 31;
        String str4 = this.f3789l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f3784g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f3787j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f3788k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f3785h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f3786i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
