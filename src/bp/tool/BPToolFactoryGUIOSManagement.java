package bp.tool;

import java.util.function.BiConsumer;

import bp.BPCore.BPPlatform;
import bp.locale.BPLocaleHelpers;
import bp.os.monitor.BPOSMonitors;
import bp.os.process.BPProcessHandlers;
import bp.util.ClassUtil;

public class BPToolFactoryGUIOSManagement implements BPToolFactory
{
	public String getName()
	{
		return "GUI-OSManagement";
	}

	public boolean canRunAt(BPPlatform platform)
	{
		return platform == BPPlatform.GUI_SWING;
	}

	public void install(BiConsumer<String, BPTool> installfunc, BPPlatform platform)
	{
		String packname = BPLocaleHelpers.getValueReflect("bp.ui.actions.BPActionConstOSManagement", "TXT_OSMAN");
		if (packname != null)
		{
			if (BPProcessHandlers.S_LISTPROCESSES != null)
				installfunc.accept(packname, ClassUtil.createObject("bp.tool.BPToolGUIProcessManager"));
			if (BPOSMonitors.hasMonitor())
				installfunc.accept(packname, ClassUtil.createObject("bp.tool.BPToolGUISystemMonitor"));
		}
	}
}
