package p4;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;
import p4.C2434i;

/* JADX INFO: renamed from: p4.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2423K implements C2434i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f46406a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f46407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaError f46408d;

    public C2423K(Status status, JSONObject jSONObject, MediaError mediaError) {
        this.f46406a = status;
        this.f46407c = jSONObject;
        this.f46408d = mediaError;
    }

    @Override // com.google.android.gms.common.api.h
    public final Status getStatus() {
        return this.f46406a;
    }
}
