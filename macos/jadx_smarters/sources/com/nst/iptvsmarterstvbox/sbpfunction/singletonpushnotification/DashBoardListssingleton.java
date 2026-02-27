package com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DashBoardListssingleton {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DashBoardListssingleton f28863e = new DashBoardListssingleton();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f28864a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f28865b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f28866c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f28867d = new ArrayList();

    public static DashBoardListssingleton b() {
        return f28863e;
    }

    public List a() {
        return this.f28864a;
    }

    public List c() {
        return this.f28865b;
    }

    public void d(List list) {
        this.f28864a = list;
    }

    public void e(ArrayList arrayList) {
        this.f28866c = arrayList;
    }

    public void f(List list) {
        this.f28867d = list;
    }

    public void g(List list) {
        this.f28865b = list;
    }
}
