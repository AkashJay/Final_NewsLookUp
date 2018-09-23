package IRWA.Solr_NewsLookUp.bean;

import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;

public class News {
	
	@Field("id")
	private String id;
	
	@Field("image")
	private String image;
	
	@Field("month")
	private String month;
	
	@Field("content")
	private String content;
	
	@Field("link")
	private String link;
	
	@Field("year")
	private String year;
	
	@Field("date")
	private Date date;
	
	@Field("heading")
	private String heading;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}
	
	
	
	

}
