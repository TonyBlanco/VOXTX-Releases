package com.google.android.material.timepicker;

import P.L;
import R4.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ClockHandView f27784A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ClockFaceView f27785B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final MaterialButtonToggleGroup f27786C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final View.OnClickListener f27787D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Chip f27788y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Chip f27789z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.t(TimePickerView.this);
        }
    }

    public class b implements MaterialButtonToggleGroup.d {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i9, boolean z9) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    public class d implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f27793a;

        public d(GestureDetector gestureDetector) {
            this.f27793a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f27793a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface e {
    }

    public interface f {
    }

    public interface g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f27787D = new a();
        LayoutInflater.from(context).inflate(h.f8816k, this);
        this.f27785B = (ClockFaceView) findViewById(R4.f.f8784h);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R4.f.f8786j);
        this.f27786C = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.f27788y = (Chip) findViewById(R4.f.f8789m);
        this.f27789z = (Chip) findViewById(R4.f.f8787k);
        this.f27784A = (ClockHandView) findViewById(R4.f.f8785i);
        x();
        w();
    }

    public static /* synthetic */ g t(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ f u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ e v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i9) {
        super.onVisibilityChanged(view, i9);
        if (view == this && i9 == 0) {
            y();
        }
    }

    public final void w() {
        this.f27788y.setTag(R4.f.f8767G, 12);
        this.f27789z.setTag(R4.f.f8767G, 10);
        this.f27788y.setOnClickListener(this.f27787D);
        this.f27789z.setOnClickListener(this.f27787D);
        this.f27788y.setAccessibilityClassName("android.view.View");
        this.f27789z.setAccessibilityClassName("android.view.View");
    }

    public final void x() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f27788y.setOnTouchListener(dVar);
        this.f27789z.setOnTouchListener(dVar);
    }

    public final void y() {
        if (this.f27786C.getVisibility() == 0) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.g(this);
            cVar.e(R4.f.f8783g, L.E(this) == 0 ? 2 : 1);
            cVar.c(this);
        }
    }
}
