package d;

import P.AbstractC0975q;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import c.AbstractC1238a;
import i.AbstractC1872b;

/* JADX INFO: renamed from: d.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC1642u extends androidx.activity.g implements InterfaceC1623b {
    private AbstractC1625d mDelegate;
    private final AbstractC0975q.a mKeyDispatcher;

    public DialogC1642u(Context context, int i9) {
        super(context, d(context, i9));
        this.mKeyDispatcher = new AbstractC0975q.a() { // from class: d.t
            @Override // P.AbstractC0975q.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f39419a.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC1625d delegate = getDelegate();
        delegate.M(d(context, i9));
        delegate.x(null);
    }

    public static int d(Context context, int i9) {
        if (i9 != 0) {
            return i9;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1238a.f17766y, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0975q.e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i9) {
        return (T) getDelegate().j(i9);
    }

    public AbstractC1625d getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC1625d.i(this, this);
        }
        return this.mDelegate;
    }

    public AbstractC1622a getSupportActionBar() {
        return getDelegate().r();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().t();
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().s();
        super.onCreate(bundle);
        getDelegate().x(bundle);
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().D();
    }

    @Override // d.InterfaceC1623b
    public void onSupportActionModeFinished(AbstractC1872b abstractC1872b) {
    }

    @Override // d.InterfaceC1623b
    public void onSupportActionModeStarted(AbstractC1872b abstractC1872b) {
    }

    @Override // d.InterfaceC1623b
    public AbstractC1872b onWindowStartingSupportActionMode(AbstractC1872b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i9) {
        getDelegate().H(i9);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().I(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().J(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i9) {
        super.setTitle(i9);
        getDelegate().N(getContext().getString(i9));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().N(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i9) {
        return getDelegate().G(i9);
    }
}
