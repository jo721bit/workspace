/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 09.10.2018 12:58:58
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
package de.hybris.platform.solrfacetsearch.config;

import java.util.Date;

public  class EndpointURL  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>EndpointURL.url</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String url;

	/** <i>Generated property</i> for <code>EndpointURL.master</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean master;

	/** <i>Generated property</i> for <code>EndpointURL.modifiedTime</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private Date modifiedTime;
	
	public EndpointURL()
	{
		// default constructor
	}
	
		
	
	public void setUrl(final String url)
	{
		this.url = url;
	}

		
	
	public String getUrl() 
	{
		return url;
	}
	
		
	
	public void setMaster(final boolean master)
	{
		this.master = master;
	}

		
	
	public boolean isMaster() 
	{
		return master;
	}
	
		
	
	public void setModifiedTime(final Date modifiedTime)
	{
		this.modifiedTime = modifiedTime;
	}

		
	
	public Date getModifiedTime() 
	{
		return modifiedTime;
	}
	


}