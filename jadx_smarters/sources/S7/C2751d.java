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
import q7.J;

/* JADX INFO: renamed from: s7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2751d extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50288a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f50290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f50291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f50292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ParentalControlActivitity f50293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J f50294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView.o f50295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressDialog f50296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Typeface f50297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Toolbar f50298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SearchView f50299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LiveStreamDBHandler f50300n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f50303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f50304r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50301o = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50302p = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f50305s = -1;

    /* JADX INFO: renamed from: s7.d$a */
    public class a implements SearchView.m {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = C2751d.this.f50292f;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (C2751d.this.f50296j != null) {
                C2751d.this.f50296j.dismiss();
            }
            C2751d c2751d = C2751d.this;
            if (c2751d.f50291e == null || c2751d.f50294h == null) {
                return true;
            }
            C2751d.this.f50291e.setVisibility(8);
            J j9 = C2751d.this.f50294h;
            C2751d c2751d2 = C2751d.this;
            j9.t0(str, c2751d2.f50291e, c2751d2.f50296j);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: s7.d$b */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(C2751d.this.f50303q);
        }
    }

    /* JADX INFO: renamed from: s7.d$c */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: renamed from: s7.d$d, reason: collision with other inner class name */
    public class DialogInterfaceOnClickListenerC0449d implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0449d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    /* JADX INFO: renamed from: s7.d$e */
    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: renamed from: s7.d$f */
    public interface f {
    }

    private void A() {
        RecyclerView recyclerView;
        this.f50303q = getContext();
        this.f50300n = new LiveStreamDBHandler(this.f50303q);
        this.f50297k = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f50293g = (ParentalControlActivitity) this.f50303q;
        this.f50290d.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f50295i = linearLayoutManager;
        this.f50290d.setLayoutManager(linearLayoutManager);
        ArrayList<LiveStreamCategoryIdDBModel> allliveCategoriesForParental = new LiveStreamDBHandler(this.f50303q).getAllliveCategoriesForParental("radio_streams");
        HashMap map = new HashMap();
        if (allliveCategoriesForParental != null) {
            for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : allliveCategoriesForParental) {
                map.put(liveStreamCategoryIdDBModel.getLiveStreamCategoryID(), liveStreamCategoryIdDBModel.getLiveStreamCategoryName());
            }
        }
        ProgressBar progressBar = this.f50292f;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (allliveCategoriesForParental != null && allliveCategoriesForParental.size() > 0 && (recyclerView = this.f50290d) != null && this.f50291e != null) {
            recyclerView.setVisibility(0);
            this.f50291e.setVisibility(8);
            J j9 = new J(allliveCategoriesForParental, getContext(), this.f50293g, this.f50297k);
            this.f50294h = j9;
            this.f50290d.setAdapter(j9);
            return;
        }
        RecyclerView recyclerView2 = this.f50290d;
        if (recyclerView2 == null || this.f50291e == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.f50291e.setVisibility(0);
        this.f50291e.setText(getResources().getString(a7.j.f13421w4));
    }

    private void B() {
        setHasOptionsMenu(true);
        this.f50298l = (Toolbar) getActivity().findViewById(a7.f.kh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof f) {
            this.f50304r = (f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f50288a = getArguments().getString("param1");
            this.f50289c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f50298l.x(a7.h.f12935r);
        TypedValue typedValue = new TypedValue();
        if (this.f50303q.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f50303q.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f50298l.getChildCount(); i9++) {
            if (this.f50298l.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f50298l.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View viewInflate = layoutInflater.inflate(a7.g.f12701Q2, viewGroup, false);
        this.f50290d = (RecyclerView) viewInflate.findViewById(a7.f.ub);
        this.f50291e = (TextView) viewInflate.findViewById(a7.f.f12249Q2);
        this.f50292f = (ProgressBar) viewInflate.findViewById(a7.f.ec);
        A();
        B();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        setHasOptionsMenu(false);
        this.f50304r = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            intent = new Intent(this.f50303q, (Class<?>) NewDashboardActivity.class);
        } else {
            if (itemId != a7.f.Mb) {
                if (itemId == a7.f.f12400g) {
                    SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
                    this.f50299m = searchView;
                    searchView.setQueryHint(getResources().getString(a7.j.f12980D6));
                    this.f50299m.setIconifiedByDefault(false);
                    this.f50299m.setOnQueryTextListener(new a());
                    return true;
                }
                if (itemId == a7.f.gb) {
                    a.C0158a c0158a = new a.C0158a(this.f50303q);
                    c0158a.setTitle(this.f50303q.getResources().getString(a7.j.f13397u0));
                    c0158a.f(this.f50303q.getResources().getString(a7.j.f13134T0));
                    c0158a.d(a7.e.f12056s1);
                    c0158a.j(this.f50303q.getResources().getString(a7.j.f13132S8), new b());
                    c0158a.g(this.f50303q.getResources().getString(a7.j.f13231d4), new c());
                    c0158a.n();
                    return true;
                }
                if (itemId != a7.f.ib) {
                    if (itemId == a7.f.f12390f && (context = this.f50303q) != null) {
                        w.n0(context);
                    }
                    return false;
                }
                a.C0158a c0158a2 = new a.C0158a(this.f50303q);
                c0158a2.setTitle(this.f50303q.getResources().getString(a7.j.f13397u0));
                c0158a2.f(this.f50303q.getResources().getString(a7.j.f13134T0));
                c0158a2.d(a7.e.f12056s1);
                c0158a2.j(this.f50303q.getResources().getString(a7.j.f13132S8), new DialogInterfaceOnClickListenerC0449d());
                c0158a2.g(this.f50303q.getResources().getString(a7.j.f13231d4), new e());
                c0158a2.n();
                return true;
            }
            intent = new Intent(this.f50303q, (Class<?>) SettingsActivity.class);
        }
        startActivity(intent);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }
}
