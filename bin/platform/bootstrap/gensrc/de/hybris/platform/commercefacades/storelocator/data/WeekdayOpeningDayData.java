/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 10.10.2018 08:59:38
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.commercefacades.storelocator.data;

import de.hybris.platform.commercefacades.storelocator.data.OpeningDayData;

public  class WeekdayOpeningDayData extends OpeningDayData 
{


	/** <i>Generated property</i> for <code>WeekdayOpeningDayData.weekDay</code> property defined at extension <code>commercefacades</code>. */
		
	private String weekDay;

	/** <i>Generated property</i> for <code>WeekdayOpeningDayData.closed</code> property defined at extension <code>commercefacades</code>. */
		
	private boolean closed;
	
	public WeekdayOpeningDayData()
	{
		// default constructor
	}
	
		
	
	public void setWeekDay(final String weekDay)
	{
		this.weekDay = weekDay;
	}

		
	
	public String getWeekDay() 
	{
		return weekDay;
	}
	
		
	
	public void setClosed(final boolean closed)
	{
		this.closed = closed;
	}

		
	
	public boolean isClosed() 
	{
		return closed;
	}
	


}