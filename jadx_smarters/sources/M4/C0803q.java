package M4;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: M4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0803q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0820t f5001f;

    public C0803q(C0776l2 c0776l2, String str, String str2, String str3, long j9, long j10, C0820t c0820t) {
        com.google.android.gms.common.internal.r.g(str2);
        com.google.android.gms.common.internal.r.g(str3);
        com.google.android.gms.common.internal.r.m(c0820t);
        this.f4996a = str2;
        this.f4997b = str3;
        this.f4998c = true == TextUtils.isEmpty(str) ? null : str;
        this.f4999d = j9;
        this.f5000e = j10;
        if (j10 != 0 && j10 > j9) {
            c0776l2.d().w().c("Event created with reverse previous/current timestamps. appId, name", C0858z1.z(str2), C0858z1.z(str3));
        }
        this.f5001f = c0820t;
    }

    public C0803q(C0776l2 c0776l2, String str, String str2, String str3, long j9, long j10, Bundle bundle) {
        C0820t c0820t;
        com.google.android.gms.common.internal.r.g(str2);
        com.google.android.gms.common.internal.r.g(str3);
        this.f4996a = str2;
        this.f4997b = str3;
        this.f4998c = true == TextUtils.isEmpty(str) ? null : str;
        this.f4999d = j9;
        this.f5000e = j10;
        if (j10 != 0 && j10 > j9) {
            c0776l2.d().w().b("Event created with reverse previous/current timestamps. appId", C0858z1.z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c0820t = new C0820t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c0776l2.d().r().a("Param name can't be null");
                } else {
                    Object objO = c0776l2.N().o(next, bundle2.get(next));
                    if (objO == null) {
                        c0776l2.d().w().b("Param value can't be null", c0776l2.D().e(next));
                    } else {
                        c0776l2.N().D(bundle2, next, objO);
                    }
                }
                it.remove();
            }
            c0820t = new C0820t(bundle2);
        }
        this.f5001f = c0820t;
    }

    public final C0803q a(C0776l2 c0776l2, long j9) {
        return new C0803q(c0776l2, this.f4998c, this.f4996a, this.f4997b, this.f4999d, j9, this.f5001f);
    }

    public final String toString() {
        return "Event{appId='" + this.f4996a + "', name='" + this.f4997b + "', params=" + this.f5001f.toString() + "}";
    }
}
