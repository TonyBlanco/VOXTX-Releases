package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import o4.AbstractC2336m;
import o4.AbstractC2340q;
import o4.AbstractC2343u;
import o4.AbstractC2344v;
import o4.C2328e;
import p4.C2434i;
import r4.C2662c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcw extends zzcq {
    private final RelativeLayout zza;
    private final TextView zzb;
    private final CastSeekBar zzc;
    private final C2662c zzd;

    public zzcw(RelativeLayout relativeLayout, CastSeekBar castSeekBar, C2662c c2662c) {
        this.zza = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(AbstractC2340q.f45964f0);
        this.zzb = textView;
        this.zzc = castSeekBar;
        this.zzd = c2662c;
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(null, AbstractC2344v.f46049b, AbstractC2336m.f45890a, AbstractC2343u.f46025a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46070w, 0);
        typedArrayObtainStyledAttributes.recycle();
        textView.getBackground().setColorFilter(textView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zzd();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        zzd();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        super.onSessionEnded();
        zzd();
    }

    @Override // com.google.android.gms.internal.cast.zzcq
    public final void zza(boolean z9) {
        super.zza(z9);
        zzd();
    }

    @Override // com.google.android.gms.internal.cast.zzcq
    public final void zzb(long j9) {
        zzd();
    }

    public final void zzd() {
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q() || zzc()) {
            this.zza.setVisibility(8);
            return;
        }
        this.zza.setVisibility(0);
        TextView textView = this.zzb;
        C2662c c2662c = this.zzd;
        textView.setText(c2662c.l(((long) this.zzc.getProgress()) + c2662c.e()));
        int measuredWidth = (this.zzc.getMeasuredWidth() - this.zzc.getPaddingLeft()) - this.zzc.getPaddingRight();
        this.zzb.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.zzb.getMeasuredWidth();
        int iMin = Math.min(Math.max(0, ((int) ((((double) this.zzc.getProgress()) / ((double) this.zzc.getMaxProgress())) * ((double) measuredWidth))) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.zzb.getLayoutParams();
        layoutParams.leftMargin = iMin;
        this.zzb.setLayoutParams(layoutParams);
    }
}
