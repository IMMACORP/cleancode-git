public class GIF implements iFile{
    @Override
    public void openFile() {
        System.out.println("open gif file");
    }

    @Override
    public void parseFile() {
        System.out.println("parse gif file");
    }

    @Override
    public void saveFile() {
        System.out.println("save gif file");
    }
}
