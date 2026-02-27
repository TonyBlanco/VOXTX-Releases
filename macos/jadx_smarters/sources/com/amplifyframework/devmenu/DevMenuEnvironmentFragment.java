package com.amplifyframework.devmenu;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178h;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.R;
import com.amplifyframework.logging.Logger;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public final class DevMenuEnvironmentFragment extends Fragment {
    private static final Logger LOG = Amplify.Logging.forNamespace("amplify:devmenu");

    private SpannableStringBuilder getEnvironmentInfo() {
        String developerEnvironmentInfo;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        EnvironmentInfo environmentInfo = new EnvironmentInfo();
        spannableStringBuilder.append((CharSequence) setBold("Amplify Plugins Information"));
        spannableStringBuilder.append((CharSequence) ("\n" + environmentInfo.getPluginVersions() + "\n"));
        spannableStringBuilder.append((CharSequence) setBold("Developer Environment Information"));
        try {
            developerEnvironmentInfo = environmentInfo.getDeveloperEnvironmentInfo(requireContext());
        } catch (AmplifyException unused) {
            LOG.warn("Error reading developer environment information.");
            developerEnvironmentInfo = "";
        }
        if (developerEnvironmentInfo.isEmpty()) {
            str = "\nUnable to retrieve developer environment information.";
        } else {
            str = "\n" + developerEnvironmentInfo;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    private SpannableString setBold(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        return spannableString;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1179i
    public /* bridge */ /* synthetic */ AbstractC2215a getDefaultViewModelCreationExtras() {
        return AbstractC1178h.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dev_menu_fragment_environment, viewGroup, false);
        ((TextView) viewInflate.findViewById(R.id.env_info_text)).setText(getEnvironmentInfo());
        return viewInflate;
    }
}
