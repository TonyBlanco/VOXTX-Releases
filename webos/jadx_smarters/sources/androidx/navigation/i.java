package androidx.navigation;

import D.P;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f16392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f16393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f16395e;

    public i(Context context) {
        this.f16391a = context;
        if (context instanceof Activity) {
            this.f16392b = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            this.f16392b = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.f16392b.addFlags(268468224);
    }

    public i(NavController navController) {
        this(navController.f());
        this.f16393c = navController.j();
    }

    public P a() {
        if (this.f16392b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") == null) {
            if (this.f16393c == null) {
                throw new IllegalStateException("You must call setGraph() before constructing the deep link");
            }
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
        P pB = P.e(this.f16391a).b(new Intent(this.f16392b));
        for (int i9 = 0; i9 < pB.i(); i9++) {
            pB.g(i9).putExtra("android-support-nav:controller:deepLinkIntent", this.f16392b);
        }
        return pB;
    }

    public final void b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.f16393c);
        k kVar = null;
        while (!arrayDeque.isEmpty() && kVar == null) {
            k kVar2 = (k) arrayDeque.poll();
            if (kVar2.i() == this.f16394d) {
                kVar = kVar2;
            } else if (kVar2 instanceof l) {
                Iterator it = ((l) kVar2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add((k) it.next());
                }
            }
        }
        if (kVar != null) {
            this.f16392b.putExtra("android-support-nav:controller:deepLinkIds", kVar.d());
            return;
        }
        throw new IllegalArgumentException("Navigation destination " + k.h(this.f16391a, this.f16394d) + " cannot be found in the navigation graph " + this.f16393c);
    }

    public i c(Bundle bundle) {
        this.f16395e = bundle;
        this.f16392b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public i d(int i9) {
        this.f16394d = i9;
        if (this.f16393c != null) {
            b();
        }
        return this;
    }
}
