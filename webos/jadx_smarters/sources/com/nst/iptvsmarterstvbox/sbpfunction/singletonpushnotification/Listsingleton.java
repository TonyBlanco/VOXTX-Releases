package com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Listsingleton {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Listsingleton f28868e = new Listsingleton();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f28869a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f28870b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f28871c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f28872d = new ArrayList();

    public static Listsingleton b() {
        return f28868e;
    }

    public List a() {
        return this.f28869a;
    }

    public List c() {
        return this.f28870b;
    }

    public void d(List list) {
        this.f28869a = list;
    }

    public void e(List list) {
        this.f28872d = list;
    }

    public void f(List list) {
        this.f28870b = list;
    }
}
