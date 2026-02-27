package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C1406e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import w4.C2914b;
import w4.C2921i;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1356c0 implements InterfaceC1393v0, f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f26595a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Condition f26596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f26597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2921i f26598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerC1354b0 f26599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f26600g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1406e f26602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f26603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a.AbstractC0252a f26604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile Z f26605l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y f26608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC1389t0 f26609p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f26601h = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2914b f26606m = null;

    public C1356c0(Context context, Y y9, Lock lock, Looper looper, C2921i c2921i, Map map, C1406e c1406e, Map map2, a.AbstractC0252a abstractC0252a, ArrayList arrayList, InterfaceC1389t0 interfaceC1389t0) {
        this.f26597d = context;
        this.f26595a = lock;
        this.f26598e = c2921i;
        this.f26600g = map;
        this.f26602i = c1406e;
        this.f26603j = map2;
        this.f26604k = abstractC0252a;
        this.f26608o = y9;
        this.f26609p = interfaceC1389t0;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((e1) arrayList.get(i9)).a(this);
        }
        this.f26599f = new HandlerC1354b0(this, looper);
        this.f26596c = lock.newCondition();
        this.f26605l = new U(this);
    }

    @Override // com.google.android.gms.common.api.internal.f1
    public final void A(C2914b c2914b, com.google.android.gms.common.api.a aVar, boolean z9) {
        this.f26595a.lock();
        try {
            this.f26605l.d(c2914b, aVar, z9);
        } finally {
            this.f26595a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final void a() {
        this.f26605l.c();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final void b() {
        if (this.f26605l.g()) {
            this.f26601h.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.f26605l);
        for (com.google.android.gms.common.api.a aVar : this.f26603j.keySet()) {
            String strValueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) aVar.d()).println(":");
            ((a.f) com.google.android.gms.common.internal.r.m((a.f) this.f26600g.get(aVar.b()))).dump(strValueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final AbstractC1357d d(AbstractC1357d abstractC1357d) {
        abstractC1357d.zak();
        this.f26605l.f(abstractC1357d);
        return abstractC1357d;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final boolean e() {
        return this.f26605l instanceof F;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1393v0
    public final AbstractC1357d f(AbstractC1357d abstractC1357d) {
        abstractC1357d.zak();
        return this.f26605l.h(abstractC1357d);
    }

    public final void i() {
        this.f26595a.lock();
        try {
            this.f26608o.s();
            this.f26605l = new F(this);
            this.f26605l.b();
            this.f26596c.signalAll();
        } finally {
            this.f26595a.unlock();
        }
    }

    public final void j() {
        this.f26595a.lock();
        try {
            this.f26605l = new T(this, this.f26602i, this.f26603j, this.f26598e, this.f26604k, this.f26595a, this.f26597d);
            this.f26605l.b();
            this.f26596c.signalAll();
        } finally {
            this.f26595a.unlock();
        }
    }

    public final void k(C2914b c2914b) {
        this.f26595a.lock();
        try {
            this.f26606m = c2914b;
            this.f26605l = new U(this);
            this.f26605l.b();
            this.f26596c.signalAll();
        } finally {
            this.f26595a.unlock();
        }
    }

    public final void l(AbstractC1352a0 abstractC1352a0) {
        HandlerC1354b0 handlerC1354b0 = this.f26599f;
        handlerC1354b0.sendMessage(handlerC1354b0.obtainMessage(1, abstractC1352a0));
    }

    public final void m(RuntimeException runtimeException) {
        HandlerC1354b0 handlerC1354b0 = this.f26599f;
        handlerC1354b0.sendMessage(handlerC1354b0.obtainMessage(2, runtimeException));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnected(Bundle bundle) {
        this.f26595a.lock();
        try {
            this.f26605l.a(bundle);
        } finally {
            this.f26595a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1361f
    public final void onConnectionSuspended(int i9) {
        this.f26595a.lock();
        try {
            this.f26605l.e(i9);
        } finally {
            this.f26595a.unlock();
        }
    }
}
