package g7;

import android.app.Activity;
import android.os.Handler;
import mbanje.kurt.fabbutton.FabButton;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FabButton f41492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f41493d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41490a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f41491b = new Handler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41494e = false;

    public l(FabButton fabButton, Activity activity) {
        this.f41492c = fabButton;
        this.f41493d = activity;
    }

    public boolean a() {
        return this.f41494e;
    }

    public void b() {
        this.f41492c.d(true);
        this.f41494e = true;
    }

    public void c() {
        this.f41492c.d(false);
        this.f41494e = false;
    }
}
