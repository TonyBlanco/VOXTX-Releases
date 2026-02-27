package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ListBucketInventoryConfigurationsResult implements Serializable {
    private String continuationToken;
    private List<InventoryConfiguration> inventoryConfigurationList;
    private boolean isTruncated;
    private String nextContinuationToken;

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public List<InventoryConfiguration> getInventoryConfigurationList() {
        return this.inventoryConfigurationList;
    }

    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    public boolean isTruncated() {
        return this.isTruncated;
    }

    public void setContinuationToken(String str) {
        this.continuationToken = str;
    }

    public void setInventoryConfigurationList(List<InventoryConfiguration> list) {
        this.inventoryConfigurationList = list;
    }

    public void setNextContinuationToken(String str) {
        this.nextContinuationToken = str;
    }

    public void setTruncated(boolean z9) {
        this.isTruncated = z9;
    }

    public ListBucketInventoryConfigurationsResult withContinuationToken(String str) {
        setContinuationToken(str);
        return this;
    }

    public ListBucketInventoryConfigurationsResult withInventoryConfigurationList(List<InventoryConfiguration> list) {
        setInventoryConfigurationList(list);
        return this;
    }

    public ListBucketInventoryConfigurationsResult withNextContinuationToken(String str) {
        setNextContinuationToken(str);
        return this;
    }

    public ListBucketInventoryConfigurationsResult withTruncated(boolean z9) {
        setTruncated(z9);
        return this;
    }
}
