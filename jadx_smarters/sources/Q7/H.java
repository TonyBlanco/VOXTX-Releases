package q7;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s7.C2748a;

/* JADX INFO: loaded from: classes4.dex */
public class H extends androidx.fragment.app.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f47224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f47225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f47226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f47227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f47228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.fragment.app.m f47229m;

    public H(List list, androidx.fragment.app.m mVar, Context context) {
        super(mVar);
        this.f47229m = mVar;
        this.f47228l = new HashMap();
        int size = list.size();
        this.f47225i = size;
        this.f47226j = new String[size];
        this.f47227k = new String[size];
        this.f47224h = context;
        for (int i9 = 0; i9 < this.f47225i; i9++) {
            String liveStreamCategoryName = ((LiveStreamCategoryIdDBModel) list.get(i9)).getLiveStreamCategoryName();
            String liveStreamCategoryID = ((LiveStreamCategoryIdDBModel) list.get(i9)).getLiveStreamCategoryID();
            this.f47226j[i9] = liveStreamCategoryName;
            this.f47227k[i9] = liveStreamCategoryID;
        }
    }

    @Override // N0.a
    public int c() {
        return this.f47225i;
    }

    @Override // N0.a
    public CharSequence e(int i9) {
        return this.f47226j[i9];
    }

    @Override // androidx.fragment.app.r, N0.a
    public Object g(ViewGroup viewGroup, int i9) {
        Object objG = super.g(viewGroup, i9);
        if (objG instanceof Fragment) {
            this.f47228l.put(Integer.valueOf(i9), ((Fragment) objG).getTag());
        }
        return objG;
    }

    @Override // androidx.fragment.app.r
    public Fragment p(int i9) {
        return C2748a.D(this.f47227k[i9], this.f47226j[i9]);
    }
}
