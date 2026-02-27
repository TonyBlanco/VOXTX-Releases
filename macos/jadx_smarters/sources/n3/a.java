package N3;

import O2.C0936z0;
import android.net.Uri;
import d4.AbstractC1684a;
import d4.b0;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import l3.p;
import z3.C3028H;
import z3.InterfaceC3023C;

/* JADX INFO: loaded from: classes3.dex */
public class a implements InterfaceC3023C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0071a f5295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f5296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5298h;

    /* JADX INFO: renamed from: N3.a$a, reason: collision with other inner class name */
    public static class C0071a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f5299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f5300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p[] f5301c;

        public C0071a(UUID uuid, byte[] bArr, p[] pVarArr) {
            this.f5299a = uuid;
            this.f5300b = bArr;
            this.f5301c = pVarArr;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f5308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f5309h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f5310i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final C0936z0[] f5311j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f5312k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f5313l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f5314m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List f5315n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final long[] f5316o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f5317p;

        public b(String str, String str2, int i9, String str3, long j9, String str4, int i10, int i11, int i12, int i13, String str5, C0936z0[] c0936z0Arr, List list, long j10) {
            this(str, str2, i9, str3, j9, str4, i10, i11, i12, i13, str5, c0936z0Arr, list, k0.d1(list, 1000000L, j9), k0.c1(j10, 1000000L, j9));
        }

        public b(String str, String str2, int i9, String str3, long j9, String str4, int i10, int i11, int i12, int i13, String str5, C0936z0[] c0936z0Arr, List list, long[] jArr, long j10) {
            this.f5313l = str;
            this.f5314m = str2;
            this.f5302a = i9;
            this.f5303b = str3;
            this.f5304c = j9;
            this.f5305d = str4;
            this.f5306e = i10;
            this.f5307f = i11;
            this.f5308g = i12;
            this.f5309h = i13;
            this.f5310i = str5;
            this.f5311j = c0936z0Arr;
            this.f5315n = list;
            this.f5316o = jArr;
            this.f5317p = j10;
            this.f5312k = list.size();
        }

        public Uri a(int i9, int i10) {
            AbstractC1684a.g(this.f5311j != null);
            AbstractC1684a.g(this.f5315n != null);
            AbstractC1684a.g(i10 < this.f5315n.size());
            String string = Integer.toString(this.f5311j[i9].f6463i);
            String string2 = ((Long) this.f5315n.get(i10)).toString();
            return b0.e(this.f5313l, this.f5314m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(C0936z0[] c0936z0Arr) {
            return new b(this.f5313l, this.f5314m, this.f5302a, this.f5303b, this.f5304c, this.f5305d, this.f5306e, this.f5307f, this.f5308g, this.f5309h, this.f5310i, c0936z0Arr, this.f5315n, this.f5316o, this.f5317p);
        }

        public long c(int i9) {
            if (i9 == this.f5312k - 1) {
                return this.f5317p;
            }
            long[] jArr = this.f5316o;
            return jArr[i9 + 1] - jArr[i9];
        }

        public int d(long j9) {
            return k0.i(this.f5316o, j9, true, true);
        }

        public long e(int i9) {
            return this.f5316o[i9];
        }
    }

    public a(int i9, int i10, long j9, long j10, int i11, boolean z9, C0071a c0071a, b[] bVarArr) {
        this.f5291a = i9;
        this.f5292b = i10;
        this.f5297g = j9;
        this.f5298h = j10;
        this.f5293c = i11;
        this.f5294d = z9;
        this.f5295e = c0071a;
        this.f5296f = bVarArr;
    }

    public a(int i9, int i10, long j9, long j10, long j11, int i11, boolean z9, C0071a c0071a, b[] bVarArr) {
        this(i9, i10, j10 == 0 ? -9223372036854775807L : k0.c1(j10, 1000000L, j9), j11 != 0 ? k0.c1(j11, 1000000L, j9) : -9223372036854775807L, i11, z9, c0071a, bVarArr);
    }

    @Override // z3.InterfaceC3023C
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            C3028H c3028h = (C3028H) arrayList.get(i9);
            b bVar2 = this.f5296f[c3028h.f52701c];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((C0936z0[]) arrayList3.toArray(new C0936z0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f5311j[c3028h.f52702d]);
            i9++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((C0936z0[]) arrayList3.toArray(new C0936z0[0])));
        }
        return new a(this.f5291a, this.f5292b, this.f5297g, this.f5298h, this.f5293c, this.f5294d, this.f5295e, (b[]) arrayList2.toArray(new b[0]));
    }
}
