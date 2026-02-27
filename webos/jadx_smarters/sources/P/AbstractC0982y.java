package P;

import android.view.MotionEvent;

/* JADX INFO: renamed from: P.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0982y {
    public static int a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    public static boolean b(MotionEvent motionEvent, int i9) {
        return (motionEvent.getSource() & i9) == i9;
    }
}
