class myNumber {
    public static void main(String[] args) {
        int x = 1, y = 5, z = 0;
        --y;
        System.out.println("y=" + y);
        x = 4 + y++;
        System.out.println("y=" + y);
        System.out.println("x=" + x);
        z += x--;
        System.out.println(z);
        x = y + z;
        System.out.println(x);
        System.out.println(++x);
    }
}