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
package de.hybris.platform.commercefacades.catalog.data;

import de.hybris.platform.commercefacades.catalog.data.AbstractCatalogItemData;
import de.hybris.platform.commercefacades.catalog.data.CategoryHierarchyData;
import java.util.Collection;

public  class CatalogVersionData extends AbstractCatalogItemData 
{


	/** <i>Generated property</i> for <code>CatalogVersionData.categoriesHierarchyData</code> property defined at extension <code>commercefacades</code>. */
		
	private Collection<CategoryHierarchyData> categoriesHierarchyData;
	
	public CatalogVersionData()
	{
		// default constructor
	}
	
		
	
	public void setCategoriesHierarchyData(final Collection<CategoryHierarchyData> categoriesHierarchyData)
	{
		this.categoriesHierarchyData = categoriesHierarchyData;
	}

		
	
	public Collection<CategoryHierarchyData> getCategoriesHierarchyData() 
	{
		return categoriesHierarchyData;
	}
	


}