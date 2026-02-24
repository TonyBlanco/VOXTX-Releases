package q7;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b0 extends androidx.fragment.app.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f48164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f48166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f48167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f48168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f48169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f48170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f48171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Context f48172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f48173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f48174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f48175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.fragment.app.m f48176t;

    public b0(List list, ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, androidx.fragment.app.m mVar, Context context) {
        super(mVar);
        this.f48176t = mVar;
        this.f48175s = new HashMap();
        this.f48173q = list.size();
        this.f48174r = list;
        this.f48164h = arrayList;
        this.f48165i = str;
        this.f48166j = str2;
        this.f48167k = str3;
        this.f48168l = str4;
        this.f48169m = str5;
        this.f48170n = str6;
        this.f48171o = str7;
        this.f48172p = context;
    }

    @Override // N0.a
    public int c() {
        return this.f48173q;
    }

    @Override // N0.a
    public CharSequence e(int i9) {
        return (CharSequence) this.f48174r.get(i9);
    }

    @Override // androidx.fragment.app.r
    public Fragment p(int i9) {
        return s7.i.z((String) this.f48174r.get(i9), this.f48164h, this.f48165i, this.f48166j, this.f48167k, this.f48168l, this.f48169m, this.f48170n, this.f48171o);
    }
}
