package com.jwebmp.plugins.angularanimate.injections;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularAnimateExclusionsModule
		implements IGuiceScanModuleExclusions<AngularAnimateExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularanimate");
		return strings;
	}
}
