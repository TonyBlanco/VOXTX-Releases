package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178h;
import com.amplifyframework.core.R;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public final class DevMenuDeviceFragment extends Fragment {
    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1179i
    public /* bridge */ /* synthetic */ AbstractC2215a getDefaultViewModelCreationExtras() {
        return AbstractC1178h.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dev_menu_fragment_device, viewGroup, false);
        ((TextView) viewInflate.findViewById(R.id.device_info_text)).setText(new DeviceInfo().toString());
        return viewInflate;
    }
}
