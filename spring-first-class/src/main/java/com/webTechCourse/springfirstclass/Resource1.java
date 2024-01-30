package com.webTechCourse.springfirstclass;

public class Resource1 {

  private final long id;
  private final String content;

  public Resource1() {
    this.id = -1;
    this.content = "";
  }

  public Resource1(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
