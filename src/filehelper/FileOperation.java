package filehelper;

import java.io.*;

public class FileOperation implements FilenameFilter {

	private String extendName;

	public void setExtendName(String s) {
		extendName = "." + s;
	}

	/**
	 * 匹配文件後綴
	 **/
	public boolean accept(File dir, String name) {
		return name.endsWith(extendName);
	}

	/**
	 * 連續寫入數據到文件中
	 */
	public void writeFile(String conent) {

		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("test_Face_out", true)));
			out.write(conent + "\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 讀取文件
	 */
	public void readFile(String str) throws IOException {
		File file = new File(str);
		FileReader in;
		BufferedReader inR;
		String[] lins = new String[1000];
		String s = null;
		int i = 0;
		try {
			in = new FileReader(file);
			inR = new BufferedReader(in);
			while ((s = inR.readLine()) != null) {
				lins[i++] = s;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
