package ru.kpfu.itis.group11506.diff;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		boolean out = true;
		String outFile = "out";

		StringToArr stringToArr = new StringToArr();
		Diff diff = new Diff();
		UploadFile uploadFile = new UploadFile();

		String origin = "C:/Users/Элина/Desktop/text1.txt";
		String changed = "C:/Users/Элина/Desktop/text2.txt";

		String[] myDiff = stringToArr
				.fromStringToArr(stringToArr.readFile("C:/Users/Элина/Desktop/Java/2 семестр/MyDiff/out.diff"));

		try {
			diff.diff(stringToArr.fromStringToArr(stringToArr.readFile(origin)),
					stringToArr.fromStringToArr(stringToArr.readFile(changed)), out, outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < myDiff.length; i++) {
			System.out.println(myDiff[i]);
		}
		// System.out.println(myDiff.length);
		uploadFile.uploadFile(myDiff, stringToArr.fromStringToArr(stringToArr.readFile(changed)), changed);
	}
}
