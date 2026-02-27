package H5;

import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f2617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Continuation f2618d;

    public E(String str, I i9, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f2615a = str;
        this.f2616b = i9;
        this.f2617c = recaptchaAction;
        this.f2618d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzacf.zzb((Exception) com.google.android.gms.common.internal.r.m(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f2615a);
        }
        return this.f2616b.b(this.f2615a, Boolean.TRUE, this.f2617c).continueWithTask(this.f2618d);
    }
}
