import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularanimate.AngularAnimateModule;
import com.jwebmp.plugins.angularanimate.AngularAnimatePageConfigurator;

module com.jwebmp.plugins.angularanimate {
	exports com.jwebmp.plugins.angularanimate;

	requires com.jwebmp.core;

	provides IPageConfigurator with AngularAnimatePageConfigurator;
	provides IAngularModule with AngularAnimateModule;

}
