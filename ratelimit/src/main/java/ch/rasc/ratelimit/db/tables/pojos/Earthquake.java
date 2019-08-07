/*
 * This file is generated by jOOQ.
 */
package ch.rasc.ratelimit.db.tables.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.11" },
    comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Earthquake implements Serializable {

  private static final long serialVersionUID = 2004080281;

  private Long id;
  private LocalDateTime time;
  private BigDecimal latitude;
  private BigDecimal longitude;
  private BigDecimal depth;
  private BigDecimal mag;
  private String place;
  private String earthquakeId;

  public Earthquake() {
  }

  public Earthquake(Earthquake value) {
    this.id = value.id;
    this.time = value.time;
    this.latitude = value.latitude;
    this.longitude = value.longitude;
    this.depth = value.depth;
    this.mag = value.mag;
    this.place = value.place;
    this.earthquakeId = value.earthquakeId;
  }

  public Earthquake(Long id, LocalDateTime time, BigDecimal latitude,
      BigDecimal longitude, BigDecimal depth, BigDecimal mag, String place,
      String earthquakeId) {
    this.id = id;
    this.time = time;
    this.latitude = latitude;
    this.longitude = longitude;
    this.depth = depth;
    this.mag = mag;
    this.place = place;
    this.earthquakeId = earthquakeId;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDateTime getTime() {
    return this.time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public BigDecimal getLatitude() {
    return this.latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public BigDecimal getLongitude() {
    return this.longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public BigDecimal getDepth() {
    return this.depth;
  }

  public void setDepth(BigDecimal depth) {
    this.depth = depth;
  }

  public BigDecimal getMag() {
    return this.mag;
  }

  public void setMag(BigDecimal mag) {
    this.mag = mag;
  }

  public String getPlace() {
    return this.place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getEarthquakeId() {
    return this.earthquakeId;
  }

  public void setEarthquakeId(String earthquakeId) {
    this.earthquakeId = earthquakeId;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Earthquake (");

    sb.append(this.id);
    sb.append(", ").append(this.time);
    sb.append(", ").append(this.latitude);
    sb.append(", ").append(this.longitude);
    sb.append(", ").append(this.depth);
    sb.append(", ").append(this.mag);
    sb.append(", ").append(this.place);
    sb.append(", ").append(this.earthquakeId);

    sb.append(")");
    return sb.toString();
  }
}