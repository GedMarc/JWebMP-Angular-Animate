package com.jwebmp.plugins.angularanimate.injections;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularAnimateInclusionModule implements IGuiceScanModuleInclusions<AngularAnimateInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angularanimate");
		return set;
	}
}
