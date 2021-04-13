package Topic2;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.io.Serializable;
import java.time.*;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class Emp{
	@Id
	@Column
	int empcode;
	@Column(length=20)
	String ename;
	@Column(name="Designation")
	String desig;
	@Column(name="DOB")
	Date dob;
	@Column(name="Joining date")
	Date stdate;
	@Column
	int age;
	@Column(name="Basic pay")
	int sal;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		if (desig.equals("SE")||desig.equals("SSE")||desig.equals("SS")||desig.equals("SSS"))
			this.desig = desig;
		else this.desig=null;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getStdate() {
		return stdate;
	}
	public void setStdate(Date stdate) {
		Calendar a = getCalendar(stdate);
	    Calendar b = getCalendar(dob);
	    int d = a.YEAR - b.YEAR;
	    if (d>=18)
	    	this.stdate = stdate;
	    else this.stdate=null;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>=18 && age<=60)
			this.age = age;
		else this.age = -1;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public static Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance(Locale.US);
	    cal.setTime(date);
	    return cal;
	}
	
	
}
