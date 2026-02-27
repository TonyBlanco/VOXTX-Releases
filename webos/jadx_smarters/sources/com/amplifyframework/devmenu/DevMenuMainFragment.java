package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178h;
import androidx.navigation.r;
import com.amplifyframework.core.R;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public final class DevMenuMainFragment extends Fragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$0(View view) {
        r.b(view).n(R.id.show_env_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$1(View view) {
        r.b(view).n(R.id.show_device_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$2(View view) {
        r.b(view).n(R.id.show_logs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onCreateView$3(View view) {
        r.b(view).n(R.id.show_file_issue);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1179i
    public /* bridge */ /* synthetic */ AbstractC2215a getDefaultViewModelCreationExtras() {
        return AbstractC1178h.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dev_menu_fragment_main, viewGroup, false);
        viewInflate.findViewById(R.id.env_button).setOnClickListener(new View.OnClickListener() { // from class: com.amplifyframework.devmenu.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevMenuMainFragment.lambda$onCreateView$0(view);
            }
        });
        viewInflate.findViewById(R.id.device_button).setOnClickListener(new View.OnClickListener() { // from class: com.amplifyframework.devmenu.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevMenuMainFragment.lambda$onCreateView$1(view);
            }
        });
        viewInflate.findViewById(R.id.logs_button).setOnClickListener(new View.OnClickListener() { // from class: com.amplifyframework.devmenu.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevMenuMainFragment.lambda$onCreateView$2(view);
            }
        });
        viewInflate.findViewById(R.id.file_issue_button).setOnClickListener(new View.OnClickListener() { // from class: com.amplifyframework.devmenu.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevMenuMainFragment.lambda$onCreateView$3(view);
            }
        });
        return viewInflate;
    }
}
