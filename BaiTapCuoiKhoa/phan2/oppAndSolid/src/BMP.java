public class BMP implements iFile{
    @Override
    public void openFile() {
        System.out.println("open bmp file");
    }

    @Override
    public void parseFile() {
        System.out.println("parse bmp file");
    }

    @Override
    public void saveFile() {
        System.out.println("save bmp file");
    }
}
