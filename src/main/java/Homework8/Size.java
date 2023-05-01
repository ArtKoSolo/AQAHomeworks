package Homework8;

public enum Size {
    SMALL("S",11,40),
    MEDIUM("M",15,70),
    LARGE("L",18, 90),
    EXTRA_LARGE("XL",21,110);

    String size;
    int width;
    int length;

    Size(String size, int width, int length) {
        this.size = size;
        this.width = width;
        this.length = length;
    }

    public String getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return this.size + " or " + this.name () + " size: " + "width = " + this.width + ", " + "length = " + this.length + ".";
    }
}


