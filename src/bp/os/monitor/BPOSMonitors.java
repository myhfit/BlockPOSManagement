package bp.os.monitor;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import bp.util.LogicUtil;

public final class BPOSMonitors
{
	private final static Map<String, WeakReference<Supplier<BPOSMonitor>>> S_CREATE_MONITOR_MAP = new HashMap<String, WeakReference<Supplier<BPOSMonitor>>>();

	public final static String MONITOR_KEY_CPU = "cpu";
	public final static String MONITOR_KEY_MEMORY = "mem";

	@SuppressWarnings("unchecked")
	public final static <T extends BPOSMonitor> T createMonitor(String key)
	{
		Supplier<BPOSMonitor> c = LogicUtil.CHAIN_NN(S_CREATE_MONITOR_MAP.get(key), r -> ((WeakReference<Supplier<BPOSMonitor>>) r).get());
		if (c == null)
			return null;
		return (T) c.get();
	}

	public final static void registerFactory(String key, Supplier<BPOSMonitor> func)
	{
		S_CREATE_MONITOR_MAP.put(key, new WeakReference<Supplier<BPOSMonitor>>(func));
	}

	public final static boolean hasMonitor()
	{
		return S_CREATE_MONITOR_MAP.size() > 0;
	}
}
