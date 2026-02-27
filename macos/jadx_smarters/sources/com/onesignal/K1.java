package com.onesignal;

import android.content.ComponentName;
import android.net.Uri;
import p.AbstractC2382c;
import p.AbstractServiceConnectionC2384e;
import p.C2383d;
import p.C2385f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class K1 {

    public static class a extends AbstractServiceConnectionC2384e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38347a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38348c;

        public a(String str, boolean z9) {
            this.f38347a = str;
            this.f38348c = z9;
        }

        @Override // p.AbstractServiceConnectionC2384e
        public void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2382c abstractC2382c) {
            abstractC2382c.g(0L);
            C2385f c2385fE = abstractC2382c.e(null);
            if (c2385fE == null) {
                return;
            }
            Uri uri = Uri.parse(this.f38347a);
            c2385fE.f(uri, null, null);
            if (this.f38348c) {
                C2383d c2383dA = new C2383d.a(c2385fE).a();
                c2383dA.f46190a.setData(uri);
                c2383dA.f46190a.addFlags(268435456);
                F1.f38270b.startActivity(c2383dA.f46190a, c2383dA.f46191b);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static boolean a() {
        return true;
    }

    public static boolean b(String str, boolean z9) {
        if (!a()) {
            return false;
        }
        return AbstractC2382c.a(F1.f38270b, "com.android.chrome", new a(str, z9));
    }
}
