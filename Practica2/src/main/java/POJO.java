public class POJO {

    private String order_number;
    private int quantity;
    private double price;
    private int order_lines;
    private double sales;
    private String date;
    private String status;
    private int qtr_id;
    private int month_id;
    private int year_id;
    private String product_line;
    private int msrp;
    private String product_code;
    private String customer_name;
    private String phone;
    private String address_1;
    private String address_2;
    private String city;
    private String state;
    private String postal_code;
    private String country;
    private String territory;
    private String contact_last_name;
    private String contact_first_name;
    private String deal_size;

    public POJO(String order_number, int quantity, double price, int order_lines, double sales, String date, String status, int qtr_id, int month_id, int year_id, String product_line, int msrp, String product_code, String customer_name, String phone, String address_1, String address_2, String city, String state, String postal_code, String country, String territory, String contact_last_name, String contact_first_name, String deal_size) {
        this.order_number = order_number;
        this.quantity = quantity;
        this.price = price;
        this.order_lines = order_lines;
        this.sales = sales;
        this.date = date;
        this.status = status;
        this.qtr_id = qtr_id;
        this.month_id = month_id;
        this.year_id = year_id;
        this.product_line = product_line;
        this.msrp = msrp;
        this.product_code = product_code;
        this.customer_name = customer_name;
        this.phone = phone;
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.country = country;
        this.territory = territory;
        this.contact_last_name = contact_last_name;
        this.contact_first_name = contact_first_name;
        this.deal_size = deal_size;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrder_lines() {
        return order_lines;
    }

    public void setOrder_lines(int order_lines) {
        this.order_lines = order_lines;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQtr_id() {
        return qtr_id;
    }

    public void setQtr_id(int qtr_id) {
        this.qtr_id = qtr_id;
    }

    public int getMonth_id() {
        return month_id;
    }

    public void setMonth_id(int month_id) {
        this.month_id = month_id;
    }

    public int getYear_id() {
        return year_id;
    }

    public void setYear_id(int year_id) {
        this.year_id = year_id;
    }

    public String getProduct_line() {
        return product_line;
    }

    public void setProduct_line(String product_line) {
        this.product_line = product_line;
    }

    public int getMsrp() {
        return msrp;
    }

    public void setMsrp(int msrp) {
        this.msrp = msrp;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getContact_last_name() {
        return contact_last_name;
    }

    public void setContact_last_name(String contact_last_name) {
        this.contact_last_name = contact_last_name;
    }

    public String getContact_first_name() {
        return contact_first_name;
    }

    public void setContact_first_name(String contact_first_name) {
        this.contact_first_name = contact_first_name;
    }

    public String getDeal_size() {
        return deal_size;
    }

    public void setDeal_size(String deal_size) {
        this.deal_size = deal_size;
    }

    @Override
    public String toString() {
        return "Data -> " +
                "|Order number: " + order_number + "| " +
                "|Quantity: " + quantity + "| " +
                "|Price: " + price + "| " +
                "|Order lines: " + order_lines + "| " +
                "|Sales: " + sales + "| " +
                "|Date: " + date + "| " +
                "|Status: " + status + "| " +
                "|qtr id: " + qtr_id + "| " +
                "|Month id: " + month_id + "| " +
                "|Year id: " + year_id + "| " +
                "|Product line: " + product_line + "| " +
                "|msrp: " + msrp + "| " +
                "|Product code: " + product_code + "| " +
                "|Customer name: " + customer_name + "| " +
                "|Phone: " + phone + "| " +
                "|First address: " + address_1 + "| " +
                "|Second Address: " + address_2 + "| " +
                "|City: " + city + "| " +
                "|State: " + state + "| " +
                "|Postal code: " + postal_code + "| " +
                "|Country: " + country + "| " +
                "|Territory: " + territory + "| " +
                "|Contact last name: " + contact_last_name + "| " +
                "|Contact first name: " + contact_first_name + "| " +
                "|Deal: " + deal_size + "| \n";
    }
}