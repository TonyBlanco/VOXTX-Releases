package q6;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y4.AbstractC2985a;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends AbstractC2985a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f46970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f46971g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f46973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f46974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f46976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f46977f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f46978g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f46979h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f46980i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f46981j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f46982k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f46983l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f46984m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Uri f46985n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f46986o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Integer f46987p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Integer f46988q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Integer f46989r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int[] f46990s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Long f46991t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f46992u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f46993v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f46994w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f46995x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f46996y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final long[] f46997z;

        public a(J j9) {
            this.f46972a = j9.p("gcm.n.title");
            this.f46973b = j9.h("gcm.n.title");
            this.f46974c = c(j9, "gcm.n.title");
            this.f46975d = j9.p("gcm.n.body");
            this.f46976e = j9.h("gcm.n.body");
            this.f46977f = c(j9, "gcm.n.body");
            this.f46978g = j9.p("gcm.n.icon");
            this.f46980i = j9.o();
            this.f46981j = j9.p("gcm.n.tag");
            this.f46982k = j9.p("gcm.n.color");
            this.f46983l = j9.p("gcm.n.click_action");
            this.f46984m = j9.p("gcm.n.android_channel_id");
            this.f46985n = j9.f();
            this.f46979h = j9.p("gcm.n.image");
            this.f46986o = j9.p("gcm.n.ticker");
            this.f46987p = j9.b("gcm.n.notification_priority");
            this.f46988q = j9.b("gcm.n.visibility");
            this.f46989r = j9.b("gcm.n.notification_count");
            this.f46992u = j9.a("gcm.n.sticky");
            this.f46993v = j9.a("gcm.n.local_only");
            this.f46994w = j9.a("gcm.n.default_sound");
            this.f46995x = j9.a("gcm.n.default_vibrate_timings");
            this.f46996y = j9.a("gcm.n.default_light_settings");
            this.f46991t = j9.j("gcm.n.event_time");
            this.f46990s = j9.e();
            this.f46997z = j9.q();
        }

        public static String[] c(J j9, String str) {
            Object[] objArrG = j9.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i9 = 0; i9 < objArrG.length; i9++) {
                strArr[i9] = String.valueOf(objArrG[i9]);
            }
            return strArr;
        }

        public String a() {
            return this.f46975d;
        }

        public Uri b() {
            String str = this.f46979h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public String d() {
            return this.f46972a;
        }
    }

    public S(Bundle bundle) {
        this.f46970f = bundle;
    }

    public String H() {
        return this.f46970f.getString("from");
    }

    public a I() {
        if (this.f46971g == null && J.t(this.f46970f)) {
            this.f46971g = new a(new J(this.f46970f));
        }
        return this.f46971g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        T.c(this, parcel, i9);
    }
}
