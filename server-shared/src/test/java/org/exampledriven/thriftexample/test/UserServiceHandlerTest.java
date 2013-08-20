package org.exampledriven.thriftexample.test;

import junit.framework.Assert;
import org.apache.thrift.TException;
import org.exampledriven.thriftexample.v2.gen.user.User;
import org.junit.Test;
import org.exampledriven.thriftexample.UserServiceHandler;

public class UserServiceHandlerTest {

    @Test
    public void testAdd() throws TException {

        User user = new User();
        user.setFirstName("firstName");

        User savedUser = new UserServiceHandler().add(user);

        Assert.assertTrue("ID was not assigned by the server", savedUser.getId() != 0);

    }
}
