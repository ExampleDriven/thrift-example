package org.exampledriven.thriftexample;

import org.apache.thrift.TException;
import org.exampledriven.thriftexample.v2.gen.user.InvalidOperation;
import org.exampledriven.thriftexample.v2.gen.user.UserService;
import org.exampledriven.thriftexample.v2.gen.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceHandler implements UserService.Iface{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public User add(User user) throws InvalidOperation, TException {
		user.setId((int)(Math.random()*100));
		
		logger.debug("For user " + user.getFirstName() + " the " + user.getId()+ " ID was generated");
		return user;
	}

}
