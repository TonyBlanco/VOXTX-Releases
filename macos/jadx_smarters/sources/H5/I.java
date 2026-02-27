package H5;

import com.google.android.gms.internal.p001firebaseauthapi.zzafk;
import com.google.android.gms.internal.p001firebaseauthapi.zzag;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f2620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzafk f2621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A5.f f2622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FirebaseAuth f2623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H f2624e;

    public I(A5.f fVar, FirebaseAuth firebaseAuth) {
        this(fVar, firebaseAuth, new G());
    }

    public I(A5.f fVar, FirebaseAuth firebaseAuth, H h9) {
        this.f2620a = new HashMap();
        this.f2622c = fVar;
        this.f2623d = firebaseAuth;
        this.f2624e = h9;
    }

    public static String f(String str) {
        return zzag.zzc(str) ? "*" : str;
    }

    public final Task a(String str, Boolean bool) {
        Task taskE;
        String strF = f(str);
        return (bool.booleanValue() || (taskE = e(strF)) == null) ? this.f2623d.p("RECAPTCHA_ENTERPRISE").continueWithTask(new L(this, strF)) : taskE;
    }

    public final Task b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String strF = f(str);
        Task taskE = e(strF);
        if (bool.booleanValue() || taskE == null) {
            taskE = a(strF, bool);
        }
        return taskE.continueWithTask(new K(this, recaptchaAction));
    }

    public final boolean d(String str) {
        zzafk zzafkVar = this.f2621b;
        return zzafkVar != null && zzafkVar.zzb(str);
    }

    public final Task e(String str) {
        return (Task) this.f2620a.get(str);
    }
}
