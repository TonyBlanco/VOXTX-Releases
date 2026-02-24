package U;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayoutInflater f9583l;

    public c(Context context, int i9, Cursor cursor, boolean z9) {
        super(context, cursor, z9);
        this.f9582k = i9;
        this.f9581j = i9;
        this.f9583l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // U.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9583l.inflate(this.f9582k, viewGroup, false);
    }

    @Override // U.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9583l.inflate(this.f9581j, viewGroup, false);
    }
}
