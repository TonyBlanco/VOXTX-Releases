package k2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: k2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2137b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43535a;

    public C2137b(Context context) {
        this.f43535a = context;
    }

    public static InterfaceC2136a b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.newInstance());
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, e9);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e11);
        }
    }

    public List a() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f43535a.getPackageManager().getApplicationInfo(this.f43535a.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        b(str);
                        arrayList.add(null);
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e9) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e9);
        }
    }
}
