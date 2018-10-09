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
import de.hybris.platform.btg.enums.BTGConditionEvaluationScope;
import de.hybris.platform.btg.model.BTGConditionResultModel;
import de.hybris.platform.btg.model.BTGItemModel;
import de.hybris.platform.btg.model.BTGRuleModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;

/**
 * Generated model class for type BTGCondition first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGConditionModel extends BTGItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGCondition";
	
	/**<i>Generated relation code constant for relation <code>BTGRuleToBTGConditionsRelation</code> defining source attribute <code>rule</code> in extension <code>btg</code>.</i>*/
	public final static String _BTGRULETOBTGCONDITIONSRELATION = "BTGRuleToBTGConditionsRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.beanId</code> attribute defined at extension <code>btg</code>. */
	public static final String BEANID = "beanId";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.evaluationScope</code> attribute defined at extension <code>btg</code>. */
	public static final String EVALUATIONSCOPE = "evaluationScope";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.rulePOS</code> attribute defined at extension <code>btg</code>. */
	public static final String RULEPOS = "rulePOS";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.rule</code> attribute defined at extension <code>btg</code>. */
	public static final String RULE = "rule";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGCondition.results</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTS = "results";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGConditionModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGConditionModel(final ItemModelContext ctx)
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
	public BTGConditionModel(final CatalogVersionModel _catalogVersion, final String _uid)
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
	public BTGConditionModel(final CatalogVersionModel _catalogVersion, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCondition.beanId</code> attribute defined at extension <code>btg</code>. 
	 * @return the beanId
	 */
	@Accessor(qualifier = "beanId", type = Accessor.Type.GETTER)
	public String getBeanId()
	{
		return getPersistenceContext().getPropertyValue(BEANID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCondition.evaluationScope</code> attribute defined at extension <code>btg</code>. 
	 * @return the evaluationScope
	 */
	@Accessor(qualifier = "evaluationScope", type = Accessor.Type.GETTER)
	public BTGConditionEvaluationScope getEvaluationScope()
	{
		return getPersistenceContext().getPropertyValue(EVALUATIONSCOPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCondition.results</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the results
	 */
	@Accessor(qualifier = "results", type = Accessor.Type.GETTER)
	public Collection<BTGConditionResultModel> getResults()
	{
		return getPersistenceContext().getPropertyValue(RESULTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGCondition.rule</code> attribute defined at extension <code>btg</code>. 
	 * @return the rule
	 */
	@Accessor(qualifier = "rule", type = Accessor.Type.GETTER)
	public BTGRuleModel getRule()
	{
		return getPersistenceContext().getPropertyValue(RULE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCondition.beanId</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the beanId
	 */
	@Accessor(qualifier = "beanId", type = Accessor.Type.SETTER)
	public void setBeanId(final String value)
	{
		getPersistenceContext().setPropertyValue(BEANID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCondition.evaluationScope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the evaluationScope
	 */
	@Accessor(qualifier = "evaluationScope", type = Accessor.Type.SETTER)
	public void setEvaluationScope(final BTGConditionEvaluationScope value)
	{
		getPersistenceContext().setPropertyValue(EVALUATIONSCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCondition.results</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the results
	 */
	@Accessor(qualifier = "results", type = Accessor.Type.SETTER)
	public void setResults(final Collection<BTGConditionResultModel> value)
	{
		getPersistenceContext().setPropertyValue(RESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGCondition.rule</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the rule
	 */
	@Accessor(qualifier = "rule", type = Accessor.Type.SETTER)
	public void setRule(final BTGRuleModel value)
	{
		getPersistenceContext().setPropertyValue(RULE, value);
	}
	
}
