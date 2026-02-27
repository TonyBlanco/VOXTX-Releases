package q7;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class f0 extends androidx.fragment.app.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f48324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f48325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f48326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f48327k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f48328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.fragment.app.m f48329m;

    public f0(List list, androidx.fragment.app.m mVar, Context context) {
        super(mVar);
        this.f48329m = mVar;
        this.f48328l = new HashMap();
        int size = list.size();
        this.f48325i = size;
        this.f48326j = new String[size];
        this.f48327k = new String[size];
        this.f48324h = context;
        for (int i9 = 0; i9 < this.f48325i; i9++) {
            String liveStreamCategoryName = ((LiveStreamCategoryIdDBModel) list.get(i9)).getLiveStreamCategoryName();
            String liveStreamCategoryID = ((LiveStreamCategoryIdDBModel) list.get(i9)).getLiveStreamCategoryID();
            this.f48326j[i9] = liveStreamCategoryName;
            this.f48327k[i9] = liveStreamCategoryID;
        }
    }

    @Override // N0.a
    public int c() {
        return this.f48325i;
    }

    @Override // N0.a
    public CharSequence e(int i9) {
        return this.f48326j[i9];
    }

    @Override // androidx.fragment.app.r, N0.a
    public Object g(ViewGroup viewGroup, int i9) {
        Object objG = super.g(viewGroup, i9);
        if (objG instanceof Fragment) {
            this.f48328l.put(Integer.valueOf(i9), ((Fragment) objG).getTag());
        }
        return objG;
    }

    @Override // androidx.fragment.app.r
    public Fragment p(int i9) {
        return s7.j.Z(this.f48327k[i9]);
    }
}
