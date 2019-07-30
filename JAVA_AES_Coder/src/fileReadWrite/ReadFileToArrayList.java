package fileReadWrite;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileToArrayList {

    // topLines = Files.readAllLines(Paths.get(WORKING_DIR + HEADER_FILE), Charset.forName("ISO-8859-1"));

    private String charSetName = "ISO-8859-1";
    private String fileFullPath = null;

    public ReadFileToArrayList() {
    }

    public ReadFileToArrayList(String fileFullPath) {
        this.fileFullPath = fileFullPath;
    }

    public ReadFileToArrayList(String fileFullPath, String charSetName) {
        this.fileFullPath = fileFullPath;
        this.charSetName = charSetName;
    }

    public String getCharSetName() {
        return charSetName;
    }

    public void setCharSetName(String charSetName) {
        this.charSetName = charSetName;
    }

    public String getFileFullPath() {
        return fileFullPath;
    }

    public void setFileFullPath(String fileFullPath) {
        this.fileFullPath = fileFullPath;
    }

    public List<String> readFileAsList() throws Exception{
        return Files.readAllLines(Paths.get(this.fileFullPath), Charset.forName(this.charSetName));
    }

    public static void main(String agrs[]) throws Exception {
        ReadFileToArrayList reader = new ReadFileToArrayList("E:\\corejava_11_Edition\\corejava\\v1ch12\\blockingQueue\\BlockingQueueTest.java");
        List<String> fileContent = reader.readFileAsList();
        fileContent.forEach((x) ->System.out.println(x));
    }
}
