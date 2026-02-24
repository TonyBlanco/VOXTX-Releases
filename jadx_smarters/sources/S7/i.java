package s7;

import D.AbstractC0519b;
import a7.k;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import m7.w;
import q7.a0;

/* JADX INFO: loaded from: classes4.dex */
public class i extends Fragment implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f50386a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f50387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f50388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView.o f50389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f50390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f50391g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Toolbar f50392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f50393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f50394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f50395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f50396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f50397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f50398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f50399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f50400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f50401q;

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
            w.n0(i.this.f50393i);
        }
    }

    public static i z(String str, ArrayList arrayList, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Bundle bundle = new Bundle();
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_ID", str);
        bundle.putString("ACTIVE_LIVE_STREAM_ID", str2);
        bundle.putString("ACTIVE_LIVE_STREAM_NUM", str3);
        bundle.putString("ACTIVE_LIVE_STREAM_NAME", str4);
        bundle.putString("ACTIVE_LIVE_STREAM_ICON", str5);
        bundle.putString("ACTIVE_LIVE_STREAM_CHANNEL_ID", str6);
        bundle.putString("ACTIVE_LIVE_STREAM_CHANNEL_DURATION", str7);
        bundle.putString("ACTIVE_LIVE_STREAM_CHANNEL_URL", str8);
        bundle.putSerializable("LIVE_STREAMS_EPG", arrayList);
        i iVar = new i();
        iVar.setArguments(bundle);
        return iVar;
    }

    public void A() {
        String str;
        this.f50394j = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_ID");
        this.f50395k = getArguments().getString("ACTIVE_LIVE_STREAM_ID");
        this.f50396l = getArguments().getString("ACTIVE_LIVE_STREAM_NUM");
        this.f50397m = getArguments().getString("ACTIVE_LIVE_STREAM_NAME");
        this.f50398n = getArguments().getString("ACTIVE_LIVE_STREAM_ICON");
        this.f50399o = getArguments().getString("ACTIVE_LIVE_STREAM_CHANNEL_ID");
        this.f50400p = getArguments().getString("ACTIVE_LIVE_STREAM_CHANNEL_DURATION");
        this.f50401q = getArguments().getString("ACTIVE_LIVE_STREAM_CHANNEL_URL");
        Serializable serializable = getArguments().getSerializable("LIVE_STREAMS_EPG");
        if (this.f50394j == null || serializable == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) serializable;
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            String start = ((XMLTVProgrammePojo) arrayList.get(i9)).getStart();
            String[] strArrSplit = start.split("\\s+");
            try {
                Long.parseLong(((XMLTVProgrammePojo) arrayList.get(i9)).getStartTimeStamp());
            } catch (NumberFormatException e9) {
                e9.printStackTrace();
            }
            try {
                Long.parseLong(((XMLTVProgrammePojo) arrayList.get(i9)).getEndTimeStamp());
            } catch (NumberFormatException e10) {
                e10.printStackTrace();
            }
            ((XMLTVProgrammePojo) arrayList.get(i9)).getStop();
            start.split("\\s+");
            ((XMLTVProgrammePojo) arrayList.get(i9)).getTitle();
            ((XMLTVProgrammePojo) arrayList.get(i9)).getDesc();
            try {
                str = new SimpleDateFormat("dd MMM yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(strArrSplit[0]));
            } catch (ParseException e11) {
                e11.printStackTrace();
                str = "";
            }
            if (str != null && str.equals(this.f50394j)) {
                arrayList2.add(arrayList.get(i9));
            }
        }
        a0 a0Var = new a0(arrayList2, 0, false, this.f50394j, this.f50395k, this.f50396l, this.f50397m, this.f50398n, this.f50399o, this.f50400p, this.f50401q, getContext());
        this.f50390f = a0Var;
        this.f50386a.setAdapter(a0Var);
        x(1);
    }

    public final void B() {
        this.f50392h = (Toolbar) getActivity().findViewById(a7.f.kh);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f50393i == null || this.f50392h == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f50393i.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f50393i.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f50392h.getChildCount(); i9++) {
            if (this.f50392h.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f50392h.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(a7.g.f12671L2, viewGroup, false);
        this.f50386a = (RecyclerView) viewInflate.findViewById(a7.f.ub);
        this.f50387c = (TextView) viewInflate.findViewById(a7.f.sk);
        this.f50388d = (TextView) viewInflate.findViewById(a7.f.wk);
        AbstractC0519b.d(getActivity());
        setHasOptionsMenu(true);
        B();
        A();
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
            startActivity(new Intent(this.f50393i, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this.f50393i, (Class<?>) SettingsActivity.class));
        }
        if (itemId != a7.f.f12390f || (context = this.f50393i) == null) {
            return false;
        }
        new a.C0158a(context, k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new b()).g(getResources().getString(a7.j.f13231d4), new a()).n();
        return false;
    }

    public final void x(int i9) {
        Context context = getContext();
        this.f50393i = context;
        RecyclerView recyclerView = this.f50386a;
        if (recyclerView == null || context == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f50389e = linearLayoutManager;
        this.f50386a.setLayoutManager(linearLayoutManager);
        this.f50386a.u1(i9);
        this.f50386a.setItemAnimator(new androidx.recyclerview.widget.c());
    }
}
