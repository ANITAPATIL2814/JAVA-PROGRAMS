package IO;

/*
 * serialization: convert object to byte stream
 * deserialization:convert byte stream to object 
 */
import java.io.Serializable;
//implement class Serializable
public class student_serialization_eg implements Serializable {
	
	private static final long serialVersionUID = 1L; //this is default id 
	String sname;
	long sphone;
	int sid;
	//we use transient keyword we it is not going to convert into byte code it print as it is without deserization
	transient String  scholName; 
	public student_serialization_eg(int sid,String sname,long sphone,String  scholName) {
		this.sid=sid;
		this.sname=sname;
		this.sphone=sphone;
		this.scholName=scholName;
	}
}
