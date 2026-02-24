package com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters;

import a7.b;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.core.model.ModelIdentifier;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase.ClientSharepreferenceHandler;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.activities.BuyNowActivity;
import com.nst.iptvsmarterstvbox.WHMCSClientapp.modelclassess.InvoicesModelClass;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UnpaidAdapter extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f28500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f28501e;

    public class ViewHolder extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public CardView f28508A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public TextView f28509B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public TextView f28510C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public TextView f28511D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public TextView f28512E;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f28514t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Animation f28515u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Animation f28516v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ImageView f28517w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public LinearLayout f28518x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public RelativeLayout f28519y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public LinearLayout f28520z;

        public ViewHolder(View view) {
            super(view);
            this.f28514t = 200;
            this.f28517w = (ImageView) view.findViewById(f.f12101B4);
            this.f28510C = (TextView) view.findViewById(f.Fj);
            this.f28511D = (TextView) view.findViewById(f.Gj);
            this.f28512E = (TextView) view.findViewById(f.Hj);
            this.f28518x = (LinearLayout) view.findViewById(f.f12478n6);
            this.f28520z = (LinearLayout) view.findViewById(f.f12409g8);
            this.f28519y = (RelativeLayout) view.findViewById(f.gf);
            this.f28508A = (CardView) view.findViewById(f.f12138F1);
            this.f28509B = (TextView) view.findViewById(f.Ij);
            this.f28515u = AnimationUtils.loadAnimation(UnpaidAdapter.this.f28500d, b.f11835m);
            this.f28516v = AnimationUtils.loadAnimation(UnpaidAdapter.this.f28500d, b.f11834l);
        }
    }

    public class focusChange implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28521a;

        public focusChange(View view) {
            this.f28521a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28521a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28521a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28521a, "scaleY", f9);
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
                Log.e("id is", "" + this.f28521a.getTag());
                view2 = this.f28521a;
                i9 = e.f12041o2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.01f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f28521a;
                i9 = e.f12081y2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public UnpaidAdapter(Context context, List list) {
        this.f28500d = context;
        this.f28501e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void E(ViewHolder viewHolder, int i9) {
        List list = this.f28501e;
        if (list != null && !list.isEmpty() && this.f28501e.size() > 0) {
            String strA = ((InvoicesModelClass.Invoices.Invoice) this.f28501e.get(i9)).a();
            if (strA == null || strA.isEmpty() || strA.equalsIgnoreCase("")) {
                viewHolder.f28511D.setText(j.f13206b);
            } else {
                viewHolder.f28510C.setText(strA);
            }
            String strB = ((InvoicesModelClass.Invoices.Invoice) this.f28501e.get(i9)).b();
            if (strB == null || strB.isEmpty() || strB.equalsIgnoreCase("")) {
                viewHolder.f28511D.setText(j.f13206b);
            } else {
                viewHolder.f28511D.setText(strB);
            }
        }
        String strE = ((InvoicesModelClass.Invoices.Invoice) this.f28501e.get(i9)).e();
        if (strE == null || strE.equalsIgnoreCase("") || strE.isEmpty()) {
            viewHolder.f28512E.setText(j.f13206b);
        } else {
            viewHolder.f28512E.setText(ClientSharepreferenceHandler.d(this.f28500d) + strE + ClientSharepreferenceHandler.e(this.f28500d));
        }
        String strC = ((InvoicesModelClass.Invoices.Invoice) this.f28501e.get(i9)).c();
        if (strC == null || strC.isEmpty() || strC.equalsIgnoreCase("")) {
            viewHolder.f28509B.setText(this.f28500d.getResources().getString(j.f13057L3));
        } else {
            viewHolder.f28509B.setText(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strC);
        }
        final String strC2 = ((InvoicesModelClass.Invoices.Invoice) this.f28501e.get(i9)).c();
        final String strD = ((InvoicesModelClass.Invoices.Invoice) this.f28501e.get(i9)).d();
        viewHolder.f28518x.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.UnpaidAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(UnpaidAdapter.this.f28500d, (Class<?>) BuyNowActivity.class);
                intent.setAction("Invoice_action");
                intent.putExtra("invoice_id", strC2);
                intent.putExtra("status", strD);
                UnpaidAdapter.this.f28500d.startActivity(intent);
            }
        });
        viewHolder.f28508A.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters.UnpaidAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(UnpaidAdapter.this.f28500d, (Class<?>) BuyNowActivity.class);
                intent.setAction("Invoice_action");
                intent.putExtra("invoice_id", strC2);
                intent.putExtra("status", strD);
                UnpaidAdapter.this.f28500d.startActivity(intent);
            }
        });
        CardView cardView = viewHolder.f28508A;
        cardView.setOnFocusChangeListener(new focusChange(cardView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public ViewHolder L(ViewGroup viewGroup, int i9) {
        return new ViewHolder(LayoutInflater.from(this.f28500d).inflate(g.f12732V3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f28501e.size();
    }
}
