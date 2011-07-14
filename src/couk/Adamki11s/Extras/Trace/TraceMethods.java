package couk.Adamki11s.Extras.Trace;

import java.io.File;

public abstract class TraceMethods {
	
	/**
	 * Starts the trace.
	 */
	public abstract void startTrace();
	
	/**
	 * Stops the trace.
	 */
	public abstract void stopTrace();
	
	/**
	 * Get the trace time.
	 * @return Time between start and end of trace in milliseconds(ms).
	 */
	public abstract long getTrace();

	/**
	 * Log the result of the latest trace to the console.
	 */
	public abstract void logTraceTime();
	
	/**
	 * Log the trace time with a description to a file.
	 * @param file The location to which the trace will be printed
	 * @param description The accompanying description of the trace.
	 */
	public abstract void logTraceTime(File file, String description);

}
