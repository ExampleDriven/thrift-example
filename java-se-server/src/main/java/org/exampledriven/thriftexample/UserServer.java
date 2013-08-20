package org.exampledriven.thriftexample;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.exampledriven.thriftexample.v2.gen.user.UserService;

public class UserServer {

	/**
	 * @param args
	 * @throws TTransportException 
	 */
	public static void main(String[] args) throws TTransportException {
		UserServiceHandler handler = new UserServiceHandler();
		UserService.Processor<UserServiceHandler> processor = new UserService.Processor<UserServiceHandler>(handler);
		TServerTransport serverTransport = new TServerSocket(9090);
		TServer server = new TSimpleServer(new TSimpleServer.Args(serverTransport).processor(processor));

		System.out.println("Starting the simple server...");
		server.serve();
	}

}
