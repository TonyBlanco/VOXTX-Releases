package com.google.ads.interactivemedia.v3.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes3.dex */
final class bkt implements blk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21614a;

    public bkt(int i9) {
        this.f21614a = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final Object a() {
        switch (this.f21614a) {
            case 0:
                return new LinkedHashSet();
            case 1:
                return new TreeSet();
            case 2:
                return new ArrayDeque();
            case 3:
                return new ArrayList();
            case 4:
                return new ConcurrentSkipListMap();
            case 5:
                return new ConcurrentHashMap();
            case 6:
                return new TreeMap();
            case 7:
                return new LinkedHashMap();
            default:
                return new blj();
        }
    }
}
