package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
final class bmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f21711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f21712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f21713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f21714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Field f21715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f21716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ bkl f21717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ bjt f21718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ bof f21719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f21720j;

    public bmk(String str, boolean z9, boolean z10) {
        this.f21711a = str;
        this.f21712b = z9;
        this.f21713c = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bmk(String str, boolean z9, boolean z10, boolean z11, Field field, boolean z12, bkl bklVar, bjt bjtVar, bof bofVar, boolean z13) {
        this(str, z9, z10);
        this.f21714d = z11;
        this.f21715e = field;
        this.f21716f = z12;
        this.f21717g = bklVar;
        this.f21718h = bjtVar;
        this.f21719i = bofVar;
        this.f21720j = z13;
    }

    public final void a(boh bohVar, Object obj) throws IllegalAccessException, IOException {
        Object obj2 = this.f21717g.read(bohVar);
        if (obj2 == null && this.f21720j) {
            return;
        }
        if (this.f21714d) {
            bml.b(obj, this.f21715e);
        }
        this.f21715e.set(obj, obj2);
    }

    public final void b(boj bojVar, Object obj) throws IllegalAccessException, IOException {
        if (this.f21712b) {
            if (this.f21714d) {
                bml.b(obj, this.f21715e);
            }
            Object obj2 = this.f21715e.get(obj);
            if (obj2 == obj) {
                return;
            }
            bojVar.f(this.f21711a);
            (this.f21716f ? this.f21717g : new bmp(this.f21718h, this.f21717g, this.f21719i.d())).write(bojVar, obj2);
        }
    }
}
