package q7;

import D.AbstractC0519b;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.model.MultiUserDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.MultiUserActivity;
import g7.f;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import k.U;
import m7.AbstractC2237a;
import m7.w;
import net.orandja.shadowlayout.ShadowLayout;
import pl.droidsonroids.gif.GifImageView;
import u7.C2858a;
import y0.C2981b;

/* JADX INFO: loaded from: classes4.dex */
public class F extends RecyclerView.g {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static PopupWindow f47120Q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public EditText f47121A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Button f47122B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public EditText f47123C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public EditText f47124D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f47125E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public RadioButton f47126F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public RadioButton f47127G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public RadioGroup f47128H;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C2858a f47131K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f47132L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MultiUserDBModel f47137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f47138e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f47140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f47141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LiveStreamDBHandler f47142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MultiUserDBHandler f47143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MultiUserActivity f47144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f47145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f47146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f47147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f47148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f47149p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SharedPreferences.Editor f47152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences f47153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences f47154u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SharedPreferences.Editor f47155v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Button f47157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Button f47158y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f47159z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47139f = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f47150q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f47151r = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f47156w = "";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f47129I = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f47130J = "";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f47134N = "";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f47135O = "";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f47136P = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Handler f47133M = new Handler();

    public class a implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47160a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g f47164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f47165g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f47166h;

        public a(String str, String str2, String str3, String str4, g gVar, int i9, int i10) {
            this.f47160a = str;
            this.f47161c = str2;
            this.f47162d = str3;
            this.f47163e = str4;
            this.f47164f = gVar;
            this.f47165g = i9;
            this.f47166h = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            F f9 = F.this;
            String str = this.f47160a;
            f9.f47146m = str;
            String str2 = this.f47161c;
            f9.f47147n = str2;
            String str3 = this.f47162d;
            f9.f47148o = str3;
            String str4 = this.f47163e;
            f9.f47149p = str4;
            f9.q1(this.f47164f, this.f47165g, str, this.f47166h, view, str2, str3, str4);
            return true;
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47168a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f47172f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MultiUserDBModel f47173g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f47174h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f47175i;

        public b(String str, String str2, String str3, String str4, int i9, MultiUserDBModel multiUserDBModel, String str5, int i10) {
            this.f47168a = str;
            this.f47169c = str2;
            this.f47170d = str3;
            this.f47171e = str4;
            this.f47172f = i9;
            this.f47173g = multiUserDBModel;
            this.f47174h = str5;
            this.f47175i = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            F f9 = F.this;
            f9.f47152s = f9.f47153t.edit();
            F.this.f47155v.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f47168a);
            F.this.f47155v.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, this.f47169c);
            F.this.f47155v.putString(AbstractC2237a.f44454L, this.f47170d);
            F.this.f47155v.putString("activationCode", "");
            F.this.f47155v.putString("loginWith", "loginWithDetails");
            F.this.f47155v.apply();
            F f10 = F.this;
            f10.f47146m = this.f47171e;
            f10.f47147n = this.f47168a;
            f10.f47148o = this.f47169c;
            f10.f47149p = this.f47170d;
            f10.f47150q = this.f47172f;
            f10.f47152s.putString(AbstractC2237a.f44454L, this.f47170d);
            F.this.f47152s.apply();
            String m3uType = this.f47173g.getM3uType();
            if ((m3uType != null && m3uType.equals(TransferTable.COLUMN_FILE)) || (m3uType != null && m3uType.equals("url"))) {
                F.this.f47145l = "m3u";
            } else if (this.f47174h.equals("onestream_api")) {
                F.this.f47145l = "onestream_api";
            } else {
                F.this.f47145l = "api";
            }
            try {
                if (F.this.f47145l.equalsIgnoreCase("api")) {
                    SharepreferenceDBHandler.setCurrentAPPType("api", F.this.f47140g);
                    m7.z zVar = new m7.z(F.this.f47140g, F.this.f47144k);
                    F f11 = F.this;
                    zVar.u(f11.f47146m, f11.f47147n, f11.f47148o, f11.f47149p, false, false);
                    zVar.A();
                    SharepreferenceDBHandler.setUserID(this.f47175i, F.this.f47140g);
                } else {
                    if (F.this.f47145l.equalsIgnoreCase("m3u")) {
                        SharepreferenceDBHandler.setCurrentAPPType("m3u", F.this.f47140g);
                        SharepreferenceDBHandler.setUserID(this.f47175i, F.this.f47140g);
                        m7.f fVar = new m7.f(F.this.f47140g, F.this.f47144k);
                        if (!this.f47173g.getM3uType().equals(TransferTable.COLUMN_FILE)) {
                            fVar.o(false, "url", F.this.f47149p, this.f47171e);
                        } else {
                            if (!new File(F.this.f47149p).exists()) {
                                Toast.makeText(F.this.f47140g, F.this.f47140g.getResources().getString(a7.j.f13260g3), 0).show();
                                return;
                            }
                            fVar.o(false, TransferTable.COLUMN_FILE, F.this.f47149p, this.f47171e);
                        }
                        fVar.t();
                        return;
                    }
                    if (!F.this.f47145l.equalsIgnoreCase("onestream_api")) {
                        return;
                    }
                    SharepreferenceDBHandler.setCurrentAPPType("onestream_api", F.this.f47140g);
                    SharepreferenceDBHandler.setUserID(this.f47175i, F.this.f47140g);
                    m7.h hVar = new m7.h(F.this.f47140g, F.this.f47144k);
                    F f12 = F.this;
                    hVar.s(f12.f47146m, f12.f47147n, f12.f47148o, f12.f47149p, false, false);
                    hVar.v();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public class c implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f47178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f47181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f47182f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g f47183g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ MultiUserDBModel f47184h;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                F.f47120Q.dismiss();
            }
        }

        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SeriesRecentWatchDatabase seriesRecentWatchDatabase;
                if (F.this.f47140g != null) {
                    SharedPreferences sharedPreferences = F.this.f47140g.getSharedPreferences("loginprefsmultiuser", 0);
                    String string = sharedPreferences.getString("name", "");
                    String string2 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                    String string3 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
                    String string4 = sharedPreferences.getString(AbstractC2237a.f44454L, "");
                    c cVar = c.this;
                    String str = cVar.f47177a;
                    if (str != null && cVar.f47178b != null && cVar.f47179c != null && cVar.f47180d != null && str.equals(string) && c.this.f47180d.contains(string4) && c.this.f47178b.equals(string2) && c.this.f47179c.equals(string3)) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.clear();
                        editorEdit.apply();
                        SharedPreferences.Editor editorEdit2 = F.this.f47140g.getSharedPreferences("loginPrefs", 0).edit();
                        editorEdit2.clear();
                        editorEdit2.apply();
                    }
                    if (F.this.f47145l.equals("m3u")) {
                        F.this.f47142i.makeEmptyAllTablesRecordsM3U(c.this.f47181e);
                        LiveStreamDBHandler liveStreamDBHandler = F.this.f47142i;
                        c cVar2 = c.this;
                        liveStreamDBHandler.deletePasswordDataForUser(cVar2.f47181e, F.this.f47145l);
                        LiveStreamDBHandler liveStreamDBHandler2 = F.this.f47142i;
                        c cVar3 = c.this;
                        liveStreamDBHandler2.deleteImportStatusForUser(cVar3.f47181e, F.this.f47145l);
                        LiveStreamDBHandler liveStreamDBHandler3 = F.this.f47142i;
                        c cVar4 = c.this;
                        liveStreamDBHandler3.deleteAllEPGSources(cVar4.f47181e, F.this.f47145l);
                        LiveStreamDBHandler liveStreamDBHandler4 = F.this.f47142i;
                        c cVar5 = c.this;
                        liveStreamDBHandler4.deleteALLLiveRecentlyWatched(cVar5.f47181e, F.this.f47145l);
                        F.this.f47143j.deleteUserM3U(c.this.f47181e);
                        LiveStreamDBHandler liveStreamDBHandler5 = F.this.f47142i;
                        c cVar6 = c.this;
                        liveStreamDBHandler5.makeEmptyEPGWithSourceRef(cVar6.f47181e, F.this.f47145l);
                    } else {
                        if (F.this.f47145l.equals("onestream_api")) {
                            new DatabaseHandler(F.this.f47140g).deleteDataForUser(c.this.f47181e);
                            new RecentWatchDBHandler(F.this.f47140g).deletRecentWatchForThisUser(c.this.f47181e);
                            LiveStreamDBHandler liveStreamDBHandler6 = new LiveStreamDBHandler(F.this.f47140g);
                            liveStreamDBHandler6.deleteALLRecentwatch("movie", c.this.f47181e);
                            c cVar7 = c.this;
                            liveStreamDBHandler6.deletePasswordDataForUser(cVar7.f47181e, F.this.f47145l);
                            c cVar8 = c.this;
                            liveStreamDBHandler6.deleteImportStatusForUser(cVar8.f47181e, F.this.f47145l);
                            c cVar9 = c.this;
                            liveStreamDBHandler6.deleteAllEPGSources(cVar9.f47181e, F.this.f47145l);
                            c cVar10 = c.this;
                            liveStreamDBHandler6.makeEmptyEPGWithSourceRef(cVar10.f47181e, F.this.f47145l);
                            seriesRecentWatchDatabase = new SeriesRecentWatchDatabase(F.this.f47140g);
                        } else {
                            new DatabaseHandler(F.this.f47140g).deleteDataForUser(c.this.f47181e);
                            new RecentWatchDBHandler(F.this.f47140g).deletRecentWatchForThisUser(c.this.f47181e);
                            LiveStreamDBHandler liveStreamDBHandler7 = new LiveStreamDBHandler(F.this.f47140g);
                            c cVar11 = c.this;
                            liveStreamDBHandler7.deleteALLLiveRecentlyWatched(cVar11.f47181e, F.this.f47145l);
                            c cVar12 = c.this;
                            liveStreamDBHandler7.deletePasswordDataForUser(cVar12.f47181e, F.this.f47145l);
                            c cVar13 = c.this;
                            liveStreamDBHandler7.deleteImportStatusForUser(cVar13.f47181e, F.this.f47145l);
                            c cVar14 = c.this;
                            liveStreamDBHandler7.deleteAllEPGSources(cVar14.f47181e, F.this.f47145l);
                            c cVar15 = c.this;
                            liveStreamDBHandler7.makeEmptyEPGWithSourceRef(cVar15.f47181e, F.this.f47145l);
                            seriesRecentWatchDatabase = new SeriesRecentWatchDatabase(F.this.f47140g);
                        }
                        seriesRecentWatchDatabase.deleteALLSeriesRecentwatch();
                        F.this.f47143j.deleteUserAPI(c.this.f47181e);
                    }
                    F.this.f47141h.remove(c.this.f47182f);
                    c cVar16 = c.this;
                    F.this.B(cVar16.f47182f);
                    c cVar17 = c.this;
                    F f9 = F.this;
                    f9.A(cVar17.f47182f, f9.f47141h.size());
                    F.this.w();
                    Toast.makeText(F.this.f47140g, F.this.f47140g.getResources().getString(a7.j.f13066M2) + "  " + c.this.f47177a, 0).show();
                    F.f47120Q.dismiss();
                }
            }
        }

        public c(String str, String str2, String str3, String str4, int i9, int i10, g gVar, MultiUserDBModel multiUserDBModel) {
            this.f47177a = str;
            this.f47178b = str2;
            this.f47179c = str3;
            this.f47180d = str4;
            this.f47181e = i9;
            this.f47182f = i10;
            this.f47183g = gVar;
            this.f47184h = multiUserDBModel;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() == a7.f.f12159H2) {
                if (F.this.f47140g != null) {
                    View viewInflate = ((LayoutInflater) F.this.f47144k.getSystemService("layout_inflater")).inflate(a7.g.f12867r2, (RelativeLayout) F.this.f47144k.findViewById(a7.f.We));
                    PopupWindow unused = F.f47120Q = new PopupWindow(F.this.f47144k);
                    F.f47120Q.setContentView(viewInflate);
                    F.f47120Q.setWidth(-1);
                    F.f47120Q.setHeight(-1);
                    F.f47120Q.setFocusable(true);
                    F.f47120Q.showAtLocation(viewInflate, 17, 0, 0);
                    TextView textView = (TextView) viewInflate.findViewById(a7.f.Ai);
                    Button button = (Button) viewInflate.findViewById(a7.f.f12197L0);
                    Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
                    if (textView != null) {
                        textView.setText(F.this.f47140g.getResources().getString(a7.j.f13034J0));
                    }
                    if (button != null) {
                        button.setOnFocusChangeListener(new w.k((View) button, F.this.f47144k));
                    }
                    if (button2 != null) {
                        button2.setOnFocusChangeListener(new w.k((View) button2, F.this.f47144k));
                    }
                    button2.setOnClickListener(new a());
                    if (button != null) {
                        button.setOnClickListener(new b());
                    }
                }
            } else if (menuItem.getItemId() == a7.f.Wa) {
                this.f47183g.f47203u.performClick();
            } else if (menuItem.getItemId() == a7.f.f12229O2) {
                if (F.this.f47145l.equals("m3u")) {
                    F f9 = F.this;
                    f9.f1(this.f47183g, f9.f47145l, f9.f47141h, this.f47182f, this.f47181e);
                } else if (F.this.f47145l.equals("onestream_api")) {
                    F f10 = F.this;
                    f10.g1(this.f47183g, f10.f47144k, this.f47184h.getname(), this.f47184h.getusername(), this.f47184h.getpassword(), this.f47184h.getmagportal(), "onestream_api", this.f47181e, this.f47182f);
                } else {
                    F f11 = F.this;
                    f11.g1(this.f47183g, f11.f47144k, this.f47184h.getname(), this.f47184h.getusername(), this.f47184h.getpassword(), this.f47184h.getmagportal(), "api", this.f47181e, this.f47182f);
                }
            }
            return false;
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            F.f47120Q.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ EditText f47189a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditText f47190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EditText f47191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f47192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Activity f47193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f47195h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47196i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47197j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ g f47198k;

        public e(EditText editText, EditText editText2, EditText editText3, EditText editText4, Activity activity, String str, int i9, String str2, String str3, g gVar) {
            this.f47189a = editText;
            this.f47190c = editText2;
            this.f47191d = editText3;
            this.f47192e = editText4;
            this.f47193f = activity;
            this.f47194g = str;
            this.f47195h = i9;
            this.f47196i = str2;
            this.f47197j = str3;
            this.f47198k = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            Resources resources;
            int i9;
            String string = this.f47189a.getText().toString();
            String string2 = this.f47190c.getText().toString();
            String string3 = this.f47191d.getText().toString();
            String string4 = this.f47192e.getText().toString();
            if (string != null && string.trim().isEmpty()) {
                activity = this.f47193f;
                resources = F.this.f47140g.getResources();
                i9 = a7.j.f13328n1;
            } else if (string2 != null && string2.trim().isEmpty()) {
                activity = this.f47193f;
                resources = F.this.f47140g.getResources();
                i9 = a7.j.f13382s5;
            } else if (string3 != null && string3.trim().isEmpty()) {
                activity = this.f47193f;
                resources = F.this.f47140g.getResources();
                i9 = a7.j.f13352p5;
            } else {
                if (!AbstractC2237a.f44526o.booleanValue() || string4 == null || !string4.trim().isEmpty()) {
                    if (!string4.startsWith("http://") && !string4.startsWith("https://")) {
                        string4 = "http://" + string4;
                    }
                    if (!string4.endsWith("/")) {
                        string4 = string4 + "/";
                    }
                    String str = string4;
                    F.this.f47136P = string;
                    F.this.f47134N = string2;
                    F.this.f47135O = string3;
                    AbstractC2237a.f44482Z = str;
                    boolean zCheckregistrationForMultiuserAapter = F.this.f47143j.checkregistrationForMultiuserAapter(string, string2, string3, AbstractC2237a.f44482Z, this.f47194g, "", "", str);
                    try {
                        if (this.f47194g.equalsIgnoreCase("onestream_api")) {
                            SharepreferenceDBHandler.setCurrentAPPType("onestream_api", F.this.f47140g);
                            F f9 = F.this;
                            f9.f47152s = f9.f47153t.edit();
                            F.this.f47155v.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, string2);
                            F.this.f47155v.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, string3);
                            F.this.f47155v.putString(AbstractC2237a.f44454L, str);
                            F.this.f47155v.putString("activationCode", "");
                            F.this.f47155v.putString("loginWith", "loginWithDetails");
                            F.this.f47155v.apply();
                            F f10 = F.this;
                            f10.f47153t = f10.f47140g.getSharedPreferences("loginPrefsserverurl", 0);
                            F.this.f47152s.putString(AbstractC2237a.f44454L, str);
                            F.this.f47152s.apply();
                            if (F.this.f47140g != null) {
                                SharepreferenceDBHandler.setCurrentAPPType("onestream_api", F.this.f47140g);
                                F f11 = F.this;
                                f11.f47146m = string;
                                f11.f47147n = string2;
                                f11.f47148o = string3;
                                f11.f47149p = AbstractC2237a.f44482Z;
                            }
                            SharepreferenceDBHandler.setCurrentAPPType("onestream_api", F.this.f47140g);
                            m7.h hVar = new m7.h(F.this.f47140g, this.f47193f);
                            F f12 = F.this;
                            hVar.s(f12.f47146m, f12.f47147n, f12.f47148o, f12.f47149p, true, false);
                            hVar.v();
                            SharepreferenceDBHandler.setUserID(this.f47195h, F.this.f47140g);
                            return;
                        }
                        SharepreferenceDBHandler.setCurrentAPPType("api", F.this.f47140g);
                        if (zCheckregistrationForMultiuserAapter) {
                            Toast.makeText(F.this.f47140g, "User Already Exists ", 0).show();
                            this.f47198k.f47203u.performClick();
                            return;
                        }
                        F f13 = F.this;
                        f13.f47152s = f13.f47153t.edit();
                        F.this.f47155v.putString("name", string);
                        F.this.f47155v.putString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, string2);
                        F.this.f47155v.putString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, string3);
                        F.this.f47155v.putString(AbstractC2237a.f44454L, str);
                        F.this.f47155v.putString("activationCode", "");
                        F.this.f47155v.putString("loginWith", "loginWithDetails");
                        F.this.f47155v.apply();
                        F f14 = F.this;
                        f14.f47153t = f14.f47140g.getSharedPreferences("loginPrefsserverurl", 0);
                        F.this.f47152s.putString(AbstractC2237a.f44454L, str);
                        F.this.f47152s.apply();
                        if (F.this.f47140g != null) {
                            SharepreferenceDBHandler.setCurrentAPPType("api", F.this.f47140g);
                            SharepreferenceDBHandler.setUserID(this.f47195h, F.this.f47140g);
                            m7.z zVar = new m7.z(F.this.f47140g, this.f47193f);
                            if (string2.equalsIgnoreCase(this.f47196i) && string3.equalsIgnoreCase(this.f47197j)) {
                                zVar.u(F.this.f47136P, F.this.f47134N, F.this.f47135O, str, true, false);
                            } else {
                                zVar.u(F.this.f47136P, F.this.f47134N, F.this.f47135O, str, true, true);
                            }
                            zVar.A();
                            return;
                        }
                        return;
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        return;
                    }
                }
                activity = this.f47193f;
                resources = F.this.f47140g.getResources();
                i9 = a7.j.f13362q5;
            }
            Toast.makeText(activity, resources.getString(i9), 0).show();
        }
    }

    public class f implements f.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f47200a;

        public f(String[] strArr) {
            this.f47200a = strArr;
        }

        @Override // g7.f.g
        public void a(String str) {
            F.this.f47129I = str;
            this.f47200a[0] = str;
            F.this.f47123C.setText(str);
            F.this.f47125E.setVisibility(8);
            F.this.f47159z.setVisibility(0);
            F.this.f47159z.setText(str);
        }
    }

    public static class g extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47202t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f47203u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f47204v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f47205w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public GifImageView f47206x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ShadowLayout f47207y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public FrameLayout f47208z;

        public g(View view) {
            super(view);
            this.f47202t = (TextView) view.findViewById(a7.f.fk);
            this.f47203u = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f47204v = (RelativeLayout) view.findViewById(a7.f.Wg);
            this.f47205w = (ImageView) view.findViewById(a7.f.f12282T5);
            this.f47206x = (GifImageView) view.findViewById(a7.f.f12415h4);
            this.f47207y = (ShadowLayout) view.findViewById(a7.f.eg);
            this.f47208z = (FrameLayout) view.findViewById(a7.f.mf);
            J(false);
        }
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GifImageView f47210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ShadowLayout f47212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final FrameLayout f47213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f47214f;

        public class a implements C2981b.d {

            /* JADX INFO: renamed from: q7.F$h$a$a, reason: collision with other inner class name */
            public class RunnableC0415a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C2981b f47217a;

                public RunnableC0415a(C2981b c2981b) {
                    this.f47217a = c2981b;
                }

                @Override // java.lang.Runnable
                public void run() {
                    h.this.f47212d.setShadow_color(this.f47217a.f(1));
                    Drawable background = F.this.f47138e.getBackground();
                    ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(F.this.f47138e, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0), Integer.valueOf(this.f47217a.f(1)));
                    objectAnimatorOfObject.setDuration(200L);
                    objectAnimatorOfObject.start();
                }
            }

            public a() {
            }

            @Override // y0.C2981b.d
            public void a(C2981b c2981b) {
                F.this.f47133M.postDelayed(new RunnableC0415a(c2981b), 200L);
            }
        }

        public h(View view, GifImageView gifImageView, int i9, ShadowLayout shadowLayout, FrameLayout frameLayout, int i10) {
            this.f47209a = view;
            this.f47210b = gifImageView;
            this.f47211c = i9;
            this.f47212d = shadowLayout;
            this.f47213e = frameLayout;
            this.f47214f = i10;
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47209a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47213e, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
        }

        public final void d(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47209a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
        }

        public final void e(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47213e, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            F.this.f47133M.removeCallbacksAndMessages(null);
            if (!z9) {
                try {
                    new pl.droidsonroids.gif.a(F.this.f47140g.getAssets(), "gif_testing.gif");
                    this.f47210b.setImageDrawable(null);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                this.f47212d.setShadow_color(0);
                b(1.0f);
                d(1.0f);
                c(1.0f);
                e(1.0f);
                this.f47213e.setElevation(0.0f);
                return;
            }
            b(0.77f);
            d(0.77f);
            c(1.33f);
            e(1.33f);
            this.f47213e.setElevation(5.0f);
            try {
                this.f47210b.setImageDrawable(new pl.droidsonroids.gif.a(F.this.f47140g.getAssets(), "gif_testing.gif"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                C2981b.b(BitmapFactory.decodeResource(F.this.f47140g.getResources(), this.f47211c)).a(new a());
            } catch (Exception e11) {
                Log.e("honey", "onGenerated error: " + e11.getMessage());
            }
        }
    }

    public F(MultiUserActivity multiUserActivity, List list, Context context, String str, MultiUserDBModel multiUserDBModel, LinearLayout linearLayout) {
        this.f47137d = multiUserDBModel;
        this.f47141h = list;
        this.f47144k = multiUserActivity;
        this.f47140g = context;
        this.f47132L = str;
        this.f47143j = new MultiUserDBHandler(context);
        this.f47138e = linearLayout;
        this.f47142i = new LiveStreamDBHandler(context);
        this.f47131K = new C2858a(context);
    }

    public static /* synthetic */ void l1(View view) {
        f47120Q.dismiss();
    }

    public void e1() {
        g7.f fVar = new g7.f(this.f47140g, new f(new String[]{""}));
        if (Build.VERSION.SDK_INT >= 30) {
            fVar.v("");
        } else {
            fVar.u("");
        }
    }

    public final void f1(g gVar, String str, final List list, final int i9, final int i10) {
        try {
            View viewInflate = ((LayoutInflater) this.f47140g.getSystemService("layout_inflater")).inflate(a7.g.f12605A2, (RelativeLayout) this.f47144k.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(this.f47140g);
            f47120Q = popupWindow;
            popupWindow.setContentView(viewInflate);
            f47120Q.setWidth(-1);
            f47120Q.setHeight(-1);
            f47120Q.setFocusable(true);
            f47120Q.showAtLocation(viewInflate, 17, 0, 0);
            this.f47157x = (Button) viewInflate.findViewById(a7.f.f12517r4);
            this.f47158y = (Button) viewInflate.findViewById(a7.f.zf);
            this.f47121A = (EditText) viewInflate.findViewById(a7.f.f12424i3);
            this.f47126F = (RadioButton) viewInflate.findViewById(a7.f.kd);
            this.f47123C = (EditText) viewInflate.findViewById(a7.f.f12394f3);
            this.f47127G = (RadioButton) viewInflate.findViewById(a7.f.nd);
            this.f47124D = (EditText) viewInflate.findViewById(a7.f.f12384e3);
            this.f47125E = (TextView) viewInflate.findViewById(a7.f.Nh);
            this.f47159z = (TextView) viewInflate.findViewById(a7.f.pj);
            this.f47122B = (Button) viewInflate.findViewById(a7.f.f12431j0);
            this.f47128H = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            this.f47121A.setText(((MultiUserDBModel) list.get(i9)).getname());
            String m3uType = ((MultiUserDBModel) list.get(i9)).getM3uType();
            if (m3uType != null && m3uType.equals(TransferTable.COLUMN_FILE)) {
                this.f47159z.setVisibility(0);
                this.f47122B.setVisibility(0);
                this.f47124D.setVisibility(8);
                this.f47125E.setVisibility(8);
                this.f47159z.setText(((MultiUserDBModel) list.get(i9)).getmagportal());
                this.f47126F.setChecked(true);
                this.f47127G.setVisibility(8);
                this.f47126F.setVisibility(0);
            } else if (m3uType != null && m3uType.equals("url")) {
                this.f47127G.setChecked(true);
                this.f47159z.setVisibility(8);
                this.f47122B.setVisibility(8);
                this.f47125E.setVisibility(8);
                this.f47124D.setVisibility(0);
                this.f47124D.setText(((MultiUserDBModel) list.get(i9)).getmagportal());
                this.f47127G.setVisibility(0);
                this.f47126F.setVisibility(8);
            }
            this.f47126F.setOnClickListener(new View.OnClickListener() { // from class: q7.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47113a.i1(view);
                }
            });
            this.f47127G.setOnClickListener(new View.OnClickListener() { // from class: q7.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47114a.j1(view);
                }
            });
            this.f47122B.setOnClickListener(new View.OnClickListener() { // from class: q7.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47115a.k1(view);
                }
            });
            this.f47158y.setOnClickListener(new View.OnClickListener() { // from class: q7.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    F.l1(view);
                }
            });
            this.f47157x.setOnClickListener(new View.OnClickListener() { // from class: q7.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47116a.m1(i10, list, i9, view);
                }
            });
        } catch (NullPointerException e9) {
            e = e9;
            e.printStackTrace();
        } catch (Exception e10) {
            e = e10;
            e.printStackTrace();
        }
    }

    public final void g1(g gVar, Activity activity, String str, String str2, String str3, String str4, String str5, int i9, int i10) {
        EditText editText;
        EditText editText2;
        try {
            SharepreferenceDBHandler.setUserID(i9, this.f47140g);
            View viewInflate = ((LayoutInflater) this.f47140g.getSystemService("layout_inflater")).inflate(a7.g.f12611B2, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(this.f47140g);
            f47120Q = popupWindow;
            popupWindow.setContentView(viewInflate);
            f47120Q.setWidth(-1);
            f47120Q.setHeight(-1);
            f47120Q.setFocusable(true);
            f47120Q.showAtLocation(viewInflate, 17, 0, 0);
            this.f47157x = (Button) viewInflate.findViewById(a7.f.f12097B0);
            this.f47158y = (Button) viewInflate.findViewById(a7.f.f12482o0);
            EditText editText3 = (EditText) viewInflate.findViewById(a7.f.Bh);
            EditText editText4 = (EditText) viewInflate.findViewById(a7.f.jm);
            EditText editText5 = (EditText) viewInflate.findViewById(a7.f.Jk);
            EditText editText6 = (EditText) viewInflate.findViewById(a7.f.Gl);
            if (AbstractC2237a.f44526o.booleanValue()) {
                editText6.setVisibility(0);
            } else {
                editText6.setVisibility(8);
            }
            r1(str, str2, str3, str4, editText3, editText4, editText5, editText6);
            if (this.f47140g.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText3.setGravity(21);
                editText4.setGravity(21);
                editText2 = editText5;
                editText2.setGravity(21);
                editText = editText6;
                editText.setGravity(21);
            } else {
                editText = editText6;
                editText2 = editText5;
            }
            this.f47158y.setOnClickListener(new d());
            this.f47157x.setOnClickListener(new e(editText3, editText4, editText2, editText, activity, str5, i9, str2, str3, gVar));
        } catch (NullPointerException e9) {
            e = e9;
            e.printStackTrace();
        } catch (Exception e10) {
            e = e10;
            e.printStackTrace();
        }
    }

    public boolean h1() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        if (i9 >= 33) {
            return true;
        }
        if (this.f47140g.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            Log.v("TAG", "Permission is granted");
            return true;
        }
        Log.v("TAG", "Permission is revoked");
        AbstractC0519b.h((Activity) this.f47140g, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        return false;
    }

    public final /* synthetic */ void i1(View view) {
        this.f47159z.setVisibility(0);
        this.f47122B.setVisibility(0);
        this.f47124D.setVisibility(8);
        this.f47125E.setVisibility(8);
        String str = this.f47129I;
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f47159z.setText(this.f47129I);
    }

    public final /* synthetic */ void j1(View view) {
        this.f47127G.setChecked(true);
        this.f47159z.setVisibility(8);
        this.f47122B.setVisibility(8);
        this.f47125E.setVisibility(8);
        this.f47124D.setVisibility(0);
        String string = this.f47124D.getText().toString();
        this.f47130J = string;
        if (string.isEmpty()) {
            return;
        }
        this.f47124D.setText(this.f47130J);
    }

    public final /* synthetic */ void k1(View view) {
        if (h1()) {
            e1();
        } else {
            Context context = this.f47140g;
            Toast.makeText(context, context.getResources().getString(a7.j.f13222c5), 1).show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0370  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void m1(int r22, java.util.List r23, int r24, android.view.View r25) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.F.m1(int, java.util.List, int, android.view.View):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47141h.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void n1(android.view.View r3) {
        /*
            r2 = this;
            java.lang.Boolean r3 = m7.AbstractC2237a.f44526o
            boolean r3 = r3.booleanValue()
            java.lang.Class<com.nst.iptvsmarterstvbox.view.activity.RoutingActivity> r0 = com.nst.iptvsmarterstvbox.view.activity.RoutingActivity.class
            if (r3 == 0) goto L18
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r1 = r2.f47140g
            r3.<init>(r1, r0)
        L11:
            android.content.Context r0 = r2.f47140g
            r0.startActivity(r3)
            goto Lc4
        L18:
            java.lang.Boolean r3 = m7.AbstractC2237a.f44529p
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3d
            java.lang.Boolean r3 = m7.AbstractC2237a.f44538t
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3d
            java.lang.Boolean r3 = m7.AbstractC2237a.f44534r
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3d
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r1 = r2.f47140g
            r3.<init>(r1, r0)
        L37:
            android.content.Context r1 = r2.f47140g
            r1.startActivity(r3)
            goto L55
        L3d:
            java.lang.Boolean r3 = m7.AbstractC2237a.f44529p
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L55
            java.lang.Boolean r3 = m7.AbstractC2237a.f44532q
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L55
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r1 = r2.f47140g
            r3.<init>(r1, r0)
            goto L37
        L55:
            java.lang.Boolean r3 = m7.AbstractC2237a.f44532q
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L71
            java.lang.Boolean r3 = m7.AbstractC2237a.f44534r
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L71
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r1 = r2.f47140g
            r3.<init>(r1, r0)
            android.content.Context r1 = r2.f47140g
            r1.startActivity(r3)
        L71:
            java.lang.Boolean r3 = m7.AbstractC2237a.f44529p
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto Lbb
            java.lang.Boolean r3 = m7.AbstractC2237a.f44534r
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L82
            goto Lbb
        L82:
            java.lang.Boolean r3 = m7.AbstractC2237a.f44529p
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L95
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.f47140g
            java.lang.Class<com.nst.iptvsmarterstvbox.view.activity.LoginActivityOneStream> r1 = com.nst.iptvsmarterstvbox.view.activity.LoginActivityOneStream.class
            r3.<init>(r0, r1)
            goto L11
        L95:
            java.lang.Boolean r3 = m7.AbstractC2237a.f44532q
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto La8
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.f47140g
            java.lang.Class<com.nst.iptvsmarterstvbox.view.activity.LoginActivity> r1 = com.nst.iptvsmarterstvbox.view.activity.LoginActivity.class
            r3.<init>(r0, r1)
            goto L11
        La8:
            java.lang.Boolean r3 = m7.AbstractC2237a.f44534r
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lc4
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.f47140g
            java.lang.Class<com.nst.iptvsmarterstvbox.view.activity.LoginM3uActivity> r1 = com.nst.iptvsmarterstvbox.view.activity.LoginM3uActivity.class
            r3.<init>(r0, r1)
            goto L11
        Lbb:
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r1 = r2.f47140g
            r3.<init>(r1, r0)
            goto L11
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.F.n1(android.view.View):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public void E(g gVar, int i9) {
        int identifier;
        int iP = p(i9);
        int i10 = (i9 % 10) + 1;
        if (iP != 1) {
            if (iP != 2) {
                return;
            }
            gVar.f47203u.setOnClickListener(new View.OnClickListener() { // from class: q7.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49606a.n1(view);
                }
            });
            gVar.f47205w.setImageDrawable(E.b.getDrawable(this.f47140g, a7.e.f12050r));
            if (this.f47131K.A().equals(AbstractC2237a.f44453K0)) {
                RelativeLayout relativeLayout = gVar.f47203u;
                relativeLayout.setOnFocusChangeListener(new h(relativeLayout, gVar.f47206x, 0, gVar.f47207y, gVar.f47208z, iP));
            } else {
                gVar.f47203u.setFocusable(false);
            }
            gVar.f47202t.setText(this.f47140g.getResources().getString(a7.j.f13376s));
            return;
        }
        SharedPreferences sharedPreferences = this.f47140g.getSharedPreferences("loginprefsmultiuser", 0);
        sharedPreferences.getString("name", "");
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        sharedPreferences.getString(AbstractC2237a.f44454L, "");
        List list = this.f47141h;
        if (list == null || list.size() <= 0) {
            return;
        }
        MultiUserDBModel multiUserDBModel = (MultiUserDBModel) this.f47141h.get(i9);
        try {
            identifier = this.f47140g.getResources().getIdentifier("@drawable/box_" + i10, null, this.f47140g.getPackageName());
            try {
                gVar.f47205w.setImageDrawable(E.b.getDrawable(this.f47140g, identifier));
            } catch (Exception unused) {
                gVar.f47205w.setImageDrawable(E.b.getDrawable(this.f47140g, a7.e.f12046q));
            }
        } catch (Exception unused2) {
            identifier = 0;
        }
        int i11 = identifier;
        gVar.f47202t.setSelected(true);
        this.f47153t = this.f47140g.getSharedPreferences("loginPrefsserverurl", 0);
        SharedPreferences sharedPreferences2 = this.f47140g.getSharedPreferences("sharedprefremberme", 0);
        this.f47154u = sharedPreferences2;
        this.f47155v = sharedPreferences2.edit();
        String str = multiUserDBModel.getname();
        String str2 = multiUserDBModel.getusername();
        String str3 = multiUserDBModel.getpassword();
        String str4 = multiUserDBModel.getmagportal();
        String str5 = multiUserDBModel.getmagportal2();
        String logged_in_using = multiUserDBModel.getLogged_in_using();
        String m3uType = multiUserDBModel.getM3uType();
        if ((m3uType == null || !m3uType.equals(TransferTable.COLUMN_FILE)) && (m3uType == null || !m3uType.equals("url"))) {
            this.f47145l = logged_in_using.equals("onestream_api") ? "onestream_api" : "api";
        } else {
            this.f47145l = "m3u";
        }
        int autoIdLoggedInUser = this.f47143j.getAutoIdLoggedInUser(str, str2, str3, str4, this.f47145l, str5 == null ? "" : str5, "");
        if (str != null) {
            gVar.f47202t.setText(str);
        }
        if (this.f47145l.equals("m3u") && multiUserDBModel.getM3uType().equals(TransferTable.COLUMN_FILE) && str4 != null) {
            this.f47156w = str4;
        }
        gVar.f47203u.setOnLongClickListener(new a(str, str2, str3, str4, gVar, i9, autoIdLoggedInUser));
        gVar.f47203u.setOnClickListener(new b(str2, str3, str4, str, i9, multiUserDBModel, logged_in_using, autoIdLoggedInUser));
        if (this.f47131K.A().equals(AbstractC2237a.f44453K0)) {
            RelativeLayout relativeLayout2 = gVar.f47203u;
            relativeLayout2.setOnFocusChangeListener(new h(relativeLayout2, gVar.f47206x, i11, gVar.f47207y, gVar.f47208z, iP));
            if (i9 == 0 && this.f47139f) {
                gVar.f47203u.requestFocus();
                this.f47139f = false;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        try {
            MultiUserDBModel multiUserDBModel = (MultiUserDBModel) this.f47141h.get(i9);
            if (multiUserDBModel.getType() != null) {
                if (multiUserDBModel.getType().equals("add_playlist")) {
                    return 2;
                }
            }
        } catch (Exception unused) {
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public g L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (i9 != 2 && AbstractC2237a.f44526o.booleanValue()) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12844n3;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12838m3;
        }
        return new g(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void q1(g gVar, int i9, String str, int i10, View view, String str2, String str3, String str4) {
        String str5;
        MultiUserDBModel multiUserDBModel = (MultiUserDBModel) this.f47141h.get(i9);
        String m3uType = multiUserDBModel.getM3uType();
        String logged_in_using = multiUserDBModel.getLogged_in_using();
        if ((m3uType == null || !m3uType.equals(TransferTable.COLUMN_FILE)) && (m3uType == null || !m3uType.equals("url"))) {
            str5 = "onestream_api";
            if (!logged_in_using.equals("onestream_api")) {
                str5 = "api";
            }
        } else {
            str5 = "m3u";
        }
        this.f47145l = str5;
        k.U u9 = new k.U(this.f47140g, gVar.f47204v);
        try {
            Field declaredField = k.U.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(u9);
            obj.getClass().getDeclaredMethod("setForceShowIcon", Boolean.TYPE).invoke(obj, Boolean.TRUE);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        u9.c().inflate(a7.h.f12923f, u9.b());
        u9.f(new c(str, str2, str3, str4, i10, i9, gVar, multiUserDBModel));
        u9.g();
    }

    public final void r1(String str, String str2, String str3, String str4, EditText editText, EditText editText2, EditText editText3, EditText editText4) {
        if (editText != null && str != null && !str.isEmpty() && !str.equals("")) {
            editText.setText(str);
        }
        if (editText2 != null && str2 != null && !str2.isEmpty() && !str2.equals("")) {
            editText2.setText(str2);
        }
        if (editText3 != null && str3 != null && !str3.isEmpty() && !str3.equals("")) {
            editText3.setText(str3);
        }
        if (editText4 == null || str4 == null || str4.isEmpty() || str4.equals("")) {
            return;
        }
        editText4.setText(str4);
    }
}
