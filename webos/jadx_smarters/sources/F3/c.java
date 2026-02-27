package F3;

import android.net.Uri;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import z3.C3028H;
import z3.InterfaceC3023C;

/* JADX INFO: loaded from: classes3.dex */
public class c implements InterfaceC3023C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f1941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f1942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f1943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f1944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f1945m;

    public c(long j9, long j10, long j11, boolean z9, long j12, long j13, long j14, long j15, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f1933a = j9;
        this.f1934b = j10;
        this.f1935c = j11;
        this.f1936d = z9;
        this.f1937e = j12;
        this.f1938f = j13;
        this.f1939g = j14;
        this.f1940h = j15;
        this.f1944l = hVar;
        this.f1941i = oVar;
        this.f1943k = uri;
        this.f1942j = lVar;
        this.f1945m = list == null ? Collections.emptyList() : list;
    }

    public static ArrayList c(List list, LinkedList linkedList) {
        C3028H c3028h = (C3028H) linkedList.poll();
        int i9 = c3028h.f52700a;
        ArrayList arrayList = new ArrayList();
        do {
            int i10 = c3028h.f52701c;
            a aVar = (a) list.get(i10);
            List list2 = aVar.f1925c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(c3028h.f52702d));
                c3028h = (C3028H) linkedList.poll();
                if (c3028h.f52700a != i9) {
                    break;
                }
            } while (c3028h.f52701c == i10);
            arrayList.add(new a(aVar.f1923a, aVar.f1924b, arrayList2, aVar.f1926d, aVar.f1927e, aVar.f1928f));
        } while (c3028h.f52700a == i9);
        linkedList.addFirst(c3028h);
        return arrayList;
    }

    @Override // z3.InterfaceC3023C
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C3028H(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= e()) {
                break;
            }
            if (((C3028H) linkedList.peek()).f52700a != i9) {
                long jF = f(i9);
                if (jF != -9223372036854775807L) {
                    j9 += jF;
                }
            } else {
                g gVarD = d(i9);
                arrayList.add(new g(gVarD.f1968a, gVarD.f1969b - j9, c(gVarD.f1970c, linkedList), gVarD.f1971d));
            }
            i9++;
        }
        long j10 = this.f1934b;
        return new c(this.f1933a, j10 != -9223372036854775807L ? j10 - j9 : -9223372036854775807L, this.f1935c, this.f1936d, this.f1937e, this.f1938f, this.f1939g, this.f1940h, this.f1944l, this.f1941i, this.f1942j, this.f1943k, arrayList);
    }

    public final g d(int i9) {
        return (g) this.f1945m.get(i9);
    }

    public final int e() {
        return this.f1945m.size();
    }

    public final long f(int i9) {
        long j9;
        if (i9 == this.f1945m.size() - 1) {
            j9 = this.f1934b;
            if (j9 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
        } else {
            j9 = ((g) this.f1945m.get(i9 + 1)).f1969b;
        }
        return j9 - ((g) this.f1945m.get(i9)).f1969b;
    }

    public final long g(int i9) {
        return k0.P0(f(i9));
    }
}
