package k;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f43396c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f43397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f43398b;

    public static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i9) {
            layerDrawable2.setLayerGravity(i9, layerDrawable.getLayerGravity(i9));
            layerDrawable2.setLayerWidth(i9, layerDrawable.getLayerWidth(i9));
            layerDrawable2.setLayerHeight(i9, layerDrawable.getLayerHeight(i9));
            layerDrawable2.setLayerInsetLeft(i9, layerDrawable.getLayerInsetLeft(i9));
            layerDrawable2.setLayerInsetRight(i9, layerDrawable.getLayerInsetRight(i9));
            layerDrawable2.setLayerInsetTop(i9, layerDrawable.getLayerInsetTop(i9));
            layerDrawable2.setLayerInsetBottom(i9, layerDrawable.getLayerInsetBottom(i9));
            layerDrawable2.setLayerInsetStart(i9, layerDrawable.getLayerInsetStart(i9));
            layerDrawable2.setLayerInsetEnd(i9, layerDrawable.getLayerInsetEnd(i9));
        }
    }

    public r(ProgressBar progressBar) {
        this.f43397a = progressBar;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Bitmap b() {
        return this.f43398b;
    }

    public void c(AttributeSet attributeSet, int i9) {
        d0 d0VarV = d0.v(this.f43397a.getContext(), attributeSet, f43396c, i9, 0);
        Drawable drawableH = d0VarV.h(0);
        if (drawableH != null) {
            this.f43397a.setIndeterminateDrawable(e(drawableH));
        }
        Drawable drawableH2 = d0VarV.h(1);
        if (drawableH2 != null) {
            this.f43397a.setProgressDrawable(d(drawableH2, false));
        }
        d0VarV.w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable d(Drawable drawable, boolean z9) {
        if (drawable instanceof H.c) {
            H.c cVar = (H.c) drawable;
            Drawable drawableA = cVar.a();
            if (drawableA != null) {
                cVar.b(d(drawableA, z9));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    int id = layerDrawable.getId(i9);
                    drawableArr[i9] = d(layerDrawable.getDrawable(i9), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    if (Build.VERSION.SDK_INT >= 23) {
                        a.a(layerDrawable, layerDrawable2, i10);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f43398b == null) {
                    this.f43398b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z9 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i9 = 0; i9 < numberOfFrames; i9++) {
            Drawable drawableD = d(animationDrawable.getFrame(i9), true);
            drawableD.setLevel(Constants.MAXIMUM_UPLOAD_PARTS);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i9));
        }
        animationDrawable2.setLevel(Constants.MAXIMUM_UPLOAD_PARTS);
        return animationDrawable2;
    }
}
