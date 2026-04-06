package bp.ui.actions;

import java.util.Map;

import bp.ui.res.icon.BPIconResV;

public class BPActionHelperOSManagement extends BPActionHelperBase<BPActionConstOSManagement>
{
	public final static String ACTIONHELPER_PACK_OSMAN = "osman";

	public String getPackName()
	{
		return ACTIONHELPER_PACK_OSMAN;
	}

	public void initDefaults(Map<Integer, Object> actmap)
	{
		putAction(actmap, BPActionConstOSManagement.ACT_BTNRUNCMD, "runcmd", "Run command", BPIconResV::ADD, "ctrl shift R", null);
		putAction(actmap, BPActionConstOSManagement.ACT_BTNSHELLEXEC, "shellexec", "Shell Execute", BPIconResV::ADD, "alt R", null);
		putAction(actmap, BPActionConstOSManagement.ACT_BTNKILL, "kill", "Kill", BPIconResV::KILL, "F3", null);
		putAction(actmap, BPActionConstOSManagement.ACT_BTNAUTOREFRESH, "autorefresh", "Auto refresh", BPIconResV::REFRESH, null, null);

		putAction(actmap, BPActionConstOSManagement.TNAME_PROCESSMAN, "Process Manager", null, null, null, null);
		putAction(actmap, BPActionConstOSManagement.TNAME_SYSTEMMON, "System Monitor", null, null, null, null);
		putAction(actmap, BPActionConstOSManagement.TNAME_WINDOWMAN, "Window Manager", null, null, null, null);
		putAction(actmap, BPActionConstOSManagement.TNAME_POWERMAN, "Power Manager", null, null, null, null);
		putAction(actmap, BPActionConstOSManagement.TXT_OSMAN, "OS Management", null, null, null, null);
	}

	protected Class<BPActionConstOSManagement> getConstClass()
	{
		return BPActionConstOSManagement.class;
	}
}
