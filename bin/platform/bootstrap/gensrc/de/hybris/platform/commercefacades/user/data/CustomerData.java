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
package de.hybris.platform.commercefacades.user.data;

import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.PrincipalData;

public  class CustomerData extends PrincipalData 
{


	/** <i>Generated property</i> for <code>CustomerData.defaultBillingAddress</code> property defined at extension <code>commercefacades</code>. */
		
	private AddressData defaultBillingAddress;

	/** <i>Generated property</i> for <code>CustomerData.defaultShippingAddress</code> property defined at extension <code>commercefacades</code>. */
		
	private AddressData defaultShippingAddress;

	/** <i>Generated property</i> for <code>CustomerData.titleCode</code> property defined at extension <code>commercefacades</code>. */
		
	private String titleCode;

	/** <i>Generated property</i> for <code>CustomerData.firstName</code> property defined at extension <code>commercefacades</code>. */
		
	private String firstName;

	/** <i>Generated property</i> for <code>CustomerData.lastName</code> property defined at extension <code>commercefacades</code>. */
		
	private String lastName;

	/** <i>Generated property</i> for <code>CustomerData.currency</code> property defined at extension <code>commercefacades</code>. */
		
	private CurrencyData currency;

	/** <i>Generated property</i> for <code>CustomerData.language</code> property defined at extension <code>commercefacades</code>. */
		
	private LanguageData language;

	/** <i>Generated property</i> for <code>CustomerData.displayUid</code> property defined at extension <code>commercefacades</code>. */
		
	private String displayUid;
	
	public CustomerData()
	{
		// default constructor
	}
	
		
	
	public void setDefaultBillingAddress(final AddressData defaultBillingAddress)
	{
		this.defaultBillingAddress = defaultBillingAddress;
	}

		
	
	public AddressData getDefaultBillingAddress() 
	{
		return defaultBillingAddress;
	}
	
		
	
	public void setDefaultShippingAddress(final AddressData defaultShippingAddress)
	{
		this.defaultShippingAddress = defaultShippingAddress;
	}

		
	
	public AddressData getDefaultShippingAddress() 
	{
		return defaultShippingAddress;
	}
	
		
	
	public void setTitleCode(final String titleCode)
	{
		this.titleCode = titleCode;
	}

		
	
	public String getTitleCode() 
	{
		return titleCode;
	}
	
		
	
	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

		
	
	public String getFirstName() 
	{
		return firstName;
	}
	
		
	
	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}

		
	
	public String getLastName() 
	{
		return lastName;
	}
	
		
	
	public void setCurrency(final CurrencyData currency)
	{
		this.currency = currency;
	}

		
	
	public CurrencyData getCurrency() 
	{
		return currency;
	}
	
		
	
	public void setLanguage(final LanguageData language)
	{
		this.language = language;
	}

		
	
	public LanguageData getLanguage() 
	{
		return language;
	}
	
		
	
	public void setDisplayUid(final String displayUid)
	{
		this.displayUid = displayUid;
	}

		
	
	public String getDisplayUid() 
	{
		return displayUid;
	}
	


}