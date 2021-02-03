public class GraphicsEditor {
    public static void main(String[] args){
        iFile bmpEditor = new BMP();
        bmpEditor.openFile();
        bmpEditor.parseFile();
        bmpEditor.saveFile();

        iFile gifEditor = new GIF();
        gifEditor.openFile();
        gifEditor.parseFile();
        gifEditor.saveFile();

        iFile jpgEditor = new JPG();
        jpgEditor.openFile();
        jpgEditor.parseFile();
        jpgEditor.saveFile();

        iFile pngEditor = new PNG();
        pngEditor.openFile();
        pngEditor.parseFile();
        pngEditor.saveFile();
    }
}
