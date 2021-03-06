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
package de.hybris.platform.btg.model.restrictions;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.btg.model.CmsRestrictionActionDefinitionModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BtgSegmentRestriction first defined at extension btg.
 */
@SuppressWarnings("all")
public class BtgSegmentRestrictionModel extends AbstractRestrictionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BtgSegmentRestriction";
	
	/**<i>Generated relation code constant for relation <code>RestrictionActionDefinitionToSegmentRestriction</code> defining source attribute <code>outputActionDefinition</code> in extension <code>btg</code>.</i>*/
	public final static String _RESTRICTIONACTIONDEFINITIONTOSEGMENTRESTRICTION = "RestrictionActionDefinitionToSegmentRestriction";
	
	/** <i>Generated constant</i> - Attribute key of <code>BtgSegmentRestriction.outputActionDefinition</code> attribute defined at extension <code>btg</code>. */
	public static final String OUTPUTACTIONDEFINITION = "outputActionDefinition";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BtgSegmentRestrictionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BtgSegmentRestrictionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _outputActionDefinition initial attribute declared by type <code>BtgSegmentRestriction</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public BtgSegmentRestrictionModel(final CatalogVersionModel _catalogVersion, final CmsRestrictionActionDefinitionModel _outputActionDefinition, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOutputActionDefinition(_outputActionDefinition);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 * @param _outputActionDefinition initial attribute declared by type <code>BtgSegmentRestriction</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>CMSItem</code> at extension <code>cms2</code>
	 */
	@Deprecated
	public BtgSegmentRestrictionModel(final CatalogVersionModel _catalogVersion, final CmsRestrictionActionDefinitionModel _outputActionDefinition, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOutputActionDefinition(_outputActionDefinition);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BtgSegmentRestriction.outputActionDefinition</code> attribute defined at extension <code>btg</code>. 
	 * @return the outputActionDefinition
	 */
	@Accessor(qualifier = "outputActionDefinition", type = Accessor.Type.GETTER)
	public CmsRestrictionActionDefinitionModel getOutputActionDefinition()
	{
		return getPersistenceContext().getPropertyValue(OUTPUTACTIONDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BtgSegmentRestriction.outputActionDefinition</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the outputActionDefinition
	 */
	@Accessor(qualifier = "outputActionDefinition", type = Accessor.Type.SETTER)
	public void setOutputActionDefinition(final CmsRestrictionActionDefinitionModel value)
	{
		getPersistenceContext().setPropertyValue(OUTPUTACTIONDEFINITION, value);
	}
	
}
