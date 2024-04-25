public class OOSE {
    public static void main(String[] args) {
        public class Administrator {
            private String username;
            private String password;
            private boolean isLoggedIn;

            public Administrator(String username, String password) {
                this.username = username;
                this.password = password;
                this.isLoggedIn = false; // Initially not logged in
            }
            public boolean login(String enteredUsername, String enteredPassword) {
                if (this.username.equals(enteredUsername) && this.password.equals(enteredPassword)) {
                    this.isLoggedIn = true;
                    return true;
                } else {
                    return false;
                }
            }
            public void logout() {
                this.isLoggedIn = false;
            }
            public void updateInventory(Book book, int newStockLevel) {
                if (!isLoggedIn) {
                    System.out.println("Error: Administrator must be logged in.");
                    return;
                }
                if (newStockLevel >= 0) {
                    book.setStockLevel(newStockLevel);
                    System.out.println("Stock updated!");
                } else {
                    System.out.println("Error: Stock level cannot be negative.");
                }
            }
            public class Book {
                private int bookID;
                private String title;
                private String author;
                private double price;
                private int stockLevel;
                // Constructor
                public Book(int bookID, String title, String author, double price, int stockLevel) {
                    this.bookID = bookID;
                    this.title = title;
                    this.author = author;
                    this.price = price;
                    this.stockLevel = stockLevel;
                }
                public int getStockLevel() {
                    return stockLevel;
                }
                public void setStockLevel(int newStockLevel) {
                    this.stockLevel = newStockLevel;
                }
            }
        }
    }
}