use order_management_system; 
INSERT INTO user (id, username, password, role)
VALUES 
    (1, 'RahulGupta', 'password123', 'User'),
    (2, 'PriyaSharma', 'secret456', 'User'),
    (3, 'Harinee', 'adminpass', 'Admin'),
    (4, 'VijayKumar', 'vijay@345', 'User'),
    (5, 'NehaSingh', 'adminpass', 'Admin');

INSERT INTO product (id, product_name, description, price, quantity_in_stock, type) VALUES
(1, 'Laptop', 'High-performance laptop', 1200.00, 10, 'Electronic'),
(2, 'T-shirt', 'Cotton T-shirt', 20.00, 50, 'Clothing'),
(3, 'Smartphone', 'Latest smartphone model', 800.00, 20, 'Electronic'),
(4, 'Jeans', 'Blue denim jeans', 40.00, 30, 'Clothing'),
(5, 'Tablet', 'Portable tablet device', 300.00, 15, 'Electronic');

INSERT INTO electronics (brand, warranty_period, product_id) VALUES
('Samsung', '1', 1),
('Apple', '2 ', 3),
('Sony', '1', 5);

INSERT INTO clothing (size, color, product_id) VALUES
('M', 'Black', 2),
('L', 'Blue', 4);

INSERT INTO orders (product_id, user_id, product_name, user_name) VALUES
(1, 1, 'Laptop', 'RahulGupta'), 
(2, 2, 'T-shirt', 'PriyaSharma'),
(3, 3, 'Smartphone', 'Harinee'),
(4, 2, 'Jeans', 'PriyaSharma'),
(5, 4, 'Tablet', 'VijayKumar');
