public class JPG implements iFile{
    @Override
    public void openFile() {
        System.out.println("open jpg file");
    }

    @Override
    public void parseFile() {
        System.out.println("parse jpg file");
    }

    @Override
    public void saveFile() {
        System.out.println("save jpg file");
    }
}
