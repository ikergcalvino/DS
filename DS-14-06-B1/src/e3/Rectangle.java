package e3;

public class Rectangle {
    private int base;
    private int height;
    public Rectangle(int base, int height) {
        if (base < 0) { throw new IllegalArgumentException("Illegal value!");} else {
        this.base = base; }
        if (height < 0) { throw new IllegalArgumentException("Illegal value!");} else {
        this.height = height; }
        //lanzar IllegalArgumentException si se pasa un valor negativo
}

public Rectangle(Rectangle r) {
    //deberia copiar al constructor, pero xdxdxd jajaja salu2 como se hace eso
    this.base = r.base;
    this.height = r.height;
}

//Getters
public int getBase() {
    return base;
}


public int getHeight() {
    return height;
}

//Setters, lanza IllegalArgumentException si algun argumentto es negativo
public void setBase(int base) {
    if (base < 0) { throw new IllegalArgumentException("Illegal value!");} else {
        this.base = base;
    }
}

public void setHeight(int height) {
    if (height < 0) { throw new IllegalArgumentException("Illegal value!");} else {
        this.height = height;
    }
}

public boolean isSquare() {
    boolean square;
    square = (base == height);
    return square;
}

public int area() {
    int area;
    area = base*height;
    return area;
}

public int perimeter() {
    int perimeter;
    perimeter = 2*base + 2*height;
    return perimeter;
}

public double diagonal() {
    double diagonal;
    diagonal  = Math.sqrt(base*base + height*height);
    return diagonal;
}

public void turn() {
    int turn;
    turn = base;
    base = height;
    height = turn;
}

public void putHorizontal() {
    if (height > base) { turn(); }
}

public void putVertical() {
    if (base > height) { turn(); }    
}   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle1 = new Rectangle (this.base, this.height);
        Rectangle rectangle2 = (Rectangle)obj;
        rectangle1.putHorizontal();
        rectangle2.putHorizontal();
        if (rectangle1.base == rectangle2.base) {
            if (rectangle1.height == rectangle2.height) { return true; }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.height + this.base;
        return hash;
    }

}