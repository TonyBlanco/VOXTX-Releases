package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends LinearLayoutManager {

    public class a extends androidx.recyclerview.widget.h {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.h
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public q(Context context, int i9, boolean z9) {
        super(context, i9, z9);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void g2(RecyclerView recyclerView, RecyclerView.A a9, int i9) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i9);
        h2(aVar);
    }
}
