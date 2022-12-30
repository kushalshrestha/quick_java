package quick_java_fpp.objects_classes;

import java.util.Objects;

public class Label {
    public static final int LEFT = 0;
    public static final int CENTER = 1;
    public static final int RIGHT = 2;
    String text;
    int alignment = LEFT;

    public Label(String text, int alignment) {
        this.text = text;
        setAlignment(alignment);
    }


    public String getText() {
        return text;
    }

    public int getAlignment() {
        return alignment;
    }

    private void setAlignment(int alignment) {
        switch (alignment) {
            case LEFT:
            case RIGHT:
            case CENTER:
                this.alignment = alignment;
                return;
        }
        throw new IllegalArgumentException("improper alignment: " + alignment);
    }

    public void setText(String text) {
        if (!Objects.equals(this.text, text)) {
            //Alternative way
//        if (text != this.text && (this.text == null || !this.text.equals(text))) {
            this.text = text;
        }
    }
}
