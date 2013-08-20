package org.exampledriven.thriftexample.integrationtest;

import junit.framework.Assert;
import org.apache.thrift.TException;
import org.exampledriven.thriftexample.v1.gen.user.User;
import org.exampledriven.thriftexample.v1.UserClientV1;

import org.junit.Test;


public class UserClientTestV1 {

	@Test
	public void testAdd() throws TException {
        String servletUrl = "http://localhost:8080/UserServlet";

        User user = new User();
        user.setFirstName("firstName");
        
        User savedUser = new UserClientV1(servletUrl).add(user);

        Assert.assertTrue("ID was not assigned by the server", savedUser.getId() != 0);
        
	}

}
