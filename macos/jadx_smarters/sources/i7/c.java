package i7;

import android.content.Context;
import android.content.Intent;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.castserver.CastServerService;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41918a;

    public c(Context context) {
        this.f41918a = context;
    }

    public void a(String str, String str2) {
        Intent intent = new Intent(this.f41918a, (Class<?>) CastServerService.class);
        intent.putExtra("127.0.0.1", str);
        intent.putExtra(InstructionFileId.DOT, str2);
        this.f41918a.startService(intent);
    }

    public void b() {
        this.f41918a.stopService(new Intent(this.f41918a, (Class<?>) CastServerService.class));
    }
}
