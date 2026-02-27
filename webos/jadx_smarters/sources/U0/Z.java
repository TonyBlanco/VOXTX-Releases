package u0;

import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u0.C2806F;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    public static List a(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoA = AbstractC2819c.a(it.next());
            if (mediaRoute2InfoA != null) {
                arrayList.add(mediaRoute2InfoA.getId());
            }
        }
        return arrayList;
    }

    public static RouteDiscoveryPreference b(C2807G c2807g) {
        RouteDiscoveryPreference.Builder builderA;
        if (c2807g == null || !c2807g.e()) {
            AbstractC2816P.a();
            builderA = AbstractC2815O.a(new ArrayList(), false);
        } else {
            boolean zD = c2807g.d();
            ArrayList arrayList = new ArrayList();
            Iterator it = c2807g.c().e().iterator();
            while (it.hasNext()) {
                arrayList.add(d((String) it.next()));
            }
            builderA = AbstractC2815O.a(arrayList, zD);
        }
        return builderA.build();
    }

    public static C2806F c(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        C2806F.a aVarF = new C2806F.a(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString()).g(mediaRoute2Info.getConnectionState()).s(mediaRoute2Info.getVolumeHandling()).t(mediaRoute2Info.getVolumeMax()).r(mediaRoute2Info.getVolume()).k(mediaRoute2Info.getExtras()).j(true).f(false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            aVarF.h(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            aVarF.l(iconUri);
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        aVarF.k(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        aVarF.i(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        aVarF.p(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            aVarF.b(parcelableArrayList);
        }
        return aVarF.e();
    }

    public static String d(String str) {
        str.hashCode();
        switch (str) {
            case "android.media.intent.category.REMOTE_PLAYBACK":
                return "android.media.route.feature.REMOTE_PLAYBACK";
            case "android.media.intent.category.LIVE_AUDIO":
                return "android.media.route.feature.LIVE_AUDIO";
            case "android.media.intent.category.LIVE_VIDEO":
                return "android.media.route.feature.LIVE_VIDEO";
            default:
                return str;
        }
    }
}
