package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.i;

/* JADX INFO: loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f13802a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.a f13803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f13804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i.a f13805e;

    public f(e eVar) {
        this.f13802a = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f13803c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void b(e eVar, boolean z9) {
        if (z9 || eVar == this.f13802a) {
            a();
        }
        i.a aVar = this.f13805e;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean c(e eVar) {
        i.a aVar = this.f13805e;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f13802a;
        a.C0158a c0158a = new a.C0158a(eVar.u());
        c cVar = new c(c0158a.getContext(), c.g.f17886j);
        this.f13804d = cVar;
        cVar.d(this);
        this.f13802a.b(this.f13804d);
        c0158a.a(this.f13804d.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            c0158a.c(viewY);
        } else {
            c0158a.e(eVar.w()).setTitle(eVar.x());
        }
        c0158a.i(this);
        androidx.appcompat.app.a aVarCreate = c0158a.create();
        this.f13803c = aVarCreate;
        aVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f13803c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f13803c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i9) {
        this.f13802a.L((g) this.f13804d.a().getItem(i9), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f13804d.b(this.f13802a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i9 == 82 || i9 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f13803c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f13803c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f13802a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f13802a.performShortcut(i9, keyEvent, 0);
    }
}
