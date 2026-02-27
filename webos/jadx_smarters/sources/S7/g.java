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
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.ParentalControlActivitity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import m7.w;
import q7.L;

/* JADX INFO: loaded from: classes4.dex */
public class g extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50347a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f50349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f50350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f50351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ParentalControlActivitity f50352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public L f50353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView.o f50354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressDialog f50355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Typeface f50356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Toolbar f50357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SearchView f50358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LiveStreamDBHandler f50359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50360o = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50361p = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f50362q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f50363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f50364s;

    public class a implements SearchView.m {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            if (g.this.f50351f != null) {
                g.this.f50351f.setVisibility(4);
            }
            if (g.this.f50355j != null) {
                g.this.f50355j.dismiss();
            }
            if (g.this.f50350e == null || g.this.f50353h == null) {
                return true;
            }
            g.this.f50350e.setVisibility(8);
            g.this.f50353h.t0(str, g.this.f50350e, g.this.f50355j);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
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

    public interface f {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void D() {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.g.D():void");
    }

    private void E() {
        setHasOptionsMenu(true);
        this.f50357l = (Toolbar) getActivity().findViewById(a7.f.kh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof f) {
            this.f50364s = (f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f50347a = getArguments().getString("param1");
            this.f50348c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f50357l.x(a7.h.f12935r);
        TypedValue typedValue = new TypedValue();
        if (this.f50363r.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f50363r.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f50357l.getChildCount(); i9++) {
            if (this.f50357l.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f50357l.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View viewInflate = layoutInflater.inflate(a7.g.f12713S2, viewGroup, false);
        this.f50349d = (RecyclerView) viewInflate.findViewById(a7.f.ub);
        this.f50350e = (TextView) viewInflate.findViewById(a7.f.f12249Q2);
        this.f50351f = (ProgressBar) viewInflate.findViewById(a7.f.ec);
        D();
        E();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f50364s = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            intent = new Intent(this.f50363r, (Class<?>) NewDashboardActivity.class);
        } else {
            if (itemId != a7.f.Mb) {
                if (itemId == a7.f.f12400g) {
                    SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
                    this.f50358m = searchView;
                    searchView.setQueryHint(getResources().getString(a7.j.f13453z6));
                    this.f50358m.setIconifiedByDefault(false);
                    this.f50358m.setOnQueryTextListener(new a());
                    return true;
                }
                if (itemId == a7.f.gb) {
                    a.C0158a c0158a = new a.C0158a(this.f50363r);
                    c0158a.d(a7.e.f12056s1);
                    c0158a.j(this.f50363r.getResources().getString(a7.j.f13132S8), new b());
                    c0158a.g(this.f50363r.getResources().getString(a7.j.f13231d4), new c());
                    c0158a.n();
                    return true;
                }
                if (itemId != a7.f.ib) {
                    if (itemId == a7.f.f12390f && (context = this.f50363r) != null) {
                        w.n0(context);
                    }
                    return false;
                }
                a.C0158a c0158a2 = new a.C0158a(this.f50363r);
                c0158a2.d(a7.e.f12056s1);
                c0158a2.j(this.f50363r.getResources().getString(a7.j.f13132S8), new d());
                c0158a2.g(this.f50363r.getResources().getString(a7.j.f13231d4), new e());
                c0158a2.n();
                return true;
            }
            intent = new Intent(this.f50363r, (Class<?>) SettingsActivity.class);
        }
        startActivity(intent);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }
}
