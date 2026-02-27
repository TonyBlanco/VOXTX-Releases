package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f13769a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13770c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f13773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13774g;

    public d(e eVar, LayoutInflater layoutInflater, boolean z9, int i9) {
        this.f13772e = z9;
        this.f13773f = layoutInflater;
        this.f13769a = eVar;
        this.f13774g = i9;
        a();
    }

    public void a() {
        g gVarV = this.f13769a.v();
        if (gVarV != null) {
            ArrayList arrayListZ = this.f13769a.z();
            int size = arrayListZ.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((g) arrayListZ.get(i9)) == gVarV) {
                    this.f13770c = i9;
                    return;
                }
            }
        }
        this.f13770c = -1;
    }

    public e b() {
        return this.f13769a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i9) {
        ArrayList arrayListZ = this.f13772e ? this.f13769a.z() : this.f13769a.E();
        int i10 = this.f13770c;
        if (i10 >= 0 && i9 >= i10) {
            i9++;
        }
        return (g) arrayListZ.get(i9);
    }

    public void d(boolean z9) {
        this.f13771d = z9;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListZ = this.f13772e ? this.f13769a.z() : this.f13769a.E();
        int i9 = this.f13770c;
        int size = arrayListZ.size();
        return i9 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i9) {
        return i9;
    }

    @Override // android.widget.Adapter
    public View getView(int i9, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13773f.inflate(this.f13774g, viewGroup, false);
        }
        int groupId = getItem(i9).getGroupId();
        int i10 = i9 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f13769a.F() && groupId != (i10 >= 0 ? getItem(i10).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.f13771d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i9), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
