package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1425y implements a.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1425y f26899c = a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26900b;

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.y$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26901a;

        public /* synthetic */ a(B b9) {
        }

        public C1425y a() {
            return new C1425y(this.f26901a, null);
        }
    }

    public /* synthetic */ C1425y(String str, C c9) {
        this.f26900b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f26900b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1425y) {
            return AbstractC1418q.b(this.f26900b, ((C1425y) obj).f26900b);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1418q.c(this.f26900b);
    }
}
