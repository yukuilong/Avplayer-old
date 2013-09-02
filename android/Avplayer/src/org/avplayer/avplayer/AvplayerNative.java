package org.avplayer.avplayer;

public class AvplayerNative {
	
	public static native void AvplayInit();
	public static native void AvplayUninit();
	public static native void AvplaySetWindowHandle(Object window);
	public static native boolean AvplayOpen(String movie, int media_type, int render_type);
	public static native boolean AvpalyPlay(double fact, int index);
	public static native boolean AvplayPause();
	public static native boolean AvplayResume();
	public static native boolean AvplayWaitForCompletion();
	public static native boolean AvplayStop();
	public static native boolean AvplayClose();
	public static native void AvplaySeekTo(double fact);
	public static native void AvplayVolume(double l, double r);
	public static native void AvplayMuteSet(boolean s);
	public static native int AvplayDownloadRate();
	public static native void AvplaySetDownloadRate(int k);
	public static native double AvplayCurrPlayTime();
	public static native double AvplayDuration();
	public static native int AvplayVideoWidth();
	public static native int AvplayVideoHeight();
	public static native double AvplayBuffering();
	public static native int AvplayMediaCount();


}
