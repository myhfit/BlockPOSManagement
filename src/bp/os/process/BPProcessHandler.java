package bp.os.process;

public interface BPProcessHandler
{
	public static class ProcessInfo
	{
		public int pid;
		public String filename;
		public Long mem_used;
	}
}
