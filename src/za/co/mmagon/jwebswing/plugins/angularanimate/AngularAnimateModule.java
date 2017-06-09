package za.co.mmagon.jwebswing.plugins.angularanimate;

import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class AngularAnimateModule extends AngularModuleBase
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new AngularAnimateModule
     */
    public AngularAnimateModule()
    {
        super("ngAnimate");
    }

    @Override
    public String renderFunction()
    {
        return null;
    }
}
