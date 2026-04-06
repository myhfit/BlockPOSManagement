package bp.ext;

import bp.BPCore;
import bp.BPCore.BPPlatform;
import bp.context.BPFileContext;
import bp.locale.BPLocaleHelpers;
import bp.nativehelper.BPNativeHelperJNA;
import bp.nativehelper.BPNativeHelpers;
import bp.ui.actions.BPActionHelperOSManagement;
import bp.util.OSInfoHandlers;
import bp.util.SystemUtil;

public class BPExtensionLoaderOSManagement implements BPExtensionLoader
{
	public String getName()
	{
		return "OS Management";
	}

	public boolean isUI()
	{
		return false;
	}

	public String getUIType()
	{
		return null;
	}

	public String[] getParentExts()
	{
		return null;
	}

	public String[] getDependencies()
	{
		return null;
	}

	public boolean checkSystem()
	{
		return true;
	}

	public void install(BPFileContext context)
	{
		if (BPCore.getPlatform() == BPPlatform.GUI_SWING)
			BPLocaleHelpers.registerHelper(new BPActionHelperOSManagement());
	}

	public void preload()
	{
		SystemUtil.addSystemInfoHandler("OS", OSInfoHandlers::getOSInfo);
		{
			BPNativeHelperJNA h = new BPNativeHelperJNA();
			if (h.checkPlatform())
				BPNativeHelpers.register(h);
		}
	}
}
