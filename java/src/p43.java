import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 웹사이트 생성자
 * 플밍 언어는 파일과 폴더를 생성
 * - 사이트 이름 입력
 * - 사이트 필자 입력
 * - 자바스크립트 파일을 위한 폴더를 만들 것인지 입력
 * - CSS파일을 위한 폴더를 만들 것인지를 입력
 * index.html 파일 생성
 * 그 파일 안에는 <title>사이트 이름</title><meta>필자 이름</meta> 들어 있음.
 */
public class p43 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String currentPath = System.getProperty(".");
        String siteName = Util.promptData("Site name: ", sc);
        String author = Util.promptData("Author: ", sc);
        String isCreateJavascript = Util.promptDataWithPattern("Do you want a folder for javaScript(y/n): ", sc, "[y|Y|n|N]");
        String isCreateCss = Util.promptDataWithPattern("Do you want a folder for CSS(y/n): ", sc, "[y|Y|n|N]");

//        Path dir = Files.createTempDirectory("my-dir");
//        Path fileToCreatePath = dir.resolve("test-file.txt");
//        System.out.println("File to create path: " + fileToCreatePath);
//        Path newFilePath = Files.createFile(fileToCreatePath);
//        System.out.println("New file created: " + newFilePath);
//        System.out.println("New File exits: " + Files.exists(newFilePath));
//        Path path =  Paths.get("/opt/test/");
//
//        Files.createDirectory(path);
//        Files.createFile(path);
        Path path = Paths.get("java/src/texture/.");
        Path resolve = path.resolve("index.html");
        if (!Files.exists(resolve)){
            Files.createFile(resolve);
            File htmlFile = new File(resolve.toString());
            FileWriter fw = new FileWriter(htmlFile);
            fw.write("<title>" + siteName + "</title><meta>" + author + "</meta>");
            fw.close();
        }

        if (isCreateJavascript.toLowerCase().equals("y")){
            Path path1 = Paths.get("java/src/texture/js/");
            if (!Files.exists(path1)){
                Path dir = Files.createDirectories(path1);
                Files.createDirectories(dir);
            }
        }

        if (isCreateCss.toLowerCase().equals("y")){
            Path path1 = Paths.get("java/src/texture/css/");
            if (!Files.exists(path1)){
                Path dir = Files.createDirectories(path1);
                Files.createDirectories(dir);
            }
        }

    }
}
