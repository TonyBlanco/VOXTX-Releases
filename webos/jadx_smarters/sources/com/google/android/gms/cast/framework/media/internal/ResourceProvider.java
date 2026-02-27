package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o4.AbstractC2338o;
import o4.AbstractC2339p;
import o4.AbstractC2342t;

/* JADX INFO: loaded from: classes3.dex */
public final class ResourceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f26368a;

    static {
        HashMap map = new HashMap();
        map.put("smallIconDrawableResId", Integer.valueOf(AbstractC2339p.f45922m));
        map.put("stopLiveStreamDrawableResId", Integer.valueOf(AbstractC2339p.f45923n));
        map.put("pauseDrawableResId", Integer.valueOf(AbstractC2339p.f45915f));
        map.put("playDrawableResId", Integer.valueOf(AbstractC2339p.f45916g));
        map.put("skipNextDrawableResId", Integer.valueOf(AbstractC2339p.f45920k));
        map.put("skipPrevDrawableResId", Integer.valueOf(AbstractC2339p.f45921l));
        map.put("forwardDrawableResId", Integer.valueOf(AbstractC2339p.f45912c));
        map.put("forward10DrawableResId", Integer.valueOf(AbstractC2339p.f45913d));
        map.put("forward30DrawableResId", Integer.valueOf(AbstractC2339p.f45914e));
        map.put("rewindDrawableResId", Integer.valueOf(AbstractC2339p.f45917h));
        map.put("rewind10DrawableResId", Integer.valueOf(AbstractC2339p.f45918i));
        map.put("rewind30DrawableResId", Integer.valueOf(AbstractC2339p.f45919j));
        map.put("disconnectDrawableResId", Integer.valueOf(AbstractC2339p.f45911b));
        map.put("notificationImageSizeDimenResId", Integer.valueOf(AbstractC2338o.f45903j));
        map.put("castingToDeviceStringResId", Integer.valueOf(AbstractC2342t.f46000b));
        map.put("stopLiveStreamStringResId", Integer.valueOf(AbstractC2342t.f46020v));
        map.put("pauseStringResId", Integer.valueOf(AbstractC2342t.f46012n));
        map.put("playStringResId", Integer.valueOf(AbstractC2342t.f46013o));
        map.put("skipNextStringResId", Integer.valueOf(AbstractC2342t.f46017s));
        map.put("skipPrevStringResId", Integer.valueOf(AbstractC2342t.f46018t));
        map.put("forwardStringResId", Integer.valueOf(AbstractC2342t.f46007i));
        map.put("forward10StringResId", Integer.valueOf(AbstractC2342t.f46008j));
        map.put("forward30StringResId", Integer.valueOf(AbstractC2342t.f46009k));
        map.put("rewindStringResId", Integer.valueOf(AbstractC2342t.f46014p));
        map.put("rewind10StringResId", Integer.valueOf(AbstractC2342t.f46015q));
        map.put("rewind30StringResId", Integer.valueOf(AbstractC2342t.f46016r));
        map.put("disconnectStringResId", Integer.valueOf(AbstractC2342t.f46004f));
        f26368a = Collections.unmodifiableMap(map);
    }

    @Keep
    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f26368a.get(str);
    }
}
