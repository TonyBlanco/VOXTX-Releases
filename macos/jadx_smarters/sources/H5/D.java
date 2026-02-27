package H5;

import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {
    public static Task a(I i9, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task taskB = i9.b(str, Boolean.FALSE, recaptchaAction);
        return taskB.continueWithTask(continuation).continueWithTask(new E(str, i9, recaptchaAction, continuation));
    }

    public static /* synthetic */ Task b(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) com.google.android.gms.common.internal.r.m(task.getException());
        if (zzacf.zzc(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + String.valueOf(recaptchaAction));
            }
            if (firebaseAuth.w() == null) {
                firebaseAuth.t(new I(firebaseAuth.b(), firebaseAuth));
            }
            return a(firebaseAuth.w(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
        return Tasks.forException(exc);
    }

    public final Task c(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: H5.F
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                String str3;
                D d9 = this.f2619a;
                if (task.isSuccessful()) {
                    str3 = (String) task.getResult();
                } else {
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) com.google.android.gms.common.internal.r.m(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
                    str3 = "NO_RECAPTCHA";
                }
                return d9.d(str3);
            }
        };
        I iW = firebaseAuth.w();
        return (iW == null || !iW.d(str2)) ? d(null).continueWithTask(new Continuation() { // from class: H5.C
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return D.b(recaptchaAction, firebaseAuth, str, continuation, task);
            }
        }) : a(iW, recaptchaAction, str, continuation);
    }

    public abstract Task d(String str);
}
