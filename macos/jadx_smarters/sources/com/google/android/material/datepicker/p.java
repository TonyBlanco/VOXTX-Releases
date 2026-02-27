package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f27366a = new LinkedHashSet();

    public boolean x(o oVar) {
        return this.f27366a.add(oVar);
    }

    public void z() {
        this.f27366a.clear();
    }
}
