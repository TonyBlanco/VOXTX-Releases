package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import w0.AbstractC2900a;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f16399j = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16400a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f16401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f16404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f16405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s.j f16406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f16407i;

    public static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f16408a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f16409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f16410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f16411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f16412f;

        public a(k kVar, Bundle bundle, boolean z9, boolean z10, int i9) {
            this.f16408a = kVar;
            this.f16409c = bundle;
            this.f16410d = z9;
            this.f16411e = z10;
            this.f16412f = i9;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            boolean z9 = this.f16410d;
            if (z9 && !aVar.f16410d) {
                return 1;
            }
            if (!z9 && aVar.f16410d) {
                return -1;
            }
            Bundle bundle = this.f16409c;
            if (bundle != null && aVar.f16409c == null) {
                return 1;
            }
            if (bundle == null && aVar.f16409c != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f16409c.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z10 = this.f16411e;
            if (z10 && !aVar.f16411e) {
                return 1;
            }
            if (z10 || !aVar.f16411e) {
                return this.f16412f - aVar.f16412f;
            }
            return -1;
        }

        public k b() {
            return this.f16408a;
        }

        public Bundle h() {
            return this.f16409c;
        }
    }

    public k(s sVar) {
        this(t.c(sVar.getClass()));
    }

    public k(String str) {
        this.f16400a = str;
    }

    public static String h(Context context, int i9) {
        if (i9 <= 16777215) {
            return Integer.toString(i9);
        }
        try {
            return context.getResources().getResourceName(i9);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i9);
        }
    }

    public final void a(String str, d dVar) {
        if (this.f16407i == null) {
            this.f16407i = new HashMap();
        }
        this.f16407i.put(str, dVar);
    }

    public final void b(h hVar) {
        if (this.f16405g == null) {
            this.f16405g = new ArrayList();
        }
        this.f16405g.add(hVar);
    }

    public Bundle c(Bundle bundle) {
        HashMap map;
        if (bundle == null && ((map = this.f16407i) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap map2 = this.f16407i;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                ((d) entry.getValue()).c((String) entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap map3 = this.f16407i;
            if (map3 != null) {
                for (Map.Entry entry2 : map3.entrySet()) {
                    if (!((d) entry2.getValue()).d((String) entry2.getKey(), bundle)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + ((String) entry2.getKey()) + "' in argument bundle. " + ((d) entry2.getValue()).a().c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    public int[] d() {
        ArrayDeque arrayDeque = new ArrayDeque();
        k kVar = this;
        while (true) {
            l lVarN = kVar.n();
            if (lVarN == null || lVarN.E() != kVar.i()) {
                arrayDeque.addFirst(kVar);
            }
            if (lVarN == null) {
                break;
            }
            kVar = lVarN;
        }
        int[] iArr = new int[arrayDeque.size()];
        Iterator it = arrayDeque.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((k) it.next()).i();
            i9++;
        }
        return iArr;
    }

    public final c e(int i9) {
        s.j jVar = this.f16406h;
        c cVar = jVar == null ? null : (c) jVar.g(i9);
        if (cVar != null) {
            return cVar;
        }
        if (n() != null) {
            return n().e(i9);
        }
        return null;
    }

    public final Map f() {
        HashMap map = this.f16407i;
        return map == null ? Collections.emptyMap() : Collections.unmodifiableMap(map);
    }

    public String g() {
        if (this.f16403e == null) {
            this.f16403e = Integer.toString(this.f16402d);
        }
        return this.f16403e;
    }

    public final int i() {
        return this.f16402d;
    }

    public final CharSequence j() {
        return this.f16404f;
    }

    public final String l() {
        return this.f16400a;
    }

    public final l n() {
        return this.f16401c;
    }

    public a o(j jVar) {
        ArrayList<h> arrayList = this.f16405g;
        if (arrayList == null) {
            return null;
        }
        a aVar = null;
        for (h hVar : arrayList) {
            Uri uriC = jVar.c();
            Bundle bundleC = uriC != null ? hVar.c(uriC, f()) : null;
            String strA = jVar.a();
            boolean z9 = strA != null && strA.equals(hVar.b());
            String strB = jVar.b();
            int iD = strB != null ? hVar.d(strB) : -1;
            if (bundleC != null || z9 || iD > -1) {
                a aVar2 = new a(this, bundleC, hVar.e(), z9, iD);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public void p(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2900a.f51557A);
        r(typedArrayObtainAttributes.getResourceId(AbstractC2900a.f51559C, 0));
        this.f16403e = h(context, this.f16402d);
        s(typedArrayObtainAttributes.getText(AbstractC2900a.f51558B));
        typedArrayObtainAttributes.recycle();
    }

    public final void q(int i9, c cVar) {
        if (y()) {
            if (i9 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            if (this.f16406h == null) {
                this.f16406h = new s.j();
            }
            this.f16406h.k(i9, cVar);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i9 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void r(int i9) {
        this.f16402d = i9;
        this.f16403e = null;
    }

    public final void s(CharSequence charSequence) {
        this.f16404f = charSequence;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String hexString = this.f16403e;
        if (hexString == null) {
            sb.append("0x");
            hexString = Integer.toHexString(this.f16402d);
        }
        sb.append(hexString);
        sb.append(")");
        if (this.f16404f != null) {
            sb.append(" label=");
            sb.append(this.f16404f);
        }
        return sb.toString();
    }

    public final void u(l lVar) {
        this.f16401c = lVar;
    }

    public boolean y() {
        return true;
    }
}
