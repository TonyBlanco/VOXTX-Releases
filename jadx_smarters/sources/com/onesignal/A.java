package com.onesignal;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageInfo f38107b;

    public A(boolean z9, PackageInfo packageInfo) {
        this.f38106a = z9;
        this.f38107b = packageInfo;
    }

    public final PackageInfo a() {
        return this.f38107b;
    }

    public final boolean b() {
        return this.f38106a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        return this.f38106a == a9.f38106a && kotlin.jvm.internal.l.a(this.f38107b, a9.f38107b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z9 = this.f38106a;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        int i9 = r02 * 31;
        PackageInfo packageInfo = this.f38107b;
        return i9 + (packageInfo == null ? 0 : packageInfo.hashCode());
    }

    public String toString() {
        return "GetPackageInfoResult(successful=" + this.f38106a + ", packageInfo=" + this.f38107b + ')';
    }
}
