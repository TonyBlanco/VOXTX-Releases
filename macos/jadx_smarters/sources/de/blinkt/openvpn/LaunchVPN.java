package de.blinkt.openvpn;

import F7.d;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.nst.iptvsmarterstvbox.model.VPNSingleton;
import com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity;
import com.skyfishjy.library.RippleBackground;
import de.blinkt.openvpn.core.B;
import de.blinkt.openvpn.core.C;
import de.blinkt.openvpn.core.EnumC1722e;
import de.blinkt.openvpn.core.F;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.OpenVPNService;
import de.blinkt.openvpn.core.OpenVPNStatusService;
import de.blinkt.openvpn.core.i;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import m7.AbstractC2237a;
import m7.w;
import mbanje.kurt.fabbutton.FabButton;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class LaunchVPN extends androidx.appcompat.app.b implements G.e, G.b, View.OnClickListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static C2858a f39863E;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f39864A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RippleBackground f39865B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f8.l f39868d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f39874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f39875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f39876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f39877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f39878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1725h f39880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public F7.d f39881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f39882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FabButton f39883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g7.l f39884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public J7.a f39885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public L7.a f39886v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PopupWindow f39888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f39889y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f39890z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39869e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39870f = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FileInputStream f39887w = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ServiceConnection f39866C = new j();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ServiceConnection f39867D = new k();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LaunchVPN.this.f39888x.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LaunchVPN.this.f39888x.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f39893a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L7.a f39894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f39895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String[] f39896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ EditText f39897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ EditText f39898g;

        public c(String str, L7.a aVar, String[] strArr, String[] strArr2, EditText editText, EditText editText2) {
            this.f39893a = str;
            this.f39894c = aVar;
            this.f39895d = strArr;
            this.f39896e = strArr2;
            this.f39897f = editText;
            this.f39898g = editText2;
        }

        public final boolean a() {
            Context context;
            Resources resources;
            int i9;
            if (this.f39893a.equals("AUTH_FAILED")) {
                this.f39895d[0] = String.valueOf(this.f39897f.getText());
                this.f39896e[0] = String.valueOf(this.f39898g.getText());
                String str = this.f39895d[0];
                if (str != null && str.equals("")) {
                    context = LaunchVPN.this.f39882r;
                    resources = LaunchVPN.this.f39882r.getResources();
                    i9 = a7.j.f12945A1;
                    Toast.makeText(context, resources.getString(i9), 1).show();
                    return false;
                }
                String str2 = this.f39896e[0];
                if (str2 == null || !str2.equals("")) {
                    String str3 = this.f39895d[0];
                    return (str3 == null || this.f39896e[0] == null || str3.equals("") || this.f39896e[0].equals("")) ? false : true;
                }
            } else {
                this.f39896e[0] = String.valueOf(this.f39898g.getText());
                String str4 = this.f39896e[0];
                if (str4 == null || !str4.equals("")) {
                    String str5 = this.f39896e[0];
                    return (str5 == null || str5.equals("")) ? false : true;
                }
            }
            context = LaunchVPN.this.f39882r;
            resources = LaunchVPN.this.f39882r.getResources();
            i9 = a7.j.f13408v1;
            Toast.makeText(context, resources.getString(i9), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            L7.a aVar;
            String str;
            if (a()) {
                if (this.f39893a.equals("AUTH_FAILED")) {
                    this.f39894c.v(this.f39895d[0]);
                    aVar = this.f39894c;
                    str = this.f39896e[0];
                } else {
                    this.f39894c.v("");
                    aVar = this.f39894c;
                    str = this.f39896e[0];
                }
                aVar.u(str);
                LaunchVPN.this.f39885u.o(this.f39894c);
                LaunchVPN.this.f39888x.dismiss();
                LaunchVPN.this.f39886v = this.f39894c;
                LaunchVPN.this.T1();
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            LaunchVPN.this.finish();
        }
    }

    public class e implements DialogInterface.OnCancelListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            LaunchVPN.this.finish();
        }
    }

    public class f implements DialogInterface.OnDismissListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            LaunchVPN.this.finish();
        }
    }

    public class g implements d.a {
        public g() {
        }

        @Override // F7.d.a
        public void a() {
            LaunchVPN.this.a2();
        }

        @Override // F7.d.a
        public void b(String str) {
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f39904a;

        public h(String str) {
            this.f39904a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39904a.equalsIgnoreCase(LaunchVPN.this.getString(a7.j.f13394t7))) {
                LaunchVPN.this.Z1();
                LaunchVPN launchVPN = LaunchVPN.this;
                launchVPN.Q1(true, launchVPN.getResources().getString(a7.j.f13394t7));
                LaunchVPN.this.f39865B.setVisibility(0);
            } else {
                if (!this.f39904a.equals("USERPAUSE")) {
                    String str = "AUTH_FAILED";
                    if (!this.f39904a.equals("AUTH_FAILED")) {
                        str = "AUTH_FAILED_PRIVATE_KEY";
                        if (!this.f39904a.equals("AUTH_FAILED_PRIVATE_KEY")) {
                            if (this.f39904a.equalsIgnoreCase("Not running") || this.f39904a.equalsIgnoreCase(LaunchVPN.this.getString(a7.j.f13424w7)) || this.f39904a.equalsIgnoreCase("NOPROCESS")) {
                                LaunchVPN.this.c2();
                                LaunchVPN.this.f39884t.c();
                                LaunchVPN.this.Q1(false, "");
                                return;
                            }
                            if (this.f39904a.equalsIgnoreCase("WAIT") || this.f39904a.equalsIgnoreCase("AUTH") || this.f39904a.equalsIgnoreCase("GET_CONFIG") || this.f39904a.equalsIgnoreCase("NONETWORK") || this.f39904a.equalsIgnoreCase("VPN_GENERATE_CONFIG") || this.f39904a.equalsIgnoreCase("RECONNECTING") || this.f39904a.equalsIgnoreCase("RESOLVE") || this.f39904a.equalsIgnoreCase("AUTH_PENDING") || this.f39904a.equalsIgnoreCase("TCP_CONNECT")) {
                                LaunchVPN.this.c2();
                                LaunchVPN launchVPN2 = LaunchVPN.this;
                                launchVPN2.Q1(true, launchVPN2.getResources().getString(a7.j.f13404u7));
                                if (LaunchVPN.this.f39884t.a()) {
                                    return;
                                }
                            } else {
                                LaunchVPN.this.c2();
                                LaunchVPN launchVPN3 = LaunchVPN.this;
                                launchVPN3.Q1(true, launchVPN3.getResources().getString(a7.j.f13404u7));
                                if (LaunchVPN.this.f39884t.a()) {
                                    return;
                                }
                            }
                            LaunchVPN.this.f39884t.b();
                            return;
                        }
                    }
                    LaunchVPN.this.c2();
                    LaunchVPN.this.f39884t.c();
                    LaunchVPN.this.Q1(false, "");
                    LaunchVPN.this.W1(str);
                    return;
                }
                LaunchVPN.this.c2();
                LaunchVPN launchVPN4 = LaunchVPN.this;
                launchVPN4.Q1(true, launchVPN4.getResources().getString(a7.j.f12982D8));
                if (!LaunchVPN.this.f39884t.a()) {
                    return;
                }
            }
            LaunchVPN.this.f39884t.c();
        }
    }

    public class i implements ServiceConnection {
        public i() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC1725h interfaceC1725hA = InterfaceC1725h.a.A(iBinder);
            if (interfaceC1725hA != null) {
                try {
                    interfaceC1725hA.a(false);
                } catch (RemoteException e9) {
                    G.r(e9);
                }
            }
            LaunchVPN.this.unbindService(this);
            if (!LaunchVPN.this.f39884t.a()) {
                LaunchVPN.this.f39884t.b();
            }
            LaunchVPN.this.V1();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class j implements ServiceConnection {
        public j() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LaunchVPN.this.f39880p = InterfaceC1725h.a.A(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LaunchVPN.this.f39880p = null;
        }
    }

    public class k implements ServiceConnection {
        public k() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            de.blinkt.openvpn.core.i iVarA = i.a.A(iBinder);
            try {
                if (LaunchVPN.this.f39871g != null) {
                    iVarA.g0(LaunchVPN.this.f39868d.B(), 3, LaunchVPN.this.f39871g);
                }
                if (LaunchVPN.this.f39872h != null) {
                    iVarA.g0(LaunchVPN.this.f39868d.B(), 2, LaunchVPN.this.f39872h);
                }
                LaunchVPN.this.onActivityResult(70, -1, null);
            } catch (RemoteException e9) {
                e9.printStackTrace();
            }
            LaunchVPN.this.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LaunchVPN.this.f39888x.dismiss();
            G.J("USER_VPN_PASSWORD_CANCELLED", "", a7.j.f13001F7, EnumC1722e.LEVEL_NOTCONNECTED);
            LaunchVPN.this.finish();
        }
    }

    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LaunchVPN.this.f39888x.dismiss();
            G.J("USER_VPN_PASSWORD_CANCELLED", "", a7.j.f13001F7, EnumC1722e.LEVEL_NOTCONNECTED);
            LaunchVPN.this.finish();
        }
    }

    public class n implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L7.a f39911a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String[] f39912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EditText f39913d;

        public n(L7.a aVar, String[] strArr, EditText editText) {
            this.f39911a = aVar;
            this.f39912c = strArr;
            this.f39913d = editText;
        }

        public final boolean a() {
            this.f39912c[0] = String.valueOf(this.f39913d.getText());
            String str = this.f39912c[0];
            if (str == null || !str.equals("")) {
                String str2 = this.f39912c[0];
                return (str2 == null || str2.equals("")) ? false : true;
            }
            Toast.makeText(LaunchVPN.this.f39882r, LaunchVPN.this.f39882r.getResources().getString(a7.j.f13408v1), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a()) {
                this.f39911a.v("");
                this.f39911a.u(this.f39912c[0]);
                LaunchVPN.this.f39885u.o(this.f39911a);
                LaunchVPN.this.f39888x.dismiss();
                LaunchVPN.this.f39872h = this.f39912c[0];
                Intent intent = new Intent(LaunchVPN.this, (Class<?>) OpenVPNStatusService.class);
                LaunchVPN launchVPN = LaunchVPN.this;
                launchVPN.bindService(intent, launchVPN.f39867D, 1);
            }
        }
    }

    public class o implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f39915a;

        public o(String str) {
            this.f39915a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LaunchVPN.this.f39888x != null && LaunchVPN.this.f39888x.isShowing()) {
                LaunchVPN.this.f39888x.dismiss();
            }
            LaunchVPN launchVPN = LaunchVPN.this;
            launchVPN.O1(launchVPN.f39886v, this.f39915a);
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LaunchVPN.this.f39888x == null || !LaunchVPN.this.f39888x.isShowing()) {
                return;
            }
            LaunchVPN.this.f39888x.dismiss();
        }
    }

    public class q implements PopupWindow.OnDismissListener {
        public q() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    private void f1() {
        this.f39882r = this;
        FabButton fabButton = (FabButton) findViewById(a7.f.f12169I2);
        this.f39883s = fabButton;
        this.f39884t = new g7.l(fabButton, this);
        this.f39885u = new J7.a(this.f39882r);
    }

    @Override // de.blinkt.openvpn.core.G.b
    public void E(long j9, long j10, long j11, long j12) {
    }

    public final void M1(int i9) {
        try {
            View viewInflate = ((LayoutInflater) this.f39882r.getSystemService("layout_inflater")).inflate(a7.g.f12796f3, (RelativeLayout) ((Activity) this.f39882r).findViewById(a7.f.Sd));
            PopupWindow popupWindow = new PopupWindow(this.f39882r);
            this.f39888x = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f39888x.setWidth(-1);
            this.f39888x.setHeight(-1);
            this.f39888x.setFocusable(true);
            this.f39888x.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12107C0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this.f39882r));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this.f39882r));
            }
            ((TextView) viewInflate.findViewById(a7.f.jk)).setText("Need Private Key Password");
            EditText editText = (EditText) viewInflate.findViewById(a7.f.pm);
            editText.setVisibility(8);
            EditText editText2 = (EditText) viewInflate.findViewById(a7.f.om);
            TextView textView = (TextView) viewInflate.findViewById(a7.f.f12353b3);
            ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12221N4);
            textView.setText(this.f39882r.getResources().getString(a7.j.f12992E8) + " " + this.f39868d.f40891d);
            if (this.f39882r.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            String[] strArr = {""};
            if (button2 != null) {
                button2.setOnClickListener(new l());
            }
            if (imageView != null) {
                imageView.setOnClickListener(new m());
            }
            if (button != null) {
                button.setOnClickListener(new n(this.f39886v, strArr, editText2));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void N1() {
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, new i(), 1);
    }

    public final void O1(L7.a aVar, String str) {
        new L7.a();
        try {
            View viewInflate = ((LayoutInflater) this.f39882r.getSystemService("layout_inflater")).inflate(a7.g.f12796f3, (RelativeLayout) ((Activity) this.f39882r).findViewById(a7.f.Sd));
            PopupWindow popupWindow = new PopupWindow(this.f39882r);
            this.f39888x = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f39888x.setWidth(-1);
            this.f39888x.setHeight(-1);
            this.f39888x.setFocusable(true);
            this.f39888x.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12107C0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this.f39882r));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this.f39882r));
            }
            EditText editText = (EditText) viewInflate.findViewById(a7.f.pm);
            EditText editText2 = (EditText) viewInflate.findViewById(a7.f.om);
            TextView textView = (TextView) viewInflate.findViewById(a7.f.f12353b3);
            ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12221N4);
            if (str.equals("AUTH_FAILED")) {
                editText.setVisibility(0);
            } else if (str.equals("AUTH_FAILED_PRIVATE_KEY")) {
                editText.setVisibility(8);
            }
            editText.setText(aVar.i());
            editText2.setText(aVar.h());
            textView.setText(this.f39882r.getResources().getString(a7.j.f12992E8) + " " + aVar.e());
            if (this.f39882r.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            String[] strArr = {""};
            String[] strArr2 = {""};
            if (button2 != null) {
                button2.setOnClickListener(new a());
            }
            if (imageView != null) {
                imageView.setOnClickListener(new b());
            }
            if (button != null) {
                button.setOnClickListener(new c(str, aVar, strArr, strArr2, editText, editText2));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void P1(String str) {
        try {
            if (new ProcessBuilder("su", "-c", str).start().waitFor() == 0) {
                this.f39870f = true;
            }
        } catch (IOException | InterruptedException e9) {
            G.s("SU command", e9);
        }
    }

    public void Q1(boolean z9, String str) {
        if (!z9) {
            this.f39890z.setVisibility(8);
            this.f39889y.setVisibility(0);
        } else {
            this.f39890z.setVisibility(0);
            this.f39889y.setVisibility(8);
            this.f39864A.setText(str);
        }
    }

    public final void R1() {
        if (!G.k()) {
            this.f39890z.setVisibility(0);
            this.f39889y.setVisibility(8);
            if (!this.f39884t.a()) {
                this.f39884t.b();
            }
            V1();
            return;
        }
        C.s(this.f39882r);
        InterfaceC1725h interfaceC1725h = this.f39880p;
        if (interfaceC1725h != null) {
            try {
                interfaceC1725h.a(false);
            } catch (RemoteException e9) {
                G.r(e9);
            }
        }
    }

    public void S1() {
        int iC = this.f39868d.c(this);
        if (iC != a7.j.f13291j4) {
            X1(iC);
            return;
        }
        Intent intentPrepare = VpnService.prepare(this);
        SharedPreferences sharedPreferencesA = B.a(this);
        boolean z9 = sharedPreferencesA.getBoolean("useCM9Fix", false);
        if (sharedPreferencesA.getBoolean("loadTunModule", false)) {
            P1("insmod /system/lib/modules/tun.ko");
        }
        if (z9 && !this.f39870f) {
            P1("chown system /dev/tun");
        }
        if (intentPrepare == null) {
            onActivityResult(70, -1, null);
            return;
        }
        G.J("USER_VPN_PERMISSION", "", a7.j.f13011G7, EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT);
        try {
            startActivityForResult(intentPrepare, 70);
        } catch (ActivityNotFoundException unused) {
            G.n(a7.j.f12998F4);
        }
    }

    public void T1() {
        L7.a aVar;
        if (!G.k()) {
            if (!this.f39884t.a()) {
                this.f39884t.b();
            }
            V1();
            return;
        }
        f8.l lVarI = C.i();
        if (lVarI == null || lVarI.f40891d == null || (aVar = this.f39886v) == null || aVar.e() == null || lVarI.f40891d.equals(this.f39886v.e())) {
            return;
        }
        C.s(this.f39882r);
        N1();
    }

    public final void U1(AlertDialog.Builder builder) {
        builder.setOnDismissListener(new f());
    }

    public final void V1() {
        L7.a aVar = this.f39886v;
        if (aVar != null) {
            this.f39878n = aVar.i();
            this.f39877m = this.f39886v.h();
            this.f39875k = this.f39886v.e();
            this.f39876l = this.f39886v.d();
            this.f39879o = this.f39886v.c();
            this.f39887w = null;
            try {
                this.f39887w = new FileInputStream(this.f39876l);
            } catch (FileNotFoundException e9) {
                e9.printStackTrace();
            }
            if (this.f39887w != null) {
                FileInputStream fileInputStream = this.f39887w;
                String str = this.f39875k;
                F7.d dVar = new F7.d(this, fileInputStream, str, this.f39876l, str, new g());
                this.f39881q = dVar;
                dVar.execute(new Void[0]);
                return;
            }
            Toast.makeText(this.f39882r, this.f39875k + " profile not found.", 0).show();
            c2();
            this.f39884t.c();
            Q1(false, "");
        }
    }

    public final void W1(String str) {
        String str2;
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(a7.g.f12685N4, (RelativeLayout) findViewById(a7.f.We));
            PopupWindow popupWindow = new PopupWindow(this);
            this.f39888x = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f39888x.setWidth(-1);
            this.f39888x.setHeight(-1);
            this.f39888x.setFocusable(true);
            this.f39888x.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12422i1);
            TextView textView = (TextView) viewInflate.findViewById(a7.f.nk);
            if (!str.equals("AUTH_FAILED")) {
                str2 = str.equals("AUTH_FAILED_PRIVATE_KEY") ? "Authenticate failed ! Invalid private key password" : "Authenticate failed ! Invalid Username or password";
                Button button2 = (Button) viewInflate.findViewById(a7.f.f12331Z0);
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
                button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
                button2.setOnClickListener(new o(str));
                button.setOnClickListener(new p());
                this.f39888x.setOnDismissListener(new q());
            }
            textView.setText(str2);
            Button button22 = (Button) viewInflate.findViewById(a7.f.f12331Z0);
            button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
            button22.setOnFocusChangeListener(new w.k((View) button22, (Activity) this));
            button22.setOnClickListener(new o(str));
            button.setOnClickListener(new p());
            this.f39888x.setOnDismissListener(new q());
        } catch (Exception unused) {
        }
    }

    public void X1(int i9) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(a7.j.f13367r0);
        builder.setMessage(i9);
        builder.setPositiveButton(R.string.ok, new d());
        builder.setOnCancelListener(new e());
        if (Build.VERSION.SDK_INT >= 22) {
            U1(builder);
        }
        builder.show();
    }

    public final void Y1() {
        this.f39884t.c();
        c2();
        Q1(false, "");
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void Z(String str) {
    }

    public final void Z1() {
        this.f39865B.e();
    }

    public void a2() {
        try {
            b2(C.g(this).j(this.f39875k));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void b2(f8.l lVar) {
        AbstractC2237a.f44506h0 = this.f39878n;
        AbstractC2237a.f44503g0 = this.f39877m;
        AbstractC2237a.f44497e0 = this.f39879o;
        String str = this.f39875k;
        if (str != null && str.contains(".ovpn")) {
            this.f39875k = this.f39875k.replaceAll(".ovpn", "");
        }
        AbstractC2237a.f44500f0 = this.f39875k;
        AbstractC2237a.f44509i0 = this.f39876l;
        AbstractC2237a.f44497e0 = this.f39879o;
        if (B.a(this).getBoolean("clearlogconnect", true)) {
            G.d();
        }
        f8.l lVarC = C.c(this, lVar.A().toString());
        if (lVarC == null) {
            G.n(a7.j.f13185Y6);
            return;
        }
        this.f39868d = lVarC;
        this.f39873i = this.f39878n;
        this.f39874j = this.f39877m;
        S1();
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void c0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
        runOnUiThread(new h(str));
    }

    public final void c2() {
        this.f39865B.f();
        this.f39865B.clearAnimation();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        Intent intent2;
        super.onActivityResult(i9, i10, intent);
        if (i9 == 70) {
            if (i10 != -1) {
                if (i10 == 0) {
                    G.J("USER_VPN_PERMISSION_CANCELLED", "", a7.j.f13021H7, EnumC1722e.LEVEL_NOTCONNECTED);
                    if (Build.VERSION.SDK_INT >= 24) {
                        G.n(a7.j.f13038J4);
                    }
                    Y1();
                    return;
                }
                return;
            }
            f8.l lVar = this.f39868d;
            if (lVar != null) {
                int iH = lVar.H(this.f39872h, this.f39871g);
                if (iH == 0) {
                    G.J("USER_VPN_PASSWORD", "", a7.j.f12991E7, EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT);
                    f8.l lVar2 = this.f39868d;
                    lVar2.f40864B = this.f39873i;
                    String str = this.f39874j;
                    lVar2.f40863A = str;
                    this.f39871g = str;
                    B.a(this);
                    C.u(this, this.f39868d);
                    F.f(this.f39868d, getBaseContext());
                    return;
                }
                if (iH == a7.j.f13009G5) {
                    G.J("USER_VPN_PASSWORD", "", a7.j.f12991E7, EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT);
                    if (this.f39874j.equals("")) {
                        this.f39868d.f40864B = "";
                        M1(iH);
                        return;
                    } else {
                        this.f39868d.f40864B = "";
                        this.f39872h = this.f39874j;
                        intent2 = new Intent(this, (Class<?>) OpenVPNStatusService.class);
                    }
                } else {
                    G.J("USER_VPN_PASSWORD", "", a7.j.f12991E7, EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT);
                    f8.l lVar3 = this.f39868d;
                    lVar3.f40864B = this.f39873i;
                    String str2 = this.f39874j;
                    lVar3.f40863A = str2;
                    this.f39871g = str2;
                    intent2 = new Intent(this, (Class<?>) OpenVPNStatusService.class);
                }
                bindService(intent2, this.f39867D, 1);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == a7.f.yh || id == a7.f.f12205L8 || id == a7.f.f12557v4) {
            startActivity(new Intent(this, (Class<?>) ProfileActivity.class));
        } else if (id == M8.c.f5224a || id == M8.c.f5225b || id == a7.f.f12169I2) {
            R1();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f39882r = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f39882r);
        f39863E = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12640G1 : a7.g.f12634F1);
        w.Y(this);
        this.f39889y = (LinearLayout) findViewById(a7.f.pa);
        this.f39890z = (LinearLayout) findViewById(a7.f.ja);
        this.f39864A = (TextView) findViewById(a7.f.hm);
        this.f39865B = (RippleBackground) findViewById(a7.f.Ld);
        findViewById(a7.f.f12169I2).setOnClickListener(this);
        findViewById(a7.f.yh).setOnClickListener(this);
        findViewById(a7.f.f12205L8).setOnClickListener(this);
        findViewById(a7.f.f12557v4).setOnClickListener(this);
        f1();
        Intent intent = getIntent();
        if (this.f39886v == null) {
            L7.a aVar = (L7.a) intent.getSerializableExtra("vpnProfile");
            this.f39886v = aVar;
            if (aVar == null) {
                this.f39886v = VPNSingleton.getInstance().getProfileData();
            }
            VPNSingleton.getInstance().setProfileData(this.f39886v);
        }
        T1();
        try {
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        ServiceConnection serviceConnection = this.f39866C;
        if (serviceConnection != null) {
            unbindService(serviceConnection);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.z0(this.f39882r);
        G.c(this);
        G.a(this);
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f39866C, 1);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        G.E(this);
        G.C(this);
        super.onStop();
    }
}
