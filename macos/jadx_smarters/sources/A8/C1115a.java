package a8;

import V7.c;
import V7.d;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: a8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1115a implements Z7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13478b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PopupWindow f13479c;

    public C1115a(Context context) {
        this.f13477a = context;
    }

    @Override // Z7.a
    public void a(View view) {
        PopupWindow popupWindowB = b();
        this.f13479c = popupWindowB;
        popupWindowB.showAsDropDown(view, 0, (-this.f13477a.getResources().getDimensionPixelSize(V7.a.f10129a)) * 4);
        if (this.f13478b.size() == 0) {
            Log.e(Z7.a.class.getName(), "The menu is empty");
        }
    }

    public final PopupWindow b() {
        LayoutInflater layoutInflater = (LayoutInflater) this.f13477a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            throw new RuntimeException("can't access LAYOUT_INFLATER_SERVICE");
        }
        View viewInflate = layoutInflater.inflate(d.f10153c, (ViewGroup) null);
        c((RecyclerView) viewInflate.findViewById(c.f10144k));
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        popupWindow.setFocusable(true);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setContentView(viewInflate);
        return popupWindow;
    }

    public final void c(RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f13477a));
        recyclerView.setAdapter(new b(this.f13477a, this.f13478b));
    }
}
