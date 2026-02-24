package com.nst.iptvsmarterstvbox.model;

/* JADX INFO: loaded from: classes.dex */
public class PlayerSelectedSinglton {
    private static PlayerSelectedSinglton myObj;
    private String playerType;

    private PlayerSelectedSinglton() {
    }

    public static PlayerSelectedSinglton getInstance() {
        if (myObj == null) {
            myObj = new PlayerSelectedSinglton();
        }
        return myObj;
    }

    public String getPlayerType() {
        return this.playerType;
    }

    public void setPlayerType(String str) {
        this.playerType = str;
    }
}
