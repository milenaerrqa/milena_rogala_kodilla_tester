public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkWeight() {
        if (this.weight < 1500) {
            System.out.println("This notebook is very light");
        } else if (this.weight >= 1500 && this.weight <= 2500) {
            System.out.println("The weight of this notebook is quite good");
        } else if (this.weight > 2000) {
            System.out.println("This notebook is very heavy");
        }
    }
    public void checkPrice() {
        if (this.year < 1981) {
            System.out.println("There wasn't any notebook at that time on the sales market. " +
                    "First notebook was produced and sold in 1981.");
        } else if (this.price <= 0) {
            System.out.println("Enter correct price, higher than 0!!!");
        } else if (this.year > 2020) {
            System.out.println("Enter current or past year");
        } else {
            if (this.year >= 1981 && this.year < 1995) {    //1981-1994
                if (this.price > 300) {
                    System.out.println("This notebook " + this.year + " is too expensive");
                } else {
                    System.out.println("This price is very good for a notebook produced in " + this.year);
                }
            }
            else if (this.year >= 1995 && this.year < 2005){   //1995-2004
                if (this.price > 600){
                    System.out.println("This notebook " + this.year + " is too expensive");
                }
                else if(this.price < 300){
                    System.out.println("This notebook " + this.year + " is very cheap");
                }
                else {
                    System.out.println("This price is very good for a notebook produced in " + this.year);
                }
            }
            else if (this.year >= 2005 && this.year < 2010){    //2005-2009
                if (this.price > 1000){
                    System.out.println("This notebook " + this.year + " is too expensive");
                }
                else if(this.price < 600){
                    System.out.println("This notebook " + this.year + " is very cheap");
                }
                else {
                    System.out.println("This price is very good for a notebook produced in " + this.year);
                }
            }
            else if (this.year >=2010 && this.year < 2015){     //2010-2014
                if (this.price > 1500){
                    System.out.println("This notebook " + this.year + " is too expensive");
                }
                else if(this.price < 1000){
                    System.out.println("This notebook " + this.year + " is very cheap");
                }
                else {
                    System.out.println("This price is very good for a notebook produced in " + this.year);
                }
            }
            else if (this.year >=2015 && this.year <= 2020){     //2015-2020
                if (this.price > 5000){
                    System.out.println("This notebook produced in " + this.year + " is too expensive");
                }
                else if(this.price < 1500){
                    System.out.println("This notebook " + this.year + " is very cheap");
                }
                else {
                    System.out.println("This price is very good for a notebook produced in " + this.year);
                }
            }
        }
    }
}
