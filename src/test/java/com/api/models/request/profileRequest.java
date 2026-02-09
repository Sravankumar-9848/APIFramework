package com.api.models.request;

public class profileRequest {

	
	
	private  String firStName; 
	private String  laStName; 
	private  String  email; 
	 private String  mobileNumber;
	public profileRequest(String firStName, String laStName, String email, String mobileNumber) {
		super();
		this.firStName = firStName;
		this.laStName = laStName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public String getFirStName() {
		return firStName;
	}
	public void setFirStName(String firStName) {
		this.firStName = firStName;
	}
	public String getLaStName() {
		return laStName;
	}
	public void setLaStName(String laStName) {
		this.laStName = laStName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "profileRequest [firStName=" + firStName + ", laStName=" + laStName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	 
	 
	 public static class  Builder {
		 private  String firStName; 
			private String  lastName; 
			private  String  email; 
			 private String  mobileNumber;
		 
			 
			 public Builder FirStName(String firStName) {
					this.firStName = firStName;
					return this;
				}
			 
			 public Builder lasName(String laStName) {
					this.lastName = laStName;
					return this;
				}
			 public Builder email(String email) {
					this.email = email;
					return this;
				}
			 public Builder mobileNumber(String mobileNumber) {
					this.mobileNumber = mobileNumber;
					return this;
				}
			 public profileRequest build() {
				 profileRequest profilerequest=new profileRequest(firStName,lastName,email,mobileNumber);
				 return  profilerequest;
			 }
	 }
		
}
