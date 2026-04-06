package bp.util.c;

import com.sun.jna.Library;

public interface CLib extends Library
{
	void printf(String format, Object... args);
}
