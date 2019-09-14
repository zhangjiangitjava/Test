package com.bw.tzsbproject.pojo;

public class Power {
    private Integer id;
    private String name;
    private Integer pId;
    private String url;
    private String target;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Power{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pId=" + pId +
                ", url='" + url + '\'' +
                ", target='" + target + '\'' +
                '}';
    }
}
