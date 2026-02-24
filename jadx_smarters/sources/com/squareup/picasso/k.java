package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* JADX INFO: loaded from: classes4.dex */
public class k extends C1613g {
    public k(Context context) {
        super(context);
    }

    public static int k(Uri uri) {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    @Override // com.squareup.picasso.C1613g, com.squareup.picasso.y
    public boolean c(w wVar) {
        return TransferTable.COLUMN_FILE.equals(wVar.f39170d.getScheme());
    }

    @Override // com.squareup.picasso.C1613g, com.squareup.picasso.y
    public y.a f(w wVar, int i9) {
        return new y.a(null, j(wVar), t.e.DISK, k(wVar.f39170d));
    }
}
