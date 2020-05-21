import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practice9_2 {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("인자를 다시 입력하세요.");
            System.exit(1);
        }

        //파일 존재 여부 확인
        File file = new java.io.File(args[1]);
        if (!file.exists()) {
            System.out.println(args[1] + "파일이 존재하지 않습니다.");
            System.exit(2);
        }

        //파일 읽기 및 텍스트 제거
        String tempStr="";
        StringBuilder str = new StringBuilder();
        try{
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                tempStr = input.nextLine();
                str.append(tempStr.replaceAll(args[0], "") + "\n");
            }
        }catch (IOException e){
            System.out.println(e);
        }

        //파일에 쓰기
        try{
            PrintWriter output = new PrintWriter(file);
            output.print(str);
            output.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }

}
