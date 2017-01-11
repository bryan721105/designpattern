package design.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormate extends IDateFormate{
	
	private Calendar cal ;
	private SimpleDateFormat sdf ;
	private Date date ;
	private String  dateformat; 
	private String timeformat ;
	
	public  DateFormate(Date date) {
		this.date  = date ;
		cal = Calendar.getInstance() ;
		cal.setTime(this.date);
		this.dateformat= "yyyyMMdd";
		this.timeformat="HHmmss" ;
	}
	
	public  DateFormate(Date date, String dateFormdate) {
		this(date) ; 
		sdf = new SimpleDateFormat(dateFormdate) ;
		this.dateformat= dateFormdate;
		
	}
	
	public  DateFormate(Date date, String dateFormdate,String timeFormdate) {
		this(date, dateFormdate) ; 
		sdf = new SimpleDateFormat(dateFormdate+timeFormdate) ;
		this.dateformat= dateFormdate;
		this.timeformat = timeFormdate ;
		
	}
	
	@Override
	public int getYear() {
		 
		return cal.get(Calendar.YEAR) ;
	}
	

	@Override
	public int getMonth() {
		return (cal.get(Calendar.MONTH)+1) ;
	}

	@Override
	public int getDay() {
		 
		return cal.get(Calendar.DAY_OF_MONTH) ;
	}

	@Override
	public int getHour() {
		return cal.get(Calendar.HOUR) ;
	}

	@Override
	public int getMinute() {
		return cal.get(Calendar.MINUTE) ;
	}

	@Override
	public int getSecond() {
		return cal.get(Calendar.SECOND) ;
	}

	@Override
	public int getMillisecond() {
		return cal.get(Calendar.MILLISECOND) ;
	}

	@Override
	public int getWeek() {
		return cal.get(Calendar.WEEK_OF_MONTH) ;
	}

	@Override
	public int getMaxDayOfMonth() {
		return cal.getActualMaximum(5) ;
	}

	@Override
	public Long getTimeInMill() {
		return cal.getTime().getTime() ;
	}
	
	@Override
	public String toString() {
		if(this.sdf==null){
			return "";
		
		}else{	
			return this.sdf.format(this.date) ;
		
		}
	}
	
	@Override
	public String getFormate() {
		return this.dateformat+this.timeformat;
	}
	

	@Override
	public String toWesternDate() {
		 sdf = new SimpleDateFormat(this.dateformat) ;
		 return sdf.format(this.date) ; 
	}

	@Override
	public String toWesternTime() {
		sdf = new SimpleDateFormat(timeformat) ;
		return sdf.format(this.date) ; 
	}

	@Override
	protected Date getDate() {
		return this.date ;
	}

	

}
