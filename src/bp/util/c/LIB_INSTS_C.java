package bp.util.c;

import com.sun.jna.Native;
import com.sun.jna.Platform;

public class LIB_INSTS_C
{
	private static volatile CLib S_INST_CLIB = null;

	public final static CLib getCLIB()
	{
		if (S_INST_CLIB != null)
			return S_INST_CLIB;
		synchronized (CLib.class)
		{
			if (S_INST_CLIB == null)
				S_INST_CLIB = (CLib) Native.loadLibrary(Platform.isWindows() ? "msvcrt" : "c", CLib.class);
		}
		return S_INST_CLIB;
	}

}
