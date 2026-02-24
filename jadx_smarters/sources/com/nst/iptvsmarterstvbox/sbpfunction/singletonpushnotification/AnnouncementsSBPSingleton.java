package com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AnnouncementsSBPSingleton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AnnouncementsSBPSingleton f28861b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f28862a;

    private AnnouncementsSBPSingleton() {
    }

    public static AnnouncementsSBPSingleton b() {
        if (f28861b == null) {
            f28861b = new AnnouncementsSBPSingleton();
        }
        return f28861b;
    }

    public List a() {
        return this.f28862a;
    }

    public void c(List list) {
        this.f28862a = list;
    }
}
