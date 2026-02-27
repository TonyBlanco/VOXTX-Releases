package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qg extends qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qg f24210a = new qg("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f24213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f24214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f24215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f24216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1333s f24217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f24218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f24219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f24220k;

    public qg(String str, List list, List list2, List list3, List list4, List list5, List list6, C1333s c1333s, List list7, boolean z9, Map map, List list8) {
        super(str, list, z9);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list2.size(); i9++) {
            Uri uri = ((qf) list2.get(i9)).f24204a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        c(list3, arrayList);
        c(list4, arrayList);
        c(list5, arrayList);
        c(list6, arrayList);
        this.f24211b = Collections.unmodifiableList(arrayList);
        this.f24212c = Collections.unmodifiableList(list2);
        this.f24213d = Collections.unmodifiableList(list3);
        this.f24214e = Collections.unmodifiableList(list4);
        this.f24215f = Collections.unmodifiableList(list5);
        this.f24216g = Collections.unmodifiableList(list6);
        this.f24217h = c1333s;
        this.f24218i = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f24219j = Collections.unmodifiableMap(map);
        this.f24220k = Collections.unmodifiableList(list8);
    }

    public static qg a(String str) {
        Uri uri = Uri.parse(str);
        r rVar = new r();
        rVar.S("0");
        rVar.K("application/x-mpegURL");
        return new qg("", Collections.emptyList(), Collections.singletonList(new qf(uri, rVar.v(), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List b(List list, int i9, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    ba baVar = (ba) list2.get(i11);
                    if (baVar.f20980b == i9 && baVar.f20981c == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    private static void c(List list, List list2) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            Uri uri = ((qe) list.get(i9)).f24201a;
            if (!list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ry
    public final /* bridge */ /* synthetic */ Object e(List list) {
        return new qg(this.f24221t, this.f24222u, b(this.f24212c, 0, list), Collections.emptyList(), b(this.f24214e, 1, list), b(this.f24215f, 2, list), Collections.emptyList(), this.f24217h, this.f24218i, this.f24223v, this.f24219j, this.f24220k);
    }
}
