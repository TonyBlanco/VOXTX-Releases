package com.onesignal;

import android.app.Activity;
import com.onesignal.C1542e;
import com.onesignal.F1;
import com.onesignal.PermissionsActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements PermissionsActivity.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f38435a;

    public static final class a implements C1542e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f38436a;

        public a(Activity activity) {
            this.f38436a = activity;
        }

        @Override // com.onesignal.C1542e.a
        public void a() {
            Q.f38450a.a(this.f38436a);
            O.n(true, F1.z.PERMISSION_DENIED);
        }

        @Override // com.onesignal.C1542e.a
        public void b() {
            O.n(true, F1.z.PERMISSION_DENIED);
        }
    }

    static {
        P p9 = new P();
        f38435a = p9;
        PermissionsActivity.e("LOCATION", p9);
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void a() {
        c(F1.z.PERMISSION_GRANTED);
        O.p();
    }

    @Override // com.onesignal.PermissionsActivity.c
    public void b(boolean z9) {
        c(F1.z.PERMISSION_DENIED);
        if (z9) {
            e();
        }
        O.e();
    }

    public final void c(F1.z zVar) {
        O.n(true, zVar);
    }

    public final void d(boolean z9, String androidPermissionString) {
        kotlin.jvm.internal.l.e(androidPermissionString, "androidPermissionString");
        PermissionsActivity.i(z9, "LOCATION", androidPermissionString, P.class);
    }

    public final void e() {
        Activity activityP = F1.P();
        if (activityP == null) {
            return;
        }
        C1542e c1542e = C1542e.f38711a;
        String string = activityP.getString(g2.f38724c);
        kotlin.jvm.internal.l.d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = activityP.getString(g2.f38725d);
        kotlin.jvm.internal.l.d(string2, "activity.getString(R.str…mission_settings_message)");
        c1542e.c(activityP, string, string2, new a(activityP));
    }
}
