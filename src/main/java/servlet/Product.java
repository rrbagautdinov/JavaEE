package servlet;

public class Product {
    int id;
    String title;
    int cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
}
