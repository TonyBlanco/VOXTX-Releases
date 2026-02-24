package Q8;

import Q8.c;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8446a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f8447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a f8448d;

    public f(i iVar, g gVar, c.a aVar, c.b bVar) {
        this.f8446a = iVar.getActivity();
        this.f8447c = gVar;
        this.f8448d = aVar;
    }

    public f(j jVar, g gVar, c.a aVar, c.b bVar) {
        this.f8446a = jVar.getParentFragment() != null ? jVar.getParentFragment() : jVar.getActivity();
        this.f8447c = gVar;
        this.f8448d = aVar;
    }

    public final void a() {
        c.a aVar = this.f8448d;
        if (aVar != null) {
            g gVar = this.f8447c;
            aVar.k(gVar.f8452d, Arrays.asList(gVar.f8454f));
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i9) {
        R8.e eVarD;
        g gVar = this.f8447c;
        int i10 = gVar.f8452d;
        if (i9 != -1) {
            a();
            return;
        }
        String[] strArr = gVar.f8454f;
        Object obj = this.f8446a;
        if (obj instanceof Fragment) {
            eVarD = R8.e.e((Fragment) obj);
        } else {
            if (!(obj instanceof Activity)) {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
            eVarD = R8.e.d((Activity) obj);
        }
        eVarD.a(i10, strArr);
    }
}
