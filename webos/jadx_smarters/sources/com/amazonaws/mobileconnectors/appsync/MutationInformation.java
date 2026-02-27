package com.amazonaws.mobileconnectors.appsync;

import D1.a;
import v1.InterfaceC2867e;

/* JADX INFO: loaded from: classes.dex */
class MutationInformation {
    String clientState;
    a.InterfaceC0015a customerCallBack;
    MuationType muationType;
    InMemoryOfflineMutationObject originalInMemoryMutation;
    PersistentOfflineMutationObject originalPersistMutation;
    InterfaceC2867e retryMutation;
    String uniqueIdentifier;

    public MutationInformation(String str, InMemoryOfflineMutationObject inMemoryOfflineMutationObject, a.InterfaceC0015a interfaceC0015a, String str2) {
        this.originalInMemoryMutation = inMemoryOfflineMutationObject;
        this.customerCallBack = interfaceC0015a;
        this.clientState = str2;
        this.muationType = MuationType.InMemory;
        this.uniqueIdentifier = str;
    }

    public MutationInformation(String str, PersistentOfflineMutationObject persistentOfflineMutationObject, String str2) {
        this.uniqueIdentifier = str;
        this.originalPersistMutation = persistentOfflineMutationObject;
        this.clientState = str2;
        this.muationType = MuationType.Persistent;
    }

    public void updateCustomerCallBack(a.InterfaceC0015a interfaceC0015a) {
        this.customerCallBack = interfaceC0015a;
    }

    public void updateRetryMutation(InterfaceC2867e interfaceC2867e) {
        this.retryMutation = interfaceC2867e;
    }
}
