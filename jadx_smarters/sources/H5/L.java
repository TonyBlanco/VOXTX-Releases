package H5;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzab;
import com.google.android.gms.internal.p001firebaseauthapi.zzafk;
import com.google.android.gms.internal.p001firebaseauthapi.zzag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2627b;

    public L(I i9, String str) {
        this.f2627b = i9;
        this.f2626a = str;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new J((String) com.google.android.gms.common.internal.r.m(((Exception) com.google.android.gms.common.internal.r.m(task.getException())).getMessage())));
        }
        zzafk zzafkVar = (zzafk) task.getResult();
        String strZza = zzafkVar.zza();
        if (zzag.zzc(strZza)) {
            return Tasks.forException(new J("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f2626a));
        }
        List<String> listZza = zzab.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + strZza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f2626a);
        }
        this.f2627b.f2621b = zzafkVar;
        I i9 = this.f2627b;
        Task taskA = i9.f2624e.a((Application) i9.f2622c.l(), str);
        this.f2627b.f2620a.put(this.f2626a, taskA);
        return taskA;
    }
}
