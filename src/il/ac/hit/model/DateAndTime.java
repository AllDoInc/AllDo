package il.ac.hit.model;


/**
 * 
 * @author Efi Shimon
 *
 *this class will be the date and time class for the AllDo project.
 *classes that suppose to use this class are:
 *Memo, User
 */
public class DateAndTime 
{
	Integer second;  // 0 - 59
	Integer minute;   // 0 - 59
	Integer hour;     // 0 - 24  or 1 - 12 AmPm
	Integer day;      // 1 - 31  
	Integer month;    // 1 - 12
	Integer year;     // 2016 and on 

	/**
	 * 
	 * @param second
	 * @param minute
	 * @param hour
	 * @param day
	 * @param month
	 * @param year
	 * @category constructor for DateAndTime, for Class Memo
	 */
	public DateAndTime(Integer second , Integer minute , Integer hour , Integer day , Integer month , Integer year) 
	{
		setSecond(second);
		setMinute(minute);
		setHour(hour);
		setDay(day);
		setMinute(month);
		setYear(year);
	}
	
	DateAndTime(){}; // for hibernate

/**
 * @category SetBirthDate
 * @param year
 * @param month
 * @param day
 * constructor for birthday - for the usercreation
 */
	public DateAndTime(Integer year, Integer month, Integer day)
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	/**
	 * @return the second
	 */
	public Integer getSecond()
	{
		return second;
	}
	/**
	 * @param secound the second to set
	 */
	public void setSecond(Integer second)
	{
		this.second = second;
	}
	/**
	 * @return the minute
	 */
	public Integer getMinute() 
	{
		return minute;
	}
	/**
	 * @param minute the minute to set
	 */
	public void setMinute(Integer minute)
	{
		this.minute = minute;
	}
	/**
	 * @return the hour
	 */
	public Integer getHour() 
	{
		return hour;
	}
	/**
	 * @param hour the hour to set
	 */
	public void setHour(Integer hour)
	{
		this.hour = hour;
	}
	/**
	 * @return the day
	 */
	public Integer getDay()
	{
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(Integer day) 
	{
		this.day = day;
	}
	/**
	 * @return the month
	 */
	public Integer getMonth() 
	{
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(Integer month)
	{
		this.month = month;
	}
	/**
	 * @return the year
	 */
	public Integer getYear() 
	{
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) 
	{
		this.year = year;
	}
	
	
	public void validateDateTime(){}; //TODO implement the validation method
	
	public void updateDateAndTime(){}; //TODO implement update method 

}
