package mypack;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="ContrEmp1")
@AttributeOverrides({ @AttributeOverride( name="id" , column=@Column(name="id")),
	@AttributeOverride( name="name" , column=@Column(name="name"))})	
	
public class Contract_Employee extends Employee {
	@Column(name="pay_per_hear")
	float pay_per_hear;
	
	@Column(name="contract_period")
String contract_period;
	
public float getPay_per_hear() {
	return pay_per_hear;
}
public void setPay_per_hear(float pay_per_hear) {
	this.pay_per_hear = pay_per_hear;
}
public String getContract_period() {
	return contract_period;
}
public void setContract_period(String contract_period) {
	this.contract_period = contract_period;
}

}
