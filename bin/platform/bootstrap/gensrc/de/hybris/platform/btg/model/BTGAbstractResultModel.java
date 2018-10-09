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
import de.hybris.platform.btg.enums.BTGResultScope;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGAbstractResult first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGAbstractResultModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGAbstractResult";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.fulfilled</code> attribute defined at extension <code>btg</code>. */
	public static final String FULFILLED = "fulfilled";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.forced</code> attribute defined at extension <code>btg</code>. */
	public static final String FORCED = "forced";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.invalidated</code> attribute defined at extension <code>btg</code>. */
	public static final String INVALIDATED = "invalidated";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.resultScope</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTSCOPE = "resultScope";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.sessionId</code> attribute defined at extension <code>btg</code>. */
	public static final String SESSIONID = "sessionId";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGAbstractResult.sequence</code> attribute defined at extension <code>btg</code>. */
	public static final String SEQUENCE = "sequence";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGAbstractResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGAbstractResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGAbstractResultModel(final BTGResultScope _resultScope)
	{
		super();
		setResultScope(_resultScope);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGAbstractResultModel(final ItemModel _owner, final BTGResultScope _resultScope)
	{
		super();
		setOwner(_owner);
		setResultScope(_resultScope);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.resultScope</code> attribute defined at extension <code>btg</code>. 
	 * @return the resultScope
	 */
	@Accessor(qualifier = "resultScope", type = Accessor.Type.GETTER)
	public BTGResultScope getResultScope()
	{
		return getPersistenceContext().getPropertyValue(RESULTSCOPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.sequence</code> attribute defined at extension <code>btg</code>. 
	 * @return the sequence
	 */
	@Accessor(qualifier = "sequence", type = Accessor.Type.GETTER)
	public String getSequence()
	{
		return getPersistenceContext().getPropertyValue(SEQUENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.sessionId</code> attribute defined at extension <code>btg</code>. 
	 * @return the sessionId
	 */
	@Accessor(qualifier = "sessionId", type = Accessor.Type.GETTER)
	public String getSessionId()
	{
		return getPersistenceContext().getPropertyValue(SESSIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.forced</code> attribute defined at extension <code>btg</code>. 
	 * @return the forced
	 */
	@Accessor(qualifier = "forced", type = Accessor.Type.GETTER)
	public boolean isForced()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(FORCED));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.fulfilled</code> attribute defined at extension <code>btg</code>. 
	 * @return the fulfilled
	 */
	@Accessor(qualifier = "fulfilled", type = Accessor.Type.GETTER)
	public boolean isFulfilled()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(FULFILLED));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGAbstractResult.invalidated</code> attribute defined at extension <code>btg</code>. 
	 * @return the invalidated
	 */
	@Accessor(qualifier = "invalidated", type = Accessor.Type.GETTER)
	public boolean isInvalidated()
	{
		return toPrimitive((Boolean)getPersistenceContext().getPropertyValue(INVALIDATED));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.forced</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the forced
	 */
	@Accessor(qualifier = "forced", type = Accessor.Type.SETTER)
	public void setForced(final boolean value)
	{
		getPersistenceContext().setPropertyValue(FORCED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.fulfilled</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the fulfilled
	 */
	@Accessor(qualifier = "fulfilled", type = Accessor.Type.SETTER)
	public void setFulfilled(final boolean value)
	{
		getPersistenceContext().setPropertyValue(FULFILLED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.invalidated</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the invalidated
	 */
	@Accessor(qualifier = "invalidated", type = Accessor.Type.SETTER)
	public void setInvalidated(final boolean value)
	{
		getPersistenceContext().setPropertyValue(INVALIDATED, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.resultScope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the resultScope
	 */
	@Accessor(qualifier = "resultScope", type = Accessor.Type.SETTER)
	public void setResultScope(final BTGResultScope value)
	{
		getPersistenceContext().setPropertyValue(RESULTSCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.sequence</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the sequence
	 */
	@Accessor(qualifier = "sequence", type = Accessor.Type.SETTER)
	public void setSequence(final String value)
	{
		getPersistenceContext().setPropertyValue(SEQUENCE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGAbstractResult.sessionId</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the sessionId
	 */
	@Accessor(qualifier = "sessionId", type = Accessor.Type.SETTER)
	public void setSessionId(final String value)
	{
		getPersistenceContext().setPropertyValue(SESSIONID, value);
	}
	
}
