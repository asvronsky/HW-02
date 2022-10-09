package org.example;

public class Vector
{
    public double x, y, z;
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        double new_x = y * vector.z - z * vector.y;
        double new_y = z * vector.x - x * vector.z;
        double new_z = x * vector.y - y * vector.x;
        return new Vector(new_x, new_y, new_z);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return this.scalarProduct(vector) / (this.length() * vector.length());
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        if(!(o instanceof Vector)) {
            return false;
        }

        Vector v = (Vector) o;

        return (this.x == v.x) && (this.y == v.y) && (this.z == v.z);
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + (int)(this.x * 100000) % 2749;
        result = 31 * result + (int)(this.y * 100000) % 2749;
        result = 31 * result + (int)(this.z * 100000) % 2749;
        return result;
    }

    @Override
    public String toString(){
        return String.format("(%f, %f, %f)", x, y, z);
    }
}
