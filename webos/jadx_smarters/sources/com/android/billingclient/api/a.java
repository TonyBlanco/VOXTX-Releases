package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;
import g1.G;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18443b;

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static class C0235a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18445b = "";

        public /* synthetic */ C0235a(G g9) {
        }

        public a a() {
            a aVar = new a();
            aVar.f18442a = this.f18444a;
            aVar.f18443b = this.f18445b;
            return aVar;
        }

        public C0235a b(String str) {
            this.f18445b = str;
            return this;
        }

        public C0235a c(int i9) {
            this.f18444a = i9;
            return this;
        }
    }

    public static C0235a c() {
        return new C0235a(null);
    }

    public String a() {
        return this.f18443b;
    }

    public int b() {
        return this.f18442a;
    }

    public String toString() {
        return "Response Code: " + zzb.zzh(this.f18442a) + ", Debug Message: " + this.f18443b;
    }
}
