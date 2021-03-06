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
package de.hybris.platform.catalog.model.classification;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.catalog.model.classification.ClassificationImportJobModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.cronjob.model.JobModel;
import de.hybris.platform.impex.model.cronjob.ImpExImportCronJobModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type ClassificationImportCronJob first defined at extension classificationsystems.
 */
@SuppressWarnings("all")
public class ClassificationImportCronJobModel extends ImpExImportCronJobModel
{
	/**<i>Generated model type code constant.</i>*/
	public final static String _TYPECODE = "ClassificationImportCronJob";
	
	/**<i>Generated relation code constant for relation <code>JobCronJobRelation</code> defining source attribute <code>job</code> in extension <code>processing</code>.</i>*/
	public final static String _JOBCRONJOBRELATION = "JobCronJobRelation";
	
	/** <i>Generated constant</i> - Attribute key of <code>ClassificationImportCronJob.classificationSystem</code> attribute defined at extension <code>classificationsystems</code>. */
	public static final String CLASSIFICATIONSYSTEM = "classificationSystem";
	
	/** <i>Generated constant</i> - Attribute key of <code>ClassificationImportCronJob.version</code> attribute defined at extension <code>classificationsystems</code>. */
	public static final String VERSION = "version";
	
	/** <i>Generated constant</i> - Attribute key of <code>ClassificationImportCronJob.language</code> attribute defined at extension <code>classificationsystems</code>. */
	public static final String LANGUAGE = "language";
	
	/** <i>Generated constant</i> - Attribute key of <code>ClassificationImportCronJob.impExScriptText</code> attribute defined at extension <code>classificationsystems</code>. */
	public static final String IMPEXSCRIPTTEXT = "impExScriptText";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ClassificationImportCronJobModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ClassificationImportCronJobModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _classificationSystem initial attribute declared by type <code>ClassificationImportCronJob</code> at extension <code>classificationsystems</code>
	 * @param _job initial attribute declared by type <code>ClassificationImportCronJob</code> at extension <code>classificationsystems</code>
	 * @param _version initial attribute declared by type <code>ClassificationImportCronJob</code> at extension <code>classificationsystems</code>
	 */
	@Deprecated
	public ClassificationImportCronJobModel(final String _classificationSystem, final ClassificationImportJobModel _job, final String _version)
	{
		super();
		setClassificationSystem(_classificationSystem);
		setJob(_job);
		setVersion(_version);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated Since 4.1.1 Please use the default constructor without parameters
	 * @param _classificationSystem initial attribute declared by type <code>ClassificationImportCronJob</code> at extension <code>classificationsystems</code>
	 * @param _job initial attribute declared by type <code>ClassificationImportCronJob</code> at extension <code>classificationsystems</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _version initial attribute declared by type <code>ClassificationImportCronJob</code> at extension <code>classificationsystems</code>
	 */
	@Deprecated
	public ClassificationImportCronJobModel(final String _classificationSystem, final ClassificationImportJobModel _job, final ItemModel _owner, final String _version)
	{
		super();
		setClassificationSystem(_classificationSystem);
		setJob(_job);
		setOwner(_owner);
		setVersion(_version);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationImportCronJob.classificationSystem</code> attribute defined at extension <code>classificationsystems</code>. 
	 * @return the classificationSystem
	 */
	@Accessor(qualifier = "classificationSystem", type = Accessor.Type.GETTER)
	public String getClassificationSystem()
	{
		return getPersistenceContext().getPropertyValue(CLASSIFICATIONSYSTEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationImportCronJob.impExScriptText</code> attribute defined at extension <code>classificationsystems</code>. 
	 * @return the impExScriptText
	 */
	@Accessor(qualifier = "impExScriptText", type = Accessor.Type.GETTER)
	public String getImpExScriptText()
	{
		return getPersistenceContext().getPropertyValue(IMPEXSCRIPTTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>classificationsystems</code>. 
	 * @return the job
	 */
	@Override
	@Accessor(qualifier = "job", type = Accessor.Type.GETTER)
	public ClassificationImportJobModel getJob()
	{
		return (ClassificationImportJobModel) super.getJob();
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationImportCronJob.language</code> attribute defined at extension <code>classificationsystems</code>. 
	 * @return the language
	 */
	@Accessor(qualifier = "language", type = Accessor.Type.GETTER)
	public LanguageModel getLanguage()
	{
		return getPersistenceContext().getPropertyValue(LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassificationImportCronJob.version</code> attribute defined at extension <code>classificationsystems</code>. 
	 * @return the version
	 */
	@Accessor(qualifier = "version", type = Accessor.Type.GETTER)
	public String getVersion()
	{
		return getPersistenceContext().getPropertyValue(VERSION);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ClassificationImportCronJob.classificationSystem</code> attribute defined at extension <code>classificationsystems</code>. 
	 *  
	 * @param value the classificationSystem
	 */
	@Accessor(qualifier = "classificationSystem", type = Accessor.Type.SETTER)
	public void setClassificationSystem(final String value)
	{
		getPersistenceContext().setPropertyValue(CLASSIFICATIONSYSTEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ClassificationImportCronJob.impExScriptText</code> attribute defined at extension <code>classificationsystems</code>. 
	 *  
	 * @param value the impExScriptText
	 */
	@Accessor(qualifier = "impExScriptText", type = Accessor.Type.SETTER)
	public void setImpExScriptText(final String value)
	{
		getPersistenceContext().setPropertyValue(IMPEXSCRIPTTEXT, value);
	}
	
	/**
	 * <i>Generated method</i> - Initial setter of <code>CronJob.job</code> attribute defined at extension <code>processing</code> and redeclared at extension <code>classificationsystems</code>. Can only be used at creation of model - before first save. Will only accept values of type {@link de.hybris.platform.catalog.model.classification.ClassificationImportJobModel}.  
	 *  
	 * @param value the job
	 */
	@Override
	@Accessor(qualifier = "job", type = Accessor.Type.SETTER)
	public void setJob(final JobModel value)
	{
		if( value == null || value instanceof ClassificationImportJobModel)
		{
			super.setJob(value);
		}
		else
		{
			throw new IllegalArgumentException("Given value is not instance of de.hybris.platform.catalog.model.classification.ClassificationImportJobModel");
		}
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ClassificationImportCronJob.language</code> attribute defined at extension <code>classificationsystems</code>. 
	 *  
	 * @param value the language
	 */
	@Accessor(qualifier = "language", type = Accessor.Type.SETTER)
	public void setLanguage(final LanguageModel value)
	{
		getPersistenceContext().setPropertyValue(LANGUAGE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ClassificationImportCronJob.version</code> attribute defined at extension <code>classificationsystems</code>. 
	 *  
	 * @param value the version
	 */
	@Accessor(qualifier = "version", type = Accessor.Type.SETTER)
	public void setVersion(final String value)
	{
		getPersistenceContext().setPropertyValue(VERSION, value);
	}
	
}
