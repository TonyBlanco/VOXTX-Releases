package com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisementListSingleton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AdvertisementListSingleton f28859b = new AdvertisementListSingleton();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f28860a = new ArrayList();

    public static AdvertisementListSingleton b() {
        return f28859b;
    }

    public List a() {
        return this.f28860a;
    }
}
