package q7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.Myaudiofile;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import e7.C1747a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import u7.C2858a;

/* JADX INFO: renamed from: q7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2620d extends AbstractC2621e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C2858a f48209l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f48212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f48213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f48214k;

    /* JADX INFO: renamed from: q7.d$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f48215a;

        public a(c cVar) {
            this.f48215a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!view.isSelected() && C2620d.this.r0()) {
                a7.n.a(C2620d.this.f48275d).b(a7.j.f13052K8);
                return;
            }
            if (view.isSelected()) {
                this.f48215a.f48223x.setSelected(false);
                C2620d.m0(C2620d.this);
            } else {
                this.f48215a.f48223x.setSelected(true);
                C2620d.l0(C2620d.this);
            }
            ((C1747a) C2620d.this.f48276e.get(this.f48215a.m())).M(this.f48215a.f48223x.isSelected());
            I i9 = C2620d.this.f48277f;
            if (i9 != null) {
                i9.a(this.f48215a.f48223x.isSelected(), (C1747a) C2620d.this.f48276e.get(this.f48215a.m()));
            }
        }
    }

    /* JADX INFO: renamed from: q7.d$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1747a f48217a;

        public b(C1747a c1747a) {
            this.f48217a = c1747a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v25 */
        /* JADX WARN: Type inference failed for: r6v27 */
        /* JADX WARN: Type inference failed for: r6v28 */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent;
            Uri uriF = "file://";
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                try {
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent2.setFlags(1);
                        File file = new File(this.f48217a.x());
                        uriF = FileProvider.f(C2620d.this.f48275d, C2620d.this.f48275d.getApplicationContext().getPackageName() + ".provider", file);
                    } else {
                        uriF = Uri.parse("file://" + this.f48217a.x());
                    }
                } catch (Exception unused) {
                    uriF = Uri.parse(uriF + this.f48217a.x());
                }
                intent2.setDataAndType(uriF, "audio/mp3");
                if (!a7.o.a(C2620d.this.f48275d, intent2)) {
                    a7.n.a(C2620d.this.f48275d).c(C2620d.this.f48275d.getString(a7.j.f13022H8));
                    return;
                }
                C2620d c2620d = C2620d.this;
                if (c2620d.f48275d == null || !c2620d.f48212i.booleanValue()) {
                    return;
                }
                C2858a unused2 = C2620d.f48209l = new C2858a(C2620d.this.f48275d);
                if (C2620d.f48209l.x() == 3) {
                    C2620d.f48209l.U(C2620d.this.f48213j.getResources().getString(a7.j.f13349p2));
                    intent = new Intent(C2620d.this.f48275d, (Class<?>) HoneyPlayer.class);
                } else {
                    intent = new Intent(C2620d.this.f48275d, (Class<?>) HoneyPlayer.class);
                }
                intent.putExtra("type", "devicedata");
                intent.putExtra("VIDEO_NUM", 0);
                intent.putExtra("VIDEO_PATH", this.f48217a.x());
                C2620d.this.f48275d.startActivity(intent);
            } catch (Exception e9) {
                a7.n.a(C2620d.this.f48275d).c(e9.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: q7.d$c */
    public class c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48219t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48220u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f48221v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public TextView f48222w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ImageView f48223x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageView f48224y;

        public c(View view) {
            super(view);
            this.f48219t = (TextView) view.findViewById(a7.f.Eh);
            this.f48220u = (TextView) view.findViewById(a7.f.Ll);
            this.f48221v = (TextView) view.findViewById(a7.f.Oi);
            this.f48222w = (TextView) view.findViewById(a7.f.ek);
            this.f48223x = (ImageView) view.findViewById(a7.f.f12268S1);
            this.f48224y = (ImageView) view.findViewById(a7.f.f12465m4);
        }
    }

    public C2620d(Context context, int i9) {
        this(context, new ArrayList(), i9);
    }

    public C2620d(Context context, ArrayList arrayList, int i9) {
        super(context, arrayList);
        this.f48211h = 0;
        this.f48212i = Boolean.TRUE;
        this.f48214k = new ArrayList();
        this.f48210g = i9;
        this.f48213j = context;
    }

    public static /* synthetic */ int l0(C2620d c2620d) {
        int i9 = c2620d.f48211h;
        c2620d.f48211h = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int m0(C2620d c2620d) {
        int i9 = c2620d.f48211h;
        c2620d.f48211h = i9 - 1;
        return i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48276e.size();
    }

    public boolean r0() {
        return this.f48211h >= this.f48210g;
    }

    public ArrayList s0(ArrayList arrayList) {
        this.f48214k = arrayList;
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void E(c cVar, int i9) {
        C1747a c1747a = (C1747a) this.f48276e.get(i9);
        try {
            ((Myaudiofile) this.f48214k.get(i9)).getBitmap();
            cVar.f48220u.setText("Size: " + ((Myaudiofile) this.f48214k.get(i9)).getSize());
            cVar.f48219t.setText(((Myaudiofile) this.f48214k.get(i9)).getName().substring(0, 1).toUpperCase() + ((Myaudiofile) this.f48214k.get(i9)).getName().substring(1));
            cVar.f48222w.setText("Modified:" + new Date(((Myaudiofile) this.f48214k.get(i9)).getModified_date()));
            cVar.f48221v.setText("Duration: " + ((Myaudiofile) this.f48214k.get(i9)).getDuration());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (c1747a.C()) {
                cVar.f48223x.setSelected(true);
            } else {
                cVar.f48223x.setSelected(false);
            }
        } catch (Exception unused) {
        }
        try {
            if (((Myaudiofile) this.f48214k.get(i9)).getBitmap() != null) {
                cVar.f48224y.setImageBitmap(((Myaudiofile) this.f48214k.get(i9)).getBitmap());
            } else {
                cVar.f48224y.setImageDrawable(this.f48213j.getResources().getDrawable(a7.e.f11918H0));
            }
        } catch (Exception unused2) {
            cVar.f48224y.setImageDrawable(this.f48213j.getResources().getDrawable(a7.e.f11918H0));
        }
        cVar.f48223x.setOnClickListener(new a(cVar));
        cVar.f16733a.setOnClickListener(new b(c1747a));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public c L(ViewGroup viewGroup, int i9) {
        return new c(LayoutInflater.from(this.f48275d).inflate(a7.g.f12764a5, viewGroup, false));
    }

    public void z0(int i9) {
        this.f48211h = i9;
    }
}
