package s4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2775b f49964a = new C2775b("WidgetUtil");

    public static Bitmap a(Context context, Bitmap bitmap, float f9, float f10) {
        C2775b c2775b = f49964a;
        c2775b.a("Begin blurring bitmap %s, original width = %d, original height = %d.", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        int iRound = Math.round(bitmap.getWidth() * 0.25f);
        int iRound2 = Math.round(bitmap.getHeight() * 0.25f);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, bitmapCreateScaledBitmap.getConfig());
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, allocationCreateFromBitmap.getElement());
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.setRadius(7.5f);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCreateBitmap);
        renderScriptCreate.destroy();
        c2775b.a("End blurring bitmap %s, original width = %d, original height = %d.", bitmapCreateScaledBitmap, Integer.valueOf(iRound), Integer.valueOf(iRound2));
        return bitmapCreateBitmap;
    }

    public static Drawable b(Context context, int i9, int i10) {
        return d(context, i9, i10, 0, R.color.white);
    }

    public static Drawable c(Context context, int i9, int i10) {
        return d(context, i9, i10, R.attr.colorForeground, 0);
    }

    public static Drawable d(Context context, int i9, int i10, int i11, int i12) {
        int color;
        ColorStateList colorStateList;
        Drawable drawableR = H.a.r(context.getResources().getDrawable(i10).mutate());
        H.a.p(drawableR, PorterDuff.Mode.SRC_IN);
        if (i9 != 0) {
            colorStateList = E.b.getColorStateList(context, i9);
        } else {
            if (i11 != 0) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i11});
                color = typedArrayObtainStyledAttributes.getColor(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } else {
                color = E.b.getColor(context, i12);
            }
            colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{color, G.a.o(color, 128)});
        }
        H.a.o(drawableR, colorStateList);
        return drawableR;
    }
}
