package com.amplifyframework.hub;

import com.amplifyframework.core.category.Category;
import com.amplifyframework.core.category.CategoryType;

/* JADX INFO: loaded from: classes.dex */
public final class HubCategory extends Category<HubPlugin<?>> implements HubCategoryBehavior {
    private final HubPlugin<?> defaultPlugin = new AWSHubPlugin();

    private HubPlugin<?> getHubPlugin() {
        return (!super.isInitialized() || super.getPlugins().isEmpty()) ? this.defaultPlugin : (HubPlugin) super.getSelectedPlugin();
    }

    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return CategoryType.HUB;
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public <T> void publish(HubChannel hubChannel, HubEvent<T> hubEvent) {
        getHubPlugin().publish(hubChannel, hubEvent);
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public SubscriptionToken subscribe(HubChannel hubChannel, HubEventFilter hubEventFilter, HubSubscriber hubSubscriber) {
        return getHubPlugin().subscribe(hubChannel, hubEventFilter, hubSubscriber);
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public SubscriptionToken subscribe(HubChannel hubChannel, HubSubscriber hubSubscriber) {
        return getHubPlugin().subscribe(hubChannel, hubSubscriber);
    }

    @Override // com.amplifyframework.hub.HubCategoryBehavior
    public void unsubscribe(SubscriptionToken subscriptionToken) {
        getHubPlugin().unsubscribe(subscriptionToken);
    }
}
