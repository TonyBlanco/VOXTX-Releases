package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import c.AbstractC1238a;
import d.DialogC1642u;

/* JADX INFO: loaded from: classes.dex */
public class a extends DialogC1642u implements DialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AlertController f13672a;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0158a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.f f13673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13674b;

        public C0158a(Context context) {
            this(context, a.g(context, 0));
        }

        public C0158a(Context context, int i9) {
            this.f13673a = new AlertController.f(new ContextThemeWrapper(context, a.g(context, i9)));
            this.f13674b = i9;
        }

        public C0158a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f13673a;
            fVar.f13655w = listAdapter;
            fVar.f13656x = onClickListener;
            return this;
        }

        public C0158a b(boolean z9) {
            this.f13673a.f13650r = z9;
            return this;
        }

        public C0158a c(View view) {
            this.f13673a.f13639g = view;
            return this;
        }

        public a create() {
            a aVar = new a(this.f13673a.f13633a, this.f13674b);
            this.f13673a.a(aVar.f13672a);
            aVar.setCancelable(this.f13673a.f13650r);
            if (this.f13673a.f13650r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f13673a.f13651s);
            aVar.setOnDismissListener(this.f13673a.f13652t);
            DialogInterface.OnKeyListener onKeyListener = this.f13673a.f13653u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public C0158a d(int i9) {
            this.f13673a.f13635c = i9;
            return this;
        }

        public C0158a e(Drawable drawable) {
            this.f13673a.f13636d = drawable;
            return this;
        }

        public C0158a f(CharSequence charSequence) {
            this.f13673a.f13640h = charSequence;
            return this;
        }

        public C0158a g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f13673a;
            fVar.f13644l = charSequence;
            fVar.f13646n = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f13673a.f13633a;
        }

        public C0158a h(DialogInterface.OnDismissListener onDismissListener) {
            this.f13673a.f13652t = onDismissListener;
            return this;
        }

        public C0158a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f13673a.f13653u = onKeyListener;
            return this;
        }

        public C0158a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f13673a;
            fVar.f13641i = charSequence;
            fVar.f13643k = onClickListener;
            return this;
        }

        public C0158a k(ListAdapter listAdapter, int i9, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f13673a;
            fVar.f13655w = listAdapter;
            fVar.f13656x = onClickListener;
            fVar.f13626I = i9;
            fVar.f13625H = true;
            return this;
        }

        public C0158a l(CharSequence[] charSequenceArr, int i9, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f13673a;
            fVar.f13654v = charSequenceArr;
            fVar.f13656x = onClickListener;
            fVar.f13626I = i9;
            fVar.f13625H = true;
            return this;
        }

        public C0158a m(int i9) {
            AlertController.f fVar = this.f13673a;
            fVar.f13638f = fVar.f13633a.getText(i9);
            return this;
        }

        public a n() {
            a aVarCreate = create();
            aVarCreate.show();
            return aVarCreate;
        }

        public C0158a setNegativeButton(int i9, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f13673a;
            fVar.f13644l = fVar.f13633a.getText(i9);
            this.f13673a.f13646n = onClickListener;
            return this;
        }

        public C0158a setPositiveButton(int i9, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f13673a;
            fVar.f13641i = fVar.f13633a.getText(i9);
            this.f13673a.f13643k = onClickListener;
            return this;
        }

        public C0158a setTitle(CharSequence charSequence) {
            this.f13673a.f13638f = charSequence;
            return this;
        }

        public C0158a setView(View view) {
            AlertController.f fVar = this.f13673a;
            fVar.f13658z = view;
            fVar.f13657y = 0;
            fVar.f13622E = false;
            return this;
        }
    }

    public a(Context context, int i9) {
        super(context, g(context, i9));
        this.f13672a = new AlertController(getContext(), this, getWindow());
    }

    public static int g(Context context, int i9) {
        if (((i9 >>> 24) & 255) >= 1) {
            return i9;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1238a.f17753l, typedValue, true);
        return typedValue.resourceId;
    }

    public Button e(int i9) {
        return this.f13672a.c(i9);
    }

    public ListView f() {
        return this.f13672a.e();
    }

    @Override // d.DialogC1642u, androidx.activity.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13672a.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (this.f13672a.h(i9, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (this.f13672a.i(i9, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i9, keyEvent);
    }

    @Override // d.DialogC1642u, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f13672a.r(charSequence);
    }
}
