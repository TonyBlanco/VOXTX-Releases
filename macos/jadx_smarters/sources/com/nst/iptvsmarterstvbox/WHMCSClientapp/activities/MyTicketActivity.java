package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.f;
import a7.g;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.TicketAdapter;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiService;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces.ApiclientRetrofit;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.TicketModelClass;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public class MyTicketActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f28269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f28270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f28272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f28273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SpinKitView f28274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28275j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f28276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView.g f28277l;

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28280a;

        public OnFocusChangeAccountListener(View view) {
            this.f28280a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28280a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28280a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28280a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            if (!z9) {
                if (z9 || !this.f28280a.getTag().equals("7")) {
                    return;
                }
                f9 = z9 ? 1.25f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                return;
            }
            Log.e("id is", "" + this.f28280a.getTag());
            if (this.f28280a.getTag().equals("7")) {
                f9 = z9 ? 1.25f : 1.0f;
                b(f9);
                c(f9);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12787e0);
        this.f28269d = (RecyclerView) findViewById(f.Cd);
        this.f28270e = (ImageView) findViewById(f.f12396f5);
        this.f28271f = (TextView) findViewById(f.Bk);
        this.f28272g = (LinearLayout) findViewById(f.F9);
        this.f28273h = (LinearLayout) findViewById(f.f12449k8);
        this.f28274i = (SpinKitView) findViewById(f.Mc);
        this.f28276k = this;
        ImageView imageView = this.f28270e;
        imageView.setOnFocusChangeListener(new OnFocusChangeAccountListener(imageView));
        String action = getIntent().getAction();
        if (action != null && action.equalsIgnoreCase("updateticket") && !this.f28275j) {
            x1();
            this.f28275j = true;
        }
        this.f28270e.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.MyTicketActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MyTicketActivity.this.startActivity(new Intent(MyTicketActivity.this, (Class<?>) OpenTicketActivity.class));
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f28275j) {
            return;
        }
        x1();
        this.f28275j = true;
    }

    public final void x1() {
        ((ApiService) ApiclientRetrofit.a().create(ApiService.class)).b("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetTickets", "no", ClientSharepreferenceHandler.a(this.f28276k)).enqueue(new Callback<TicketModelClass>() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.MyTicketActivity.2
            @Override // retrofit2.Callback
            public void onFailure(Call<TicketModelClass> call, Throwable th) {
                Toast.makeText(MyTicketActivity.this, "Network error occured! Please try again", 0).show();
                MyTicketActivity.this.y1(Boolean.FALSE);
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<TicketModelClass> call, Response<TicketModelClass> response) {
                if (response.body() != null && response.isSuccessful() && response.body() != null && response.body().a().equalsIgnoreCase("success")) {
                    MyTicketActivity.this.y1(Boolean.TRUE);
                    if (response.body().b() != null) {
                        List listA = response.body().b().a();
                        MyTicketActivity myTicketActivity = MyTicketActivity.this;
                        myTicketActivity.f28269d.setLayoutManager(new GridLayoutManager(myTicketActivity, 2));
                        if (listA == null || listA.size() <= 0) {
                            return;
                        }
                        MyTicketActivity myTicketActivity2 = MyTicketActivity.this;
                        myTicketActivity2.f28277l = new TicketAdapter(listA, myTicketActivity2.f28276k);
                        MyTicketActivity myTicketActivity3 = MyTicketActivity.this;
                        myTicketActivity3.f28269d.setAdapter(myTicketActivity3.f28277l);
                        MyTicketActivity.this.f28277l.w();
                        return;
                    }
                }
                MyTicketActivity.this.y1(Boolean.FALSE);
            }
        });
    }

    public void y1(Boolean bool) {
        (bool.booleanValue() ? this.f28269d : this.f28271f).setVisibility(0);
        this.f28274i.setVisibility(8);
    }
}
