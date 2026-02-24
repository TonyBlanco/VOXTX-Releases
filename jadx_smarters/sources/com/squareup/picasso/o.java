package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public class o extends C1613g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f39121b = {"orientation"};

    public enum a {
        MICRO(3, 96, 96),
        MINI(1, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        a(int i9, int i10, int i11) {
            this.androidKind = i9;
            this.width = i10;
            this.height = i11;
        }
    }

    public o(Context context) {
        super(context);
    }

    public static int k(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f39121b, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int i9 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i9;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static a l(int i9, int i10) {
        a aVar = a.MICRO;
        if (i9 <= aVar.width && i10 <= aVar.height) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i9 > aVar2.width || i10 > aVar2.height) ? a.FULL : aVar2;
    }

    @Override // com.squareup.picasso.C1613g, com.squareup.picasso.y
    public boolean c(w wVar) {
        Uri uri = wVar.f39170d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.C1613g, com.squareup.picasso.y
    public y.a f(w wVar, int i9) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f39078a.getContentResolver();
        int iK = k(contentResolver, wVar.f39170d);
        String type = contentResolver.getType(wVar.f39170d);
        boolean z9 = type != null && type.startsWith("video/");
        if (wVar.c()) {
            a aVarL = l(wVar.f39174h, wVar.f39175i);
            if (!z9 && aVarL == a.FULL) {
                return new y.a(null, j(wVar), t.e.DISK, iK);
            }
            long id = ContentUris.parseId(wVar.f39170d);
            BitmapFactory.Options optionsD = y.d(wVar);
            optionsD.inJustDecodeBounds = true;
            y.a(wVar.f39174h, wVar.f39175i, aVarL.width, aVarL.height, optionsD, wVar);
            if (z9) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, aVarL == a.FULL ? 1 : aVarL.androidKind, optionsD);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, aVarL.androidKind, optionsD);
            }
            if (thumbnail != null) {
                return new y.a(thumbnail, null, t.e.DISK, iK);
            }
        }
        return new y.a(null, j(wVar), t.e.DISK, iK);
    }
}
