package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* JADX INFO: renamed from: com.squareup.picasso.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1608b extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39050b = 22;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f39051a;

    public C1608b(Context context) {
        this.f39051a = context.getAssets();
    }

    public static String j(w wVar) {
        return wVar.f39170d.toString().substring(f39050b);
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        Uri uri = wVar.f39170d;
        return TransferTable.COLUMN_FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i9) {
        return new y.a(this.f39051a.open(j(wVar)), t.e.DISK);
    }
}
