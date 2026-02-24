package com.amazonaws.mobileconnectors.appsync;

import v1.InterfaceC2868f;

/* JADX INFO: loaded from: classes.dex */
class MutationInterceptorMessage {
    String clientState;
    final InterfaceC2868f currentMutation;
    final InterfaceC2868f originalMutation;
    String requestClassName;
    String requestIdentifier;
    String serverState;

    public MutationInterceptorMessage() {
        this.originalMutation = null;
        this.currentMutation = null;
    }

    public MutationInterceptorMessage(InterfaceC2868f interfaceC2868f, InterfaceC2868f interfaceC2868f2) {
        this.originalMutation = interfaceC2868f;
        this.currentMutation = interfaceC2868f2;
    }
}
