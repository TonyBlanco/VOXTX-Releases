package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import d.AbstractC1617D;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s.C2696b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1406e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f26793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f26794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f26795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f26796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f26798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final O4.a f26801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f26802j;

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f26803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C2696b f26804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f26805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final O4.a f26807e = O4.a.f6513k;

        public C1406e a() {
            return new C1406e(this.f26803a, this.f26804b, null, 0, null, this.f26805c, this.f26806d, this.f26807e, false);
        }

        public a b(String str) {
            this.f26805c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f26804b == null) {
                this.f26804b = new C2696b();
            }
            this.f26804b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f26803a = account;
            return this;
        }

        public final a e(String str) {
            this.f26806d = str;
            return this;
        }
    }

    public C1406e(Account account, Set set, Map map, int i9, View view, String str, String str2, O4.a aVar, boolean z9) {
        this.f26793a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f26794b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f26796d = map;
        this.f26798f = view;
        this.f26797e = i9;
        this.f26799g = str;
        this.f26800h = str2;
        this.f26801i = aVar == null ? O4.a.f6513k : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            throw null;
        }
        this.f26795c = Collections.unmodifiableSet(hashSet);
    }

    public static C1406e a(Context context) {
        return new GoogleApiClient.a(context).f();
    }

    public Account b() {
        return this.f26793a;
    }

    public Account c() {
        Account account = this.f26793a;
        return account != null ? account : new Account(AbstractC1404c.DEFAULT_ACCOUNT, "com.google");
    }

    public Set d() {
        return this.f26795c;
    }

    public String e() {
        return this.f26799g;
    }

    public Set f() {
        return this.f26794b;
    }

    public final O4.a g() {
        return this.f26801i;
    }

    public final Integer h() {
        return this.f26802j;
    }

    public final String i() {
        return this.f26800h;
    }

    public final Map j() {
        return this.f26796d;
    }

    public final void k(Integer num) {
        this.f26802j = num;
    }
}
