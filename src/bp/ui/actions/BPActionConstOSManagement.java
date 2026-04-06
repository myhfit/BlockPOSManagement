package bp.ui.actions;

public enum BPActionConstOSManagement implements BPActionConst
{
	ACT_BTNRUNCMD,
	ACT_BTNSHELLEXEC,
	ACT_BTNKILL,
	ACT_BTNAUTOREFRESH,
	
	TNAME_PROCESSMAN, 
	TNAME_SYSTEMMON,
	TNAME_WINDOWMAN,
	TNAME_POWERMAN,
	
	TXT_OSMAN,

	// TXT_WEBSEARCHENGINE,

	;

	public String getPackName()
	{
		return "osman";
	}
}
