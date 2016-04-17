package com.potopalskyi.okapi.entity;

public class Board {
    private long id;
    private String name;
    private String globalType;
    private String repoURL;
    private long userId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGlobalType() {
        return globalType;
    }

    public void setGlobalType(String globalType) {
        this.globalType = globalType;
    }

    public String getRepoURL() {
        return repoURL;
    }

    public void setRepoURL(String repoURL) {
        this.repoURL = repoURL;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", globalType='" + globalType + '\'' +
                ", repoURL='" + repoURL + '\'' +
                ", userId=" + userId +
                '}';
    }
}
