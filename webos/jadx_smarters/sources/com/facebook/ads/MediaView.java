package com.facebook.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class MediaView extends AdNativeComponentView {
    private AdViewConstructorParams mConstructorParams;
    private MediaViewApi mMediaViewApi;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaView.this.removeAllViews();
            ((AdNativeComponentView) MediaView.this).mAdComponentViewApi = null;
            MediaView mediaView = MediaView.this;
            mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(mediaView.mConstructorParams.getContext()).createMediaViewApi();
            MediaView mediaView2 = MediaView.this;
            mediaView2.attachAdComponentViewApi(mediaView2.mMediaViewApi);
            MediaViewApi unused = MediaView.this.mMediaViewApi;
            AdViewConstructorParams unused2 = MediaView.this.mConstructorParams;
            MediaView mediaView3 = MediaView.this;
        }
    }

    public MediaView(Context context) {
        super(context);
        new AdViewConstructorParams(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new AdViewConstructorParams(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        new AdViewConstructorParams(context, attributeSet, i9);
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        new AdViewConstructorParams(context, attributeSet, i9, i10);
    }

    private void initializeSelf(AdViewConstructorParams adViewConstructorParams) {
        this.mConstructorParams = adViewConstructorParams;
        MediaViewApi mediaViewApiCreateMediaViewApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
        this.mMediaViewApi = mediaViewApiCreateMediaViewApi;
        attachAdComponentViewApi(mediaViewApiCreateMediaViewApi);
        MediaViewApi mediaViewApi = this.mMediaViewApi;
    }

    public void destroy() {
        this.mMediaViewApi.destroy();
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.mMediaViewApi.getAdContentsView();
    }

    public int getMediaHeight() {
        return this.mMediaViewApi.getMediaHeight();
    }

    public MediaViewApi getMediaViewApi() {
        return this.mMediaViewApi;
    }

    public int getMediaWidth() {
        return this.mMediaViewApi.getMediaWidth();
    }

    public void repair(Throwable th) {
        post(new a());
    }

    public void setListener(MediaViewListener mediaViewListener) {
        this.mMediaViewApi.setListener(mediaViewListener);
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        this.mMediaViewApi.setVideoRenderer(mediaViewVideoRenderer);
    }
}
