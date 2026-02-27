package q7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.model.Mylist;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class h0 extends AbstractC2621e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static C2858a f48379p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f48384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f48385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f48386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f48387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f48388o;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e7.f f48389a;

        public a(e7.f fVar) {
            this.f48389a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri uriFromFile;
            Intent intent;
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent2.setFlags(1);
                    File file = new File(this.f48389a.x());
                    h0.this.f48385l = file.length() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    uriFromFile = Uri.fromFile(file);
                } else {
                    uriFromFile = Uri.parse("file://" + this.f48389a.x());
                }
                intent2.setDataAndType(uriFromFile, "video/mp4");
                String strSubstring = this.f48389a.x().substring(0, this.f48389a.x().lastIndexOf(InstructionFileId.DOT));
                h0.this.f48386m = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
                if (!a7.o.a(h0.this.f48275d, intent2)) {
                    a7.n.a(h0.this.f48275d).c(h0.this.f48275d.getString(a7.j.f13032I8));
                    return;
                }
                h0 h0Var = h0.this;
                if (h0Var.f48275d == null || !h0Var.f48384k.booleanValue()) {
                    return;
                }
                C2858a unused = h0.f48379p = new C2858a(h0.this.f48275d);
                if (h0.f48379p.x() == 3) {
                    h0.f48379p.U("Hardware Decoder");
                    intent = new Intent(h0.this.f48275d, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(h0.this.f48275d, (Class<?>) HoneyPlayer.class);
                }
                intent.putExtra("type", "devicedata");
                intent.putExtra("VIDEO_NUM", 0);
                intent.putExtra("VIDEO_PATH", this.f48389a.x());
                h0.this.f48275d.startActivity(intent);
            } catch (Exception e9) {
                a7.n.a(h0.this.f48275d).c(e9.getMessage());
            }
        }
    }

    public class b extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ImageView f48391t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48392u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f48393v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public TextView f48394w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f48395x;

        public b(View view) {
            super(view);
            this.f48391t = (ImageView) view.findViewById(a7.f.f12397f6);
            TextView textView = (TextView) view.findViewById(a7.f.wm);
            this.f48395x = textView;
            textView.setSelected(true);
            this.f48393v = (TextView) view.findViewById(a7.f.xm);
            this.f48394w = (TextView) view.findViewById(a7.f.ek);
            this.f48392u = (TextView) view.findViewById(a7.f.vm);
        }
    }

    public h0(Context context, ArrayList arrayList, boolean z9, int i9) {
        super(context, arrayList);
        this.f48382i = 0;
        this.f48384k = Boolean.TRUE;
        this.f48387n = new ArrayList();
        this.f48388o = new ArrayList();
        this.f48380g = z9;
        this.f48381h = i9;
    }

    public h0(Context context, boolean z9, int i9) {
        this(context, new ArrayList(), z9, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48276e.size();
    }

    public boolean p0() {
        return this.f48382i >= this.f48381h;
    }

    public ArrayList q0(ArrayList arrayList) {
        this.f48387n = arrayList;
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void E(b bVar, int i9) {
        bVar.f48391t.setVisibility(0);
        e7.f fVar = (e7.f) (this.f48380g ? this.f48276e.get(i9 - 1) : this.f48276e.get(i9));
        try {
            O1.g.u(this.f48275d).q(fVar.x()).l(bVar.f48391t);
        } catch (Exception unused) {
        }
        fVar.C();
        bVar.f16733a.setOnClickListener(new a(fVar));
        try {
            ((Mylist) this.f48387n.get(i9)).getName();
            ((Mylist) this.f48387n.get(i9)).getSize();
            ((Mylist) this.f48387n.get(i9)).getModified_date();
            ((Mylist) this.f48387n.get(i9)).getDuration();
            ((Mylist) this.f48387n.get(i9)).getExtension();
            ((Mylist) this.f48387n.get(i9)).getFrame_height();
            ((Mylist) this.f48387n.get(i9)).getFrmae_width();
            bVar.f48394w.setText("Modified:" + new Date(((Mylist) this.f48387n.get(i9)).getModified_date()));
            bVar.f48392u.setText("Duration: " + ((Mylist) this.f48387n.get(i9)).getDuration());
            bVar.f48395x.setText(((Mylist) this.f48387n.get(i9)).getName());
            bVar.f48393v.setText("Size: " + ((Mylist) this.f48387n.get(i9)).getSize() + " video/" + ((Mylist) this.f48387n.get(i9)).getExtension() + " " + ((Mylist) this.f48387n.get(i9)).getFrmae_width() + "x" + ((Mylist) this.f48387n.get(i9)).getFrame_height());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public b L(ViewGroup viewGroup, int i9) {
        View viewInflate = LayoutInflater.from(this.f48275d).inflate(a7.g.f12778c5, viewGroup, false);
        viewInflate.getLayoutParams();
        return new b(viewInflate);
    }

    public void t0(int i9) {
        this.f48382i = i9;
    }
}
