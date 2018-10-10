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
package de.hybris.platform.commercefacades.order.data;

import de.hybris.platform.commercefacades.order.data.OrderEntryGroupData;
import de.hybris.platform.commercefacades.user.data.AddressData;

public  class DeliveryOrderEntryGroupData extends OrderEntryGroupData 
{


	/** <i>Generated property</i> for <code>DeliveryOrderEntryGroupData.deliveryAddress</code> property defined at extension <code>commercefacades</code>. */
		
	private AddressData deliveryAddress;
	
	public DeliveryOrderEntryGroupData()
	{
		// default constructor
	}
	
		
	
	public void setDeliveryAddress(final AddressData deliveryAddress)
	{
		this.deliveryAddress = deliveryAddress;
	}

		
	
	public AddressData getDeliveryAddress() 
	{
		return deliveryAddress;
	}
	


}