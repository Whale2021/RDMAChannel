package com.basic.rdmachannel.token;

/**
 * locate com.basic.rdmachannel.mr
 * Created by mastertj on 2019/4/11.
 * RegionToken 获取操作MemoryRegion的使用权限
 */
public class RegionToken {
    private int sizeInBytes;
    private long address;
    private int localKey;
    private int remoteKey;

    public RegionToken(int sizeInBytes, long address, int localKey, int remoteKey) {
        this.sizeInBytes = sizeInBytes;
        this.address = address;
        this.localKey = localKey;
        this.remoteKey = remoteKey;
    }

    public RegionToken(int sizeInBytes, long address, int localKey) {
        this.sizeInBytes = sizeInBytes;
        this.address = address;
        this.localKey = localKey;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(int sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public long getAddress() {
        return address;
    }

    public void setAddress(long address) {
        this.address = address;
    }

    public int getLocalKey() {
        return localKey;
    }

    public void setLocalKey(int localKey) {
        this.localKey = localKey;
    }

    public int getRemoteKey() {
        return remoteKey;
    }

    public void setRemoteKey(int remoteKey) {
        this.remoteKey = remoteKey;
    }
}
