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
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type BTGResultCleaningCronJob first defined at extension btg.
 */
@SuppressWarnings("all")
public class BTGResultCleaningCronJobModel extends CronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "BTGResultCleaningCronJob";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGResultCleaningCronJob.resultMaxAge</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTMAXAGE = "resultMaxAge";
	
	/** <i>Generated constant</i> - Attribute key of <code>BTGResultCleaningCronJob.resultScope</code> attribute defined at extension <code>btg</code>. */
	public static final String RESULTSCOPE = "resultScope";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public BTGResultCleaningCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public BTGResultCleaningCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 */
	@Deprecated
	public BTGResultCleaningCronJobModel(final JobModel _job)
	{
		super();
		setJob(_job);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _job initial attribute declared by type <code>CronJob</code> at extension <code>processing</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated
	public BTGResultCleaningCronJobModel(final JobModel _job, final ItemModel _owner)
	{
		super();
		setJob(_job);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGResultCleaningCronJob.resultMaxAge</code> attribute defined at extension <code>btg</code>. 
	 * @return the resultMaxAge - After specified number of seconds btg results will be cleaned up. Default is 2 days.
	 */
	@Accessor(qualifier = "resultMaxAge", type = Accessor.Type.GETTER)
	public int getResultMaxAge()
	{
		return toPrimitive((Integer)getPersistenceContext().getPropertyValue(RESULTMAXAGE));
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BTGResultCleaningCronJob.resultScope</code> attribute defined at extension <code>btg</code>. 
	 * @return the resultScope
	 */
	@Accessor(qualifier = "resultScope", type = Accessor.Type.GETTER)
	public BTGResultScope getResultScope()
	{
		return getPersistenceContext().getPropertyValue(RESULTSCOPE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGResultCleaningCronJob.resultMaxAge</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the resultMaxAge - After specified number of seconds btg results will be cleaned up. Default is 2 days.
	 */
	@Accessor(qualifier = "resultMaxAge", type = Accessor.Type.SETTER)
	public void setResultMaxAge(final int value)
	{
		getPersistenceContext().setPropertyValue(RESULTMAXAGE, toObject(value));
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>BTGResultCleaningCronJob.resultScope</code> attribute defined at extension <code>btg</code>. 
	 *  
	 * @param value the resultScope
	 */
	@Accessor(qualifier = "resultScope", type = Accessor.Type.SETTER)
	public void setResultScope(final BTGResultScope value)
	{
		getPersistenceContext().setPropertyValue(RESULTSCOPE, value);
	}
	
}
