package p4;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.List;
import o4.AbstractC2341s;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends ArrayAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46423a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46424c;

    public U(Context context, List list, int i9) {
        super(context, AbstractC2341s.f45992f, list == null ? new ArrayList() : list);
        this.f46423a = context;
        this.f46424c = i9;
    }

    public final MediaTrack a() {
        int i9 = this.f46424c;
        if (i9 < 0 || i9 >= getCount()) {
            return null;
        }
        return (MediaTrack) getItem(this.f46424c);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L34
            android.content.Context r8 = r6.f46423a
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r8 = r8.getSystemService(r2)
            android.view.LayoutInflater r8 = (android.view.LayoutInflater) r8
            java.lang.Object r8 = com.google.android.gms.common.internal.r.m(r8)
            android.view.LayoutInflater r8 = (android.view.LayoutInflater) r8
            int r2 = o4.AbstractC2341s.f45992f
            android.view.View r8 = r8.inflate(r2, r9, r1)
            p4.T r9 = new p4.T
            int r2 = o4.AbstractC2340q.f45956b0
            android.view.View r2 = r8.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = o4.AbstractC2340q.f45948V
            android.view.View r3 = r8.findViewById(r3)
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r4 = 0
            r9.<init>(r6, r2, r3, r4)
            r8.setTag(r9)
            goto L40
        L34:
            java.lang.Object r9 = r8.getTag()
            p4.T r9 = (p4.T) r9
            java.lang.Object r9 = com.google.android.gms.common.internal.r.m(r9)
            p4.T r9 = (p4.T) r9
        L40:
            android.widget.RadioButton r2 = r9.f46422b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.setTag(r3)
            android.widget.RadioButton r2 = r9.f46422b
            int r3 = r6.f46424c
            if (r3 != r7) goto L51
            r3 = 1
            goto L52
        L51:
            r3 = 0
        L52:
            r2.setChecked(r3)
            r8.setOnClickListener(r6)
            java.lang.Object r2 = r6.getItem(r7)
            com.google.android.gms.cast.MediaTrack r2 = (com.google.android.gms.cast.MediaTrack) r2
            java.lang.Object r2 = com.google.android.gms.common.internal.r.m(r2)
            com.google.android.gms.cast.MediaTrack r2 = (com.google.android.gms.cast.MediaTrack) r2
            java.lang.String r3 = r2.getName()
            java.util.Locale r4 = r2.L()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto La0
            int r2 = r2.N()
            r3 = 2
            if (r2 != r3) goto L82
            android.content.Context r7 = r6.f46423a
            int r0 = o4.AbstractC2342t.f46023y
            java.lang.String r3 = r7.getString(r0)
            goto La0
        L82:
            if (r4 == 0) goto L8f
            java.lang.String r3 = r4.getDisplayLanguage()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L8f
            goto La0
        L8f:
            android.content.Context r2 = r6.f46423a
            int r7 = r7 + r0
            int r3 = o4.AbstractC2342t.f46024z
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r7
            java.lang.String r3 = r2.getString(r3, r0)
        La0:
            android.widget.TextView r7 = r9.f46421a
            r7.setText(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.U.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f46424c = ((Integer) com.google.android.gms.common.internal.r.m(((T) com.google.android.gms.common.internal.r.m((T) view.getTag())).f46422b.getTag())).intValue();
        notifyDataSetChanged();
    }
}
