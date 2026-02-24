package u0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: u0.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2809I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50921b;

    /* JADX INFO: renamed from: u0.I$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f50922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f50923b = false;

        public a a(C2806F c2806f) {
            if (c2806f == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            List list = this.f50922a;
            if (list == null) {
                this.f50922a = new ArrayList();
            } else if (list.contains(c2806f)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f50922a.add(c2806f);
            return this;
        }

        public a b(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("routes must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    a((C2806F) it.next());
                }
            }
            return this;
        }

        public C2809I c() {
            return new C2809I(this.f50922a, this.f50923b);
        }

        public a d(boolean z9) {
            this.f50923b = z9;
            return this;
        }
    }

    public C2809I(List list, boolean z9) {
        this.f50920a = list == null ? Collections.emptyList() : list;
        this.f50921b = z9;
    }

    public static C2809I a(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                arrayList2.add(C2806F.d((Bundle) parcelableArrayList.get(i9)));
            }
            arrayList = arrayList2;
        }
        return new C2809I(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public List b() {
        return this.f50920a;
    }

    public boolean c() {
        int size = b().size();
        for (int i9 = 0; i9 < size; i9++) {
            C2806F c2806f = (C2806F) this.f50920a.get(i9);
            if (c2806f == null || !c2806f.x()) {
                return false;
            }
        }
        return true;
    }

    public boolean d() {
        return this.f50921b;
    }

    public String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(b().toArray()) + ", isValid=" + c() + " }";
    }
}
