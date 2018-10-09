/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 09.10.2018 12:58:55                         ---
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
import de.hybris.platform.basecommerce.enums.IntervalResolution;
import de.hybris.platform.btg.enums.BTGRuleType;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Map;

/**
 * Generated model class for type BTGConfig first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGConfigModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGConfig";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConfig.defaultCatalogVersion</code> attribute defined at extension <code>btg</code>. */
	public static final String DEFAULTCATALOGVERSION = "defaultCatalogVersion";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConfig.defaultTimeUnit</code> attribute defined at extension <code>btg</code>. */
	public static final String DEFAULTTIMEUNIT = "defaultTimeUnit";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConfig.usedRuleTypes</code> attribute defined at extension <code>btg</code>. */
	public static final String USEDRULETYPES = "usedRuleTypes";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConfig.operandMapping</code> attribute defined at extension <code>btg</code>. */
	public static final String OPERANDMAPPING = "operandMapping";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGConfigModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGConfigModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _defaultTimeUnit initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 * @param _operandMapping initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 * @param _usedRuleTypes initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConfigModel(final IntervalResolution _defaultTimeUnit, final Map<BTGRuleType,Collection<ComposedTypeModel>> _operandMapping, final Collection<BTGRuleType> _usedRuleTypes)
	{
		super();
		setDefaultTimeUnit(_defaultTimeUnit);
		setOperandMapping(_operandMapping);
		setUsedRuleTypes(_usedRuleTypes);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _defaultTimeUnit initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 * @param _operandMapping initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _usedRuleTypes initial attribute declared by type <code>BTGConfig</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConfigModel(final IntervalResolution _defaultTimeUnit, final Map<BTGRuleType,Collection<ComposedTypeModel>> _operandMapping, final ItemModel _owner, final Collection<BTGRuleType> _usedRuleTypes)
	{
		super();
		setDefaultTimeUnit(_defaultTimeUnit);
		setOperandMapping(_operandMapping);
		setOwner(_owner);
		setUsedRuleTypes(_usedRuleTypes);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConfig.defaultCatalogVersion</code> attribute defined at extension <code>btg</code>. 
	 * @return the defaultCatalogVersion
	 */
	@Accessor(qualifier = "defaultCatalogVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getDefaultCatalogVersion()
	{
		return getPersistenceContext().getPropertyValue(DEFAULTCATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConfig.defaultTimeUnit</code> attribute defined at extension <code>btg</code>. 
	 * @return the defaultTimeUnit
	 */
	@Accessor(qualifier = "defaultTimeUnit", type = Accessor.Type.GETTER)
	public IntervalResolution getDefaultTimeUnit()
	{
		return getPersistenceContext().getPropertyValue(DEFAULTTIMEUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConfig.operandMapping</code> attribute defined at extension <code>btg</code>. 
	 * @return the operandMapping
	 */
	@Accessor(qualifier = "operandMapping", type = Accessor.Type.GETTER)
	public Map<BTGRuleType,Collection<ComposedTypeModel>> getOperandMapping()
	{
		return getPersistenceContext().getPropertyValue(OPERANDMAPPING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConfig.usedRuleTypes</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the usedRuleTypes
	 */
	@Accessor(qualifier = "usedRuleTypes", type = Accessor.Type.GETTER)
	public Collection<BTGRuleType> getUsedRuleTypes()
	{
		return getPersistenceContext().getPropertyValue(USEDRULETYPES);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConfig.defaultCatalogVersion</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the defaultCatalogVersion
	 */
	@Accessor(qualifier = "defaultCatalogVersion", type = Accessor.Type.SETTER)
	public void setDefaultCatalogVersion(final CatalogVersionModel value)
	{
		getPersistenceContext().setPropertyValue(DEFAULTCATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConfig.defaultTimeUnit</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the defaultTimeUnit
	 */
	@Accessor(qualifier = "defaultTimeUnit", type = Accessor.Type.SETTER)
	public void setDefaultTimeUnit(final IntervalResolution value)
	{
		getPersistenceContext().setPropertyValue(DEFAULTTIMEUNIT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConfig.operandMapping</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the operandMapping
	 */
	@Accessor(qualifier = "operandMapping", type = Accessor.Type.SETTER)
	public void setOperandMapping(final Map<BTGRuleType,Collection<ComposedTypeModel>> value)
	{
		getPersistenceContext().setPropertyValue(OPERANDMAPPING, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConfig.usedRuleTypes</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the usedRuleTypes
	 */
	@Accessor(qualifier = "usedRuleTypes", type = Accessor.Type.SETTER)
	public void setUsedRuleTypes(final Collection<BTGRuleType> value)
	{
		getPersistenceContext().setPropertyValue(USEDRULETYPES, value);
	}
	
}
