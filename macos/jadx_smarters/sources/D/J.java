package D;

import D.AbstractC0529l;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1177a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f1178b = new Object();

    public static Bundle a(AbstractC0529l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.f() : 0);
        bundle.putCharSequence(ChartFactory.TITLE, aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(N n9) {
        new Bundle();
        throw null;
    }

    public static Bundle[] c(N[] nArr) {
        if (nArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nArr.length];
        for (int i9 = 0; i9 < nArr.length; i9++) {
            N n9 = nArr[i9];
            bundleArr[i9] = b(null);
        }
        return bundleArr;
    }
}
