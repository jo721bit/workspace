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
package de.hybris.platform.btg.data;

import de.hybris.platform.btg.enums.BTGResultScope;
import de.hybris.platform.core.PK;

public  class BTGAbstractResultData  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>BTGAbstractResultData.pk</code> property defined at extension <code>btg</code>. */
		
	private PK pk;

	/** <i>Generated property</i> for <code>BTGAbstractResultData.user</code> property defined at extension <code>btg</code>. */
		
	private PK user;

	/** <i>Generated property</i> for <code>BTGAbstractResultData.fulfilled</code> property defined at extension <code>btg</code>. */
		
	private boolean fulfilled;

	/** <i>Generated property</i> for <code>BTGAbstractResultData.forced</code> property defined at extension <code>btg</code>. */
		
	private boolean forced;

	/** <i>Generated property</i> for <code>BTGAbstractResultData.invalidated</code> property defined at extension <code>btg</code>. */
		
	private boolean invalidated;

	/** <i>Generated property</i> for <code>BTGAbstractResultData.resultScope</code> property defined at extension <code>btg</code>. */
		
	private BTGResultScope resultScope;

	/** <i>Generated property</i> for <code>BTGAbstractResultData.sessionId</code> property defined at extension <code>btg</code>. */
		
	private String sessionId;

	/** <i>Generated property</i> for <code>BTGAbstractResultData.sequence</code> property defined at extension <code>btg</code>. */
		
	private String sequence;
	
	public BTGAbstractResultData()
	{
		// default constructor
	}
	
		
	
	public void setPk(final PK pk)
	{
		this.pk = pk;
	}

		
	
	public PK getPk() 
	{
		return pk;
	}
	
		
	
	public void setUser(final PK user)
	{
		this.user = user;
	}

		
	
	public PK getUser() 
	{
		return user;
	}
	
		
	
	public void setFulfilled(final boolean fulfilled)
	{
		this.fulfilled = fulfilled;
	}

		
	
	public boolean isFulfilled() 
	{
		return fulfilled;
	}
	
		
	
	public void setForced(final boolean forced)
	{
		this.forced = forced;
	}

		
	
	public boolean isForced() 
	{
		return forced;
	}
	
		
	
	public void setInvalidated(final boolean invalidated)
	{
		this.invalidated = invalidated;
	}

		
	
	public boolean isInvalidated() 
	{
		return invalidated;
	}
	
		
	
	public void setResultScope(final BTGResultScope resultScope)
	{
		this.resultScope = resultScope;
	}

		
	
	public BTGResultScope getResultScope() 
	{
		return resultScope;
	}
	
		
	
	public void setSessionId(final String sessionId)
	{
		this.sessionId = sessionId;
	}

		
	
	public String getSessionId() 
	{
		return sessionId;
	}
	
		
	
	public void setSequence(final String sequence)
	{
		this.sequence = sequence;
	}

		
	
	public String getSequence() 
	{
		return sequence;
	}
	


}