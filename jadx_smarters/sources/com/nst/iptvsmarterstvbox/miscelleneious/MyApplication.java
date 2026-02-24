package com.nst.iptvsmarterstvbox.miscelleneious;

import A5.f;
import G5.AbstractC0553u;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import b7.AbstractC1232b;
import com.amazonaws.amplify.generated.graphql.GetSmartersNewQuery;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.miscelleneious.a;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AddDeviceFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Executors;
import m7.AbstractC2237a;
import m7.j;
import m7.w;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p0.C2386a;
import u1.InterfaceC2844c;
import v0.AbstractC2860a;
import v1.i;

/* JADX INFO: loaded from: classes.dex */
public class MyApplication extends Application {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f28657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static AbstractC0553u f28658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static MyApplication f28659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Activity f28660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static ArrayList f28661k = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AWSAppSyncClient f28662a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f28664d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f28666f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BroadcastReceiver f28663c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2844c.a f28665e = new c();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            String action = intent.getAction();
            action.hashCode();
            if (action.equals(TransferService.INTENT_KEY_NOTIFICATION)) {
                if (intent.hasExtra("noti_announcements")) {
                    com.nst.iptvsmarterstvbox.miscelleneious.a.l();
                    return;
                }
                if (intent.hasExtra("notification_popup")) {
                    String stringExtra = intent.getStringExtra("notification_popup");
                    if (stringExtra == null || !stringExtra.equalsIgnoreCase("firebase")) {
                        com.nst.iptvsmarterstvbox.miscelleneious.a.n("local");
                        return;
                    } else {
                        com.nst.iptvsmarterstvbox.miscelleneious.a.n("firebase");
                        return;
                    }
                }
                if (intent.hasExtra("app_version")) {
                    com.nst.iptvsmarterstvbox.miscelleneious.a.p();
                } else if (intent.hasExtra("sbp_maintenance_mode")) {
                    com.nst.iptvsmarterstvbox.miscelleneious.a.o();
                } else if (intent.hasExtra("sbp_panel_ads")) {
                    com.nst.iptvsmarterstvbox.miscelleneious.a.d();
                }
            }
        }
    }

    public class b implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FirebaseAuth f28668a;

        public b(FirebaseAuth firebaseAuth) {
            this.f28668a = firebaseAuth;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(Task task) {
            if (task.isSuccessful()) {
                AbstractC0553u unused = MyApplication.f28658h = this.f28668a.c();
                return;
            }
            Log.d("jaskirat", task.isCanceled() ? "signInAnonymously:canceled" : "signInAnonymously:failed");
            if (task.getException() != null) {
                Log.e("jaskirat", "Exception: ", task.getException());
            }
        }
    }

    public class c extends InterfaceC2844c.a {
        public c() {
        }

        @Override // u1.InterfaceC2844c.a
        public void onFailure(B1.b bVar) {
            if (MyApplication.this.f28664d != null) {
                MyApplication.this.f28664d.a("100");
            }
        }

        @Override // u1.InterfaceC2844c.a
        public void onResponse(i iVar) {
            d dVar;
            String str;
            if (AbstractC2237a.f44526o.booleanValue()) {
                try {
                    if (iVar.b() == null || ((GetSmartersNewQuery.Data) iVar.b()).equals("")) {
                        MyApplication.this.C("response null");
                        if (MyApplication.this.f28664d != null) {
                            MyApplication.this.f28664d.a("101");
                            return;
                        }
                        return;
                    }
                    if (((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew() == null) {
                        if (MyApplication.this.f28664d != null) {
                            MyApplication.this.f28664d.a("103");
                            return;
                        }
                        return;
                    }
                    if (((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config6() == null || ((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config2() == null || ((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config3() == null) {
                        if (MyApplication.this.f28664d == null) {
                            return;
                        }
                        dVar = MyApplication.this.f28664d;
                        str = "104";
                    } else {
                        if (!((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config3().isEmpty() && !((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config6().isEmpty() && !((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config2().isEmpty()) {
                            AbstractC2237a.f44467R0 = ((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config6();
                            AbstractC2237a.f44469S0 = ((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config2();
                            AbstractC2237a.f44471T0 = ((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config3();
                            MyApplication.this.C(AbstractC2237a.f44467R0);
                            MyApplication.this.C(AbstractC2237a.f44469S0);
                            MyApplication.this.C(AbstractC2237a.f44471T0);
                            SharepreferenceDBHandler.setDemoAWSCredentials(MyApplication.f28657g, AbstractC2237a.f44467R0, AbstractC2237a.f44469S0, AbstractC2237a.f44471T0);
                            if (MyApplication.this.f28664d != null) {
                                MyApplication.this.f28664d.onSuccess();
                                return;
                            }
                            return;
                        }
                        if (MyApplication.this.f28664d == null) {
                            return;
                        }
                        dVar = MyApplication.this.f28664d;
                        str = "105";
                    }
                    dVar.a(str);
                    return;
                } catch (Exception unused) {
                    if (MyApplication.this.f28664d == null) {
                        return;
                    }
                }
            } else {
                try {
                    if (iVar.b() == null || ((GetSmartersNewQuery.Data) iVar.b()).equals("")) {
                        if (MyApplication.this.f28664d != null) {
                            MyApplication.this.f28664d.b("101");
                            return;
                        }
                        return;
                    }
                    if (((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew() != null) {
                        if (((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config1() == null || ((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config1().isEmpty()) {
                            if (MyApplication.this.f28664d != null) {
                                MyApplication.this.f28664d.b("106");
                                return;
                            }
                            return;
                        }
                        String strConfig1 = ((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config1();
                        AbstractC2237a.f44463P0 = strConfig1;
                        MyApplication.this.C(strConfig1);
                        SharepreferenceDBHandler.setClientSecurityCred(MyApplication.f28657g, AbstractC2237a.f44463P0);
                        if (((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config3() != null && !((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config3().isEmpty()) {
                            String strConfig3 = ((GetSmartersNewQuery.Data) iVar.b()).getSmartersNew().config3();
                            AbstractC2237a.f44467R0 = strConfig3;
                            MyApplication.this.C(strConfig3);
                            SharepreferenceDBHandler.setSBPBaseCredentials(MyApplication.f28657g, AbstractC2237a.f44467R0);
                        } else if (MyApplication.this.f28664d != null) {
                            MyApplication.this.f28664d.b("107");
                        }
                        if (MyApplication.this.f28664d != null) {
                            MyApplication.this.f28664d.onSuccess();
                        }
                    } else if (MyApplication.this.f28664d != null) {
                        MyApplication.this.f28664d.b("103");
                    }
                    MyApplication.this.C(AbstractC2237a.f44467R0);
                    return;
                } catch (Exception unused2) {
                    if (MyApplication.this.f28664d == null) {
                        return;
                    }
                }
            }
            MyApplication.this.f28664d.a("102");
        }
    }

    public interface d {
        void a(String str);

        void b(String str);

        void onSuccess();
    }

    public static void E(String str) {
    }

    public static void F(String str) {
    }

    public static String j(Activity activity) {
        try {
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z9 = true;
        for (char c9 : charArray) {
            if (z9 && Character.isLetter(c9)) {
                sb.append(Character.toUpperCase(c9));
                z9 = false;
            } else {
                if (Character.isWhitespace(c9)) {
                    z9 = true;
                }
                sb.append(c9);
            }
        }
        return sb.toString();
    }

    public static String l() {
        return Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public static Context m() {
        return f28657g;
    }

    public static String n() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return k(str2);
        }
        return k(str) + " " + str2;
    }

    public static MyApplication p() {
        if (f28659i == null) {
            f28659i = new MyApplication();
        }
        return f28659i;
    }

    public static ArrayList r(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FavouriteDBModel favouriteDBModel = (FavouriteDBModel) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList3.add(favouriteDBModel);
                    break;
                }
                String str = (String) it2.next();
                if (favouriteDBModel.getCategoryID() == null || !favouriteDBModel.getCategoryID().equals(str)) {
                }
            }
        }
        return arrayList3;
    }

    public static ArrayList s(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel favouriteM3UModel = (FavouriteM3UModel) it.next();
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            arrayList3.add(favouriteM3UModel);
                            break;
                        }
                        if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    }
                }
            }
            return arrayList3;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ void t(AddDeviceFirebaseCallback addDeviceFirebaseCallback) {
    }

    public static String z(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b9 : bArrDigest) {
                String hexString = Integer.toHexString(b9 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e9) {
            e9.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void w() {
        AppSyncQueryCall appSyncQueryCallResponseFetcher;
        InterfaceC2844c.a aVar;
        try {
            if (this.f28662a != null) {
                if (AbstractC2237a.f44526o.booleanValue()) {
                    appSyncQueryCallResponseFetcher = this.f28662a.query(GetSmartersNewQuery.builder().id("874673642923694wrong").build()).responseFetcher(AppSyncResponseFetchers.NETWORK_ONLY);
                    aVar = this.f28665e;
                } else {
                    appSyncQueryCallResponseFetcher = this.f28662a.query(GetSmartersNewQuery.builder().id("874673642923694555wrong").build()).responseFetcher(AppSyncResponseFetchers.NETWORK_ONLY);
                    aVar = this.f28665e;
                }
                appSyncQueryCallResponseFetcher.enqueue(aVar);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void B() {
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (SharepreferenceDBHandler.getSBPDemoAndClientUrl(f28657g) == null || SharepreferenceDBHandler.getSBPDemoAndClientUrl(f28657g).length() <= 0) {
                return;
            }
            AbstractC2237a.f44467R0 = SharepreferenceDBHandler.getSBPDemoAndClientUrl(f28657g);
            return;
        }
        if (SharepreferenceDBHandler.getSBPDemoAndClientUrl(f28657g) == null || SharepreferenceDBHandler.getDemoUsername(f28657g) == null || SharepreferenceDBHandler.getDemoPassword(f28657g) == null) {
            return;
        }
        if (SharepreferenceDBHandler.getSBPDemoAndClientUrl(f28657g).length() > 0) {
            AbstractC2237a.f44467R0 = SharepreferenceDBHandler.getSBPDemoAndClientUrl(f28657g);
        }
        if (SharepreferenceDBHandler.getDemoUsername(f28657g).length() > 0) {
            AbstractC2237a.f44469S0 = SharepreferenceDBHandler.getDemoUsername(f28657g);
        }
        if (SharepreferenceDBHandler.getDemoPassword(f28657g).length() > 0) {
            AbstractC2237a.f44471T0 = SharepreferenceDBHandler.getDemoPassword(f28657g);
        }
    }

    public void C(String str) {
    }

    public void D(String str, Context context) {
        if (context != null) {
            Toast.makeText(context, "Something went wrong, Please try again" + str, 0).show();
        }
    }

    public void G(Context context, d dVar) {
        this.f28664d = dVar;
        this.f28662a = AWSAppSyncClient.builder().context(context).awsConfiguration(new AWSConfiguration(context)).build();
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: g7.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f41486a.w();
            }
        });
    }

    public void H(String str, int i9, String str2, boolean z9, String str3) {
        if (this.f28666f != null) {
            this.f28666f = null;
        }
        j jVar = new j(str, i9, str2, z9, str3);
        this.f28666f = jVar;
        jVar.P(new j.c() { // from class: g7.h
            @Override // m7.j.c
            public final void a() {
                this.f41485a.x();
            }
        });
    }

    public void I() {
        E("recordingChannelTask: " + this.f28666f);
        j jVar = this.f28666f;
        if (jVar != null) {
            jVar.T();
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        AbstractC2860a.l(this);
    }

    public void f(final boolean z9, final Context context) {
        if (context != null) {
            try {
                if (w.o(context) && SharepreferenceDBHandler.getFirebaseToken(context) != null && SharepreferenceDBHandler.getFirebaseToken(context).length() == 0) {
                    FirebaseMessaging.f().i().addOnCompleteListener(new OnCompleteListener() { // from class: g7.j
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            this.f41487a.u(context, z9, task);
                        }
                    });
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public CharSequence o(String str) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : str;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        f28657g = applicationContext;
        f.s(applicationContext);
        B();
        SharepreferenceDBHandler.setLocalDb(f28657g, false);
        com.nst.iptvsmarterstvbox.miscelleneious.a.j(f28657g, this, new a.b() { // from class: g7.g
            @Override // com.nst.iptvsmarterstvbox.miscelleneious.a.b
            public final void a(Activity activity) {
                MyApplication.f28660j = activity;
            }
        });
        if (AbstractC2237a.f44475V0.booleanValue()) {
            SharepreferenceDBHandler.setShowPopup(f28657g, true);
            y();
            C2386a.b(this).c(this.f28663c, new IntentFilter(TransferService.INTENT_KEY_NOTIFICATION));
        }
    }

    public void q() {
        AbstractC1232b.f17695b = String.valueOf(new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS);
    }

    public final /* synthetic */ void u(Context context, boolean z9, Task task) {
        StringBuilder sb;
        if (!task.isSuccessful()) {
            Log.w("Firebase Token<<<>>>", "Fetching FCM registration token failed", task.getException());
            return;
        }
        String strF = w.F(context);
        Log.e("Dashboard", strF);
        String str = (String) task.getResult();
        AbstractC2237a.f44473U0 = str;
        E("Firebase Token<<<>>>" + str);
        if (str == null || str.length() <= 0) {
            return;
        }
        if (str.length() > 10) {
            sb = new StringBuilder();
            sb.append(strF);
            sb.append(str.substring(0, 9));
        } else {
            sb = new StringBuilder();
            sb.append(strF);
            sb.append(str);
        }
        String string = sb.toString();
        Log.e("tokenBreak", string);
        if (context == null || SharepreferenceDBHandler.getFirebaseToken(context) == null || SharepreferenceDBHandler.getFirebaseToken(context).length() != 0) {
            return;
        }
        String str2 = new SimpleDateFormat("yyyy-MM").format(new Date());
        q();
        new FirebasePresenter(f28657g, new FirebasePresenter.OnFirebaseTokenListener() { // from class: g7.k
            @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnFirebaseTokenListener
            public final void a(AddDeviceFirebaseCallback addDeviceFirebaseCallback) {
                MyApplication.t(addDeviceFirebaseCallback);
            }
        }).g(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, str2, w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str2), str, string, z9);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Firebase Token<<<>>>");
        sb2.append(str);
        E(sb2.toString());
    }

    public final /* synthetic */ void x() {
        this.f28666f = null;
    }

    public final void y() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.i().addOnCompleteListener(new b(firebaseAuth));
    }
}
