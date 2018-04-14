package com.jwebmp.plugins.angularanimate;

import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.plugins.PluginInformation;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Animate",
		pluginDescription = "These animation hooks in the angular animation for the project.",
		pluginUniqueName = "jwebswing-angular-animate",
		pluginVersion = "1.6.4",
		pluginCategories = "angular,animations, ui,web ui, framework",
		pluginSubtitle = "these animation hooks are set in place to trigger animations during the life cycle of various directives ",
		pluginSourceUrl = "https://docs.angularjs.org/guide/animations",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Animate/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Animate",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://docs.angularjs.org/guide/animations",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularAnimate.jar/download")
public class AngularAnimatePageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAnimatePageConfigurator
	 */
	public AngularAnimatePageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularAnimationsReferencePool.AngularAnimations.getJavaScriptReference());
			page.getAngular()
			    .getAngularModules()
			    .add(new AngularAnimateModule());
		}
		return page;
	}
}