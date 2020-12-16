package com.jwebmp.plugins.angularanimate;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Animate",
		pluginDescription = "These animation hooks in the angular animation for the project.",
		pluginUniqueName = "jwebmp-angular-animate",
		pluginDependancyUniqueIDs = "angular",
		pluginVersion = "1.8.2",
		pluginCategories = "angular,animations, ui,web ui, framework",
		pluginSubtitle = "these animation hooks are set in place to trigger animations during the life cycle of various directives ",
		pluginSourceUrl = "https://docs.angularjs.org/guide/animations",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-Animate/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-Animate",
		pluginIconImageUrl = "https://angularjs.org/img/AngularJS-large.png",
		pluginIconUrl = "https://angularjs.org/img/AngularJS-large.png",
		pluginOriginalHomepage = "https://docs.angularjs.org/guide/animations",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-angular-animate",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-angular-animate",
		pluginModuleName = "com.jwebmp.plugins.angularanimate",
		pluginStatus = PluginStatus.Released
)
public class AngularAnimatePageConfigurator
		implements IPageConfigurator<AngularAnimatePageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularAnimatePageConfigurator
	 */
	public AngularAnimatePageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularAnimatePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularAnimatePageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularAnimationsReferencePool.AngularAnimations.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularAnimatePageConfigurator.enabled;
	}
}
