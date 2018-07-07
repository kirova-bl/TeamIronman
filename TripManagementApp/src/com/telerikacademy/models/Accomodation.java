package com.telerikacademy.models;

import com.telerikacademy.enumerations.AccomodationType;

import java.time.LocalDate;

public class Accomodation extends TripActivity implements Reservable,Payable {
  private String location;
  private String address;
  private double price;
  private AccomodationType accomodationType;

  public Accomodation(String name, LocalDate startDate, LocalDate endDate) {
    super(name, startDate, endDate);
  }

  public Accomodation(String name, LocalDate startDate, long period) {
    super(name, startDate, period);
  }

  @Override
  public void printInfo() {

  }

  @Override
  public void addReservationDetails() {

  }

  @Override
  public void receivePaymentDetails() {

  }
}
