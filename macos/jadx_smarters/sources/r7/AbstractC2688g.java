package r7;

import O2.H0;
import O2.R0;
import android.content.Intent;
import android.net.Uri;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import d4.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.achartengine.ChartFactory;
import s5.AbstractC2743y;
import s5.c0;

/* JADX INFO: renamed from: r7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2688g {
    public static void a(H0.d dVar, Intent intent, String str) {
        if (dVar.f5561a != 0) {
            intent.putExtra("clip_start_position_ms" + str, dVar.f5561a);
        }
        if (dVar.f5562c != Long.MIN_VALUE) {
            intent.putExtra("clip_end_position_ms" + str, dVar.f5562c);
        }
    }

    public static void b(H0.f fVar, Intent intent, String str) {
        intent.putExtra("drm_scheme" + str, fVar.f5581a.toString());
        String str2 = "drm_license_uri" + str;
        Uri uri = fVar.f5583d;
        intent.putExtra(str2, uri != null ? uri.toString() : null);
        intent.putExtra("drm_multi_session" + str, fVar.f5586g);
        intent.putExtra("drm_force_default_license_uri" + str, fVar.f5588i);
        String[] strArr = new String[fVar.f5585f.size() * 2];
        c0 it = fVar.f5585f.entrySet().iterator();
        boolean z9 = false;
        int i9 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i10 = i9 + 1;
            strArr[i9] = (String) entry.getKey();
            i9 += 2;
            strArr[i10] = (String) entry.getValue();
        }
        intent.putExtra("drm_key_request_properties" + str, strArr);
        AbstractC2743y abstractC2743y = fVar.f5590k;
        if (abstractC2743y.isEmpty()) {
            return;
        }
        if (abstractC2743y.size() == 2 && abstractC2743y.contains(2) && abstractC2743y.contains(1)) {
            z9 = true;
        }
        r5.m.p(z9);
        intent.putExtra("drm_session_for_clear_content" + str, true);
    }

    public static void c(H0.h hVar, Intent intent, String str) {
        Intent intentPutExtra = intent.putExtra(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE + str, hVar.f5626c);
        String str2 = "ad_tag_uri" + str;
        H0.b bVar = hVar.f5628e;
        intentPutExtra.putExtra(str2, bVar != null ? bVar.f5537a.toString() : null);
        H0.f fVar = hVar.f5627d;
        if (fVar != null) {
            b(fVar, intent, str);
        }
        if (hVar.f5631h.isEmpty()) {
            return;
        }
        r5.m.p(hVar.f5631h.size() == 1);
        H0.k kVar = (H0.k) hVar.f5631h.get(0);
        intent.putExtra("subtitle_uri" + str, kVar.f5653a.toString());
        intent.putExtra("subtitle_mime_type" + str, kVar.f5654c);
        intent.putExtra("subtitle_language" + str, kVar.f5655d);
    }

    public static void d(List list, Intent intent) {
        r5.m.d(!list.isEmpty());
        if (list.size() == 1) {
            H0 h02 = (H0) list.get(0);
            H0.h hVar = (H0.h) r5.m.k(h02.f5528c);
            intent.setAction("com.google.android.exoplayer.demo.action.VIEW").setData(h02.f5528c.f5625a);
            CharSequence charSequence = h02.f5531f.f5805a;
            if (charSequence != null) {
                intent.putExtra(ChartFactory.TITLE, charSequence);
            }
            c(hVar, intent, "");
            a(h02.f5532g, intent, "");
            return;
        }
        intent.setAction("com.google.android.exoplayer.demo.action.VIEW_LIST");
        for (int i9 = 0; i9 < list.size(); i9++) {
            H0 h03 = (H0) list.get(i9);
            H0.h hVar2 = (H0.h) r5.m.k(h03.f5528c);
            intent.putExtra("uri_" + i9, hVar2.f5625a.toString());
            StringBuilder sb = new StringBuilder();
            sb.append("_");
            sb.append(i9);
            c(hVar2, intent, sb.toString());
            a(h03.f5532g, intent, "_" + i9);
            if (h03.f5531f.f5805a != null) {
                intent.putExtra(ChartFactory.TITLE + "_" + i9, h03.f5531f.f5805a);
            }
        }
    }

    public static H0 e(Uri uri, Intent intent, String str) {
        String stringExtra = intent.getStringExtra(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE + str);
        String stringExtra2 = intent.getStringExtra(ChartFactory.TITLE + str);
        String stringExtra3 = intent.getStringExtra("ad_tag_uri" + str);
        H0.k kVarG = g(intent, str);
        H0.c cVarC = new H0.c().m(uri).i(stringExtra).h(new R0.b().m0(stringExtra2).H()).c(new H0.d.a().k(intent.getLongExtra("clip_start_position_ms" + str, 0L)).h(intent.getLongExtra("clip_end_position_ms" + str, Long.MIN_VALUE)).f());
        if (stringExtra3 != null) {
            cVarC.b(new H0.b.a(Uri.parse(stringExtra3)).c());
        }
        if (kVarG != null) {
            cVarC.k(AbstractC2743y.A(kVarG));
        }
        return h(cVarC, intent, str).a();
    }

    public static List f(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if ("com.google.android.exoplayer.demo.action.VIEW_LIST".equals(intent.getAction())) {
            int i9 = 0;
            while (true) {
                if (!intent.hasExtra("uri_" + i9)) {
                    break;
                }
                arrayList.add(e(Uri.parse(intent.getStringExtra("uri_" + i9)), intent, "_" + i9));
                i9++;
            }
        } else {
            arrayList.add(e(intent.getData(), intent, ""));
        }
        return arrayList;
    }

    public static H0.k g(Intent intent, String str) {
        if (!intent.hasExtra("subtitle_uri" + str)) {
            return null;
        }
        return new H0.k.a(Uri.parse(intent.getStringExtra("subtitle_uri" + str))).n((String) r5.m.k(intent.getStringExtra("subtitle_mime_type" + str))).m(intent.getStringExtra("subtitle_language" + str)).p(1).i();
    }

    public static H0.c h(H0.c cVar, Intent intent, String str) {
        String stringExtra = intent.getStringExtra("drm_scheme" + str);
        if (stringExtra == null) {
            return cVar;
        }
        HashMap map = new HashMap();
        String[] stringArrayExtra = intent.getStringArrayExtra("drm_key_request_properties" + str);
        if (stringArrayExtra != null) {
            for (int i9 = 0; i9 < stringArrayExtra.length; i9 += 2) {
                map.put(stringArrayExtra[i9], stringArrayExtra[i9 + 1]);
            }
        }
        UUID uuidY = k0.Y(stringExtra);
        if (uuidY != null) {
            cVar.e(new H0.f.a(uuidY).p(intent.getStringExtra("drm_license_uri" + str)).q(intent.getBooleanExtra("drm_multi_session" + str, false)).j(intent.getBooleanExtra("drm_force_default_license_uri" + str, false)).n(map).k(intent.getBooleanExtra("drm_session_for_clear_content" + str, false)).i());
        }
        return cVar;
    }
}
