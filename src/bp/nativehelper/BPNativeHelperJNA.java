package bp.nativehelper;

public class BPNativeHelperJNA extends BPNativeHelperBase
{
	public final static String HELPER_JNA = "jna";

	public boolean checkPlatform()
	{
		return true;
	}

	public String getName()
	{
		return HELPER_JNA;
	}
}
