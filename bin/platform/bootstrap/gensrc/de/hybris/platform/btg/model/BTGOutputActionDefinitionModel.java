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
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.enums.ActionType;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.servicelayer.model.action.AbstractActionModel;

/**
 * Generated model class for type BTGOutputActionDefinition first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGOutputActionDefinitionModel extends AbstractActionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGOutputActionDefinition";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGOutputActionDefinition.uid</code> attribute defined at extension <code>btg</code>. */
	public static final String UID = "uid";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGOutputActionDefinition.catalogVersion</code> attribute defined at extension <code>btg</code>. */
	public static final String CATALOGVERSION = "catalogVersion";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGOutputActionDefinitionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGOutputActionDefinitionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _code initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _target initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _type initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGOutputActionDefinitionModel(final CatalogVersionModel _catalogVersion, final String _code, final String _target, final ActionType _type, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setTarget(_target);
		setType(_type);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _code initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _target initial attribute declared by type <code>AbstractAction</code> at extension <code>processing</code>
	 * @param _type initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGOutputActionDefinition</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGOutputActionDefinitionModel(final CatalogVersionModel _catalogVersion, final String _code, final ItemModel _owner, final String _target, final ActionType _type, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCode(_code);
		setOwner(_owner);
		setTarget(_target);
		setType(_type);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOutputActionDefinition.catalogVersion</code> attribute defined at extension <code>btg</code>. 
	 * @return the catalogVersion
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.GETTER)
	public CatalogVersionModel getCatalogVersion()
	{
		return getPersistenceContext().getPropertyValue(CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGOutputActionDefinition.uid</code> attribute defined at extension <code>btg</code>. 
	 * @return the uid
	 */
	@Accessor(qualifier = "uid", type = Accessor.Type.GETTER)
	public String getUid()
	{
		return getPersistenceContext().getPropertyValue(UID);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGOutputActionDefinition.catalogVersion</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the catalogVersion
	 */
	@Accessor(qualifier = "catalogVersion", type = Accessor.Type.SETTER)
	public void setCatalogVersion(final CatalogVersionModel value)
	{
		getPersistenceContext().setPropertyValue(CATALOGVERSION, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>AbstractAction.type</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>btg</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.servicelayer.enums.ActionType}.  
	 *  
	 * @param value the type
	 */
	@Override
	@Accessor(qualifier = "type", type = Accessor.Type.SETTER)
	public void setType(final ActionType value)
	{
		if( value == null || value instanceof ActionType)
		{
			super.setType(value);
		}
		else
		{
			throw new IllegalArgumentException("Given value is not instance of de.hybris.platform.servicelayer.enums.ActionType");
		}
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGOutputActionDefinition.uid</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the uid
	 */
	@Accessor(qualifier = "uid", type = Accessor.Type.SETTER)
	public void setUid(final String value)
	{
		getPersistenceContext().setPropertyValue(UID, value);
	}
	
}
