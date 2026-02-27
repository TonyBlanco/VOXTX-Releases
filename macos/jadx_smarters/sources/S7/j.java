package s7;

import D.AbstractC0519b;
import P.AbstractC0980w;
import a7.k;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import m7.AbstractC2237a;
import m7.w;
import q7.d0;

/* JADX INFO: loaded from: classes4.dex */
public class j extends Fragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SharedPreferences.Editor f50404A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SharedPreferences f50405B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SharedPreferences.Editor f50406C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PopupWindow f50407D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProgressBar f50408a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f50409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f50410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f50411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f50412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView.o f50413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences f50414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d0 f50415i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Toolbar f50417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SearchView f50418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f50419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f50420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LiveStreamDBHandler f50421o;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f50427u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f50428v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f50429w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f50430x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f50431y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SharedPreferences f50432z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f50416j = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50422p = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50423q = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LiveStreamsDBModel f50424r = new LiveStreamsDBModel();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f50425s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f50426t = new ArrayList();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(j.this.f50419m);
        }
    }

    public class c implements SearchView.m {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            j.this.f50411e.setVisibility(8);
            if (j.this.f50415i == null || j.this.f50410d == null || j.this.f50410d.getVisibility() == 0) {
                return false;
            }
            j.this.f50415i.q0(str, j.this.f50411e);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(j.this.f50419m);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.f50407D.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f50441a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f50442c;

        public i(RadioGroup radioGroup, View view) {
            this.f50441a = radioGroup;
            this.f50442c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f50442c.findViewById(this.f50441a.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(j.this.getResources().getString(a7.j.f13284i7))) {
                editor = j.this.f50406C;
                str = "1";
            } else if (radioButton.getText().toString().equals(j.this.getResources().getString(a7.j.f13254f7))) {
                editor = j.this.f50406C;
                str = "2";
            } else if (radioButton.getText().toString().equals(j.this.getResources().getString(a7.j.f13304k7))) {
                editor = j.this.f50406C;
                str = "3";
            } else {
                editor = j.this.f50406C;
                str = "0";
            }
            editor.putString("sort", str);
            j.this.f50406C.commit();
            j jVar = j.this;
            jVar.f50432z = jVar.getActivity().getSharedPreferences("listgridview", 0);
            j jVar2 = j.this;
            jVar2.f50404A = jVar2.f50432z.edit();
            int i9 = j.this.f50432z.getInt("livestream", 0);
            AbstractC2237a.f44456M = i9;
            if (i9 == 1) {
                j.this.X();
            } else {
                j.this.Y();
            }
            j.this.f50407D.dismiss();
        }
    }

    private ArrayList T() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f50421o.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f50419m));
        this.f50427u = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f50426t.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f50426t;
    }

    private ArrayList W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) it.next();
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (liveStreamsDBModel.getCategoryId().equals((String) it2.next())) {
                            break;
                        }
                    } else {
                        ArrayList arrayList3 = this.f50428v;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamsDBModel);
                        }
                    }
                }
            }
        }
        return this.f50428v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        this.f50419m = getContext();
        this.f50421o = new LiveStreamDBHandler(this.f50419m);
        RecyclerView recyclerView = this.f50409c;
        if (recyclerView == null || this.f50419m == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), w.L(this.f50419m) + 1);
        this.f50413g = gridLayoutManager;
        this.f50409c.setLayoutManager(gridLayoutManager);
        this.f50409c.setItemAnimator(new androidx.recyclerview.widget.c());
        SharedPreferences sharedPreferences = this.f50419m.getSharedPreferences("loginPrefs", 0);
        this.f50414h = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f50414h.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.f50419m = getContext();
        this.f50421o = new LiveStreamDBHandler(this.f50419m);
        RecyclerView recyclerView = this.f50409c;
        if (recyclerView == null || this.f50419m == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f50413g = linearLayoutManager;
        this.f50409c.setLayoutManager(linearLayoutManager);
        this.f50409c.setItemAnimator(new androidx.recyclerview.widget.c());
        SharedPreferences sharedPreferences = this.f50419m.getSharedPreferences("loginPrefs", 0);
        this.f50414h = sharedPreferences;
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f50414h.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        c0();
    }

    public static j Z(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("", str);
        j jVar = new j();
        jVar.setArguments(bundle);
        return jVar;
    }

    private void b0() {
        this.f50417k = (Toolbar) getActivity().findViewById(a7.f.kh);
    }

    private void c0() {
        try {
            a();
            if (this.f50419m != null) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f50419m);
                this.f50427u = new ArrayList();
                this.f50428v = new ArrayList();
                this.f50429w = new ArrayList();
                this.f50430x = new ArrayList();
                this.f50431y = new ArrayList();
                ArrayList<LiveStreamsDBModel> allLiveStreamsArchive = liveStreamDBHandler.getAllLiveStreamsArchive(this.f50420n);
                if (liveStreamDBHandler.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f50419m)) <= 0 || allLiveStreamsArchive == null) {
                    this.f50430x = allLiveStreamsArchive;
                } else {
                    ArrayList arrayListT = T();
                    this.f50426t = arrayListT;
                    if (arrayListT != null) {
                        this.f50429w = W(allLiveStreamsArchive, arrayListT);
                    }
                    this.f50430x = this.f50429w;
                }
                ArrayList arrayList = this.f50430x;
                if (arrayList != null && this.f50409c != null && arrayList.size() != 0) {
                    b();
                    d0 d0Var = new d0(this.f50430x, getContext());
                    this.f50415i = d0Var;
                    this.f50409c.setAdapter(d0Var);
                    this.f50415i.w();
                    return;
                }
                b();
                TextView textView = this.f50410d;
                if (textView != null) {
                    textView.setText(getResources().getString(a7.j.f13441y4));
                    this.f50410d.setVisibility(0);
                }
                this.f50412f.setVisibility(0);
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    private void i0(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f50407D = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f50407D.setWidth(-1);
            this.f50407D.setHeight(-1);
            this.f50407D.setFocusable(true);
            this.f50407D.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(a7.f.md);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(a7.f.fd);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(a7.f.zd);
            String string = this.f50405B.getString("sort", "");
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new h());
            button.setOnClickListener(new i(radioGroup, viewInflate));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void a() {
        ProgressBar progressBar = this.f50408a;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void b() {
        ProgressBar progressBar = this.f50408a;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50420n = getArguments().getString("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f50419m == null || this.f50417k == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f50419m.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f50419m.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f50417k.getChildCount(); i9++) {
            if (this.f50417k.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f50417k.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(a7.g.f12683N2, viewGroup, false);
        this.f50408a = (ProgressBar) viewInflate.findViewById(a7.f.ec);
        this.f50409c = (RecyclerView) viewInflate.findViewById(a7.f.ub);
        this.f50410d = (TextView) viewInflate.findViewById(a7.f.sk);
        this.f50411e = (TextView) viewInflate.findViewById(a7.f.wk);
        this.f50412f = (TextView) viewInflate.findViewById(a7.f.Pi);
        AbstractC0519b.d(getActivity());
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort", 0);
        this.f50405B = sharedPreferences;
        this.f50406C = sharedPreferences.edit();
        if (this.f50405B.getString("sort", "").equals("")) {
            this.f50406C.putString("sort", "0");
            this.f50406C.commit();
        }
        setHasOptionsMenu(true);
        b0();
        SharedPreferences sharedPreferences2 = getActivity().getSharedPreferences("listgridview", 0);
        this.f50432z = sharedPreferences2;
        this.f50404A = sharedPreferences2.edit();
        int i9 = this.f50432z.getInt("livestream", 0);
        AbstractC2237a.f44456M = i9;
        if (i9 == 1) {
            X();
        } else {
            Y();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this.f50419m, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this.f50419m, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12390f && (context = this.f50419m) != null) {
            new a.C0158a(context, k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new b()).g(getResources().getString(a7.j.f13231d4), new a()).n();
        }
        if (itemId == a7.f.f12400g) {
            SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
            this.f50418l = searchView;
            searchView.setQueryHint(getResources().getString(a7.j.f12950A6));
            this.f50418l.setIconifiedByDefault(false);
            this.f50418l.setOnQueryTextListener(new c());
            return true;
        }
        if (itemId == a7.f.gb) {
            a.C0158a c0158a = new a.C0158a(this.f50419m);
            c0158a.setTitle(this.f50419m.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f50419m.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(getResources().getString(a7.j.f13132S8), new d());
            c0158a.g(getResources().getString(a7.j.f13231d4), new e());
            c0158a.n();
            return true;
        }
        if (itemId == a7.f.ib) {
            a.C0158a c0158a2 = new a.C0158a(this.f50419m);
            c0158a2.setTitle(this.f50419m.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f50419m.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f50419m.getResources().getString(a7.j.f13132S8), new f());
            c0158a2.g(this.f50419m.getResources().getString(a7.j.f13231d4), new g());
            c0158a2.n();
            return true;
        }
        if (itemId == a7.f.f12509q6) {
            this.f50404A.putInt("livestream", 1);
            this.f50404A.commit();
            X();
        }
        if (itemId == a7.f.f12549u6) {
            this.f50404A.putInt("livestream", 0);
            this.f50404A.commit();
            Y();
        }
        if (itemId == a7.f.mb) {
            i0(getActivity());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        this.f50417k.x(a7.h.f12936s);
        menu.findItem(a7.f.f12509q6);
    }
}
