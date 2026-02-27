package i;

import android.content.Context;
import android.content.res.Configuration;
import c.AbstractC1239b;

/* JADX INFO: renamed from: i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1871a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41709a;

    public C1871a(Context context) {
        this.f41709a = context;
    }

    public static C1871a b(Context context) {
        return new C1871a(context);
    }

    public boolean a() {
        return this.f41709a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f41709a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f41709a.getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i9 > 600) {
            return 5;
        }
        if (i9 > 960 && i10 > 720) {
            return 5;
        }
        if (i9 > 720 && i10 > 960) {
            return 5;
        }
        if (i9 >= 500) {
            return 4;
        }
        if (i9 > 640 && i10 > 480) {
            return 4;
        }
        if (i9 <= 480 || i10 <= 640) {
            return i9 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f41709a.getResources().getBoolean(AbstractC1239b.f17768a);
    }

    public boolean f() {
        return true;
    }
}
