package com.amplifyframework.hub;

import android.util.Log;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static HubSubscriber a(final Consumer consumer) {
        return new HubSubscriber() { // from class: com.amplifyframework.hub.h
            @Override // com.amplifyframework.hub.HubSubscriber
            public final void onEvent(HubEvent hubEvent) {
                i.b(consumer, hubEvent);
            }
        };
    }

    public static /* synthetic */ void b(Consumer consumer, HubEvent hubEvent) {
        try {
            consumer.accept((HubEvent.Data) hubEvent.getData());
        } catch (Exception e9) {
            Log.w("amplify:aws-hub", "Unable to cast event data for event type " + hubEvent.getName(), e9);
        }
    }
}
