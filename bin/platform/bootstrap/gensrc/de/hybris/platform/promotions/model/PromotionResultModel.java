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
package de.hybris.platform.promotions.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.promotions.model.AbstractPromotionActionModel;
import de.hybris.platform.promotions.model.AbstractPromotionModel;
import de.hybris.platform.promotions.model.PromotionOrderEntryConsumedModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.util.Collection;
import java.util.Set;

/**
 * Generated model class for type PromotionResult first defined at extension promotions.
 */
@SuppressWarnings("all")
public class PromotionResultModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "PromotionResult";
	
	/**<i>Generated relation code constant for relation <code>Order2PromotionResultsRelation</code> defining source attribute <code>order</code> in extension <code>promotions</code>.</i>*/
	public final static String _ORDER2PROMOTIONRESULTSRELATION = "Order2PromotionResultsRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionResult.actions</code> attribute defined at extension <code>promotions</code>. */
	public static final String ACTIONS = "actions";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionResult.consumedEntries</code> attribute defined at extension <code>promotions</code>. */
	public static final String CONSUMEDENTRIES = "consumedEntries";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionResult.promotion</code> attribute defined at extension <code>promotions</code>. */
	public static final String PROMOTION = "promotion";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionResult.certainty</code> attribute defined at extension <code>promotions</code>. */
	public static final String CERTAINTY = "certainty";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionResult.custom</code> attribute defined at extension <code>promotions</code>. */
	public static final String CUSTOM = "custom";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionResult.order</code> attribute defined at extension <code>promotions</code>. */
	public static final String ORDER = "order";
	
	/** <i>Generated constant</i> - Attribute key of <code>PromotionResult.allPromotionActions</code> attribute defined at extension <code>promotions</code>. */
	public static final String ALLPROMOTIONACTIONS = "allPromotionActions";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public PromotionResultModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public PromotionResultModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public PromotionResultModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionResult.actions</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the actions - List of actions
	 */
	@Accessor(qualifier = "actions", type = Accessor.Type.GETTER)
	public Collection<AbstractPromotionActionModel> getActions()
	{
		return getPersistenceContext().getPropertyValue(ACTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionResult.allPromotionActions</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the allPromotionActions
	 */
	@Accessor(qualifier = "allPromotionActions", type = Accessor.Type.GETTER)
	public Set<AbstractPromotionActionModel> getAllPromotionActions()
	{
		return getPersistenceContext().getPropertyValue(ALLPROMOTIONACTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionResult.certainty</code> attribute defined at extension <code>promotions</code>. 
	 * @return the certainty - Certainty
	 */
	@Accessor(qualifier = "certainty", type = Accessor.Type.GETTER)
	public Float getCertainty()
	{
		return getPersistenceContext().getPropertyValue(CERTAINTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionResult.consumedEntries</code> attribute defined at extension <code>promotions</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the consumedEntries - List of consumed entries
	 */
	@Accessor(qualifier = "consumedEntries", type = Accessor.Type.GETTER)
	public Collection<PromotionOrderEntryConsumedModel> getConsumedEntries()
	{
		return getPersistenceContext().getPropertyValue(CONSUMEDENTRIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionResult.custom</code> attribute defined at extension <code>promotions</code>. 
	 * @return the custom - Custom data stored on this promotion result by the promotion.
	 */
	@Accessor(qualifier = "custom", type = Accessor.Type.GETTER)
	public String getCustom()
	{
		return getPersistenceContext().getPropertyValue(CUSTOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionResult.order</code> attribute defined at extension <code>promotions</code>. 
	 * @return the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.GETTER)
	public AbstractOrderModel getOrder()
	{
		return getPersistenceContext().getPropertyValue(ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionResult.promotion</code> attribute defined at extension <code>promotions</code>. 
	 * @return the promotion - The promotion
	 */
	@Accessor(qualifier = "promotion", type = Accessor.Type.GETTER)
	public AbstractPromotionModel getPromotion()
	{
		return getPersistenceContext().getPropertyValue(PROMOTION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionResult.actions</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the actions - List of actions
	 */
	@Accessor(qualifier = "actions", type = Accessor.Type.SETTER)
	public void setActions(final Collection<AbstractPromotionActionModel> value)
	{
		getPersistenceContext().setPropertyValue(ACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionResult.allPromotionActions</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the allPromotionActions
	 */
	@Accessor(qualifier = "allPromotionActions", type = Accessor.Type.SETTER)
	public void setAllPromotionActions(final Set<AbstractPromotionActionModel> value)
	{
		getPersistenceContext().setPropertyValue(ALLPROMOTIONACTIONS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionResult.certainty</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the certainty - Certainty
	 */
	@Accessor(qualifier = "certainty", type = Accessor.Type.SETTER)
	public void setCertainty(final Float value)
	{
		getPersistenceContext().setPropertyValue(CERTAINTY, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionResult.consumedEntries</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the consumedEntries - List of consumed entries
	 */
	@Accessor(qualifier = "consumedEntries", type = Accessor.Type.SETTER)
	public void setConsumedEntries(final Collection<PromotionOrderEntryConsumedModel> value)
	{
		getPersistenceContext().setPropertyValue(CONSUMEDENTRIES, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionResult.custom</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the custom - Custom data stored on this promotion result by the promotion.
	 */
	@Accessor(qualifier = "custom", type = Accessor.Type.SETTER)
	public void setCustom(final String value)
	{
		getPersistenceContext().setPropertyValue(CUSTOM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionResult.order</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the order
	 */
	@Accessor(qualifier = "order", type = Accessor.Type.SETTER)
	public void setOrder(final AbstractOrderModel value)
	{
		getPersistenceContext().setPropertyValue(ORDER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>PromotionResult.promotion</code> attribute defined at extension <code>promotions</code>. 
	 *  
	 * @param value the promotion - The promotion
	 */
	@Accessor(qualifier = "promotion", type = Accessor.Type.SETTER)
	public void setPromotion(final AbstractPromotionModel value)
	{
		getPersistenceContext().setPropertyValue(PROMOTION, value);
	}
	
}
