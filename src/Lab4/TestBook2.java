package Lab4;

//Java Program to illustrate the use of the Book class, which
//has title, price, and discount.
class Book
{
    String title;
    double price;
    double discount;
    void insert(String t, double p, double d) {
        title = t;
        price = p;
        discount = d;
    }
    void calculateFinalPrice()
    {System.out.println("Final price of " + title + ": $" + (price - (price * discount / 100)));}
}
class TestBook2
{
    public static void main(String[] args){
        Book b1=new Book(), b2=new Book(); //creating two objects
        b1.insert("Java Programming", 65,10);
        b2.insert("Discrete Mathematics",55,8);
        b1.calculateFinalPrice();
        b2.calculateFinalPrice ();
    }
}