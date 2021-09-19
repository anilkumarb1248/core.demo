package core.demo.files;

import java.io.File;

public class FileNamesPrinter {

	private static final String FILE_PATH = "A:\\Personal Self Notes\\Java\\Core Java";

	public static void main(String arr[]) {

		new FileNamesPrinter().printFileNames(FILE_PATH);
	}

	public void printFileNames(String path) {
		File file = new File(path);
		File[] fileList = file.listFiles();
		for(File f: fileList) {
			System.out.println(f.getName());
		}
	}

}
