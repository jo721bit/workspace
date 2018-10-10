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
import de.hybris.platform.btg.model.BTGConditionModel;
import de.hybris.platform.btg.model.BTGOperandModel;
import de.hybris.platform.btg.model.BTGOperatorModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGExpression first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGExpressionModel extends BTGConditionModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGExpression";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGExpression.leftOperand</code> attribute defined at extension <code>btg</code>. */
	public static final String LEFTOPERAND = "leftOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGExpression.rightOperand</code> attribute defined at extension <code>btg</code>. */
	public static final String RIGHTOPERAND = "rightOperand";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGExpression.operator</code> attribute defined at extension <code>btg</code>. */
	public static final String OPERATOR = "operator";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGExpressionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGExpressionModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGExpressionModel(final CatalogVersionModel _catalogVersion, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGExpressionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGExpression.leftOperand</code> attribute defined at extension <code>btg</code>. 
	 * @return the leftOperand
	 */
	@Accessor(qualifier = "leftOperand", type = Accessor.Type.GETTER)
	public BTGOperandModel getLeftOperand()
	{
		return getPersistenceContext().getPropertyValue(LEFTOPERAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGExpression.operator</code> attribute defined at extension <code>btg</code>. 
	 * @return the operator
	 */
	@Accessor(qualifier = "operator", type = Accessor.Type.GETTER)
	public BTGOperatorModel getOperator()
	{
		return getPersistenceContext().getPropertyValue(OPERATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGExpression.rightOperand</code> attribute defined at extension <code>btg</code>. 
	 * @return the rightOperand
	 */
	@Accessor(qualifier = "rightOperand", type = Accessor.Type.GETTER)
	public BTGOperandModel getRightOperand()
	{
		return getPersistenceContext().getPropertyValue(RIGHTOPERAND);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGExpression.leftOperand</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the leftOperand
	 */
	@Accessor(qualifier = "leftOperand", type = Accessor.Type.SETTER)
	public void setLeftOperand(final BTGOperandModel value)
	{
		getPersistenceContext().setPropertyValue(LEFTOPERAND, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGExpression.operator</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the operator
	 */
	@Accessor(qualifier = "operator", type = Accessor.Type.SETTER)
	public void setOperator(final BTGOperatorModel value)
	{
		getPersistenceContext().setPropertyValue(OPERATOR, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGExpression.rightOperand</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the rightOperand
	 */
	@Accessor(qualifier = "rightOperand", type = Accessor.Type.SETTER)
	public void setRightOperand(final BTGOperandModel value)
	{
		getPersistenceContext().setPropertyValue(RIGHTOPERAND, value);
	}
	
}
