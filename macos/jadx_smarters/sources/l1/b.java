package L1;

import F1.h;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionResponse;
import java.util.List;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    void addListener(t tVar, AppSyncSubscriptionCall.Callback callback);

    void removeListener(t tVar, AppSyncSubscriptionCall.Callback callback);

    void subscribe(t tVar, List list, SubscriptionResponse subscriptionResponse, h hVar);

    void unsubscribe(t tVar);
}
