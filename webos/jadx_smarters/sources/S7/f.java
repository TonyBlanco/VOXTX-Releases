package s7;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class f extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f50334a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditText f50335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f50336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f50337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f50338f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f50339g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f50340h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f50341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LiveStreamDBHandler f50342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f50343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f50344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f50345m;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.B();
        }
    }

    public interface b {
    }

    private void A() {
        this.f50341i = getContext();
        this.f50342j = new LiveStreamDBHandler(this.f50341i);
        this.f50338f = String.valueOf(this.f50334a.getText());
        this.f50339g = String.valueOf(this.f50335c.getText());
        this.f50340h = String.valueOf(this.f50336d.getText());
        this.f50334a.requestFocus();
        ((InputMethodManager) this.f50341i.getSystemService("input_method")).showSoftInput(this.f50334a, 1);
    }

    public void B() {
        Context context;
        Resources resources;
        int i9;
        if (this.f50341i != null) {
            this.f50338f = String.valueOf(this.f50334a.getText());
            this.f50339g = String.valueOf(this.f50335c.getText());
            this.f50340h = String.valueOf(this.f50336d.getText());
            String string = this.f50341i.getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            if (!D(string, this.f50338f, SharepreferenceDBHandler.getUserID(this.f50341i))) {
                context = this.f50341i;
                if (context != null) {
                    resources = getResources();
                    i9 = a7.j.f12986E2;
                    Toast.makeText(context, resources.getString(i9), 0).show();
                }
            } else {
                if (!z(this.f50339g, this.f50340h)) {
                    return;
                }
                if (this.f50339g.equals(this.f50340h)) {
                    E(this.f50342j.upDatePassword(string, this.f50339g, SharepreferenceDBHandler.getUserID(this.f50341i)));
                    getActivity().finish();
                    return;
                } else {
                    context = this.f50341i;
                    if (context != null) {
                        resources = getResources();
                        i9 = a7.j.f13165W4;
                        Toast.makeText(context, resources.getString(i9), 0).show();
                    }
                }
            }
            x();
        }
    }

    public final boolean D(String str, String str2, int i9) {
        String userPassword;
        boolean z9;
        ArrayList<PasswordDBModel> allPassword = new LiveStreamDBHandler(this.f50341i).getAllPassword(SharepreferenceDBHandler.getUserID(this.f50341i));
        if (allPassword != null) {
            userPassword = "";
            z9 = false;
            for (PasswordDBModel passwordDBModel : allPassword) {
                if (passwordDBModel.getUserDetail().equals(str) && !passwordDBModel.getUserPassword().isEmpty()) {
                    userPassword = passwordDBModel.getUserPassword();
                    z9 = true;
                }
            }
        } else {
            userPassword = "";
            z9 = false;
        }
        return (!z9 || str2 == null || str2.isEmpty() || str2.equals("") || userPassword.equals("") || !userPassword.equals(str2)) ? false : true;
    }

    public final void E(boolean z9) {
        Context context;
        Resources resources;
        int i9;
        if (z9) {
            context = this.f50341i;
            if (context != null) {
                resources = getResources();
                i9 = a7.j.f13192Z4;
                Toast.makeText(context, resources.getString(i9), 0).show();
            }
        } else {
            context = this.f50341i;
            if (context != null) {
                resources = getResources();
                i9 = a7.j.f13244e7;
                Toast.makeText(context, resources.getString(i9), 0).show();
            }
        }
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.f50345m = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f50343k = getArguments().getString("param1");
            this.f50344l = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(a7.g.f12707R2, viewGroup, false);
        this.f50334a = (EditText) viewInflate.findViewById(a7.f.Fk);
        this.f50335c = (EditText) viewInflate.findViewById(a7.f.ok);
        this.f50336d = (EditText) viewInflate.findViewById(a7.f.ni);
        Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
        this.f50337e = button;
        button.setOnClickListener(new a());
        A();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f50345m = null;
    }

    public final void x() {
        EditText editText = this.f50334a;
        if (editText == null || this.f50336d == null || this.f50335c == null) {
            return;
        }
        editText.getText().clear();
        this.f50336d.getText().clear();
        this.f50335c.getText().clear();
    }

    public final boolean z(String str, String str2) {
        if (str == null || str.equals("") || str.isEmpty()) {
            Context context = this.f50341i;
            if (context != null) {
                Toast.makeText(context, getResources().getString(a7.j.f13388t1), 0).show();
            }
            return false;
        }
        if ((!str.isEmpty() && !str.equals("") && str2 == null && str2.isEmpty()) || str2.equals("")) {
            Context context2 = this.f50341i;
            if (context2 != null) {
                Toast.makeText(context2, getResources().getString(a7.j.f13338o1), 0).show();
                return false;
            }
        } else if ((!str.isEmpty() && !str.equals("") && !str2.isEmpty()) || !str2.equals("")) {
            return true;
        }
        return false;
    }
}
