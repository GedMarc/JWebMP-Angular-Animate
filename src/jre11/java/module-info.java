import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularanimate.AngularAnimateModule;
import com.jwebmp.plugins.angularanimate.AngularAnimatePageConfigurator;
import com.jwebmp.plugins.angularanimate.injections.AngularAnimateExclusionsModule;

module com.jwebmp.plugins.angularanimate {
	exports com.jwebmp.plugins.angularanimate;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularAnimatePageConfigurator;
	provides IAngularModule with AngularAnimateModule;

	provides IGuiceScanModuleExclusions with AngularAnimateExclusionsModule;
	provides IGuiceScanJarExclusions with AngularAnimateExclusionsModule;

}
