package org.exampledriven.thriftexample;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TServlet;
import org.exampledriven.thriftexample.UserServiceHandler;
import org.exampledriven.thriftexample.v2.gen.user.UserService;

public class UserServlet extends TServlet {

	private static final long serialVersionUID = -1479231841402200033L;

	public UserServlet() {

		super(new UserService.Processor<>(new UserServiceHandler()), new TCompactProtocol.Factory());
		
	}
}
