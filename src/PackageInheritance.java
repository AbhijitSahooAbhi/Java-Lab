package src;

class Book{
    void Show(){
        System.out.println("java Book");
    }
}
public class PackageInheritance extends Book{
    public static void main(String[] args) {
        Book obj = new Book();
        obj.Show();
    }
}
