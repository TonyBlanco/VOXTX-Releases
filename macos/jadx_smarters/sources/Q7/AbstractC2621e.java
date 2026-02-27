package q7;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: q7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2621e extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f48275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f48276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public I f48277f;

    public AbstractC2621e(Context context, ArrayList arrayList) {
        this.f48275d = context;
        this.f48276e = arrayList;
    }

    public void j0(List list) {
        this.f48276e.clear();
        this.f48276e.addAll(list);
        w();
    }

    public void k0(I i9) {
        this.f48277f = i9;
    }
}
