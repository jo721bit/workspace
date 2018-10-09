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
import de.hybris.platform.btg.enums.BTGEvaluationMethod;
import de.hybris.platform.btg.enums.BTGResultScope;
import de.hybris.platform.btg.model.BTGItemModel;
import de.hybris.platform.btg.model.BTGRuleModel;
import de.hybris.platform.btg.model.BTGSegmentResultModel;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.servicelayer.model.action.AbstractActionModel;
import java.util.Collection;
import java.util.Date;

/**
 * Generated model class for type BTGSegment first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGSegmentModel extends BTGItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGSegment";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.name</code> attribute defined at extension <code>btg</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.active</code> attribute defined at extension <code>btg</code>. */
	public static final String ACTIVE = "active";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.scope</code> attribute defined at extension <code>btg</code>. */
	public static final String SCOPE = "scope";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.activeFrom</code> attribute defined at extension <code>btg</code>. */
	public static final String ACTIVEFROM = "activeFrom";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.activeTo</code> attribute defined at extension <code>btg</code>. */
	public static final String ACTIVETO = "activeTo";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.defaultResultScope</code> attribute defined at extension <code>btg</code>. */
	public static final String DEFAULTRESULTSCOPE = "defaultResultScope";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.defaultEvaluationMethod</code> attribute defined at extension <code>btg</code>. */
	public static final String DEFAULTEVALUATIONMETHOD = "defaultEvaluationMethod";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.sites</code> attribute defined at extension <code>btg</code>. */
	public static final String SITES = "sites";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.rules</code> attribute defined at extension <code>btg</code>. */
	public static final String RULES = "rules";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.outputActions</code> attribute defined at extension <code>btg</code>. */
	public static final String OUTPUTACTIONS = "outputActions";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGSegment.results</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTS = "results";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGSegmentModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGSegmentModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _name initial attribute declared by type <code>BTGSegment</code> at extension <code>btg</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGSegmentModel(final CatalogVersionModel _catalogVersion, final String _name, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setName(_name);
		setUid(_uid);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _catalogVersion initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 * @param _name initial attribute declared by type <code>BTGSegment</code> at extension <code>btg</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _uid initial attribute declared by type <code>BTGItem</code> at extension <code>btg</code>
	 */
	@Deprecated
	public BTGSegmentModel(final CatalogVersionModel _catalogVersion, final String _name, final ItemModel _owner, final String _uid)
	{
		super();
		setCatalogVersion(_catalogVersion);
		setName(_name);
		setOwner(_owner);
		setUid(_uid);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.active</code> attribute defined at extension <code>btg</code>. 
	 * @return the active
	 */
	@Accessor(qualifier = "active", type = Accessor.Type.GETTER)
	public Boolean getActive()
	{
		return getPersistenceContext().getPropertyValue(ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.activeFrom</code> attribute defined at extension <code>btg</code>. 
	 * @return the activeFrom
	 */
	@Accessor(qualifier = "activeFrom", type = Accessor.Type.GETTER)
	public Date getActiveFrom()
	{
		return getPersistenceContext().getPropertyValue(ACTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.activeTo</code> attribute defined at extension <code>btg</code>. 
	 * @return the activeTo
	 */
	@Accessor(qualifier = "activeTo", type = Accessor.Type.GETTER)
	public Date getActiveTo()
	{
		return getPersistenceContext().getPropertyValue(ACTIVETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.defaultEvaluationMethod</code> attribute defined at extension <code>btg</code>. 
	 * @return the defaultEvaluationMethod
	 */
	@Accessor(qualifier = "defaultEvaluationMethod", type = Accessor.Type.GETTER)
	public BTGEvaluationMethod getDefaultEvaluationMethod()
	{
		return getPersistenceContext().getPropertyValue(DEFAULTEVALUATIONMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.defaultResultScope</code> attribute defined at extension <code>btg</code>. 
	 * @return the defaultResultScope
	 */
	@Accessor(qualifier = "defaultResultScope", type = Accessor.Type.GETTER)
	public BTGResultScope getDefaultResultScope()
	{
		return getPersistenceContext().getPropertyValue(DEFAULTRESULTSCOPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.name</code> attribute defined at extension <code>btg</code>. 
	 * @return the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getPersistenceContext().getPropertyValue(NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.outputActions</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the outputActions
	 */
	@Accessor(qualifier = "outputActions", type = Accessor.Type.GETTER)
	public Collection<AbstractActionModel> getOutputActions()
	{
		return getPersistenceContext().getPropertyValue(OUTPUTACTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.results</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the results
	 */
	@Accessor(qualifier = "results", type = Accessor.Type.GETTER)
	public Collection<BTGSegmentResultModel> getResults()
	{
		return getPersistenceContext().getPropertyValue(RESULTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.rules</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the rules
	 */
	@Accessor(qualifier = "rules", type = Accessor.Type.GETTER)
	public Collection<BTGRuleModel> getRules()
	{
		return getPersistenceContext().getPropertyValue(RULES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.scope</code> attribute defined at extension <code>btg</code>. 
	 * @return the scope
	 */
	@Accessor(qualifier = "scope", type = Accessor.Type.GETTER)
	public BTGConditionEvaluationScope getScope()
	{
		return getPersistenceContext().getPropertyValue(SCOPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGSegment.sites</code> attribute defined at extension <code>btg</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sites
	 */
	@Accessor(qualifier = "sites", type = Accessor.Type.GETTER)
	public Collection<CMSSiteModel> getSites()
	{
		return getPersistenceContext().getPropertyValue(SITES);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.active</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the active
	 */
	@Accessor(qualifier = "active", type = Accessor.Type.SETTER)
	public void setActive(final Boolean value)
	{
		getPersistenceContext().setPropertyValue(ACTIVE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.activeFrom</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the activeFrom
	 */
	@Accessor(qualifier = "activeFrom", type = Accessor.Type.SETTER)
	public void setActiveFrom(final Date value)
	{
		getPersistenceContext().setPropertyValue(ACTIVEFROM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.activeTo</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the activeTo
	 */
	@Accessor(qualifier = "activeTo", type = Accessor.Type.SETTER)
	public void setActiveTo(final Date value)
	{
		getPersistenceContext().setPropertyValue(ACTIVETO, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.defaultEvaluationMethod</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the defaultEvaluationMethod
	 */
	@Accessor(qualifier = "defaultEvaluationMethod", type = Accessor.Type.SETTER)
	public void setDefaultEvaluationMethod(final BTGEvaluationMethod value)
	{
		getPersistenceContext().setPropertyValue(DEFAULTEVALUATIONMETHOD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.defaultResultScope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the defaultResultScope
	 */
	@Accessor(qualifier = "defaultResultScope", type = Accessor.Type.SETTER)
	public void setDefaultResultScope(final BTGResultScope value)
	{
		getPersistenceContext().setPropertyValue(DEFAULTRESULTSCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.name</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		getPersistenceContext().setPropertyValue(NAME, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.outputActions</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the outputActions
	 */
	@Accessor(qualifier = "outputActions", type = Accessor.Type.SETTER)
	public void setOutputActions(final Collection<AbstractActionModel> value)
	{
		getPersistenceContext().setPropertyValue(OUTPUTACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.results</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the results
	 */
	@Accessor(qualifier = "results", type = Accessor.Type.SETTER)
	public void setResults(final Collection<BTGSegmentResultModel> value)
	{
		getPersistenceContext().setPropertyValue(RESULTS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.rules</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the rules
	 */
	@Accessor(qualifier = "rules", type = Accessor.Type.SETTER)
	public void setRules(final Collection<BTGRuleModel> value)
	{
		getPersistenceContext().setPropertyValue(RULES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.scope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the scope
	 */
	@Accessor(qualifier = "scope", type = Accessor.Type.SETTER)
	public void setScope(final BTGConditionEvaluationScope value)
	{
		getPersistenceContext().setPropertyValue(SCOPE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGSegment.sites</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the sites
	 */
	@Accessor(qualifier = "sites", type = Accessor.Type.SETTER)
	public void setSites(final Collection<CMSSiteModel> value)
	{
		getPersistenceContext().setPropertyValue(SITES, value);
	}
	
}
