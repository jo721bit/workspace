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
import de.hybris.platform.btg.model.BTGAbstractScriptOperandModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGStringScriptOperand first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGStringScriptOperandModel extends BTGAbstractScriptOperandModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGStringScriptOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGStringScriptOperand.script</code> attribute defined at extension <code>btg</code>. */
	public static final String SCRIPT = "script";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGStringScriptOperand.scriptLanguage</code> attribute defined at extension <code>btg</code>. */
	public static final String SCRIPTLANGUAGE = "scriptLanguage";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGStringScriptOperand.collection</code> attribute defined at extension <code>btg</code>. */
	public static final String COLLECTION = "collection";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGStringScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. */
	public static final String RETURNTYPE = "returnType";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGStringScriptOperandModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGStringScriptOperandModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _collection initial attribute declared by type <code>BTGStringScriptOperand</code> at extension <code>btg</code>
	 * @param _returnType initial attribute declared by type <code>BTGStringScriptOperand</code> at extension <code>btg</code>
	 * @param _script initial attribute declared by type <code>BTGStringScriptOperand</code> at extension <code>btg</code>
	 * @param _scriptLanguage initial attribute declared by type <code>BTGStringScriptOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGStringScriptOperandModel(final CatalogVersionModel _catalogVersion, final boolean _collection, final Class _returnType, final String _script, final String _scriptLanguage, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCollection(_collection);
		setReturnType(_returnType);
		setScript(_script);
		setScriptLanguage(_scriptLanguage);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _collection initial attribute declared by type <code>BTGStringScriptOperand</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _returnType initial attribute declared by type <code>BTGStringScriptOperand</code> at extension <code>btg</code>
	 * @param _script initial attribute declared by type <code>BTGStringScriptOperand</code> at extension <code>btg</code>
	 * @param _scriptLanguage initial attribute declared by type <code>BTGStringScriptOperand</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGStringScriptOperandModel(final CatalogVersionModel _catalogVersion, final boolean _collection, final ItemModel _owner, final Class _returnType, final String _script, final String _scriptLanguage, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setCollection(_collection);
		setOwner(_owner);
		setReturnType(_returnType);
		setScript(_script);
		setScriptLanguage(_scriptLanguage);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGStringScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. 
	 * @return the returnType
	 */
	@Accessor(qualifier = "returnType", type = Accessor.Type.GETTER)
	public Class getReturnType()
	{
		return getPersistenceContext().getPropertyValue(RETURNTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGStringScriptOperand.script</code> attribute defined at extension <code>btg</code>. 
	 * @return the script
	 */
	@Accessor(qualifier = "script", type = Accessor.Type.GETTER)
	public String getScript()
	{
		return getPersistenceContext().getPropertyValue(SCRIPT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGStringScriptOperand.scriptLanguage</code> attribute defined at extension <code>btg</code>. 
	 * @return the scriptLanguage
	 */
	@Accessor(qualifier = "scriptLanguage", type = Accessor.Type.GETTER)
	public String getScriptLanguage()
	{
		return getPersistenceContext().getPropertyValue(SCRIPTLANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGStringScriptOperand.collection</code> attribute defined at extension <code>btg</code>. 
	 * @return the collection
	 */
	@Accessor(qualifier = "collection", type = Accessor.Type.GETTER)
	public boolean isCollection()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(COLLECTION));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGStringScriptOperand.collection</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the collection
	 */
	@Accessor(qualifier = "collection", type = Accessor.Type.SETTER)
	public void setCollection(final boolean value)
	{
		getPersistenceContext().setPropertyValue(COLLECTION, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGStringScriptOperand.returnType</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the returnType
	 */
	@Accessor(qualifier = "returnType", type = Accessor.Type.SETTER)
	public void setReturnType(final Class value)
	{
		getPersistenceContext().setPropertyValue(RETURNTYPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGStringScriptOperand.script</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the script
	 */
	@Accessor(qualifier = "script", type = Accessor.Type.SETTER)
	public void setScript(final String value)
	{
		getPersistenceContext().setPropertyValue(SCRIPT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGStringScriptOperand.scriptLanguage</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the scriptLanguage
	 */
	@Accessor(qualifier = "scriptLanguage", type = Accessor.Type.SETTER)
	public void setScriptLanguage(final String value)
	{
		getPersistenceContext().setPropertyValue(SCRIPTLANGUAGE, value);
	}
	
}
