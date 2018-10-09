/*
 *  [y] hybris Platform
 *
 *  Copyright (c) 2000-2016 SAP SE
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of SAP
 *  Hybris ("Confidential Information"). You shall not disclose such
 *  Confidential Information and shall use it only in accordance with the
 *  terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.catalog.dynamic;

import de.hybris.platform.core.model.user.AddressModel;

import java.util.Collection;
import java.util.Iterator;


public class CompanyShippingAddressesAttributeHandler extends AbstractCompanyAddressAttributeHandler
{

	@Override
	public void filterOutAddresses(final Collection<AddressModel> addresses)
	{
		for (final Iterator<AddressModel> it = addresses.iterator(); it.hasNext();)
		{
			final AddressModel address = it.next();
			if (address.getShippingAddress() == null || !address.getShippingAddress())
			{
				it.remove();
			}
		}
	}

}