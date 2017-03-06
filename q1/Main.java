package q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String inStr, outStr = "";
		//入力文字列を読み込み
		Scanner scan = new Scanner(System.in);
		inStr = scan.nextLine();
		scan.close();

		String splitedStr[] = inStr.split(" ");

		//それぞれの文字列を整形してoutStrに結合
		outStr = String.format("%-19s", splitedStr[0]);
		outStr += " " + String.format("%19s", splitedStr[1]);
		outStr += " " + String.format("%09d", Integer.parseInt(splitedStr[2]));
		outStr += " " + String.format("%9d", Integer.parseInt(splitedStr[3]));
		outStr += " " + String.format("%9.3f", Double.parseDouble(splitedStr[4]));

		System.out.print(outStr);
		System.out.print("\n");

	}

}
