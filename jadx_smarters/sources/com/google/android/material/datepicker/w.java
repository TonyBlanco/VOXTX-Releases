package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class w extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f27372d;

    public static class a extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final TextView f27373t;

        public a(TextView textView) {
            super(textView);
            this.f27373t = textView;
        }
    }

    public w(i iVar) {
        this.f27372d = iVar;
    }

    public int j0(int i9) {
        return i9 - this.f27372d.S().m().f27349d;
    }

    public int k0(int i9) {
        return this.f27372d.S().m().f27349d + i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void E(a aVar, int i9) {
        int iK0 = k0(i9);
        String string = aVar.f27373t.getContext().getString(R4.j.f8841o);
        aVar.f27373t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iK0)));
        aVar.f27373t.setContentDescription(String.format(string, Integer.valueOf(iK0)));
        c cVarT = this.f27372d.T();
        if (v.i().get(1) == iK0) {
            b bVar = cVarT.f27275f;
        } else {
            b bVar2 = cVarT.f27273d;
        }
        this.f27372d.X();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public a L(ViewGroup viewGroup, int i9) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R4.h.f8823r, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f27372d.S().r();
    }
}
