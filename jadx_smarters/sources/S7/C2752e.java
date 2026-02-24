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

/* JADX INFO: renamed from: s7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2752e extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50311a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f50312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f50313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f50314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f50315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ParentalControlActivitity f50316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public L f50317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView.o f50318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProgressDialog f50319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Typeface f50320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Toolbar f50321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SearchView f50322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LiveStreamDBHandler f50323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50324o = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50325p = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f50326q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f50327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f50328s;

    /* JADX INFO: renamed from: s7.e$a */
    public class a implements SearchView.m {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = C2752e.this.f50315f;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (C2752e.this.f50319j != null) {
                C2752e.this.f50319j.dismiss();
            }
            C2752e c2752e = C2752e.this;
            if (c2752e.f50314e == null || c2752e.f50317h == null) {
                return true;
            }
            C2752e.this.f50314e.setVisibility(8);
            L l9 = C2752e.this.f50317h;
            C2752e c2752e2 = C2752e.this;
            l9.t0(str, c2752e2.f50314e, c2752e2.f50319j);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: s7.e$b */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    /* JADX INFO: renamed from: s7.e$c */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: renamed from: s7.e$d */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    /* JADX INFO: renamed from: s7.e$e, reason: collision with other inner class name */
    public class DialogInterfaceOnClickListenerC0450e implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0450e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    /* JADX INFO: renamed from: s7.e$f */
    public interface f {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
    
        if (r1.getStatus().equals("1") != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A() {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C2752e.A():void");
    }

    private void B() {
        setHasOptionsMenu(true);
        this.f50321l = (Toolbar) getActivity().findViewById(a7.f.kh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof f) {
            this.f50328s = (f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f50311a = getArguments().getString("param1");
            this.f50312c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f50321l.x(a7.h.f12935r);
        TypedValue typedValue = new TypedValue();
        if (this.f50327r.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f50327r.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f50321l.getChildCount(); i9++) {
            if (this.f50321l.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f50321l.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View viewInflate = layoutInflater.inflate(a7.g.f12713S2, viewGroup, false);
        this.f50313d = (RecyclerView) viewInflate.findViewById(a7.f.ub);
        this.f50314e = (TextView) viewInflate.findViewById(a7.f.f12249Q2);
        this.f50315f = (ProgressBar) viewInflate.findViewById(a7.f.ec);
        A();
        B();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f50328s = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        Intent intent;
        if (menuItem.getItemId() == a7.f.Gb) {
            intent = new Intent(this.f50327r, (Class<?>) NewDashboardActivity.class);
        } else {
            if (menuItem.getItemId() != a7.f.Mb) {
                if (menuItem.getItemId() == a7.f.f12400g) {
                    SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
                    this.f50322m = searchView;
                    searchView.setQueryHint(getResources().getString(a7.j.f13453z6));
                    this.f50322m.setIconifiedByDefault(false);
                    this.f50322m.setOnQueryTextListener(new a());
                    return true;
                }
                if (menuItem.getItemId() == a7.f.gb) {
                    a.C0158a c0158a = new a.C0158a(this.f50327r);
                    c0158a.d(a7.e.f12056s1);
                    c0158a.j(this.f50327r.getResources().getString(a7.j.f13132S8), new b());
                    c0158a.g(this.f50327r.getResources().getString(a7.j.f13231d4), new c());
                    c0158a.n();
                    return true;
                }
                if (menuItem.getItemId() != a7.f.ib) {
                    if (menuItem.getItemId() == a7.f.f12390f && (context = this.f50327r) != null) {
                        w.n0(context);
                    }
                    return false;
                }
                a.C0158a c0158a2 = new a.C0158a(this.f50327r);
                c0158a2.d(a7.e.f12056s1);
                c0158a2.j(this.f50327r.getResources().getString(a7.j.f13132S8), new d());
                c0158a2.g(this.f50327r.getResources().getString(a7.j.f13231d4), new DialogInterfaceOnClickListenerC0450e());
                c0158a2.n();
                return true;
            }
            intent = new Intent(this.f50327r, (Class<?>) SettingsActivity.class);
        }
        startActivity(intent);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }
}
