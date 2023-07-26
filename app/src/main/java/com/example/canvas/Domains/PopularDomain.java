package com.example.canvas.Domains;

import java.io.Serializable;

public class PopularDomain implements Serializable {
    private String title;
    private String location;
    private String description;
    private Integer bed;
    private Boolean guide;
    private Double score;
    private String pic;
    private boolean wifi;
    private Integer price;

    public PopularDomain(String title, String location, String description, Integer bed, Boolean guide, Double score, String pic, boolean wifi, Integer price) {
        this.title = title;
        this.location = location;
        this.description = description;
        this.bed = bed;
        this.guide = guide;
        this.score = score;
        this.pic = pic;
        this.wifi = wifi;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBed() {
        return bed;
    }

    public void setBed(Integer bed) {
        this.bed = bed;
    }

    public Boolean isGuide() {
        return guide;
    }

    public void setGuide(Boolean guide) {
        this.guide = guide;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
