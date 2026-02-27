package com.nst.iptvsmarterstvbox.WHMCSClientapp.fragment;

import a7.f;
import a7.g;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class InvoiceFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f28523a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28526e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28527f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28528g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OnFragmentInteractionListener f28529h;

    public interface OnFragmentInteractionListener {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            this.f28529h = (OnFragmentInteractionListener) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f28524c = getArguments().getString("param1");
            this.f28525d = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(g.f12677M2, viewGroup, false);
        this.f28523a = (WebView) viewInflate.findViewById(f.Vm);
        x();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException(e9);
        } catch (NoSuchFieldException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void x() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28526e = arguments.getString("invoice_id");
        }
        this.f28523a.setWebChromeClient(new WebChromeClient());
    }
}
