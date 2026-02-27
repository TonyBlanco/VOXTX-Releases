package a5;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: a5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC1112a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f11815a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11818e;

    public ViewOnTouchListenerC1112a(Dialog dialog, Rect rect) {
        this.f11815a = dialog;
        this.f11816c = rect.left;
        this.f11817d = rect.top;
        this.f11818e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f11816c + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f11817d + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i9 = this.f11818e;
            motionEventObtain.setLocation((-i9) - 1, (-i9) - 1);
        }
        view.performClick();
        return this.f11815a.onTouchEvent(motionEventObtain);
    }
}
