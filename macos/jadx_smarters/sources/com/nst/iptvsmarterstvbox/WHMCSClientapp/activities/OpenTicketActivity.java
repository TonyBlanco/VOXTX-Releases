package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.e;
import a7.f;
import a7.g;
import a7.j;
import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiService;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.DepartmentClass;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.OpenDepartmentClass;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class OpenTicketActivity extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f28282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Spinner f28284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Spinner f28286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f28288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f28289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f28290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f28291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f28292n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String[] f28294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f28295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f28296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f28297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f28298t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f28293o = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Thread f28299u = null;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    OpenTicketActivity.this.y1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Activity f28305b;

        public OnFocusChangeAccountListener(View view, Activity activity) {
            this.f28304a = view;
            this.f28305b = activity;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28304a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28304a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            int i9;
            if (this.f28305b != null) {
                if (z9) {
                    float f9 = z9 ? 1.03f : 1.0f;
                    View view2 = this.f28304a;
                    if (view2 == null || view2.getTag() == null || !this.f28304a.getTag().equals("1")) {
                        View view3 = this.f28304a;
                        if (view3 == null || view3.getTag() == null || !this.f28304a.getTag().equals("2")) {
                            View view4 = this.f28304a;
                            if (view4 == null || view4.getTag() == null || !this.f28304a.getTag().equals("3")) {
                                view.setBackground(this.f28305b.getResources().getDrawable(e.f11923I1));
                                return;
                            } else {
                                a(f9);
                                b(f9);
                                i9 = e.f12042p;
                            }
                        } else {
                            a(f9);
                            b(f9);
                            i9 = e.f12024k1;
                        }
                    } else {
                        a(f9);
                        b(f9);
                        i9 = e.f12010h;
                    }
                } else {
                    if (z9) {
                        return;
                    }
                    a(1.0f);
                    b(1.0f);
                    View view5 = this.f28304a;
                    if (view5 != null && view5.getTag() != null && this.f28304a.getTag().equals("1")) {
                        view.setBackgroundResource(e.f12038o);
                    }
                    View view6 = this.f28304a;
                    if (view6 != null && view6.getTag() != null && this.f28304a.getTag().equals("2")) {
                        view.setBackgroundResource(e.f12038o);
                    }
                    View view7 = this.f28304a;
                    if (view7 == null || view7.getTag() == null || !this.f28304a.getTag().equals("3")) {
                        return;
                    } else {
                        i9 = e.f12038o;
                    }
                }
                view.setBackgroundResource(i9);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.f12207M0) {
            z1();
        } else if (id == f.f12482o0) {
            onBackPressed();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12805h0);
        this.f28282d = (EditText) findViewById(f.f12546u3);
        this.f28283e = (TextView) findViewById(f.Bi);
        this.f28284f = (Spinner) findViewById(f.og);
        this.f28285g = (TextView) findViewById(f.Xk);
        this.f28286h = (Spinner) findViewById(f.rg);
        this.f28287i = (TextView) findViewById(f.ck);
        this.f28288j = (EditText) findViewById(f.f12414h3);
        this.f28289k = (Button) findViewById(f.f12207M0);
        this.f28290l = (Button) findViewById(f.f12482o0);
        this.f28291m = (TextView) findViewById(f.gh);
        this.f28292n = (TextView) findViewById(f.f12129E2);
        this.f28296r = this;
        Button button = this.f28289k;
        button.setOnFocusChangeListener(new OnFocusChangeAccountListener(button, this));
        Button button2 = this.f28290l;
        button2.setOnFocusChangeListener(new OnFocusChangeAccountListener(button2, this));
        Thread thread = this.f28299u;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28299u = thread2;
            thread2.start();
        }
        u1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28299u;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28299u.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28299u;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28299u = thread2;
            thread2.start();
        }
    }

    public final void u1() {
        w.M0(this);
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).c("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetSupportDepartments", "no", ClientSharepreferenceHandler.a(this)).enqueue(new Callback<DepartmentClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.OpenTicketActivity.1
            @Override // retrofit2.Callback
            public void onFailure(Call<DepartmentClass> call, Throwable th) {
                w.X();
                Toast.makeText(OpenTicketActivity.this.f28296r, "Network error occured! Please try again", 0).show();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<DepartmentClass> call, Response<DepartmentClass> response) {
                w.X();
                if (response.body() == null || !response.body().b().equals("success")) {
                    if (response.body() == null || !response.body().b().equals("error")) {
                        return;
                    }
                    Toast.makeText(OpenTicketActivity.this.getApplicationContext(), "Error", 0).show();
                    return;
                }
                List listA = response.body().a().a();
                if (listA != null) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        OpenTicketActivity.this.f28293o.add(((DepartmentClass.Departments.Department) it.next()).b());
                    }
                    OpenTicketActivity.this.f28294p = new String[listA.size()];
                    OpenTicketActivity.this.f28295q = new HashMap();
                    for (int i9 = 0; i9 < listA.size(); i9++) {
                        OpenTicketActivity.this.f28295q.put(Integer.valueOf(i9), String.valueOf(((DepartmentClass.Departments.Department) listA.get(i9)).a()));
                        OpenTicketActivity.this.f28294p[i9] = String.valueOf(((DepartmentClass.Departments.Department) listA.get(i9)).b());
                    }
                    if (OpenTicketActivity.this.f28296r == null || OpenTicketActivity.this.f28284f == null) {
                        return;
                    }
                    OpenTicketActivity openTicketActivity = OpenTicketActivity.this;
                    ArrayAdapter arrayAdapter = new ArrayAdapter(openTicketActivity, R.layout.simple_list_item_1, openTicketActivity.f28294p);
                    arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
                    OpenTicketActivity.this.f28284f.setAdapter((SpinnerAdapter) arrayAdapter);
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        });
    }

    public final void v1(String str, String str2, String str3, int i9) {
        w.M0(this);
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).e("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "OpenTicket", str, str3, i9, str2).enqueue(new Callback<OpenDepartmentClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.OpenTicketActivity.2
            @Override // retrofit2.Callback
            public void onFailure(Call<OpenDepartmentClass> call, Throwable th) {
                w.X();
                Toast.makeText(OpenTicketActivity.this.f28296r, "Network error occured! Please try again", 0).show();
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<OpenDepartmentClass> call, Response<OpenDepartmentClass> response) {
                w.X();
                if (!response.isSuccessful() || response.body() == null || !response.body().a().equals("success")) {
                    if (response.body().a().equals("error")) {
                        Toast.makeText(OpenTicketActivity.this.getApplicationContext(), "Error", 0).show();
                    }
                } else {
                    Toast.makeText(OpenTicketActivity.this.getApplicationContext(), OpenTicketActivity.this.f28296r.getResources().getString(j.f13159V7), 0).show();
                    Intent intent = new Intent(OpenTicketActivity.this, (Class<?>) MyTicketActivity.class);
                    intent.setAction("updateticket");
                    intent.setFlags(67108864);
                    OpenTicketActivity.this.startActivity(intent);
                    OpenTicketActivity.this.finish();
                }
            }
        });
    }

    public void y1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.OpenTicketActivity.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(OpenTicketActivity.this.f28296r);
                    String strA = w.A(string);
                    TextView textView = OpenTicketActivity.this.f28291m;
                    if (textView != null) {
                        textView.setText(strR);
                    }
                    TextView textView2 = OpenTicketActivity.this.f28292n;
                    if (textView2 != null) {
                        textView2.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void z1() {
        Context applicationContext;
        Resources resources;
        int i9;
        String string;
        int iA = ClientSharepreferenceHandler.a(this.f28296r);
        String strTrim = this.f28288j.getText().toString().trim();
        this.f28297s = this.f28284f.getSelectedItem().toString();
        this.f28298t = this.f28286h.getSelectedItem().toString();
        String strTrim2 = this.f28282d.getText().toString().trim();
        if (!strTrim2.isEmpty()) {
            String str = this.f28297s;
            if (str == null || !str.equalsIgnoreCase("")) {
                String str2 = this.f28298t;
                if (str2 != null && str2.equalsIgnoreCase("")) {
                    applicationContext = this.f28296r;
                    string = "Please select priority";
                } else if (strTrim == null || !strTrim.isEmpty()) {
                    v1(strTrim, strTrim2, (String) this.f28295q.get(Integer.valueOf(this.f28284f.getSelectedItemPosition())), iA);
                    return;
                } else {
                    applicationContext = getApplicationContext();
                    resources = this.f28296r.getResources();
                    i9 = j.f13378s1;
                }
            } else {
                applicationContext = this.f28296r;
                string = "Please select Department";
            }
            Toast.makeText(applicationContext, string, 0).show();
        }
        applicationContext = getApplicationContext();
        resources = this.f28296r.getResources();
        i9 = j.f13448z1;
        string = resources.getString(i9);
        Toast.makeText(applicationContext, string, 0).show();
    }
}
