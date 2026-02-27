package P;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: P.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0973o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6828a;

    /* JADX INFO: renamed from: P.o$a */
    public interface a {
        void a(boolean z9);

        boolean onTouchEvent(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: P.o$b */
    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureDetector f6829a;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f6829a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // P.C0973o.a
        public void a(boolean z9) {
            this.f6829a.setIsLongpressEnabled(z9);
        }

        @Override // P.C0973o.a
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.f6829a.onTouchEvent(motionEvent);
        }
    }

    public C0973o(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C0973o(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f6828a = new b(context, onGestureListener, handler);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f6828a.onTouchEvent(motionEvent);
    }

    public void b(boolean z9) {
        this.f6828a.a(z9);
    }
}
