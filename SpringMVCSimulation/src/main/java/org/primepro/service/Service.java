package org.primepro.service;

import org.primepro.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
private Dao dao;
public Service() {
	// TODO Auto-generated constructor stub
}

public Service(Dao dao)
{
	this.dao=dao;
}

public Dao getDao() {
	return dao;
}

@Autowired(required = true)
public void setDao(Dao dao) {
	this.dao = dao;
}

public void service()
{
	dao.dao();
}

}
