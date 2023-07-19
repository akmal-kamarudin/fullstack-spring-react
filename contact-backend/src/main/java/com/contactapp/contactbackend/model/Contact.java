package com.contactapp.contactbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "email")
  private String email;

  public Contact() {

  }

  public Contact(String name, String email) {
    super();
    this.name = name;
    this.email = email;
  }

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

  public String getEmail() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
