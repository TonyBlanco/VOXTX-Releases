package J3;

import O2.C0936z0;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import z3.C3028H;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f3170n = new g("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f3174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f3175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f3176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0936z0 f3177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f3178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f3179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f3180m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f3181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0936z0 f3182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f3184d;

        public a(Uri uri, C0936z0 c0936z0, String str, String str2) {
            this.f3181a = uri;
            this.f3182b = c0936z0;
            this.f3183c = str;
            this.f3184d = str2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f3185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0936z0 f3186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f3188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f3189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f3190f;

        public b(Uri uri, C0936z0 c0936z0, String str, String str2, String str3, String str4) {
            this.f3185a = uri;
            this.f3186b = c0936z0;
            this.f3187c = str;
            this.f3188d = str2;
            this.f3189e = str3;
            this.f3190f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new C0936z0.b().U("0").M("application/x-mpegURL").G(), null, null, null, null);
        }

        public b a(C0936z0 c0936z0) {
            return new b(this.f3185a, c0936z0, this.f3187c, this.f3188d, this.f3189e, this.f3190f);
        }
    }

    public g(String str, List list, List list2, List list3, List list4, List list5, List list6, C0936z0 c0936z0, List list7, boolean z9, Map map, List list8) {
        super(str, list, z9);
        this.f3171d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f3172e = Collections.unmodifiableList(list2);
        this.f3173f = Collections.unmodifiableList(list3);
        this.f3174g = Collections.unmodifiableList(list4);
        this.f3175h = Collections.unmodifiableList(list5);
        this.f3176i = Collections.unmodifiableList(list6);
        this.f3177j = c0936z0;
        this.f3178k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f3179l = Collections.unmodifiableMap(map);
        this.f3180m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, List list2) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            Uri uri = ((a) list.get(i9)).f3181a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static List d(List list, int i9, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    C3028H c3028h = (C3028H) list2.get(i11);
                    if (c3028h.f52701c == i9 && c3028h.f52702d == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    public static g e(String str) {
        return new g("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    public static List f(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            Uri uri = ((b) list.get(i9)).f3185a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // z3.InterfaceC3023C
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g a(List list) {
        return new g(this.f3191a, this.f3192b, d(this.f3172e, 0, list), Collections.emptyList(), d(this.f3174g, 1, list), d(this.f3175h, 2, list), Collections.emptyList(), this.f3177j, this.f3178k, this.f3193c, this.f3179l, this.f3180m);
    }
}
