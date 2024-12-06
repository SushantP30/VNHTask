package in.sushit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    @Pattern(regexp = "M|F", message = "Sex must be 'M' or 'F'")
    private String sex;

    @Past
    @NotNull
    private LocalDate dob;

    private String nativeLocation;

    @NotEmpty
    private String accountType;

    @Pattern(regexp = "fulltime|parttime", message = "contractType must be 'fulltime' or 'parttime'")
    private String contractType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getNativeLocation() {
		return nativeLocation;
	}

	public void setNativeLocation(String nativeLocation) {
		this.nativeLocation = nativeLocation;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Customer(Long id, @NotEmpty String name,
			@Pattern(regexp = "M|F", message = "Sex must be 'M' or 'F'") String sex, @Past @NotNull LocalDate dob,
			String nativeLocation, @NotEmpty String accountType,
			@Pattern(regexp = "fulltime|parttime", message = "contractType must be 'fulltime' or 'parttime'") String contractType) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.dob = dob;
		this.nativeLocation = nativeLocation;
		this.accountType = accountType;
		this.contractType = contractType;
	}

 
    
}


