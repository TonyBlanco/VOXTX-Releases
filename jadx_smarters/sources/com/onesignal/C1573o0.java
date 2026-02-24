package com.onesignal;

import android.app.Activity;
import android.os.Build;
import com.onesignal.C1542e;
import com.onesignal.F1;
import com.onesignal.PermissionsActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.onesignal.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1573o0 implements PermissionsActivity.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1573o0 f38786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f38787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f38788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k8.f f38789d;

    /* JADX INFO: renamed from: com.onesignal.o0$a */
    public static final class a implements C1542e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f38790a;

        public a(Activity activity) {
            this.f38790a = activity;
        }

        @Override // com.onesignal.C1542e.a
        public void a() {
            S.f38518a.a(this.f38790a);
            C1573o0.f38788c = true;
        }

        @Override // com.onesignal.C1542e.a
        public void b() {
            C1573o0.f38786a.e(false);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.o0$b */
    public static final class b extends kotlin.jvm.internal.m implements w8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f38791a = new b();

        public b() {
            super(0);
        }

        @Override // w8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Build.VERSION.SDK_INT > 32 && OSUtils.o(F1.f38270b) > 32);
        }
    }

    static {
        C1573o0 c1573o0 = new C1573o0();
        f38786a = c1573o0;
        f38787b = new HashSet();
        PermissionsActivity.e("NOTIFICATION", c1573o0);
        f38789d = k8.g.a(b.f38791a);
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void a() {
        F1.i1();
        e(true);
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void b(boolean z9) {
        if (z9 ? j() : false) {
            return;
        }
        e(false);
    }

    public final void e(boolean z9) {
        Iterator it = f38787b.iterator();
        while (it.hasNext()) {
            ((F1.A) it.next()).a(z9);
        }
        f38787b.clear();
    }

    public final boolean f() {
        return ((Boolean) f38789d.getValue()).booleanValue();
    }

    public final boolean g() {
        return OSUtils.a(F1.f38270b);
    }

    public final void h() {
        if (f38788c) {
            f38788c = false;
            e(g());
        }
    }

    public final void i(boolean z9, F1.A a9) {
        if (a9 != null) {
            f38787b.add(a9);
        }
        if (g()) {
            e(true);
            return;
        }
        if (f()) {
            PermissionsActivity.i(z9, "NOTIFICATION", "android.permission.POST_NOTIFICATIONS", C1573o0.class);
        } else if (z9) {
            j();
        } else {
            e(false);
        }
    }

    public final boolean j() {
        Activity activityP = F1.P();
        if (activityP == null) {
            return false;
        }
        C1542e c1542e = C1542e.f38711a;
        String string = activityP.getString(g2.f38726e);
        kotlin.jvm.internal.l.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = activityP.getString(g2.f38727f);
        kotlin.jvm.internal.l.d(string2, "activity.getString(R.str…mission_settings_message)");
        c1542e.c(activityP, string, string2, new a(activityP));
        return true;
    }
}
