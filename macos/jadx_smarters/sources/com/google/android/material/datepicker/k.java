package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.AbstractC1617D;

/* JADX INFO: loaded from: classes3.dex */
public final class k<S> extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.material.datepicker.a f27345d;

    public class a extends o {
        public a() {
        }
    }

    public static k A(d dVar, int i9, com.google.android.material.datepicker.a aVar) {
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i9);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.setArguments(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f27344c = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC1617D.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f27345d = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f27344c));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f27344c);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f27345d);
    }
}
