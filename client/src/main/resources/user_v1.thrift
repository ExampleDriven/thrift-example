namespace cpp tutorial
namespace java org.exampledriven.thriftexample.v1.gen.user
namespace php org.exampledriven.thriftexample.v1.gen.user
namespace perl tutorial

enum Status {
  ACTIVE,
  DELETED
}

exception InvalidOperation {
  1: i32 what,
  2: string why
}

struct User {
	1: string firstName,
	2: string lastName,
	3: Status status,
	4: i32 id
}

service UserService {

   User add(1:User user) throws (1:InvalidOperation io)

}

