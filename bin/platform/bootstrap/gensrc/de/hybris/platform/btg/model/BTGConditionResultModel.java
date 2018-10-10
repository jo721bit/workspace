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
import de.hybris.platform.btg.enums.BTGResultScope;
import de.hybris.platform.btg.model.BTGAbstractResultModel;
import de.hybris.platform.btg.model.BTGConditionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGConditionResult first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGConditionResultModel extends BTGAbstractResultModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGConditionResult";
	
	/**<i>Generated relation code constant for relation <code>BTGConditionBTGConditionResultRelation</code> defining source attribute <code>condition</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGCONDITIONBTGCONDITIONRESULTRELATION = "BTGConditionBTGConditionResultRelation";
	
	/**<i>Generated relation code constant for relation <code>UserBTGConditionResultRelation</code> defining source attribute <code>user</code> in extension <code>btg</code>.</i>*/
	public final static String _USERBTGCONDITIONRESULTRELATION = "UserBTGConditionResultRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConditionResult.condition</code> attribute defined at extension <code>btg</code>. */
	public static final String CONDITION = "condition";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGConditionResult.user</code> attribute defined at extension <code>btg</code>. */
	public static final String USER = "user";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGConditionResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGConditionResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _condition initial attribute declared by type <code>BTGConditionResult</code> at extension <code>btg</code>
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConditionResultModel(final BTGConditionModel _condition, final BTGResultScope _resultScope)
	{
		super();
		setCondition(_condition);
		setResultScope(_resultScope);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _condition initial attribute declared by type <code>BTGConditionResult</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _resultScope initial attribute declared by type <code>BTGAbstractResult</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGConditionResultModel(final BTGConditionModel _condition, final ItemModel _owner, final BTGResultScope _resultScope)
	{
		super();
		setCondition(_condition);
		setOwner(_owner);
		setResultScope(_resultScope);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConditionResult.condition</code> attribute defined at extension <code>btg</code>. 
	 * @return the condition
	 */
	@Accessor(qualifier = "condition", type = Accessor.Type.GETTER)
	public BTGConditionModel getCondition()
	{
		return getPersistenceContext().getPropertyValue(CONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGConditionResult.user</code> attribute defined at extension <code>btg</code>. 
	 * @return the user
	 */
	@Accessor(qualifier = "user", type = Accessor.Type.GETTER)
	public UserModel getUser()
	{
		return getPersistenceContext().getPropertyValue(USER);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConditionResult.condition</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the condition
	 */
	@Accessor(qualifier = "condition", type = Accessor.Type.SETTER)
	public void setCondition(final BTGConditionModel value)
	{
		getPersistenceContext().setPropertyValue(CONDITION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGConditionResult.user</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the user
	 */
	@Accessor(qualifier = "user", type = Accessor.Type.SETTER)
	public void setUser(final UserModel value)
	{
		getPersistenceContext().setPropertyValue(USER, value);
	}
	
}
