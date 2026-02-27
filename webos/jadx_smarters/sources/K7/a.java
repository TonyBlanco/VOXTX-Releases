package K7;

import a7.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.AlertDialog;
import android.app.ListFragment;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.B;
import de.blinkt.openvpn.core.C;
import de.blinkt.openvpn.core.EnumC1722e;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.OpenVPNService;
import de.blinkt.openvpn.core.k;
import f8.l;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public class a extends ListFragment implements G.e, SeekBar.OnSeekBarChangeListener, RadioGroup.OnCheckedChangeListener, G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SeekBar f3824a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f3825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioGroup f3826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f3827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f3828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f3829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CheckBox f3831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f3832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f3833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorListenerAdapter f3834l = new b();

    /* JADX INFO: renamed from: K7.a$a, reason: collision with other inner class name */
    public class RunnableC0062a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3835a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f3836c;

        public RunnableC0062a(String str, String str2) {
            this.f3835a = str;
            this.f3836c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f3827e.setText(this.f3835a);
            a.this.f3828f.setText(this.f3836c);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f3825c.setVisibility(8);
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f3839a;

        public c(l lVar) {
            this.f3839a = lVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            Intent intent = new Intent(a.this.getActivity(), (Class<?>) LaunchVPN.class);
            intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", this.f3839a.B());
            intent.setAction("android.intent.action.MAIN");
            a.this.startActivity(intent);
        }
    }

    public class d implements AdapterView.OnItemLongClickListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView adapterView, View view, int i9, long j9) {
            ((ClipboardManager) a.this.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Log Entry", ((TextView) view).getText()));
            Toast.makeText(a.this.getActivity(), j.f13427x0, 0).show();
            return true;
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
            B.a(a.this.getActivity()).edit().putBoolean("clearlogconnect", z9).apply();
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3843a;

        public f(String str) {
            this.f3843a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.isAdded()) {
                if (a.this.f3833k != null) {
                    a.this.f3833k.setText(this.f3843a);
                }
                if (a.this.f3829g != null) {
                    a.this.f3829g.setText(this.f3843a);
                }
            }
        }
    }

    public class g implements ListAdapter, G.d, Handler.Callback, G.b, G.e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Handler f3847d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Vector f3845a = new Vector();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Vector f3846c = new Vector();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Vector f3848e = new Vector();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3849f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3850g = 3;

        public g() {
            h();
            if (this.f3847d == null) {
                this.f3847d = new Handler(this);
            }
            G.b(this);
        }

        @Override // de.blinkt.openvpn.core.G.b
        public void E(long j9, long j10, long j11, long j12) {
        }

        @Override // de.blinkt.openvpn.core.G.e
        public void Z(String str) {
        }

        @Override // de.blinkt.openvpn.core.G.d
        public void a(k kVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            Bundle bundle = new Bundle();
            bundle.putParcelable("logmessage", kVar);
            messageObtain.setData(bundle);
            this.f3847d.sendMessage(messageObtain);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return true;
        }

        @Override // de.blinkt.openvpn.core.G.e
        public void c0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
        }

        public final boolean e(k kVar) {
            this.f3845a.add(kVar);
            if (this.f3845a.size() <= 1000) {
                if (kVar.f() > this.f3850g) {
                    return false;
                }
                this.f3846c.add(kVar);
                return true;
            }
            Vector vector = this.f3845a;
            this.f3845a = new Vector(this.f3845a.size());
            for (int i9 = 50; i9 < vector.size(); i9++) {
                this.f3845a.add((k) vector.elementAt(i9));
            }
            g();
            return true;
        }

        public final String f(k kVar, int i9) {
            if (i9 == 0) {
                return "";
            }
            Date date = new Date(kVar.a());
            return (i9 == 2 ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()) : DateFormat.getTimeFormat(a.this.getActivity())).format(date) + " ";
        }

        public final void g() {
            this.f3846c.clear();
            for (k kVar : this.f3845a) {
                int iF = kVar.f();
                int i9 = this.f3850g;
                if (iF <= i9 || i9 == 4) {
                    this.f3846c.add(kVar);
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f3846c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i9) {
            return this.f3846c.get(i9);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i9) {
            return this.f3846c.get(i9).hashCode();
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i9) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i9, View view, ViewGroup viewGroup) {
            TextView textView = view == null ? new TextView(a.this.getActivity()) : (TextView) view;
            k kVar = (k) this.f3846c.get(i9);
            textView.setTextColor(a.this.getActivity().getResources().getColor(a7.c.f11853d));
            String strE = kVar.e(a.this.getActivity());
            String strF = f(kVar, this.f3849f);
            strF.length();
            textView.setText(new SpannableString(strF + strE));
            return textView;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        public final void h() {
            this.f3845a.clear();
            Collections.addAll(this.f3845a, G.j());
            g();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 0) {
                if (e((k) message.getData().getParcelable("logmessage"))) {
                    Iterator it = this.f3848e.iterator();
                    while (it.hasNext()) {
                        ((DataSetObserver) it.next()).onChanged();
                    }
                }
            } else if (i9 == 1) {
                Iterator it2 = this.f3848e.iterator();
                while (it2.hasNext()) {
                    ((DataSetObserver) it2.next()).onInvalidated();
                }
                h();
            } else if (i9 == 2) {
                Iterator it3 = this.f3848e.iterator();
                while (it3.hasNext()) {
                    ((DataSetObserver) it3.next()).onInvalidated();
                }
            } else if (i9 == 3) {
                g();
                Iterator it4 = this.f3848e.iterator();
                while (it4.hasNext()) {
                    ((DataSetObserver) it4.next()).onChanged();
                }
            }
            return true;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public void i(int i9) {
            this.f3850g = i9;
            this.f3847d.sendEmptyMessage(3);
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return this.f3846c.isEmpty();
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i9) {
            return true;
        }

        public void j(int i9) {
            this.f3849f = i9;
            this.f3847d.sendEmptyMessage(2);
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f3848e.add(dataSetObserver);
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f3848e.remove(dataSetObserver);
        }
    }

    @Override // de.blinkt.openvpn.core.G.b
    public void E(long j9, long j10, long j11, long j12) {
        Resources resources = getActivity().getResources();
        String str = String.format("%2$s %1$s", OpenVPNService.y1(j9, false, resources), OpenVPNService.y1(j11 / 2, true, resources));
        String str2 = String.format("%2$s %1$s", OpenVPNService.y1(j10, false, resources), OpenVPNService.y1(j12 / 2, true, resources));
        if (this.f3827e == null || this.f3828f == null || getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new RunnableC0062a(str2, str));
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void Z(String str) {
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void c0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
        if (isAdded()) {
            getActivity().runOnUiThread(new f(G.f(getActivity())));
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getListView().setOnItemLongClickListener(new d());
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i9, int i10, Intent intent) {
        if (i9 == 0 && i10 == -1) {
            l lVarC = C.c(getActivity(), intent.getStringExtra("de.blinkt.openvpn.profileUUID"));
            C.g(getActivity()).o(getActivity(), lVarC);
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(j.f13377s0);
            builder.setMessage(j.f13303k6);
            builder.setPositiveButton(j.f13263g6, new c(lVarC));
            builder.setNegativeButton(j.f13369r2, (DialogInterface.OnClickListener) null);
            builder.create().show();
        }
        super.onActivityResult(i9, i10, intent);
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f3830h = false;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i9) {
        g gVar;
        int i10;
        if (i9 == a7.f.Yc) {
            gVar = this.f3832j;
            i10 = 2;
        } else if (i9 == a7.f.Zc) {
            gVar = this.f3832j;
            i10 = 0;
        } else {
            if (i9 != a7.f.ad) {
                return;
            }
            gVar = this.f3832j;
            i10 = 1;
        }
        gVar.j(i10);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    @Override // android.app.ListFragment, android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K7.a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        G.D(this.f3832j);
        super.onDestroy();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
        this.f3832j.i(i9 + 1);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        new Intent(getActivity(), (Class<?>) OpenVPNService.class).setAction("de.blinkt.openvpn.START_SERVICE");
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        G.c(this);
        G.a(this);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        G.E(this);
        G.C(this);
        getActivity().getPreferences(0).edit().putInt("logtimeformat", this.f3832j.f3849f).putInt("verbositylevel", this.f3832j.f3850g).apply();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.app.ListFragment, android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
