package Lab5;

public class BookCategory
{
    public static void main(String[] args) {
        char category = 'H';
        switch(category) {
            case 'H' :
                System.out.println("History: Discover the past.");
                break;
            case 'A' :
                System.out.println("Adventure: Stories full of exciting journeys.");
                break;
            case 'M' :
                System.out.println("Mystery: Suspenseful cases.");
            case 'F' :
                System.out.println("Fiction: Imaginative stories.");
                break;
            default :
                System.out.println("Invalid category");
        }
        System.out.println("Category selected:" + category);
    }
}
