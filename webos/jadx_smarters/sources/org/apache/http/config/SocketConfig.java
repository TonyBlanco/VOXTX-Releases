package org.apache.http.config;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class SocketConfig implements Cloneable {
    public static final SocketConfig DEFAULT = new Builder().build();
    private final int backlogSize;
    private final int rcvBufSize;
    private final int sndBufSize;
    private final boolean soKeepAlive;
    private final int soLinger;
    private final boolean soReuseAddress;
    private final int soTimeout;
    private final boolean tcpNoDelay;

    public static class Builder {
        private int backlogSize;
        private int rcvBufSize;
        private int sndBufSize;
        private boolean soKeepAlive;
        private boolean soReuseAddress;
        private int soTimeout;
        private int soLinger = -1;
        private boolean tcpNoDelay = true;

        public SocketConfig build() {
            return new SocketConfig(this.soTimeout, this.soReuseAddress, this.soLinger, this.soKeepAlive, this.tcpNoDelay, this.sndBufSize, this.rcvBufSize, this.backlogSize);
        }

        public Builder setBacklogSize(int i9) {
            this.backlogSize = i9;
            return this;
        }

        public Builder setRcvBufSize(int i9) {
            this.rcvBufSize = i9;
            return this;
        }

        public Builder setSndBufSize(int i9) {
            this.sndBufSize = i9;
            return this;
        }

        public Builder setSoKeepAlive(boolean z9) {
            this.soKeepAlive = z9;
            return this;
        }

        public Builder setSoLinger(int i9) {
            this.soLinger = i9;
            return this;
        }

        public Builder setSoReuseAddress(boolean z9) {
            this.soReuseAddress = z9;
            return this;
        }

        public Builder setSoTimeout(int i9) {
            this.soTimeout = i9;
            return this;
        }

        public Builder setTcpNoDelay(boolean z9) {
            this.tcpNoDelay = z9;
            return this;
        }
    }

    public SocketConfig(int i9, boolean z9, int i10, boolean z10, boolean z11, int i11, int i12, int i13) {
        this.soTimeout = i9;
        this.soReuseAddress = z9;
        this.soLinger = i10;
        this.soKeepAlive = z10;
        this.tcpNoDelay = z11;
        this.sndBufSize = i11;
        this.rcvBufSize = i12;
        this.backlogSize = i13;
    }

    public static Builder copy(SocketConfig socketConfig) {
        Args.notNull(socketConfig, "Socket config");
        return new Builder().setSoTimeout(socketConfig.getSoTimeout()).setSoReuseAddress(socketConfig.isSoReuseAddress()).setSoLinger(socketConfig.getSoLinger()).setSoKeepAlive(socketConfig.isSoKeepAlive()).setTcpNoDelay(socketConfig.isTcpNoDelay()).setSndBufSize(socketConfig.getSndBufSize()).setRcvBufSize(socketConfig.getRcvBufSize()).setBacklogSize(socketConfig.getBacklogSize());
    }

    public static Builder custom() {
        return new Builder();
    }

    public SocketConfig clone() throws CloneNotSupportedException {
        return (SocketConfig) super.clone();
    }

    public int getBacklogSize() {
        return this.backlogSize;
    }

    public int getRcvBufSize() {
        return this.rcvBufSize;
    }

    public int getSndBufSize() {
        return this.sndBufSize;
    }

    public int getSoLinger() {
        return this.soLinger;
    }

    public int getSoTimeout() {
        return this.soTimeout;
    }

    public boolean isSoKeepAlive() {
        return this.soKeepAlive;
    }

    public boolean isSoReuseAddress() {
        return this.soReuseAddress;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public String toString() {
        return "[soTimeout=" + this.soTimeout + ", soReuseAddress=" + this.soReuseAddress + ", soLinger=" + this.soLinger + ", soKeepAlive=" + this.soKeepAlive + ", tcpNoDelay=" + this.tcpNoDelay + ", sndBufSize=" + this.sndBufSize + ", rcvBufSize=" + this.rcvBufSize + ", backlogSize=" + this.backlogSize + "]";
    }
}
