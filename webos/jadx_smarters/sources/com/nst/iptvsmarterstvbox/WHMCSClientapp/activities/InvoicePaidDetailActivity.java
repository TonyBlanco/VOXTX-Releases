package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a7.f;
import a7.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.appcompat.app.b;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;

/* JADX INFO: loaded from: classes.dex */
public class InvoicePaidDetailActivity extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f28207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f28208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f28209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28210g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28211h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28212i = "";

    private void u1() {
        if (this.f28210g != null) {
            WebView webView = (WebView) findViewById(f.Vm);
            this.f28207d = webView;
            webView.loadUrl("https://cms.alldrama.tv/viewinvoice.php?id=" + this.f28210g + "&loginemail=" + ClientSharepreferenceHandler.c(this.f28209f) + "&api_username=OUBQqC6334OcxjS&gotourl=viewinvoice.php?id=" + this.f28210g);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, (Class<?>) MyInvoiceActivity.class));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == f.f12401g0) {
            startActivity(this.f28211h.equalsIgnoreCase("paid") ? new Intent(this, (Class<?>) PaidInvoiceActivity.class) : this.f28211h.equalsIgnoreCase("Unpaid") ? new Intent(this, (Class<?>) UnpiadInvoiceActivity.class) : this.f28211h.equalsIgnoreCase("Cancelled") ? new Intent(this, (Class<?>) CancelInvoiceActivity.class) : this.f28211h.equalsIgnoreCase("Refund") ? new Intent(this, (Class<?>) InvoiceRefundedActivity.class) : new Intent(this, (Class<?>) MyInvoiceActivity.class));
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12692P);
        this.f28207d = (WebView) findViewById(f.Vm);
        this.f28208e = (Button) findViewById(f.f12401g0);
        this.f28209f = this;
        Intent intent = getIntent();
        this.f28211h = intent.getStringExtra("status");
        this.f28210g = intent.getStringExtra("invoice_id");
        u1();
    }
}
