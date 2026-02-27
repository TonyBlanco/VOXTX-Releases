package com.nst.iptvsmarterstvbox.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StalkerLiveFavIdsSingleton {
    private static StalkerLiveFavIdsSingleton myObj;
    private List<Integer> favIdsList = new ArrayList();

    private StalkerLiveFavIdsSingleton() {
    }

    public static StalkerLiveFavIdsSingleton getInstance() {
        if (myObj == null) {
            myObj = new StalkerLiveFavIdsSingleton();
        }
        return myObj;
    }

    public List<Integer> getFavIdsList() {
        List<Integer> list = this.favIdsList;
        return list != null ? list : new ArrayList();
    }

    public void setFavIdsList(List<Integer> list) {
        this.favIdsList = list;
    }
}
