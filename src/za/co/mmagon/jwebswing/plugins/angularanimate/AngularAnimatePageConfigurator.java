package za.co.mmagon.jwebswing.plugins.angularanimate;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Toastr",
		pluginDescription = "These animation hooks are set in place to trigger animations during the life cycle of various directives and when triggered, will attempt to perform a CSS Transition, CSS Keyframe Animation or a JavaScript callback Animation (depending on whether an animation is placed on the given directive). Animations can be placed using vanilla CSS by following the naming conventions set in place by AngularJS or with JavaScript code, defined as a factory.",
		pluginUniqueName = "jwebswing-angular-animate",
		pluginVersion = "1.6.4",
		pluginCategories = "angular,animations, ui,web ui, framework",
		pluginSubtitle = "hese animation hooks are set in place to trigger animations during the life cycle of various directives ",
		pluginSourceUrl = "https://docs.angularjs.org/guide/animations",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Animate/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Animate",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://docs.angularjs.org/guide/animations",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularAnimate.jar/download"
) class AngularAnimatePageConfigurator extends PageConfigurator
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
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			AngularPageConfigurator.setRequired(page.getBody(), true);
			page.getBody().addJavaScriptReference(AngularAnimationsReferencePool.AngularAnimations.getJavaScriptReference());
			page.getAngular().getAngularModules().add(new AngularAnimateModule());
		}
		return page;
	}
}
