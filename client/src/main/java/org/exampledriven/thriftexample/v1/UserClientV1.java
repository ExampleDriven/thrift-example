package org.exampledriven.thriftexample.v1;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransportException;
import org.exampledriven.thriftexample.v1.gen.user.InvalidOperation;
import org.exampledriven.thriftexample.v1.gen.user.User;
import org.exampledriven.thriftexample.v1.gen.user.UserService;

public class UserClientV1 implements UserService.Iface {

	private UserService.Client client;
	
	public UserClientV1(String servletUrl) throws TTransportException {
		
        THttpClient thc = new THttpClient(servletUrl);
        TProtocol loPFactory = new TCompactProtocol(thc);
        client = new UserService.Client(loPFactory);
		
	}

	@Override
	public User add(User user) throws InvalidOperation, TException {
		return client.add(user);
	}

}
