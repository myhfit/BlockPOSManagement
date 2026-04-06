package bp.os.monitor;

public interface BPOSMonitor
{
	public final static String MONITOR_KEY_CPU = "CPU";

	default void start()
	{

	}

	default void stop()
	{

	}

	void tick();

	public static interface BPOSMonitor_CPU extends BPOSMonitor
	{
		double getCPUUsage();
	}
	
	public static interface BPOSMonitor_Memory extends BPOSMonitor
	{
		long[] getMemoryStatus();
	}
}
