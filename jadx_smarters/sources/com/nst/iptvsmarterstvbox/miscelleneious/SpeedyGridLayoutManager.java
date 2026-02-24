package com.nst.iptvsmarterstvbox.miscelleneious;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;

/* JADX INFO: loaded from: classes.dex */
public class SpeedyGridLayoutManager extends GridLayoutManager {

    public class a extends h {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public PointF a(int i9) {
            return super.a(i9);
        }

        @Override // androidx.recyclerview.widget.h
        public float v(DisplayMetrics displayMetrics) {
            return 150.0f / displayMetrics.densityDpi;
        }
    }

    public SpeedyGridLayoutManager(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void g2(RecyclerView recyclerView, RecyclerView.A a9, int i9) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i9);
        h2(aVar);
    }
}
