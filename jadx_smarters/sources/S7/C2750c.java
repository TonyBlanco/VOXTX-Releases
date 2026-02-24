package s7;

import P.AbstractC0980w;
import android.R;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.ParentalControlActivitity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import java.util.ArrayList;
import java.util.HashMap;
import m7.w;
import q7.L;

/* JADX INFO: renamed from: s7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2750c extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50265a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f50267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f50268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f50269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ParentalControlActivitity f50270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public L f50271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView.o f50272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressDialog f50273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Typeface f50274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Toolbar f50275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SearchView f50276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LiveStreamDBHandler f50277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50278o = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50279p = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f50280q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f50281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f50282s;

    /* JADX INFO: renamed from: s7.c$a */
    public class a implements SearchView.m {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = C2750c.this.f50269f;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (C2750c.this.f50273j != null) {
                C2750c.this.f50273j.dismiss();
            }
            C2750c c2750c = C2750c.this;
            if (c2750c.f50268e == null || c2750c.f50271h == null) {
                return true;
            }
            C2750c.this.f50268e.setVisibility(8);
            L l9 = C2750c.this.f50271h;
            C2750c c2750c2 = C2750c.this;
            l9.t0(str, c2750c2.f50268e, c2750c2.f50273j);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: s7.c$b */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    /* JADX INFO: renamed from: s7.c$c, reason: collision with other inner class name */
    public class DialogInterfaceOnClickListenerC0448c implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0448c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: renamed from: s7.c$d */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    /* JADX INFO: renamed from: s7.c$e */
    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: renamed from: s7.c$f */
    public interface f {
    }

    private void A() {
        RecyclerView recyclerView;
        this.f50281r = getContext();
        this.f50277n = new LiveStreamDBHandler(this.f50281r);
        this.f50274k = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f50270g = (ParentalControlActivitity) this.f50281r;
        this.f50267d.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f50272i = linearLayoutManager;
        this.f50267d.setLayoutManager(linearLayoutManager);
        LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f50281r);
        ArrayList<LiveStreamCategoryIdDBModel> allm3uCategories = liveStreamDBHandler.getAllm3uCategories();
        this.f50280q = liveStreamDBHandler.getUncatCountM3UALL(Boolean.FALSE);
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
        int i9 = this.f50280q;
        if (i9 != 0 && i9 > 0) {
            liveStreamCategoryIdDBModel.setLiveStreamCategoryID("");
            liveStreamCategoryIdDBModel.setLiveStreamCategoryName(getResources().getString(a7.j.f13215b8));
            allm3uCategories.add(allm3uCategories.size(), liveStreamCategoryIdDBModel);
        }
        HashMap map = new HashMap();
        if (allm3uCategories != null) {
            for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 : allm3uCategories) {
                map.put(liveStreamCategoryIdDBModel2.getLiveStreamCategoryID(), liveStreamCategoryIdDBModel2.getLiveStreamCategoryName());
            }
        }
        ProgressBar progressBar = this.f50269f;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (allm3uCategories != null && allm3uCategories.size() > 0 && (recyclerView = this.f50267d) != null && this.f50268e != null) {
            recyclerView.setVisibility(0);
            this.f50268e.setVisibility(8);
            L l9 = new L(allm3uCategories, getContext(), this.f50270g, this.f50274k);
            this.f50271h = l9;
            this.f50267d.setAdapter(l9);
            return;
        }
        RecyclerView recyclerView2 = this.f50267d;
        if (recyclerView2 == null || this.f50268e == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.f50268e.setVisibility(0);
        this.f50268e.setText(getResources().getString(a7.j.f13251f4));
    }

    private void B() {
        setHasOptionsMenu(true);
        this.f50275l = (Toolbar) getActivity().findViewById(a7.f.kh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof f) {
            this.f50282s = (f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f50265a = getArguments().getString("param1");
            this.f50266c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f50275l.x(a7.h.f12935r);
        TypedValue typedValue = new TypedValue();
        if (this.f50281r.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f50281r.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f50275l.getChildCount(); i9++) {
            if (this.f50275l.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f50275l.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View viewInflate = layoutInflater.inflate(a7.g.f12713S2, viewGroup, false);
        this.f50267d = (RecyclerView) viewInflate.findViewById(a7.f.ub);
        this.f50268e = (TextView) viewInflate.findViewById(a7.f.f12249Q2);
        this.f50269f = (ProgressBar) viewInflate.findViewById(a7.f.ec);
        A();
        B();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f50282s = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        Intent intent;
        if (menuItem.getItemId() == a7.f.Gb) {
            intent = new Intent(this.f50281r, (Class<?>) NewDashboardActivity.class);
        } else {
            if (menuItem.getItemId() != a7.f.Mb) {
                if (menuItem.getItemId() == a7.f.f12400g) {
                    SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
                    this.f50276m = searchView;
                    searchView.setQueryHint(getResources().getString(a7.j.f13453z6));
                    this.f50276m.setIconifiedByDefault(false);
                    this.f50276m.setOnQueryTextListener(new a());
                    return true;
                }
                if (menuItem.getItemId() == a7.f.gb) {
                    a.C0158a c0158a = new a.C0158a(this.f50281r);
                    c0158a.d(a7.e.f12056s1);
                    c0158a.j(this.f50281r.getResources().getString(a7.j.f13132S8), new b());
                    c0158a.g(this.f50281r.getResources().getString(a7.j.f13231d4), new DialogInterfaceOnClickListenerC0448c());
                    c0158a.n();
                    return true;
                }
                if (menuItem.getItemId() != a7.f.ib) {
                    if (menuItem.getItemId() == a7.f.f12390f && (context = this.f50281r) != null) {
                        w.n0(context);
                    }
                    return false;
                }
                a.C0158a c0158a2 = new a.C0158a(this.f50281r);
                c0158a2.d(a7.e.f12056s1);
                c0158a2.j(this.f50281r.getResources().getString(a7.j.f13132S8), new d());
                c0158a2.g(this.f50281r.getResources().getString(a7.j.f13231d4), new e());
                c0158a2.n();
                return true;
            }
            intent = new Intent(this.f50281r, (Class<?>) SettingsActivity.class);
        }
        startActivity(intent);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }
}
