public class Paper {

    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void write(String textToWrite) {
        text += textToWrite;
    }
}
