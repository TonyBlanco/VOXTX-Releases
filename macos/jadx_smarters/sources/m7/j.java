package m7;

import D.AbstractC0529l;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.widget.Toast;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.view.activity.NotificationActivity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.http.client.methods.HttpGet;
import org.joda.time.DateTimeConstants;
import z0.AbstractC2996b;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static SharedPreferences f44655F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static SharedPreferences f44656G;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public b f44660D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public c f44661E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f44662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44668g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NotificationManager f44670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NotificationManager f44671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Notification f44672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC0529l.e f44673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC0529l.e f44674m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f44679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CountDownTimer f44680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CountDownTimer f44681t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44669h = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44675n = 234231;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44676o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44677p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44678q = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f44682u = "CANCELLED";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44683v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f44684w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f44685x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f44686y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f44687z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int[] f44657A = {1};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public HttpURLConnection f44658B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f44659C = 10;

    public class a extends CountDownTimer {

        /* JADX INFO: renamed from: m7.j$a$a, reason: collision with other inner class name */
        public class CountDownTimerC0388a extends CountDownTimer {
            public CountDownTimerC0388a(long j9, long j10) {
                super(j9, j10);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                j.this.f44681t.cancel();
                j.this.f44676o = true;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j9) {
                NotificationManager notificationManager;
                int i9;
                Notification notificationC;
                if (j.this.f44683v) {
                    j jVar = j.this;
                    if (!jVar.f44687z) {
                        MyApplication.E("Debugging:cancelled recording");
                        j.this.f44670i.cancelAll();
                        j.this.f44681t.cancel();
                        j.this.V("stopped");
                        return;
                    }
                    jVar.f44663b -= j.this.f44657A[0];
                    j jVar2 = j.this;
                    jVar2.f44664c = jVar2.f44663b * 1000;
                    MyApplication.E("Debugging:retrying: " + j.this.f44664c);
                    j.this.f44681t.cancel();
                    return;
                }
                MyApplication.E("startingSeconds" + j.this.f44657A[0]);
                int[] iArr = j.this.f44657A;
                int i10 = iArr[0];
                iArr[0] = i10 + 1;
                if (Build.VERSION.SDK_INT >= 26) {
                    SharedPreferences sharedPreferencesA = AbstractC2996b.a(j.this.f44662a);
                    j.f44656G = sharedPreferencesA;
                    SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                    editorEdit.putBoolean("CANCELLED", false);
                    editorEdit.apply();
                    j jVar3 = j.this;
                    NotificationActivity.a(jVar3.f44675n, jVar3.f44662a);
                    j.this.f44672k = new Notification.Builder(j.this.f44662a).setContentTitle(j.this.f44662a.getResources().getString(a7.j.f13184Y5) + j.O(i10) + " - " + j.O(j.this.f44666e / 1000)).setSmallIcon(a7.i.f12942a).setChannelId("ksjadf87").setSound((Uri) null, (AudioAttributes) null).build();
                    com.amplifyframework.storage.s3.service.c.a();
                    j.this.f44670i.createNotificationChannel(com.amplifyframework.storage.s3.service.b.a("ksjadf87", j.this.f44662a.getResources().getString(a7.j.f13184Y5), 2));
                    j jVar4 = j.this;
                    notificationManager = jVar4.f44670i;
                    i9 = jVar4.f44675n;
                    notificationC = jVar4.f44672k;
                } else {
                    j.this.f44673l.m(j.this.f44662a.getResources().getString(a7.j.f13184Y5) + j.O(i10) + " - " + j.O(j.this.f44666e / 1000));
                    j jVar5 = j.this;
                    notificationManager = jVar5.f44670i;
                    i9 = jVar5.f44675n;
                    notificationC = jVar5.f44673l.c();
                }
                notificationManager.notify(i9, notificationC);
                if (j.this.f44684w) {
                    j.this.f44670i.cancelAll();
                    j.this.f44681t.cancel();
                }
                MyApplication.E("Debugging:Seconds:" + j.O(i10) + "   Reverse Seconds:" + j.O((int) (j9 / 1000)) + " asdf:" + j.this.f44664c + " Timeinseconds:" + j.this.f44663b);
                j.U(j.this.f44662a, "processing");
            }
        }

        public a(long j9, long j10) {
            super(j9, j10);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            cancel();
            j jVar = j.this;
            if (jVar.f44687z || !jVar.f44678q) {
                return;
            }
            j.this.V("failed");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j9) {
            MyApplication.E("testing " + j9);
            if (j.this.f44677p) {
                MyApplication.E("download started " + j9);
                cancel();
                j jVar = j.this;
                jVar.f44681t = new CountDownTimerC0388a((long) jVar.f44664c, 1000L).start();
            }
        }
    }

    public class b extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FileOutputStream f44690a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j jVar = j.this;
                jVar.f44686y++;
                w.P0(jVar.f44662a, "Retrying (" + j.this.f44686y + "/10)");
                j.this.S();
            }
        }

        public b() {
            this.f44690a = null;
        }

        public /* synthetic */ b(j jVar, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            File file;
            MyApplication.E("start do in background");
            try {
                j.this.f44658B = (HttpURLConnection) new URL(j.this.f44667f).openConnection();
                j.this.f44658B.setRequestMethod(HttpGet.METHOD_NAME);
                j.this.f44658B.setUseCaches(false);
                j.this.f44658B.setInstanceFollowRedirects(false);
                j.this.f44658B.connect();
                int responseCode = j.this.f44658B.getResponseCode();
                MyApplication.E("responseCode" + responseCode);
                if (responseCode == 302 || responseCode == 301) {
                    String headerField = j.this.f44658B.getHeaderField("Location");
                    j.this.f44658B.disconnect();
                    j.this.f44658B = (HttpURLConnection) new URL(headerField).openConnection();
                    j.this.f44658B.setRequestMethod(HttpGet.METHOD_NAME);
                    j.this.f44658B.connect();
                    responseCode = j.this.f44658B.getResponseCode();
                }
                if (responseCode != 200) {
                    MyApplication.E("Server returned HTTP " + responseCode + " " + j.this.f44658B.getResponseMessage());
                    SharedPreferences.Editor editorEdit = j.f44656G.edit();
                    editorEdit.putBoolean("CANCELLED", true);
                    editorEdit.apply();
                    j.this.f44683v = true;
                    j jVar = j.this;
                    jVar.f44687z = true;
                    jVar.f44677p = false;
                } else {
                    if (j.this.f44665d == null || j.this.f44665d.isEmpty()) {
                        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters");
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        j.this.f44665d = file2.getAbsolutePath();
                    }
                    if (j.this.f44669h == null || j.this.f44669h.isEmpty()) {
                        if (!j.this.f44668g.contains(".ts")) {
                            j.z(j.this, ".ts");
                        }
                        file = new File(j.this.f44665d, j.this.f44668g);
                        if (file.exists() && !j.this.f44687z) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
                            j.this.f44669h = simpleDateFormat.format(new Date()) + "_" + j.this.f44668g;
                            file = new File(j.this.f44665d, j.this.f44669h);
                        }
                    } else {
                        file = new File(j.this.f44665d, j.this.f44669h);
                    }
                    MyApplication.E("checkIfCancelled default" + j.this.f44683v);
                    MyApplication.E("retrying default" + j.this.f44687z);
                    MyApplication.E("downloadStarted default" + j.this.f44677p);
                    try {
                        this.f44690a = new FileOutputStream(file, true);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f44690a);
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(j.this.f44658B.getInputStream());
                        byte[] bArr = new byte[1024];
                        if (j.this.f44685x == -1) {
                            j.this.f44685x = (System.currentTimeMillis() / 1000) + ((long) j.this.f44663b);
                        }
                        j.this.f44677p = true;
                        j.this.f44683v = false;
                        while (true) {
                            int i9 = bufferedInputStream.read(bArr);
                            if (i9 != -1 && System.currentTimeMillis() / 1000 < j.this.f44685x && !j.this.f44676o) {
                                j.this.f44683v = j.f44656G.getBoolean("CANCELLED", false);
                                if (j.this.f44683v) {
                                    MyApplication.E("CANCELLED called");
                                    SharedPreferences.Editor editorEdit2 = j.f44656G.edit();
                                    editorEdit2.putBoolean("CANCELLED", true);
                                    editorEdit2.apply();
                                    break;
                                }
                                j jVar2 = j.this;
                                jVar2.f44686y = 0;
                                jVar2.f44687z = false;
                                bufferedOutputStream.write(bArr, 0, i9);
                            } else {
                                break;
                            }
                        }
                        MyApplication.E("checkIfCancelled" + j.this.f44683v);
                        MyApplication.E("retrying" + j.this.f44687z);
                        MyApplication.E("downloadStarted" + j.this.f44677p);
                    } catch (IOException e9) {
                        MyApplication.E("IOException");
                        e9.printStackTrace();
                    }
                }
                MyApplication.E("connection.disconnect()");
                j.this.f44658B.disconnect();
                return null;
            } catch (Exception e10) {
                SharedPreferences.Editor editorEdit3 = j.f44656G.edit();
                editorEdit3.putBoolean("CANCELLED", true);
                editorEdit3.apply();
                MyApplication.E("Exception");
                j.this.f44683v = true;
                j jVar3 = j.this;
                jVar3.f44687z = true;
                jVar3.f44677p = false;
                MyApplication.E("Retrying " + e10.getMessage());
                return null;
            }
        }

        public final /* synthetic */ void d() {
            j jVar = j.this;
            jVar.f44686y++;
            w.P0(jVar.f44662a, "Retrying (" + j.this.f44686y + "/10)");
            j.this.S();
        }

        public final /* synthetic */ void e() {
            j jVar = j.this;
            jVar.f44686y++;
            w.P0(jVar.f44662a, "Retrying (" + j.this.f44686y + "/10)");
            j.this.S();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            Handler handler;
            Runnable aVar;
            j jVar;
            String string;
            try {
                if (this.f44690a != null) {
                    MyApplication.E("outputFile found");
                    if (j.this.f44683v) {
                        MyApplication.E("retrying" + j.this.f44687z);
                        if (j.this.f44687z) {
                            MyApplication.E("retrying true");
                            j jVar2 = j.this;
                            if (jVar2.f44686y >= 10) {
                                MyApplication.E("DownloadFailed");
                                w.P0(j.this.f44662a, j.this.f44662a.getResources().getString(a7.j.f13196a));
                                j jVar3 = j.this;
                                jVar3.f44687z = false;
                                jVar3.f44678q = true;
                                jVar = j.this;
                                string = jVar.f44662a.getResources().getString(a7.j.f13171X1);
                                jVar.V(string);
                            } else {
                                jVar2.f44687z = true;
                                handler = new Handler();
                                aVar = new Runnable() { // from class: m7.l
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f44694a.e();
                                    }
                                };
                                handler.postDelayed(aVar, 10000L);
                            }
                        }
                    } else {
                        if (System.currentTimeMillis() / 1000 < j.this.f44685x) {
                            j.this.f44677p = false;
                            MyApplication.E("Recording retry with playback error");
                            j jVar4 = j.this;
                            if (jVar4.f44686y >= 10) {
                                MyApplication.E("DownloadFailed");
                                w.P0(j.this.f44662a, j.this.f44662a.getResources().getString(a7.j.f13196a));
                                j jVar5 = j.this;
                                jVar5.f44687z = false;
                                jVar5.f44678q = true;
                                jVar = j.this;
                                string = jVar.f44662a.getResources().getString(a7.j.f13171X1);
                            } else {
                                jVar4.f44687z = true;
                                handler = new Handler();
                                aVar = new Runnable() { // from class: m7.k
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f44693a.d();
                                    }
                                };
                                handler.postDelayed(aVar, 10000L);
                            }
                        } else {
                            MyApplication.E("completed");
                            jVar = j.this;
                            string = jVar.f44662a.getResources().getString(a7.j.f13357q0);
                        }
                        jVar.V(string);
                    }
                } else {
                    MyApplication.E("outputFile null");
                    j jVar6 = j.this;
                    if (jVar6.f44687z) {
                        if (jVar6.f44686y >= 10) {
                            jVar6.f44687z = false;
                            jVar6.f44678q = true;
                            jVar = j.this;
                            string = jVar.f44662a.getResources().getString(a7.j.f13171X1);
                            jVar.V(string);
                        } else {
                            jVar6.f44687z = true;
                            handler = new Handler();
                            aVar = new a();
                            handler.postDelayed(aVar, 10000L);
                        }
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
                j.this.f44678q = true;
                j jVar7 = j.this;
                jVar7.V(jVar7.f44662a.getResources().getString(a7.j.f13171X1));
            }
            super.onPostExecute(r12);
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            super.onCancelled();
            MyApplication.E("DownloadingTask cancelled");
            if (j.this.f44658B != null) {
                j.this.f44658B.disconnect();
            }
            FileOutputStream fileOutputStream = this.f44690a;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            j.this.V("stopped");
            if (j.this.f44661E != null) {
                j.this.f44661E.a();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            j.this.Q();
            j.this.N();
        }
    }

    public interface c {
        void a();
    }

    public j(String str, int i9, String str2, boolean z9, String str3) {
        this.f44667f = "";
        this.f44668g = "";
        this.f44679r = true;
        Context contextM = MyApplication.m();
        this.f44662a = contextM;
        this.f44667f = str;
        int i10 = i9 * 60;
        int i11 = i9 * DateTimeConstants.MILLIS_PER_MINUTE;
        this.f44664c = i11;
        this.f44666e = i11;
        this.f44663b = i10;
        this.f44679r = z9;
        this.f44665d = str3;
        this.f44668g = str2;
        f44656G = AbstractC2996b.a(contextM);
        S();
    }

    public static String O(int i9) {
        return String.format("%02d:%02d:%02d", Integer.valueOf(i9 / 3600), Integer.valueOf((i9 % 3600) / 60), Integer.valueOf(i9 % 60));
    }

    public static void U(Context context, String str) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("downloadStatus", 0);
            f44655F = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("downloadStatus", str);
            editorEdit.apply();
        }
    }

    public static /* synthetic */ String z(j jVar, Object obj) {
        String str = jVar.f44668g + obj;
        jVar.f44668g = str;
        return str;
    }

    public final void N() {
        SharedPreferences sharedPreferencesA = AbstractC2996b.a(this.f44662a);
        f44656G = sharedPreferencesA;
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        editorEdit.putBoolean("CANCELLED", false);
        editorEdit.apply();
        PendingIntent pendingIntentA = NotificationActivity.a(this.f44675n, this.f44662a);
        if (Build.VERSION.SDK_INT >= 26) {
            return;
        }
        this.f44673l.a(a7.e.f11892A2, "Stop", pendingIntentA);
    }

    public void P(c cVar) {
        this.f44661E = cVar;
    }

    public final void Q() {
        NotificationManager notificationManager;
        int i9;
        Notification notificationC;
        NotificationManager notificationManager2 = this.f44670i;
        if (notificationManager2 != null) {
            notificationManager2.cancelAll();
        }
        NotificationManager notificationManager3 = this.f44671j;
        if (notificationManager3 != null) {
            notificationManager3.cancelAll();
        }
        if (!this.f44687z) {
            Context context = this.f44662a;
            Toast.makeText(context, context.getResources().getString(a7.j.f13238e1), 0).show();
        }
        this.f44670i = (NotificationManager) this.f44662a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        AbstractC0529l.e eVar = new AbstractC0529l.e(this.f44662a);
        this.f44673l = eVar;
        if (Build.VERSION.SDK_INT >= 26) {
            com.amplifyframework.storage.s3.service.c.a();
            NotificationChannel notificationChannelA = com.amplifyframework.storage.s3.service.b.a("ksjadf87", this.f44662a.getResources().getString(a7.j.f13184Y5), 2);
            this.f44672k = new Notification.Builder(this.f44662a).setContentTitle(this.f44662a.getResources().getString(a7.j.f13145U2)).setContentText(this.f44662a.getResources().getString(a7.j.f13184Y5)).setSmallIcon(a7.i.f12942a).setChannelId("ksjadf87").setProgress(100, 0, true).build();
            this.f44670i.createNotificationChannel(notificationChannelA);
            notificationManager = this.f44670i;
            i9 = this.f44675n;
            notificationC = this.f44672k;
        } else {
            eVar.n(this.f44662a.getResources().getString(a7.j.f13145U2)).B(100, 0, true).m(this.f44662a.getResources().getString(a7.j.f13184Y5)).D(a7.i.f12942a);
            notificationManager = this.f44670i;
            i9 = this.f44675n;
            notificationC = this.f44673l.c();
        }
        notificationManager.notify(i9, notificationC);
        R();
    }

    public final void R() {
        CountDownTimer countDownTimer = this.f44680s;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = this.f44681t;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.f44680s = new a(20000L, 1000L).start();
    }

    public final void S() {
        b bVar = new b(this, null);
        this.f44660D = bVar;
        bVar.execute(new Void[0]);
    }

    public void T() {
        MyApplication.E("downloadingTask: " + this.f44660D);
        MyApplication.E("countDownTimer: " + this.f44680s);
        MyApplication.E("countDownTimerInternal: " + this.f44681t);
        b bVar = this.f44660D;
        if (bVar != null && bVar.getStatus() != AsyncTask.Status.FINISHED) {
            this.f44660D.cancel(true);
        }
        CountDownTimer countDownTimer = this.f44680s;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f44680s = null;
        }
        CountDownTimer countDownTimer2 = this.f44681t;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
            this.f44681t = null;
        }
        V("stopped");
    }

    public final void V(String str) {
        Context context;
        Resources resources;
        int i9;
        this.f44670i.cancelAll();
        CountDownTimer countDownTimer = this.f44681t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f44674m = new AbstractC0529l.e(this.f44662a).D(a7.i.f12942a).n(this.f44662a.getResources().getString(a7.j.f13145U2));
        if (str.equals("completed")) {
            U(this.f44662a, "completed");
            this.f44684w = true;
            this.f44674m.m(this.f44662a.getResources().getString(a7.j.f13170X0));
            if (!this.f44687z) {
                context = this.f44662a;
                resources = context.getResources();
                i9 = a7.j.f13170X0;
                Toast.makeText(context, resources.getString(i9), 0).show();
            }
        } else if (str.equals("failed")) {
            U(this.f44662a, "failed");
            this.f44674m.m(this.f44662a.getResources().getString(a7.j.f13179Y0));
            if (!this.f44687z) {
                context = this.f44662a;
                resources = context.getResources();
                i9 = a7.j.f13179Y0;
                Toast.makeText(context, resources.getString(i9), 0).show();
            }
        } else if (str.equals("stopped")) {
            U(this.f44662a, "stopped");
            this.f44674m.m(this.f44662a.getResources().getString(a7.j.f13248f1));
            if (!this.f44687z) {
                context = this.f44662a;
                resources = context.getResources();
                i9 = a7.j.f13248f1;
                Toast.makeText(context, resources.getString(i9), 0).show();
            }
        }
        NotificationManager notificationManager = (NotificationManager) this.f44662a.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        this.f44671j = notificationManager;
        if (notificationManager != null) {
            notificationManager.notify(455, this.f44674m.c());
        }
    }
}
