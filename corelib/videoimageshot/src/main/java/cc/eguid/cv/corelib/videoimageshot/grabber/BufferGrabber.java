package cc.eguid.cv.corelib.videoimageshot.grabber;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * 图像字节缓冲抓取
 * @author eguid
 *
 */
public interface BufferGrabber {

	/**
	 * 抓取图像缓冲区(确保已经设置了url参数，默认获取BGR数据)
	 * @return
	 * @throws IOException
	 */
	ByteBuffer grabBuffer() throws IOException;
	
	/**
	 * 抓取图像缓冲区（默认获取BGR数据）
	 * @param url-视频地址
	 * @return
	 * @throws IOException
	 */
	ByteBuffer grabBuffer(String url) throws IOException;

	/**
	 * 抓取图像缓冲区
	 * @param url -视频地址
	 * @param fmt -图像数据结构（默认BGR24）
	 * @return
	 * @throws IOException
	 */
	ByteBuffer grabBuffer(String url, Integer fmt) throws IOException;

}
