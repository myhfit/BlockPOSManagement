package bp.os.process;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import bp.os.process.BPProcessHandler.ProcessInfo;

public final class BPProcessHandlers
{
	public static volatile Supplier<List<ProcessInfo>> S_LISTPROCESSES = null;
	public static volatile Function<Integer, ProcessInfo> S_FINDPROCESS = null;
	public static volatile Function<List<Integer>, List<ProcessInfo>> S_FINDPROCESSES = null;

	public final static List<ProcessInfo> listProcesses()
	{
		Supplier<List<ProcessInfo>> lp = S_LISTPROCESSES;
		return lp == null ? null : lp.get();
	}

	public final static List<ProcessInfo> findProcesses(List<Integer> pids)
	{
		Function<List<Integer>, List<ProcessInfo>> lp = S_FINDPROCESSES;
		return lp == null ? null : lp.apply(pids);
	}

	public final static ProcessInfo findProcesses(int pid)
	{
		Function<Integer, ProcessInfo> lp = S_FINDPROCESS;
		return lp == null ? null : lp.apply(pid);
	}
}
