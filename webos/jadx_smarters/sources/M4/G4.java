package M4;

import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzrd;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class G4 extends D4 {
    public G4(S4 s42) {
        super(s42);
    }

    public final F4 i(String str) {
        zzrd.zzc();
        F4 f42 = null;
        if (this.f4245a.z().B(null, AbstractC0781m1.f4921s0)) {
            this.f4245a.d().v().a("sgtm feature flag enabled.");
            I2 i2R = this.f4234b.V().R(str);
            if (i2R == null) {
                return new F4(j(str));
            }
            if (i2R.Q()) {
                this.f4245a.d().v().a("sgtm upload enabled in manifest.");
                zzff zzffVarT = this.f4234b.Z().t(i2R.l0());
                if (zzffVarT != null) {
                    String strZzj = zzffVarT.zzj();
                    if (!TextUtils.isEmpty(strZzj)) {
                        String strZzi = zzffVarT.zzi();
                        this.f4245a.d().v().c("sgtm configured with upload_url, server_info", strZzj, true != TextUtils.isEmpty(strZzi) ? "N" : "Y");
                        if (TextUtils.isEmpty(strZzi)) {
                            this.f4245a.b();
                            f42 = new F4(strZzj);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-google-sgtm-server-info", strZzi);
                            f42 = new F4(strZzj, map);
                        }
                    }
                }
            }
            if (f42 != null) {
                return f42;
            }
        }
        return new F4(j(str));
    }

    public final String j(String str) throws Throwable {
        String strW = this.f4234b.Z().w(str);
        if (TextUtils.isEmpty(strW)) {
            return (String) AbstractC0781m1.f4920s.a(null);
        }
        Uri uri = Uri.parse((String) AbstractC0781m1.f4920s.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strW + InstructionFileId.DOT + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
