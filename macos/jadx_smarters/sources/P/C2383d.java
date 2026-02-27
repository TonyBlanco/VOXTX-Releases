package p;

import D.AbstractC0524g;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import p.C2380a;

/* JADX INFO: renamed from: p.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2383d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f46190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f46191b;

    /* JADX INFO: renamed from: p.d$a */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f46194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bundle f46195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList f46196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray f46197f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f46198g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f46192a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2380a.C0407a f46193b = new C2380a.C0407a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f46199h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f46200i = true;

        public a() {
        }

        public a(C2385f c2385f) {
            if (c2385f != null) {
                b(c2385f);
            }
        }

        public C2383d a() {
            if (!this.f46192a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f46194c;
            if (arrayList != null) {
                this.f46192a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f46196e;
            if (arrayList2 != null) {
                this.f46192a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f46192a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f46200i);
            this.f46192a.putExtras(this.f46193b.a().a());
            Bundle bundle = this.f46198g;
            if (bundle != null) {
                this.f46192a.putExtras(bundle);
            }
            if (this.f46197f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f46197f);
                this.f46192a.putExtras(bundle2);
            }
            this.f46192a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f46199h);
            return new C2383d(this.f46192a, this.f46195d);
        }

        public a b(C2385f c2385f) {
            this.f46192a.setPackage(c2385f.d().getPackageName());
            c(c2385f.c(), c2385f.e());
            return this;
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            AbstractC0524g.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f46192a.putExtras(bundle);
        }
    }

    public C2383d(Intent intent, Bundle bundle) {
        this.f46190a = intent;
        this.f46191b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f46190a.setData(uri);
        E.b.startActivity(context, this.f46190a, this.f46191b);
    }
}
