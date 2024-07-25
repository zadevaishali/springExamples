package org.primepro.controller;

import org.primepro.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
  private Service service;
  public Controller() {
	// TODO Auto-generated constructor stub
}
  public Controller(Service service) {
	super();
	this.service = service;
}
  

public Service getService() {
	return service;
}

@Autowired(required = true)
public void setService(Service service) {
	this.service = service;
}


public void controller()
  {
	  service.service();
  }
}
