package java.com.corejava9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

/**
 * 
 * @Title FileReadException.java
 * @Package 
 * @Description TODO(用一句话描述该文件做什么)
 * @author yan.liang
 * @date 2015年7月17日 下午1:58:04
 * @copyright USTCINFO
 */

/**
 * @author YanLiang
 *
 */
public class FileReadException {

	/**
	 * @author yan.liang
	 * @date 2015年7月17日 下午1:58:05
	 * @Description TODO(这里用一句话描述这个方法的作用)
	 */
	public static void main(String[] args) {
		try {
			read();
		} catch (FileNotFoundException e) {
			Logger.getLogger("test").info("文件名不存在");
			e.printStackTrace();
		}

	}
	
	public static void read() throws FileNotFoundException{
		try {
			FileInputStream fileInputStream = new FileInputStream("test.text");
		} catch (FileNotFoundException e) {
			throw e;
		}
	}

}
