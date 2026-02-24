package u0;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: u0.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2811K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2811K f50924c = new C2811K(new Bundle(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f50925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f50926b;

    /* JADX INFO: renamed from: u0.K$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f50927a;

        public a() {
        }

        public a(C2811K c2811k) {
            if (c2811k == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c2811k.c();
            if (c2811k.f50926b.isEmpty()) {
                return;
            }
            this.f50927a = new ArrayList(c2811k.f50926b);
        }

        public a a(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    b((String) it.next());
                }
            }
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.f50927a == null) {
                this.f50927a = new ArrayList();
            }
            if (!this.f50927a.contains(str)) {
                this.f50927a.add(str);
            }
            return this;
        }

        public a c(C2811K c2811k) {
            if (c2811k == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            a(c2811k.e());
            return this;
        }

        public C2811K d() {
            if (this.f50927a == null) {
                return C2811K.f50924c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.f50927a);
            return new C2811K(bundle, this.f50927a);
        }
    }

    public C2811K(Bundle bundle, List list) {
        this.f50925a = bundle;
        this.f50926b = list;
    }

    public static C2811K d(Bundle bundle) {
        if (bundle != null) {
            return new C2811K(bundle, null);
        }
        return null;
    }

    public Bundle a() {
        return this.f50925a;
    }

    public boolean b(C2811K c2811k) {
        if (c2811k == null) {
            return false;
        }
        c();
        c2811k.c();
        return this.f50926b.containsAll(c2811k.f50926b);
    }

    public void c() {
        if (this.f50926b == null) {
            ArrayList<String> stringArrayList = this.f50925a.getStringArrayList("controlCategories");
            this.f50926b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f50926b = Collections.emptyList();
            }
        }
    }

    public List e() {
        c();
        return new ArrayList(this.f50926b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2811K)) {
            return false;
        }
        C2811K c2811k = (C2811K) obj;
        c();
        c2811k.c();
        return this.f50926b.equals(c2811k.f50926b);
    }

    public boolean f() {
        c();
        return this.f50926b.isEmpty();
    }

    public boolean g() {
        c();
        return !this.f50926b.contains(null);
    }

    public boolean h(List list) {
        if (list == null) {
            return false;
        }
        c();
        if (this.f50926b.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                Iterator it2 = this.f50926b.iterator();
                while (it2.hasNext()) {
                    if (intentFilter.hasCategory((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        c();
        return this.f50926b.hashCode();
    }

    public String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(e().toArray()) + " }";
    }
}
