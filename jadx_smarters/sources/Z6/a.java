package Z6;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f11349i = "a";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Collection f11350j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Camera f11354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f11355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11356f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler.Callback f11357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Camera.AutoFocusCallback f11358h;

    /* JADX INFO: renamed from: Z6.a$a, reason: collision with other inner class name */
    public class C0152a implements Handler.Callback {
        public C0152a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != a.this.f11356f) {
                return false;
            }
            a.this.h();
            return true;
        }
    }

    public class b implements Camera.AutoFocusCallback {
        public b() {
        }

        public final /* synthetic */ void b() {
            a.this.f11352b = false;
            a.this.f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z9, Camera camera) {
            a.this.f11355e.post(new Runnable() { // from class: Z6.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11361a.b();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f11350j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera, i iVar) {
        C0152a c0152a = new C0152a();
        this.f11357g = c0152a;
        this.f11358h = new b();
        this.f11355e = new Handler(c0152a);
        this.f11354d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z9 = iVar.c() && f11350j.contains(focusMode);
        this.f11353c = z9;
        Log.i(f11349i, "Current focus mode '" + focusMode + "'; use auto focus? " + z9);
        i();
    }

    public final synchronized void f() {
        if (!this.f11351a && !this.f11355e.hasMessages(this.f11356f)) {
            Handler handler = this.f11355e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f11356f), 2000L);
        }
    }

    public final void g() {
        this.f11355e.removeMessages(this.f11356f);
    }

    public final void h() {
        if (!this.f11353c || this.f11351a || this.f11352b) {
            return;
        }
        try {
            this.f11354d.autoFocus(this.f11358h);
            this.f11352b = true;
        } catch (RuntimeException e9) {
            Log.w(f11349i, "Unexpected exception while focusing", e9);
            f();
        }
    }

    public void i() {
        this.f11351a = false;
        h();
    }

    public void j() {
        this.f11351a = true;
        this.f11352b = false;
        g();
        if (this.f11353c) {
            try {
                this.f11354d.cancelAutoFocus();
            } catch (RuntimeException e9) {
                Log.w(f11349i, "Unexpected exception while cancelling focusing", e9);
            }
        }
    }
}
