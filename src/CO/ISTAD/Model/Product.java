package CO.ISTAD.Model;

import java.time.LocalDateTime;

public class Product {
    private Long id;
    private String name;
    private Integer qty;
    private Double price;
    private LocalDateTime importDate;

    public Product(Long id, String name, Integer qty, Double price, LocalDateTime importDate) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.importDate = importDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDateTime importDate) {
        this.importDate = importDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", importDate=" + importDate +
                '}';
    }

}
