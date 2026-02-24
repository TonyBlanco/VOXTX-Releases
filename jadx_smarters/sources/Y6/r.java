package Y6;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WindowManager f10719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OrientationEventListener f10720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f10721d;

    public class a extends OrientationEventListener {
        public a(Context context, int i9) {
            super(context, i9);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i9) {
            int rotation;
            WindowManager windowManager = r.this.f10719b;
            q qVar = r.this.f10721d;
            if (r.this.f10719b == null || qVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == r.this.f10718a) {
                return;
            }
            r.this.f10718a = rotation;
            qVar.a(rotation);
        }
    }

    public void e(Context context, q qVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f10721d = qVar;
        this.f10719b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f10720c = aVar;
        aVar.enable();
        this.f10718a = this.f10719b.getDefaultDisplay().getRotation();
    }

    public void f() {
        OrientationEventListener orientationEventListener = this.f10720c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f10720c = null;
        this.f10719b = null;
        this.f10721d = null;
    }
}
