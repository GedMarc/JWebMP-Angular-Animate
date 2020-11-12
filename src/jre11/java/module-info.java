module com.jwebmp.plugins.angularanimate {
	exports com.jwebmp.plugins.angularanimate;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularanimate.AngularAnimatePageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularanimate.AngularAnimateModule;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularanimate.injections.AngularAnimateExclusionsModule;

}
