package com.xigeng.waterfactory.model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -71843170075997971L;

	private Integer id;

    private String name;

    private String group;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + ", date=" + date + "]"+"\n";
	}
    
}