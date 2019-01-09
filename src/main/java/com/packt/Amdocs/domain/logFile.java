package com.packt.Amdocs.domain;
import java.sql.Date;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


//@Entity

public class logFile {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long fileid;
    private String file_name;
    private Date Date_time;
    public logFile() {}
	public logFile(String file_name) {
		super();
		this.file_name = file_name;
		
	}
	public long getfileid() {
		return fileid;
	}
	public void setfileid(long id) {
		this.fileid = id;
	}
	public String getfile_name() {
		return file_name;
	}
	public void setfile_name(String name) {
		this.file_name = name;
	}
	/**public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

**/

}
