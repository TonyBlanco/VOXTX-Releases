package a7;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import q7.C2632p;

/* JADX INFO: renamed from: a7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1114a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PopupWindow f11819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f11820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f11821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2632p f11822d;

    public void a(List list) {
        this.f11822d.j0(list);
    }

    public void b(Context context) {
        if (this.f11819a == null) {
            View viewInflate = LayoutInflater.from(context).inflate(g.f12757Z4, (ViewGroup) null);
            this.f11820b = viewInflate;
            this.f11821c = (RecyclerView) viewInflate.findViewById(f.Ff);
            C2632p c2632p = new C2632p(context, new ArrayList());
            this.f11822d = c2632p;
            this.f11821c.setAdapter(c2632p);
            this.f11821c.setLayoutManager(new LinearLayoutManager(context));
            this.f11820b.setFocusable(true);
            this.f11820b.setFocusableInTouchMode(true);
            PopupWindow popupWindow = new PopupWindow(this.f11820b);
            this.f11819a = popupWindow;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.f11819a.setFocusable(true);
            this.f11819a.setOutsideTouchable(false);
            this.f11819a.setTouchable(true);
        }
    }

    public void c(C2632p.b bVar) {
        this.f11822d.p0(bVar);
    }

    public void d(View view) {
        if (this.f11819a.isShowing()) {
            this.f11819a.dismiss();
            return;
        }
        this.f11820b.measure(0, 0);
        this.f11819a.showAsDropDown(view, (view.getMeasuredWidth() - this.f11820b.getMeasuredWidth()) / 2, 0);
        this.f11819a.update(view, this.f11820b.getMeasuredWidth(), this.f11820b.getMeasuredHeight());
    }
}
