package com.pravasi.pravasigigsmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GIGS")
public class Gig {

    @Id
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "pickup_point")
    private String pickupPoint;

    @Column(name = "delivery_point")
    private String deliveryPoint;

    @Column(name = "content")
    private String content;

    @Column(name = "weight")
    private Double weight;

    public Gig() {

    }

    public Gig(Long id, Long userId, String pickupPoint, String deliveryPoint, String content, Double weight) {
        this.id = id;
        this.userId = userId;
        this.pickupPoint = pickupPoint;
        this.deliveryPoint = deliveryPoint;
        this.content = content;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }

    public void setPickupPoint(String pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
