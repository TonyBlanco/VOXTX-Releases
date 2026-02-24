package com.onesignal;

import A5.o;
import android.content.Context;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.F1;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public class b2 extends a2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A5.f f38675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f38676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f38677h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f38679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f38680c;

        public a() {
            this(null, null, null);
        }

        public a(String str, String str2, String str3) {
            this.f38678a = str == null ? "onesignal-shared-public" : str;
            this.f38679b = str2 == null ? "1:754795614042:android:c682b8144a8dd52bc1ad63" : str2;
            this.f38680c = str3 == null ? new String(Base64.decode("QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV", 0)) : str3;
        }
    }

    public b2(Context context, a aVar) {
        this.f38676g = context;
        if (aVar == null) {
            this.f38677h = new a();
        } else {
            this.f38677h = aVar;
        }
    }

    @Override // com.onesignal.a2
    public String f() {
        return "FCM";
    }

    @Override // com.onesignal.a2
    public String g(String str) {
        n(str);
        try {
            return m();
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            F1.a(F1.v.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return l(str);
        }
    }

    public final String l(String str) {
        try {
            Object objInvoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", A5.f.class).invoke(null, this.f38675f);
            return (String) objInvoke.getClass().getMethod("getToken", String.class, String.class).invoke(objInvoke, str, "FCM");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
            throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", e9);
        }
    }

    public final String m() throws Exception {
        Task taskI = ((FirebaseMessaging) this.f38675f.j(FirebaseMessaging.class)).i();
        try {
            return (String) Tasks.await(taskI);
        } catch (ExecutionException unused) {
            throw taskI.getException();
        }
    }

    public final void n(String str) {
        if (this.f38675f != null) {
            return;
        }
        this.f38675f = A5.f.u(this.f38676g, new o.b().d(str).c(this.f38677h.f38679b).b(this.f38677h.f38680c).e(this.f38677h.f38678a).a(), "ONESIGNAL_SDK_FCM_APP_NAME");
    }
}
