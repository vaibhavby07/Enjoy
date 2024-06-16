package requestBody_Payload;

public class PojoClass3_Super
{
	//Globally declare the variable
  String name;                //declaration
  String job;
  String id;
  
public PojoClass3_Super(String name, String job,String id)
{
	//super();
	this.name=name;           //Initialization
	this.job=job;
	this.id=id;
}
    //getters
public String getName() {     //utilization
	return name;
}

public String getJob() {
	return job;
}
public String getId() {
	return id;
}
}
