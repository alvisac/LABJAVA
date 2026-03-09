package Lab8;


public class DemoSalesperson2 {

    public static void main(String[] args){

        Salesperson[] salesPeople = new Salesperson[10];

        int id = 111;
        double sales = 25000;

        for(int i = 0; i < salesPeople.length; i++){
            salesPeople[i] = new Salesperson(id, sales);
            id++;
            sales += 5000;
        }

        for(int i = 0; i < salesPeople.length; i++){
            System.out.println("ID: " + salesPeople[i].getIdNumber() +
                    " Sales: $" + salesPeople[i].getAnnualSales());
        }
    }
}