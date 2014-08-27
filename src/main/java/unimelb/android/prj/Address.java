package unimelb.android.prj;

import java.util.Date;

public class Address {

  long id;
  double lat;
  double lon;

  String title;
  String desc1;
  Object photo;
  Date dtime;

  public Address() {

  }

  public long getId() {
    return id;
  }

  public void setId(final long l) {
    this.id = l;
  }

  public double getlat() {
    return lat;
  }

  public void setlat(final double lat) {
    this.lat = lat;
  }

  public double getlon() {
    return lon;
  }

  public void setlon(final double lon) {
    this.lon = lon;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(final String title) {
    this.title = title;
  }

  public String getDesc1() {
    return desc1;
  }

  public void setDesc1(final String desc) {
    this.desc1 = desc;
  }

  public Object getPhoto() {
    return photo;
  }

  public void setPhoto(final Object photo) {
    this.photo = photo;
  }

  public Date getDtime() {
    return dtime;
  }

  public void setDtime(final Date dtime) {
    this.dtime = dtime;
  }

}
