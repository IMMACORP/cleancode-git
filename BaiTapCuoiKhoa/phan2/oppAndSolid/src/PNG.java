public class PNG implements iFile{
    @Override
    public void openFile() {
        System.out.println("open png file");
    }

    @Override
    public void parseFile() {
        System.out.println("parse png file");
    }

    @Override
    public void saveFile() {
        System.out.println("save png file");
    }
}
