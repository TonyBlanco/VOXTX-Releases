package H5;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements H {
    @Override // H5.H
    public final Task a(Application application, String str) {
        return Recaptcha.getTasksClient(application, str);
    }
}
