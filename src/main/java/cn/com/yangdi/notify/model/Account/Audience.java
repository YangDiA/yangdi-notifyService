package cn.com.yangdi.notify.model.Account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(
    name = "tbl_Audience"
)
public class Audience {
	
	@Id
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid") 
	@GeneratedValue(generator = "uuidGenerator")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;
	
	private String userCode;
	
	private String passWord;
	
	private String appKey;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	
	
}
