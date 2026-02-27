package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lu implements ry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f23731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mo f23733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ml f23734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f23735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ma f23736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f23737m;

    public lu(long j9, long j10, long j11, boolean z9, long j12, long j13, long j14, long j15, ma maVar, mo moVar, ml mlVar, Uri uri, List list) {
        this.f23725a = j9;
        this.f23726b = j10;
        this.f23727c = j11;
        this.f23728d = z9;
        this.f23729e = j12;
        this.f23730f = j13;
        this.f23731g = j14;
        this.f23732h = j15;
        this.f23736l = maVar;
        this.f23733i = moVar;
        this.f23735k = uri;
        this.f23734j = mlVar;
        this.f23737m = list;
    }

    public final int a() {
        return this.f23737m.size();
    }

    public final long b(int i9) {
        if (i9 != this.f23737m.size() - 1) {
            return ((lz) this.f23737m.get(i9 + 1)).f23760b - ((lz) this.f23737m.get(i9)).f23760b;
        }
        long j9 = this.f23726b;
        if (j9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j9 - ((lz) this.f23737m.get(i9)).f23760b;
    }

    public final long c(int i9) {
        return cq.t(b(i9));
    }

    public final lz d(int i9) {
        return (lz) this.f23737m.get(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ry
    public final /* bridge */ /* synthetic */ Object e(List list) {
        lu luVar = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new ba());
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        int i9 = 0;
        while (i9 < a()) {
            if (((ba) linkedList.peek()).f20979a != i9) {
                long jB = luVar.b(i9);
                if (jB != -9223372036854775807L) {
                    j9 += jB;
                }
            } else {
                lz lzVarD = luVar.d(i9);
                List list2 = lzVarD.f23761c;
                ba baVar = (ba) linkedList.poll();
                int i10 = baVar.f20979a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = baVar.f20980b;
                    ls lsVar = (ls) list2.get(i11);
                    List list3 = lsVar.f23717c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((me) list3.get(baVar.f20981c));
                        baVar = (ba) linkedList.poll();
                        if (baVar.f20979a != i10) {
                            break;
                        }
                    } while (baVar.f20980b == i11);
                    List list4 = list2;
                    arrayList2.add(new ls(lsVar.f23715a, lsVar.f23716b, arrayList3, lsVar.f23718d, lsVar.f23719e, lsVar.f23720f));
                    if (baVar.f20979a != i10) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(baVar);
                arrayList.add(new lz(lzVarD.f23759a, lzVarD.f23760b - j9, arrayList2, lzVarD.f23762d));
            }
            i9++;
            luVar = this;
        }
        long j10 = luVar.f23726b;
        return new lu(luVar.f23725a, j10 != -9223372036854775807L ? j10 - j9 : -9223372036854775807L, luVar.f23727c, luVar.f23728d, luVar.f23729e, luVar.f23730f, luVar.f23731g, luVar.f23732h, luVar.f23736l, luVar.f23733i, luVar.f23734j, luVar.f23735k, arrayList);
    }
}
