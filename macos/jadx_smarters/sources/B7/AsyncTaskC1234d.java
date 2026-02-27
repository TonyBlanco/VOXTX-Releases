package b7;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: b7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class AsyncTaskC1234d extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1231a f17697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1233c f17698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17700d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f17701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f17704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f17705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Dialog f17706j;

    /* JADX INFO: renamed from: b7.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncTaskC1234d asyncTaskC1234d = AsyncTaskC1234d.this;
            asyncTaskC1234d.d(asyncTaskC1234d.f17701e, "Loading data...");
        }
    }

    /* JADX INFO: renamed from: b7.d$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: b7.d$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public AsyncTaskC1234d(Context context, String str, int i9, InterfaceC1233c interfaceC1233c, String str2, List list, Boolean bool) {
        this.f17701e = context;
        this.f17702f = str;
        this.f17699c = i9;
        this.f17698b = interfaceC1233c;
        this.f17703g = str2;
        this.f17704h = list;
        this.f17705i = bool;
    }

    public void a() {
        try {
            Dialog dialog = this.f17706j;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            this.f17706j.cancel();
        } catch (Exception unused) {
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        String strA = null;
        try {
            strA = C1231a.a(this.f17701e, this.f17702f, this.f17699c, this.f17703g, this.f17704h);
            if (strA != null) {
                this.f17700d = true;
            } else {
                new Handler(Looper.getMainLooper()).post(new b());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return strA;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        try {
            if (this.f17700d) {
                if (str == null) {
                    new Handler(Looper.getMainLooper()).post(new c());
                }
                this.f17698b.K0(str, this.f17699c, this.f17700d);
            } else {
                this.f17698b.b0(this.f17699c);
            }
        } catch (Exception unused) {
        }
        if (this.f17705i.booleanValue()) {
            try {
                a();
            } catch (Exception unused2) {
            }
        }
    }

    public void d(Context context, String str) {
        Dialog dialog = new Dialog(context, R.style.Theme.Translucent.NoTitleBar);
        this.f17706j = dialog;
        dialog.setContentView(a7.g.f12850o3);
        this.f17706j.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f17706j.setCancelable(false);
        ((TextView) this.f17706j.findViewById(a7.f.ob)).setText(str);
        try {
            if (((Activity) this.f17701e).isFinishing()) {
                Log.e("FINISHED", "FINISHED");
            } else {
                this.f17706j.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        this.f17697a = new C1231a();
        if (this.f17705i.booleanValue()) {
            try {
                Dialog dialog = this.f17706j;
                if (dialog != null && dialog.isShowing()) {
                    a();
                }
                new Handler(Looper.getMainLooper()).post(new a());
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }
}
