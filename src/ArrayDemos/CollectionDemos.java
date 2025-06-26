package ArrayDemos;

import java.util.*;
class Product{
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id,String name){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

class ProductServices{

    private static ProductServices instance ;
    private ArrayList<Product> list;

    public ArrayList<Product> getList() {
        return list;
    }

    public Product getproductById(int id){
        for (Product p:list) {
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

   private ProductServices(){
            list = new ArrayList<Product>();
    }

    public static ProductServices getInstance(){
        if(instance == null){
            instance = new ProductServices();
        }
        return instance;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public void  insert(Product p){
        this.list.add(p);
    }

    public void print(){

        for(Product p:list) {
            System.out.println(p);
        }
    }

    public void  updateProduct(int id,String name){
        getproductById(id).setName(name);
    }
    public void  updateProductCategory(int id,String name){
        getproductById(id).setCategory(name);
    }

    public ArrayList<Product> getProductsByCategory(String categoryName){
        ArrayList<Product> filteredList = new ArrayList<>();
        for (Product p: list) {
            if(p.getCategory().equals(categoryName)){
                filteredList.add(p);
            }
        }
        return filteredList;
    }



}
public class CollectionDemos {

    public static void main(String[] args) {
        ProductServices ps1 = ProductServices.getInstance();
//        ProductServices ps2 = ProductServices.getInstance();
        Product p  =new Product(100,"p1");
        Product p2  =new Product(101,"p2");

        ps1.insert(p);
        ps1.insert(p2);
        ps1.updateProductCategory(100,"Electronics");

        ps1.print();
        ps1.updateProduct(100,"Laptop");
        System.out.println(ps1.getproductById(100));




    }
}
