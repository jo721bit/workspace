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
import de.hybris.platform.btg.model.BTGAbstractScriptOperandModel;
import de.hybris.platform.btg.model.ScriptMediaModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGMediaScriptOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGMediaScriptOperandModel extends BTGAbstractScriptOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGMediaScriptOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGMediaScriptOperand.scriptMedia</code> attribute defined at extension <code>btg</code>. */
	public static final String SCRIPTMEDIA = "scriptMedia";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGMediaScriptOperand.collection</code> attribute defined at extension <code>btg</code>. */
	public static final String COLLECTION = "collection";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGMediaScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. */
	public static final String RETURNTYPE = "returnType";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGMediaScriptOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGMediaScriptOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _collection initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _returnType initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _scriptMedia initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGMediaScriptOperandModel(final CatalogVersionModel _catalogVersion, final boolean _collection, final Class _returnType, final ScriptMediaModel _scriptMedia, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCollection(_collection);
		setReturnType(_returnType);
		setScriptMedia(_scriptMedia);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _collection initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _returnType initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _scriptMedia initial attribute declared by type <code>BTGMediaScriptOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGMediaScriptOperandModel(final CatalogVersionModel _catalogVersion, final boolean _collection, final ItemModel _owner, final Class _returnType, final ScriptMediaModel _scriptMedia, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCollection(_collection);
		setOwner(_owner);
		setReturnType(_returnType);
		setScriptMedia(_scriptMedia);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGMediaScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. 
	 * @return the returnType
	 */
	@Accessor(qualifier = "returnType", type = Accessor.Type.GETTER)
	public Class getReturnType()
	{
		return getPersistenceContext().getPropertyValue(RETURNTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGMediaScriptOperand.scriptMedia</code> attribute defined at extension <code>btg</code>. 
	 * @return the scriptMedia
	 */
	@Accessor(qualifier = "scriptMedia", type = Accessor.Type.GETTER)
	public ScriptMediaModel getScriptMedia()
	{
		return getPersistenceContext().getPropertyValue(SCRIPTMEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGMediaScriptOperand.collection</code> attribute defined at extension <code>btg</code>. 
	 * @return the collection
	 */
	@Accessor(qualifier = "collection", type = Accessor.Type.GETTER)
	public boolean isCollection()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(COLLECTION));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGMediaScriptOperand.collection</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the collection
	 */
	@Accessor(qualifier = "collection", type = Accessor.Type.SETTER)
	public void setCollection(final boolean value)
	{
		getPersistenceContext().setPropertyValue(COLLECTION, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGMediaScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the returnType
	 */
	@Accessor(qualifier = "returnType", type = Accessor.Type.SETTER)
	public void setReturnType(final Class value)
	{
		getPersistenceContext().setPropertyValue(RETURNTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGMediaScriptOperand.scriptMedia</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the scriptMedia
	 */
	@Accessor(qualifier = "scriptMedia", type = Accessor.Type.SETTER)
	public void setScriptMedia(final ScriptMediaModel value)
	{
		getPersistenceContext().setPropertyValue(SCRIPTMEDIA, value);
	}
	
}
