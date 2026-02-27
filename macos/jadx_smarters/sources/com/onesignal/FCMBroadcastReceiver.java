package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.onesignal.F1;
import com.onesignal.T;
import k0.AbstractC2131a;

/* JADX INFO: loaded from: classes4.dex */
public class FCMBroadcastReceiver extends AbstractC2131a {

    public class a implements T.e {
        public a() {
        }

        @Override // com.onesignal.T.e
        public void a(T.f fVar) {
            if (fVar == null) {
                FCMBroadcastReceiver.this.j();
            } else if (fVar.a() || fVar.b()) {
                FCMBroadcastReceiver.this.h();
            } else {
                FCMBroadcastReceiver.this.j();
            }
        }
    }

    public class b implements T.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T.e f38321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f38322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f38323c;

        public b(T.e eVar, Context context, Bundle bundle) {
            this.f38321a = eVar;
            this.f38322b = context;
            this.f38323c = bundle;
        }

        @Override // com.onesignal.T.e
        public void a(T.f fVar) {
            if (fVar == null || !fVar.c()) {
                FCMBroadcastReceiver.k(this.f38322b, this.f38323c);
            }
            this.f38321a.a(fVar);
        }
    }

    public static boolean f(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null || "gcm".equals(stringExtra);
    }

    public static void g(Context context, Intent intent, Bundle bundle, T.e eVar) {
        if (!f(intent)) {
            eVar.a(null);
        }
        T.h(context, bundle, new b(eVar, context, bundle));
    }

    public static InterfaceC1566m i(Bundle bundle, InterfaceC1566m interfaceC1566m) {
        interfaceC1566m.a("json_payload", T.a(bundle).toString());
        interfaceC1566m.e("timestamp", Long.valueOf(F1.v0().a() / 1000));
        return interfaceC1566m;
    }

    public static void k(Context context, Bundle bundle) {
        F1.v vVar = F1.v.DEBUG;
        F1.a(vVar, "startFCMService from: " + context + " and bundle: " + bundle);
        if (!T.c(bundle)) {
            F1.a(vVar, "startFCMService with no remote resources, no need for services");
            T.j(context, i(bundle, AbstractC1572o.a()));
            return;
        }
        if (Integer.parseInt(bundle.getString("pri", "0")) > 9 || Build.VERSION.SDK_INT < 26) {
            try {
                m(context, bundle);
                return;
            } catch (IllegalStateException unused) {
            }
        }
        l(context, bundle);
    }

    public static void l(Context context, Bundle bundle) {
        InterfaceC1566m interfaceC1566mI = i(bundle, AbstractC1572o.a());
        Intent intent = new Intent(context, (Class<?>) FCMIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", (Parcelable) interfaceC1566mI.f());
        FCMIntentJobService.j(context, intent);
    }

    public static void m(Context context, Bundle bundle) {
        AbstractC2131a.c(context, new Intent().replaceExtras((Bundle) i(bundle, new C1569n()).f()).setComponent(new ComponentName(context.getPackageName(), FCMIntentService.class.getName())));
    }

    public final void h() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    public final void j() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        F1.K0(context);
        g(context, intent, extras, new a());
    }
}
