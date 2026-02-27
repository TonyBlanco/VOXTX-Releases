package com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters;

import a7.e;
import a7.f;
import a7.g;
import a7.j;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.BuyNowActivity;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class InvoiceAdapter extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f28450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f28451e;

    public class ViewHolder extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public LinearLayout f28455t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public CardView f28456u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f28457v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public TextView f28458w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f28459x;

        public ViewHolder(View view) {
            super(view);
            this.f28457v = (TextView) view.findViewById(f.Fj);
            this.f28458w = (TextView) view.findViewById(f.Gj);
            this.f28459x = (TextView) view.findViewById(f.Hj);
            this.f28455t = (LinearLayout) view.findViewById(f.f12478n6);
            this.f28456u = (CardView) view.findViewById(f.f12138F1);
        }
    }

    public class focusChange implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28461a;

        public focusChange(View view) {
            this.f28461a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28461a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28461a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28461a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.01f : 1.0f;
                b(f9);
                c(f9);
                Log.e("id is", "" + this.f28461a.getTag());
                view2 = this.f28461a;
                i9 = e.f12057s2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.01f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f28461a;
                i9 = e.f12053r2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void E(ViewHolder viewHolder, int i9) {
        String strA = ((InvoicesModelClass.Invoices.Invoice) this.f28451e.get(i9)).a();
        if (strA == null || strA.equalsIgnoreCase("")) {
            viewHolder.f28457v.setText(j.f13206b);
        } else {
            viewHolder.f28457v.setText(strA);
        }
        String strB = ((InvoicesModelClass.Invoices.Invoice) this.f28451e.get(i9)).b();
        if (strB == null || strB.equalsIgnoreCase("")) {
            viewHolder.f28458w.setText(j.f13206b);
        } else {
            viewHolder.f28458w.setText(strB);
        }
        String strE = ((InvoicesModelClass.Invoices.Invoice) this.f28451e.get(i9)).e();
        if (strE == null || strE.equalsIgnoreCase("")) {
            viewHolder.f28459x.setText(j.f13206b);
        } else {
            viewHolder.f28459x.setText(ClientSharepreferenceHandler.d(this.f28450d) + strE + ClientSharepreferenceHandler.e(this.f28450d));
        }
        final String strC = ((InvoicesModelClass.Invoices.Invoice) this.f28451e.get(i9)).c();
        final String strD = ((InvoicesModelClass.Invoices.Invoice) this.f28451e.get(i9)).d();
        viewHolder.f28455t.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.InvoiceAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(InvoiceAdapter.this.f28450d, (Class<?>) BuyNowActivity.class);
                intent.setAction("Invoice_action");
                intent.putExtra("invoice_id", strC);
                intent.putExtra("status", strD);
                InvoiceAdapter.this.f28450d.startActivity(intent);
            }
        });
        CardView cardView = viewHolder.f28456u;
        cardView.setOnFocusChangeListener(new focusChange(cardView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public ViewHolder L(ViewGroup viewGroup, int i9) {
        return new ViewHolder(LayoutInflater.from(this.f28450d).inflate(g.f12732V3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f28451e.size();
    }
}
