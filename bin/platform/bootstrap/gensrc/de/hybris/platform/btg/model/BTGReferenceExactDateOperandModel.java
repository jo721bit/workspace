/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 10.10.2018 08:59:36                         ---
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
 *  
 */
package de.hybris.platform.btg.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.btg.model.BTGAbstractReferenceOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Date;

/**
 * Generated model class for type BTGReferenceExactDateOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGReferenceExactDateOperandModel extends BTGAbstractReferenceOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGReferenceExactDateOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGReferenceExactDateOperand.referenceDate</code> attribute defined at extension <code>btg</code>. */
	public static final String REFERENCEDATE = "referenceDate";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGReferenceExactDateOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGReferenceExactDateOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _referenceDate initial attribute declared by type <code>BTGReferenceExactDateOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceExactDateOperandModel(final CatalogVersionModel _catalogVersion, final Date _referenceDate, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setReferenceDate(_referenceDate);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _referenceDate initial attribute declared by type <code>BTGReferenceExactDateOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGReferenceExactDateOperandModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final Date _referenceDate, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setReferenceDate(_referenceDate);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGReferenceExactDateOperand.referenceDate</code> attribute defined at extension <code>btg</code>. 
	 * @return the referenceDate
	 */
	@Accessor(qualifier = "referenceDate", type = Accessor.Type.GETTER)
	public Date getReferenceDate()
	{
		return getPersistenceContext().getPropertyValue(REFERENCEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGReferenceExactDateOperand.referenceDate</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the referenceDate
	 */
	@Accessor(qualifier = "referenceDate", type = Accessor.Type.SETTER)
	public void setReferenceDate(final Date value)
	{
		getPersistenceContext().setPropertyValue(REFERENCEDATE, value);
	}
	
}
